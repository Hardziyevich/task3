package parser;

import by.hardziyevich.task3.entity.TextComponent;
import by.hardziyevich.task3.parser.TextParser;
import by.hardziyevich.task3.parser.WordParser;
import org.junit.jupiter.api.Test;

public class WordParserTest {

    @Test
    void testWordParser(){
        String word = "Pasha";
        TextParser wordParser = new WordParser();
        TextComponent wordComponent = wordParser.parse(word);
        wordComponent.allComponent().forEach(x -> System.out.println(x.toString() + " type " + x.getType()));

    }
}
