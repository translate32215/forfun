package v5;

import d5.b0;
import i5.d;
import j.f;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import q5.e;
import q5.h;
import v6.e0;
import v6.v;

/* compiled from: Id3Decoder */
public final class g extends h {

    /* renamed from: b  reason: collision with root package name */
    public static final a f26400b = d.f19165b;

    /* renamed from: a  reason: collision with root package name */
    public final a f26401a;

    /* compiled from: Id3Decoder */
    public interface a {
        boolean a(int i10, int i11, int i12, int i13, int i14);
    }

    /* compiled from: Id3Decoder */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f26402a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f26403b;

        /* renamed from: c  reason: collision with root package name */
        public final int f26404c;

        public b(int i10, boolean z10, int i11) {
            this.f26402a = i10;
            this.f26403b = z10;
            this.f26404c = i11;
        }
    }

    public g() {
        this.f26401a = null;
    }

    public static byte[] c(byte[] bArr, int i10, int i11) {
        if (i11 <= i10) {
            return e0.f26441f;
        }
        return Arrays.copyOfRange(bArr, i10, i11);
    }

    public static a e(v vVar, int i10, int i11) throws UnsupportedEncodingException {
        String str;
        int i12;
        int s10 = vVar.s();
        String t10 = t(s10);
        int i13 = i10 - 1;
        byte[] bArr = new byte[i13];
        System.arraycopy(vVar.f26518a, vVar.f26519b, bArr, 0, i13);
        vVar.f26519b += i13;
        if (i11 == 2) {
            StringBuilder a10 = android.support.v4.media.a.a("image/");
            a10.append(e0.V(new String(bArr, 0, 3, "ISO-8859-1")));
            str = a10.toString();
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            i12 = 2;
        } else {
            int w10 = w(bArr, 0);
            String V = e0.V(new String(bArr, 0, w10, "ISO-8859-1"));
            if (V.indexOf(47) == -1) {
                i12 = w10;
                str = f.a("image/", V);
            } else {
                i12 = w10;
                str = V;
            }
        }
        int i14 = i12 + 2;
        int v10 = v(bArr, i14, s10);
        return new a(str, new String(bArr, i14, v10 - i14, t10), bArr[i12 + 1] & 255, c(bArr, s(s10) + v10, i13));
    }

    public static b f(v vVar, int i10, String str) {
        byte[] bArr = new byte[i10];
        System.arraycopy(vVar.f26518a, vVar.f26519b, bArr, 0, i10);
        vVar.f26519b += i10;
        return new b(str, bArr);
    }

    public static c g(v vVar, int i10, int i11, boolean z10, int i12, a aVar) throws UnsupportedEncodingException {
        v vVar2 = vVar;
        int i13 = vVar2.f26519b;
        int w10 = w(vVar2.f26518a, i13);
        String str = new String(vVar2.f26518a, i13, w10 - i13, "ISO-8859-1");
        vVar.D(w10 + 1);
        int f10 = vVar.f();
        int f11 = vVar.f();
        long t10 = vVar.t();
        long j10 = t10 == 4294967295L ? -1 : t10;
        long t11 = vVar.t();
        long j11 = t11 == 4294967295L ? -1 : t11;
        ArrayList arrayList = new ArrayList();
        int i14 = i13 + i10;
        while (vVar2.f26519b < i14) {
            h j12 = j(i11, vVar, z10, i12, aVar);
            if (j12 != null) {
                arrayList.add(j12);
            }
        }
        return new c(str, f10, f11, j10, j11, (h[]) arrayList.toArray(new h[0]));
    }

    public static d h(v vVar, int i10, int i11, boolean z10, int i12, a aVar) throws UnsupportedEncodingException {
        v vVar2 = vVar;
        int i13 = vVar2.f26519b;
        int w10 = w(vVar2.f26518a, i13);
        String str = new String(vVar2.f26518a, i13, w10 - i13, "ISO-8859-1");
        vVar2.D(w10 + 1);
        int s10 = vVar.s();
        boolean z11 = (s10 & 2) != 0;
        boolean z12 = (s10 & 1) != 0;
        int s11 = vVar.s();
        String[] strArr = new String[s11];
        for (int i14 = 0; i14 < s11; i14++) {
            int i15 = vVar2.f26519b;
            int w11 = w(vVar2.f26518a, i15);
            strArr[i14] = new String(vVar2.f26518a, i15, w11 - i15, "ISO-8859-1");
            vVar2.D(w11 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i16 = i13 + i10;
        while (vVar2.f26519b < i16) {
            h j10 = j(i11, vVar2, z10, i12, aVar);
            if (j10 != null) {
                arrayList.add(j10);
            }
        }
        return new d(str, z11, z12, strArr, (h[]) arrayList.toArray(new h[0]));
    }

    public static e i(v vVar, int i10) throws UnsupportedEncodingException {
        if (i10 < 4) {
            return null;
        }
        int s10 = vVar.s();
        String t10 = t(s10);
        byte[] bArr = new byte[3];
        System.arraycopy(vVar.f26518a, vVar.f26519b, bArr, 0, 3);
        vVar.f26519b += 3;
        String str = new String(bArr, 0, 3);
        int i11 = i10 - 4;
        byte[] bArr2 = new byte[i11];
        System.arraycopy(vVar.f26518a, vVar.f26519b, bArr2, 0, i11);
        vVar.f26519b += i11;
        int v10 = v(bArr2, 0, s10);
        String str2 = new String(bArr2, 0, v10, t10);
        int s11 = s(s10) + v10;
        return new e(str, str2, n(bArr2, s11, v(bArr2, s11, s10), t10));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0188, code lost:
        if (r13 == 67) goto L_0x018a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static v5.h j(int r19, v6.v r20, boolean r21, int r22, v5.g.a r23) {
        /*
            r0 = r19
            r7 = r20
            int r8 = r20.s()
            int r9 = r20.s()
            int r10 = r20.s()
            r12 = 3
            if (r0 < r12) goto L_0x0019
            int r1 = r20.s()
            r13 = r1
            goto L_0x001a
        L_0x0019:
            r13 = 0
        L_0x001a:
            r14 = 4
            if (r0 != r14) goto L_0x003c
            int r1 = r20.v()
            if (r21 != 0) goto L_0x003a
            r2 = r1 & 255(0xff, float:3.57E-43)
            int r3 = r1 >> 8
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 7
            r2 = r2 | r3
            int r3 = r1 >> 16
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 14
            r2 = r2 | r3
            int r1 = r1 >> 24
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 21
            r1 = r1 | r2
        L_0x003a:
            r15 = r1
            goto L_0x0048
        L_0x003c:
            if (r0 != r12) goto L_0x0043
            int r1 = r20.v()
            goto L_0x003a
        L_0x0043:
            int r1 = r20.u()
            goto L_0x003a
        L_0x0048:
            if (r0 < r12) goto L_0x0050
            int r1 = r20.x()
            r6 = r1
            goto L_0x0051
        L_0x0050:
            r6 = 0
        L_0x0051:
            r16 = 0
            if (r8 != 0) goto L_0x0065
            if (r9 != 0) goto L_0x0065
            if (r10 != 0) goto L_0x0065
            if (r13 != 0) goto L_0x0065
            if (r15 != 0) goto L_0x0065
            if (r6 != 0) goto L_0x0065
            int r0 = r7.f26520c
            r7.D(r0)
            return r16
        L_0x0065:
            int r1 = r7.f26519b
            int r5 = r1 + r15
            int r1 = r7.f26520c
            java.lang.String r4 = "Id3Decoder"
            if (r5 <= r1) goto L_0x007a
            java.lang.String r0 = "Frame size exceeds remaining tag data"
            android.util.Log.w(r4, r0)
            int r0 = r7.f26520c
            r7.D(r0)
            return r16
        L_0x007a:
            if (r23 == 0) goto L_0x0092
            r1 = r23
            r2 = r19
            r3 = r8
            r11 = r4
            r4 = r9
            r14 = r5
            r5 = r10
            r18 = r6
            r6 = r13
            boolean r1 = r1.a(r2, r3, r4, r5, r6)
            if (r1 != 0) goto L_0x0096
            r7.D(r14)
            return r16
        L_0x0092:
            r11 = r4
            r14 = r5
            r18 = r6
        L_0x0096:
            r1 = 1
            if (r0 != r12) goto L_0x00b4
            r2 = r18
            r3 = r2 & 128(0x80, float:1.794E-43)
            if (r3 == 0) goto L_0x00a1
            r3 = 1
            goto L_0x00a2
        L_0x00a1:
            r3 = 0
        L_0x00a2:
            r4 = r2 & 64
            if (r4 == 0) goto L_0x00a8
            r4 = 1
            goto L_0x00a9
        L_0x00a8:
            r4 = 0
        L_0x00a9:
            r2 = r2 & 32
            if (r2 == 0) goto L_0x00af
            r2 = 1
            goto L_0x00b0
        L_0x00af:
            r2 = 0
        L_0x00b0:
            r17 = r3
            r6 = 0
            goto L_0x00ea
        L_0x00b4:
            r2 = r18
            r3 = 4
            if (r0 != r3) goto L_0x00e4
            r3 = r2 & 64
            if (r3 == 0) goto L_0x00bf
            r3 = 1
            goto L_0x00c0
        L_0x00bf:
            r3 = 0
        L_0x00c0:
            r4 = r2 & 8
            if (r4 == 0) goto L_0x00c6
            r4 = 1
            goto L_0x00c7
        L_0x00c6:
            r4 = 0
        L_0x00c7:
            r5 = r2 & 4
            if (r5 == 0) goto L_0x00cd
            r5 = 1
            goto L_0x00ce
        L_0x00cd:
            r5 = 0
        L_0x00ce:
            r6 = r2 & 2
            if (r6 == 0) goto L_0x00d4
            r6 = 1
            goto L_0x00d5
        L_0x00d4:
            r6 = 0
        L_0x00d5:
            r2 = r2 & r1
            if (r2 == 0) goto L_0x00db
            r17 = 1
            goto L_0x00dd
        L_0x00db:
            r17 = 0
        L_0x00dd:
            r2 = r3
            r3 = r17
            r17 = r4
            r4 = r5
            goto L_0x00ea
        L_0x00e4:
            r2 = 0
            r3 = 0
            r4 = 0
            r6 = 0
            r17 = 0
        L_0x00ea:
            if (r17 != 0) goto L_0x021d
            if (r4 == 0) goto L_0x00f0
            goto L_0x021d
        L_0x00f0:
            if (r2 == 0) goto L_0x00f7
            int r15 = r15 + -1
            r7.E(r1)
        L_0x00f7:
            if (r3 == 0) goto L_0x00ff
            int r15 = r15 + -4
            r1 = 4
            r7.E(r1)
        L_0x00ff:
            if (r6 == 0) goto L_0x0105
            int r15 = x(r7, r15)
        L_0x0105:
            r1 = 84
            r2 = 88
            r3 = 2
            if (r8 != r1) goto L_0x011a
            if (r9 != r2) goto L_0x011a
            if (r10 != r2) goto L_0x011a
            if (r0 == r3) goto L_0x0114
            if (r13 != r2) goto L_0x011a
        L_0x0114:
            v5.l r1 = p(r7, r15)     // Catch:{ UnsupportedEncodingException -> 0x0210 }
            goto L_0x01ea
        L_0x011a:
            if (r8 != r1) goto L_0x0129
            java.lang.String r1 = u(r0, r8, r9, r10, r13)     // Catch:{ UnsupportedEncodingException -> 0x0210 }
            v5.l r1 = o(r7, r15, r1)     // Catch:{ UnsupportedEncodingException -> 0x0210 }
            goto L_0x01ea
        L_0x0126:
            r0 = move-exception
            goto L_0x0219
        L_0x0129:
            r4 = 87
            if (r8 != r4) goto L_0x013b
            if (r9 != r2) goto L_0x013b
            if (r10 != r2) goto L_0x013b
            if (r0 == r3) goto L_0x0135
            if (r13 != r2) goto L_0x013b
        L_0x0135:
            v5.m r1 = r(r7, r15)     // Catch:{ UnsupportedEncodingException -> 0x0210 }
            goto L_0x01ea
        L_0x013b:
            if (r8 != r4) goto L_0x0147
            java.lang.String r1 = u(r0, r8, r9, r10, r13)     // Catch:{ UnsupportedEncodingException -> 0x0210 }
            v5.m r1 = q(r7, r15, r1)     // Catch:{ UnsupportedEncodingException -> 0x0210 }
            goto L_0x01ea
        L_0x0147:
            r2 = 73
            r4 = 80
            if (r8 != r4) goto L_0x015d
            r5 = 82
            if (r9 != r5) goto L_0x015d
            if (r10 != r2) goto L_0x015d
            r5 = 86
            if (r13 != r5) goto L_0x015d
            v5.k r1 = m(r7, r15)     // Catch:{ UnsupportedEncodingException -> 0x0210 }
            goto L_0x01ea
        L_0x015d:
            r5 = 71
            r6 = 79
            if (r8 != r5) goto L_0x0175
            r5 = 69
            if (r9 != r5) goto L_0x0175
            if (r10 != r6) goto L_0x0175
            r5 = 66
            if (r13 == r5) goto L_0x016f
            if (r0 != r3) goto L_0x0175
        L_0x016f:
            v5.f r1 = k(r7, r15)     // Catch:{ UnsupportedEncodingException -> 0x0210 }
            goto L_0x01ea
        L_0x0175:
            r5 = 65
            r12 = 67
            if (r0 != r3) goto L_0x0182
            if (r8 != r4) goto L_0x0190
            if (r9 != r2) goto L_0x0190
            if (r10 != r12) goto L_0x0190
            goto L_0x018a
        L_0x0182:
            if (r8 != r5) goto L_0x0190
            if (r9 != r4) goto L_0x0190
            if (r10 != r2) goto L_0x0190
            if (r13 != r12) goto L_0x0190
        L_0x018a:
            v5.a r1 = e(r7, r15, r0)     // Catch:{ UnsupportedEncodingException -> 0x0210 }
            goto L_0x01ea
        L_0x0190:
            r2 = 77
            if (r8 != r12) goto L_0x01a1
            if (r9 != r6) goto L_0x01a1
            if (r10 != r2) goto L_0x01a1
            if (r13 == r2) goto L_0x019c
            if (r0 != r3) goto L_0x01a1
        L_0x019c:
            v5.e r1 = i(r7, r15)     // Catch:{ UnsupportedEncodingException -> 0x0210 }
            goto L_0x01ea
        L_0x01a1:
            if (r8 != r12) goto L_0x01bb
            r3 = 72
            if (r9 != r3) goto L_0x01bb
            if (r10 != r5) goto L_0x01bb
            if (r13 != r4) goto L_0x01bb
            r1 = r20
            r2 = r15
            r3 = r19
            r4 = r21
            r5 = r22
            r6 = r23
            v5.c r1 = g(r1, r2, r3, r4, r5, r6)     // Catch:{ UnsupportedEncodingException -> 0x0210 }
            goto L_0x01ea
        L_0x01bb:
            if (r8 != r12) goto L_0x01d3
            if (r9 != r1) goto L_0x01d3
            if (r10 != r6) goto L_0x01d3
            if (r13 != r12) goto L_0x01d3
            r1 = r20
            r2 = r15
            r3 = r19
            r4 = r21
            r5 = r22
            r6 = r23
            v5.d r1 = h(r1, r2, r3, r4, r5, r6)     // Catch:{ UnsupportedEncodingException -> 0x0210 }
            goto L_0x01ea
        L_0x01d3:
            if (r8 != r2) goto L_0x01e2
            r2 = 76
            if (r9 != r2) goto L_0x01e2
            if (r10 != r2) goto L_0x01e2
            if (r13 != r1) goto L_0x01e2
            v5.j r1 = l(r7, r15)     // Catch:{ UnsupportedEncodingException -> 0x0210 }
            goto L_0x01ea
        L_0x01e2:
            java.lang.String r1 = u(r0, r8, r9, r10, r13)     // Catch:{ UnsupportedEncodingException -> 0x0210 }
            v5.b r1 = f(r7, r15, r1)     // Catch:{ UnsupportedEncodingException -> 0x0210 }
        L_0x01ea:
            if (r1 != 0) goto L_0x020c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ UnsupportedEncodingException -> 0x0210 }
            r2.<init>()     // Catch:{ UnsupportedEncodingException -> 0x0210 }
            java.lang.String r3 = "Failed to decode frame: id="
            r2.append(r3)     // Catch:{ UnsupportedEncodingException -> 0x0210 }
            java.lang.String r0 = u(r0, r8, r9, r10, r13)     // Catch:{ UnsupportedEncodingException -> 0x0210 }
            r2.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x0210 }
            java.lang.String r0 = ", frameSize="
            r2.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x0210 }
            r2.append(r15)     // Catch:{ UnsupportedEncodingException -> 0x0210 }
            java.lang.String r0 = r2.toString()     // Catch:{ UnsupportedEncodingException -> 0x0210 }
            android.util.Log.w(r11, r0)     // Catch:{ UnsupportedEncodingException -> 0x0210 }
        L_0x020c:
            r7.D(r14)
            return r1
        L_0x0210:
            java.lang.String r0 = "Unsupported character encoding"
            android.util.Log.w(r11, r0)     // Catch:{ all -> 0x0126 }
            r7.D(r14)
            return r16
        L_0x0219:
            r7.D(r14)
            throw r0
        L_0x021d:
            java.lang.String r0 = "Skipping unsupported compressed or encrypted frame"
            android.util.Log.w(r11, r0)
            r7.D(r14)
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: v5.g.j(int, v6.v, boolean, int, v5.g$a):v5.h");
    }

    public static f k(v vVar, int i10) throws UnsupportedEncodingException {
        int s10 = vVar.s();
        String t10 = t(s10);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        System.arraycopy(vVar.f26518a, vVar.f26519b, bArr, 0, i11);
        vVar.f26519b += i11;
        int w10 = w(bArr, 0);
        String str = new String(bArr, 0, w10, "ISO-8859-1");
        int i12 = w10 + 1;
        int v10 = v(bArr, i12, s10);
        String n10 = n(bArr, i12, v10, t10);
        int s11 = s(s10) + v10;
        int v11 = v(bArr, s11, s10);
        return new f(str, n10, n(bArr, s11, v11, t10), c(bArr, s(s10) + v11, i11));
    }

    public static j l(v vVar, int i10) {
        int x10 = vVar.x();
        int u10 = vVar.u();
        int u11 = vVar.u();
        int s10 = vVar.s();
        int s11 = vVar.s();
        b0 b0Var = new b0();
        b0Var.n(vVar.f26518a, vVar.f26520c);
        b0Var.p(vVar.f26519b * 8);
        int i11 = ((i10 - 10) * 8) / (s10 + s11);
        int[] iArr = new int[i11];
        int[] iArr2 = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = b0Var.i(s10);
            int i14 = b0Var.i(s11);
            iArr[i12] = i13;
            iArr2[i12] = i14;
        }
        return new j(x10, u10, u11, iArr, iArr2);
    }

    public static k m(v vVar, int i10) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i10];
        System.arraycopy(vVar.f26518a, vVar.f26519b, bArr, 0, i10);
        vVar.f26519b += i10;
        int w10 = w(bArr, 0);
        return new k(new String(bArr, 0, w10, "ISO-8859-1"), c(bArr, w10 + 1, i10));
    }

    public static String n(byte[] bArr, int i10, int i11, String str) throws UnsupportedEncodingException {
        return (i11 <= i10 || i11 > bArr.length) ? "" : new String(bArr, i10, i11 - i10, str);
    }

    public static l o(v vVar, int i10, String str) throws UnsupportedEncodingException {
        if (i10 < 1) {
            return null;
        }
        int s10 = vVar.s();
        String t10 = t(s10);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        System.arraycopy(vVar.f26518a, vVar.f26519b, bArr, 0, i11);
        vVar.f26519b += i11;
        return new l(str, (String) null, new String(bArr, 0, v(bArr, 0, s10), t10));
    }

    public static l p(v vVar, int i10) throws UnsupportedEncodingException {
        if (i10 < 1) {
            return null;
        }
        int s10 = vVar.s();
        String t10 = t(s10);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        System.arraycopy(vVar.f26518a, vVar.f26519b, bArr, 0, i11);
        vVar.f26519b += i11;
        int v10 = v(bArr, 0, s10);
        String str = new String(bArr, 0, v10, t10);
        int s11 = s(s10) + v10;
        return new l("TXXX", str, n(bArr, s11, v(bArr, s11, s10), t10));
    }

    public static m q(v vVar, int i10, String str) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i10];
        System.arraycopy(vVar.f26518a, vVar.f26519b, bArr, 0, i10);
        vVar.f26519b += i10;
        return new m(str, (String) null, new String(bArr, 0, w(bArr, 0), "ISO-8859-1"));
    }

    public static m r(v vVar, int i10) throws UnsupportedEncodingException {
        if (i10 < 1) {
            return null;
        }
        int s10 = vVar.s();
        String t10 = t(s10);
        int i11 = i10 - 1;
        byte[] bArr = new byte[i11];
        System.arraycopy(vVar.f26518a, vVar.f26519b, bArr, 0, i11);
        vVar.f26519b += i11;
        int v10 = v(bArr, 0, s10);
        String str = new String(bArr, 0, v10, t10);
        int s11 = s(s10) + v10;
        return new m("WXXX", str, n(bArr, s11, w(bArr, s11), "ISO-8859-1"));
    }

    public static int s(int i10) {
        return (i10 == 0 || i10 == 3) ? 1 : 2;
    }

    public static String t(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? "ISO-8859-1" : "UTF-8" : "UTF-16BE" : "UTF-16";
    }

    public static String u(int i10, int i11, int i12, int i13, int i14) {
        if (i10 == 2) {
            return String.format(Locale.US, "%c%c%c", new Object[]{Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13)});
        }
        return String.format(Locale.US, "%c%c%c%c", new Object[]{Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14)});
    }

    public static int v(byte[] bArr, int i10, int i11) {
        int w10 = w(bArr, i10);
        if (i11 == 0 || i11 == 3) {
            return w10;
        }
        while (w10 < bArr.length - 1) {
            if (w10 % 2 == 0 && bArr[w10 + 1] == 0) {
                return w10;
            }
            w10 = w(bArr, w10 + 1);
        }
        return bArr.length;
    }

    public static int w(byte[] bArr, int i10) {
        while (i10 < bArr.length) {
            if (bArr[i10] == 0) {
                return i10;
            }
            i10++;
        }
        return bArr.length;
    }

    public static int x(v vVar, int i10) {
        byte[] bArr = vVar.f26518a;
        int i11 = vVar.f26519b;
        int i12 = i11;
        while (true) {
            int i13 = i12 + 1;
            if (i13 >= i11 + i10) {
                return i10;
            }
            if ((bArr[i12] & 255) == 255 && bArr[i13] == 0) {
                System.arraycopy(bArr, i12 + 2, bArr, i13, (i10 - (i12 - i11)) - 2);
                i10--;
            }
            i12 = i13;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0074, code lost:
        if ((r10 & 1) != 0) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0082, code lost:
        if ((r10 & 128) != 0) goto L_0x0087;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean y(v6.v r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r1.f26519b
        L_0x0006:
            int r3 = r18.a()     // Catch:{ all -> 0x00ab }
            r4 = 1
            r5 = r20
            if (r3 < r5) goto L_0x00a7
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L_0x0020
            int r7 = r18.f()     // Catch:{ all -> 0x00ab }
            long r8 = r18.t()     // Catch:{ all -> 0x00ab }
            int r10 = r18.x()     // Catch:{ all -> 0x00ab }
            goto L_0x002a
        L_0x0020:
            int r7 = r18.u()     // Catch:{ all -> 0x00ab }
            int r8 = r18.u()     // Catch:{ all -> 0x00ab }
            long r8 = (long) r8
            r10 = 0
        L_0x002a:
            r11 = 0
            if (r7 != 0) goto L_0x0038
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L_0x0038
            if (r10 != 0) goto L_0x0038
            r1.D(r2)
            return r4
        L_0x0038:
            r7 = 4
            if (r0 != r7) goto L_0x0069
            if (r21 != 0) goto L_0x0069
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 == 0) goto L_0x0049
            r1.D(r2)
            return r6
        L_0x0049:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 14
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 24
            long r8 = r8 >> r15
            long r8 = r8 & r11
            r11 = 21
            long r8 = r8 << r11
            long r8 = r8 | r13
        L_0x0069:
            if (r0 != r7) goto L_0x0077
            r3 = r10 & 64
            if (r3 == 0) goto L_0x0071
            r3 = 1
            goto L_0x0072
        L_0x0071:
            r3 = 0
        L_0x0072:
            r7 = r10 & 1
            if (r7 == 0) goto L_0x0086
            goto L_0x0087
        L_0x0077:
            if (r0 != r3) goto L_0x0085
            r3 = r10 & 32
            if (r3 == 0) goto L_0x007f
            r3 = 1
            goto L_0x0080
        L_0x007f:
            r3 = 0
        L_0x0080:
            r7 = r10 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x0086
            goto L_0x0087
        L_0x0085:
            r3 = 0
        L_0x0086:
            r4 = 0
        L_0x0087:
            if (r4 == 0) goto L_0x008b
            int r3 = r3 + 4
        L_0x008b:
            long r3 = (long) r3
            int r7 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r7 >= 0) goto L_0x0094
            r1.D(r2)
            return r6
        L_0x0094:
            int r3 = r18.a()     // Catch:{ all -> 0x00ab }
            long r3 = (long) r3
            int r7 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r7 >= 0) goto L_0x00a1
            r1.D(r2)
            return r6
        L_0x00a1:
            int r3 = (int) r8
            r1.E(r3)     // Catch:{ all -> 0x00ab }
            goto L_0x0006
        L_0x00a7:
            r1.D(r2)
            return r4
        L_0x00ab:
            r0 = move-exception
            r1.D(r2)
            goto L_0x00b1
        L_0x00b0:
            throw r0
        L_0x00b1:
            goto L_0x00b0
        */
        throw new UnsupportedOperationException("Method not decompiled: v5.g.y(v6.v, int, int, boolean):boolean");
    }

    public q5.a b(e eVar, ByteBuffer byteBuffer) {
        return d(byteBuffer.array(), byteBuffer.limit());
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00b6 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00b7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public q5.a d(byte[] r13, int r14) {
        /*
            r12 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            v6.v r1 = new v6.v
            r1.<init>(r13, r14)
            int r13 = r1.a()
            r14 = 0
            r2 = 1
            r3 = 2
            r4 = 10
            java.lang.String r5 = "Id3Decoder"
            r6 = 4
            r7 = 0
            if (r13 >= r4) goto L_0x0020
            java.lang.String r13 = "Data too short to be an ID3 tag"
            android.util.Log.w(r5, r13)
            goto L_0x00b3
        L_0x0020:
            int r13 = r1.u()
            r8 = 4801587(0x494433, float:6.728456E-39)
            if (r13 == r8) goto L_0x0049
            java.lang.String r8 = "Unexpected first three bytes of ID3 tag header: 0x"
            java.lang.StringBuilder r8 = android.support.v4.media.a.a(r8)
            java.lang.Object[] r9 = new java.lang.Object[r2]
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r9[r14] = r13
            java.lang.String r13 = "%06X"
            java.lang.String r13 = java.lang.String.format(r13, r9)
            r8.append(r13)
            java.lang.String r13 = r8.toString()
            android.util.Log.w(r5, r13)
            goto L_0x00b3
        L_0x0049:
            int r13 = r1.s()
            r1.E(r2)
            int r8 = r1.s()
            int r9 = r1.r()
            if (r13 != r3) goto L_0x0069
            r10 = r8 & 64
            if (r10 == 0) goto L_0x0060
            r10 = 1
            goto L_0x0061
        L_0x0060:
            r10 = 0
        L_0x0061:
            if (r10 == 0) goto L_0x009f
            java.lang.String r13 = "Skipped ID3 tag with majorVersion=2 and undefined compression scheme"
            android.util.Log.w(r5, r13)
            goto L_0x00b3
        L_0x0069:
            r10 = 3
            if (r13 != r10) goto L_0x007f
            r10 = r8 & 64
            if (r10 == 0) goto L_0x0072
            r10 = 1
            goto L_0x0073
        L_0x0072:
            r10 = 0
        L_0x0073:
            if (r10 == 0) goto L_0x009f
            int r10 = r1.f()
            r1.E(r10)
            int r10 = r10 + r6
            int r9 = r9 - r10
            goto L_0x009f
        L_0x007f:
            if (r13 != r6) goto L_0x00ae
            r10 = r8 & 64
            if (r10 == 0) goto L_0x0087
            r10 = 1
            goto L_0x0088
        L_0x0087:
            r10 = 0
        L_0x0088:
            if (r10 == 0) goto L_0x0094
            int r10 = r1.r()
            int r11 = r10 + -4
            r1.E(r11)
            int r9 = r9 - r10
        L_0x0094:
            r10 = r8 & 16
            if (r10 == 0) goto L_0x009a
            r10 = 1
            goto L_0x009b
        L_0x009a:
            r10 = 0
        L_0x009b:
            if (r10 == 0) goto L_0x009f
            int r9 = r9 + -10
        L_0x009f:
            if (r13 >= r6) goto L_0x00a7
            r8 = r8 & 128(0x80, float:1.794E-43)
            if (r8 == 0) goto L_0x00a7
            r8 = 1
            goto L_0x00a8
        L_0x00a7:
            r8 = 0
        L_0x00a8:
            v5.g$b r10 = new v5.g$b
            r10.<init>(r13, r8, r9)
            goto L_0x00b4
        L_0x00ae:
            java.lang.String r8 = "Skipped ID3 tag with unsupported majorVersion="
            f0.j.a(r8, r13, r5)
        L_0x00b3:
            r10 = r7
        L_0x00b4:
            if (r10 != 0) goto L_0x00b7
            return r7
        L_0x00b7:
            int r13 = r1.f26519b
            int r8 = r10.f26402a
            if (r8 != r3) goto L_0x00be
            r4 = 6
        L_0x00be:
            int r3 = r10.f26404c
            boolean r8 = r10.f26403b
            if (r8 == 0) goto L_0x00c8
            int r3 = x(r1, r3)
        L_0x00c8:
            int r13 = r13 + r3
            r1.C(r13)
            int r13 = r10.f26402a
            boolean r13 = y(r1, r13, r4, r14)
            if (r13 != 0) goto L_0x00f3
            int r13 = r10.f26402a
            if (r13 != r6) goto L_0x00e0
            boolean r13 = y(r1, r6, r4, r2)
            if (r13 == 0) goto L_0x00e0
            r14 = 1
            goto L_0x00f3
        L_0x00e0:
            java.lang.String r13 = "Failed to validate ID3 tag with majorVersion="
            java.lang.StringBuilder r13 = android.support.v4.media.a.a(r13)
            int r14 = r10.f26402a
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            android.util.Log.w(r5, r13)
            return r7
        L_0x00f3:
            int r13 = r1.a()
            if (r13 < r4) goto L_0x0107
            int r13 = r10.f26402a
            v5.g$a r2 = r12.f26401a
            v5.h r13 = j(r13, r1, r14, r4, r2)
            if (r13 == 0) goto L_0x00f3
            r0.add(r13)
            goto L_0x00f3
        L_0x0107:
            q5.a r13 = new q5.a
            r13.<init>((java.util.List<? extends q5.a.b>) r0)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: v5.g.d(byte[], int):q5.a");
    }

    public g(a aVar) {
        this.f26401a = aVar;
    }
}
