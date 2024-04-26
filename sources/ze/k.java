package ze;

import cb.d;
import org.cybergarage.xml.Node;
import q.e;
import v6.q;

/* compiled from: StateVariable */
public class k extends d {

    /* renamed from: d  reason: collision with root package name */
    public Node f28871d;

    /* renamed from: e  reason: collision with root package name */
    public Node f28872e;

    /* renamed from: f  reason: collision with root package name */
    public q f28873f;

    public k() {
        super(18);
        this.f28873f = new q(3, (e) null);
        this.f28872e = null;
        this.f28871d = new Node("stateVariable");
    }

    public String j() {
        return this.f28871d.getNodeValue("name");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.Set<cb.e>, org.cybergarage.xml.Node] */
    public ef.e k() {
        ? r02 = this.f28871d;
        ef.e eVar = (ef.e) r02.getUserData();
        if (eVar != null) {
            return eVar;
        }
        ef.e eVar2 = new ef.e();
        r02.setUserData(eVar2);
        eVar2.f4374b = r02;
        return eVar2;
    }

    public String l() {
        return k().f17856d;
    }

    public boolean m() {
        String attributeValue = this.f28871d.getAttributeValue("sendEvents");
        if (attributeValue != null && attributeValue.equalsIgnoreCase("yes")) {
            return true;
        }
        return false;
    }

    public k(Node node, Node node2) {
        super(18);
        this.f28873f = new q(3, (e) null);
        this.f28872e = node;
        this.f28871d = node2;
    }
}
