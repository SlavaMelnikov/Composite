package by.melnikov.composite.main;

import by.melnikov.composite.entity.TextComponent;
import by.melnikov.composite.exception.CustomException;
import by.melnikov.composite.parser.CustomTextParser;
import by.melnikov.composite.parser.impl.TextToParagraphsParser;
import by.melnikov.composite.reader.TextReader;
import by.melnikov.composite.reader.impl.FileTextReader;
import by.melnikov.composite.service.TextStreamService;
import by.melnikov.composite.service.impl.TextStreamServiceImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger logger = LogManager.getLogger();
    public static final String PATH_TO_FILE = "src//main//resources//text.txt"; //FIXME

    public static void main(String[] args) throws CustomException {
        logger.info("Reading from file.");
        TextReader textReader = new FileTextReader();
        String text = textReader.readText(PATH_TO_FILE);
        logger.info("The next text was successfully read:\n");
        System.out.println(text + "\n");

        logger.info("Parsing and recomposing text:\n");
        CustomTextParser textParser = new TextToParagraphsParser();
        TextComponent textComposite = textParser.parse(text);
        String textAfterParsing = textComposite.composeText();
        System.out.println(textAfterParsing + "\n");

        TextStreamService service = new TextStreamServiceImpl(textComposite);

        logger.info("The paragraphs are sorted by number of sentences:\n");
        System.out.println(service.sortParagraphsByNumberOfSentences());

        logger.info("The sentence with the longest word:\n");
        System.out.println(service.findSentenceWithLongestWord());

        logger.info("Text without sentences with words shorter than a given length:\n");
        System.out.println(service.deleteSentencesShorterThan(10));

        logger.info("The number of similar words in the text:\n");
        System.out.println(service.countNumberOfSameWords());

        logger.info("The number of vowels and consonants in the sentence:\n");
        System.out.println(service.countVowelsAndConsonantInSentence());

        logger.info("Application completed!");
    }
}
