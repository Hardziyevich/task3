package service;

import by.hardziyevich.task3.entity.TextComponent;
import by.hardziyevich.task3.parser.Parser;
import by.hardziyevich.task3.parser.impl.TextParser;
import by.hardziyevich.task3.service.CompositeService;
import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.stream.Collectors;

public class ServiceTest {

    @Test
    void test(){
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
        Parser sentence = new TextParser();
        TextComponent parse = sentence.parse(test);
        parse.allComponent().forEach(x -> {
            System.out.println(x.getType());
            long count = x.allComponent().stream().count();
            System.out.println(count);
        });

        CompositeService testService = new CompositeService();
        System.out.println("_____________");
        testService.sortBySentence(parse).forEach(x -> {
            System.out.println(x.getType());
            long count = x.allComponent().stream().count();
            System.out.println(count);
        });
    }
}
