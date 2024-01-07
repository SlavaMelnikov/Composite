package by.melnikov.composite.service;

public interface TextService {
    String sortParagraphs();
    String findLongestSentence();
    String deleteSentenceShorterThan(int countOfWords);
}
