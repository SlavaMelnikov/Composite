package by.melnikov.composite.service;

import by.melnikov.composite.entity.TextComponent;

import java.util.Map;

public interface TextStreamService {
    String sortParagraphsByNumberOfSentences();
    TextComponent findSentenceWithLongestWord();
    String deleteSentencesShorterThan(int numberOfWords);
    Map<TextComponent, Integer> countNumberOfSameWords();
    Map<TextComponent, Integer> countVowelsAndConsonantInSentence(TextComponent sentence);
}
