package we;

import java.net.Socket;

/* compiled from: HTTPServerThread */
public class j extends Thread {

    /* renamed from: a  reason: collision with root package name */
    public h f27227a;

    /* renamed from: b  reason: collision with root package name */
    public Socket f27228b;

    public j(h hVar, Socket socket) {
        super("Cyber.HTTPServerThread");
        this.f27227a = hVar;
        this.f27228b = socket;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a3 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r8 = this;
            o1.p r0 = new o1.p
            java.net.Socket r1 = r8.f27228b
            r0.<init>((java.net.Socket) r1)
            boolean r1 = r0.c()
            if (r1 != 0) goto L_0x000e
            return
        L_0x000e:
            we.d r1 = new we.d
            r1.<init>()
            r1.f27218j = r0
        L_0x0015:
            o1.p r2 = r1.f27218j
            java.lang.String r3 = ""
            r1.f13213d = r3
            java.lang.Object r4 = r1.f13210a
            java.util.Vector r4 = (java.util.Vector) r4
            r4.clear()
            java.util.Vector r4 = new java.util.Vector
            r4.<init>()
            r1.f13210a = r4
            r4 = 0
            byte[] r5 = new byte[r4]
            r1.f13214e = r5
            r5 = 0
            r1.f13212c = r5
            java.lang.Object r2 = r2.f22796c
            java.io.InputStream r2 = (java.io.InputStream) r2
            boolean r2 = r1.n(r2, r4)
            if (r2 != 0) goto L_0x003d
            goto L_0x00a5
        L_0x003d:
            we.h r2 = r8.f27227a
            ze.j r5 = r2.f27224d
            int r5 = r5.size()
            r6 = 0
        L_0x0046:
            if (r6 < r5) goto L_0x00a9
            java.lang.String r2 = "Connection"
            we.c r5 = r1.e(r2)
            r6 = 1
            if (r5 == 0) goto L_0x0053
            r5 = 1
            goto L_0x0054
        L_0x0053:
            r5 = 0
        L_0x0054:
            if (r5 != 0) goto L_0x0057
            goto L_0x0063
        L_0x0057:
            we.c r5 = r1.e(r2)
            if (r5 != 0) goto L_0x005f
            r5 = r3
            goto L_0x0061
        L_0x005f:
            java.lang.String r5 = r5.f27213b
        L_0x0061:
            if (r5 != 0) goto L_0x0065
        L_0x0063:
            r5 = 0
            goto L_0x006b
        L_0x0065:
            java.lang.String r7 = "close"
            boolean r5 = r5.equalsIgnoreCase(r7)
        L_0x006b:
            if (r5 == 0) goto L_0x006e
            goto L_0x00a3
        L_0x006e:
            we.c r5 = r1.e(r2)
            if (r5 == 0) goto L_0x0076
            r5 = 1
            goto L_0x0077
        L_0x0076:
            r5 = 0
        L_0x0077:
            if (r5 != 0) goto L_0x007a
            goto L_0x0085
        L_0x007a:
            we.c r2 = r1.e(r2)
            if (r2 != 0) goto L_0x0081
            goto L_0x0083
        L_0x0081:
            java.lang.String r3 = r2.f27213b
        L_0x0083:
            if (r3 != 0) goto L_0x0087
        L_0x0085:
            r2 = 0
            goto L_0x008d
        L_0x0087:
            java.lang.String r2 = "Keep-Alive"
            boolean r2 = r3.equalsIgnoreCase(r2)
        L_0x008d:
            if (r2 == 0) goto L_0x0090
            goto L_0x00a2
        L_0x0090:
            java.lang.String r2 = r1.v()
            java.lang.String r3 = "1.0"
            int r2 = r2.indexOf(r3)
            if (r2 <= 0) goto L_0x009e
            r2 = 1
            goto L_0x009f
        L_0x009e:
            r2 = 0
        L_0x009f:
            if (r2 == 0) goto L_0x00a2
            goto L_0x00a3
        L_0x00a2:
            r4 = 1
        L_0x00a3:
            if (r4 != 0) goto L_0x0015
        L_0x00a5:
            r0.a()
            return
        L_0x00a9:
            ze.j r7 = r2.f27224d
            java.lang.Object r7 = r7.get(r6)
            we.e r7 = (we.e) r7
            r7.a(r1)
            int r6 = r6 + 1
            goto L_0x0046
        */
        throw new UnsupportedOperationException("Method not decompiled: we.j.run():void");
    }
}
