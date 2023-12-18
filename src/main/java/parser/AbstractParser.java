package parser;

import entity.TextComponent;
import entity.TextComposite;

public abstract class AbstractParser {
    abstract public TextComposite parse(String text);
}
