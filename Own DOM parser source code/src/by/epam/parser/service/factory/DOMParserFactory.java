package by.epam.parser.service.factory;

import by.epam.parser.service.IDOMParser;
import by.epam.parser.service.MyDOMParser;

/**
 * Created by Владислав on 24.05.2016.
 */
public class DOMParserFactory {
    private static final DOMParserFactory factory = new DOMParserFactory();

    private DOMParserFactory(){
    }

    public static DOMParserFactory getInstance() {
        return factory;
    }

    public IDOMParser getDOMParser() {
        return new MyDOMParser();
    }
}
