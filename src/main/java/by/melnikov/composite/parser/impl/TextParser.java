package by.melnikov.composite.parser.impl;

import by.melnikov.composite.entity.TextComponent;
import by.melnikov.composite.parser.CustomParser;

public class TextParser implements CustomParser {
    private final CustomParser paragraphParser = new ParagraphParser();

    @Override
    public TextComponent parse(String text) {
        //TODO PARSING
        String parsingResult = "paragraphs";
        return paragraphParser.parse(parsingResult);
    }
}
