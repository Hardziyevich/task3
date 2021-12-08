package interpret;

import by.hardziyevich.task3.interpreter.Interpret;
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
        findIndexString1(s).forEach(System.out::println);

    }


    List<String> findIndexString(String s) {
        List<String> list = new ArrayList<>();
        List<Integer> open = new ArrayList<>();
        List<Integer> close = new ArrayList<>();
        Pattern pattern = Pattern.compile("([(])|([)])");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            if (matcher.start(1) != -1) {
                open.add(matcher.start());
            } else if (matcher.start(2) != -1) {
                close.add(matcher.start());
            }
        }
        return list;
    }

    List<String> findIndexString1(String s) {
        List<String> list = new ArrayList<>();
        int openIndex = 0;
        int closeIndex = 0;
        int close = 0;
        int open = 0;
        Pattern pattern = Pattern.compile("([(])|([)])");
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            if (matcher.start(1) != -1) {
                openIndex = matcher.start();
                open++;
            } else if (matcher.start(2) != -1) {
                closeIndex = matcher.start();
                close++;
            }
            if(open != 0 && close != 0){
                if(open == close){
                    list.add(s.substring(openIndex,closeIndex + 1));
                }
            }
        }
        return list;
    }

//    List<String> recursion(String inputstring){
//        List<String> list = new ArrayList<>();
//        List<Integer> open = new ArrayList<>();
//        List<Integer> close = new ArrayList<>();
//        int openCount = 0;
//        int closeCount = 0;
//        int counter = 0;
//        for (String strings : inputstring.split("")) {
//            if(strings.matches("[(]")){
//                open.add(openCount,counter);
//                openCount++;
//            } else if(strings.matches("[)]")){
//                close.add(closeCount,counter);
//                closeCount++;
//            }
//            counter++;
//        }
//        for (int i = 0; i < open.size(); i++) {
//            list.add(inputstring.substring(open.get(i),close.get(open.size() - 1 - i) + 1));
//        }
//        return list;
//    }
}
