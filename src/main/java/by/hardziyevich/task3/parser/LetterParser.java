package by.hardziyevich.task3.parser;

import by.hardziyevich.task3.entity.TextComponent;
import by.hardziyevich.task3.entity.TextComposite;
import by.hardziyevich.task3.entity.TextLeaf;
import by.hardziyevich.task3.entity.TextType;

import static by.hardziyevich.task3.entity.TextType.*;
import static by.hardziyevich.task3.parser.TypeRegex.VOWEL_REG;

public class LetterParser implements TextParser{

    @Override
    public TextComponent parse(String text) {
        TextComponent letterComponent = null;
        if(text.length() == 1) {
            TextType letterType = text.matches(VOWEL_REG) ? VOWEL : CONSONANT;
            letterComponent = new TextLeaf(letterType, text.charAt(0));
        }
        return letterComponent;
    }
}
