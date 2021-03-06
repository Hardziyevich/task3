package by.hardziyevich.task3.parser.impl;

import by.hardziyevich.task3.entity.TextComponent;
import by.hardziyevich.task3.entity.TextComposite;
import by.hardziyevich.task3.parser.BaseParser;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static by.hardziyevich.task3.entity.TextType.PARAGRAPH;

public class ParagraphParser implements BaseParser {

    private static final ParagraphParser paragraphParser = new ParagraphParser();
    private final BaseParser paragraphBaseParser = SentenceParser.getInstance();

    private ParagraphParser() {
    }

    public static ParagraphParser getInstance() {
        return paragraphParser;
    }

    @Override
    public TextComponent parse(String text) {
        TextComponent paragraphComponent = new TextComposite(PARAGRAPH);
        Pattern paragraphPattern = Pattern.compile(PARAGRAPH_DELIMITER_REG);
        Matcher paragraphMatcher = paragraphPattern.matcher(text);
        while (paragraphMatcher.find()) {
            paragraphComponent.addText(paragraphBaseParser.parse(paragraphMatcher.group().trim()));
        }
        return paragraphComponent;
    }
}
