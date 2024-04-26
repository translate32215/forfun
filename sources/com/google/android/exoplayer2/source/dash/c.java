package com.google.android.exoplayer2.source.dash;

import b6.d;
import b6.l;
import b6.m;
import com.google.android.exoplayer2.source.dash.a;
import com.google.android.exoplayer2.source.dash.e;
import com.google.android.exoplayer2.upstream.e;
import com.google.android.exoplayer2.upstream.o;
import d5.x;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import r6.h;
import u6.i;
import v6.e0;
import x4.b0;
import x4.f;
import x4.z0;

/* compiled from: DefaultDashChunkSource */
public class c implements a {

    /* renamed from: a  reason: collision with root package name */
    public final o f5089a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f5090b;

    /* renamed from: c  reason: collision with root package name */
    public final int f5091c;

    /* renamed from: d  reason: collision with root package name */
    public final e f5092d;

    /* renamed from: e  reason: collision with root package name */
    public final long f5093e;

    /* renamed from: f  reason: collision with root package name */
    public final e.c f5094f;

    /* renamed from: g  reason: collision with root package name */
    public final b[] f5095g;

    /* renamed from: h  reason: collision with root package name */
    public h f5096h;

    /* renamed from: i  reason: collision with root package name */
    public d6.b f5097i;

    /* renamed from: j  reason: collision with root package name */
    public int f5098j;

    /* renamed from: k  reason: collision with root package name */
    public IOException f5099k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f5100l;

    /* compiled from: DefaultDashChunkSource */
    public static final class a implements a.C0075a {

        /* renamed from: a  reason: collision with root package name */
        public final e.a f5101a;

        public a(e.a aVar) {
            this.f5101a = aVar;
        }

        public a a(o oVar, d6.b bVar, int i10, int[] iArr, h hVar, int i11, long j10, boolean z10, List<b0> list, e.c cVar, i iVar) {
            i iVar2 = iVar;
            com.google.android.exoplayer2.upstream.e a10 = this.f5101a.a();
            if (iVar2 != null) {
                a10.P(iVar2);
            }
            return new c(oVar, bVar, i10, iArr, hVar, i11, a10, j10, 1, z10, list, cVar);
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.dash.c$c  reason: collision with other inner class name */
    /* compiled from: DefaultDashChunkSource */
    public static final class C0076c extends b6.b {
        public C0076c(b bVar, long j10, long j11, long j12) {
            super(j10, j11);
        }
    }

    public c(o oVar, d6.b bVar, int i10, int[] iArr, h hVar, int i11, com.google.android.exoplayer2.upstream.e eVar, long j10, int i12, boolean z10, List<b0> list, e.c cVar) {
        h hVar2 = hVar;
        this.f5089a = oVar;
        this.f5097i = bVar;
        this.f5090b = iArr;
        this.f5096h = hVar2;
        this.f5091c = i11;
        this.f5092d = eVar;
        this.f5098j = i10;
        this.f5093e = j10;
        this.f5094f = cVar;
        long b10 = f.b(bVar.d(i10));
        ArrayList<d6.i> m10 = m();
        this.f5095g = new b[hVar.length()];
        for (int i13 = 0; i13 < this.f5095g.length; i13++) {
            this.f5095g[i13] = new b(b10, i11, m10.get(hVar2.f(i13)), z10, list, cVar);
        }
    }

    public void a() {
        for (b bVar : this.f5095g) {
            b6.f fVar = bVar.f5102a;
            if (fVar != null) {
                ((d) fVar).f3573a.a();
            }
        }
    }

    public void b() throws IOException {
        IOException iOException = this.f5099k;
        if (iOException == null) {
            this.f5089a.b();
            return;
        }
        throw iOException;
    }

    public long c(long j10, z0 z0Var) {
        long j11 = j10;
        for (b bVar : this.f5095g) {
            c6.b bVar2 = bVar.f5104c;
            if (bVar2 != null) {
                long h10 = bVar2.h(j11, bVar.f5105d) + bVar.f5106e;
                long f10 = bVar.f(h10);
                int d10 = bVar.d();
                return z0Var.a(j10, f10, (f10 >= j11 || (d10 != -1 && h10 >= ((bVar.f5104c.x() + bVar.f5106e) + ((long) d10)) - 1)) ? f10 : bVar.f(h10 + 1));
            }
        }
        return j11;
    }

    public void d(h hVar) {
        this.f5096h = hVar;
    }

    public boolean e(long j10, b6.e eVar, List<? extends m> list) {
        if (this.f5099k != null) {
            return false;
        }
        return this.f5096h.r(j10, eVar, list);
    }

    public void f(d6.b bVar, int i10) {
        try {
            this.f5097i = bVar;
            this.f5098j = i10;
            long e10 = bVar.e(i10);
            ArrayList<d6.i> m10 = m();
            for (int i11 = 0; i11 < this.f5095g.length; i11++) {
                b[] bVarArr = this.f5095g;
                bVarArr[i11] = bVarArr[i11].a(e10, m10.get(this.f5096h.f(i11)));
            }
        } catch (z5.b e11) {
            this.f5099k = e11;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0035 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean g(b6.e r10, boolean r11, java.lang.Exception r12, long r13) {
        /*
            r9 = this;
            r0 = 0
            if (r11 != 0) goto L_0x0004
            return r0
        L_0x0004:
            com.google.android.exoplayer2.source.dash.e$c r11 = r9.f5094f
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3 = 1
            if (r11 == 0) goto L_0x0036
            long r4 = r11.f5130d
            int r6 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r6 == 0) goto L_0x001c
            long r6 = r10.f3595g
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 >= 0) goto L_0x001c
            r4 = 1
            goto L_0x001d
        L_0x001c:
            r4 = 0
        L_0x001d:
            com.google.android.exoplayer2.source.dash.e r11 = com.google.android.exoplayer2.source.dash.e.this
            d6.b r5 = r11.f5120f
            boolean r5 = r5.f13080d
            if (r5 != 0) goto L_0x0026
            goto L_0x0032
        L_0x0026:
            boolean r5 = r11.f5123i
            if (r5 == 0) goto L_0x002b
            goto L_0x0030
        L_0x002b:
            if (r4 == 0) goto L_0x0032
            r11.a()
        L_0x0030:
            r11 = 1
            goto L_0x0033
        L_0x0032:
            r11 = 0
        L_0x0033:
            if (r11 == 0) goto L_0x0036
            return r3
        L_0x0036:
            d6.b r11 = r9.f5097i
            boolean r11 = r11.f13080d
            if (r11 != 0) goto L_0x007d
            boolean r11 = r10 instanceof b6.m
            if (r11 == 0) goto L_0x007d
            boolean r11 = r12 instanceof com.google.android.exoplayer2.upstream.m.f
            if (r11 == 0) goto L_0x007d
            com.google.android.exoplayer2.upstream.m$f r12 = (com.google.android.exoplayer2.upstream.m.f) r12
            int r11 = r12.f5524a
            r12 = 404(0x194, float:5.66E-43)
            if (r11 != r12) goto L_0x007d
            com.google.android.exoplayer2.source.dash.c$b[] r11 = r9.f5095g
            r6.h r12 = r9.f5096h
            x4.b0 r4 = r10.f3592d
            int r12 = r12.o(r4)
            r11 = r11[r12]
            int r12 = r11.d()
            r4 = -1
            if (r12 == r4) goto L_0x007d
            if (r12 == 0) goto L_0x007d
            c6.b r4 = r11.f5104c
            long r4 = r4.x()
            long r6 = r11.f5106e
            long r4 = r4 + r6
            long r11 = (long) r12
            long r4 = r4 + r11
            r11 = 1
            long r4 = r4 - r11
            r11 = r10
            b6.m r11 = (b6.m) r11
            long r11 = r11.c()
            int r6 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x007d
            r9.f5100l = r3
            return r3
        L_0x007d:
            int r11 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r11 == 0) goto L_0x0090
            r6.h r11 = r9.f5096h
            x4.b0 r10 = r10.f3592d
            int r10 = r11.o(r10)
            boolean r10 = r11.a(r10, r13)
            if (r10 == 0) goto L_0x0090
            r0 = 1
        L_0x0090:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.c.g(b6.e, boolean, java.lang.Exception, long):boolean");
    }

    public int i(long j10, List<? extends m> list) {
        if (this.f5099k != null || this.f5096h.length() < 2) {
            return list.size();
        }
        return this.f5096h.g(j10, list);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: java.lang.Object} */
    /* JADX WARNING: type inference failed for: r31v6, types: [b6.j] */
    /* JADX WARNING: type inference failed for: r31v7, types: [b6.o] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void j(long r54, long r56, java.util.List<? extends b6.m> r58, b6.g r59) {
        /*
            r53 = this;
            r9 = r53
            r10 = r59
            java.io.IOException r0 = r9.f5099k
            if (r0 == 0) goto L_0x0009
            return
        L_0x0009:
            long r11 = r56 - r54
            d6.b r0 = r9.f5097i
            long r0 = r0.f13077a
            long r0 = x4.f.b(r0)
            d6.b r2 = r9.f5097i
            int r3 = r9.f5098j
            d6.f r2 = r2.b(r3)
            long r2 = r2.f13110b
            long r2 = x4.f.b(r2)
            long r2 = r2 + r0
            long r2 = r2 + r56
            com.google.android.exoplayer2.source.dash.e$c r0 = r9.f5094f
            r13 = 0
            r14 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = 1
            if (r0 == 0) goto L_0x0084
            com.google.android.exoplayer2.source.dash.e r0 = com.google.android.exoplayer2.source.dash.e.this
            d6.b r1 = r0.f5120f
            boolean r4 = r1.f13080d
            if (r4 != 0) goto L_0x0039
            r1 = 0
            goto L_0x0081
        L_0x0039:
            boolean r4 = r0.f5123i
            if (r4 == 0) goto L_0x003f
            r1 = 1
            goto L_0x0081
        L_0x003f:
            long r4 = r1.f13084h
            java.util.TreeMap<java.lang.Long, java.lang.Long> r1 = r0.f5119e
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.util.Map$Entry r1 = r1.ceilingEntry(r4)
            if (r1 == 0) goto L_0x007b
            java.lang.Object r4 = r1.getValue()
            java.lang.Long r4 = (java.lang.Long) r4
            long r4 = r4.longValue()
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 >= 0) goto L_0x007b
            java.lang.Object r1 = r1.getKey()
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r0.f5121g = r1
            com.google.android.exoplayer2.source.dash.e$b r3 = r0.f5116b
            com.google.android.exoplayer2.source.dash.DashMediaSource$c r3 = (com.google.android.exoplayer2.source.dash.DashMediaSource.c) r3
            com.google.android.exoplayer2.source.dash.DashMediaSource r3 = com.google.android.exoplayer2.source.dash.DashMediaSource.this
            long r4 = r3.Z
            int r6 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r6 == 0) goto L_0x0077
            int r6 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r6 >= 0) goto L_0x0079
        L_0x0077:
            r3.Z = r1
        L_0x0079:
            r1 = 1
            goto L_0x007c
        L_0x007b:
            r1 = 0
        L_0x007c:
            if (r1 == 0) goto L_0x0081
            r0.a()
        L_0x0081:
            if (r1 == 0) goto L_0x0084
            return
        L_0x0084:
            long r0 = r9.f5093e
            long r0 = v6.e0.w(r0)
            long r5 = x4.f.b(r0)
            long r3 = r9.l(r5)
            boolean r0 = r58.isEmpty()
            r24 = 0
            if (r0 == 0) goto L_0x009f
            r8 = r58
            r25 = r24
            goto L_0x00ae
        L_0x009f:
            int r0 = r58.size()
            int r0 = r0 - r7
            r8 = r58
            java.lang.Object r0 = r8.get(r0)
            b6.m r0 = (b6.m) r0
            r25 = r0
        L_0x00ae:
            r6.h r0 = r9.f5096h
            int r2 = r0.length()
            b6.n[] r1 = new b6.n[r2]
            r0 = 0
        L_0x00b7:
            if (r0 >= r2) goto L_0x0120
            com.google.android.exoplayer2.source.dash.c$b[] r7 = r9.f5095g
            r7 = r7[r0]
            c6.b r14 = r7.f5104c
            if (r14 != 0) goto L_0x00d2
            b6.n r7 = b6.n.f3636a
            r1[r0] = r7
            r26 = r0
            r27 = r1
            r28 = r2
            r29 = r3
            r31 = r11
            r12 = 1
            r10 = r5
            goto L_0x010a
        L_0x00d2:
            long r14 = r7.b(r5)
            long r20 = r7.c(r5)
            r26 = r0
            r0 = r53
            r27 = r1
            r1 = r7
            r28 = r2
            r2 = r25
            r29 = r3
            r3 = r56
            r31 = r11
            r10 = r5
            r5 = r14
            r17 = r7
            r12 = 1
            r7 = r20
            long r18 = r0.n(r1, r2, r3, r5, r7)
            int r0 = (r18 > r14 ? 1 : (r18 == r14 ? 0 : -1))
            if (r0 >= 0) goto L_0x00ff
            b6.n r0 = b6.n.f3636a
            r27[r26] = r0
            goto L_0x010a
        L_0x00ff:
            com.google.android.exoplayer2.source.dash.c$c r0 = new com.google.android.exoplayer2.source.dash.c$c
            r16 = r0
            r22 = r29
            r16.<init>(r17, r18, r20, r22)
            r27[r26] = r0
        L_0x010a:
            int r0 = r26 + 1
            r8 = r58
            r5 = r10
            r1 = r27
            r2 = r28
            r3 = r29
            r11 = r31
            r7 = 1
            r14 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r10 = r59
            goto L_0x00b7
        L_0x0120:
            r27 = r1
            r29 = r3
            r31 = r11
            r12 = 1
            r10 = r5
            d6.b r0 = r9.f5097i
            boolean r0 = r0.f13080d
            if (r0 != 0) goto L_0x0134
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x0155
        L_0x0134:
            com.google.android.exoplayer2.source.dash.c$b[] r0 = r9.f5095g
            r0 = r0[r13]
            long r0 = r0.c(r10)
            com.google.android.exoplayer2.source.dash.c$b[] r2 = r9.f5095g
            r2 = r2[r13]
            long r0 = r2.e(r0)
            long r2 = r9.l(r10)
            long r0 = java.lang.Math.min(r2, r0)
            r2 = 0
            long r0 = r0 - r54
            long r0 = java.lang.Math.max(r2, r0)
            r5 = r0
        L_0x0155:
            r6.h r0 = r9.f5096h
            r1 = r54
            r3 = r31
            r7 = r58
            r8 = r27
            r0.h(r1, r3, r5, r7, r8)
            com.google.android.exoplayer2.source.dash.c$b[] r0 = r9.f5095g
            r6.h r1 = r9.f5096h
            int r1 = r1.m()
            r14 = r0[r1]
            b6.f r0 = r14.f5102a
            if (r0 == 0) goto L_0x01be
            d6.i r1 = r14.f5103b
            b6.d r0 = (b6.d) r0
            x4.b0[] r0 = r0.f3581i
            if (r0 != 0) goto L_0x017b
            d6.h r0 = r1.f13126e
            goto L_0x017d
        L_0x017b:
            r0 = r24
        L_0x017d:
            c6.b r2 = r14.f5104c
            if (r2 != 0) goto L_0x0185
            d6.h r24 = r1.c()
        L_0x0185:
            r1 = r24
            if (r0 != 0) goto L_0x018b
            if (r1 == 0) goto L_0x01be
        L_0x018b:
            com.google.android.exoplayer2.upstream.e r3 = r9.f5092d
            r6.h r2 = r9.f5096h
            x4.b0 r5 = r2.k()
            r6.h r2 = r9.f5096h
            int r6 = r2.l()
            r6.h r2 = r9.f5096h
            java.lang.Object r7 = r2.p()
            d6.i r2 = r14.f5103b
            if (r0 == 0) goto L_0x01ac
            java.lang.String r4 = r2.f13123b
            d6.h r1 = r0.a(r1, r4)
            if (r1 != 0) goto L_0x01ac
            goto L_0x01ad
        L_0x01ac:
            r0 = r1
        L_0x01ad:
            u6.e r4 = c6.c.a(r2, r0, r13)
            b6.l r0 = new b6.l
            b6.f r8 = r14.f5102a
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r10 = r59
            r10.f3598a = r0
            return
        L_0x01be:
            r0 = r10
            r10 = r59
            long r7 = r14.f5105d
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x01ce
            r11 = 1
            goto L_0x01cf
        L_0x01ce:
            r11 = 0
        L_0x01cf:
            int r2 = r14.d()
            if (r2 != 0) goto L_0x01d8
            r10.f3599b = r11
            return
        L_0x01d8:
            long r15 = r14.b(r0)
            long r17 = r14.c(r0)
            r0 = r53
            r1 = r14
            r2 = r25
            r3 = r56
            r5 = r15
            r19 = r7
            r7 = r17
            long r0 = r0.n(r1, r2, r3, r5, r7)
            int r2 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r2 >= 0) goto L_0x01fc
            z5.b r0 = new z5.b
            r0.<init>()
            r9.f5099k = r0
            return
        L_0x01fc:
            int r2 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r2 > 0) goto L_0x0314
            boolean r2 = r9.f5100l
            if (r2 == 0) goto L_0x020a
            int r2 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r2 < 0) goto L_0x020a
            goto L_0x0314
        L_0x020a:
            if (r11 == 0) goto L_0x0217
            long r2 = r14.f(r0)
            int r4 = (r2 > r19 ? 1 : (r2 == r19 ? 0 : -1))
            if (r4 < 0) goto L_0x0217
            r10.f3599b = r12
            return
        L_0x0217:
            long r2 = (long) r12
            long r17 = r17 - r0
            r4 = 1
            long r6 = r17 + r4
            long r2 = java.lang.Math.min(r2, r6)
            int r3 = (int) r2
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r19 > r6 ? 1 : (r19 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x023c
        L_0x022c:
            if (r3 <= r12) goto L_0x023c
            long r6 = (long) r3
            long r6 = r6 + r0
            long r6 = r6 - r4
            long r6 = r14.f(r6)
            int r2 = (r6 > r19 ? 1 : (r6 == r19 ? 0 : -1))
            if (r2 < 0) goto L_0x023c
            int r3 = r3 + -1
            goto L_0x022c
        L_0x023c:
            boolean r2 = r58.isEmpty()
            if (r2 == 0) goto L_0x0245
            r41 = r56
            goto L_0x024a
        L_0x0245:
            r41 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x024a:
            com.google.android.exoplayer2.upstream.e r2 = r9.f5092d
            int r6 = r9.f5091c
            r6.h r7 = r9.f5096h
            x4.b0 r7 = r7.k()
            r6.h r8 = r9.f5096h
            int r35 = r8.l()
            r6.h r8 = r9.f5096h
            java.lang.Object r36 = r8.p()
            d6.i r8 = r14.f5103b
            c6.b r11 = r14.f5104c
            long r12 = r14.f5106e
            long r12 = r0 - r12
            long r37 = r11.d(r12)
            c6.b r11 = r14.f5104c
            long r12 = r14.f5106e
            long r12 = r0 - r12
            d6.h r11 = r11.u(r12)
            java.lang.String r12 = r8.f13123b
            b6.f r13 = r14.f5102a
            r17 = 8
            if (r13 != 0) goto L_0x02a6
            long r39 = r14.e(r0)
            r3 = r29
            boolean r3 = r14.g(r0, r3)
            if (r3 == 0) goto L_0x028c
            r13 = 0
            goto L_0x028e
        L_0x028c:
            r13 = 8
        L_0x028e:
            u6.e r33 = c6.c.a(r8, r11, r13)
            b6.o r3 = new b6.o
            r31 = r3
            r32 = r2
            r34 = r7
            r41 = r0
            r43 = r6
            r44 = r7
            r31.<init>(r32, r33, r34, r35, r36, r37, r39, r41, r43, r44)
            r0 = r10
            goto L_0x0311
        L_0x02a6:
            r51 = r29
            r6 = 1
            r13 = 1
        L_0x02aa:
            if (r6 >= r3) goto L_0x02ca
            long r4 = (long) r6
            long r4 = r4 + r0
            c6.b r15 = r14.f5104c
            long r9 = r14.f5106e
            long r4 = r4 - r9
            d6.h r4 = r15.u(r4)
            d6.h r4 = r11.a(r4, r12)
            if (r4 != 0) goto L_0x02be
            goto L_0x02ca
        L_0x02be:
            int r13 = r13 + 1
            int r6 = r6 + 1
            r9 = r53
            r10 = r59
            r11 = r4
            r4 = 1
            goto L_0x02aa
        L_0x02ca:
            long r3 = (long) r13
            long r3 = r3 + r0
            r5 = 1
            long r3 = r3 - r5
            long r39 = r14.e(r3)
            long r5 = r14.f5105d
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r12 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r12 == 0) goto L_0x02e5
            int r12 = (r5 > r39 ? 1 : (r5 == r39 ? 0 : -1))
            if (r12 > 0) goto L_0x02e5
            r43 = r5
            goto L_0x02e7
        L_0x02e5:
            r43 = r9
        L_0x02e7:
            r5 = r51
            boolean r3 = r14.g(r3, r5)
            if (r3 == 0) goto L_0x02f1
            r3 = 0
            goto L_0x02f3
        L_0x02f1:
            r3 = 8
        L_0x02f3:
            u6.e r33 = c6.c.a(r8, r11, r3)
            long r3 = r8.f13124c
            long r3 = -r3
            r48 = r3
            b6.j r3 = new b6.j
            r31 = r3
            b6.f r4 = r14.f5102a
            r50 = r4
            r32 = r2
            r34 = r7
            r45 = r0
            r47 = r13
            r31.<init>(r32, r33, r34, r35, r36, r37, r39, r41, r43, r45, r47, r48, r50)
            r0 = r59
        L_0x0311:
            r0.f3598a = r3
            return
        L_0x0314:
            r0 = r10
            r0.f3599b = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.c.j(long, long, java.util.List, b6.g):void");
    }

    public void k(b6.e eVar) {
        if (eVar instanceof l) {
            int o10 = this.f5096h.o(((l) eVar).f3592d);
            b[] bVarArr = this.f5095g;
            b bVar = bVarArr[o10];
            if (bVar.f5104c == null) {
                b6.f fVar = bVar.f5102a;
                x xVar = ((d) fVar).f3580h;
                d5.d dVar = xVar instanceof d5.d ? (d5.d) xVar : null;
                if (dVar != null) {
                    d6.i iVar = bVar.f5103b;
                    bVarArr[o10] = new b(bVar.f5105d, iVar, fVar, bVar.f5106e, new c6.d(dVar, iVar.f13124c));
                }
            }
        }
        e.c cVar = this.f5094f;
        if (cVar != null) {
            long j10 = cVar.f5130d;
            if (j10 == -9223372036854775807L || eVar.f3596h > j10) {
                cVar.f5130d = eVar.f3596h;
            }
            e.this.f5122h = true;
        }
    }

    public final long l(long j10) {
        d6.b bVar = this.f5097i;
        long j11 = bVar.f13077a;
        if (j11 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j10 - f.b(j11 + bVar.b(this.f5098j).f13110b);
    }

    public final ArrayList<d6.i> m() {
        List<d6.a> list = this.f5097i.b(this.f5098j).f13111c;
        ArrayList<d6.i> arrayList = new ArrayList<>();
        for (int i10 : this.f5090b) {
            arrayList.addAll(list.get(i10).f13073c);
        }
        return arrayList;
    }

    public final long n(b bVar, m mVar, long j10, long j11, long j12) {
        b bVar2 = bVar;
        if (mVar != null) {
            return mVar.c();
        }
        long j13 = j10;
        return e0.j(bVar2.f5104c.h(j10, bVar2.f5105d) + bVar2.f5106e, j11, j12);
    }

    /* compiled from: DefaultDashChunkSource */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final b6.f f5102a;

        /* renamed from: b  reason: collision with root package name */
        public final d6.i f5103b;

        /* renamed from: c  reason: collision with root package name */
        public final c6.b f5104c;

        /* renamed from: d  reason: collision with root package name */
        public final long f5105d;

        /* renamed from: e  reason: collision with root package name */
        public final long f5106e;

        public b(long j10, d6.i iVar, b6.f fVar, long j11, c6.b bVar) {
            this.f5105d = j10;
            this.f5103b = iVar;
            this.f5106e = j11;
            this.f5102a = fVar;
            this.f5104c = bVar;
        }

        public b a(long j10, d6.i iVar) throws z5.b {
            long j11;
            long j12 = j10;
            c6.b b10 = this.f5103b.b();
            c6.b b11 = iVar.b();
            if (b10 == null) {
                return new b(j10, iVar, this.f5102a, this.f5106e, b10);
            } else if (!b10.w()) {
                return new b(j10, iVar, this.f5102a, this.f5106e, b11);
            } else {
                int B = b10.B(j12);
                if (B == 0) {
                    return new b(j10, iVar, this.f5102a, this.f5106e, b11);
                }
                long x10 = b10.x();
                long d10 = b10.d(x10);
                long j13 = (((long) B) + x10) - 1;
                long l10 = b10.l(j13, j12) + b10.d(j13);
                long x11 = b11.x();
                long d11 = b11.d(x11);
                long j14 = x10;
                long j15 = this.f5106e;
                if (l10 == d11) {
                    j11 = ((j13 + 1) - x11) + j15;
                } else if (l10 < d11) {
                    throw new z5.b();
                } else if (d11 < d10) {
                    j11 = j15 - (b11.h(d10, j12) - j14);
                } else {
                    j11 = (b10.h(d11, j12) - x11) + j15;
                }
                return new b(j10, iVar, this.f5102a, j11, b11);
            }
        }

        public long b(long j10) {
            return this.f5104c.n(this.f5105d, j10) + this.f5106e;
        }

        public long c(long j10) {
            return ((this.f5104c.n(this.f5105d, j10) + this.f5106e) + ((long) this.f5104c.C(this.f5105d, j10))) - 1;
        }

        public int d() {
            return this.f5104c.B(this.f5105d);
        }

        public long e(long j10) {
            return this.f5104c.l(j10 - this.f5106e, this.f5105d) + this.f5104c.d(j10 - this.f5106e);
        }

        public long f(long j10) {
            return this.f5104c.d(j10 - this.f5106e);
        }

        public boolean g(long j10, long j11) {
            return j11 == -9223372036854775807L || e(j10) <= j11;
        }

        /* JADX WARNING: type inference failed for: r13v4, types: [i5.e] */
        /* JADX WARNING: type inference failed for: r13v7, types: [m5.a] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public b(long r9, int r11, d6.i r12, boolean r13, java.util.List<x4.b0> r14, d5.a0 r15) {
            /*
                r8 = this;
                x4.b0 r0 = r12.f13122a
                java.lang.String r0 = r0.f27407s
                boolean r1 = v6.s.l(r0)
                if (r1 == 0) goto L_0x001c
                java.lang.String r13 = "application/x-rawcc"
                boolean r13 = r13.equals(r0)
                if (r13 == 0) goto L_0x001a
                m5.a r13 = new m5.a
                x4.b0 r14 = r12.f13122a
                r13.<init>(r14)
                goto L_0x006d
            L_0x001a:
                r11 = 0
                goto L_0x0075
            L_0x001c:
                r1 = 0
                r2 = 1
                if (r0 != 0) goto L_0x0021
                goto L_0x0052
            L_0x0021:
                java.lang.String r3 = "video/webm"
                boolean r3 = r0.startsWith(r3)
                if (r3 != 0) goto L_0x0054
                java.lang.String r3 = "audio/webm"
                boolean r3 = r0.startsWith(r3)
                if (r3 != 0) goto L_0x0054
                java.lang.String r3 = "application/webm"
                boolean r3 = r0.startsWith(r3)
                if (r3 != 0) goto L_0x0054
                java.lang.String r3 = "video/x-matroska"
                boolean r3 = r0.startsWith(r3)
                if (r3 != 0) goto L_0x0054
                java.lang.String r3 = "audio/x-matroska"
                boolean r3 = r0.startsWith(r3)
                if (r3 != 0) goto L_0x0054
                java.lang.String r3 = "application/x-matroska"
                boolean r0 = r0.startsWith(r3)
                if (r0 == 0) goto L_0x0052
                goto L_0x0054
            L_0x0052:
                r0 = 0
                goto L_0x0055
            L_0x0054:
                r0 = 1
            L_0x0055:
                if (r0 == 0) goto L_0x005d
                i5.e r13 = new i5.e
                r13.<init>(r2)
                goto L_0x006d
            L_0x005d:
                if (r13 == 0) goto L_0x0062
                r1 = 4
                r3 = 4
                goto L_0x0063
            L_0x0062:
                r3 = 0
            L_0x0063:
                k5.f r13 = new k5.f
                r4 = 0
                r5 = 0
                r2 = r13
                r6 = r14
                r7 = r15
                r2.<init>(r3, r4, r5, r6, r7)
            L_0x006d:
                b6.d r14 = new b6.d
                x4.b0 r15 = r12.f13122a
                r14.<init>(r13, r11, r15)
                r11 = r14
            L_0x0075:
                r13 = 0
                c6.b r15 = r12.b()
                r8.<init>()
                r8.f5105d = r9
                r8.f5103b = r12
                r8.f5106e = r13
                r8.f5102a = r11
                r8.f5104c = r15
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.c.b.<init>(long, int, d6.i, boolean, java.util.List, d5.a0):void");
        }
    }
}
