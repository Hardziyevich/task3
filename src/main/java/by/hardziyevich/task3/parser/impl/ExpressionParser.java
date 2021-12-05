package by.hardziyevich.task3.parser.impl;

import by.hardziyevich.task3.entity.TextComponent;
import by.hardziyevich.task3.entity.TextComposite;
import by.hardziyevich.task3.entity.TextLeaf;
import by.hardziyevich.task3.parser.Parser;

import static by.hardziyevich.task3.entity.TextType.EXPRESSION;
import static by.hardziyevich.task3.entity.TextType.DIGIT;
import static by.hardziyevich.task3.entity.TextType.PUNCTUATION;


public class ExpressionParser implements Parser {

    @Override
    public TextComponent parse(String text) {
        TextComponent expressionComponent = new TextComposite(EXPRESSION);
        TextComponent parse = null;
        for (String expression : text.split(WORD_DELIMITER_REG)) {
            if (expression.matches(DIGIT_REG)) {
                parse = new TextLeaf(DIGIT, expression.charAt(0));
            } else if (expression.matches(PUNCTUATION_REG)) {
                parse = new TextLeaf(PUNCTUATION, expression.charAt(0));
            }
            expressionComponent.addText(parse);
        }
        return expressionComponent;
    }
}
