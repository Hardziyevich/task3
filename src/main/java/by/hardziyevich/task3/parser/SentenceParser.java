package by.hardziyevich.task3.parser;

import by.hardziyevich.task3.entity.TextComponent;
import by.hardziyevich.task3.entity.TextComposite;
import by.hardziyevich.task3.entity.TextType;

import static by.hardziyevich.task3.parser.TypeRegex.SPLIT_REG;
import static by.hardziyevich.task3.parser.TypeRegex.WORD_REG;

public class SentenceParser implements TextParser{
    private TextParser sentenceParser;

    @Override
    public TextComponent parse(String text) {
        TextComponent sentence = new TextComposite(TextType.SENTENCE);
        for (String s : text.split(SPLIT_REG)) {
            if(s.matches(WORD_REG)){
                sentenceParser = new WordParser();
                sentence.addText(sentenceParser.parse(s));
            }else if()
        }
        return sentence;
    }
}
