package by.hardziyevich.task3.parser.impl;

import by.hardziyevich.task3.entity.TextComponent;
import by.hardziyevich.task3.entity.TextLeaf;
import by.hardziyevich.task3.entity.TextType;
import by.hardziyevich.task3.parser.Parser;

import static by.hardziyevich.task3.entity.TextType.VOWEL;
import static by.hardziyevich.task3.entity.TextType.CONSONANT;

public class LetterParser implements Parser {

    @Override
    public TextComponent parse(String text) {
        TextType letterType = text.matches(VOWEL_REG) ? VOWEL : CONSONANT;
        return new TextLeaf(letterType, text.charAt(0));
    }
}
