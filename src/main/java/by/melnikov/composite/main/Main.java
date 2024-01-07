package by.melnikov.composite.main;

import by.melnikov.composite.entity.TextComposite;
import by.melnikov.composite.exception.CustomException;
import by.melnikov.composite.parser.CustomTextParser;
import by.melnikov.composite.parser.impl.TextToParagraphsParser;
import by.melnikov.composite.reader.TextReader;
import by.melnikov.composite.reader.impl.FileTextReader;
import by.melnikov.composite.service.TextService;
import by.melnikov.composite.service.impl.TextServiceImpl;
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
        TextComposite textComposite = (TextComposite) textParser.parse(text);
        String textAfterParsing = textComposite.composeText();
        System.out.println(textAfterParsing + "\n");

        TextService service = new TextServiceImpl(textComposite);
        System.out.println(service.sortParagraphs());
        System.out.println(service.findLongestSentence());
        System.out.println(service.deleteSentenceShorterThan(3));

        logger.info("Application completed!");
    }
}
