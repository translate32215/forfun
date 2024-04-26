package ze;

import ef.b;
import org.cybergarage.xml.Node;

/* compiled from: Argument */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public Node f28851a;

    public c() {
        this.f28851a = new Node("argument");
    }

    public String a() {
        return this.f28851a.getNodeValue("name");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.Set<cb.e>, org.cybergarage.xml.Node] */
    public String b() {
        ? r02 = this.f28851a;
        b bVar = (b) r02.getUserData();
        if (bVar == null) {
            bVar = new b();
            r02.setUserData(bVar);
            bVar.f4374b = r02;
        }
        return bVar.f17848d;
    }

    public boolean c() {
        String nodeValue = this.f28851a.getNodeValue("direction");
        if (nodeValue == null) {
            return false;
        }
        return nodeValue.equalsIgnoreCase("in");
    }

    public boolean d() {
        return !c();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.Set<cb.e>, org.cybergarage.xml.Node] */
    public void e(String str) {
        ? r02 = this.f28851a;
        b bVar = (b) r02.getUserData();
        if (bVar == null) {
            bVar = new b();
            r02.setUserData(bVar);
            bVar.f4374b = r02;
        }
        bVar.f17848d = str;
    }

    public c(String str, String str2) {
        Node node = new Node("argument");
        this.f28851a = node;
        node.setNode("name", str);
        e(str2);
    }

    public c(Node node, Node node2) {
        this.f28851a = node2;
    }
}
