package parser;

import entity.TextComposite;

public class ParagraphParser extends AbstractParser {
    private AbstractParser parser = new SentenceParser();

    @Override
    public TextComposite parse(String text) {
        //TODO PARSING
        String parsingResult = "First sentence. Second sentence.";
        return parser.parse(parsingResult);
    }
}
