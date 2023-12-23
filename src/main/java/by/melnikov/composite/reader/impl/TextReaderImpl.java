package by.melnikov.composite.reader.impl;

import by.melnikov.composite.exception.CustomException;
import by.melnikov.composite.reader.TextReader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TextReaderImpl implements TextReader {
    @Override
    public String readText(String path) throws CustomException {
        try {
            return Files.readString(Path.of(path));
        } catch (IOException e) {
            throw new CustomException("Error while reading text from a file. ", e);
        }
    }
}
