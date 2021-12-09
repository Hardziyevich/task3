package interpret;

import by.hardziyevich.task3.interpreter.InterpreterExpression;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class InterpretTest {

    @Test
    void test() {
        String s = "(7^5|~1&2<<(2|5>>2&71))|1200";
        String test2 = "5|(1&2&(3|(4&(1^5|6&47)|3)|(~89&4|(42&7)))|1)";
        String test3 = "4&(1^5|6&47)|3|(~89&4|42&7)";
        InterpreterExpression expression = new InterpreterExpression();
        assertEquals(1200,expression.interpret(s));
        assertEquals(5,expression.interpret(test2));
        assertEquals(7,expression.interpret(test3));
    }
}
