package by.hardziyevich.task3.interpreter;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParserBracket {

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
