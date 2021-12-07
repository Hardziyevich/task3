package parser;

import by.hardziyevich.task3.entity.TextComponent;
import by.hardziyevich.task3.parser.IParser;
import by.hardziyevich.task3.parser.impl.SentenceParser;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SentenceIParserTest {

    @Test
    void testParse() {
        String test = "It has survived - not only (five) centuries, but also the leap into 13<<2 electronic typesetting, ";
        IParser iParser = SentenceParser.getInstance();
        TextComponent parse = iParser.parse(test);
        assertEquals(test,parse.toString());
    }
}
