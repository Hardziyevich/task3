package by.hardziyevich.task3.entity;

public interface TextComponent {
    boolean addText(TextComponent textComponent);
    boolean removeText(TextComponent textComponent);
    TextType getType();
    @Override
    String toString();
}
