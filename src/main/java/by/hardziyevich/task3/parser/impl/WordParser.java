package by.hardziyevich.task3.parser.impl;

import by.hardziyevich.task3.entity.TextComponent;
import by.hardziyevich.task3.entity.TextComposite;
import by.hardziyevich.task3.parser.Parser;

import static by.hardziyevich.task3.entity.TextType.WORD;

public class WordParser implements Parser {
    private Parser letterParser;

    @Override
    public TextComponent parse(String text) {
        TextComponent word = new TextComposite(WORD);
        letterParser = new LetterParser();
        for (String letter : text.split(WORD_DELIMITER_REG)) {
            word.addText(letterParser.parse(letter));
        }
        return word;
    }
}
