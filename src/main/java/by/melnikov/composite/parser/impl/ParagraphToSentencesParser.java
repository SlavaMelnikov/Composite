package by.melnikov.composite.parser.impl;

import by.melnikov.composite.entity.TextComponent;
import by.melnikov.composite.entity.TextComponentType;
import by.melnikov.composite.parser.CustomTextParser;

public class ParagraphToSentencesParser implements CustomTextParser {
    private final CustomTextParser sentenceParser = new SentenceToLexemesParser();

    @Override
    public TextComponent parse(String text) {
        return parseTextTo(text, TextComponentType.SENTENCE, EXTRACT_SENTENCE_REGEX, sentenceParser);
    }
}
