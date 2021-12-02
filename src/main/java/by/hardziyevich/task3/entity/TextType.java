package by.hardziyevich.task3.entity;

public enum TextType {
    PARAGRAPH("\n\t"),
    SENTENCE(""),
    LEXEME(" "),
    WORD(""),
    EXPRESSION(""),
    LETTER(""),
    PUNCTUATION(""),
    SYMBOL("");

    private final String delimiter;

    TextType(String delimiter) {
        this.delimiter = delimiter;
    }

    public String getDelimiter() {
        return delimiter;
    }
}
