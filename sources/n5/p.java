package n5;

import d5.a0;
import d5.b0;
import d5.k;
import n5.e0;
import q.e;
import v6.v;
import x4.m0;
import z4.a;

/* compiled from: LatmReader */
public final class p implements j {

    /* renamed from: a  reason: collision with root package name */
    public final String f22250a;

    /* renamed from: b  reason: collision with root package name */
    public final v f22251b;

    /* renamed from: c  reason: collision with root package name */
    public final b0 f22252c;

    /* renamed from: d  reason: collision with root package name */
    public a0 f22253d;

    /* renamed from: e  reason: collision with root package name */
    public String f22254e;

    /* renamed from: f  reason: collision with root package name */
    public x4.b0 f22255f;

    /* renamed from: g  reason: collision with root package name */
    public int f22256g;

    /* renamed from: h  reason: collision with root package name */
    public int f22257h;

    /* renamed from: i  reason: collision with root package name */
    public int f22258i;

    /* renamed from: j  reason: collision with root package name */
    public int f22259j;

    /* renamed from: k  reason: collision with root package name */
    public long f22260k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f22261l;

    /* renamed from: m  reason: collision with root package name */
    public int f22262m;

    /* renamed from: n  reason: collision with root package name */
    public int f22263n;

    /* renamed from: o  reason: collision with root package name */
    public int f22264o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f22265p;

    /* renamed from: q  reason: collision with root package name */
    public long f22266q;

    /* renamed from: r  reason: collision with root package name */
    public int f22267r;

    /* renamed from: s  reason: collision with root package name */
    public long f22268s;

    /* renamed from: t  reason: collision with root package name */
    public int f22269t;

    /* renamed from: u  reason: collision with root package name */
    public String f22270u;

    public p(String str) {
        this.f22250a = str;
        v vVar = new v(1024);
        this.f22251b = vVar;
        this.f22252c = new b0(vVar.f26518a, 1, (e) null);
    }

    public static long b(b0 b0Var) {
        return (long) b0Var.i((b0Var.i(2) + 1) * 8);
    }

    public void a() {
        this.f22256g = 0;
        this.f22261l = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x014e, code lost:
        if (r13.f22261l == false) goto L_0x01a8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(v6.v r14) throws x4.m0 {
        /*
            r13 = this;
            d5.a0 r0 = r13.f22253d
            v6.a.f(r0)
        L_0x0005:
            int r0 = r14.a()
            if (r0 <= 0) goto L_0x0219
            int r0 = r13.f22256g
            r1 = 86
            r2 = 1
            if (r0 == 0) goto L_0x020f
            r3 = 2
            r4 = 0
            if (r0 == r2) goto L_0x01f9
            r1 = 8
            r5 = 3
            if (r0 == r3) goto L_0x01c6
            if (r0 != r5) goto L_0x01c0
            int r0 = r14.a()
            int r3 = r13.f22258i
            int r6 = r13.f22257h
            int r3 = r3 - r6
            int r0 = java.lang.Math.min(r0, r3)
            d5.b0 r3 = r13.f22252c
            byte[] r3 = r3.f13001b
            int r6 = r13.f22257h
            r14.e(r3, r6, r0)
            int r3 = r13.f22257h
            int r3 = r3 + r0
            r13.f22257h = r3
            int r0 = r13.f22258i
            if (r3 != r0) goto L_0x0005
            d5.b0 r0 = r13.f22252c
            r0.p(r4)
            d5.b0 r0 = r13.f22252c
            boolean r3 = r0.h()
            if (r3 != 0) goto L_0x014c
            r13.f22261l = r2
            int r3 = r0.i(r2)
            if (r3 != r2) goto L_0x0056
            int r6 = r0.i(r2)
            goto L_0x0057
        L_0x0056:
            r6 = 0
        L_0x0057:
            r13.f22262m = r6
            if (r6 != 0) goto L_0x0146
            if (r3 != r2) goto L_0x0060
            b(r0)
        L_0x0060:
            boolean r6 = r0.h()
            if (r6 == 0) goto L_0x0140
            r6 = 6
            int r7 = r0.i(r6)
            r13.f22263n = r7
            r7 = 4
            int r8 = r0.i(r7)
            int r9 = r0.i(r5)
            if (r8 != 0) goto L_0x013a
            if (r9 != 0) goto L_0x013a
            if (r3 != 0) goto L_0x00cf
            int r8 = r0.g()
            int r9 = r13.g(r0)
            r0.p(r8)
            int r8 = r9 + 7
            int r8 = r8 / r1
            byte[] r8 = new byte[r8]
            r0.j(r8, r4, r9)
            x4.b0$b r9 = new x4.b0$b
            r9.<init>()
            java.lang.String r10 = r13.f22254e
            r9.f27415a = r10
            java.lang.String r10 = "audio/mp4a-latm"
            r9.f27425k = r10
            java.lang.String r10 = r13.f22270u
            r9.f27422h = r10
            int r10 = r13.f22269t
            r9.f27438x = r10
            int r10 = r13.f22267r
            r9.f27439y = r10
            java.util.List r8 = java.util.Collections.singletonList(r8)
            r9.f27427m = r8
            java.lang.String r8 = r13.f22250a
            r9.f27417c = r8
            x4.b0 r8 = r9.a()
            x4.b0 r9 = r13.f22255f
            boolean r9 = r8.equals(r9)
            if (r9 != 0) goto L_0x00dc
            r13.f22255f = r8
            r9 = 1024000000(0x3d090000, double:5.059232213E-315)
            int r11 = r8.H
            long r11 = (long) r11
            long r9 = r9 / r11
            r13.f22268s = r9
            d5.a0 r9 = r13.f22253d
            r9.c(r8)
            goto L_0x00dc
        L_0x00cf:
            long r8 = b(r0)
            int r9 = (int) r8
            int r8 = r13.g(r0)
            int r9 = r9 - r8
            r0.s(r9)
        L_0x00dc:
            int r8 = r0.i(r5)
            r13.f22264o = r8
            if (r8 == 0) goto L_0x0107
            if (r8 == r2) goto L_0x0101
            if (r8 == r5) goto L_0x00fd
            if (r8 == r7) goto L_0x00fd
            r5 = 5
            if (r8 == r5) goto L_0x00fd
            if (r8 == r6) goto L_0x00f9
            r5 = 7
            if (r8 != r5) goto L_0x00f3
            goto L_0x00f9
        L_0x00f3:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            r14.<init>()
            throw r14
        L_0x00f9:
            r0.s(r2)
            goto L_0x010a
        L_0x00fd:
            r0.s(r6)
            goto L_0x010a
        L_0x0101:
            r5 = 9
            r0.s(r5)
            goto L_0x010a
        L_0x0107:
            r0.s(r1)
        L_0x010a:
            boolean r5 = r0.h()
            r13.f22265p = r5
            r6 = 0
            r13.f22266q = r6
            if (r5 == 0) goto L_0x0130
            if (r3 != r2) goto L_0x011f
            long r2 = b(r0)
            r13.f22266q = r2
            goto L_0x0130
        L_0x011f:
            boolean r2 = r0.h()
            long r5 = r13.f22266q
            long r5 = r5 << r1
            int r3 = r0.i(r1)
            long r7 = (long) r3
            long r5 = r5 + r7
            r13.f22266q = r5
            if (r2 != 0) goto L_0x011f
        L_0x0130:
            boolean r2 = r0.h()
            if (r2 == 0) goto L_0x0151
            r0.s(r1)
            goto L_0x0151
        L_0x013a:
            x4.m0 r14 = new x4.m0
            r14.<init>()
            throw r14
        L_0x0140:
            x4.m0 r14 = new x4.m0
            r14.<init>()
            throw r14
        L_0x0146:
            x4.m0 r14 = new x4.m0
            r14.<init>()
            throw r14
        L_0x014c:
            boolean r2 = r13.f22261l
            if (r2 != 0) goto L_0x0151
            goto L_0x01a8
        L_0x0151:
            int r2 = r13.f22262m
            if (r2 != 0) goto L_0x01ba
            int r2 = r13.f22263n
            if (r2 != 0) goto L_0x01b4
            int r2 = r13.f22264o
            if (r2 != 0) goto L_0x01ae
            r2 = 0
        L_0x015e:
            int r3 = r0.i(r1)
            int r9 = r2 + r3
            r2 = 255(0xff, float:3.57E-43)
            if (r3 == r2) goto L_0x01ac
            int r1 = r0.g()
            r2 = r1 & 7
            if (r2 != 0) goto L_0x0178
            v6.v r2 = r13.f22251b
            int r1 = r1 >> 3
            r2.D(r1)
            goto L_0x0186
        L_0x0178:
            v6.v r1 = r13.f22251b
            byte[] r1 = r1.f26518a
            int r2 = r9 * 8
            r0.j(r1, r4, r2)
            v6.v r1 = r13.f22251b
            r1.D(r4)
        L_0x0186:
            d5.a0 r1 = r13.f22253d
            v6.v r2 = r13.f22251b
            r1.b(r2, r9)
            d5.a0 r5 = r13.f22253d
            long r6 = r13.f22260k
            r8 = 1
            r10 = 0
            r11 = 0
            r5.d(r6, r8, r9, r10, r11)
            long r1 = r13.f22260k
            long r5 = r13.f22268s
            long r1 = r1 + r5
            r13.f22260k = r1
            boolean r1 = r13.f22265p
            if (r1 == 0) goto L_0x01a8
            long r1 = r13.f22266q
            int r2 = (int) r1
            r0.s(r2)
        L_0x01a8:
            r13.f22256g = r4
            goto L_0x0005
        L_0x01ac:
            r2 = r9
            goto L_0x015e
        L_0x01ae:
            x4.m0 r14 = new x4.m0
            r14.<init>()
            throw r14
        L_0x01b4:
            x4.m0 r14 = new x4.m0
            r14.<init>()
            throw r14
        L_0x01ba:
            x4.m0 r14 = new x4.m0
            r14.<init>()
            throw r14
        L_0x01c0:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            r14.<init>()
            throw r14
        L_0x01c6:
            int r0 = r13.f22259j
            r0 = r0 & -225(0xffffffffffffff1f, float:NaN)
            int r0 = r0 << r1
            int r1 = r14.s()
            r0 = r0 | r1
            r13.f22258i = r0
            v6.v r1 = r13.f22251b
            byte[] r2 = r1.f26518a
            int r3 = r2.length
            if (r0 <= r3) goto L_0x01f3
            int r3 = r2.length
            if (r3 >= r0) goto L_0x01de
            byte[] r2 = new byte[r0]
        L_0x01de:
            r1.B(r2, r0)
            d5.b0 r0 = r13.f22252c
            v6.v r1 = r13.f22251b
            byte[] r1 = r1.f26518a
            r0.getClass()
            int r2 = r1.length
            r0.f13001b = r1
            r0.f13002c = r4
            r0.f13003d = r4
            r0.f13004e = r2
        L_0x01f3:
            r13.f22257h = r4
            r13.f22256g = r5
            goto L_0x0005
        L_0x01f9:
            int r0 = r14.s()
            r2 = r0 & 224(0xe0, float:3.14E-43)
            r5 = 224(0xe0, float:3.14E-43)
            if (r2 != r5) goto L_0x0209
            r13.f22259j = r0
            r13.f22256g = r3
            goto L_0x0005
        L_0x0209:
            if (r0 == r1) goto L_0x0005
            r13.f22256g = r4
            goto L_0x0005
        L_0x020f:
            int r0 = r14.s()
            if (r0 != r1) goto L_0x0005
            r13.f22256g = r2
            goto L_0x0005
        L_0x0219:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.p.c(v6.v):void");
    }

    public void d(k kVar, e0.d dVar) {
        dVar.a();
        this.f22253d = kVar.l(dVar.c(), 1);
        this.f22254e = dVar.b();
    }

    public void e() {
    }

    public void f(long j10, int i10) {
        this.f22260k = j10;
    }

    public final int g(b0 b0Var) throws m0 {
        int b10 = b0Var.b();
        a.b d10 = a.d(b0Var, true);
        this.f22270u = d10.f28282c;
        this.f22267r = d10.f28280a;
        this.f22269t = d10.f28281b;
        return b10 - b0Var.b();
    }
}
