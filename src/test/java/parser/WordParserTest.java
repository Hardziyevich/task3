package parser;

import by.hardziyevich.task3.entity.TextComponent;
import by.hardziyevich.task3.parser.Parser;
import by.hardziyevich.task3.parser.impl.WordParser;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordParserTest {

    @Test
    void testWordParser(){
        String word = "Pasha";
        Parser wordParser = new WordParser();
        TextComponent wordComponent = wordParser.parse(word);
        assertEquals(word,wordComponent.toString());
    }
}
