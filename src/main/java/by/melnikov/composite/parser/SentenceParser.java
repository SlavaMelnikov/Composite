package by.melnikov.composite.parser;

import by.melnikov.composite.entity.TextComposite;

public class SentenceParser extends AbstractParser {
    private AbstractParser parser = new LexemaParser();

    @Override
    public TextComposite parse(String text) {
        //TODO PARSING
        String parsingResult = "One sentence.";
        return parser.parse(parsingResult);
    }
}
