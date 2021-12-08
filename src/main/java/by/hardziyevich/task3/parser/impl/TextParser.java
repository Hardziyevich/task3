package by.hardziyevich.task3.parser.impl;

import by.hardziyevich.task3.entity.TextComponent;
import by.hardziyevich.task3.entity.TextComposite;
import by.hardziyevich.task3.parser.BaseParser;

import static by.hardziyevich.task3.entity.TextType.TEXT;

public class TextParser implements BaseParser {

    private static final TextParser instance = new TextParser();
    private final BaseParser textBaseParser = ParagraphParser.getInstance();

    private TextParser() {
    }

    public static TextParser getInstance() {
        return instance;
    }

    @Override
    public TextComponent parse(String text) {
        TextComponent textComponent = new TextComposite(TEXT);
        for (String paragraph : text.split(TEXT_DELIMITER_REG)) {
            textComponent.addText(textBaseParser.parse(paragraph));
        }
        return textComponent;
    }
}
