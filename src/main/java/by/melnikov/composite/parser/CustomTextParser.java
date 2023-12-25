package by.melnikov.composite.parser;

import by.melnikov.composite.entity.TextComponent;
import by.melnikov.composite.entity.TextComposite;
import by.melnikov.composite.entity.TextType;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public interface CustomTextParser {
    String EXTRACT_PARAGRAPH_REGEX = "( {4}|\\t).*?(?=\\s{4}|$)";
    String EXTRACT_SENTENCE_REGEX = "( {4}|\\t| ).*?[.!?;\\u2026](?= |$)";
    String EXTRACT_LEXEME_REGEX = "( {4}|\\t| ).*?(?= |$)";
    String EXTRACT_SYMBOL_REGEX = "\\s|\\S";

    TextComponent parse(String text);

    default TextComponent parseTextTo(String text, TextType parsingResultType, String regex, CustomTextParser successor) {
        TextComposite textComposite = new TextComposite(parsingResultType);
        Pattern pattern = Pattern.compile(regex, Pattern.DOTALL);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            String paragraph = matcher.group();
            TextComponent textComponent = successor.parse(paragraph);
            textComposite.add(textComponent);
        }
        return textComposite;
    }
}
