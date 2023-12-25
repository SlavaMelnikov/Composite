package by.melnikov.composite.parser.impl;

import by.melnikov.composite.entity.TextComponent;
import by.melnikov.composite.entity.TextType;
import by.melnikov.composite.parser.CustomTextParser;

public class TextToParagraphsParser implements CustomTextParser {
    private final CustomTextParser paragraphParser = new ParagraphToSentencesParser();

    @Override
    public TextComponent parse(String text) {
        return parseTextTo(text, TextType.PARAGRAPH, EXTRACT_PARAGRAPH_REGEX, paragraphParser);
    }
}
