package ze;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import org.cybergarage.xml.Node;
import q.e;
import v6.q;
import we.b;

/* compiled from: Action */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public Node f28848a;

    /* renamed from: b  reason: collision with root package name */
    public Node f28849b;

    /* renamed from: c  reason: collision with root package name */
    public q f28850c = new q(3, (e) null);

    public a(Node node, Node node2) {
        this.f28848a = node;
        this.f28849b = node2;
    }

    public c a(String str) {
        d b10 = b();
        int size = b10.size();
        for (int i10 = 0; i10 < size; i10++) {
            c c10 = b10.c(i10);
            String a10 = c10.a();
            if (a10 != null && str.equals(a10)) {
                return c10;
            }
        }
        return null;
    }

    public d b() {
        d dVar = new d();
        Node node = this.f28849b.getNode("argumentList");
        if (node == null) {
            return dVar;
        }
        int nNodes = node.getNNodes();
        for (int i10 = 0; i10 < nNodes; i10++) {
            Node node2 = node.getNode(i10);
            if ("argument".equals(node2.getName())) {
                dVar.add(new c(this.f28848a, node2));
            }
        }
        return dVar;
    }

    public String c() {
        return this.f28849b.getNodeValue("name");
    }

    /* JADX WARNING: type inference failed for: r2v12, types: [java.util.Set<cb.e>, org.cybergarage.xml.Node] */
    public boolean d() {
        d b10 = b();
        d b11 = b();
        int size = b11.size();
        d dVar = new d();
        for (int i10 = 0; i10 < size; i10++) {
            c c10 = b11.c(i10);
            if (c10.c()) {
                dVar.add(c10);
            }
        }
        af.a aVar = new af.a();
        Node node = this.f28848a;
        h hVar = new h(node);
        String nodeValue = node.getNodeValue("controlURL");
        String u10 = hVar.d().u();
        if (u10 != null && u10.length() > 0) {
            try {
                String path = new URL(u10).getPath();
                int length = path.length();
                if (length > 0 && (1 < length || path.charAt(0) != '/')) {
                    nodeValue = path + nodeValue;
                }
            } catch (MalformedURLException unused) {
            }
        }
        aVar.E(nodeValue, true);
        if (!b.c(nodeValue)) {
            nodeValue = "";
        }
        if (nodeValue == null || nodeValue.length() <= 0) {
            nodeValue = hVar.d().u();
        }
        if (nodeValue == null || nodeValue.length() <= 0) {
            nodeValue = hVar.d().j();
        }
        String a10 = b.a(nodeValue);
        int b12 = b.b(nodeValue);
        aVar.t(a10, b12);
        aVar.f27216h = a10;
        aVar.f27217i = b12;
        aVar.f28178l = e.a.c();
        Node G = aVar.G();
        Node F = aVar.F();
        String c11 = c();
        String i11 = hVar.i();
        Node node2 = new Node();
        node2.setName("u", c11);
        node2.setNameSpace("u", i11);
        int size2 = dVar.size();
        for (int i12 = 0; i12 < size2; i12++) {
            c c12 = dVar.c(i12);
            Node node3 = new Node();
            node3.setName(c12.a());
            node3.setValue(c12.b());
            node2.addNode(node3);
        }
        F.addNode(node2);
        aVar.H(G);
        aVar.u("SOAPACTION", "\"" + hVar.i() + "#" + c() + "\"", "\"", "\"");
        ff.a aVar2 = ff.a.f18351b;
        ye.b bVar = new ye.b(aVar.A(aVar.f27216h, aVar.f27217i));
        byte[] bArr = (byte[]) bVar.f13214e;
        if (bArr.length > 0) {
            try {
                bVar.f28179g = e.a.f13500a.parse((InputStream) new ByteArrayInputStream(bArr));
            } catch (Exception e10) {
                ff.a.b(e10);
            }
        }
        af.b bVar2 = new af.b(bVar);
        ff.a aVar3 = ff.a.f18351b;
        ? r22 = this.f28849b;
        if (((ef.a) r22.getUserData()) == null) {
            ef.a aVar4 = new ef.a();
            r22.setUserData(aVar4);
            aVar4.f4374b = r22;
        }
        int w10 = bVar2.w();
        String b13 = q.b(w10);
        q qVar = this.f28850c;
        qVar.f26491b = w10;
        qVar.f26492c = b13;
        if (!bVar2.y()) {
            return false;
        }
        d dVar2 = new d();
        Node z10 = bVar2.z();
        Node node4 = (z10 == null || !z10.hasNodes()) ? null : z10.getNode(0);
        if (node4 != null) {
            int nNodes = node4.getNNodes();
            for (int i13 = 0; i13 < nNodes; i13++) {
                Node node5 = node4.getNode(i13);
                dVar2.add(new c(node5.getName(), node5.getValue()));
            }
        }
        try {
            b10.j(dVar2);
            return true;
        } catch (IllegalArgumentException unused2) {
            q qVar2 = this.f28850c;
            qVar2.f26491b = 402;
            qVar2.f26492c = "Action succesfully delivered but invalid arguments returned.";
            return false;
        }
    }

    public void e(String str, int i10) {
        String num = Integer.toString(i10);
        c a10 = a(str);
        if (a10 != null) {
            a10.e(num);
        }
    }
}
