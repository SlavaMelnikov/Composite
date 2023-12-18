package by.melnikov.composite.parser;

import by.melnikov.composite.entity.TextComposite;

public abstract class AbstractParser {
    abstract public TextComposite parse(String text);
}
