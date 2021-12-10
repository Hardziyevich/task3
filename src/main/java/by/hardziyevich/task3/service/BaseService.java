package by.hardziyevich.task3.service;

import by.hardziyevich.task3.entity.TextComponent;
import by.hardziyevich.task3.entity.TextType;

import java.util.List;
import java.util.Map;

public interface BaseService {
    List<TextComponent> sortBySentence(TextComponent component);

    List<TextComponent> findSentencesWithLongerWord(TextComponent component);

    List<TextComponent> removeSentenceWithWordLess(int n, TextComponent component);

    Map<String, Long> findAllSameWord(TextComponent component);

    Map<TextType, Long> findConsonantAndVowel(TextComponent component);
}
