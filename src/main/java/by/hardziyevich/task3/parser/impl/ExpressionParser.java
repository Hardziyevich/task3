package by.hardziyevich.task3.parser.impl;

import by.hardziyevich.task3.entity.TextComponent;
import by.hardziyevich.task3.entity.TextComposite;
import by.hardziyevich.task3.entity.Symbol;
import by.hardziyevich.task3.interpreter.Interpret;
import by.hardziyevich.task3.interpreter.InterpreterExpression;
import by.hardziyevich.task3.parser.BaseParser;

import static by.hardziyevich.task3.entity.TextType.EXPRESSION;
import static by.hardziyevich.task3.entity.TextType.DIGIT;
import static by.hardziyevich.task3.entity.TextType.PUNCTUATION;


public class ExpressionParser implements BaseParser {

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
        int digit = new InterpreterExpression().interpret(text);
        for (String expression : Integer.toString(digit).split(WORD_DELIMITER_REG)) {
            parse = new Symbol(DIGIT, expression.charAt(0));
            expressionComponent.addText(parse);
        }

        return expressionComponent;
    }
}
