package by.hardziyevich.task3.parser.impl;

import by.hardziyevich.task3.entity.TextComponent;
import by.hardziyevich.task3.entity.TextComposite;
import by.hardziyevich.task3.entity.Symbol;
import by.hardziyevich.task3.parser.IParser;

import static by.hardziyevich.task3.entity.TextType.LEXEME;
import static by.hardziyevich.task3.entity.TextType.PUNCTUATION;


public class LexemeParser implements IParser {
    private static final LexemeParser instance = new LexemeParser();
    private final IParser iParser = LetterParser.getInstance();

    private LexemeParser() {
    }

    public static LexemeParser getInstance() {
        return instance;
    }

    @Override
    public TextComponent parse(String text) {
        TextComponent textComponent = new TextComposite(LEXEME);
        for (String lexeme : text.split(WORD_DELIMITER_REG)) {
            if (lexeme.matches(LETTER_REG)) {
                textComponent.addText(iParser.parse(lexeme));
            } else {
                textComponent.addText(new Symbol(PUNCTUATION, lexeme.charAt(0)));
            }
        }
        return textComponent;
    }
}
