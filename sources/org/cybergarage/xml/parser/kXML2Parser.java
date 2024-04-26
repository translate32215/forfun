package org.cybergarage.xml.parser;

import java.io.InputStream;
import java.io.InputStreamReader;
import org.cybergarage.xml.Node;
import org.cybergarage.xml.Parser;
import org.cybergarage.xml.ParserException;
import org.kxml2.io.KXmlParser;

public class kXML2Parser extends Parser {
    public Node parse(InputStream inputStream) throws ParserException {
        Node node;
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            KXmlParser kXmlParser = new KXmlParser();
            kXmlParser.setInput(inputStreamReader);
            Node node2 = null;
            Node node3 = null;
            for (int eventType = kXmlParser.getEventType(); eventType != 1; eventType = kXmlParser.next()) {
                if (eventType == 2) {
                    node = new Node();
                    node.setName(kXmlParser.getName());
                    int attributeCount = kXmlParser.getAttributeCount();
                    for (int i10 = 0; i10 < attributeCount; i10++) {
                        node.setAttribute(kXmlParser.getAttributeName(i10), kXmlParser.getAttributeValue(i10));
                    }
                    if (node2 != null) {
                        node2.addNode(node);
                    }
                    if (node3 == null) {
                        node2 = node;
                        node3 = node2;
                    }
                } else if (eventType != 3) {
                    if (eventType == 4) {
                        String text = kXmlParser.getText();
                        if (node2 != null) {
                            node2.setValue(text);
                        }
                    }
                } else {
                    node = node2.getParentNode();
                }
                node2 = node;
            }
            return node3;
        } catch (Exception e10) {
            throw new ParserException(e10);
        }
    }
}
