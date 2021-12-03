package by.hardziyevich.task3.parser;

import by.hardziyevich.task3.entity.TextComponent;
import by.hardziyevich.task3.entity.TextComposite;
import by.hardziyevich.task3.entity.TextLeaf;
import by.hardziyevich.task3.entity.TextType;

import static by.hardziyevich.task3.entity.TextType.*;
import static by.hardziyevich.task3.parser.TypeRegex.*;

public class ExpressionParser implements TextParser{
    private TextComponent expression = new TextComposite(EXPRESSION);
    private TextParser sentenceParser;

    @Override
    public TextComponent parse(String text) {
        TextComponent parse = null;
        if(text.matches(LETTER_REG)){
            sentenceParser = new LetterParser();
            parse = sentenceParser.parse(text);
        } else if(text.matches(DIGIT_REG)){
            parse = new TextLeaf(DIGIT,text.charAt(0));
        } else if(text.matches(PUNCTUATION_REG)){
            parse = new TextLeaf(PUNCTUATION,text.charAt(0));
        }
        expression.addText(parse);
        return expression;
    }
}
