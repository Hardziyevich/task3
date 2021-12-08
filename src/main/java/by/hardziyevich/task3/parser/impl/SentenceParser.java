package by.hardziyevich.task3.parser.impl;

import by.hardziyevich.task3.entity.Symbol;
import by.hardziyevich.task3.entity.TextComponent;
import by.hardziyevich.task3.entity.TextComposite;
import by.hardziyevich.task3.parser.BaseParser;

import static by.hardziyevich.task3.entity.TextType.PUNCTUATION;
import static by.hardziyevich.task3.entity.TextType.SENTENCE;

public class SentenceParser implements BaseParser {

    private static final SentenceParser instance = new SentenceParser();

    private SentenceParser() {
    }

    public static SentenceParser getInstance() {
        return instance;
    }

    @Override
    public TextComponent parse(String text) {
        TextComponent sentence = new TextComposite(SENTENCE);
        BaseParser sentenceBaseParser;
        for (String word : text.split(SENTENCE_DELIMITER_REG)) {
            if (word.matches(LETTER_REG)) {
                sentenceBaseParser = LetterParser.getInstance();
                sentence.addText(sentenceBaseParser.parse(word));
            } else if (word.matches(WORD_REG)) {
                sentenceBaseParser = WordParser.getInstance();
                sentence.addText(sentenceBaseParser.parse(word));
            } else if (word.matches(PUNCTUATION_REG)) {
                sentence.addText(new Symbol(PUNCTUATION, word.charAt(0)));
            } else if (word.matches(EXPRESSION_REG)) {
                sentenceBaseParser = ExpressionParser.getInstance();
                sentence.addText(sentenceBaseParser.parse(word));
            } else {
                sentenceBaseParser = LexemeParser.getInstance();
                sentence.addText(sentenceBaseParser.parse(word));
            }
        }
        return sentence;
    }
}
