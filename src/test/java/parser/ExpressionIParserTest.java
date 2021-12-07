package parser;

import by.hardziyevich.task3.entity.TextComponent;
import by.hardziyevich.task3.parser.IParser;
import by.hardziyevich.task3.parser.impl.ExpressionParser;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ExpressionIParserTest {

    @Test
    void testParser(){
        String test = "13<<1";
        IParser expressionIParser = ExpressionParser.getInstance();
        TextComponent expression = expressionIParser.parse(test);
        assertEquals(test,expression.toString());
    }
}
