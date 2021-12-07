package parser;

import by.hardziyevich.task3.entity.TextComponent;
import by.hardziyevich.task3.parser.IParser;
import by.hardziyevich.task3.parser.impl.LexemeParser;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LexemeIParserTest {

    @Test
    void testParser(){
        String lexemeTest = "Pasha,";
        IParser lexemeIParser = LexemeParser.getInstance();
        TextComponent lexeme = lexemeIParser.parse(lexemeTest);
        assertEquals(lexemeTest,lexeme.toString());
    }
}
