package ye;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import org.cybergarage.xml.Node;
import org.cybergarage.xml.ParserException;
import org.cybergarage.xml.XML;
import we.d;

/* compiled from: SOAPRequest */
public class a extends d {

    /* renamed from: l  reason: collision with root package name */
    public Node f28178l;

    public a() {
        s("Content-Type", XML.CONTENT_TYPE);
        this.f27214f = "POST";
    }

    public Node F() {
        Node G = G();
        if (G != null && G.hasNodes()) {
            return G.getNode(0);
        }
        return null;
    }

    public final synchronized Node G() {
        Node node = this.f28178l;
        if (node != null) {
            return node;
        }
        try {
            this.f28178l = e.a.f13500a.parse((InputStream) new ByteArrayInputStream((byte[]) this.f13214e));
        } catch (ParserException e10) {
            ff.a.b(e10);
        }
        return this.f28178l;
    }

    public void H(Node node) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(String.valueOf("<?xml version=\"1.0\" encoding=\"utf-8\"?>") + "\n"));
        sb2.append(node.toString());
        o(sb2.toString());
    }
}
