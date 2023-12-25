package by.melnikov.composite.entity;

public class SymbolLeaf implements TextComponent {
    private final TextType symbolType;
    private final Character symbol;

    public SymbolLeaf(TextType symbolType, Character symbol) {
        this.symbolType = symbolType;
        this.symbol = symbol;
    }

    @Override
    public String composeText() {
        return symbol.toString();
    }
}
