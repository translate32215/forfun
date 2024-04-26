package org.cybergarage.xml;

import androidx.activity.e;
import java.io.ByteArrayOutputStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;

public class Node {
    private AttributeList attrList;
    private String name;
    private NodeList nodeList;
    private Node parentNode;
    private Object userData;
    private String value;

    public Node() {
        this.parentNode = null;
        this.name = new String();
        this.value = new String();
        this.attrList = new AttributeList();
        this.nodeList = new NodeList();
        this.userData = null;
        setUserData((Object) null);
        setParentNode((Node) null);
    }

    public void addAttribute(Attribute attribute) {
        this.attrList.add(attribute);
    }

    public void addNode(Node node) {
        node.setParentNode(this);
        this.nodeList.add(node);
    }

    public void addValue(String str) {
        String str2 = this.value;
        if (str2 == null) {
            this.value = str;
        } else if (str != null) {
            this.value = String.valueOf(str2) + str;
        }
    }

    public Attribute getAttribute(int i10) {
        return this.attrList.getAttribute(i10);
    }

    public int getAttributeIntegerValue(String str) {
        try {
            return Integer.parseInt(getAttributeValue(str));
        } catch (Exception unused) {
            return 0;
        }
    }

    public String getAttributeValue(String str) {
        Attribute attribute = getAttribute(str);
        return attribute != null ? attribute.getValue() : "";
    }

    public String getIndentLevelString(int i10) {
        return getIndentLevelString(i10, "   ");
    }

    public int getIndex(String str) {
        Iterator it = this.nodeList.iterator();
        int i10 = -1;
        while (it.hasNext()) {
            i10++;
            if (((Node) it.next()).getName().equals(str)) {
                return i10;
            }
        }
        return i10;
    }

    public int getNAttributes() {
        return this.attrList.size();
    }

    public int getNNodes() {
        return this.nodeList.size();
    }

    public String getName() {
        return this.name;
    }

    public Node getNode(int i10) {
        return this.nodeList.getNode(i10);
    }

    public Node getNodeEndsWith(String str) {
        return this.nodeList.getEndsWith(str);
    }

    public String getNodeValue(String str) {
        Node node = getNode(str);
        return node != null ? node.getValue() : "";
    }

    public Node getParentNode() {
        return this.parentNode;
    }

    public Node getRootNode() {
        Node node = null;
        for (Node parentNode2 = getParentNode(); parentNode2 != null; parentNode2 = parentNode2.getParentNode()) {
            node = parentNode2;
        }
        return node;
    }

    public Object getUserData() {
        return this.userData;
    }

    public String getValue() {
        return this.value;
    }

    public boolean hasAttributes() {
        return getNAttributes() > 0;
    }

    public boolean hasNodes() {
        return getNNodes() > 0;
    }

    public void insertAttributeAt(Attribute attribute, int i10) {
        this.attrList.insertElementAt(attribute, i10);
    }

    public void insertNode(Node node, int i10) {
        node.setParentNode(this);
        this.nodeList.insertElementAt(node, i10);
    }

    public boolean isName(String str) {
        return this.name.equals(str);
    }

    public void output(PrintWriter printWriter, int i10, boolean z10) {
        String indentLevelString = getIndentLevelString(i10);
        String name2 = getName();
        String value2 = getValue();
        if (!hasNodes() || !z10) {
            printWriter.print(String.valueOf(indentLevelString) + "<" + name2);
            outputAttributes(printWriter);
            if (value2 == null || value2.length() == 0) {
                printWriter.println("></" + name2 + ">");
                return;
            }
            printWriter.println(">" + XML.escapeXMLChars(value2) + "</" + name2 + ">");
            return;
        }
        printWriter.print(String.valueOf(indentLevelString) + "<" + name2);
        outputAttributes(printWriter);
        printWriter.println(">");
        int nNodes = getNNodes();
        for (int i11 = 0; i11 < nNodes; i11++) {
            getNode(i11).output(printWriter, i10 + 1, true);
        }
        printWriter.println(String.valueOf(indentLevelString) + "</" + name2 + ">");
    }

    public void outputAttributes(PrintWriter printWriter) {
        int nAttributes = getNAttributes();
        for (int i10 = 0; i10 < nAttributes; i10++) {
            Attribute attribute = getAttribute(i10);
            printWriter.print(" " + attribute.getName() + "=\"" + XML.escapeXMLChars(attribute.getValue()) + "\"");
        }
    }

    public void print(boolean z10) {
        PrintWriter printWriter = new PrintWriter(System.out);
        output(printWriter, 0, z10);
        printWriter.flush();
    }

    public void removeAllNodes() {
        this.nodeList.clear();
    }

    public boolean removeAttribute(Attribute attribute) {
        return this.attrList.remove(attribute);
    }

    public boolean removeNode(Node node) {
        node.setParentNode((Node) null);
        return this.nodeList.remove(node);
    }

    public void setAttribute(String str, String str2) {
        Attribute attribute = getAttribute(str);
        if (attribute != null) {
            attribute.setValue(str2);
        } else {
            addAttribute(new Attribute(str, str2));
        }
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setNameSpace(String str, String str2) {
        setAttribute("xmlns:" + str, str2);
    }

    public void setNode(String str, String str2) {
        Node node = getNode(str);
        if (node != null) {
            node.setValue(str2);
            return;
        }
        Node node2 = new Node(str);
        node2.setValue(str2);
        addNode(node2);
    }

    public void setParentNode(Node node) {
        this.parentNode = node;
    }

    public void setUserData(Object obj) {
        this.userData = obj;
    }

    public void setValue(String str) {
        this.value = str;
    }

    public String toString(String str, boolean z10) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintWriter printWriter = new PrintWriter(byteArrayOutputStream);
        output(printWriter, 0, z10);
        printWriter.flush();
        if (str != null) {
            try {
                if (str.length() > 0) {
                    return byteArrayOutputStream.toString(str);
                }
            } catch (UnsupportedEncodingException unused) {
            }
        }
        return byteArrayOutputStream.toString();
    }

    public String toXMLString(boolean z10) {
        return toString().replaceAll("<", "&lt;").replaceAll(">", "&gt;").replaceAll("&", "&amp;").replaceAll("\"", "&quot;").replaceAll("'", "&apos;");
    }

    public void addAttribute(String str, String str2) {
        addAttribute(new Attribute(str, str2));
    }

    public Attribute getAttribute(String str) {
        return this.attrList.getAttribute(str);
    }

    public String getIndentLevelString(int i10, String str) {
        StringBuffer stringBuffer = new StringBuffer(str.length() * i10);
        for (int i11 = 0; i11 < i10; i11++) {
            stringBuffer.append(str);
        }
        return stringBuffer.toString();
    }

    public Node getNode(String str) {
        return this.nodeList.getNode(str);
    }

    public boolean removeAttribute(String str) {
        return removeAttribute(getAttribute(str));
    }

    public void setName(String str, String str2) {
        this.name = e.a(new StringBuilder(String.valueOf(str)), ":", str2);
    }

    public void setValue(int i10) {
        setValue(Integer.toString(i10));
    }

    public boolean removeNode(String str) {
        return this.nodeList.remove(getNode(str));
    }

    public void print() {
        print(true);
    }

    public void setAttribute(String str, int i10) {
        setAttribute(str, Integer.toString(i10));
    }

    public String toXMLString() {
        return toXMLString(true);
    }

    public String toString() {
        return toString(XML.CHARSET_UTF8, true);
    }

    public Node(String str) {
        this();
        setName(str);
    }

    public Node(String str, String str2) {
        this();
        setName(str, str2);
    }
}
