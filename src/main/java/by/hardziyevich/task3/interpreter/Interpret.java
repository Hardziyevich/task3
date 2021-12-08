package by.hardziyevich.task3.interpreter;

@FunctionalInterface
public interface Interpret {
    int interpret(String text);

    static Interpret number(String text) {
        return context -> Integer.parseInt(text);
    }

    static Interpret sum(Interpret left, Interpret right){
        return context -> left.interpret(context) + right.interpret(context);
    }
}
