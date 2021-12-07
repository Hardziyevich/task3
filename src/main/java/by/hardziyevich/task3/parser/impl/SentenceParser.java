package by.hardziyevich.task3.parser.impl;

import by.hardziyevich.task3.entity.Symbol;
import by.hardziyevich.task3.entity.TextComponent;
import by.hardziyevich.task3.entity.TextComposite;
import by.hardziyevich.task3.parser.IParser;

import static by.hardziyevich.task3.entity.TextType.PUNCTUATION;
import static by.hardziyevich.task3.entity.TextType.SENTENCE;

public class SentenceParser implements IParser {

    private static final SentenceParser instance = new SentenceParser();

    private SentenceParser() {
    }

    public static SentenceParser getInstance() {
        return instance;
    }

    @Override
    public TextComponent parse(String text) {
        TextComponent sentence = new TextComposite(SENTENCE);
        IParser sentenceIParser;
        for (String word : text.split(SENTENCE_DELIMITER_REG)) {
            if (word.matches(LETTER_REG)) {
                sentenceIParser = LetterParser.getInstance();
                sentence.addText(sentenceIParser.parse(word));
            } else if (word.matches(WORD_REG)) {
                sentenceIParser = WordParser.getInstance();
                sentence.addText(sentenceIParser.parse(word));
            } else if (word.matches(PUNCTUATION_REG)) {
                sentence.addText(new Symbol(PUNCTUATION, word.charAt(0)));
            } else if (word.matches(EXPRESSION_REG)) {
                sentenceIParser = ExpressionParser.getInstance();
                sentence.addText(sentenceIParser.parse(word));
            } else {
                sentenceIParser = LexemeParser.getInstance();
                sentence.addText(sentenceIParser.parse(word));
            }
        }
        return sentence;
    }
}
