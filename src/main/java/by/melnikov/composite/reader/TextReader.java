package by.melnikov.composite.reader;

import by.melnikov.composite.exception.CustomException;

public interface TextReader {
    String readText(String fileName) throws CustomException;
}
