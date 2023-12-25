package by.melnikov.composite.main;

import by.melnikov.composite.entity.TextComponent;
import by.melnikov.composite.exception.CustomException;
import by.melnikov.composite.parser.CustomTextParser;
import by.melnikov.composite.parser.impl.TextToParagraphsParser;
import by.melnikov.composite.reader.TextReader;
import by.melnikov.composite.reader.impl.FileTextReader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger logger = LogManager.getLogger();
    public static final String PATH_TO_FILE = "src//main//resources//text.txt"; //FIXME
    public static void main(String[] args) throws CustomException {
        logger.info("Reading from file.");
        TextReader textReader = new FileTextReader();
        String textBeforeParsing = textReader.readText(PATH_TO_FILE);
        logger.info("The next text was successfully read:\n");
        System.out.println(textBeforeParsing);

        logger.info("Parsing and recomposing text...");
        CustomTextParser textParser = new TextToParagraphsParser();
        TextComponent textComposite = textParser.parse(textBeforeParsing);
        String textAfterParsing = textComposite.composeText();
        logger.info("Result of work:\n");
        System.out.println(textAfterParsing);

        logger.info("The paragraphs are sorted by number of sentences:\n");

        logger.info("The sentence with the longest word:\n");

        logger.info("Text without sentences with words shorter than a given length:\n");

        logger.info("The number of similar words in the text:\n");

        logger.info("The number of vowels and consonants in the sentence:\n");

        logger.info("Application completed!");
    }
}
