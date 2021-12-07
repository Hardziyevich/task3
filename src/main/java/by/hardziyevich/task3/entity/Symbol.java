package by.hardziyevich.task3.entity;

import java.util.List;

public class Symbol implements TextComponent {
    private final TextType textType;
    private final char symbol;

    public Symbol(TextType textType, char symbol) {
        this.textType = textType;
        this.symbol = symbol;
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
        return String.valueOf(symbol);
    }
}
