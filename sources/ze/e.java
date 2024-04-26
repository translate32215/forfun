package ze;

import androidx.leanback.widget.t;
import bf.b;
import cf.g;
import df.c;
import df.f;
import ff.a;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.ServerSocket;
import java.net.URL;
import org.cybergarage.xml.Node;
import org.cybergarage.xml.NodeList;
import org.cybergarage.xml.ParserException;
import q.h;
import we.d;
import we.i;

/* compiled from: ControlPoint */
public class e implements we.e {

    /* renamed from: a  reason: collision with root package name */
    public c f28852a;

    /* renamed from: b  reason: collision with root package name */
    public f f28853b;

    /* renamed from: c  reason: collision with root package name */
    public int f28854c;

    /* renamed from: d  reason: collision with root package name */
    public int f28855d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f28856e;

    /* renamed from: f  reason: collision with root package name */
    public NodeList f28857f;

    /* renamed from: g  reason: collision with root package name */
    public b f28858g;

    /* renamed from: h  reason: collision with root package name */
    public long f28859h;

    /* renamed from: i  reason: collision with root package name */
    public j f28860i;

    /* renamed from: j  reason: collision with root package name */
    public j f28861j;

    /* renamed from: k  reason: collision with root package name */
    public j f28862k;

    /* renamed from: l  reason: collision with root package name */
    public i f28863l;

    /* renamed from: m  reason: collision with root package name */
    public j f28864m;

    /* renamed from: n  reason: collision with root package name */
    public String f28865n;

    /* renamed from: o  reason: collision with root package name */
    public af.f f28866o;

    public e() {
        this.f28854c = 0;
        this.f28855d = 0;
        this.f28857f = new NodeList();
        this.f28860i = new j(1);
        this.f28861j = new j(1);
        this.f28862k = new j(1);
        this.f28863l = new i();
        this.f28864m = new j(1);
        this.f28865n = "/evetSub";
        this.f28852a = new c((InetAddress[]) null);
        this.f28853b = new f((InetAddress[]) null);
        this.f28854c = 8008;
        this.f28855d = 8058;
        this.f28858g = null;
        this.f28859h = 60;
        this.f28866o = null;
        this.f28856e = false;
        this.f28866o = null;
    }

    public void a(d dVar) {
        String str;
        d dVar2 = dVar;
        a aVar = a.f18351b;
        if (dVar2.z("NOTIFY")) {
            cf.b bVar = new cf.b(dVar2);
            we.c e10 = bVar.e("SID");
            if (e10 == null) {
                str = "";
            } else {
                str = e10.f27213b;
            }
            String a10 = x.f.a(str);
            long g10 = bVar.g("SEQ");
            cf.d dVar3 = new cf.d();
            Node G = bVar.G();
            for (int i10 = 0; i10 < G.getNNodes(); i10++) {
                Node node = G.getNode(i10);
                if (node != null) {
                    Node node2 = node.getNode(0);
                    cf.c cVar = new cf.c();
                    if (node2 != null) {
                        String name = node2.getName();
                        int lastIndexOf = name.lastIndexOf(58);
                        if (lastIndexOf != -1) {
                            name = name.substring(lastIndexOf + 1);
                        }
                        if (name == null) {
                            name = "";
                        }
                        cVar.f4398a = name;
                        String value = node2.getValue();
                        if (value == null) {
                            value = "";
                        }
                        cVar.f4399b = value;
                    }
                    dVar3.add(cVar);
                }
            }
            int size = dVar3.size();
            for (int i11 = 0; i11 < size; i11++) {
                cf.c cVar2 = (cf.c) dVar3.get(i11);
                String str2 = cVar2.f4398a;
                String str3 = cVar2.f4399b;
                int size2 = this.f28864m.size();
                int i12 = 0;
                while (i12 < size2) {
                    ((cf.a) this.f28864m.get(i12)).a(a10, g10, str2, str3);
                    i12++;
                    size2 = size2;
                    str2 = str2;
                }
            }
            dVar2.D(200);
            return;
        }
        dVar.C();
    }

    public final synchronized void b(t tVar) {
        if (tVar.d()) {
            f c10 = c(h.c(tVar.b()));
            if (c10 != null) {
                c10.f().f17852g = tVar;
                return;
            }
            try {
                Node parse = l.c().parse(new URL(we.c.a(tVar.a(), "Location")));
                f d10 = d(parse);
                if (d10 != null) {
                    d10.f().f17852g = tVar;
                    this.f28857f.add(parse);
                    f(d10);
                }
            } catch (MalformedURLException e10) {
                a.c(tVar.toString());
                a.b(e10);
            } catch (ParserException e11) {
                a.c(tVar.toString());
                a.b(e11);
            }
        }
    }

    public f c(String str) {
        int size = this.f28857f.size();
        for (int i10 = 0; i10 < size; i10++) {
            f d10 = d(this.f28857f.getNode(i10));
            if (d10 != null) {
                if (d10.w(str)) {
                    return d10;
                }
                f d11 = d10.d(str);
                if (d11 != null) {
                    return d11;
                }
            }
        }
        return null;
    }

    public final f d(Node node) {
        Node node2;
        if (node == null || (node2 = node.getNode("device")) == null) {
            return null;
        }
        return new f(node, node2);
    }

    public g e() {
        g gVar = new g();
        int size = this.f28857f.size();
        for (int i10 = 0; i10 < size; i10++) {
            f d10 = d(this.f28857f.getNode(i10));
            if (d10 != null) {
                gVar.add(d10);
            }
        }
        return gVar;
    }

    public void f(f fVar) {
        int size = this.f28862k.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((bf.a) this.f28862k.get(i10)).a(fVar);
        }
    }

    public void finalize() {
        k();
    }

    public void g(f fVar) {
        if (fVar != null) {
            Node l10 = fVar.l();
            f d10 = d(l10);
            if (d10 != null && d10.x()) {
                int size = this.f28862k.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((bf.a) this.f28862k.get(i10)).b(d10);
                }
            }
            this.f28857f.remove(l10);
        }
    }

    public void h(f fVar, long j10) {
        String str;
        String str2;
        i r10 = fVar.r();
        int size = r10.size();
        for (int i10 = 0; i10 < size; i10++) {
            h c10 = r10.c(i10);
            if (c10.m() && !l(c10, c10.f(), j10)) {
                if (c10.m()) {
                    l(c10, c10.f(), j10);
                } else {
                    f d10 = c10.d();
                    if (d10 != null) {
                        t m10 = d10.m();
                        String str3 = "";
                        if (m10 == null) {
                            str = str3;
                        } else {
                            str = (String) m10.f2526c;
                        }
                        g gVar = new g();
                        String b10 = xe.a.b(str, this.f28855d, this.f28865n);
                        gVar.f27214f = "SUBSCRIBE";
                        gVar.I(c10);
                        gVar.u("CALLBACK", b10, "<", ">");
                        gVar.s("NT", "upnp:event");
                        gVar.s("TIMEOUT", x.f.d(j10));
                        cf.h H = gVar.H();
                        if (H.y()) {
                            we.c e10 = H.e("SID");
                            if (e10 == null) {
                                str2 = str3;
                            } else {
                                str2 = e10.f27213b;
                            }
                            c10.p(x.f.a(str2));
                            we.c e11 = H.e("TIMEOUT");
                            if (e11 != null) {
                                str3 = e11.f27213b;
                            }
                            x.f.b(str3);
                            c10.g();
                        } else {
                            c10.a();
                        }
                    }
                }
            }
        }
        g g10 = fVar.g();
        int size2 = g10.size();
        for (int i11 = 0; i11 < size2; i11++) {
            h(g10.c(i11), j10);
        }
    }

    public void i(String str, int i10) {
        df.d dVar = new df.d(str, i10);
        f fVar = this.f28853b;
        int size = fVar.size();
        for (int i11 = 0; i11 < size; i11++) {
            df.e f10 = fVar.f(i11);
            String b10 = f10.b();
            String str2 = "239.255.255.250";
            dVar.t(xe.a.d(b10) ? df.a.f13488a : str2, 1900);
            if (xe.a.d(b10)) {
                str2 = df.a.f13488a;
            }
            String dVar2 = dVar.toString();
            try {
                f10.f13495a.send(new DatagramPacket(dVar2.getBytes(), dVar2.length(), InetAddress.getByName(str2), 1900));
            } catch (Exception e10) {
                a.c("addr = " + f10.f13495a.getLocalAddress().getHostName());
                a.c("port = " + f10.f13495a.getLocalPort());
                a.b(e10);
            }
        }
    }

    public boolean j() {
        String[] strArr;
        String[] strArr2;
        boolean z10;
        k();
        int i10 = this.f28855d;
        i iVar = this.f28863l;
        int i11 = 0;
        while (true) {
            iVar.f27226a = i10;
            int c10 = xe.a.c();
            String[] strArr3 = new String[c10];
            for (int i12 = 0; i12 < c10; i12++) {
                strArr3[i12] = xe.a.a(i12);
            }
            int i13 = 0;
            int i14 = 0;
            while (true) {
                boolean z11 = true;
                if (i13 >= c10) {
                    break;
                }
                we.h hVar = new we.h();
                if (strArr3[i13] != null) {
                    String str = strArr3[i13];
                    int i15 = iVar.f27226a;
                    if (hVar.f27221a == null) {
                        try {
                            hVar.f27222b = InetAddress.getByName(str);
                            hVar.f27223c = i15;
                            hVar.f27221a = new ServerSocket(hVar.f27223c, 0, hVar.f27222b);
                        } catch (IOException unused) {
                            z11 = false;
                        }
                    }
                    if (z11) {
                        iVar.add(hVar);
                        i14++;
                        i13++;
                    }
                }
                iVar.c();
                iVar.clear();
                i13++;
            }
            if (i14 != 0) {
                int size = iVar.size();
                for (int i16 = 0; i16 < size; i16++) {
                    iVar.f(i16).f27224d.add(this);
                }
                int size2 = iVar.size();
                for (int i17 = 0; i17 < size2; i17++) {
                    we.h f10 = iVar.f(i17);
                    StringBuffer stringBuffer = new StringBuffer("Cyber.HTTPServer/");
                    stringBuffer.append(f10.f27221a.getLocalSocketAddress());
                    Thread thread = new Thread(f10, stringBuffer.toString());
                    f10.f27225e = thread;
                    thread.start();
                }
                c cVar = this.f28852a;
                InetAddress[] inetAddressArr = cVar.f13494a;
                if (inetAddressArr != null) {
                    strArr = new String[inetAddressArr.length];
                    for (int i18 = 0; i18 < inetAddressArr.length; i18++) {
                        strArr[i18] = inetAddressArr[i18].getHostAddress();
                    }
                } else {
                    int c11 = xe.a.c();
                    String[] strArr4 = new String[c11];
                    for (int i19 = 0; i19 < c11; i19++) {
                        strArr4[i19] = xe.a.a(i19);
                    }
                    strArr = strArr4;
                }
                for (int i20 = 0; i20 < strArr.length; i20++) {
                    if (strArr[i20] != null) {
                        cVar.add(new df.b(strArr[i20]));
                    }
                }
                int size3 = cVar.size();
                for (int i21 = 0; i21 < size3; i21++) {
                    cVar.c(i21).f13492d = this;
                }
                int size4 = cVar.size();
                for (int i22 = 0; i22 < size4; i22++) {
                    df.b c12 = cVar.c(i22);
                    StringBuffer stringBuffer2 = new StringBuffer("Cyber.SSDPNotifySocket/");
                    String b10 = c12.b();
                    if (b10 != null && b10.length() > 0) {
                        stringBuffer2.append(c12.b());
                        stringBuffer2.append(':');
                        stringBuffer2.append(c12.f13490b.getLocalPort());
                        stringBuffer2.append(" -> ");
                        stringBuffer2.append(c12.f13489a.getAddress().getHostAddress());
                        stringBuffer2.append(':');
                        stringBuffer2.append(c12.f13489a.getPort());
                    }
                    Thread thread2 = new Thread(c12, stringBuffer2.toString());
                    c12.f13493e = thread2;
                    thread2.start();
                }
                int i23 = this.f28854c;
                f fVar = this.f28853b;
                int i24 = i23;
                int i25 = 0;
                while (true) {
                    InetAddress[] inetAddressArr2 = fVar.f13499a;
                    if (inetAddressArr2 != null) {
                        strArr2 = new String[inetAddressArr2.length];
                        for (int i26 = 0; i26 < inetAddressArr2.length; i26++) {
                            strArr2[i26] = inetAddressArr2[i26].getHostAddress();
                        }
                    } else {
                        int c13 = xe.a.c();
                        String[] strArr5 = new String[c13];
                        for (int i27 = 0; i27 < c13; i27++) {
                            strArr5[i27] = xe.a.a(i27);
                        }
                        strArr2 = strArr5;
                    }
                    int i28 = 0;
                    while (i28 < strArr2.length) {
                        try {
                            fVar.add(new df.e(strArr2[i28], i24));
                            i28++;
                        } catch (Exception unused2) {
                            fVar.h();
                            fVar.c();
                            fVar.clear();
                            z10 = false;
                        }
                    }
                    z10 = true;
                    if (z10) {
                        int size5 = fVar.size();
                        for (int i29 = 0; i29 < size5; i29++) {
                            fVar.f(i29).f13497c = this;
                        }
                        int size6 = fVar.size();
                        for (int i30 = 0; i30 < size6; i30++) {
                            df.e f11 = fVar.f(i30);
                            StringBuffer stringBuffer3 = new StringBuffer("Cyber.SSDPSearchResponseSocket/");
                            DatagramSocket datagramSocket = f11.f13495a;
                            if (datagramSocket.getLocalAddress() != null) {
                                stringBuffer3.append(datagramSocket.getLocalAddress());
                                stringBuffer3.append(':');
                                stringBuffer3.append(datagramSocket.getLocalPort());
                            }
                            Thread thread3 = new Thread(f11, stringBuffer3.toString());
                            f11.f13498d = thread3;
                            thread3.start();
                        }
                        i("upnp:rootdevice", 3);
                        b bVar = new b(this);
                        this.f28858g = bVar;
                        if (((Thread) bVar.f16370b) == null) {
                            Thread thread4 = new Thread(bVar, "Cyber.ThreadCore");
                            bVar.f16370b = thread4;
                            thread4.start();
                        }
                        if (this.f28856e) {
                            af.f fVar2 = new af.f(this);
                            this.f28866o = fVar2;
                            if (((Thread) fVar2.f16370b) == null) {
                                Thread thread5 = new Thread(fVar2, "Cyber.ThreadCore");
                                fVar2.f16370b = thread5;
                                thread5.start();
                            }
                        }
                        return true;
                    }
                    i25++;
                    if (100 < i25) {
                        return false;
                    }
                    i24++;
                    this.f28854c = i24;
                }
            } else {
                i11++;
                if (100 < i11) {
                    return false;
                }
                i10++;
                this.f28855d = i10;
            }
        }
    }

    public boolean k() {
        g e10 = e();
        int size = e10.size();
        for (int i10 = 0; i10 < size; i10++) {
            m(e10.c(i10));
        }
        c cVar = this.f28852a;
        int size2 = cVar.size();
        for (int i11 = 0; i11 < size2; i11++) {
            df.b c10 = cVar.c(i11);
            c10.a();
            c10.f13493e = null;
        }
        int size3 = cVar.size();
        for (int i12 = 0; i12 < size3; i12++) {
            cVar.c(i12).a();
        }
        cVar.clear();
        cVar.clear();
        f fVar = this.f28853b;
        fVar.h();
        fVar.c();
        fVar.clear();
        i iVar = this.f28863l;
        int size4 = iVar.size();
        for (int i13 = 0; i13 < size4; i13++) {
            iVar.f(i13).f27225e = null;
        }
        iVar.c();
        iVar.clear();
        b bVar = this.f28858g;
        if (bVar != null) {
            Thread thread = (Thread) bVar.f16370b;
            if (thread != null) {
                thread.interrupt();
                bVar.f16370b = null;
            }
            this.f28858g = null;
        }
        af.f fVar2 = this.f28866o;
        if (fVar2 == null) {
            return true;
        }
        Thread thread2 = (Thread) fVar2.f16370b;
        if (thread2 != null) {
            thread2.interrupt();
            fVar2.f16370b = null;
        }
        this.f28866o = null;
        return true;
    }

    public boolean l(h hVar, String str, long j10) {
        String str2;
        g gVar = new g();
        gVar.f27214f = "SUBSCRIBE";
        gVar.I(hVar);
        gVar.s("SID", x.f.c(str));
        gVar.s("TIMEOUT", x.f.d(j10));
        a aVar = a.f18351b;
        cf.h H = gVar.H();
        if (H.y()) {
            we.c e10 = H.e("SID");
            String str3 = "";
            if (e10 == null) {
                str2 = str3;
            } else {
                str2 = e10.f27213b;
            }
            hVar.p(x.f.a(str2));
            we.c e11 = H.e("TIMEOUT");
            if (e11 != null) {
                str3 = e11.f27213b;
            }
            x.f.b(str3);
            hVar.g();
            return true;
        }
        hVar.a();
        return false;
    }

    public void m(f fVar) {
        i r10 = fVar.r();
        int size = r10.size();
        for (int i10 = 0; i10 < size; i10++) {
            h c10 = r10.c(i10);
            if (c10.m()) {
                g gVar = new g();
                gVar.f27214f = "UNSUBSCRIBE";
                gVar.I(c10);
                gVar.s("SID", x.f.c(c10.f()));
                if (gVar.H().y()) {
                    c10.a();
                }
            }
        }
        g g10 = fVar.g();
        int size2 = g10.size();
        for (int i11 = 0; i11 < size2; i11++) {
            m(g10.c(i11));
        }
    }
}
