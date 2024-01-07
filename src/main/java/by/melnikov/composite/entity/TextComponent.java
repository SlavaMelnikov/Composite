package by.melnikov.composite.entity;

import by.melnikov.composite.exception.CustomException;

import java.util.List;

public interface TextComponent {
    String composeText();
    List<TextComponent> getTextComponents();
    TextComponentType getTextComponentType();
}
