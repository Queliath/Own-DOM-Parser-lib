package by.epam.parser.domain.impl;

import by.epam.parser.domain.Document;
import by.epam.parser.domain.Element;
import by.epam.parser.domain.Node;

/**
 * Created by Владислав on 21.05.2016.
 */
public class DocumentImp implements Document {
    private Element documentElement;

    public DocumentImp(){
    }

    public DocumentImp(Element documentElement){
        this.documentElement = documentElement;
    }

    @Override
    public Element getDocumentElement() {
        return documentElement;
    }

    @Override
    public short getNodeType() {
        return 0;
    }

    @Override
    public String getNodeValue() {
        return null;
    }

    @Override
    public Node getParentNode() {
        return null;
    }

    @Override
    public Node getFirstChild() {
        return documentElement;
    }

    @Override
    public Node getLastChild() {
        return documentElement;
    }
}
