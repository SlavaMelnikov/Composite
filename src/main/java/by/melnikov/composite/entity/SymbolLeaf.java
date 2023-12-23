package by.melnikov.composite.entity;

public class SymbolLeaf implements TextComponent {
    private TextType textType;
    private Character symbol;

    public SymbolLeaf(TextType textType, Character symbol) {
        this.textType = textType;
        this.symbol = symbol;
    }

    @Override
    public String composeText() {
        return symbol.toString();
    }
}
