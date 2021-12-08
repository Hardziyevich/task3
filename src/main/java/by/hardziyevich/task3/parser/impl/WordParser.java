package by.hardziyevich.task3.parser.impl;

import by.hardziyevich.task3.entity.TextComponent;
import by.hardziyevich.task3.entity.TextComposite;
import by.hardziyevich.task3.parser.BaseParser;

import static by.hardziyevich.task3.entity.TextType.WORD;

public class WordParser implements BaseParser {

    private static final WordParser instance = new WordParser();
    private final BaseParser letterBaseParser = LetterParser.getInstance();

    private WordParser() {
    }

    public static WordParser getInstance() {
        return instance;
    }

    @Override
    public TextComponent parse(String text) {
        TextComponent word = new TextComposite(WORD);
        for (String letter : text.split(WORD_DELIMITER_REG)) {
            word.addText(letterBaseParser.parse(letter));
        }
        return word;
    }
}
