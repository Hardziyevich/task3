package by.hardziyevich.task3.entity;

public enum TextType {
    TEXT("","\r\n"),
    PARAGRAPH("",""),
    SENTENCE(""," "),
    LEXEME("",""),
    WORD("",""),
    EXPRESSION("",""),
    LETTER("",""),
    PUNCTUATION("",""),
    DIGIT("",""),
    CONSONANT("",""),
    VOWEL("","");

    private final String prefix;
    private final String postfix;

    TextType(String prefix, String postfix) {
        this.postfix = postfix;
        this.prefix = prefix;
    }

    public String getPostfix() {
        return postfix;
    }

    public String getPrefix() {
        return prefix;
    }
}
