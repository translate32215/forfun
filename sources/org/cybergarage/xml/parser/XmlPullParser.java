package org.cybergarage.xml.parser;

import java.io.InputStream;
import org.cybergarage.xml.Node;
import org.cybergarage.xml.Parser;
import org.cybergarage.xml.ParserException;
import org.xmlpull.v1.XmlPullParserFactory;

public class XmlPullParser extends Parser {
    public Node parse(org.xmlpull.v1.XmlPullParser xmlPullParser, InputStream inputStream) throws ParserException {
        Node node;
        Node node2 = null;
        try {
            xmlPullParser.setInput(inputStream, (String) null);
            int eventType = xmlPullParser.getEventType();
            Node node3 = null;
            while (eventType != 1) {
                if (eventType == 2) {
                    node = new Node();
                    String prefix = xmlPullParser.getPrefix();
                    String name = xmlPullParser.getName();
                    StringBuffer stringBuffer = new StringBuffer();
                    if (prefix != null && prefix.length() > 0) {
                        stringBuffer.append(prefix);
                        stringBuffer.append(":");
                    }
                    if (name != null && name.length() > 0) {
                        stringBuffer.append(name);
                    }
                    node.setName(stringBuffer.toString());
                    int attributeCount = xmlPullParser.getAttributeCount();
                    for (int i10 = 0; i10 < attributeCount; i10++) {
                        node.setAttribute(xmlPullParser.getAttributeName(i10), xmlPullParser.getAttributeValue(i10));
                    }
                    if (node2 != null) {
                        node2.addNode(node);
                    }
                    if (node3 == null) {
                        node2 = node;
                        node3 = node2;
                        eventType = xmlPullParser.next();
                    }
                } else if (eventType != 3) {
                    if (eventType == 4) {
                        String text = xmlPullParser.getText();
                        if (!(text == null || node2 == null)) {
                            node2.setValue(text);
                        }
                    }
                    eventType = xmlPullParser.next();
                } else {
                    node = node2.getParentNode();
                }
                node2 = node;
                eventType = xmlPullParser.next();
            }
            return node3;
        } catch (Exception e10) {
            throw new ParserException(e10);
        }
    }

    public Node parse(InputStream inputStream) throws ParserException {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            newInstance.setNamespaceAware(true);
            return parse(newInstance.newPullParser(), inputStream);
        } catch (Exception e10) {
            throw new ParserException(e10);
        }
    }
}
