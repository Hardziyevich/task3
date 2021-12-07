package by.hardziyevich.task3.parser.impl;

import by.hardziyevich.task3.entity.TextComponent;
import by.hardziyevich.task3.entity.TextComposite;
import by.hardziyevich.task3.entity.Symbol;
import by.hardziyevich.task3.parser.IParser;

import static by.hardziyevich.task3.entity.TextType.EXPRESSION;
import static by.hardziyevich.task3.entity.TextType.DIGIT;
import static by.hardziyevich.task3.entity.TextType.PUNCTUATION;


public class ExpressionParser implements IParser {

    private static final ExpressionParser instance = new ExpressionParser();

    private ExpressionParser() {
    }

    public static ExpressionParser getInstance() {
        return instance;
    }

    @Override
    public TextComponent parse(String text) {
        TextComponent expressionComponent = new TextComposite(EXPRESSION);
        TextComponent parse;
        for (String expression : text.split(WORD_DELIMITER_REG)) {
            if (expression.matches(DIGIT_REG)) {
                parse = new Symbol(DIGIT, expression.charAt(0));
            } else {
                parse = new Symbol(PUNCTUATION, expression.charAt(0));
            }
            expressionComponent.addText(parse);
        }
        return expressionComponent;
    }
}
