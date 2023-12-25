package by.melnikov.composite.parser.impl;

import by.melnikov.composite.entity.SymbolLeaf;
import by.melnikov.composite.entity.TextComponent;
import by.melnikov.composite.entity.TextType;
import by.melnikov.composite.parser.CustomTextParser;

public class SymbolLeafParser implements CustomTextParser {
    @Override
    public TextComponent parse(String text) {
        char symbol = text.charAt(0);
        TextType symbolType;
        if (Character.isDigit(symbol)) {
            symbolType = TextType.DIGIT;
        } else if (Character.isLetter(symbol)) {
            symbolType = TextType.LETTER;
        } else if (Character.isWhitespace(symbol)){
            symbolType = TextType.WHITESPACE;
        } else {
            symbolType = TextType.PUNCTUATION;
        }
        return new SymbolLeaf(symbolType, symbol);
    }
}
