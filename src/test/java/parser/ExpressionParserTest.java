package parser;

import by.hardziyevich.task3.entity.TextComponent;
import by.hardziyevich.task3.parser.Parser;
import by.hardziyevich.task3.parser.impl.ExpressionParser;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ExpressionParserTest {

    @Test
    void testParser(){
        String test = "13<<1";
        Parser expressionParser = new ExpressionParser();
        TextComponent expression = expressionParser.parse(test);
        assertEquals(test,expression.toString());
    }
}
