package by.hardziyevich.task3.interpreter;

import java.util.LinkedList;

public class StackOpenBracket {

    private final LinkedList<Integer> stack;

    public StackOpenBracket() {
        stack = new LinkedList<>();
    }

    public void push(final Integer digit) {
        stack.push(digit);
    }

    public Integer pop() {
        return stack.pop();
    }

    public Integer peek() {
        return stack.peek();
    }

    boolean isEmpty() {
        return stack.isEmpty();
    }
}
