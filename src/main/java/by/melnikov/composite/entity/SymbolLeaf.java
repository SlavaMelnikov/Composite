package by.melnikov.composite.entity;

public class SymbolLeaf implements TextComponent {
    private final TextComponentType symbolType;
    private final Character symbol;

    public SymbolLeaf(TextComponentType symbolType, Character symbol) {
        this.symbolType = symbolType;
        this.symbol = symbol;
    }

    @Override
    public String composeText() {
        return symbol.toString();
    }

    @Override
    public TextComponentType getTextComponentType() {
        return symbolType;
    }
}
