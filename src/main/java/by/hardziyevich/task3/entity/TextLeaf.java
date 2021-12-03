package by.hardziyevich.task3.entity;

import java.util.List;

public class TextLeaf implements TextComponent {
    private final TextType textType;
    private final char leaf;

    public TextLeaf(TextType textType, char leaf) {
        this.textType = textType;
        this.leaf = leaf;
    }

    @Override
    public boolean addText(TextComponent textComponent) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean removeText(TextComponent textComponent) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<TextComponent> allComponent() {
        throw new UnsupportedOperationException();
    }

    @Override
    public TextType getType() {
        return textType;
    }

    @Override
    public String toString() {
        return String.valueOf(leaf);
    }
}
