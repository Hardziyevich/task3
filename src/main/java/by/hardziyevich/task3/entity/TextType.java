package by.hardziyevich.task3.entity;

public enum TextType {
    TEXT("\r\n"),
    PARAGRAPH(""),
    SENTENCE(" "),
    LEXEME(""),
    WORD(""),
    EXPRESSION(""),
    LETTER(""),
    PUNCTUATION(""),
    DIGIT(""),
    CONSONANT(""),
    VOWEL("");

    private final String postfix;

    TextType(String postfix) {
        this.postfix = postfix;
    }

    public String getPostfix() {
        return postfix;
    }

}
