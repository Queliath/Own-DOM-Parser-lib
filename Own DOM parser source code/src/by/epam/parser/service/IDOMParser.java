package by.epam.parser.service;

import by.epam.parser.domain.Document;
import by.epam.parser.exception.NoFileException;

/**
 * Created by Владислав on 24.05.2016.
 */
public interface IDOMParser {
    Document parse() throws NoFileException;
    void setXMLFile(String xmlFileURI);
}
