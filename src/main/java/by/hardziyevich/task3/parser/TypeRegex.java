package by.hardziyevich.task3.parser;

public final class TypeRegex {
    public static final String WORD_DELIMITER = "";
    public static final String PARAGRAPH_DELIMITER_REG = "\r\n";
    public static final String SPLIT_REG = " ";
    public static final String WORD_REG = "[a-zA-Zа-яА-я]+";
    public static final String EXPRESSION_REG = "[^a-zA-Zа-яА-я]+";
    public static final String LETTER_REG = "[a-zA-Zа-яА-я]";
    public static final String DIGIT_REG = "\\d";
    public static final String PUNCTUATION_REG = "\\p{Punct}";
    public static final String VOWEL_REG = "[AEIOUaeiouАЕЁОУЫЭЮЯаиеёоуыэюя]";
}
