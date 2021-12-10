package parser;

import by.hardziyevich.task3.entity.TextComponent;
import by.hardziyevich.task3.parser.BaseParser;
import by.hardziyevich.task3.parser.impl.LexemeParser;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LexemeBaseParserTest {

    @Test
    void testParser() {
        String lexemeTest = "Pasha,";
        BaseParser lexemeBaseParser = LexemeParser.getInstance();
        TextComponent lexeme = lexemeBaseParser.parse(lexemeTest);
        assertEquals(lexemeTest, lexeme.toString());
    }
}
