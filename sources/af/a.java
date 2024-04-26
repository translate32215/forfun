package af;

import org.cybergarage.xml.Node;
import we.d;

/* compiled from: ActionRequest */
public class a extends c {
    public a() {
    }

    public Node I() {
        Node F = F();
        if (F != null && F.hasNodes()) {
            return F.getNode(0);
        }
        return null;
    }

    public a(d dVar) {
        m(dVar);
        this.f27218j = dVar.f27218j;
    }
}
