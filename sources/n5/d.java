package n5;

import d5.a0;
import d5.b0;
import d5.k;
import n5.e0;
import q.e;
import v6.v;

/* compiled from: Ac4Reader */
public final class d implements j {

    /* renamed from: a  reason: collision with root package name */
    public final b0 f22019a;

    /* renamed from: b  reason: collision with root package name */
    public final v f22020b;

    /* renamed from: c  reason: collision with root package name */
    public final String f22021c;

    /* renamed from: d  reason: collision with root package name */
    public String f22022d;

    /* renamed from: e  reason: collision with root package name */
    public a0 f22023e;

    /* renamed from: f  reason: collision with root package name */
    public int f22024f = 0;

    /* renamed from: g  reason: collision with root package name */
    public int f22025g = 0;

    /* renamed from: h  reason: collision with root package name */
    public boolean f22026h = false;

    /* renamed from: i  reason: collision with root package name */
    public boolean f22027i = false;

    /* renamed from: j  reason: collision with root package name */
    public long f22028j;

    /* renamed from: k  reason: collision with root package name */
    public x4.b0 f22029k;

    /* renamed from: l  reason: collision with root package name */
    public int f22030l;

    /* renamed from: m  reason: collision with root package name */
    public long f22031m;

    public d(String str) {
        b0 b0Var = new b0(new byte[16], 1, (e) null);
        this.f22019a = b0Var;
        this.f22020b = new v(b0Var.f13001b);
        this.f22021c = str;
    }

    public void a() {
        this.f22024f = 0;
        this.f22025g = 0;
        this.f22026h = false;
        this.f22027i = false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0107  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(v6.v r11) {
        /*
            r10 = this;
            d5.a0 r0 = r10.f22023e
            v6.a.f(r0)
        L_0x0005:
            int r0 = r11.a()
            if (r0 <= 0) goto L_0x0127
            int r0 = r10.f22024f
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x00d8
            if (r0 == r3) goto L_0x0046
            if (r0 == r1) goto L_0x0017
            goto L_0x0005
        L_0x0017:
            int r0 = r11.a()
            int r1 = r10.f22030l
            int r3 = r10.f22025g
            int r1 = r1 - r3
            int r0 = java.lang.Math.min(r0, r1)
            d5.a0 r1 = r10.f22023e
            r1.b(r11, r0)
            int r1 = r10.f22025g
            int r1 = r1 + r0
            r10.f22025g = r1
            int r7 = r10.f22030l
            if (r1 != r7) goto L_0x0005
            d5.a0 r3 = r10.f22023e
            long r4 = r10.f22031m
            r6 = 1
            r8 = 0
            r9 = 0
            r3.d(r4, r6, r7, r8, r9)
            long r0 = r10.f22031m
            long r3 = r10.f22028j
            long r0 = r0 + r3
            r10.f22031m = r0
            r10.f22024f = r2
            goto L_0x0005
        L_0x0046:
            v6.v r0 = r10.f22020b
            byte[] r0 = r0.f26518a
            int r4 = r11.a()
            int r5 = r10.f22025g
            r6 = 16
            int r5 = 16 - r5
            int r4 = java.lang.Math.min(r4, r5)
            int r5 = r10.f22025g
            byte[] r7 = r11.f26518a
            int r8 = r11.f26519b
            java.lang.System.arraycopy(r7, r8, r0, r5, r4)
            int r0 = r11.f26519b
            int r0 = r0 + r4
            r11.f26519b = r0
            int r0 = r10.f22025g
            int r0 = r0 + r4
            r10.f22025g = r0
            if (r0 != r6) goto L_0x006e
            goto L_0x006f
        L_0x006e:
            r3 = 0
        L_0x006f:
            if (r3 == 0) goto L_0x0005
            d5.b0 r0 = r10.f22019a
            r0.p(r2)
            d5.b0 r0 = r10.f22019a
            z4.c$b r0 = z4.c.b(r0)
            x4.b0 r3 = r10.f22029k
            java.lang.String r4 = "audio/ac4"
            if (r3 == 0) goto L_0x0094
            int r5 = r3.G
            if (r1 != r5) goto L_0x0094
            int r5 = r0.f28327a
            int r7 = r3.H
            if (r5 != r7) goto L_0x0094
            java.lang.String r3 = r3.f27408t
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L_0x00b4
        L_0x0094:
            x4.b0$b r3 = new x4.b0$b
            r3.<init>()
            java.lang.String r5 = r10.f22022d
            r3.f27415a = r5
            r3.f27425k = r4
            r3.f27438x = r1
            int r4 = r0.f28327a
            r3.f27439y = r4
            java.lang.String r4 = r10.f22021c
            r3.f27417c = r4
            x4.b0 r3 = r3.a()
            r10.f22029k = r3
            d5.a0 r4 = r10.f22023e
            r4.c(r3)
        L_0x00b4:
            int r3 = r0.f28328b
            r10.f22030l = r3
            r3 = 1000000(0xf4240, double:4.940656E-318)
            int r0 = r0.f28329c
            long r7 = (long) r0
            long r7 = r7 * r3
            x4.b0 r0 = r10.f22029k
            int r0 = r0.H
            long r3 = (long) r0
            long r7 = r7 / r3
            r10.f22028j = r7
            v6.v r0 = r10.f22020b
            r0.D(r2)
            d5.a0 r0 = r10.f22023e
            v6.v r2 = r10.f22020b
            r0.b(r2, r6)
            r10.f22024f = r1
            goto L_0x0005
        L_0x00d8:
            int r0 = r11.a()
            r4 = 65
            r5 = 64
            if (r0 <= 0) goto L_0x010c
            boolean r0 = r10.f22026h
            r6 = 172(0xac, float:2.41E-43)
            if (r0 != 0) goto L_0x00f4
            int r0 = r11.s()
            if (r0 != r6) goto L_0x00f0
            r0 = 1
            goto L_0x00f1
        L_0x00f0:
            r0 = 0
        L_0x00f1:
            r10.f22026h = r0
            goto L_0x00d8
        L_0x00f4:
            int r0 = r11.s()
            if (r0 != r6) goto L_0x00fc
            r6 = 1
            goto L_0x00fd
        L_0x00fc:
            r6 = 0
        L_0x00fd:
            r10.f22026h = r6
            if (r0 == r5) goto L_0x0103
            if (r0 != r4) goto L_0x00d8
        L_0x0103:
            if (r0 != r4) goto L_0x0107
            r0 = 1
            goto L_0x0108
        L_0x0107:
            r0 = 0
        L_0x0108:
            r10.f22027i = r0
            r0 = 1
            goto L_0x010d
        L_0x010c:
            r0 = 0
        L_0x010d:
            if (r0 == 0) goto L_0x0005
            r10.f22024f = r3
            v6.v r0 = r10.f22020b
            byte[] r0 = r0.f26518a
            r6 = -84
            r0[r2] = r6
            boolean r2 = r10.f22027i
            if (r2 == 0) goto L_0x011e
            goto L_0x0120
        L_0x011e:
            r4 = 64
        L_0x0120:
            byte r2 = (byte) r4
            r0[r3] = r2
            r10.f22025g = r1
            goto L_0x0005
        L_0x0127:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.d.c(v6.v):void");
    }

    public void d(k kVar, e0.d dVar) {
        dVar.a();
        this.f22022d = dVar.b();
        this.f22023e = kVar.l(dVar.c(), 1);
    }

    public void e() {
    }

    public void f(long j10, int i10) {
        this.f22031m = j10;
    }
}
