package by.melnikov.composite.parser.impl;

import by.melnikov.composite.entity.TextComponent;
import by.melnikov.composite.entity.TextType;
import by.melnikov.composite.parser.CustomTextParser;

public class LexemeToSymbolsParser implements CustomTextParser {
    private final CustomTextParser symbolParser = new SymbolLeafParser();

    @Override
    public TextComponent parse(String text) {
        return parseTextTo(text, TextType.SYMBOL, EXTRACT_SYMBOL_REGEX, symbolParser);
    }
}
