package by.melnikov.composite.parser.impl;

import by.melnikov.composite.entity.TextComponent;
import by.melnikov.composite.parser.CustomParser;

public class WordParser implements CustomParser {
    private final CustomParser symbolParser = new SymbolLeafParser();
    @Override
    public TextComponent parse(String text) {
        // TODO PARSING
        String symbol = "q";
        return symbolParser.parse(symbol);
    }
}
