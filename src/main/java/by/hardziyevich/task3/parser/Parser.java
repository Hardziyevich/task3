package by.hardziyevich.task3.parser;

import by.hardziyevich.task3.entity.TextComponent;

public interface Parser {
    String TEXT_DELIMITER_REG = "\r\n";
    String PARAGRAPH_DELIMITER_REG = ".+?[.?!…](?=\\s|$)";
    String SENTENCE_DELIMITER_REG = " ";
    String WORD_DELIMITER_REG = "";
    String WORD_REG = "\\p{L}+";
    String EXPRESSION_REG = "[^\\p{L}]+";
    String LETTER_REG = "\\p{L}";
    String DIGIT_REG = "\\d";
    String PUNCTUATION_REG = "\\p{Punct}";
    String VOWEL_REG = "[AEIOUaeiouАЕЁОУЫЭЮЯаиеёоуыэюя]";

    TextComponent parse(String text);
}
