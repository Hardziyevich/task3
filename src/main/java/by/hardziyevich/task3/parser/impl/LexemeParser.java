package by.hardziyevich.task3.parser.impl;

import by.hardziyevich.task3.entity.TextComponent;
import by.hardziyevich.task3.entity.TextComposite;
import by.hardziyevich.task3.entity.TextLeaf;
import by.hardziyevich.task3.parser.Parser;

import static by.hardziyevich.task3.entity.TextType.LEXEME;
import static by.hardziyevich.task3.entity.TextType.PUNCTUATION;


public class LexemeParser implements Parser {
    private Parser parser;

    @Override
    public TextComponent parse(String text) {
        TextComponent textComponent = new TextComposite(LEXEME);
        for (String lexeme : text.split(WORD_DELIMITER_REG)) {
            if (lexeme.matches(LETTER_REG)) {
                parser = new LetterParser();
                textComponent.addText(parser.parse(lexeme));
            } else {
                textComponent.addText(new TextLeaf(PUNCTUATION, lexeme.charAt(0)));
            }
        }
        return textComponent;
    }
}
