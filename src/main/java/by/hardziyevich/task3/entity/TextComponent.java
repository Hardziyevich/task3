package by.hardziyevich.task3.entity;

import java.util.List;

public interface TextComponent {
    boolean addText(TextComponent textComponent);
    boolean removeText(TextComponent textComponent);
    List<TextComponent> allComponent();
    TextType getType();
    @Override
    String toString();
}
