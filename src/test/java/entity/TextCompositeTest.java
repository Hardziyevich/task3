package entity;

import by.hardziyevich.task3.entity.Symbol;
import by.hardziyevich.task3.entity.TextComposite;
import by.hardziyevich.task3.entity.TextType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TextCompositeTest {

    @Test
    void testToString(){
        TextComposite text = new TextComposite(TextType.TEXT);
        TextComposite paragraph1 = new TextComposite(TextType.PARAGRAPH);
        TextComposite paragraph2 = new TextComposite(TextType.PARAGRAPH);
        TextComposite sentence1 = new TextComposite(TextType.SENTENCE);
        TextComposite sentence2 = new TextComposite(TextType.SENTENCE);
        TextComposite word1 = new TextComposite(TextType.WORD);
        TextComposite word2 = new TextComposite(TextType.WORD);
        TextComposite word3 = new TextComposite(TextType.WORD);
        TextComposite word4 = new TextComposite(TextType.WORD);
        TextComposite lexeme1 = new TextComposite(TextType.LEXEME);
        TextComposite lexeme2 = new TextComposite(TextType.LEXEME);
        Symbol symbol1 = new Symbol(TextType.DIGIT,'I');
        Symbol symbol2 = new Symbol(TextType.DIGIT,'a');
        Symbol symbol3 = new Symbol(TextType.DIGIT,'m');
        Symbol symbol4 = new Symbol(TextType.DIGIT,'P');
        Symbol symbol5 = new Symbol(TextType.DIGIT,'a');
        Symbol symbol6 = new Symbol(TextType.DIGIT,'s');
        Symbol symbol7 = new Symbol(TextType.DIGIT,'h');
        Symbol symbol8 = new Symbol(TextType.DIGIT,'a');
        Symbol symbol9 = new Symbol(TextType.PUNCTUATION,'.');

        Symbol symbol10 = new Symbol(TextType.DIGIT,'I');
        Symbol symbol11 = new Symbol(TextType.DIGIT,'a');
        Symbol symbol12 = new Symbol(TextType.DIGIT,'m');
        Symbol symbol13 = new Symbol(TextType.DIGIT,'N');
        Symbol symbol14 = new Symbol(TextType.DIGIT,'a');
        Symbol symbol15 = new Symbol(TextType.DIGIT,'t');
        Symbol symbol16 = new Symbol(TextType.DIGIT,'a');
        Symbol symbol17 = new Symbol(TextType.DIGIT,'s');
        Symbol symbol18 = new Symbol(TextType.DIGIT,'h');
        Symbol symbol19 = new Symbol(TextType.DIGIT,'a');
        Symbol symbol20 = new Symbol(TextType.PUNCTUATION,'!');

        word1.addText(symbol2);
        word1.addText(symbol3);

        lexeme1.addText(symbol4);
        lexeme1.addText(symbol5);
        lexeme1.addText(symbol6);
        lexeme1.addText(symbol7);
        lexeme1.addText(symbol8);
        lexeme1.addText(symbol9);

        sentence1.addText(symbol1);
        sentence1.addText(word1);
        sentence1.addText(lexeme1);

        word2.addText(symbol11);
        word2.addText(symbol12);

        lexeme2.addText(symbol13);
        lexeme2.addText(symbol14);
        lexeme2.addText(symbol15);
        lexeme2.addText(symbol16);
        lexeme2.addText(symbol17);
        lexeme2.addText(symbol18);
        lexeme2.addText(symbol18);
        lexeme2.addText(symbol19);
        lexeme2.addText(symbol20);

        sentence2.addText(symbol10);
        sentence2.addText(word2);
        sentence2.addText(lexeme2);

        paragraph1.addText(sentence1);
        paragraph1.addText(sentence2);

        paragraph2.addText(sentence2);

        text.addText(paragraph1);
        text.addText(paragraph2);


        System.out.print(text);

        assertNotNull(text);
    }
}
