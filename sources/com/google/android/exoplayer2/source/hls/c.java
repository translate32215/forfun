package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import b6.m;
import ba.a;
import ba.o0;
import ba.s;
import com.google.android.exoplayer2.upstream.e;
import d5.i;
import e6.f;
import e6.g;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import n5.d0;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import v6.b0;
import v6.e0;
import v6.v;

/* compiled from: HlsMediaChunk */
public final class c extends m {
    public static final AtomicInteger L = new AtomicInteger();
    public final boolean A;
    public final boolean B;
    public g C;
    public f D;
    public int E;
    public boolean F;
    public volatile boolean G;
    public boolean H;
    public s<Integer> I;
    public boolean J;
    public boolean K;

    /* renamed from: k  reason: collision with root package name */
    public final int f5187k;

    /* renamed from: l  reason: collision with root package name */
    public final int f5188l;

    /* renamed from: m  reason: collision with root package name */
    public final Uri f5189m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f5190n;

    /* renamed from: o  reason: collision with root package name */
    public final int f5191o;

    /* renamed from: p  reason: collision with root package name */
    public final e f5192p;

    /* renamed from: q  reason: collision with root package name */
    public final u6.e f5193q;

    /* renamed from: r  reason: collision with root package name */
    public final g f5194r;

    /* renamed from: s  reason: collision with root package name */
    public final boolean f5195s;

    /* renamed from: t  reason: collision with root package name */
    public final boolean f5196t;

    /* renamed from: u  reason: collision with root package name */
    public final b0 f5197u;

    /* renamed from: v  reason: collision with root package name */
    public final f f5198v;

    /* renamed from: w  reason: collision with root package name */
    public final List<x4.b0> f5199w;

    /* renamed from: x  reason: collision with root package name */
    public final c5.f f5200x;

    /* renamed from: y  reason: collision with root package name */
    public final v5.g f5201y;

    /* renamed from: z  reason: collision with root package name */
    public final v f5202z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(f fVar, e eVar, u6.e eVar2, x4.b0 b0Var, boolean z10, e eVar3, u6.e eVar4, boolean z11, Uri uri, List<x4.b0> list, int i10, Object obj, long j10, long j11, long j12, int i11, boolean z12, int i12, boolean z13, boolean z14, b0 b0Var2, c5.f fVar2, g gVar, v5.g gVar2, v vVar, boolean z15) {
        super(eVar, eVar2, b0Var, i10, obj, j10, j11, j12);
        u6.e eVar5 = eVar4;
        this.A = z10;
        this.f5191o = i11;
        this.K = z12;
        this.f5188l = i12;
        this.f5193q = eVar5;
        this.f5192p = eVar3;
        this.F = eVar5 != null;
        this.B = z11;
        this.f5189m = uri;
        this.f5195s = z14;
        this.f5197u = b0Var2;
        this.f5196t = z13;
        this.f5198v = fVar;
        this.f5199w = list;
        this.f5200x = fVar2;
        this.f5194r = gVar;
        this.f5201y = gVar2;
        this.f5202z = vVar;
        this.f5190n = z15;
        a<Object> aVar = s.f3795b;
        this.I = o0.f3765e;
        this.f5187k = L.getAndIncrement();
    }

    public static byte[] f(String str) {
        if (e0.V(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    public void a() throws IOException {
        g gVar;
        this.D.getClass();
        if (this.C == null && (gVar = this.f5194r) != null) {
            i iVar = ((e6.a) gVar).f13611a;
            if ((iVar instanceof d0) || (iVar instanceof k5.f)) {
                this.C = gVar;
                this.F = false;
            }
        }
        if (this.F) {
            this.f5192p.getClass();
            this.f5193q.getClass();
            e(this.f5192p, this.f5193q, this.B);
            this.E = 0;
            this.F = false;
        }
        if (!this.G) {
            if (!this.f5196t) {
                try {
                    b0 b0Var = this.f5197u;
                    boolean z10 = this.f5195s;
                    long j10 = this.f3595g;
                    synchronized (b0Var) {
                        if (z10) {
                            if (!b0Var.f26425a) {
                                b0Var.f26426b = j10;
                                b0Var.f26425a = true;
                            }
                        }
                        if (!z10 || j10 != b0Var.f26426b) {
                            while (b0Var.f26428d == -9223372036854775807L) {
                                b0Var.wait();
                            }
                        }
                    }
                    e(this.f3597i, this.f3590b, this.A);
                } catch (InterruptedException unused) {
                    throw new InterruptedIOException();
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.H = !this.G;
        }
    }

    public void b() {
        this.G = true;
    }

    public boolean d() {
        return this.H;
    }

    @RequiresNonNull({"output"})
    public final void e(e eVar, u6.e eVar2, boolean z10) throws IOException {
        u6.e eVar3;
        boolean z11;
        d5.f h10;
        long j10;
        long j11;
        boolean z12;
        if (z10) {
            z11 = this.E != 0;
            eVar3 = eVar2;
        } else {
            eVar3 = eVar2.b((long) this.E);
            z11 = false;
        }
        try {
            h10 = h(eVar, eVar3);
            if (z11) {
                h10.g(this.E);
            }
            do {
                if (this.G) {
                    break;
                } else if (((e6.a) this.C).f13611a.f(h10, e6.a.f13610d) == 0) {
                    z12 = true;
                    continue;
                } else {
                    z12 = false;
                    continue;
                }
                break;
                break;
            } while (z12);
            break;
            j10 = h10.f13029d;
            j11 = eVar2.f26053f;
        } catch (EOFException e10) {
            if ((this.f3592d.f27401e & 16384) != 0) {
                ((e6.a) this.C).f13611a.h(0, 0);
                j10 = h10.f13029d;
                j11 = eVar2.f26053f;
            } else {
                throw e10;
            }
        } catch (Throwable th) {
            if (eVar != null) {
                try {
                    eVar.close();
                } catch (IOException unused) {
                }
            }
            throw th;
        }
        this.E = (int) (j10 - j11);
        try {
            eVar.close();
        } catch (IOException unused2) {
        }
    }

    public int g(int i10) {
        v6.a.d(!this.f5190n);
        if (i10 >= this.I.size()) {
            return 0;
        }
        return this.I.get(i10).intValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:139:0x02b5  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x02b7  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x02ba  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x02d4  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x012a  */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"output"})
    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"extractor"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final d5.f h(com.google.android.exoplayer2.upstream.e r19, u6.e r20) throws java.io.IOException {
        /*
            r18 = this;
            r1 = r18
            r0 = r20
            long r6 = r19.O(r20)
            d5.f r8 = new d5.f
            long r4 = r0.f26053f
            r2 = r8
            r3 = r19
            r2.<init>(r3, r4, r6)
            e6.g r2 = r1.C
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L_0x02ed
            r8.f()
            r2 = 8
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            v6.v r7 = r1.f5202z     // Catch:{ EOFException -> 0x00ac }
            r9 = 10
            r7.z(r9)     // Catch:{ EOFException -> 0x00ac }
            v6.v r7 = r1.f5202z     // Catch:{ EOFException -> 0x00ac }
            byte[] r7 = r7.f26518a     // Catch:{ EOFException -> 0x00ac }
            r8.j(r7, r4, r9)     // Catch:{ EOFException -> 0x00ac }
            v6.v r7 = r1.f5202z
            int r7 = r7.u()
            r10 = 4801587(0x494433, float:6.728456E-39)
            if (r7 == r10) goto L_0x003c
            goto L_0x00ac
        L_0x003c:
            v6.v r7 = r1.f5202z
            r10 = 3
            r7.E(r10)
            v6.v r7 = r1.f5202z
            int r7 = r7.r()
            int r10 = r7 + 10
            v6.v r11 = r1.f5202z
            byte[] r12 = r11.f26518a
            int r13 = r12.length
            if (r10 <= r13) goto L_0x005b
            r11.z(r10)
            v6.v r10 = r1.f5202z
            byte[] r10 = r10.f26518a
            java.lang.System.arraycopy(r12, r4, r10, r4, r9)
        L_0x005b:
            v6.v r10 = r1.f5202z
            byte[] r10 = r10.f26518a
            r8.j(r10, r9, r7)
            v5.g r9 = r1.f5201y
            v6.v r10 = r1.f5202z
            byte[] r10 = r10.f26518a
            q5.a r7 = r9.d(r10, r7)
            if (r7 != 0) goto L_0x006f
            goto L_0x00ac
        L_0x006f:
            q5.a$b[] r9 = r7.f24150a
            int r9 = r9.length
            r10 = 0
        L_0x0073:
            if (r10 >= r9) goto L_0x00ac
            q5.a$b[] r11 = r7.f24150a
            r11 = r11[r10]
            boolean r12 = r11 instanceof v5.k
            if (r12 == 0) goto L_0x00a9
            v5.k r11 = (v5.k) r11
            java.lang.String r12 = r11.f26414b
            java.lang.String r13 = "com.apple.streaming.transportStreamTimestamp"
            boolean r12 = r13.equals(r12)
            if (r12 == 0) goto L_0x00a9
            byte[] r7 = r11.f26415c
            v6.v r9 = r1.f5202z
            byte[] r9 = r9.f26518a
            java.lang.System.arraycopy(r7, r4, r9, r4, r2)
            v6.v r7 = r1.f5202z
            r7.D(r4)
            v6.v r7 = r1.f5202z
            r7.C(r2)
            v6.v r2 = r1.f5202z
            long r9 = r2.m()
            r11 = 8589934591(0x1ffffffff, double:4.2439915814E-314)
            long r9 = r9 & r11
            goto L_0x00ad
        L_0x00a9:
            int r10 = r10 + 1
            goto L_0x0073
        L_0x00ac:
            r9 = r5
        L_0x00ad:
            r8.f13031f = r4
            e6.g r2 = r1.f5194r
            if (r2 == 0) goto L_0x012a
            e6.a r2 = (e6.a) r2
            d5.i r0 = r2.f13611a
            boolean r7 = r0 instanceof n5.d0
            if (r7 != 0) goto L_0x00c2
            boolean r0 = r0 instanceof k5.f
            if (r0 == 0) goto L_0x00c0
            goto L_0x00c2
        L_0x00c0:
            r0 = 0
            goto L_0x00c3
        L_0x00c2:
            r0 = 1
        L_0x00c3:
            r0 = r0 ^ r3
            v6.a.d(r0)
            d5.i r0 = r2.f13611a
            boolean r3 = r0 instanceof com.google.android.exoplayer2.source.hls.g
            if (r3 == 0) goto L_0x00d9
            com.google.android.exoplayer2.source.hls.g r0 = new com.google.android.exoplayer2.source.hls.g
            x4.b0 r3 = r2.f13612b
            java.lang.String r3 = r3.f27399c
            v6.b0 r4 = r2.f13613c
            r0.<init>(r3, r4)
            goto L_0x0100
        L_0x00d9:
            boolean r3 = r0 instanceof n5.e
            if (r3 == 0) goto L_0x00e3
            n5.e r0 = new n5.e
            r0.<init>(r4)
            goto L_0x0100
        L_0x00e3:
            boolean r3 = r0 instanceof n5.a
            if (r3 == 0) goto L_0x00ed
            n5.a r0 = new n5.a
            r0.<init>()
            goto L_0x0100
        L_0x00ed:
            boolean r3 = r0 instanceof n5.c
            if (r3 == 0) goto L_0x00f7
            n5.c r0 = new n5.c
            r0.<init>()
            goto L_0x0100
        L_0x00f7:
            boolean r0 = r0 instanceof j5.d
            if (r0 == 0) goto L_0x010d
            j5.d r0 = new j5.d
            r0.<init>(r4, r5)
        L_0x0100:
            e6.a r3 = new e6.a
            x4.b0 r4 = r2.f13612b
            v6.b0 r2 = r2.f13613c
            r3.<init>(r0, r4, r2)
            r16 = r9
            goto L_0x029e
        L_0x010d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r3 = "Unexpected extractor type for recreation: "
            java.lang.StringBuilder r3 = android.support.v4.media.a.a(r3)
            d5.i r2 = r2.f13611a
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getSimpleName()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r0.<init>(r2)
            throw r0
        L_0x012a:
            e6.f r2 = r1.f5198v
            android.net.Uri r0 = r0.f26048a
            x4.b0 r4 = r1.f3592d
            java.util.List<x4.b0> r5 = r1.f5199w
            v6.b0 r6 = r1.f5197u
            java.util.Map r7 = r19.N()
            e6.c r2 = (e6.c) r2
            r2.getClass()
            java.lang.String r2 = r4.f27408t
            int r2 = e.h.a(r2)
            int r7 = e.h.b(r7)
            int r0 = e.h.c(r0)
            java.util.ArrayList r11 = new java.util.ArrayList
            int[] r12 = e6.c.f13615b
            int r13 = r12.length
            r11.<init>(r13)
            e6.c.a(r2, r11)
            e6.c.a(r7, r11)
            e6.c.a(r0, r11)
            int r13 = r12.length
            r14 = 0
        L_0x015e:
            if (r14 >= r13) goto L_0x0168
            r15 = r12[r14]
            e6.c.a(r15, r11)
            int r14 = r14 + 1
            goto L_0x015e
        L_0x0168:
            r8.f()
            r12 = 0
            r13 = 0
        L_0x016d:
            int r14 = r11.size()
            if (r12 >= r14) goto L_0x0293
            java.lang.Object r14 = r11.get(r12)
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r14 = r14.intValue()
            r15 = 11
            if (r14 == 0) goto L_0x0257
            if (r14 == r3) goto L_0x024d
            r3 = 2
            if (r14 == r3) goto L_0x0241
            r3 = 7
            if (r14 == r3) goto L_0x0234
            r3 = 8
            if (r14 == r3) goto L_0x01fc
            if (r14 == r15) goto L_0x01a2
            r3 = 13
            if (r14 == r3) goto L_0x0195
            r3 = 0
            goto L_0x019c
        L_0x0195:
            com.google.android.exoplayer2.source.hls.g r3 = new com.google.android.exoplayer2.source.hls.g
            java.lang.String r15 = r4.f27399c
            r3.<init>(r15, r6)
        L_0x019c:
            r16 = r9
            r19 = r11
            goto L_0x0260
        L_0x01a2:
            if (r5 == 0) goto L_0x01aa
            r3 = 48
            r15 = r5
            r19 = r11
            goto L_0x01c2
        L_0x01aa:
            x4.b0$b r3 = new x4.b0$b
            r3.<init>()
            java.lang.String r15 = "application/cea-608"
            r3.f27425k = r15
            x4.b0 r3 = r3.a()
            java.util.List r3 = java.util.Collections.singletonList(r3)
            r15 = 16
            r15 = r3
            r19 = r11
            r3 = 16
        L_0x01c2:
            java.lang.String r11 = r4.f27405i
            boolean r16 = android.text.TextUtils.isEmpty(r11)
            if (r16 != 0) goto L_0x01eb
            r16 = r9
            java.lang.String r9 = "audio/mp4a-latm"
            java.lang.String r9 = v6.s.c(r11, r9)
            if (r9 == 0) goto L_0x01d6
            r9 = 1
            goto L_0x01d7
        L_0x01d6:
            r9 = 0
        L_0x01d7:
            if (r9 != 0) goto L_0x01db
            r3 = r3 | 2
        L_0x01db:
            java.lang.String r9 = "video/avc"
            java.lang.String r9 = v6.s.c(r11, r9)
            if (r9 == 0) goto L_0x01e5
            r9 = 1
            goto L_0x01e6
        L_0x01e5:
            r9 = 0
        L_0x01e6:
            if (r9 != 0) goto L_0x01ed
            r3 = r3 | 4
            goto L_0x01ed
        L_0x01eb:
            r16 = r9
        L_0x01ed:
            n5.d0 r9 = new n5.d0
            n5.g r10 = new n5.g
            r10.<init>(r3, r15)
            r3 = 112800(0x1b8a0, float:1.58066E-40)
            r11 = 2
            r9.<init>(r11, r6, r10, r3)
            goto L_0x024b
        L_0x01fc:
            r16 = r9
            r19 = r11
            k5.f r3 = new k5.f
            q5.a r9 = r4.f27406r
            if (r9 != 0) goto L_0x0207
            goto L_0x0221
        L_0x0207:
            r10 = 0
        L_0x0208:
            q5.a$b[] r11 = r9.f24150a
            int r15 = r11.length
            if (r10 >= r15) goto L_0x0221
            r11 = r11[r10]
            boolean r15 = r11 instanceof e6.h
            if (r15 == 0) goto L_0x021e
            e6.h r11 = (e6.h) r11
            java.util.List<e6.h$b> r9 = r11.f13621c
            boolean r9 = r9.isEmpty()
            r9 = r9 ^ 1
            goto L_0x0222
        L_0x021e:
            int r10 = r10 + 1
            goto L_0x0208
        L_0x0221:
            r9 = 0
        L_0x0222:
            if (r9 == 0) goto L_0x0226
            r9 = 4
            goto L_0x0227
        L_0x0226:
            r9 = 0
        L_0x0227:
            if (r5 == 0) goto L_0x022b
            r10 = r5
            goto L_0x022f
        L_0x022b:
            java.util.List r10 = java.util.Collections.emptyList()
        L_0x022f:
            r11 = 0
            r3.<init>(r9, r6, r11, r10)
            goto L_0x0260
        L_0x0234:
            r16 = r9
            r19 = r11
            j5.d r3 = new j5.d
            r9 = 0
            r10 = 0
            r3.<init>(r9, r10)
            goto L_0x0260
        L_0x0241:
            r16 = r9
            r19 = r11
            r3 = 0
            n5.e r9 = new n5.e
            r9.<init>(r3)
        L_0x024b:
            r3 = r9
            goto L_0x0260
        L_0x024d:
            r16 = r9
            r19 = r11
            n5.c r3 = new n5.c
            r3.<init>()
            goto L_0x0260
        L_0x0257:
            r16 = r9
            r19 = r11
            n5.a r3 = new n5.a
            r3.<init>()
        L_0x0260:
            r3.getClass()
            boolean r9 = r3.e(r8)     // Catch:{ EOFException -> 0x0271, all -> 0x026b }
            r8.f()
            goto L_0x0275
        L_0x026b:
            r0 = move-exception
            r2 = r0
            r8.f()
            throw r2
        L_0x0271:
            r8.f()
            r9 = 0
        L_0x0275:
            if (r9 == 0) goto L_0x027d
            e6.a r0 = new e6.a
            r0.<init>(r3, r4, r6)
            goto L_0x029d
        L_0x027d:
            if (r13 != 0) goto L_0x028a
            if (r14 == r2) goto L_0x0289
            if (r14 == r7) goto L_0x0289
            if (r14 == r0) goto L_0x0289
            r9 = 11
            if (r14 != r9) goto L_0x028a
        L_0x0289:
            r13 = r3
        L_0x028a:
            int r12 = r12 + 1
            r3 = 1
            r11 = r19
            r9 = r16
            goto L_0x016d
        L_0x0293:
            r16 = r9
            e6.a r0 = new e6.a
            r13.getClass()
            r0.<init>(r13, r4, r6)
        L_0x029d:
            r3 = r0
        L_0x029e:
            r1.C = r3
            e6.a r3 = (e6.a) r3
            d5.i r0 = r3.f13611a
            boolean r2 = r0 instanceof n5.e
            if (r2 != 0) goto L_0x02b7
            boolean r2 = r0 instanceof n5.a
            if (r2 != 0) goto L_0x02b7
            boolean r2 = r0 instanceof n5.c
            if (r2 != 0) goto L_0x02b7
            boolean r0 = r0 instanceof j5.d
            if (r0 == 0) goto L_0x02b5
            goto L_0x02b7
        L_0x02b5:
            r0 = 0
            goto L_0x02b8
        L_0x02b7:
            r0 = 1
        L_0x02b8:
            if (r0 == 0) goto L_0x02d4
            com.google.android.exoplayer2.source.hls.f r0 = r1.D
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r16 > r2 ? 1 : (r16 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x02ce
            v6.b0 r2 = r1.f5197u
            r5 = r16
            long r2 = r2.b(r5)
            goto L_0x02d0
        L_0x02ce:
            long r2 = r1.f3595g
        L_0x02d0:
            r0.I(r2)
            goto L_0x02db
        L_0x02d4:
            com.google.android.exoplayer2.source.hls.f r0 = r1.D
            r2 = 0
            r0.I(r2)
        L_0x02db:
            com.google.android.exoplayer2.source.hls.f r0 = r1.D
            java.util.Set<java.lang.Integer> r0 = r0.E
            r0.clear()
            e6.g r0 = r1.C
            com.google.android.exoplayer2.source.hls.f r2 = r1.D
            e6.a r0 = (e6.a) r0
            d5.i r0 = r0.f13611a
            r0.i(r2)
        L_0x02ed:
            com.google.android.exoplayer2.source.hls.f r0 = r1.D
            c5.f r2 = r1.f5200x
            c5.f r3 = r0.f5243j0
            boolean r3 = v6.e0.a(r3, r2)
            if (r3 != 0) goto L_0x0311
            r0.f5243j0 = r2
            r3 = 0
        L_0x02fc:
            com.google.android.exoplayer2.source.hls.f$d[] r4 = r0.C
            int r5 = r4.length
            if (r3 >= r5) goto L_0x0311
            boolean[] r5 = r0.f5228b0
            boolean r5 = r5[r3]
            if (r5 == 0) goto L_0x030e
            r4 = r4[r3]
            r4.K = r2
            r5 = 1
            r4.A = r5
        L_0x030e:
            int r3 = r3 + 1
            goto L_0x02fc
        L_0x0311:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.c.h(com.google.android.exoplayer2.upstream.e, u6.e):d5.f");
    }
}
