package by.hardziyevich.task3.service.impl;

import by.hardziyevich.task3.entity.TextComponent;
import by.hardziyevich.task3.entity.TextType;
import by.hardziyevich.task3.service.BaseService;

import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

import static by.hardziyevich.task3.entity.TextType.*;

public class CompositeService implements BaseService {

    @Override
    public List<TextComponent> sortBySentence(TextComponent component) {
        return findAllType(PARAGRAPH, component)
                .stream()
                .sorted(Comparator.comparing(x -> x.allComponent().size()))
                .collect(Collectors.toList());
    }

    @Override
    public List<TextComponent> findSentencesWithLongerWord(TextComponent component) {
        TextComponent maxWord = findAllType(WORD, component)
                .stream()
                .max(Comparator.comparingInt(x -> x.allComponent().size())).get();
        List<TextComponent> result = findAllType(SENTENCE, component)
                .stream()
                .filter(t -> t
                        .allComponent()
                        .stream()
                        .filter(c -> c.getType() == WORD)
                        .anyMatch(c -> c.allComponent().size() == maxWord.allComponent().size())
                )
                .collect(Collectors.toList());
        return result;
    }

    @Override
    public List<TextComponent> removeSentenceWithWordLess(int n, TextComponent component) {
        List<TextComponent> allType = findAllType(SENTENCE, component);
        allType.removeIf(c -> findAllType(WORD, c).size() < n);
        return allType;
    }

    @Override
    public Map<String, Long> findAllSameWord(TextComponent component) {
        List<TextComponent> word = findAllType(WORD, component);
        Map<String, Long> collect = word.stream().collect(Collectors.groupingBy(w -> w.toString().toLowerCase(), Collectors.counting()));
        collect.entrySet().removeIf(c -> c.getValue() == 1);
        return collect;
    }

    @Override
    public Map<TextType, Long> findConsonantAndVowel(TextComponent component) {
        long consonant = findAllType(CONSONANT, component).stream().map(TextComponent::allComponent).count();
        long vowel = findAllType(VOWEL, component).stream().map(TextComponent::allComponent).count();
        return Map.of(CONSONANT, consonant, VOWEL, vowel);
    }

    private List<TextComponent> findAllType(TextType type, TextComponent component) {
        List<TextComponent> buffer = new ArrayList<>();
        //Base case
        if (component.getType() == type) {
            buffer.add(component);
            return buffer;
        }
        //Recursion case
        //Sequence all leaf which don`t call addAll method.
        if (component.getType() != PUNCTUATION
                && component.getType() != DIGIT
                && component.getType() != VOWEL
                && component.getType() != CONSONANT) {
            for (TextComponent textComponent : component.allComponent()) {
                buffer.addAll(findAllType(type, textComponent));
            }
        }
        return buffer;
    }
}
