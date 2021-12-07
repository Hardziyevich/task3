package parser;

import by.hardziyevich.task3.entity.TextComponent;
import by.hardziyevich.task3.parser.IParser;
import by.hardziyevich.task3.parser.impl.WordParser;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordIParserTest {

    @Test
    void testWordParser(){
        String word = "Pasha";
        IParser wordIParser = WordParser.getInstance();
        TextComponent wordComponent = wordIParser.parse(word);
        assertEquals(word,wordComponent.toString());
    }
}
