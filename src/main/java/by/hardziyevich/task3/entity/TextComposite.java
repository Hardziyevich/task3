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
    public TextType getType() {
        return textType;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        textComposites.forEach(x -> stringBuilder.append(x.toString()).append(textType.getDelimiter()));
        return stringBuilder.toString();
    }
}
