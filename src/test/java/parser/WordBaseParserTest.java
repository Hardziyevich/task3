package parser;

import by.hardziyevich.task3.entity.TextComponent;
import by.hardziyevich.task3.parser.BaseParser;
import by.hardziyevich.task3.parser.impl.WordParser;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordBaseParserTest {

    @Test
    void testWordParser(){
        String word = "Pasha";
        BaseParser wordBaseParser = WordParser.getInstance();
        TextComponent wordComponent = wordBaseParser.parse(word);
        assertEquals(word,wordComponent.toString());
    }
}
