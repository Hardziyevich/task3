package parser;

import by.hardziyevich.task3.entity.TextComponent;
import by.hardziyevich.task3.parser.Parser;
import by.hardziyevich.task3.parser.impl.LexemeParser;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LexemeParserTest {

    @Test
    void testParser(){
        String lexemeTest = "Pasha,";
        Parser lexemeParser = new LexemeParser();
        TextComponent lexeme = lexemeParser.parse(lexemeTest);
        assertEquals(lexemeTest,lexeme.toString());
    }
}
