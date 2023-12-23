package by.melnikov.composite.parser.impl;

import by.melnikov.composite.entity.TextComponent;
import by.melnikov.composite.entity.TextComposite;
import by.melnikov.composite.parser.CustomParser;

public class LexemaParser implements CustomParser {
    private final CustomParser wordParser = new WordParser();

    @Override
    public TextComponent parse(String text) {
        //TODO PARSING
        String parsingResult = "lexema";
        return wordParser.parse(parsingResult);
    }
}
