package by.melnikov.composite.parser.impl;

import by.melnikov.composite.entity.TextComponent;
import by.melnikov.composite.parser.CustomParser;

public class SentenceParser implements CustomParser {
    private final CustomParser lexemaParser = new LexemaParser();

    @Override
    public TextComponent parse(String text) {
        //TODO PARSING
        String parsingResult = "One sentence.";
        return lexemaParser.parse(parsingResult);
    }
}
