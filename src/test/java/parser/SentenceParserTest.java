package parser;

import by.hardziyevich.task3.entity.TextComponent;
import by.hardziyevich.task3.parser.impl.SentenceParser;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SentenceParserTest {

    @Test
    void testParse() {
        String test = "It has survived - not only (five) centuries, but also the leap into 13<<2 electronic typesetting,";
        SentenceParser sentence = new SentenceParser();
        TextComponent parse = sentence.parse(test);
        assertEquals(test,parse.toString());
    }
}
