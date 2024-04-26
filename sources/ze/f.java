package ze;

import af.b;
import androidx.leanback.widget.t;
import cf.g;
import cf.h;
import ef.c;
import java.util.Calendar;
import org.cybergarage.xml.Node;
import v6.q;
import we.e;
import xe.a;

/* compiled from: Device */
public class f implements e {

    /* renamed from: a  reason: collision with root package name */
    public Node f28867a;

    /* renamed from: b  reason: collision with root package name */
    public Node f28868b;

    static {
        Calendar.getInstance();
    }

    public f(Node node, Node node2) {
        this.f28867a = node;
        this.f28868b = node2;
        l.a();
    }

    /* JADX WARNING: type inference failed for: r12v14, types: [java.util.Set<cb.e>, org.cybergarage.xml.Node] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ab  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(we.d r12) {
        /*
            r11 = this;
            ff.a r0 = ff.a.f18351b
            java.lang.String r0 = "GET"
            boolean r0 = r12.z(r0)
            r1 = 0
            r2 = 1
            r3 = 200(0xc8, float:2.8E-43)
            if (r0 != 0) goto L_0x029f
            boolean r0 = r12.y()
            if (r0 == 0) goto L_0x0016
            goto L_0x029f
        L_0x0016:
            java.lang.String r0 = "POST"
            boolean r0 = r12.z(r0)
            java.lang.String r4 = ""
            if (r0 == 0) goto L_0x014c
            java.lang.String r0 = "SOAPACTION"
            we.c r3 = r12.e(r0)
            if (r3 == 0) goto L_0x002a
            r3 = 1
            goto L_0x002b
        L_0x002a:
            r3 = 0
        L_0x002b:
            if (r3 == 0) goto L_0x0148
            java.lang.String r3 = r12.x()
            ze.h r3 = r11.o(r3)
            if (r3 == 0) goto L_0x013b
            af.a r5 = new af.a
            r5.<init>(r12)
            we.c r12 = r5.e(r0)
            if (r12 != 0) goto L_0x0044
            r12 = r4
            goto L_0x0046
        L_0x0044:
            java.lang.String r12 = r12.f27213b
        L_0x0046:
            if (r12 != 0) goto L_0x0049
            goto L_0x005b
        L_0x0049:
            java.lang.String r6 = "urn:schemas-upnp-org:control-1-0#QueryStateVariable"
            boolean r12 = r12.equals(r6)
            if (r12 == 0) goto L_0x0053
            r12 = 1
            goto L_0x0061
        L_0x0053:
            java.lang.String r12 = "\""
            java.lang.String r12 = r5.i(r0, r12, r12)
            if (r12 != 0) goto L_0x005d
        L_0x005b:
            r12 = 0
            goto L_0x0061
        L_0x005d:
            boolean r12 = r12.equals(r6)
        L_0x0061:
            if (r12 == 0) goto L_0x00ab
            af.e r12 = new af.e
            r12.<init>(r5)
            org.cybergarage.xml.Node r0 = r12.F()
            r5 = 0
            if (r0 != 0) goto L_0x0070
            goto L_0x0084
        L_0x0070:
            boolean r6 = r0.hasNodes()
            if (r6 != 0) goto L_0x0077
            goto L_0x0084
        L_0x0077:
            org.cybergarage.xml.Node r0 = r0.getNode((int) r1)
            if (r0 != 0) goto L_0x007e
            goto L_0x0084
        L_0x007e:
            boolean r6 = r0.hasNodes()
            if (r6 != 0) goto L_0x0086
        L_0x0084:
            r0 = r5
            goto L_0x008a
        L_0x0086:
            org.cybergarage.xml.Node r0 = r0.getNode((int) r1)
        L_0x008a:
            if (r0 != 0) goto L_0x008d
            goto L_0x0091
        L_0x008d:
            java.lang.String r4 = r0.getValue()
        L_0x0091:
            ze.k r0 = r3.j(r4)
            if (r0 == 0) goto L_0x0098
            r1 = 1
        L_0x0098:
            if (r1 != 0) goto L_0x009f
            r11.v(r12)
            goto L_0x014b
        L_0x009f:
            ze.k r0 = r11.s(r5, r4)
            r0.k()
            r11.v(r12)
            goto L_0x014b
        L_0x00ab:
            af.a r0 = new af.a
            r0.<init>(r5)
            org.cybergarage.xml.Node r12 = r0.I()
            if (r12 != 0) goto L_0x00b7
            goto L_0x00d0
        L_0x00b7:
            java.lang.String r12 = r12.getName()
            if (r12 != 0) goto L_0x00be
            goto L_0x00d0
        L_0x00be:
            java.lang.String r5 = ":"
            int r5 = r12.indexOf(r5)
            int r5 = r5 + r2
            if (r5 >= 0) goto L_0x00c8
            goto L_0x00d0
        L_0x00c8:
            int r2 = r12.length()
            java.lang.String r4 = r12.substring(r5, r2)
        L_0x00d0:
            ze.a r2 = r3.b(r4)
            if (r2 != 0) goto L_0x00da
            r11.v(r0)
            goto L_0x014b
        L_0x00da:
            ze.d r3 = r2.b()
            org.cybergarage.xml.Node r4 = r0.I()
            int r5 = r4.getNNodes()
            ze.d r6 = new ze.d
            r6.<init>()
        L_0x00eb:
            if (r1 < r5) goto L_0x011a
            r3.h(r6)     // Catch:{ IllegalArgumentException -> 0x0108 }
            org.cybergarage.xml.Node r12 = r2.f28849b
            java.lang.Object r1 = r12.getUserData()
            ef.a r1 = (ef.a) r1
            if (r1 != 0) goto L_0x0104
            ef.a r1 = new ef.a
            r1.<init>()
            r12.setUserData(r1)
            r1.f4374b = r12
        L_0x0104:
            r11.v(r0)
            goto L_0x014b
        L_0x0108:
            af.b r12 = new af.b
            r12.<init>()
            r1 = 402(0x192, float:5.63E-43)
            java.lang.String r2 = v6.q.b(r1)
            r12.B(r1, r2)
            r0.B(r12)
            goto L_0x014b
        L_0x011a:
            ze.c r12 = new ze.c
            r12.<init>()
            org.cybergarage.xml.Node r7 = r4.getNode((int) r1)
            java.lang.String r8 = r7.getName()
            org.cybergarage.xml.Node r9 = r12.f28851a
            java.lang.String r10 = "name"
            r9.setNode(r10, r8)
            java.lang.String r7 = r7.getValue()
            r12.e(r7)
            r6.add(r12)
            int r1 = r1 + 1
            goto L_0x00eb
        L_0x013b:
            ye.b r0 = new ye.b
            r0.<init>()
            r1 = 400(0x190, float:5.6E-43)
            r0.f27220f = r1
            r12.B(r0)
            goto L_0x014b
        L_0x0148:
            r12.C()
        L_0x014b:
            return
        L_0x014c:
            java.lang.String r0 = "SUBSCRIBE"
            boolean r0 = r12.z(r0)
            java.lang.String r5 = "UNSUBSCRIBE"
            if (r0 != 0) goto L_0x0161
            boolean r0 = r12.z(r5)
            if (r0 == 0) goto L_0x015d
            goto L_0x0161
        L_0x015d:
            r12.C()
            return
        L_0x0161:
            cf.g r0 = new cf.g
            r0.<init>()
            r0.m(r12)
            o1.p r12 = r12.f27218j
            r0.f27218j = r12
            java.lang.String r12 = r0.x()
            ze.h r12 = r11.p(r12)
            if (r12 != 0) goto L_0x017c
            r0.C()
            goto L_0x029e
        L_0x017c:
            boolean r6 = r0.G()
            r7 = 412(0x19c, float:5.77E-43)
            if (r6 != 0) goto L_0x0198
            java.lang.String r6 = r0.F()
            int r6 = r6.length()
            if (r6 <= 0) goto L_0x0190
            r6 = 1
            goto L_0x0191
        L_0x0190:
            r6 = 0
        L_0x0191:
            if (r6 != 0) goto L_0x0198
            r11.z(r0, r7)
            goto L_0x029e
        L_0x0198:
            boolean r5 = r0.z(r5)
            if (r5 == 0) goto L_0x01c0
            java.lang.String r1 = r0.F()
            cf.e r1 = r12.k(r1)
            if (r1 != 0) goto L_0x01ad
            r11.z(r0, r7)
            goto L_0x029e
        L_0x01ad:
            cf.f r12 = r12.l()
            r12.remove(r1)
            cf.h r12 = new cf.h
            r12.<init>()
            r12.f27220f = r3
            r0.B(r12)
            goto L_0x029e
        L_0x01c0:
            boolean r5 = r0.G()
            java.lang.String r6 = "SID"
            java.lang.String r8 = "TIMEOUT"
            if (r5 == 0) goto L_0x024e
            java.lang.String r2 = "CALLBACK"
            java.lang.String r5 = "<"
            java.lang.String r9 = ">"
            java.lang.String r2 = r0.i(r2, r5, r9)
            java.net.URL r5 = new java.net.URL     // Catch:{ Exception -> 0x024a }
            r5.<init>(r2)     // Catch:{ Exception -> 0x024a }
            we.c r5 = r0.e(r8)
            if (r5 != 0) goto L_0x01e0
            goto L_0x01e2
        L_0x01e0:
            java.lang.String r4 = r5.f27213b
        L_0x01e2:
            long r4 = x.f.b(r4)
            java.lang.String r7 = ze.l.a()
            cf.e r9 = new cf.e
            r9.<init>()
            r9.f4401b = r2
            java.net.URL r10 = new java.net.URL     // Catch:{ Exception -> 0x0208 }
            r10.<init>(r2)     // Catch:{ Exception -> 0x0208 }
            java.lang.String r2 = r10.getHost()     // Catch:{ Exception -> 0x0208 }
            r9.f4402c = r2     // Catch:{ Exception -> 0x0208 }
            java.lang.String r2 = r10.getPath()     // Catch:{ Exception -> 0x0208 }
            r9.f4403d = r2     // Catch:{ Exception -> 0x0208 }
            int r2 = r10.getPort()     // Catch:{ Exception -> 0x0208 }
            r9.f4404e = r2     // Catch:{ Exception -> 0x0208 }
        L_0x0208:
            r9.f4405f = r4
            r9.f4400a = r7
            cf.f r2 = r12.l()
            r2.add(r9)
            cf.h r2 = new cf.h
            r2.<init>()
            r2.f27220f = r3
            java.lang.String r3 = x.f.c(r7)
            r2.s(r6, r3)
            java.lang.String r3 = x.f.d(r4)
            r2.s(r8, r3)
            ff.a r3 = ff.a.f18351b
            r0.B(r2)
            ze.j r2 = r12.h()
            int r3 = r2.size()
        L_0x0235:
            if (r1 < r3) goto L_0x0238
            goto L_0x029e
        L_0x0238:
            java.lang.Object r0 = r2.get(r1)
            ze.k r0 = (ze.k) r0
            boolean r4 = r0.m()
            if (r4 == 0) goto L_0x0247
            r12.o(r0)
        L_0x0247:
            int r1 = r1 + 1
            goto L_0x0235
        L_0x024a:
            r11.z(r0, r7)
            goto L_0x029e
        L_0x024e:
            java.lang.String r5 = r0.F()
            int r5 = r5.length()
            if (r5 <= 0) goto L_0x0259
            goto L_0x025a
        L_0x0259:
            r2 = 0
        L_0x025a:
            if (r2 == 0) goto L_0x029b
            java.lang.String r2 = r0.F()
            cf.e r12 = r12.k(r2)
            if (r12 != 0) goto L_0x026a
            r11.z(r0, r7)
            goto L_0x029e
        L_0x026a:
            we.c r5 = r0.e(r8)
            if (r5 != 0) goto L_0x0271
            goto L_0x0273
        L_0x0271:
            java.lang.String r4 = r5.f27213b
        L_0x0273:
            long r4 = x.f.b(r4)
            r12.f4405f = r4
            long r9 = java.lang.System.currentTimeMillis()
            r12.f4406g = r9
            long r9 = (long) r1
            r12.f4407h = r9
            cf.h r12 = new cf.h
            r12.<init>()
            r12.f27220f = r3
            java.lang.String r1 = x.f.c(r2)
            r12.s(r6, r1)
            java.lang.String r1 = x.f.d(r4)
            r12.s(r8, r1)
            r0.B(r12)
            goto L_0x029e
        L_0x029b:
            r11.z(r0, r7)
        L_0x029e:
            return
        L_0x029f:
            java.lang.String r0 = r12.x()
            if (r0 != 0) goto L_0x02aa
            r12.C()
            goto L_0x0344
        L_0x02aa:
            r11.f()
            ze.f r4 = r11.e(r0)
            if (r4 == 0) goto L_0x02c6
            o1.p r5 = r12.f27218j
            java.lang.Object r5 = r5.f22795b
            java.net.Socket r5 = (java.net.Socket) r5
            java.net.InetAddress r5 = r5.getLocalAddress()
            java.lang.String r5 = r5.getHostAddress()
            byte[] r4 = r4.c(r5)
            goto L_0x0312
        L_0x02c6:
            ze.h r4 = r11.q(r0)
            if (r4 == 0) goto L_0x0341
            org.cybergarage.xml.Node r4 = r4.e()
            if (r4 != 0) goto L_0x02d5
            byte[] r4 = new byte[r1]
            goto L_0x0312
        L_0x02d5:
            java.lang.String r5 = new java.lang.String
            r5.<init>()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r5)
            java.lang.String r5 = "<?xml version=\"1.0\" encoding=\"utf-8\"?>"
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r6.<init>(r5)
            java.lang.String r5 = "\n"
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r6.<init>(r5)
            java.lang.String r4 = r4.toString()
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            byte[] r4 = r4.getBytes()
        L_0x0312:
            we.f r5 = new we.f
            r5.<init>()
            int r6 = r0.length()
            if (r6 > 0) goto L_0x031e
            r2 = 0
        L_0x031e:
            if (r2 != 0) goto L_0x0321
            goto L_0x032b
        L_0x0321:
            java.lang.String r0 = r0.toLowerCase()
            java.lang.String r1 = "xml"
            boolean r1 = r0.endsWith(r1)
        L_0x032b:
            if (r1 == 0) goto L_0x0334
            java.lang.String r0 = "Content-Type"
            java.lang.String r1 = "text/xml; charset=\"utf-8\""
            r5.s(r0, r1)
        L_0x0334:
            r5.f27220f = r3
            r5.f13214e = r4
            int r0 = r4.length
            long r0 = (long) r0
            r5.q(r0)
            r12.B(r5)
            goto L_0x0344
        L_0x0341:
            r12.C()
        L_0x0344:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ze.f.a(we.d):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:14|15|18|19|20) */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r1 = new java.net.URL(r2);
        r7 = java.lang.String.valueOf(r1.getProtocol()) + "://" + r1.getHost() + ":" + r1.getPort() + we.b.d(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0091, code lost:
        r7 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x009b, code lost:
        return new java.net.URL(r7).toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x009c, code lost:
        return "";
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x005d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String b(java.lang.String r7) {
        /*
            r6 = this;
            java.lang.String r0 = ""
            java.net.URL r1 = new java.net.URL     // Catch:{ Exception -> 0x000c }
            r1.<init>(r7)     // Catch:{ Exception -> 0x000c }
            java.lang.String r7 = r1.toString()     // Catch:{ Exception -> 0x000c }
            return r7
        L_0x000c:
            ze.f r1 = r6.k()
            java.lang.String r2 = r1.u()
            java.lang.String r3 = ":"
            if (r2 == 0) goto L_0x001f
            int r4 = r2.length()
            if (r4 > 0) goto L_0x003f
        L_0x001f:
            java.lang.String r1 = r1.j()
            java.lang.String r2 = we.b.a(r1)
            int r1 = we.b.b(r1)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "http://"
            r4.<init>(r5)
            r4.append(r2)
            r4.append(r3)
            r4.append(r1)
            java.lang.String r2 = r4.toString()
        L_0x003f:
            java.lang.String r7 = we.b.d(r7)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = java.lang.String.valueOf(r2)
            r1.<init>(r4)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            java.net.URL r4 = new java.net.URL     // Catch:{ Exception -> 0x005d }
            r4.<init>(r1)     // Catch:{ Exception -> 0x005d }
            java.lang.String r7 = r4.toString()     // Catch:{ Exception -> 0x005d }
            return r7
        L_0x005d:
            java.net.URL r1 = new java.net.URL     // Catch:{ Exception -> 0x0091 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x0091 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0091 }
            java.lang.String r4 = r1.getProtocol()     // Catch:{ Exception -> 0x0091 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x0091 }
            r2.<init>(r4)     // Catch:{ Exception -> 0x0091 }
            java.lang.String r4 = "://"
            r2.append(r4)     // Catch:{ Exception -> 0x0091 }
            java.lang.String r4 = r1.getHost()     // Catch:{ Exception -> 0x0091 }
            r2.append(r4)     // Catch:{ Exception -> 0x0091 }
            r2.append(r3)     // Catch:{ Exception -> 0x0091 }
            int r1 = r1.getPort()     // Catch:{ Exception -> 0x0091 }
            r2.append(r1)     // Catch:{ Exception -> 0x0091 }
            java.lang.String r7 = we.b.d(r7)     // Catch:{ Exception -> 0x0091 }
            r2.append(r7)     // Catch:{ Exception -> 0x0091 }
            java.lang.String r7 = r2.toString()     // Catch:{ Exception -> 0x0091 }
            goto L_0x0092
        L_0x0091:
            r7 = r0
        L_0x0092:
            java.net.URL r1 = new java.net.URL     // Catch:{ Exception -> 0x009c }
            r1.<init>(r7)     // Catch:{ Exception -> 0x009c }
            java.lang.String r7 = r1.toString()     // Catch:{ Exception -> 0x009c }
            return r7
        L_0x009c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ze.f.b(java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0014  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x001d  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0021 A[SYNTHETIC, Splitter:B:16:0x0021] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized byte[] c(java.lang.String r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            org.cybergarage.xml.Node r0 = r3.f28868b     // Catch:{ all -> 0x0060 }
            r1 = 0
            if (r0 != 0) goto L_0x0007
            goto L_0x0011
        L_0x0007:
            java.lang.String r2 = "INMPR03"
            org.cybergarage.xml.Node r0 = r0.getNode((java.lang.String) r2)     // Catch:{ all -> 0x0060 }
            if (r0 == 0) goto L_0x0011
            r0 = 1
            goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            if (r0 != 0) goto L_0x0017
            r3.y(r4)     // Catch:{ all -> 0x0060 }
        L_0x0017:
            org.cybergarage.xml.Node r4 = r3.l()     // Catch:{ all -> 0x0060 }
            if (r4 != 0) goto L_0x0021
            byte[] r4 = new byte[r1]     // Catch:{ all -> 0x0060 }
            monitor-exit(r3)
            return r4
        L_0x0021:
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x0060 }
            r0.<init>()     // Catch:{ all -> 0x0060 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0060 }
            r1.<init>(r0)     // Catch:{ all -> 0x0060 }
            java.lang.String r0 = "<?xml version=\"1.0\" encoding=\"utf-8\"?>"
            r1.append(r0)     // Catch:{ all -> 0x0060 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0060 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0060 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0060 }
            r1.<init>(r0)     // Catch:{ all -> 0x0060 }
            java.lang.String r0 = "\n"
            r1.append(r0)     // Catch:{ all -> 0x0060 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0060 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0060 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0060 }
            r1.<init>(r0)     // Catch:{ all -> 0x0060 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0060 }
            r1.append(r4)     // Catch:{ all -> 0x0060 }
            java.lang.String r4 = r1.toString()     // Catch:{ all -> 0x0060 }
            byte[] r4 = r4.getBytes()     // Catch:{ all -> 0x0060 }
            monitor-exit(r3)
            return r4
        L_0x0060:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ze.f.c(java.lang.String):byte[]");
    }

    public f d(String str) {
        g g10 = g();
        int size = g10.size();
        for (int i10 = 0; i10 < size; i10++) {
            f c10 = g10.c(i10);
            if (c10.w(str)) {
                return c10;
            }
            f d10 = c10.d(str);
            if (d10 != null) {
                return d10;
            }
        }
        return null;
    }

    public f e(String str) {
        g g10 = g();
        int size = g10.size();
        for (int i10 = 0; i10 < size; i10++) {
            f c10 = g10.c(i10);
            c10.f();
            f e10 = c10.e(str);
            if (e10 != null) {
                return e10;
            }
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.Set<cb.e>, org.cybergarage.xml.Node] */
    public final c f() {
        ? r02 = this.f28868b;
        c cVar = (c) r02.getUserData();
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c();
        r02.setUserData(cVar2);
        cVar2.f4374b = r02;
        return cVar2;
    }

    public g g() {
        g gVar = new g();
        Node node = this.f28868b.getNode("deviceList");
        if (node == null) {
            return gVar;
        }
        int nNodes = node.getNNodes();
        for (int i10 = 0; i10 < nNodes; i10++) {
            Node node2 = node.getNode(i10);
            if ("device".equals(node2.getName())) {
                gVar.add(new f((Node) null, node2));
            }
        }
        return gVar;
    }

    public String h() {
        return this.f28868b.getNodeValue("deviceType");
    }

    public String i() {
        return this.f28868b.getNodeValue("friendlyName");
    }

    public String j() {
        t m10 = m();
        if (m10 != null) {
            return we.c.a(m10.a(), "Location");
        }
        return f().f17849d;
    }

    public f k() {
        Node node;
        Node l10 = l();
        if (l10 == null || (node = l10.getNode("device")) == null) {
            return null;
        }
        return new f(l10, node);
    }

    public Node l() {
        Node node = this.f28867a;
        if (node != null) {
            return node;
        }
        Node node2 = this.f28868b;
        if (node2 == null) {
            return null;
        }
        return node2.getRootNode();
    }

    public t m() {
        if (!x()) {
            return null;
        }
        return f().f17852g;
    }

    public h n(String str) {
        i r10 = r();
        int size = r10.size();
        for (int i10 = 0; i10 < size; i10++) {
            h c10 = r10.c(i10);
            c10.getClass();
            boolean z10 = true;
            if (str == null || (!str.endsWith(c10.i()) && !str.endsWith(c10.f28869a.getNodeValue("serviceId")))) {
                z10 = false;
            }
            if (z10) {
                return c10;
            }
        }
        g g10 = g();
        int size2 = g10.size();
        for (int i11 = 0; i11 < size2; i11++) {
            h n10 = g10.c(i11).n(str);
            if (n10 != null) {
                return n10;
            }
        }
        return null;
    }

    public h o(String str) {
        i r10 = r();
        int size = r10.size();
        for (int i10 = 0; i10 < size; i10++) {
            h c10 = r10.c(i10);
            if (c10.n(c10.f28869a.getNodeValue("controlURL"), str)) {
                return c10;
            }
        }
        g g10 = g();
        int size2 = g10.size();
        for (int i11 = 0; i11 < size2; i11++) {
            h o10 = g10.c(i11).o(str);
            if (o10 != null) {
                return o10;
            }
        }
        return null;
    }

    public h p(String str) {
        i r10 = r();
        int size = r10.size();
        for (int i10 = 0; i10 < size; i10++) {
            h c10 = r10.c(i10);
            if (c10.n(c10.f28869a.getNodeValue("eventSubURL"), str)) {
                return c10;
            }
        }
        g g10 = g();
        int size2 = g10.size();
        for (int i11 = 0; i11 < size2; i11++) {
            h p10 = g10.c(i11).p(str);
            if (p10 != null) {
                return p10;
            }
        }
        return null;
    }

    public h q(String str) {
        i r10 = r();
        int size = r10.size();
        for (int i10 = 0; i10 < size; i10++) {
            h c10 = r10.c(i10);
            if (c10.n(c10.f28869a.getNodeValue("SCPDURL"), str)) {
                return c10;
            }
        }
        g g10 = g();
        int size2 = g10.size();
        for (int i11 = 0; i11 < size2; i11++) {
            h q10 = g10.c(i11).q(str);
            if (q10 != null) {
                return q10;
            }
        }
        return null;
    }

    public i r() {
        i iVar = new i();
        Node node = this.f28868b.getNode("serviceList");
        if (node == null) {
            return iVar;
        }
        int nNodes = node.getNNodes();
        for (int i10 = 0; i10 < nNodes; i10++) {
            Node node2 = node.getNode(i10);
            if ("service".equals(node2.getName())) {
                iVar.add(new h(node2));
            }
        }
        return iVar;
    }

    public k s(String str, String str2) {
        k j10;
        if (str == null && str2 == null) {
            return null;
        }
        i r10 = r();
        int size = r10.size();
        for (int i10 = 0; i10 < size; i10++) {
            h c10 = r10.c(i10);
            if ((str == null || c10.i().equals(str)) && (j10 = c10.j(str2)) != null) {
                return j10;
            }
        }
        g g10 = g();
        int size2 = g10.size();
        for (int i11 = 0; i11 < size2; i11++) {
            k s10 = g10.c(i11).s(str, str2);
            if (s10 != null) {
                return s10;
            }
        }
        return null;
    }

    public String t() {
        return this.f28868b.getNodeValue("UDN");
    }

    public String u() {
        return x() ? l().getNodeValue("URLBase") : "";
    }

    public final void v(af.c cVar) {
        b bVar = new b();
        bVar.B(401, q.b(401));
        cVar.B(bVar);
    }

    public boolean w(String str) {
        if (str == null) {
            return false;
        }
        return str.endsWith(t()) || str.equals(i()) || str.endsWith(h());
    }

    public boolean x() {
        return l().getNode("device").getNodeValue("UDN").equals(t());
    }

    public final void y(String str) {
        String b10 = a.b(str, f().f17851f, "");
        if (x()) {
            Node node = l().getNode("URLBase");
            if (node != null) {
                node.setValue(b10);
                return;
            }
            Node node2 = new Node("URLBase");
            node2.setValue(b10);
            l().hasNodes();
            l().insertNode(node2, 1);
        }
    }

    public final void z(g gVar, int i10) {
        h hVar = new h();
        hVar.f27220f = i10;
        hVar.q(0);
        gVar.B(hVar);
    }

    public f() {
        this((Node) null, (Node) null);
    }
}
