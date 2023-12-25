package by.melnikov.composite.entity;

import java.util.ArrayList;
import java.util.List;

public class TextComposite implements TextComponent {
    private final TextType textType;
    private final List<TextComponent> textComponents = new ArrayList<>();

    public TextComposite(TextType type) {
        this.textType = type;
    }

    public TextType getTextType() {
        return textType;
    }

    @Override
    public String composeText() {
        StringBuilder stringBuilder = new StringBuilder();
        for (TextComponent textComponent : textComponents) {
            stringBuilder.append(textComponent.composeText());
        }
        return stringBuilder.toString();
    }

    public boolean add(TextComponent textComponent) {
        return textComponents.add(textComponent);
    }

    public boolean remove(TextComponent textComponent) {
        return textComponents.remove(textComponent);
    }
}
