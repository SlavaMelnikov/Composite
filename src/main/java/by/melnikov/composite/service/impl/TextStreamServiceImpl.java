package by.melnikov.composite.service.impl;

import by.melnikov.composite.entity.TextComponent;
import by.melnikov.composite.entity.TextComposite;
import by.melnikov.composite.service.TextStreamService;

import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class TextStreamServiceImpl implements TextStreamService {
    private final TextComponent text;
    private final List<TextComponent> textComponents;

    public TextStreamServiceImpl(TextComponent text) {
        this.text = text;
        textComponents = ((TextComposite) text).getTextComponents();
    }

    @Override
    public String sortParagraphsByNumberOfSentences() { //FIXME
        List<TextComponent> sorted = textComponents.stream().sorted(new Comparator<TextComponent>() {
            @Override
            public int compare(TextComponent o1, TextComponent o2) {
                return ((TextComposite) o1).getTextComponents().size() - ((TextComposite) o2).getTextComponents().size();
            }
        }).toList();
        ((TextComposite) text).setTextComponents(sorted);
        return text.composeText();
    }

    @Override
    public TextComponent findSentenceWithLongestWord() {
        return null;
    }

    @Override
    public String deleteSentencesShorterThan(int numberOfWords) {
        return null;
    }

    @Override
    public Map<TextComponent, Integer> countNumberOfSameWords() {
        return null;
    }

    @Override
    public Map<TextComponent, Integer> countVowelsAndConsonantInSentence(TextComponent sentence) {
        return null;
    }

}
