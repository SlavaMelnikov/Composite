package by.melnikov.composite.parser.impl;

import by.melnikov.composite.entity.TextComponent;
import by.melnikov.composite.entity.TextComponentType;
import by.melnikov.composite.parser.CustomTextParser;

public class LexemeToSymbolsParser implements CustomTextParser {
    private final CustomTextParser symbolParser = new SymbolLeafParser();

    @Override
    public TextComponent parse(String text) {
        return parseTextTo(text, TextComponentType.SYMBOL, EXTRACT_SYMBOL_REGEX, symbolParser);
    }
}
