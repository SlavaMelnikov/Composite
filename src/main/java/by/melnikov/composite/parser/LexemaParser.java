package by.melnikov.composite.parser;

import by.melnikov.composite.entity.TextComposite;

public class LexemaParser extends AbstractParser {
    private AbstractParser parser = new SymbolLeafParser();

    @Override
    public TextComposite parse(String text) {
        //TODO PARSING
        String parsingResult = "lexema";
        return parser.parse(parsingResult);
    }
}