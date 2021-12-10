package service;

import by.hardziyevich.task3.entity.TextComponent;
import by.hardziyevich.task3.entity.TextType;
import by.hardziyevich.task3.parser.BaseParser;
import by.hardziyevich.task3.parser.impl.TextParser;
import by.hardziyevich.task3.service.impl.CompositeService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class ServiceTest {

    private final String test = "It has survived - not only (five) centuries, but also the leap into electronic " +
            "typesetting, remaining essentially unchanged. It was popularised in the asdasd (asds) " +
            "with the release of Letraset sheets.toString() containing Lorem Ipsum passages, and " +
            "more recently with desktop publishing software like Aldus PageMaker Faclon9 including " +
            "versions of Lorem Ipsum!\r\n" +
            "It is a long a!=b established fact that a reader will be distracted by the readable " +
            "content of a page when looking at its layout. The point of using Ipsum is that it has a " +
            "more-or-less normal distribution ob.toString(a?b:c), as opposed to using (Content here), " +
            "content here's, making it look like readable English?\r\n" +
            "It is a established fact that a reader will be of a page when looking at its layout...\r\n" +
            "Bye asdsd.";

    @Test
    void test() {
        BaseParser sentence = TextParser.getInstance();
        TextComponent parse = sentence.parse(test);
        parse.allComponent().forEach(x -> {
            System.out.println(x.getType());
            long count = x.allComponent().size();
            System.out.println(count);
        });

        CompositeService testService = new CompositeService();
        System.out.println("_____________");
        testService.sortBySentence(parse).forEach(x -> {
            System.out.println(x.getType());
            long count = x.allComponent().size();
            System.out.println(count);
        });
        testService.sortBySentence(parse).forEach(System.out::println);
    }


    @Test
    void testFindSentencesWithLongerWord() {
        BaseParser sentence = TextParser.getInstance();
        TextComponent parse = sentence.parse(test);
        CompositeService testService = new CompositeService();
        List<TextComponent> sentencesWithLongerWord = testService.findSentencesWithLongerWord(parse);
        assertEquals("The point of using Ipsum is that it has a more-or-less " +
                "normal distribution ob.toString(a?b:c), as opposed to using (Content here), content here's, " +
                "making it look like readable English? ", sentencesWithLongerWord.get(0).toString());
    }

    @Test
    void testRemoveSentenceWithWordLess() {
        BaseParser sentence = TextParser.getInstance();
        TextComponent parse = sentence.parse(test);
        CompositeService testService = new CompositeService();
        assertList(testService.removeSentenceWithWordLess(23, parse));
    }

    @Test
    void testSameWord() {
        BaseParser sentence = TextParser.getInstance();
        TextComponent parse = sentence.parse(test);
        CompositeService testService = new CompositeService();
        assertEquals(23, testService.findAllSameWord(parse).entrySet().size());
    }

    @Test
    void testConsonantAndVowel() {
        BaseParser sentence = TextParser.getInstance();
        TextComponent parse = sentence.parse(test);
        CompositeService testService = new CompositeService();
        assertAll(() -> {
            assertEquals(377, testService.findConsonantAndVowel(parse).get(TextType.CONSONANT));
            assertEquals(237, testService.findConsonantAndVowel(parse).get(TextType.VOWEL));
        });
    }

    private void assertList(List<TextComponent> textComponents) {
        assertEquals("It was popularised in the asdasd (asds) with the release of Letraset sheets.toString() containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker Faclon9 including versions of Lorem Ipsum! ",
                textComponents.get(0).toString());
    }
}
