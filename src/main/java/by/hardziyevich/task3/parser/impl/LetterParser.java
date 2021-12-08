package by.hardziyevich.task3.parser.impl;

import by.hardziyevich.task3.entity.TextComponent;
import by.hardziyevich.task3.entity.Symbol;
import by.hardziyevich.task3.entity.TextComposite;
import by.hardziyevich.task3.entity.TextType;
import by.hardziyevich.task3.parser.BaseParser;

import static by.hardziyevich.task3.entity.TextType.*;

public class LetterParser implements BaseParser {

    private static final LetterParser instance = new LetterParser();

    private LetterParser() {
    }

    public static LetterParser getInstance() {
        return instance;
    }

    @Override
    public TextComponent parse(String text) {
        TextComponent textComponent = new TextComposite(LETTER);
        TextType letterType = text.matches(VOWEL_REG) ? VOWEL : CONSONANT;
        textComponent.addText(new Symbol(letterType, text.charAt(0)));
        return textComponent;
    }
}
