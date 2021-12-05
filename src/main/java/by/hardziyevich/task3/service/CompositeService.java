package by.hardziyevich.task3.service;

import by.hardziyevich.task3.entity.TextComponent;
import by.hardziyevich.task3.entity.TextComposite;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CompositeService {

    public List<TextComponent> sortBySentence(TextComponent component){
        return component.allComponent()
                .stream()
                .sorted(Comparator.comparing(x -> x.allComponent().stream().count()))
                .collect(Collectors.toList());
    }

    public List<TextComponent> findMaxWord(TextComponent component){
        return null;
    }
}
