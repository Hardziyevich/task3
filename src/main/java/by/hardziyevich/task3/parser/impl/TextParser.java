package by.hardziyevich.task3.parser.impl;

import by.hardziyevich.task3.entity.TextComponent;
import by.hardziyevich.task3.entity.TextComposite;
import by.hardziyevich.task3.parser.Parser;

import static by.hardziyevich.task3.entity.TextType.TEXT;

public class TextParser implements Parser {
    private Parser textParser;

    @Override
    public TextComponent parse(String text) {
        TextComponent textComponent = new TextComposite(TEXT);
        for (String paragraph : text.split(TEXT_DELIMITER_REG)) {
            textParser = new ParagraphParser();
            textComponent.addText(textParser.parse(paragraph));
        }
        return textComponent;
    }
}
