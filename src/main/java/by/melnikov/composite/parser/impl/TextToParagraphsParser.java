package by.melnikov.composite.parser.impl;

import by.melnikov.composite.entity.TextComponent;
import by.melnikov.composite.entity.TextComponentType;
import by.melnikov.composite.parser.CustomTextParser;

public class TextToParagraphsParser implements CustomTextParser {
    private final CustomTextParser paragraphParser = new ParagraphToSentencesParser();

    @Override
    public TextComponent parse(String text) {
        return parseTextTo(text, TextComponentType.PARAGRAPH, EXTRACT_PARAGRAPH_REGEX, paragraphParser);
    }
}
