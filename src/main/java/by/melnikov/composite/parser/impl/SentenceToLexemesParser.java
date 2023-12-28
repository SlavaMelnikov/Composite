package by.melnikov.composite.parser.impl;

import by.melnikov.composite.entity.TextComponent;
import by.melnikov.composite.entity.TextComponentType;
import by.melnikov.composite.parser.CustomTextParser;

public class SentenceToLexemesParser implements CustomTextParser {
    private final CustomTextParser lexemeParser = new LexemeToSymbolsParser();

    @Override
    public TextComponent parse(String text) {
        return parseTextTo(text, TextComponentType.LEXEME, EXTRACT_LEXEME_REGEX, lexemeParser);
    }
}
