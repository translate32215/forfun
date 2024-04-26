package af;

import org.cybergarage.xml.Node;
import q.e;
import v6.q;
import ye.b;
import ze.l;

/* compiled from: ControlResponse */
public class d extends b {
    public d() {
        new q(3, (e) null);
        s("Server", l.b());
    }

    public void B(int i10, String str) {
        this.f27220f = 500;
        Node z10 = z();
        Node node = new Node("s:Fault");
        Node node2 = new Node("faultcode");
        node2.setValue("s:Client");
        node.addNode(node2);
        Node node3 = new Node("faultstring");
        node3.setValue("UPnPError");
        node.addNode(node3);
        Node node4 = new Node("detail");
        node.addNode(node4);
        Node node5 = new Node("UPnPError");
        node5.setAttribute("xmlns", "urn:schemas-upnp-org:control-1-0");
        node4.addNode(node5);
        Node node6 = new Node("errorCode");
        node6.setValue(i10);
        node5.addNode(node6);
        Node node7 = new Node("errorDescription");
        node7.setValue(str);
        node5.addNode(node7);
        z10.addNode(node);
        A(this.f28179g);
    }

    public d(b bVar) {
        super(bVar);
        new q(3, (e) null);
    }
}
