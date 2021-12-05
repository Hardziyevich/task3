package by.hardziyevich.task3.entity;

import java.util.ArrayList;
import java.util.List;

public class TextComposite implements TextComponent {
    private TextType textType;
    private List<TextComponent> textComposites = new ArrayList<>();

    public TextComposite(TextType textType) {
        this.textType = textType;
    }

    @Override
    public boolean addText(TextComponent textComponent) {
        return textComposites.add(textComponent);
    }

    @Override
    public boolean removeText(TextComponent textComponent) {
        return textComposites.remove(textComponent);
    }

    @Override
    public List<TextComponent> allComponent() {
        return List.copyOf(textComposites);
    }

    @Override
    public TextType getType() {
        return textType;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        textComposites.forEach(x -> stringBuilder
                .append(textType.getPrefix())
                .append(x.toString())
                .append(textType.getPostfix()));
        if(textType == TextType.PARAGRAPH){
            stringBuilder.delete(stringBuilder.length() - 1,stringBuilder.length());
        }
        else if(textType == TextType.TEXT){
            stringBuilder.delete(stringBuilder.length() - 2,stringBuilder.length());
        }
        return stringBuilder.toString();
    }
}
