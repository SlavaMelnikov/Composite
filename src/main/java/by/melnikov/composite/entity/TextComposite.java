package by.melnikov.composite.entity;

import by.melnikov.composite.entity.TextComponent;

import java.util.ArrayList;
import java.util.List;

public class TextComposite implements TextComponent {
    public enum TypeTextComponent {
        TEXT, PARAGRAPH, SENTENCE, LEXEMA, SYMBOL_LEAF
    }
    private final List<TextComponent> textComponents = new ArrayList<>();

    @Override
    public void doSomeOperation() {
        for (TextComponent textComponent : textComponents) {
            textComponent.doSomeOperation();
        }
    }

    public void add(TextComponent textComponent) {
        textComponents.add(textComponent);
    }

    public void remove(TextComponent textComponent) {
        textComponents.remove(textComponent);
    }
}
