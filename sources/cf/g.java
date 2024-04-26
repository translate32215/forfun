package cf;

import we.b;
import we.c;
import we.d;
import x.f;
import ze.h;

/* compiled from: SubscriptionRequest */
public class g extends d {
    public g() {
        q(0);
    }

    public String F() {
        String str;
        c e10 = e("SID");
        if (e10 == null) {
            str = "";
        } else {
            str = e10.f27213b;
        }
        String a10 = f.a(str);
        if (a10 == null) {
            return "";
        }
        return a10;
    }

    public boolean G() {
        String i10 = i("CALLBACK", "<", ">");
        return i10 != null && i10.length() > 0;
    }

    public h H() {
        return new h(A(this.f27216h, this.f27217i));
    }

    public final void I(h hVar) {
        ze.f d10;
        ze.f d11;
        String nodeValue = hVar.f28869a.getNodeValue("eventSubURL");
        E(nodeValue, true);
        String u10 = hVar.c().u();
        if ((u10 == null || u10.length() <= 0) && (d11 = hVar.d()) != null) {
            u10 = d11.u();
        }
        if ((u10 == null || u10.length() <= 0) && (d10 = hVar.d()) != null) {
            u10 = d10.j();
        }
        if ((u10 != null && u10.length() > 0) || !b.c(nodeValue)) {
            nodeValue = u10;
        }
        String a10 = b.a(nodeValue);
        int b10 = b.b(nodeValue);
        t(a10, b10);
        this.f27216h = a10;
        this.f27217i = b10;
    }
}
