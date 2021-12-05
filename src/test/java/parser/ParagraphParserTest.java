package parser;

import by.hardziyevich.task3.entity.TextComponent;
import by.hardziyevich.task3.parser.Parser;
import by.hardziyevich.task3.parser.impl.ParagraphParser;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ParagraphParserTest {

    @Test
    void testParse() {
        String test = "It has survived - not only (five) centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the “Динамо” (Рига) with the release of Letraset sheets.toString() containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker Faclon9 including versions of Lorem Ipsum!";
        Parser paragraphParser = new ParagraphParser();
        TextComponent parse = paragraphParser.parse(test);
        parse.allComponent().forEach(x -> System.out.println(x.getType()));
        assertEquals(test,parse.toString());
    }
}
