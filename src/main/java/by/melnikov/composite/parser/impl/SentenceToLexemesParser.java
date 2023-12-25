package by.melnikov.composite.parser.impl;

import by.melnikov.composite.entity.TextComponent;
import by.melnikov.composite.entity.TextType;
import by.melnikov.composite.parser.CustomTextParser;

public class SentenceToLexemesParser implements CustomTextParser {
    private final CustomTextParser lexemeParser = new LexemeToSymbolsParser();

    @Override
    public TextComponent parse(String text) {
        return parseTextTo(text, TextType.LEXEME, EXTRACT_LEXEME_REGEX, lexemeParser);
    }
}
