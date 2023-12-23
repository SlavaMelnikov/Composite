package by.melnikov.composite.parser.impl;

import by.melnikov.composite.entity.TextComponent;
import by.melnikov.composite.parser.CustomParser;

public class ParagraphParser implements CustomParser {
    private final CustomParser sentenceParser = new SentenceParser();

    @Override
    public TextComponent parse(String text) {
        //TODO PARSING
        String parsingResult = "First sentence. Second sentence.";
        return sentenceParser.parse(parsingResult);
    }
}
