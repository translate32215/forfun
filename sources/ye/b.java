package ye;

import e.a;
import org.cybergarage.xml.Node;
import org.cybergarage.xml.XML;
import we.f;

/* compiled from: SOAPResponse */
public class b extends f {

    /* renamed from: g  reason: collision with root package name */
    public Node f28179g;

    public b() {
        this.f28179g = a.c();
        s("Content-Type", XML.CONTENT_TYPE);
    }

    public void A(Node node) {
        o(String.valueOf("<?xml version=\"1.0\" encoding=\"utf-8\"?>\n") + node.toString());
    }

    public Node z() {
        Node node = this.f28179g;
        if (node == null) {
            return null;
        }
        return node.getNodeEndsWith("Body");
    }

    public b(f fVar) {
        super(fVar);
        this.f28179g = a.c();
        s("Content-Type", XML.CONTENT_TYPE);
    }

    public b(b bVar) {
        super(bVar);
        this.f28179g = bVar.f28179g;
        s("Content-Type", XML.CONTENT_TYPE);
    }
}
