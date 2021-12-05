package by.hardziyevich.task3.parser.impl;

import by.hardziyevich.task3.entity.TextComponent;
import by.hardziyevich.task3.entity.TextComposite;
import by.hardziyevich.task3.parser.Parser;

import static by.hardziyevich.task3.entity.TextType.SENTENCE;

public class SentenceParser implements Parser {
    private Parser sentenceParser;

    @Override
    public TextComponent parse(String text) {
        TextComponent sentence = new TextComposite(SENTENCE);
        for (String word : text.split(SENTENCE_DELIMITER_REG)) {
            if(word.matches(WORD_REG)){
                sentenceParser = new WordParser();
            }else if(word.matches(EXPRESSION_REG)){
                sentenceParser = new ExpressionParser();
            } else {
                sentenceParser = new LexemeParser();
            }
            sentence.addText(sentenceParser.parse(word));
        }
        return sentence;
    }
}
