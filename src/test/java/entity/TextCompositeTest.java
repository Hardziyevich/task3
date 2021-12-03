package entity;

import by.hardziyevich.task3.entity.TextLeaf;
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
        TextLeaf symbol1 = new TextLeaf(TextType.DIGIT,'I');
        TextLeaf symbol2 = new TextLeaf(TextType.DIGIT,'a');
        TextLeaf symbol3 = new TextLeaf(TextType.DIGIT,'m');
        TextLeaf symbol4 = new TextLeaf(TextType.DIGIT,'P');
        TextLeaf symbol5 = new TextLeaf(TextType.DIGIT,'a');
        TextLeaf symbol6 = new TextLeaf(TextType.DIGIT,'s');
        TextLeaf symbol7 = new TextLeaf(TextType.DIGIT,'h');
        TextLeaf symbol8 = new TextLeaf(TextType.DIGIT,'a');
        TextLeaf symbol9 = new TextLeaf(TextType.PUNCTUATION,'.');

        TextLeaf symbol10 = new TextLeaf(TextType.DIGIT,'I');
        TextLeaf symbol11 = new TextLeaf(TextType.DIGIT,'a');
        TextLeaf symbol12 = new TextLeaf(TextType.DIGIT,'m');
        TextLeaf symbol13 = new TextLeaf(TextType.DIGIT,'N');
        TextLeaf symbol14 = new TextLeaf(TextType.DIGIT,'a');
        TextLeaf symbol15 = new TextLeaf(TextType.DIGIT,'t');
        TextLeaf symbol16 = new TextLeaf(TextType.DIGIT,'a');
        TextLeaf symbol17 = new TextLeaf(TextType.DIGIT,'s');
        TextLeaf symbol18 = new TextLeaf(TextType.DIGIT,'h');
        TextLeaf symbol19 = new TextLeaf(TextType.DIGIT,'a');
        TextLeaf symbol20 = new TextLeaf(TextType.PUNCTUATION,'!');

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
