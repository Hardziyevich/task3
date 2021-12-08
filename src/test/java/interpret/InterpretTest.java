package interpret;

import by.hardziyevich.task3.interpreter.Interpret;
import by.hardziyevich.task3.interpreter.StackOpenBracket;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static by.hardziyevich.task3.interpreter.Interpret.*;

public class InterpretTest {

    @Test
    void test() {
        Interpret result = sum(number("3"), number("5"));
        String s = "(7^5|1&2<<(2|5>>2&71))|1200";
        String test2 = "5|(1&2&(3|(4&(1^5|6&47)|3)|(~89&4|(42&7)))|1)";
        String test3 = "4&(1^5|6&47)|3|(~89&4|42&7)";
        findAllSubString(test2).forEach(System.out::println);

    }


    List<String> findAllSubString(String s) {
        StackOpenBracket stackOpenBracket = new StackOpenBracket();
        List<String> list = new ArrayList<>();
        Pattern pattern = Pattern.compile("([(])|([)])");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            if (matcher.start(1) != -1) {
                stackOpenBracket.push(matcher.start());
            } else if (matcher.start(2) != -1) {
                list.add(s.substring(stackOpenBracket.pop(),matcher.start() + 1));
            }
        }
        return list;
    }
}
