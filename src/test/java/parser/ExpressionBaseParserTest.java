package parser;

import by.hardziyevich.task3.entity.TextComponent;
import by.hardziyevich.task3.parser.BaseParser;
import by.hardziyevich.task3.parser.impl.ExpressionParser;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ExpressionBaseParserTest {

    @Test
    void testParser() {
        String test = "13<<1";
        BaseParser expressionBaseParser = ExpressionParser.getInstance();
        TextComponent expression = expressionBaseParser.parse(test);
        assertEquals("26", expression.toString());
    }
}
