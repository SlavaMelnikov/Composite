package by.melnikov.composite.parser.impl;

import by.melnikov.composite.entity.SymbolLeaf;
import by.melnikov.composite.entity.TextComponent;
import by.melnikov.composite.entity.TextComponentType;
import by.melnikov.composite.parser.CustomTextParser;

public class SymbolLeafParser implements CustomTextParser {
    @Override
    public TextComponent parse(String text) {
        char symbol = text.charAt(0);
        TextComponentType symbolType;
        if (Character.isDigit(symbol)) {
            symbolType = TextComponentType.DIGIT;
        } else if (Character.isLetter(symbol)) {
            symbolType = TextComponentType.LETTER;
        } else if (Character.isWhitespace(symbol)){
            symbolType = TextComponentType.WHITESPACE;
        } else {
            symbolType = TextComponentType.PUNCTUATION;
        }
        return new SymbolLeaf(symbolType, symbol);
    }
}
