package w;

import v.f;
import v.g;
import w.b;

/* compiled from: Direct */
public class h {

    /* renamed from: a  reason: collision with root package name */
    public static b.a f26834a = new b.a();

    /* renamed from: b  reason: collision with root package name */
    public static int f26835b;

    /* renamed from: c  reason: collision with root package name */
    public static int f26836c;

    public static boolean a(f fVar) {
        int m10 = fVar.m();
        int t10 = fVar.t();
        f fVar2 = fVar.V;
        g gVar = fVar2 != null ? (g) fVar2 : null;
        if (gVar != null) {
            gVar.m();
        }
        if (gVar != null) {
            gVar.t();
        }
        boolean z10 = m10 == 1 || fVar.D() || m10 == 2 || (m10 == 3 && fVar.f26281r == 0 && fVar.Y == 0.0f && fVar.x(0)) || (m10 == 3 && fVar.f26281r == 1 && fVar.y(0, fVar.u()));
        boolean z11 = t10 == 1 || fVar.E() || t10 == 2 || (t10 == 3 && fVar.f26282s == 0 && fVar.Y == 0.0f && fVar.x(1)) || (t10 == 3 && fVar.f26282s == 1 && fVar.y(1, fVar.l()));
        if (fVar.Y > 0.0f && (z10 || z11)) {
            return true;
        }
        if (!z10 || !z11) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0076, code lost:
        r5 = r13.L.f26234f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0084, code lost:
        r4 = r4.f26234f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b(int r17, v.f r18, w.b.C0268b r19, boolean r20) {
        /*
            r0 = r18
            r1 = r19
            r2 = r20
            boolean r3 = r0.f26271m
            if (r3 == 0) goto L_0x000b
            return
        L_0x000b:
            int r3 = f26835b
            r4 = 1
            int r3 = r3 + r4
            f26835b = r3
            boolean r3 = r0 instanceof v.g
            r5 = 0
            if (r3 != 0) goto L_0x002a
            boolean r3 = r18.C()
            if (r3 == 0) goto L_0x002a
            boolean r3 = a(r18)
            if (r3 == 0) goto L_0x002a
            w.b$a r3 = new w.b$a
            r3.<init>()
            v.g.e0(r0, r1, r3, r5)
        L_0x002a:
            v.d$a r3 = v.d.a.LEFT
            v.d r3 = r0.i(r3)
            v.d$a r6 = v.d.a.RIGHT
            v.d r6 = r0.i(r6)
            int r7 = r3.c()
            int r8 = r6.c()
            java.util.HashSet<v.d> r9 = r3.f26229a
            r10 = 0
            r11 = 8
            r12 = 3
            if (r9 == 0) goto L_0x0116
            boolean r3 = r3.f26231c
            if (r3 == 0) goto L_0x0116
            java.util.Iterator r3 = r9.iterator()
        L_0x004e:
            boolean r9 = r3.hasNext()
            if (r9 == 0) goto L_0x0116
            java.lang.Object r9 = r3.next()
            v.d r9 = (v.d) r9
            v.f r13 = r9.f26232d
            int r14 = r17 + 1
            boolean r15 = a(r13)
            boolean r16 = r13.C()
            if (r16 == 0) goto L_0x0072
            if (r15 == 0) goto L_0x0072
            w.b$a r4 = new w.b$a
            r4.<init>()
            v.g.e0(r13, r1, r4, r5)
        L_0x0072:
            v.d r4 = r13.J
            if (r9 != r4) goto L_0x0080
            v.d r5 = r13.L
            v.d r5 = r5.f26234f
            if (r5 == 0) goto L_0x0080
            boolean r5 = r5.f26231c
            if (r5 != 0) goto L_0x008c
        L_0x0080:
            v.d r5 = r13.L
            if (r9 != r5) goto L_0x008e
            v.d r4 = r4.f26234f
            if (r4 == 0) goto L_0x008e
            boolean r4 = r4.f26231c
            if (r4 == 0) goto L_0x008e
        L_0x008c:
            r4 = 1
            goto L_0x008f
        L_0x008e:
            r4 = 0
        L_0x008f:
            int r5 = r13.m()
            if (r5 != r12) goto L_0x00ca
            if (r15 == 0) goto L_0x0098
            goto L_0x00ca
        L_0x0098:
            int r5 = r13.m()
            if (r5 != r12) goto L_0x0112
            int r5 = r13.f26285v
            if (r5 < 0) goto L_0x0112
            int r5 = r13.f26284u
            if (r5 < 0) goto L_0x0112
            int r5 = r13.f26264i0
            if (r5 == r11) goto L_0x00b4
            int r5 = r13.f26281r
            if (r5 != 0) goto L_0x0112
            float r5 = r13.Y
            int r5 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r5 != 0) goto L_0x0112
        L_0x00b4:
            boolean r5 = r13.A()
            if (r5 != 0) goto L_0x0112
            boolean r5 = r13.G
            if (r5 != 0) goto L_0x0112
            if (r4 == 0) goto L_0x0112
            boolean r4 = r13.A()
            if (r4 != 0) goto L_0x0112
            d(r14, r0, r1, r13, r2)
            goto L_0x0112
        L_0x00ca:
            boolean r5 = r13.C()
            if (r5 == 0) goto L_0x00d1
            goto L_0x0112
        L_0x00d1:
            v.d r5 = r13.J
            if (r9 != r5) goto L_0x00ec
            v.d r15 = r13.L
            v.d r15 = r15.f26234f
            if (r15 != 0) goto L_0x00ec
            int r4 = r5.d()
            int r4 = r4 + r7
            int r5 = r13.u()
            int r5 = r5 + r4
            r13.L(r4, r5)
            b(r14, r13, r1, r2)
            goto L_0x0112
        L_0x00ec:
            v.d r15 = r13.L
            if (r9 != r15) goto L_0x0107
            v.d r5 = r5.f26234f
            if (r5 != 0) goto L_0x0107
            int r4 = r15.d()
            int r4 = r7 - r4
            int r5 = r13.u()
            int r5 = r4 - r5
            r13.L(r5, r4)
            b(r14, r13, r1, r2)
            goto L_0x0112
        L_0x0107:
            if (r4 == 0) goto L_0x0112
            boolean r4 = r13.A()
            if (r4 != 0) goto L_0x0112
            c(r14, r1, r13, r2)
        L_0x0112:
            r4 = 1
            r5 = 0
            goto L_0x004e
        L_0x0116:
            boolean r3 = r0 instanceof v.h
            if (r3 == 0) goto L_0x011b
            return
        L_0x011b:
            java.util.HashSet<v.d> r3 = r6.f26229a
            if (r3 == 0) goto L_0x01f4
            boolean r4 = r6.f26231c
            if (r4 == 0) goto L_0x01f4
            java.util.Iterator r3 = r3.iterator()
        L_0x0127:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x01f4
            java.lang.Object r4 = r3.next()
            v.d r4 = (v.d) r4
            v.f r5 = r4.f26232d
            r6 = 1
            int r7 = r17 + 1
            boolean r6 = a(r5)
            boolean r9 = r5.C()
            if (r9 == 0) goto L_0x014e
            if (r6 == 0) goto L_0x014e
            w.b$a r9 = new w.b$a
            r9.<init>()
            r13 = 0
            v.g.e0(r5, r1, r9, r13)
            goto L_0x014f
        L_0x014e:
            r13 = 0
        L_0x014f:
            v.d r9 = r5.J
            if (r4 != r9) goto L_0x015d
            v.d r14 = r5.L
            v.d r14 = r14.f26234f
            if (r14 == 0) goto L_0x015d
            boolean r14 = r14.f26231c
            if (r14 != 0) goto L_0x0169
        L_0x015d:
            v.d r14 = r5.L
            if (r4 != r14) goto L_0x016b
            v.d r9 = r9.f26234f
            if (r9 == 0) goto L_0x016b
            boolean r9 = r9.f26231c
            if (r9 == 0) goto L_0x016b
        L_0x0169:
            r9 = 1
            goto L_0x016c
        L_0x016b:
            r9 = 0
        L_0x016c:
            int r14 = r5.m()
            if (r14 != r12) goto L_0x01a7
            if (r6 == 0) goto L_0x0175
            goto L_0x01a7
        L_0x0175:
            int r4 = r5.m()
            if (r4 != r12) goto L_0x0127
            int r4 = r5.f26285v
            if (r4 < 0) goto L_0x0127
            int r4 = r5.f26284u
            if (r4 < 0) goto L_0x0127
            int r4 = r5.f26264i0
            if (r4 == r11) goto L_0x0191
            int r4 = r5.f26281r
            if (r4 != 0) goto L_0x0127
            float r4 = r5.Y
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 != 0) goto L_0x0127
        L_0x0191:
            boolean r4 = r5.A()
            if (r4 != 0) goto L_0x0127
            boolean r4 = r5.G
            if (r4 != 0) goto L_0x0127
            if (r9 == 0) goto L_0x0127
            boolean r4 = r5.A()
            if (r4 != 0) goto L_0x0127
            d(r7, r0, r1, r5, r2)
            goto L_0x0127
        L_0x01a7:
            boolean r6 = r5.C()
            if (r6 == 0) goto L_0x01af
            goto L_0x0127
        L_0x01af:
            v.d r6 = r5.J
            if (r4 != r6) goto L_0x01cb
            v.d r14 = r5.L
            v.d r14 = r14.f26234f
            if (r14 != 0) goto L_0x01cb
            int r4 = r6.d()
            int r4 = r4 + r8
            int r6 = r5.u()
            int r6 = r6 + r4
            r5.L(r4, r6)
            b(r7, r5, r1, r2)
            goto L_0x0127
        L_0x01cb:
            v.d r14 = r5.L
            if (r4 != r14) goto L_0x01e7
            v.d r4 = r6.f26234f
            if (r4 != 0) goto L_0x01e7
            int r4 = r14.d()
            int r4 = r8 - r4
            int r6 = r5.u()
            int r6 = r4 - r6
            r5.L(r6, r4)
            b(r7, r5, r1, r2)
            goto L_0x0127
        L_0x01e7:
            if (r9 == 0) goto L_0x0127
            boolean r4 = r5.A()
            if (r4 != 0) goto L_0x0127
            c(r7, r1, r5, r2)
            goto L_0x0127
        L_0x01f4:
            r1 = 1
            r0.f26271m = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w.h.b(int, v.f, w.b$b, boolean):void");
    }

    public static void c(int i10, b.C0268b bVar, f fVar, boolean z10) {
        float f10 = fVar.f26258f0;
        int c10 = fVar.J.f26234f.c();
        int c11 = fVar.L.f26234f.c();
        int d10 = fVar.J.d() + c10;
        int d11 = c11 - fVar.L.d();
        if (c10 == c11) {
            f10 = 0.5f;
        } else {
            c10 = d10;
            c11 = d11;
        }
        int u10 = fVar.u();
        int i11 = (c11 - c10) - u10;
        if (c10 > c11) {
            i11 = (c10 - c11) - u10;
        }
        int i12 = ((int) (i11 > 0 ? (f10 * ((float) i11)) + 0.5f : f10 * ((float) i11))) + c10;
        int i13 = i12 + u10;
        if (c10 > c11) {
            i13 = i12 - u10;
        }
        fVar.L(i12, i13);
        b(i10 + 1, fVar, bVar, z10);
    }

    public static void d(int i10, f fVar, b.C0268b bVar, f fVar2, boolean z10) {
        int i11;
        float f10 = fVar2.f26258f0;
        int d10 = fVar2.J.d() + fVar2.J.f26234f.c();
        int c10 = fVar2.L.f26234f.c() - fVar2.L.d();
        if (c10 >= d10) {
            int u10 = fVar2.u();
            if (fVar2.f26264i0 != 8) {
                int i12 = fVar2.f26281r;
                if (i12 == 2) {
                    if (fVar instanceof g) {
                        i11 = fVar.u();
                    } else {
                        i11 = fVar.V.u();
                    }
                    u10 = (int) (fVar2.f26258f0 * 0.5f * ((float) i11));
                } else if (i12 == 0) {
                    u10 = c10 - d10;
                }
                u10 = Math.max(fVar2.f26284u, u10);
                int i13 = fVar2.f26285v;
                if (i13 > 0) {
                    u10 = Math.min(i13, u10);
                }
            }
            int i14 = d10 + ((int) ((f10 * ((float) ((c10 - d10) - u10))) + 0.5f));
            fVar2.L(i14, u10 + i14);
            b(i10 + 1, fVar2, bVar, z10);
        }
    }

    public static void e(int i10, b.C0268b bVar, f fVar) {
        float f10 = fVar.f26260g0;
        int c10 = fVar.K.f26234f.c();
        int c11 = fVar.M.f26234f.c();
        int d10 = fVar.K.d() + c10;
        int d11 = c11 - fVar.M.d();
        if (c10 == c11) {
            f10 = 0.5f;
        } else {
            c10 = d10;
            c11 = d11;
        }
        int l10 = fVar.l();
        int i11 = (c11 - c10) - l10;
        if (c10 > c11) {
            i11 = (c10 - c11) - l10;
        }
        int i12 = (int) (i11 > 0 ? (f10 * ((float) i11)) + 0.5f : f10 * ((float) i11));
        int i13 = c10 + i12;
        int i14 = i13 + l10;
        if (c10 > c11) {
            i13 = c10 - i12;
            i14 = i13 - l10;
        }
        fVar.M(i13, i14);
        g(i10 + 1, fVar, bVar);
    }

    public static void f(int i10, f fVar, b.C0268b bVar, f fVar2) {
        int i11;
        float f10 = fVar2.f26260g0;
        int d10 = fVar2.K.d() + fVar2.K.f26234f.c();
        int c10 = fVar2.M.f26234f.c() - fVar2.M.d();
        if (c10 >= d10) {
            int l10 = fVar2.l();
            if (fVar2.f26264i0 != 8) {
                int i12 = fVar2.f26282s;
                if (i12 == 2) {
                    if (fVar instanceof g) {
                        i11 = fVar.l();
                    } else {
                        i11 = fVar.V.l();
                    }
                    l10 = (int) (f10 * 0.5f * ((float) i11));
                } else if (i12 == 0) {
                    l10 = c10 - d10;
                }
                l10 = Math.max(fVar2.f26287x, l10);
                int i13 = fVar2.f26288y;
                if (i13 > 0) {
                    l10 = Math.min(i13, l10);
                }
            }
            int i14 = d10 + ((int) ((f10 * ((float) ((c10 - d10) - l10))) + 0.5f));
            fVar2.M(i14, l10 + i14);
            g(i10 + 1, fVar2, bVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0074, code lost:
        r3 = r12.M.f26234f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0082, code lost:
        r3 = r15.f26234f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void g(int r16, v.f r17, w.b.C0268b r18) {
        /*
            r0 = r17
            r1 = r18
            boolean r2 = r0.f26273n
            if (r2 == 0) goto L_0x0009
            return
        L_0x0009:
            int r2 = f26836c
            r3 = 1
            int r2 = r2 + r3
            f26836c = r2
            boolean r2 = r0 instanceof v.g
            r4 = 0
            if (r2 != 0) goto L_0x0028
            boolean r2 = r17.C()
            if (r2 == 0) goto L_0x0028
            boolean r2 = a(r17)
            if (r2 == 0) goto L_0x0028
            w.b$a r2 = new w.b$a
            r2.<init>()
            v.g.e0(r0, r1, r2, r4)
        L_0x0028:
            v.d$a r2 = v.d.a.TOP
            v.d r2 = r0.i(r2)
            v.d$a r5 = v.d.a.BOTTOM
            v.d r5 = r0.i(r5)
            int r6 = r2.c()
            int r7 = r5.c()
            java.util.HashSet<v.d> r8 = r2.f26229a
            r9 = 0
            r10 = 8
            r11 = 3
            if (r8 == 0) goto L_0x0113
            boolean r2 = r2.f26231c
            if (r2 == 0) goto L_0x0113
            java.util.Iterator r2 = r8.iterator()
        L_0x004c:
            boolean r8 = r2.hasNext()
            if (r8 == 0) goto L_0x0113
            java.lang.Object r8 = r2.next()
            v.d r8 = (v.d) r8
            v.f r12 = r8.f26232d
            int r13 = r16 + 1
            boolean r14 = a(r12)
            boolean r15 = r12.C()
            if (r15 == 0) goto L_0x0070
            if (r14 == 0) goto L_0x0070
            w.b$a r15 = new w.b$a
            r15.<init>()
            v.g.e0(r12, r1, r15, r4)
        L_0x0070:
            v.d r15 = r12.K
            if (r8 != r15) goto L_0x007e
            v.d r3 = r12.M
            v.d r3 = r3.f26234f
            if (r3 == 0) goto L_0x007e
            boolean r3 = r3.f26231c
            if (r3 != 0) goto L_0x008a
        L_0x007e:
            v.d r3 = r12.M
            if (r8 != r3) goto L_0x008c
            v.d r3 = r15.f26234f
            if (r3 == 0) goto L_0x008c
            boolean r3 = r3.f26231c
            if (r3 == 0) goto L_0x008c
        L_0x008a:
            r3 = 1
            goto L_0x008d
        L_0x008c:
            r3 = 0
        L_0x008d:
            int r15 = r12.t()
            if (r15 != r11) goto L_0x00c8
            if (r14 == 0) goto L_0x0096
            goto L_0x00c8
        L_0x0096:
            int r8 = r12.t()
            if (r8 != r11) goto L_0x0110
            int r8 = r12.f26288y
            if (r8 < 0) goto L_0x0110
            int r8 = r12.f26287x
            if (r8 < 0) goto L_0x0110
            int r8 = r12.f26264i0
            if (r8 == r10) goto L_0x00b2
            int r8 = r12.f26282s
            if (r8 != 0) goto L_0x0110
            float r8 = r12.Y
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 != 0) goto L_0x0110
        L_0x00b2:
            boolean r8 = r12.B()
            if (r8 != 0) goto L_0x0110
            boolean r8 = r12.G
            if (r8 != 0) goto L_0x0110
            if (r3 == 0) goto L_0x0110
            boolean r3 = r12.B()
            if (r3 != 0) goto L_0x0110
            f(r13, r0, r1, r12)
            goto L_0x0110
        L_0x00c8:
            boolean r14 = r12.C()
            if (r14 == 0) goto L_0x00cf
            goto L_0x0110
        L_0x00cf:
            v.d r14 = r12.K
            if (r8 != r14) goto L_0x00ea
            v.d r15 = r12.M
            v.d r15 = r15.f26234f
            if (r15 != 0) goto L_0x00ea
            int r3 = r14.d()
            int r3 = r3 + r6
            int r8 = r12.l()
            int r8 = r8 + r3
            r12.M(r3, r8)
            g(r13, r12, r1)
            goto L_0x0110
        L_0x00ea:
            v.d r15 = r12.M
            if (r8 != r15) goto L_0x0105
            v.d r8 = r14.f26234f
            if (r8 != 0) goto L_0x0105
            int r3 = r15.d()
            int r3 = r6 - r3
            int r8 = r12.l()
            int r8 = r3 - r8
            r12.M(r8, r3)
            g(r13, r12, r1)
            goto L_0x0110
        L_0x0105:
            if (r3 == 0) goto L_0x0110
            boolean r3 = r12.B()
            if (r3 != 0) goto L_0x0110
            e(r13, r1, r12)
        L_0x0110:
            r3 = 1
            goto L_0x004c
        L_0x0113:
            boolean r2 = r0 instanceof v.h
            if (r2 == 0) goto L_0x0118
            return
        L_0x0118:
            java.util.HashSet<v.d> r2 = r5.f26229a
            if (r2 == 0) goto L_0x01ed
            boolean r3 = r5.f26231c
            if (r3 == 0) goto L_0x01ed
            java.util.Iterator r2 = r2.iterator()
        L_0x0124:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x01ed
            java.lang.Object r3 = r2.next()
            v.d r3 = (v.d) r3
            v.f r5 = r3.f26232d
            int r6 = r16 + 1
            boolean r8 = a(r5)
            boolean r12 = r5.C()
            if (r12 == 0) goto L_0x0148
            if (r8 == 0) goto L_0x0148
            w.b$a r12 = new w.b$a
            r12.<init>()
            v.g.e0(r5, r1, r12, r4)
        L_0x0148:
            v.d r12 = r5.K
            if (r3 != r12) goto L_0x0156
            v.d r13 = r5.M
            v.d r13 = r13.f26234f
            if (r13 == 0) goto L_0x0156
            boolean r13 = r13.f26231c
            if (r13 != 0) goto L_0x0162
        L_0x0156:
            v.d r13 = r5.M
            if (r3 != r13) goto L_0x0164
            v.d r12 = r12.f26234f
            if (r12 == 0) goto L_0x0164
            boolean r12 = r12.f26231c
            if (r12 == 0) goto L_0x0164
        L_0x0162:
            r12 = 1
            goto L_0x0165
        L_0x0164:
            r12 = 0
        L_0x0165:
            int r13 = r5.t()
            if (r13 != r11) goto L_0x01a0
            if (r8 == 0) goto L_0x016e
            goto L_0x01a0
        L_0x016e:
            int r3 = r5.t()
            if (r3 != r11) goto L_0x0124
            int r3 = r5.f26288y
            if (r3 < 0) goto L_0x0124
            int r3 = r5.f26287x
            if (r3 < 0) goto L_0x0124
            int r3 = r5.f26264i0
            if (r3 == r10) goto L_0x018a
            int r3 = r5.f26282s
            if (r3 != 0) goto L_0x0124
            float r3 = r5.Y
            int r3 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r3 != 0) goto L_0x0124
        L_0x018a:
            boolean r3 = r5.B()
            if (r3 != 0) goto L_0x0124
            boolean r3 = r5.G
            if (r3 != 0) goto L_0x0124
            if (r12 == 0) goto L_0x0124
            boolean r3 = r5.B()
            if (r3 != 0) goto L_0x0124
            f(r6, r0, r1, r5)
            goto L_0x0124
        L_0x01a0:
            boolean r8 = r5.C()
            if (r8 == 0) goto L_0x01a8
            goto L_0x0124
        L_0x01a8:
            v.d r8 = r5.K
            if (r3 != r8) goto L_0x01c4
            v.d r13 = r5.M
            v.d r13 = r13.f26234f
            if (r13 != 0) goto L_0x01c4
            int r3 = r8.d()
            int r3 = r3 + r7
            int r8 = r5.l()
            int r8 = r8 + r3
            r5.M(r3, r8)
            g(r6, r5, r1)
            goto L_0x0124
        L_0x01c4:
            v.d r13 = r5.M
            if (r3 != r13) goto L_0x01e0
            v.d r3 = r8.f26234f
            if (r3 != 0) goto L_0x01e0
            int r3 = r13.d()
            int r3 = r7 - r3
            int r8 = r5.l()
            int r8 = r3 - r8
            r5.M(r8, r3)
            g(r6, r5, r1)
            goto L_0x0124
        L_0x01e0:
            if (r12 == 0) goto L_0x0124
            boolean r3 = r5.B()
            if (r3 != 0) goto L_0x0124
            e(r6, r1, r5)
            goto L_0x0124
        L_0x01ed:
            v.d$a r2 = v.d.a.BASELINE
            v.d r2 = r0.i(r2)
            java.util.HashSet<v.d> r3 = r2.f26229a
            if (r3 == 0) goto L_0x026a
            boolean r3 = r2.f26231c
            if (r3 == 0) goto L_0x026a
            int r3 = r2.c()
            java.util.HashSet<v.d> r2 = r2.f26229a
            java.util.Iterator r2 = r2.iterator()
        L_0x0205:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x026a
            java.lang.Object r5 = r2.next()
            v.d r5 = (v.d) r5
            v.f r6 = r5.f26232d
            r7 = 1
            int r8 = r16 + 1
            boolean r7 = a(r6)
            boolean r9 = r6.C()
            if (r9 == 0) goto L_0x022a
            if (r7 == 0) goto L_0x022a
            w.b$a r9 = new w.b$a
            r9.<init>()
            v.g.e0(r6, r1, r9, r4)
        L_0x022a:
            int r9 = r6.t()
            if (r9 != r11) goto L_0x0232
            if (r7 == 0) goto L_0x0205
        L_0x0232:
            boolean r7 = r6.C()
            if (r7 == 0) goto L_0x0239
            goto L_0x0205
        L_0x0239:
            v.d r7 = r6.N
            if (r5 != r7) goto L_0x0205
            int r5 = r5.d()
            int r5 = r5 + r3
            boolean r7 = r6.E
            if (r7 != 0) goto L_0x0247
            goto L_0x0263
        L_0x0247:
            int r7 = r6.f26252c0
            int r7 = r5 - r7
            int r9 = r6.X
            int r9 = r9 + r7
            r6.f26250b0 = r7
            v.d r10 = r6.K
            r10.j(r7)
            v.d r7 = r6.M
            r7.j(r9)
            v.d r7 = r6.N
            r7.f26230b = r5
            r5 = 1
            r7.f26231c = r5
            r6.f26269l = r5
        L_0x0263:
            g(r8, r6, r1)     // Catch:{ all -> 0x0267 }
            goto L_0x0205
        L_0x0267:
            r0 = move-exception
            r1 = r0
            throw r1
        L_0x026a:
            r1 = 1
            r0.f26273n = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w.h.g(int, v.f, w.b$b):void");
    }
}
