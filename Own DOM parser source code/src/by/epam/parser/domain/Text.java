package by.epam.parser.domain;

/**
 * Created by Владислав on 21.05.2016.
 */
public interface Text extends Node {
    String getWholeText();
    void replaceWholeText(String content);
}
