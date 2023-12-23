package by.melnikov.composite.parser.impl;

import by.melnikov.composite.entity.TextComponent;
import by.melnikov.composite.entity.TextComposite;
import by.melnikov.composite.parser.CustomParser;

public class SymbolLeafParser implements CustomParser {
    @Override
    public TextComponent parse(String text) {
        //TODO PARSING
        String parsingResult = "l";
        return new TextComposite(); // FIXME
    }
}
