package by.melnikov.composite.service.impl;

import by.melnikov.composite.entity.TextComponent;
import by.melnikov.composite.entity.TextComposite;
import by.melnikov.composite.service.TextService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class TextServiceImpl implements TextService {
    private static final Logger logger = LogManager.getLogger();
    private TextComposite text;

    public TextServiceImpl(TextComposite text) {
        this.text = text;
    }

    @Override
    public String sortParagraphs() {
        List<TextComponent> paragraphs = text.getTextComponents();
        paragraphs.sort((o1, o2) -> o1.getTextComponents().size() - o2.getTextComponents().size());
        text.setTextComponents(paragraphs);
        return text.composeText();
    }

    @Override
    public String findLongestSentence() {
        TextComponent longestSentence = null;
        int currentLength = 0;
        for (TextComponent paragraph : text.getTextComponents()) {
            for (TextComponent sentence : paragraph.getTextComponents()) {
                if (sentence.getTextComponents().size() > currentLength) {
                    currentLength = sentence.getTextComponents().size();
                    longestSentence = sentence;
                }
            }
        }
        return longestSentence.composeText();
    }

    @Override
    public String deleteSentenceShorterThan(int countOfWords) {
        for (TextComponent paragraph : text.getTextComponents()) {
            for (TextComponent sentence : paragraph.getTextComponents()) {
                if (sentence.getTextComponents().size() < countOfWords) {
                    sentence.getTextComponents().stream().forEach(textComponent -> text.remove(textComponent));
                }
            }
        }
        return text.composeText();
    }
}
