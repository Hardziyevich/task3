package entity;

import by.hardziyevich.task3.entity.Leaf;
import by.hardziyevich.task3.entity.TextComposite;
import by.hardziyevich.task3.entity.TextType;
import org.junit.jupiter.api.Test;

public class TextCompositeTest {

    @Test
    void testToString(){
        TextComposite textComposite = new TextComposite(TextType.PARAGRAPH);
        TextComposite textComposite1 = new TextComposite(TextType.SYMBOL);
        Leaf leaf = new Leaf(TextType.SYMBOL,'1');
        textComposite1.addText(leaf);
        textComposite1.addText(leaf);
        textComposite1.addText(leaf);
        textComposite1.addText(leaf);
        textComposite.addText(textComposite1);
        System.out.println(textComposite);
    }
}
