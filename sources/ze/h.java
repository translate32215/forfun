package ze;

import cf.e;
import cf.f;
import ef.d;
import ff.a;
import java.io.File;
import java.net.URL;
import org.cybergarage.xml.Node;
import org.cybergarage.xml.ParserException;
import we.b;

/* compiled from: Service */
public class h {

    /* renamed from: a  reason: collision with root package name */
    public Node f28869a;

    public h() {
        this.f28869a = new Node("service");
        Node node = new Node("specVersion");
        Node node2 = new Node("major");
        node2.setValue("1");
        node.addNode(node2);
        Node node3 = new Node("minor");
        node3.setValue("0");
        node.addNode(node3);
        Node node4 = new Node("scpd");
        node4.addAttribute("xmlns", "urn:schemas-upnp-org:service-1-0");
        node4.addNode(node);
        g().f17853d = node4;
    }

    public void a() {
        g().f17855f = "";
        g();
    }

    public a b(String str) {
        Node node;
        b bVar = new b();
        Node e10 = e();
        if (!(e10 == null || (node = e10.getNode("actionList")) == null)) {
            int nNodes = node.getNNodes();
            for (int i10 = 0; i10 < nNodes; i10++) {
                Node node2 = node.getNode(i10);
                if ("action".equals(node2.getName())) {
                    bVar.add(new a(this.f28869a, node2));
                }
            }
        }
        int size = bVar.size();
        for (int i11 = 0; i11 < size; i11++) {
            a aVar = (a) bVar.get(i11);
            String c10 = aVar.c();
            if (c10 != null && c10.equals(str)) {
                return aVar;
            }
        }
        return null;
    }

    public f c() {
        Node node;
        Node rootNode = this.f28869a.getRootNode();
        Node parentNode = this.f28869a.getParentNode();
        if (parentNode == null) {
            node = null;
        } else {
            node = parentNode.getParentNode();
        }
        return new f(rootNode, node);
    }

    public f d() {
        return c().k();
    }

    public final Node e() {
        d g10 = g();
        Node node = g10.f17853d;
        if (node != null) {
            return node;
        }
        f d10 = d();
        if (d10 == null) {
            return null;
        }
        String nodeValue = this.f28869a.getNodeValue("SCPDURL");
        d10.f();
        File file = new File("".concat(nodeValue));
        if (file.exists()) {
            try {
                node = l.c().parse(file);
            } catch (ParserException e10) {
                e10.printStackTrace();
            }
            if (node != null) {
                g10.f17853d = node;
                return node;
            }
        }
        try {
            Node parse = l.c().parse(new URL(d10.b(nodeValue)));
            if (parse != null) {
                g10.f17853d = parse;
                return parse;
            }
        } catch (Exception unused) {
        }
        d10.f();
        try {
            return l.c().parse(new File("" + b.d(nodeValue)));
        } catch (Exception e11) {
            a.b(e11);
            return null;
        }
    }

    public String f() {
        return g().f17855f;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.Set<cb.e>, org.cybergarage.xml.Node] */
    public final d g() {
        ? r02 = this.f28869a;
        d dVar = (d) r02.getUserData();
        if (dVar != null) {
            return dVar;
        }
        d dVar2 = new d();
        r02.setUserData(dVar2);
        dVar2.f4374b = r02;
        return dVar2;
    }

    public j h() {
        j jVar = new j(0);
        Node node = e().getNode("serviceStateTable");
        if (node == null) {
            return jVar;
        }
        Node node2 = this.f28869a;
        int nNodes = node.getNNodes();
        for (int i10 = 0; i10 < nNodes; i10++) {
            Node node3 = node.getNode(i10);
            if ("stateVariable".equals(node3.getName())) {
                jVar.add(new k(node2, node3));
            }
        }
        return jVar;
    }

    public String i() {
        return this.f28869a.getNodeValue("serviceType");
    }

    public k j(String str) {
        j h10 = h();
        int size = h10.size();
        for (int i10 = 0; i10 < size; i10++) {
            k kVar = (k) h10.get(i10);
            String j10 = kVar.j();
            if (j10 != null && j10.equals(str)) {
                return kVar;
            }
        }
        return null;
    }

    public e k(String str) {
        String str2;
        f l10 = l();
        int size = l10.size();
        for (int i10 = 0; i10 < size; i10++) {
            e c10 = l10.c(i10);
            if (c10 != null && (str2 = c10.f4400a) != null && str2.equals(str)) {
                return c10;
            }
        }
        return null;
    }

    public f l() {
        return g().f17854e;
    }

    public boolean m() {
        String f10 = f();
        return f10 != null && f10.length() > 0;
    }

    public final boolean n(String str, String str2) {
        return (str == null || str2 == null || (!str2.equals(str) && !str2.equals(b.e(str, false)))) ? false : true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00e9 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void o(ze.k r17) {
        /*
            r16 = this;
            cf.f r0 = r16.l()
            int r1 = r0.size()
            cf.e[] r2 = new cf.e[r1]
            r3 = 0
            r4 = 0
        L_0x000c:
            if (r4 < r1) goto L_0x00ed
            r4 = 0
        L_0x000f:
            if (r4 < r1) goto L_0x00c0
            int r5 = r0.size()
            cf.e[] r6 = new cf.e[r5]
            r1 = 0
        L_0x0018:
            if (r1 < r5) goto L_0x00b6
        L_0x001a:
            if (r3 < r5) goto L_0x001d
            return
        L_0x001d:
            r0 = r6[r3]
            if (r0 != 0) goto L_0x0023
            goto L_0x00b2
        L_0x0023:
            java.lang.String r1 = r17.j()
            java.lang.String r2 = r17.l()
            java.lang.String r4 = r0.f4402c
            int r7 = r0.f4404e
            cf.b r8 = new cf.b
            r8.<init>()
            java.lang.String r9 = r0.f4400a
            long r10 = r0.f4407h
            java.lang.String r12 = r0.f4402c
            java.lang.String r13 = r0.f4403d
            int r14 = r0.f4404e
            java.lang.String r15 = "NOTIFY"
            r8.f27214f = r15
            r8.f27215g = r13
            r8.t(r12, r14)
            java.lang.String r12 = "NT"
            java.lang.String r13 = "upnp:event"
            r8.s(r12, r13)
            java.lang.String r12 = "NTS"
            java.lang.String r13 = "upnp:propchange"
            r8.s(r12, r13)
            java.lang.String r9 = x.f.c(r9)
            java.lang.String r12 = "SID"
            r8.s(r12, r9)
            java.lang.String r9 = java.lang.Long.toString(r10)
            java.lang.String r10 = "SEQ"
            r8.s(r10, r9)
            java.lang.String r9 = "Content-Type"
            java.lang.String r10 = "text/xml; charset=\"utf-8\""
            r8.s(r9, r10)
            org.cybergarage.xml.Node r9 = new org.cybergarage.xml.Node
            java.lang.String r10 = "propertyset"
            r9.<init>(r10)
            java.lang.String r10 = "e"
            java.lang.String r11 = "urn:schemas-upnp-org:event-1-0"
            r9.setNameSpace(r10, r11)
            org.cybergarage.xml.Node r10 = new org.cybergarage.xml.Node
            java.lang.String r11 = "property"
            r10.<init>(r11)
            r9.addNode(r10)
            org.cybergarage.xml.Node r11 = new org.cybergarage.xml.Node
            r11.<init>(r1)
            r11.setValue((java.lang.String) r2)
            r10.addNode(r11)
            r8.H(r9)
            we.f r1 = r8.A(r4, r7)
            boolean r1 = r1.y()
            if (r1 != 0) goto L_0x009f
            goto L_0x00b2
        L_0x009f:
            long r1 = r0.f4407h
            r7 = 1
            r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r4 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r4 != 0) goto L_0x00af
            r0.f4407h = r7
            goto L_0x00b2
        L_0x00af:
            long r1 = r1 + r7
            r0.f4407h = r1
        L_0x00b2:
            int r3 = r3 + 1
            goto L_0x001a
        L_0x00b6:
            cf.e r2 = r0.c(r1)
            r6[r1] = r2
            int r1 = r1 + 1
            goto L_0x0018
        L_0x00c0:
            r5 = r2[r4]
            if (r5 != 0) goto L_0x00c5
            goto L_0x00e9
        L_0x00c5:
            long r6 = java.lang.System.currentTimeMillis()
            long r8 = r5.f4405f
            r10 = -1
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 != 0) goto L_0x00d2
            goto L_0x00df
        L_0x00d2:
            long r10 = r5.f4406g
            r12 = 1000(0x3e8, double:4.94E-321)
            long r8 = r8 * r12
            long r8 = r8 + r10
            int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r10 >= 0) goto L_0x00df
            r6 = 1
            goto L_0x00e0
        L_0x00df:
            r6 = 0
        L_0x00e0:
            if (r6 == 0) goto L_0x00e9
            cf.f r6 = r16.l()
            r6.remove(r5)
        L_0x00e9:
            int r4 = r4 + 1
            goto L_0x000f
        L_0x00ed:
            cf.e r5 = r0.c(r4)
            r2[r4] = r5
            int r4 = r4 + 1
            goto L_0x000c
        */
        throw new UnsupportedOperationException("Method not decompiled: ze.h.o(ze.k):void");
    }

    public void p(String str) {
        g().f17855f = str;
    }

    public h(Node node) {
        this.f28869a = node;
    }
}
