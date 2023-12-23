package by.melnikov.composite.main;

import by.melnikov.composite.entity.TextComponent;
import by.melnikov.composite.exception.CustomException;
import by.melnikov.composite.parser.CustomParser;
import by.melnikov.composite.parser.impl.TextParser;
import by.melnikov.composite.reader.TextReader;
import by.melnikov.composite.reader.impl.TextReaderImpl;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger logger = LogManager.getLogger();
    public static final String PATH_TO_FILE = "src//main//resources//text.txt"; //FIXME
    public static void main(String[] args) throws CustomException {
        TextReader textReader = new TextReaderImpl();
        String text = textReader.readText(PATH_TO_FILE);

        CustomParser customParser = new TextParser();
        TextComponent textComponent = customParser.parse(text);

        System.out.println(textComponent.composeText());
    }
}
