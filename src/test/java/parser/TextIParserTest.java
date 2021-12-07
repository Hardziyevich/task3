package parser;

import by.hardziyevich.task3.entity.TextComponent;
import by.hardziyevich.task3.parser.IParser;
import by.hardziyevich.task3.parser.impl.TextParser;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TextIParserTest {

    @Test
    void testParser(){
        String test = "It has survived - not only (five) centuries, but also the leap into electronic" +
                "typesetting, remaining essentially unchanged. It was popularised in the “Динамо” (Рига)" +
                "with the release of Letraset sheets.toString() containing Lorem Ipsum passages, and" +
                "more recently with desktop publishing software like Aldus PageMaker Faclon9 including" +
                "versions of Lorem Ipsum!\r\n" +
                "It is a long a!=b established fact that a reader will be distracted by the readable" +
                "content of a page when looking at its layout. The point of using Ipsum is that it has a" +
                "more-or-less normal distribution ob.toString(a?b:c), as opposed to using (Content here)," +
                "content here's, making it look like readable English?\r\n" +
                "It is a established fact that a reader will be of a page when looking at its layout...\r\n" +
                "Bye бандерлоги.";
        IParser iParser = TextParser.getInstance();
        TextComponent parse = iParser.parse(test);
        assertEquals(test,parse.toString());
    }
}