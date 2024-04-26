package we;

import d7.m;
import java.io.InputStream;
import java.net.Socket;
import o1.p;

/* compiled from: HTTPRequest */
public class d extends m {

    /* renamed from: f  reason: collision with root package name */
    public String f27214f = null;

    /* renamed from: g  reason: collision with root package name */
    public String f27215g = null;

    /* renamed from: h  reason: collision with root package name */
    public String f27216h = "";

    /* renamed from: i  reason: collision with root package name */
    public int f27217i = -1;

    /* renamed from: j  reason: collision with root package name */
    public p f27218j = null;

    /* renamed from: k  reason: collision with root package name */
    public Socket f27219k = null;

    public d() {
        this.f13211b = "1.0";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a5, code lost:
        if (r10 == null) goto L_0x00f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00d8, code lost:
        if (r10 == null) goto L_0x00f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00f0, code lost:
        if (r10 == null) goto L_0x00f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        r9.f27219k.close();
     */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00d3 A[SYNTHETIC, Splitter:B:52:0x00d3] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00eb A[SYNTHETIC, Splitter:B:64:0x00eb] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0100 A[SYNTHETIC, Splitter:B:77:0x0100] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0107 A[SYNTHETIC, Splitter:B:81:0x0107] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:46:0x00c7=Splitter:B:46:0x00c7, B:58:0x00df=Splitter:B:58:0x00df} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public we.f A(java.lang.String r10, int r11) {
        /*
            r9 = this;
            java.lang.String r0 = "\r\n"
            we.f r1 = new we.f
            r1.<init>()
            boolean r2 = xe.a.d(r10)
            if (r2 == 0) goto L_0x0021
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "["
            r2.<init>(r3)
            r2.append(r10)
            java.lang.String r3 = "]"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            goto L_0x0022
        L_0x0021:
            r2 = r10
        L_0x0022:
            java.lang.String r3 = "HOST"
            r9.s(r3, r2)
            java.lang.String r2 = "Connection"
            java.lang.String r3 = "close"
            r9.s(r2, r3)
            boolean r2 = r9.y()
            r3 = 500(0x1f4, float:7.0E-43)
            r4 = 0
            java.net.Socket r5 = r9.f27219k     // Catch:{ SocketException -> 0x00db, IOException -> 0x00c3, all -> 0x00be }
            if (r5 != 0) goto L_0x004b
            java.net.Socket r5 = new java.net.Socket     // Catch:{ SocketException -> 0x00db, IOException -> 0x00c3, all -> 0x00be }
            r5.<init>()     // Catch:{ SocketException -> 0x00db, IOException -> 0x00c3, all -> 0x00be }
            r9.f27219k = r5     // Catch:{ SocketException -> 0x00db, IOException -> 0x00c3, all -> 0x00be }
            java.net.InetSocketAddress r6 = new java.net.InetSocketAddress     // Catch:{ SocketException -> 0x00db, IOException -> 0x00c3, all -> 0x00be }
            r6.<init>(r10, r11)     // Catch:{ SocketException -> 0x00db, IOException -> 0x00c3, all -> 0x00be }
            r10 = 80000(0x13880, float:1.12104E-40)
            r5.connect(r6, r10)     // Catch:{ SocketException -> 0x00db, IOException -> 0x00c3, all -> 0x00be }
        L_0x004b:
            java.net.Socket r10 = r9.f27219k     // Catch:{ SocketException -> 0x00db, IOException -> 0x00c3, all -> 0x00be }
            java.io.OutputStream r10 = r10.getOutputStream()     // Catch:{ SocketException -> 0x00db, IOException -> 0x00c3, all -> 0x00be }
            java.io.PrintStream r11 = new java.io.PrintStream     // Catch:{ SocketException -> 0x00ba, IOException -> 0x00b6, all -> 0x00b2 }
            r11.<init>(r10)     // Catch:{ SocketException -> 0x00ba, IOException -> 0x00b6, all -> 0x00b2 }
            java.lang.String r5 = r9.w()     // Catch:{ SocketException -> 0x00ba, IOException -> 0x00b6, all -> 0x00b2 }
            r11.print(r5)     // Catch:{ SocketException -> 0x00ba, IOException -> 0x00b6, all -> 0x00b2 }
            r11.print(r0)     // Catch:{ SocketException -> 0x00ba, IOException -> 0x00b6, all -> 0x00b2 }
            boolean r5 = r9.k()     // Catch:{ SocketException -> 0x00ba, IOException -> 0x00b6, all -> 0x00b2 }
            java.lang.String r6 = r9.b()     // Catch:{ SocketException -> 0x00ba, IOException -> 0x00b6, all -> 0x00b2 }
            int r7 = r6.length()     // Catch:{ SocketException -> 0x00ba, IOException -> 0x00b6, all -> 0x00b2 }
            if (r7 <= 0) goto L_0x0083
            if (r5 == 0) goto L_0x007b
            long r7 = (long) r7     // Catch:{ SocketException -> 0x00ba, IOException -> 0x00b6, all -> 0x00b2 }
            java.lang.String r7 = java.lang.Long.toHexString(r7)     // Catch:{ SocketException -> 0x00ba, IOException -> 0x00b6, all -> 0x00b2 }
            r11.print(r7)     // Catch:{ SocketException -> 0x00ba, IOException -> 0x00b6, all -> 0x00b2 }
            r11.print(r0)     // Catch:{ SocketException -> 0x00ba, IOException -> 0x00b6, all -> 0x00b2 }
        L_0x007b:
            r11.print(r6)     // Catch:{ SocketException -> 0x00ba, IOException -> 0x00b6, all -> 0x00b2 }
            if (r5 == 0) goto L_0x0083
            r11.print(r0)     // Catch:{ SocketException -> 0x00ba, IOException -> 0x00b6, all -> 0x00b2 }
        L_0x0083:
            if (r5 == 0) goto L_0x008d
            java.lang.String r5 = "0"
            r11.print(r5)     // Catch:{ SocketException -> 0x00ba, IOException -> 0x00b6, all -> 0x00b2 }
            r11.print(r0)     // Catch:{ SocketException -> 0x00ba, IOException -> 0x00b6, all -> 0x00b2 }
        L_0x008d:
            r11.flush()     // Catch:{ SocketException -> 0x00ba, IOException -> 0x00b6, all -> 0x00b2 }
            java.net.Socket r11 = r9.f27219k     // Catch:{ SocketException -> 0x00ba, IOException -> 0x00b6, all -> 0x00b2 }
            java.io.InputStream r11 = r11.getInputStream()     // Catch:{ SocketException -> 0x00ba, IOException -> 0x00b6, all -> 0x00b2 }
            r1.n(r11, r2)     // Catch:{ SocketException -> 0x00b0, IOException -> 0x00ae }
            r11.close()     // Catch:{ Exception -> 0x009d }
            goto L_0x009e
        L_0x009d:
        L_0x009e:
            if (r11 == 0) goto L_0x00a5
            r10.close()     // Catch:{ Exception -> 0x00a4 }
            goto L_0x00a5
        L_0x00a4:
        L_0x00a5:
            if (r10 == 0) goto L_0x00f6
        L_0x00a7:
            java.net.Socket r10 = r9.f27219k     // Catch:{ Exception -> 0x00f6 }
            goto L_0x00f3
        L_0x00ab:
            r0 = move-exception
            goto L_0x00f9
        L_0x00ae:
            r0 = move-exception
            goto L_0x00c7
        L_0x00b0:
            r0 = move-exception
            goto L_0x00df
        L_0x00b2:
            r11 = move-exception
            r0 = r11
            r11 = r4
            goto L_0x00f9
        L_0x00b6:
            r11 = move-exception
            r0 = r11
            r11 = r4
            goto L_0x00c7
        L_0x00ba:
            r11 = move-exception
            r0 = r11
            r11 = r4
            goto L_0x00df
        L_0x00be:
            r10 = move-exception
            r0 = r10
            r10 = r4
            r11 = r10
            goto L_0x00f9
        L_0x00c3:
            r10 = move-exception
            r0 = r10
            r10 = r4
            r11 = r10
        L_0x00c7:
            r1.f27220f = r3     // Catch:{ all -> 0x00ab }
            ff.a.b(r0)     // Catch:{ all -> 0x00ab }
            r11.close()     // Catch:{ Exception -> 0x00d0 }
            goto L_0x00d1
        L_0x00d0:
        L_0x00d1:
            if (r11 == 0) goto L_0x00d8
            r10.close()     // Catch:{ Exception -> 0x00d7 }
            goto L_0x00d8
        L_0x00d7:
        L_0x00d8:
            if (r10 == 0) goto L_0x00f6
            goto L_0x00a7
        L_0x00db:
            r10 = move-exception
            r0 = r10
            r10 = r4
            r11 = r10
        L_0x00df:
            r1.f27220f = r3     // Catch:{ all -> 0x00ab }
            ff.a.b(r0)     // Catch:{ all -> 0x00ab }
            r11.close()     // Catch:{ Exception -> 0x00e8 }
            goto L_0x00e9
        L_0x00e8:
        L_0x00e9:
            if (r11 == 0) goto L_0x00f0
            r10.close()     // Catch:{ Exception -> 0x00ef }
            goto L_0x00f0
        L_0x00ef:
        L_0x00f0:
            if (r10 == 0) goto L_0x00f6
            goto L_0x00a7
        L_0x00f3:
            r10.close()     // Catch:{ Exception -> 0x00f6 }
        L_0x00f6:
            r9.f27219k = r4
            return r1
        L_0x00f9:
            r11.close()     // Catch:{ Exception -> 0x00fd }
            goto L_0x00fe
        L_0x00fd:
        L_0x00fe:
            if (r11 == 0) goto L_0x0105
            r10.close()     // Catch:{ Exception -> 0x0104 }
            goto L_0x0105
        L_0x0104:
        L_0x0105:
            if (r10 == 0) goto L_0x010c
            java.net.Socket r10 = r9.f27219k     // Catch:{ Exception -> 0x010c }
            r10.close()     // Catch:{ Exception -> 0x010c }
        L_0x010c:
            r9.f27219k = r4
            goto L_0x0110
        L_0x010f:
            throw r0
        L_0x0110:
            goto L_0x010f
        */
        throw new UnsupportedOperationException("Method not decompiled: we.d.A(java.lang.String, int):we.f");
    }

    public boolean B(f fVar) {
        long j10;
        long j11;
        f fVar2 = fVar;
        p pVar = this.f27218j;
        long g10 = fVar2.g("Content-Length");
        if (j()) {
            long j12 = a()[0];
            long j13 = a()[1];
            if (j13 <= 0) {
                j13 = g10 - 1;
            }
            if (j12 > g10 || j13 > g10) {
                return D(416);
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf("bytes " + Long.toString(j12) + "-"));
            sb2.append(Long.toString(j13));
            sb2.append("/");
            StringBuilder sb3 = new StringBuilder(String.valueOf(sb2.toString()));
            sb3.append(0 < g10 ? Long.toString(g10) : "*");
            fVar2.s("Content-Range", sb3.toString());
            fVar2.f27220f = 206;
            j10 = (j13 - j12) + 1;
            j11 = j12;
        } else {
            j10 = g10;
            j11 = 0;
        }
        boolean y10 = y();
        pVar.getClass();
        InputStream inputStream = (InputStream) fVar2.f13212c;
        if (inputStream != null) {
            return pVar.d(fVar, inputStream, j11, j10, y10);
        }
        return pVar.e(fVar, (byte[]) fVar2.f13214e, j11, j10, y10);
    }

    public boolean C() {
        return D(400);
    }

    public boolean D(int i10) {
        f fVar = new f();
        fVar.f27220f = i10;
        fVar.q(0);
        return B(fVar);
    }

    public void E(String str, boolean z10) {
        this.f27215g = str;
        if (z10) {
            this.f27215g = b.d(str);
        }
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(w());
        stringBuffer.append("\r\n");
        stringBuffer.append(b());
        return stringBuffer.toString();
    }

    public String v() {
        if (this.f13213d.length() > 0) {
            return c(2);
        }
        return "HTTP/" + this.f13211b;
    }

    public String w() {
        StringBuffer stringBuffer = new StringBuffer();
        String str = this.f27214f;
        if (str == null) {
            str = c(0);
        }
        stringBuffer.append(String.valueOf(str) + " " + x() + " " + v() + "\r\n");
        stringBuffer.append(f());
        return stringBuffer.toString();
    }

    public String x() {
        String str = this.f27215g;
        if (str != null) {
            return str;
        }
        return c(1);
    }

    public boolean y() {
        return z("HEAD");
    }

    public boolean z(String str) {
        String str2 = this.f27214f;
        if (str2 == null) {
            str2 = c(0);
        }
        if (str2 == null) {
            return false;
        }
        return str2.equalsIgnoreCase(str);
    }
}
