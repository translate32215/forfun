package com.google.android.gms.internal.ads;

import e8.bg0;
import e8.eg0;
import e8.fd0;
import e8.id0;
import e8.jd0;
import e8.od0;
import e8.w60;
import e8.wd0;
import e8.zd0;
import java.io.IOException;
import java.util.Stack;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class pt implements ht, jd0 {

    /* renamed from: p  reason: collision with root package name */
    public static final int f7875p = eg0.f("qt  ");

    /* renamed from: a  reason: collision with root package name */
    public final w60 f7876a = new w60(bg0.f14009a, 1);

    /* renamed from: b  reason: collision with root package name */
    public final w60 f7877b = new w60(4);

    /* renamed from: c  reason: collision with root package name */
    public final w60 f7878c = new w60(16);

    /* renamed from: d  reason: collision with root package name */
    public final Stack<od0> f7879d = new Stack<>();

    /* renamed from: e  reason: collision with root package name */
    public int f7880e;

    /* renamed from: f  reason: collision with root package name */
    public int f7881f;

    /* renamed from: g  reason: collision with root package name */
    public long f7882g;

    /* renamed from: h  reason: collision with root package name */
    public int f7883h;

    /* renamed from: i  reason: collision with root package name */
    public w60 f7884i;

    /* renamed from: j  reason: collision with root package name */
    public int f7885j;

    /* renamed from: k  reason: collision with root package name */
    public int f7886k;

    /* renamed from: l  reason: collision with root package name */
    public id0 f7887l;

    /* renamed from: m  reason: collision with root package name */
    public wd0[] f7888m;

    /* renamed from: n  reason: collision with root package name */
    public long f7889n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f7890o;

    public final void a() {
    }

    public final boolean b() {
        return true;
    }

    public final long c() {
        return this.f7889n;
    }

    public final long d(long j10) {
        long j11 = Long.MAX_VALUE;
        for (wd0 wd0 : this.f7888m) {
            zd0 zd0 = wd0.f17343b;
            int a10 = zd0.a(j10);
            if (a10 == -1) {
                a10 = zd0.b(j10);
            }
            long j12 = zd0.f17727b[a10];
            if (j12 < j11) {
                j11 = j12;
            }
        }
        return j11;
    }

    /* JADX WARNING: Removed duplicated region for block: B:152:0x018a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x02ac A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0006 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0006 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0187  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int e(e8.fd0 r24, d5.w r25) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
        L_0x0006:
            int r3 = r0.f7880e
            r4 = 8
            r5 = -1
            r7 = 1
            if (r3 == 0) goto L_0x018c
            r8 = 262144(0x40000, double:1.295163E-318)
            r11 = 2
            if (r3 == r7) goto L_0x010a
            if (r3 != r11) goto L_0x0104
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r12 = 0
            r13 = -1
        L_0x001d:
            e8.wd0[] r14 = r0.f7888m
            int r15 = r14.length
            if (r12 >= r15) goto L_0x0039
            r14 = r14[r12]
            int r15 = r14.f17345d
            e8.zd0 r14 = r14.f17343b
            int r10 = r14.f17726a
            if (r15 == r10) goto L_0x0036
            long[] r10 = r14.f17727b
            r14 = r10[r15]
            int r10 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r10 >= 0) goto L_0x0036
            r13 = r12
            r3 = r14
        L_0x0036:
            int r12 = r12 + 1
            goto L_0x001d
        L_0x0039:
            if (r13 != r5) goto L_0x003c
            return r5
        L_0x003c:
            r3 = r14[r13]
            com.google.android.gms.internal.ads.gu r4 = r3.f17344c
            int r5 = r3.f17345d
            e8.zd0 r10 = r3.f17343b
            long[] r12 = r10.f17727b
            r13 = r12[r5]
            int[] r10 = r10.f17728c
            r10 = r10[r5]
            e8.yd0 r12 = r3.f17342a
            int r12 = r12.f17614g
            if (r12 != r7) goto L_0x0058
            r16 = 8
            long r13 = r13 + r16
            int r10 = r10 + -8
        L_0x0058:
            r12 = r1
            com.google.android.gms.internal.ads.gt r12 = (com.google.android.gms.internal.ads.gt) r12
            long r6 = r12.f6688c
            long r6 = r13 - r6
            int r15 = r0.f7885j
            r18 = r12
            long r11 = (long) r15
            long r6 = r6 + r11
            r11 = 0
            int r15 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r15 < 0) goto L_0x0100
            int r11 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r11 < 0) goto L_0x0071
            goto L_0x0100
        L_0x0071:
            int r2 = (int) r6
            r6 = r18
            r6.d(r2)
            e8.yd0 r2 = r3.f17342a
            int r2 = r2.f17618k
            if (r2 == 0) goto L_0x00ca
            e8.w60 r7 = r0.f7877b
            byte[] r7 = r7.f17220a
            r8 = 0
            r7[r8] = r8
            r9 = 1
            r7[r9] = r8
            r9 = 2
            r7[r9] = r8
            int r7 = 4 - r2
        L_0x008c:
            int r9 = r0.f7885j
            if (r9 >= r10) goto L_0x00df
            int r9 = r0.f7886k
            if (r9 != 0) goto L_0x00ba
            e8.w60 r9 = r0.f7877b
            byte[] r9 = r9.f17220a
            r6.c(r9, r7, r2, r8)
            e8.w60 r9 = r0.f7877b
            r9.h(r8)
            e8.w60 r9 = r0.f7877b
            int r9 = r9.o()
            r0.f7886k = r9
            e8.w60 r9 = r0.f7876a
            r9.h(r8)
            e8.w60 r8 = r0.f7876a
            r9 = 4
            r4.e(r8, r9)
            int r8 = r0.f7885j
            int r8 = r8 + r9
            r0.f7885j = r8
            int r10 = r10 + r7
            goto L_0x00c8
        L_0x00ba:
            int r8 = r4.b(r1, r9)
            int r9 = r0.f7885j
            int r9 = r9 + r8
            r0.f7885j = r9
            int r9 = r0.f7886k
            int r9 = r9 - r8
            r0.f7886k = r9
        L_0x00c8:
            r8 = 0
            goto L_0x008c
        L_0x00ca:
            int r2 = r0.f7885j
            if (r2 >= r10) goto L_0x00df
            int r2 = r10 - r2
            int r2 = r4.b(r1, r2)
            int r6 = r0.f7885j
            int r6 = r6 + r2
            r0.f7885j = r6
            int r6 = r0.f7886k
            int r6 = r6 - r2
            r0.f7886k = r6
            goto L_0x00ca
        L_0x00df:
            r20 = r10
            e8.zd0 r1 = r3.f17343b
            long[] r2 = r1.f17730e
            r17 = r2[r5]
            int[] r1 = r1.f17731f
            r19 = r1[r5]
            r21 = 0
            r22 = 0
            r16 = r4
            r16.c(r17, r19, r20, r21, r22)
            int r1 = r3.f17345d
            r4 = 1
            int r1 = r1 + r4
            r3.f17345d = r1
            r1 = 0
            r0.f7885j = r1
            r0.f7886k = r1
            return r1
        L_0x0100:
            r4 = 1
            r2.f13063a = r13
            return r4
        L_0x0104:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x010a:
            long r5 = r0.f7882g
            int r3 = r0.f7883h
            long r10 = (long) r3
            long r5 = r5 - r10
            r7 = r1
            com.google.android.gms.internal.ads.gt r7 = (com.google.android.gms.internal.ads.gt) r7
            long r10 = r7.f6688c
            long r12 = r10 + r5
            e8.w60 r14 = r0.f7884i
            if (r14 == 0) goto L_0x016d
            byte[] r8 = r14.f17220a
            int r6 = (int) r5
            r5 = 0
            r7.c(r8, r3, r6, r5)
            int r3 = r0.f7881f
            int r5 = e8.pd0.f15946b
            if (r3 != r5) goto L_0x014e
            e8.w60 r3 = r0.f7884i
            r3.h(r4)
            int r4 = r3.b()
            int r5 = f7875p
            if (r4 != r5) goto L_0x0136
            goto L_0x0148
        L_0x0136:
            r4 = 4
            r3.i(r4)
        L_0x013a:
            int r4 = r3.m()
            if (r4 <= 0) goto L_0x014a
            int r4 = r3.b()
            int r5 = f7875p
            if (r4 != r5) goto L_0x013a
        L_0x0148:
            r3 = 1
            goto L_0x014b
        L_0x014a:
            r3 = 0
        L_0x014b:
            r0.f7890o = r3
            goto L_0x0175
        L_0x014e:
            java.util.Stack<e8.od0> r3 = r0.f7879d
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x0175
            java.util.Stack<e8.od0> r3 = r0.f7879d
            java.lang.Object r3 = r3.peek()
            e8.od0 r3 = (e8.od0) r3
            e8.qd0 r4 = new e8.qd0
            int r5 = r0.f7881f
            e8.w60 r6 = r0.f7884i
            r4.<init>(r5, r6)
            java.util.List<e8.qd0> r3 = r3.Q0
            r3.add(r4)
            goto L_0x0175
        L_0x016d:
            int r3 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r3 >= 0) goto L_0x0177
            int r3 = (int) r5
            r7.d(r3)
        L_0x0175:
            r3 = 0
            goto L_0x017b
        L_0x0177:
            long r10 = r10 + r5
            r2.f13063a = r10
            r3 = 1
        L_0x017b:
            r0.i(r12)
            if (r3 == 0) goto L_0x0187
            int r3 = r0.f7880e
            r4 = 2
            if (r3 == r4) goto L_0x0187
            r6 = 1
            goto L_0x0188
        L_0x0187:
            r6 = 0
        L_0x0188:
            if (r6 == 0) goto L_0x0006
            r3 = 1
            return r3
        L_0x018c:
            r3 = 1
            int r6 = r0.f7883h
            if (r6 != 0) goto L_0x01b9
            e8.w60 r6 = r0.f7878c
            byte[] r6 = r6.f17220a
            r7 = r1
            com.google.android.gms.internal.ads.gt r7 = (com.google.android.gms.internal.ads.gt) r7
            r8 = 0
            boolean r6 = r7.c(r6, r8, r4, r3)
            if (r6 != 0) goto L_0x01a2
            r6 = 0
            goto L_0x02aa
        L_0x01a2:
            r0.f7883h = r4
            e8.w60 r3 = r0.f7878c
            r3.h(r8)
            e8.w60 r3 = r0.f7878c
            long r6 = r3.n()
            r0.f7882g = r6
            e8.w60 r3 = r0.f7878c
            int r3 = r3.b()
            r0.f7881f = r3
        L_0x01b9:
            long r6 = r0.f7882g
            r8 = 1
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 != 0) goto L_0x01d9
            e8.w60 r3 = r0.f7878c
            byte[] r3 = r3.f17220a
            r6 = r1
            com.google.android.gms.internal.ads.gt r6 = (com.google.android.gms.internal.ads.gt) r6
            r7 = 0
            r6.c(r3, r4, r4, r7)
            int r3 = r0.f7883h
            int r3 = r3 + r4
            r0.f7883h = r3
            e8.w60 r3 = r0.f7878c
            long r6 = r3.p()
            r0.f7882g = r6
        L_0x01d9:
            int r3 = r0.f7881f
            int r6 = e8.pd0.C
            if (r3 == r6) goto L_0x01f7
            int r6 = e8.pd0.E
            if (r3 == r6) goto L_0x01f7
            int r6 = e8.pd0.F
            if (r3 == r6) goto L_0x01f7
            int r6 = e8.pd0.G
            if (r3 == r6) goto L_0x01f7
            int r6 = e8.pd0.H
            if (r3 == r6) goto L_0x01f7
            int r6 = e8.pd0.Q
            if (r3 != r6) goto L_0x01f4
            goto L_0x01f7
        L_0x01f4:
            r16 = 0
            goto L_0x01f9
        L_0x01f7:
            r16 = 1
        L_0x01f9:
            if (r16 == 0) goto L_0x0226
            r3 = r1
            com.google.android.gms.internal.ads.gt r3 = (com.google.android.gms.internal.ads.gt) r3
            long r3 = r3.f6688c
            long r6 = r0.f7882g
            long r3 = r3 + r6
            int r6 = r0.f7883h
            long r6 = (long) r6
            long r3 = r3 - r6
            java.util.Stack<e8.od0> r6 = r0.f7879d
            e8.od0 r7 = new e8.od0
            int r8 = r0.f7881f
            r7.<init>(r8, r3)
            r6.add(r7)
            long r6 = r0.f7882g
            int r8 = r0.f7883h
            long r8 = (long) r8
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 != 0) goto L_0x0220
            r0.i(r3)
            goto L_0x0223
        L_0x0220:
            r23.j()
        L_0x0223:
            r3 = 1
            goto L_0x02a9
        L_0x0226:
            int r6 = e8.pd0.S
            if (r3 == r6) goto L_0x026a
            int r6 = e8.pd0.D
            if (r3 == r6) goto L_0x026a
            int r6 = e8.pd0.T
            if (r3 == r6) goto L_0x026a
            int r6 = e8.pd0.U
            if (r3 == r6) goto L_0x026a
            int r6 = e8.pd0.f15969m0
            if (r3 == r6) goto L_0x026a
            int r6 = e8.pd0.f15971n0
            if (r3 == r6) goto L_0x026a
            int r6 = e8.pd0.f15973o0
            if (r3 == r6) goto L_0x026a
            int r6 = e8.pd0.R
            if (r3 == r6) goto L_0x026a
            int r6 = e8.pd0.f15975p0
            if (r3 == r6) goto L_0x026a
            int r6 = e8.pd0.f15977q0
            if (r3 == r6) goto L_0x026a
            int r6 = e8.pd0.f15979r0
            if (r3 == r6) goto L_0x026a
            int r6 = e8.pd0.f15981s0
            if (r3 == r6) goto L_0x026a
            int r6 = e8.pd0.f15983t0
            if (r3 == r6) goto L_0x026a
            int r6 = e8.pd0.P
            if (r3 == r6) goto L_0x026a
            int r6 = e8.pd0.f15946b
            if (r3 == r6) goto L_0x026a
            int r6 = e8.pd0.A0
            if (r3 != r6) goto L_0x0267
            goto L_0x026a
        L_0x0267:
            r16 = 0
            goto L_0x026c
        L_0x026a:
            r16 = 1
        L_0x026c:
            if (r16 == 0) goto L_0x02a3
            int r3 = r0.f7883h
            if (r3 != r4) goto L_0x0275
            r16 = 1
            goto L_0x0277
        L_0x0275:
            r16 = 0
        L_0x0277:
            o.a.c(r16)
            long r6 = r0.f7882g
            r8 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 > 0) goto L_0x0286
            r16 = 1
            goto L_0x0288
        L_0x0286:
            r16 = 0
        L_0x0288:
            o.a.c(r16)
            e8.w60 r3 = new e8.w60
            long r6 = r0.f7882g
            int r7 = (int) r6
            r3.<init>(r7)
            r0.f7884i = r3
            e8.w60 r6 = r0.f7878c
            byte[] r6 = r6.f17220a
            byte[] r3 = r3.f17220a
            r7 = 0
            java.lang.System.arraycopy(r6, r7, r3, r7, r4)
            r3 = 1
            r0.f7880e = r3
            goto L_0x02a9
        L_0x02a3:
            r3 = 1
            r4 = 0
            r0.f7884i = r4
            r0.f7880e = r3
        L_0x02a9:
            r6 = 1
        L_0x02aa:
            if (r6 != 0) goto L_0x0006
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.pt.e(e8.fd0, d5.w):int");
    }

    public final void f(id0 id0) {
        this.f7887l = id0;
    }

    public final boolean g(fd0 fd0) throws IOException, InterruptedException {
        return qt.a(fd0, false);
    }

    public final void h(long j10, long j11) {
        this.f7879d.clear();
        this.f7883h = 0;
        this.f7885j = 0;
        this.f7886k = 0;
        if (j10 == 0) {
            j();
            return;
        }
        wd0[] wd0Arr = this.f7888m;
        if (wd0Arr != null) {
            for (wd0 wd0 : wd0Arr) {
                zd0 zd0 = wd0.f17343b;
                int a10 = zd0.a(j11);
                if (a10 == -1) {
                    a10 = zd0.b(j11);
                }
                wd0.f17345d = a10;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:237:0x0375  */
    /* JADX WARNING: Removed duplicated region for block: B:322:0x0378 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:328:0x03ef A[EDGE_INSN: B:328:0x03ef->B:276:0x03ef ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:330:0x03eb A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00bf A[Catch:{ all -> 0x037b }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c5 A[Catch:{ all -> 0x037b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i(long r67) throws e8.cc0 {
        /*
            r66 = this;
            r0 = r66
        L_0x0002:
            java.util.Stack<e8.od0> r1 = r0.f7879d
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0631
            java.util.Stack<e8.od0> r1 = r0.f7879d
            java.lang.Object r1 = r1.peek()
            e8.od0 r1 = (e8.od0) r1
            long r3 = r1.P0
            int r1 = (r3 > r67 ? 1 : (r3 == r67 ? 0 : -1))
            if (r1 != 0) goto L_0x0631
            java.util.Stack<e8.od0> r1 = r0.f7879d
            java.lang.Object r1 = r1.pop()
            e8.od0 r1 = (e8.od0) r1
            int r3 = r1.f15996a
            int r4 = e8.pd0.C
            if (r3 != r4) goto L_0x0616
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            com.google.android.gms.internal.ads.it r4 = new com.google.android.gms.internal.ads.it
            r4.<init>()
            int r5 = e8.pd0.A0
            e8.qd0 r5 = r1.b(r5)
            r8 = 0
            if (r5 == 0) goto L_0x03ee
            boolean r10 = r0.f7890o
            int r11 = com.google.android.gms.internal.ads.mt.f7499a
            java.lang.String r11 = "iTunSMPB"
            if (r10 == 0) goto L_0x0043
            goto L_0x039d
        L_0x0043:
            e8.w60 r5 = r5.P0
            r10 = 8
            r5.h(r10)
        L_0x004a:
            int r13 = r5.m()
            if (r13 < r10) goto L_0x039d
            int r13 = r5.f17221b
            int r14 = r5.b()
            int r15 = r5.b()
            int r9 = e8.pd0.B0
            if (r15 != r9) goto L_0x0395
            r5.h(r13)
            int r13 = r13 + r14
            r9 = 12
            r5.i(r9)
        L_0x0067:
            int r9 = r5.f17221b
            if (r9 >= r13) goto L_0x039d
            int r14 = r5.b()
            int r15 = r5.b()
            int r2 = e8.pd0.C0
            if (r15 != r2) goto L_0x038d
            r5.h(r9)
            int r9 = r9 + r14
            r5.i(r10)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L_0x0083:
            int r13 = r5.f17221b
            if (r13 >= r9) goto L_0x0380
            int r14 = com.google.android.gms.internal.ads.ot.f7710a
            int r14 = r5.b()
            int r14 = r14 + r13
            int r13 = r5.b()
            int r15 = r13 >>> 24
            r10 = 169(0xa9, float:2.37E-43)
            java.lang.String r6 = "und"
            java.lang.String r12 = "TCON"
            r19 = 16777215(0xffffff, float:2.3509886E-38)
            java.lang.String r7 = "MetadataUtil"
            if (r15 == r10) goto L_0x0279
            r10 = 65533(0xfffd, float:9.1831E-41)
            if (r15 != r10) goto L_0x00a8
            goto L_0x0279
        L_0x00a8:
            int r10 = com.google.android.gms.internal.ads.ot.f7722m     // Catch:{ all -> 0x037b }
            if (r13 != r10) goto L_0x00d0
            int r6 = com.google.android.gms.internal.ads.ot.d(r5)     // Catch:{ all -> 0x037b }
            if (r6 <= 0) goto L_0x00bc
            java.lang.String[] r10 = com.google.android.gms.internal.ads.ot.D     // Catch:{ all -> 0x037b }
            int r13 = r10.length     // Catch:{ all -> 0x037b }
            if (r6 > r13) goto L_0x00bc
            int r6 = r6 + -1
            r6 = r10[r6]     // Catch:{ all -> 0x037b }
            goto L_0x00bd
        L_0x00bc:
            r6 = 0
        L_0x00bd:
            if (r6 == 0) goto L_0x00c5
            e8.me0 r7 = new e8.me0     // Catch:{ all -> 0x037b }
            r7.<init>(r12, r6)     // Catch:{ all -> 0x037b }
            goto L_0x00cb
        L_0x00c5:
            java.lang.String r6 = "Failed to parse standard genre code"
            android.util.Log.w(r7, r6)     // Catch:{ all -> 0x037b }
            r7 = 0
        L_0x00cb:
            r5.h(r14)
            goto L_0x0204
        L_0x00d0:
            int r10 = com.google.android.gms.internal.ads.ot.f7724o     // Catch:{ all -> 0x037b }
            if (r13 != r10) goto L_0x00df
            java.lang.String r6 = "TPOS"
            e8.me0 r7 = com.google.android.gms.internal.ads.ot.c(r13, r6, r5)     // Catch:{ all -> 0x037b }
            r5.h(r14)
            goto L_0x0204
        L_0x00df:
            int r10 = com.google.android.gms.internal.ads.ot.f7725p     // Catch:{ all -> 0x037b }
            if (r13 != r10) goto L_0x00ee
            java.lang.String r6 = "TRCK"
            e8.me0 r7 = com.google.android.gms.internal.ads.ot.c(r13, r6, r5)     // Catch:{ all -> 0x037b }
            r5.h(r14)
            goto L_0x0204
        L_0x00ee:
            int r10 = com.google.android.gms.internal.ads.ot.f7726q     // Catch:{ all -> 0x037b }
            if (r13 != r10) goto L_0x00fe
            java.lang.String r6 = "TBPM"
            r7 = 1
            com.google.android.gms.internal.ads.xt r6 = com.google.android.gms.internal.ads.ot.a(r13, r6, r5, r7, r8)     // Catch:{ all -> 0x037b }
            r5.h(r14)
            goto L_0x0271
        L_0x00fe:
            int r10 = com.google.android.gms.internal.ads.ot.f7727r     // Catch:{ all -> 0x037b }
            if (r13 != r10) goto L_0x010f
            java.lang.String r6 = "TCMP"
            r7 = 1
            com.google.android.gms.internal.ads.xt r6 = com.google.android.gms.internal.ads.ot.a(r13, r6, r5, r7, r7)     // Catch:{ all -> 0x037b }
            r5.h(r14)
            r7 = r6
            goto L_0x0204
        L_0x010f:
            int r10 = com.google.android.gms.internal.ads.ot.f7721l     // Catch:{ all -> 0x037b }
            r12 = 4
            if (r13 != r10) goto L_0x0174
            int r6 = r5.b()     // Catch:{ all -> 0x037b }
            int r10 = r5.b()     // Catch:{ all -> 0x037b }
            int r13 = e8.pd0.F0     // Catch:{ all -> 0x037b }
            if (r10 != r13) goto L_0x0169
            int r10 = r5.b()     // Catch:{ all -> 0x037b }
            r10 = r10 & r19
            r13 = 13
            if (r10 != r13) goto L_0x012d
            java.lang.String r13 = "image/jpeg"
            goto L_0x0135
        L_0x012d:
            r13 = 14
            if (r10 != r13) goto L_0x0134
            java.lang.String r13 = "image/png"
            goto L_0x0135
        L_0x0134:
            r13 = 0
        L_0x0135:
            if (r13 != 0) goto L_0x014e
            r6 = 41
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x037b }
            r12.<init>(r6)     // Catch:{ all -> 0x037b }
            java.lang.String r6 = "Unrecognized cover art flags: "
            r12.append(r6)     // Catch:{ all -> 0x037b }
            r12.append(r10)     // Catch:{ all -> 0x037b }
            java.lang.String r6 = r12.toString()     // Catch:{ all -> 0x037b }
            android.util.Log.w(r7, r6)     // Catch:{ all -> 0x037b }
            goto L_0x016e
        L_0x014e:
            r5.i(r12)     // Catch:{ all -> 0x037b }
            r7 = 16
            int r6 = r6 - r7
            byte[] r7 = new byte[r6]     // Catch:{ all -> 0x037b }
            byte[] r10 = r5.f17220a     // Catch:{ all -> 0x037b }
            int r12 = r5.f17221b     // Catch:{ all -> 0x037b }
            java.lang.System.arraycopy(r10, r12, r7, r8, r6)     // Catch:{ all -> 0x037b }
            int r10 = r5.f17221b     // Catch:{ all -> 0x037b }
            int r10 = r10 + r6
            r5.f17221b = r10     // Catch:{ all -> 0x037b }
            e8.ie0 r6 = new e8.ie0     // Catch:{ all -> 0x037b }
            r6.<init>(r13, r7)     // Catch:{ all -> 0x037b }
            r7 = r6
            goto L_0x016f
        L_0x0169:
            java.lang.String r6 = "Failed to parse cover art attribute"
            android.util.Log.w(r7, r6)     // Catch:{ all -> 0x037b }
        L_0x016e:
            r7 = 0
        L_0x016f:
            r5.h(r14)
            goto L_0x0204
        L_0x0174:
            int r10 = com.google.android.gms.internal.ads.ot.f7728s     // Catch:{ all -> 0x037b }
            if (r13 != r10) goto L_0x0183
            java.lang.String r6 = "TPE2"
            e8.me0 r7 = com.google.android.gms.internal.ads.ot.b(r13, r6, r5)     // Catch:{ all -> 0x037b }
            r5.h(r14)
            goto L_0x0204
        L_0x0183:
            int r10 = com.google.android.gms.internal.ads.ot.f7729t     // Catch:{ all -> 0x037b }
            if (r13 != r10) goto L_0x0192
            java.lang.String r6 = "TSOT"
            e8.me0 r7 = com.google.android.gms.internal.ads.ot.b(r13, r6, r5)     // Catch:{ all -> 0x037b }
            r5.h(r14)
            goto L_0x0204
        L_0x0192:
            int r10 = com.google.android.gms.internal.ads.ot.f7730u     // Catch:{ all -> 0x037b }
            if (r13 != r10) goto L_0x01a0
            java.lang.String r6 = "TSO2"
            e8.me0 r7 = com.google.android.gms.internal.ads.ot.b(r13, r6, r5)     // Catch:{ all -> 0x037b }
            r5.h(r14)
            goto L_0x0204
        L_0x01a0:
            int r10 = com.google.android.gms.internal.ads.ot.f7731v     // Catch:{ all -> 0x037b }
            if (r13 != r10) goto L_0x01ae
            java.lang.String r6 = "TSOA"
            e8.me0 r7 = com.google.android.gms.internal.ads.ot.b(r13, r6, r5)     // Catch:{ all -> 0x037b }
            r5.h(r14)
            goto L_0x0204
        L_0x01ae:
            int r10 = com.google.android.gms.internal.ads.ot.f7732w     // Catch:{ all -> 0x037b }
            if (r13 != r10) goto L_0x01bc
            java.lang.String r6 = "TSOP"
            e8.me0 r7 = com.google.android.gms.internal.ads.ot.b(r13, r6, r5)     // Catch:{ all -> 0x037b }
            r5.h(r14)
            goto L_0x0204
        L_0x01bc:
            int r10 = com.google.android.gms.internal.ads.ot.f7733x     // Catch:{ all -> 0x037b }
            if (r13 != r10) goto L_0x01ca
            java.lang.String r6 = "TSOC"
            e8.me0 r7 = com.google.android.gms.internal.ads.ot.b(r13, r6, r5)     // Catch:{ all -> 0x037b }
            r5.h(r14)
            goto L_0x0204
        L_0x01ca:
            int r10 = com.google.android.gms.internal.ads.ot.f7734y     // Catch:{ all -> 0x037b }
            if (r13 != r10) goto L_0x01d9
            java.lang.String r6 = "ITUNESADVISORY"
            com.google.android.gms.internal.ads.xt r6 = com.google.android.gms.internal.ads.ot.a(r13, r6, r5, r8, r8)     // Catch:{ all -> 0x037b }
            r5.h(r14)
            goto L_0x0271
        L_0x01d9:
            int r10 = com.google.android.gms.internal.ads.ot.f7735z     // Catch:{ all -> 0x037b }
            if (r13 != r10) goto L_0x01e9
            java.lang.String r6 = "ITUNESGAPLESS"
            r7 = 1
            com.google.android.gms.internal.ads.xt r6 = com.google.android.gms.internal.ads.ot.a(r13, r6, r5, r8, r7)     // Catch:{ all -> 0x037b }
            r5.h(r14)
            goto L_0x0271
        L_0x01e9:
            int r10 = com.google.android.gms.internal.ads.ot.A     // Catch:{ all -> 0x037b }
            if (r13 != r10) goto L_0x01f7
            java.lang.String r6 = "TVSHOWSORT"
            e8.me0 r7 = com.google.android.gms.internal.ads.ot.b(r13, r6, r5)     // Catch:{ all -> 0x037b }
            r5.h(r14)
            goto L_0x0204
        L_0x01f7:
            int r10 = com.google.android.gms.internal.ads.ot.B     // Catch:{ all -> 0x037b }
            if (r13 != r10) goto L_0x0207
            java.lang.String r6 = "TVSHOW"
            e8.me0 r7 = com.google.android.gms.internal.ads.ot.b(r13, r6, r5)     // Catch:{ all -> 0x037b }
            r5.h(r14)
        L_0x0204:
            r6 = r7
            goto L_0x0271
        L_0x0207:
            int r10 = com.google.android.gms.internal.ads.ot.C     // Catch:{ all -> 0x037b }
            if (r13 != r10) goto L_0x0275
            r7 = 0
            r10 = 0
            r13 = -1
            r15 = -1
        L_0x020f:
            int r8 = r5.f17221b     // Catch:{ all -> 0x037b }
            if (r8 >= r14) goto L_0x0246
            int r19 = r5.b()     // Catch:{ all -> 0x037b }
            int r12 = r5.b()     // Catch:{ all -> 0x037b }
            r21 = r8
            r8 = 4
            r5.i(r8)     // Catch:{ all -> 0x037b }
            int r8 = e8.pd0.D0     // Catch:{ all -> 0x037b }
            if (r12 != r8) goto L_0x022c
            int r7 = r19 + -12
            java.lang.String r7 = r5.j(r7)     // Catch:{ all -> 0x037b }
            goto L_0x0244
        L_0x022c:
            int r8 = e8.pd0.E0     // Catch:{ all -> 0x037b }
            if (r12 != r8) goto L_0x0237
            int r8 = r19 + -12
            java.lang.String r10 = r5.j(r8)     // Catch:{ all -> 0x037b }
            goto L_0x0244
        L_0x0237:
            int r8 = e8.pd0.F0     // Catch:{ all -> 0x037b }
            if (r12 != r8) goto L_0x023f
            r15 = r19
            r13 = r21
        L_0x023f:
            int r8 = r19 + -12
            r5.i(r8)     // Catch:{ all -> 0x037b }
        L_0x0244:
            r12 = 4
            goto L_0x020f
        L_0x0246:
            java.lang.String r8 = "com.apple.iTunes"
            boolean r7 = r8.equals(r7)     // Catch:{ all -> 0x037b }
            if (r7 == 0) goto L_0x026c
            boolean r7 = r11.equals(r10)     // Catch:{ all -> 0x037b }
            if (r7 == 0) goto L_0x026c
            r7 = -1
            if (r13 != r7) goto L_0x0258
            goto L_0x026c
        L_0x0258:
            r5.h(r13)     // Catch:{ all -> 0x037b }
            r7 = 16
            r5.i(r7)     // Catch:{ all -> 0x037b }
            int r15 = r15 + -16
            java.lang.String r7 = r5.j(r15)     // Catch:{ all -> 0x037b }
            e8.je0 r8 = new e8.je0     // Catch:{ all -> 0x037b }
            r8.<init>(r6, r10, r7)     // Catch:{ all -> 0x037b }
            goto L_0x026d
        L_0x026c:
            r8 = 0
        L_0x026d:
            r5.h(r14)
            r6 = r8
        L_0x0271:
            r10 = 8
            goto L_0x0373
        L_0x0275:
            r10 = 8
            goto L_0x033d
        L_0x0279:
            r8 = r13 & r19
            int r10 = com.google.android.gms.internal.ads.ot.f7712c     // Catch:{ all -> 0x037b }
            if (r8 != r10) goto L_0x02c4
            int r8 = r5.b()     // Catch:{ all -> 0x037b }
            int r10 = r5.b()     // Catch:{ all -> 0x037b }
            int r12 = e8.pd0.F0     // Catch:{ all -> 0x037b }
            if (r10 != r12) goto L_0x029e
            r10 = 8
            r5.i(r10)     // Catch:{ all -> 0x037b }
            r7 = 16
            int r8 = r8 - r7
            java.lang.String r7 = r5.j(r8)     // Catch:{ all -> 0x037b }
            e8.je0 r8 = new e8.je0     // Catch:{ all -> 0x037b }
            r8.<init>(r6, r7, r7)     // Catch:{ all -> 0x037b }
            r6 = r8
            goto L_0x02bf
        L_0x029e:
            r10 = 8
            java.lang.String r6 = "Failed to parse comment attribute: "
            java.lang.String r8 = e8.pd0.a(r13)     // Catch:{ all -> 0x037b }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x037b }
            int r12 = r8.length()     // Catch:{ all -> 0x037b }
            if (r12 == 0) goto L_0x02b5
            java.lang.String r6 = r6.concat(r8)     // Catch:{ all -> 0x037b }
            goto L_0x02bb
        L_0x02b5:
            java.lang.String r8 = new java.lang.String     // Catch:{ all -> 0x037b }
            r8.<init>(r6)     // Catch:{ all -> 0x037b }
            r6 = r8
        L_0x02bb:
            android.util.Log.w(r7, r6)     // Catch:{ all -> 0x037b }
            r6 = 0
        L_0x02bf:
            r5.h(r14)
            goto L_0x0373
        L_0x02c4:
            r10 = 8
            int r6 = com.google.android.gms.internal.ads.ot.f7710a     // Catch:{ all -> 0x037b }
            if (r8 == r6) goto L_0x036a
            int r6 = com.google.android.gms.internal.ads.ot.f7711b     // Catch:{ all -> 0x037b }
            if (r8 != r6) goto L_0x02d0
            goto L_0x036a
        L_0x02d0:
            int r6 = com.google.android.gms.internal.ads.ot.f7717h     // Catch:{ all -> 0x037b }
            if (r8 == r6) goto L_0x0360
            int r6 = com.google.android.gms.internal.ads.ot.f7718i     // Catch:{ all -> 0x037b }
            if (r8 != r6) goto L_0x02da
            goto L_0x0360
        L_0x02da:
            int r6 = com.google.android.gms.internal.ads.ot.f7713d     // Catch:{ all -> 0x037b }
            if (r8 != r6) goto L_0x02e9
            java.lang.String r6 = "TDRC"
            e8.me0 r6 = com.google.android.gms.internal.ads.ot.b(r13, r6, r5)     // Catch:{ all -> 0x037b }
            r5.h(r14)
            goto L_0x0373
        L_0x02e9:
            int r6 = com.google.android.gms.internal.ads.ot.f7714e     // Catch:{ all -> 0x037b }
            if (r8 != r6) goto L_0x02f8
            java.lang.String r6 = "TPE1"
            e8.me0 r6 = com.google.android.gms.internal.ads.ot.b(r13, r6, r5)     // Catch:{ all -> 0x037b }
            r5.h(r14)
            goto L_0x0373
        L_0x02f8:
            int r6 = com.google.android.gms.internal.ads.ot.f7715f     // Catch:{ all -> 0x037b }
            if (r8 != r6) goto L_0x0307
            java.lang.String r6 = "TSSE"
            e8.me0 r6 = com.google.android.gms.internal.ads.ot.b(r13, r6, r5)     // Catch:{ all -> 0x037b }
            r5.h(r14)
            goto L_0x0373
        L_0x0307:
            int r6 = com.google.android.gms.internal.ads.ot.f7716g     // Catch:{ all -> 0x037b }
            if (r8 != r6) goto L_0x0315
            java.lang.String r6 = "TALB"
            e8.me0 r6 = com.google.android.gms.internal.ads.ot.b(r13, r6, r5)     // Catch:{ all -> 0x037b }
            r5.h(r14)
            goto L_0x0373
        L_0x0315:
            int r6 = com.google.android.gms.internal.ads.ot.f7719j     // Catch:{ all -> 0x037b }
            if (r8 != r6) goto L_0x0323
            java.lang.String r6 = "USLT"
            e8.me0 r6 = com.google.android.gms.internal.ads.ot.b(r13, r6, r5)     // Catch:{ all -> 0x037b }
            r5.h(r14)
            goto L_0x0373
        L_0x0323:
            int r6 = com.google.android.gms.internal.ads.ot.f7720k     // Catch:{ all -> 0x037b }
            if (r8 != r6) goto L_0x032f
            e8.me0 r6 = com.google.android.gms.internal.ads.ot.b(r13, r12, r5)     // Catch:{ all -> 0x037b }
            r5.h(r14)
            goto L_0x0373
        L_0x032f:
            int r6 = com.google.android.gms.internal.ads.ot.f7723n     // Catch:{ all -> 0x037b }
            if (r8 != r6) goto L_0x033d
            java.lang.String r6 = "TIT1"
            e8.me0 r6 = com.google.android.gms.internal.ads.ot.b(r13, r6, r5)     // Catch:{ all -> 0x037b }
            r5.h(r14)
            goto L_0x0373
        L_0x033d:
            java.lang.String r6 = "Skipped unknown metadata entry: "
            java.lang.String r8 = e8.pd0.a(r13)     // Catch:{ all -> 0x037b }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x037b }
            int r12 = r8.length()     // Catch:{ all -> 0x037b }
            if (r12 == 0) goto L_0x0352
            java.lang.String r6 = r6.concat(r8)     // Catch:{ all -> 0x037b }
            goto L_0x0358
        L_0x0352:
            java.lang.String r8 = new java.lang.String     // Catch:{ all -> 0x037b }
            r8.<init>(r6)     // Catch:{ all -> 0x037b }
            r6 = r8
        L_0x0358:
            android.util.Log.d(r7, r6)     // Catch:{ all -> 0x037b }
            r5.h(r14)
            r6 = 0
            goto L_0x0373
        L_0x0360:
            java.lang.String r6 = "TCOM"
            e8.me0 r6 = com.google.android.gms.internal.ads.ot.b(r13, r6, r5)     // Catch:{ all -> 0x037b }
            r5.h(r14)
            goto L_0x0373
        L_0x036a:
            java.lang.String r6 = "TIT2"
            e8.me0 r6 = com.google.android.gms.internal.ads.ot.b(r13, r6, r5)     // Catch:{ all -> 0x037b }
            r5.h(r14)
        L_0x0373:
            if (r6 == 0) goto L_0x0378
            r2.add(r6)
        L_0x0378:
            r8 = 0
            goto L_0x0083
        L_0x037b:
            r0 = move-exception
            r5.h(r14)
            throw r0
        L_0x0380:
            boolean r5 = r2.isEmpty()
            if (r5 != 0) goto L_0x039d
            com.google.android.gms.internal.ads.wt r5 = new com.google.android.gms.internal.ads.wt
            r5.<init>((java.util.List<? extends com.google.android.gms.internal.ads.wt.a>) r2)
            r9 = r5
            goto L_0x039e
        L_0x038d:
            int r14 = r14 + -8
            r5.i(r14)
            r8 = 0
            goto L_0x0067
        L_0x0395:
            int r14 = r14 + -8
            r5.i(r14)
            r8 = 0
            goto L_0x004a
        L_0x039d:
            r9 = 0
        L_0x039e:
            if (r9 == 0) goto L_0x03ef
            r2 = 0
        L_0x03a1:
            com.google.android.gms.internal.ads.wt$a[] r5 = r9.f8478a
            int r6 = r5.length
            if (r2 >= r6) goto L_0x03ef
            r5 = r5[r2]
            boolean r6 = r5 instanceof e8.je0
            if (r6 == 0) goto L_0x03e9
            e8.je0 r5 = (e8.je0) r5
            java.lang.String r6 = r5.f15140c
            java.lang.String r5 = r5.f15141d
            boolean r6 = r11.equals(r6)
            if (r6 != 0) goto L_0x03bb
        L_0x03b8:
            r6 = 16
            goto L_0x03e5
        L_0x03bb:
            java.util.regex.Pattern r6 = com.google.android.gms.internal.ads.it.f7108c
            java.util.regex.Matcher r5 = r6.matcher(r5)
            boolean r6 = r5.find()
            if (r6 == 0) goto L_0x03b8
            r6 = 1
            java.lang.String r7 = r5.group(r6)     // Catch:{ NumberFormatException -> 0x03b8 }
            r6 = 16
            int r7 = java.lang.Integer.parseInt(r7, r6)     // Catch:{ NumberFormatException -> 0x03e5 }
            r8 = 2
            java.lang.String r5 = r5.group(r8)     // Catch:{ NumberFormatException -> 0x03e5 }
            int r5 = java.lang.Integer.parseInt(r5, r6)     // Catch:{ NumberFormatException -> 0x03e5 }
            if (r7 > 0) goto L_0x03df
            if (r5 <= 0) goto L_0x03e5
        L_0x03df:
            r4.f7109a = r7     // Catch:{ NumberFormatException -> 0x03e5 }
            r4.f7110b = r5     // Catch:{ NumberFormatException -> 0x03e5 }
            r7 = 1
            goto L_0x03e6
        L_0x03e5:
            r7 = 0
        L_0x03e6:
            if (r7 == 0) goto L_0x03eb
            goto L_0x03ef
        L_0x03e9:
            r6 = 16
        L_0x03eb:
            int r2 = r2 + 1
            goto L_0x03a1
        L_0x03ee:
            r9 = 0
        L_0x03ef:
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r2 = 0
        L_0x03fa:
            java.util.List<e8.od0> r10 = r1.R0
            int r10 = r10.size()
            if (r2 >= r10) goto L_0x05e8
            java.util.List<e8.od0> r10 = r1.R0
            java.lang.Object r10 = r10.get(r2)
            e8.od0 r10 = (e8.od0) r10
            int r11 = r10.f15996a
            int r12 = e8.pd0.E
            if (r11 != r12) goto L_0x05d3
            int r11 = e8.pd0.D
            e8.qd0 r12 = r1.b(r11)
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r15 = 0
            boolean r11 = r0.f7890o
            r16 = r11
            r11 = r10
            e8.yd0 r11 = com.google.android.gms.internal.ads.mt.b(r11, r12, r13, r15, r16)
            if (r11 == 0) goto L_0x05d3
            int r12 = e8.pd0.F
            e8.od0 r10 = r10.c(r12)
            int r12 = e8.pd0.G
            e8.od0 r10 = r10.c(r12)
            int r12 = e8.pd0.H
            e8.od0 r10 = r10.c(r12)
            e8.zd0 r10 = com.google.android.gms.internal.ads.mt.c(r11, r10, r4)
            int r12 = r10.f17726a
            if (r12 == 0) goto L_0x05d3
            e8.wd0 r12 = new e8.wd0
            e8.id0 r0 = r0.f7887l
            int r13 = r11.f17609b
            com.google.android.gms.internal.ads.yt r0 = (com.google.android.gms.internal.ads.yt) r0
            com.google.android.gms.internal.ads.gu r0 = r0.o(r2, r13)
            r12.<init>(r11, r10, r0)
            int r0 = r10.f17729d
            int r0 = r0 + 30
            r26 = r0
            e8.bc0 r13 = r11.f17613f
            e8.bc0 r14 = new e8.bc0
            r20 = r14
            java.lang.String r15 = r13.f13915a
            r21 = r15
            r16 = r1
            java.lang.String r1 = r13.f13919e
            r22 = r1
            r17 = r2
            java.lang.String r2 = r13.f13920f
            r23 = r2
            r18 = r7
            java.lang.String r7 = r13.f13917c
            r24 = r7
            int r8 = r13.f13916b
            r25 = r8
            r48 = r10
            int r10 = r13.f13924r
            r27 = r10
            r49 = r3
            int r3 = r13.f13925s
            r28 = r3
            r50 = r5
            float r5 = r13.f13926t
            r29 = r5
            int r6 = r13.f13927u
            r30 = r6
            r52 = r12
            float r12 = r13.f13928v
            r31 = r12
            r53 = r9
            byte[] r9 = r13.f13930x
            r32 = r9
            r54 = r9
            int r9 = r13.f13929w
            r33 = r9
            r55 = r9
            e8.hg0 r9 = r13.f13931y
            r34 = r9
            r56 = r9
            int r9 = r13.f13932z
            r35 = r9
            r57 = r9
            int r9 = r13.A
            r36 = r9
            r58 = r9
            int r9 = r13.B
            r37 = r9
            r59 = r9
            int r9 = r13.C
            r38 = r9
            int r9 = r13.D
            r39 = r9
            int r9 = r13.F
            r40 = r9
            r60 = r9
            java.lang.String r9 = r13.G
            r41 = r9
            r61 = r9
            int r9 = r13.H
            r42 = r9
            r62 = r5
            r63 = r6
            long r5 = r13.E
            r43 = r5
            r64 = r5
            java.util.List<byte[]> r5 = r13.f13922h
            r45 = r5
            com.google.android.gms.internal.ads.et r5 = r13.f13923i
            r46 = r5
            com.google.android.gms.internal.ads.wt r5 = r13.f13918d
            r47 = r5
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r45, r46, r47)
            int r5 = r11.f17609b
            r6 = 1
            if (r5 != r6) goto L_0x05b0
            int r5 = r4.f7109a
            r13 = -1
            if (r5 == r13) goto L_0x04f9
            int r6 = r4.f7110b
            if (r6 == r13) goto L_0x04f9
            r6 = 1
            goto L_0x04fa
        L_0x04f9:
            r6 = 0
        L_0x04fa:
            if (r6 == 0) goto L_0x0540
            int r6 = r4.f7110b
            r39 = r6
            e8.bc0 r6 = new e8.bc0
            r20 = r6
            java.util.List<byte[]> r13 = r14.f13922h
            r45 = r13
            com.google.android.gms.internal.ads.et r13 = r14.f13923i
            r46 = r13
            com.google.android.gms.internal.ads.wt r13 = r14.f13918d
            r47 = r13
            r21 = r15
            r22 = r1
            r23 = r2
            r24 = r7
            r25 = r8
            r26 = r0
            r27 = r10
            r28 = r3
            r29 = r62
            r30 = r63
            r31 = r12
            r32 = r54
            r33 = r55
            r34 = r56
            r35 = r57
            r36 = r58
            r37 = r59
            r38 = r5
            r40 = r60
            r41 = r61
            r42 = r9
            r43 = r64
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r45, r46, r47)
            r14 = r6
        L_0x0540:
            if (r53 == 0) goto L_0x05b0
            e8.bc0 r0 = new e8.bc0
            r20 = r0
            java.lang.String r1 = r14.f13915a
            r21 = r1
            java.lang.String r1 = r14.f13919e
            r22 = r1
            java.lang.String r1 = r14.f13920f
            r23 = r1
            java.lang.String r1 = r14.f13917c
            r24 = r1
            int r1 = r14.f13916b
            r25 = r1
            int r1 = r14.f13921g
            r26 = r1
            int r1 = r14.f13924r
            r27 = r1
            int r1 = r14.f13925s
            r28 = r1
            float r1 = r14.f13926t
            r29 = r1
            int r1 = r14.f13927u
            r30 = r1
            float r1 = r14.f13928v
            r31 = r1
            byte[] r1 = r14.f13930x
            r32 = r1
            int r1 = r14.f13929w
            r33 = r1
            e8.hg0 r1 = r14.f13931y
            r34 = r1
            int r1 = r14.f13932z
            r35 = r1
            int r1 = r14.A
            r36 = r1
            int r1 = r14.B
            r37 = r1
            int r1 = r14.C
            r38 = r1
            int r1 = r14.D
            r39 = r1
            int r1 = r14.F
            r40 = r1
            java.lang.String r1 = r14.G
            r41 = r1
            int r1 = r14.H
            r42 = r1
            long r1 = r14.E
            r43 = r1
            java.util.List<byte[]> r1 = r14.f13922h
            r45 = r1
            com.google.android.gms.internal.ads.et r1 = r14.f13923i
            r46 = r1
            r47 = r53
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r45, r46, r47)
            r14 = r0
        L_0x05b0:
            r0 = r52
            com.google.android.gms.internal.ads.gu r1 = r0.f17344c
            r1.g(r14)
            long r1 = r11.f17612e
            r5 = r50
            long r1 = java.lang.Math.max(r5, r1)
            r3 = r49
            r3.add(r0)
            r0 = r48
            long[] r0 = r0.f17727b
            r7 = 0
            r5 = r0[r7]
            int r0 = (r5 > r18 ? 1 : (r5 == r18 ? 0 : -1))
            if (r0 >= 0) goto L_0x05d1
            r18 = r5
        L_0x05d1:
            r5 = r1
            goto L_0x05dc
        L_0x05d3:
            r16 = r1
            r17 = r2
            r18 = r7
            r53 = r9
            r7 = 0
        L_0x05dc:
            int r2 = r17 + 1
            r0 = r66
            r1 = r16
            r7 = r18
            r9 = r53
            goto L_0x03fa
        L_0x05e8:
            r0.f7889n = r5
            int r1 = r3.size()
            e8.wd0[] r1 = new e8.wd0[r1]
            java.lang.Object[] r1 = r3.toArray(r1)
            e8.wd0[] r1 = (e8.wd0[]) r1
            r0.f7888m = r1
            e8.id0 r1 = r0.f7887l
            com.google.android.gms.internal.ads.yt r1 = (com.google.android.gms.internal.ads.yt) r1
            r1.p()
            e8.id0 r1 = r0.f7887l
            com.google.android.gms.internal.ads.yt r1 = (com.google.android.gms.internal.ads.yt) r1
            r1.f8658y = r0
            android.os.Handler r2 = r1.f8655v
            java.lang.Runnable r1 = r1.f8653t
            r2.post(r1)
            java.util.Stack<e8.od0> r1 = r0.f7879d
            r1.clear()
            r1 = 2
            r0.f7880e = r1
            goto L_0x0002
        L_0x0616:
            r16 = r1
            java.util.Stack<e8.od0> r1 = r0.f7879d
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0002
            java.util.Stack<e8.od0> r1 = r0.f7879d
            java.lang.Object r1 = r1.peek()
            e8.od0 r1 = (e8.od0) r1
            java.util.List<e8.od0> r1 = r1.R0
            r2 = r16
            r1.add(r2)
            goto L_0x0002
        L_0x0631:
            int r0 = r0.f7880e
            r1 = 2
            if (r0 == r1) goto L_0x0639
            r66.j()
        L_0x0639:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.pt.i(long):void");
    }

    public final void j() {
        this.f7880e = 0;
        this.f7883h = 0;
    }
}
