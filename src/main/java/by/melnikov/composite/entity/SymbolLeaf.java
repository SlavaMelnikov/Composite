package by.melnikov.composite.entity;

import java.util.ArrayList;
import java.util.List;

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

    @Override
    public List<TextComponent> getTextComponents(){
        List<TextComponent> oneSymbol = new ArrayList<>();
        oneSymbol.add(this);
        return oneSymbol;
    }
}
