package by.hardziyevich.task3.parser;

import by.hardziyevich.task3.entity.TextComponent;
import by.hardziyevich.task3.entity.TextComposite;
import by.hardziyevich.task3.entity.TextType;

import static by.hardziyevich.task3.parser.TypeRegex.WORD_DELIMITER;

public class WordParser implements TextParser {
    TextParser letterParser = new LetterParser();

    @Override
    public TextComponent parse(String text) {
        TextComponent word = new TextComposite(TextType.WORD);
        for (String letter : text.split(WORD_DELIMITER)) {
            TextComponent letterType = letterParser.parse(letter);
            word.addText(letterType);
        }
        return word;
    }
}
