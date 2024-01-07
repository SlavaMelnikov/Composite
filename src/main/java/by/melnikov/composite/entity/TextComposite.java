package by.melnikov.composite.entity;

import java.util.ArrayList;
import java.util.List;

public class TextComposite implements TextComponent {
    private final TextComponentType type;
    private List<TextComponent> textComponents = new ArrayList<>();

    public TextComposite(TextComponentType type) {
        this.type = type;
    }

    @Override
    public String composeText() {
        StringBuilder stringBuilder = new StringBuilder();
        for (TextComponent textComponent : textComponents) {
            stringBuilder.append(textComponent.composeText());
        }
        return stringBuilder.toString();
    }

    @Override
    public TextComponentType getTextComponentType() {
        return type;
    }

    @Override
    public List<TextComponent> getTextComponents() {
        return new ArrayList<>(textComponents); //FIXME should return deep copy
    }

    public void setTextComponents(List<TextComponent> textComponents) {
        this.textComponents = textComponents;
    }

    public boolean add(TextComponent textComponent) {
        return textComponents.add(textComponent);
    }

    public boolean remove(TextComponent textComponent) {
        return textComponents.remove(textComponent);
    }
}
