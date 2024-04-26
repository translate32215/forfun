package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseArray;
import e8.bf0;
import e8.id0;
import e8.jd0;
import e8.kf0;
import e8.oe0;
import e8.pe0;
import e8.qz;
import e8.re0;
import e8.s30;
import e8.se0;
import e8.ue0;
import e8.uf0;
import e8.we0;
import e8.yf0;
import java.io.IOException;
import o.a;
import u6.f;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class yt implements id0, cu, we0 {
    public boolean A;
    public boolean B;
    public boolean C;
    public int D;
    public bf0 E;
    public long F;
    public boolean[] G;
    public boolean[] H;
    public boolean I;
    public long J;
    public long K;
    public long L;
    public int M;
    public boolean N;
    public boolean O;

    /* renamed from: a  reason: collision with root package name */
    public final Uri f8642a;

    /* renamed from: b  reason: collision with root package name */
    public final ju f8643b;

    /* renamed from: c  reason: collision with root package name */
    public final int f8644c;

    /* renamed from: d  reason: collision with root package name */
    public final Handler f8645d;

    /* renamed from: e  reason: collision with root package name */
    public final pe0 f8646e;

    /* renamed from: f  reason: collision with root package name */
    public final se0 f8647f;

    /* renamed from: g  reason: collision with root package name */
    public final f f8648g;

    /* renamed from: h  reason: collision with root package name */
    public final long f8649h;

    /* renamed from: i  reason: collision with root package name */
    public final j8 f8650i = new j8("Loader:ExtractorMediaPeriod");

    /* renamed from: r  reason: collision with root package name */
    public final au f8651r;

    /* renamed from: s  reason: collision with root package name */
    public final yf0 f8652s;

    /* renamed from: t  reason: collision with root package name */
    public final Runnable f8653t;

    /* renamed from: u  reason: collision with root package name */
    public final Runnable f8654u;

    /* renamed from: v  reason: collision with root package name */
    public final Handler f8655v;

    /* renamed from: w  reason: collision with root package name */
    public final SparseArray<gu> f8656w;

    /* renamed from: x  reason: collision with root package name */
    public re0 f8657x;

    /* renamed from: y  reason: collision with root package name */
    public jd0 f8658y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f8659z;

    public yt(Uri uri, ju juVar, ht[] htVarArr, int i10, Handler handler, pe0 pe0, se0 se0, f fVar, int i11) {
        this.f8642a = uri;
        this.f8643b = juVar;
        this.f8644c = i10;
        this.f8645d = handler;
        this.f8646e = pe0;
        this.f8647f = se0;
        this.f8648g = fVar;
        this.f8649h = (long) i11;
        this.f8651r = new au(htVarArr, this);
        this.f8652s = new yf0();
        this.f8653t = new s30(this);
        this.f8654u = new qz(this);
        this.f8655v = new Handler();
        this.L = -9223372036854775807L;
        this.f8656w = new SparseArray<>();
        this.J = -1;
    }

    public final boolean a(long j10) {
        if (this.N) {
            return false;
        }
        if (this.A && this.D == 0) {
            return false;
        }
        boolean a10 = this.f8652s.a();
        if (this.f8650i.d()) {
            return a10;
        }
        c();
        return true;
    }

    public final long b() {
        if (this.D == 0) {
            return Long.MIN_VALUE;
        }
        return i();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005c, code lost:
        r0 = r10.f8658y;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c() {
        /*
            r10 = this;
            com.google.android.gms.internal.ads.zt r6 = new com.google.android.gms.internal.ads.zt
            android.net.Uri r2 = r10.f8642a
            com.google.android.gms.internal.ads.ju r3 = r10.f8643b
            com.google.android.gms.internal.ads.au r4 = r10.f8651r
            e8.yf0 r5 = r10.f8652s
            r0 = r6
            r1 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            boolean r0 = r10.A
            r1 = 1
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 == 0) goto L_0x0045
            boolean r0 = r10.s()
            o.a.c(r0)
            long r4 = r10.F
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0031
            long r7 = r10.L
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x0031
            r10.N = r1
            r10.L = r2
            return
        L_0x0031:
            e8.jd0 r0 = r10.f8658y
            long r4 = r10.L
            long r4 = r0.d(r4)
            long r7 = r10.L
            d5.w r0 = r6.f8763e
            r0.f13063a = r4
            r6.f8766h = r7
            r6.f8765g = r1
            r10.L = r2
        L_0x0045:
            int r0 = r10.q()
            r10.M = r0
            int r0 = r10.f8644c
            r4 = -1
            if (r0 != r4) goto L_0x006f
            boolean r0 = r10.A
            if (r0 == 0) goto L_0x006c
            long r4 = r10.J
            r7 = -1
            int r0 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x006c
            e8.jd0 r0 = r10.f8658y
            if (r0 == 0) goto L_0x0069
            long r4 = r0.c()
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0069
            goto L_0x006c
        L_0x0069:
            r0 = 6
            r5 = 6
            goto L_0x0070
        L_0x006c:
            r0 = 3
            r5 = 3
            goto L_0x0070
        L_0x006f:
            r5 = r0
        L_0x0070:
            com.google.android.gms.internal.ads.j8 r2 = r10.f8650i
            r2.getClass()
            android.os.Looper r3 = android.os.Looper.myLooper()
            if (r3 == 0) goto L_0x007c
            goto L_0x007d
        L_0x007c:
            r1 = 0
        L_0x007d:
            o.a.c(r1)
            long r7 = android.os.SystemClock.elapsedRealtime()
            e8.uf0 r9 = new e8.uf0
            r0 = r9
            r1 = r2
            r2 = r3
            r3 = r6
            r4 = r10
            r6 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0 = 0
            r9.a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.yt.c():void");
    }

    public final bf0 d() {
        return this.E;
    }

    public final long e(kf0[] kf0Arr, boolean[] zArr, oe0[] oe0Arr, boolean[] zArr2, long j10) {
        a.c(this.A);
        for (int i10 = 0; i10 < kf0Arr.length; i10++) {
            if (oe0Arr[i10] != null && (kf0Arr[i10] == null || !zArr[i10])) {
                int i11 = oe0Arr[i10].f15791a;
                a.c(this.G[i11]);
                this.D--;
                this.G[i11] = false;
                this.f8656w.valueAt(i11).a();
                oe0Arr[i10] = null;
            }
        }
        boolean z10 = false;
        for (int i12 = 0; i12 < kf0Arr.length; i12++) {
            if (oe0Arr[i12] == null && kf0Arr[i12] != null) {
                kf0 kf0 = kf0Arr[i12];
                a.c(kf0.length() == 1);
                a.c(kf0.a(0) == 0);
                int a10 = this.E.a(kf0.b());
                a.c(!this.G[a10]);
                this.D++;
                this.G[a10] = true;
                oe0Arr[i12] = new oe0(this, a10);
                zArr2[i12] = true;
                z10 = true;
            }
        }
        if (!this.B) {
            int size = this.f8656w.size();
            for (int i13 = 0; i13 < size; i13++) {
                if (!this.G[i13]) {
                    this.f8656w.valueAt(i13).a();
                }
            }
        }
        if (this.D == 0) {
            this.C = false;
            if (this.f8650i.d()) {
                ((uf0) this.f8650i.f7135c).b(false);
            }
        } else if (!this.B ? j10 != 0 : z10) {
            j10 = j(j10);
            for (int i14 = 0; i14 < oe0Arr.length; i14++) {
                if (oe0Arr[i14] != null) {
                    zArr2[i14] = true;
                }
            }
        }
        this.B = true;
        return j10;
    }

    public final long f() {
        if (!this.C) {
            return -9223372036854775807L;
        }
        this.C = false;
        return this.K;
    }

    public final void g(long j10) {
    }

    public final void h(zt ztVar) {
        if (this.J == -1) {
            this.J = ztVar.f8767i;
        }
    }

    public final long i() {
        long j10;
        if (this.N) {
            return Long.MIN_VALUE;
        }
        if (s()) {
            return this.L;
        }
        if (this.I) {
            j10 = Long.MAX_VALUE;
            int size = this.f8656w.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (this.H[i10]) {
                    j10 = Math.min(j10, this.f8656w.valueAt(i10).j());
                }
            }
        } else {
            j10 = r();
        }
        return j10 == Long.MIN_VALUE ? this.K : j10;
    }

    public final long j(long j10) {
        if (!this.f8658y.b()) {
            j10 = 0;
        }
        this.K = j10;
        int size = this.f8656w.size();
        boolean z10 = !s();
        int i10 = 0;
        while (z10 && i10 < size) {
            if (this.G[i10]) {
                z10 = this.f8656w.valueAt(i10).h(j10, false);
            }
            i10++;
        }
        if (!z10) {
            this.L = j10;
            this.N = false;
            if (this.f8650i.d()) {
                ((uf0) this.f8650i.f7135c).b(false);
            } else {
                for (int i11 = 0; i11 < size; i11++) {
                    this.f8656w.valueAt(i11).o(this.G[i11]);
                }
            }
        }
        this.C = false;
        return j10;
    }

    public final void k(re0 re0, long j10) {
        this.f8657x = re0;
        this.f8652s.a();
        c();
    }

    public final void l() throws IOException {
        this.f8650i.k();
    }

    public final void m(zt ztVar, boolean z10) {
        h(ztVar);
        if (!z10 && this.D > 0) {
            int size = this.f8656w.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f8656w.valueAt(i10).o(this.G[i10]);
            }
            this.f8657x.h(this);
        }
    }

    public final void n(jd0 jd0) {
        this.f8658y = jd0;
        this.f8655v.post(this.f8653t);
    }

    public final gu o(int i10, int i11) {
        gu guVar = this.f8656w.get(i10);
        if (guVar != null) {
            return guVar;
        }
        gu guVar2 = new gu(this.f8648g);
        guVar2.f6703l = this;
        this.f8656w.put(i10, guVar2);
        return guVar2;
    }

    public final void p() {
        this.f8659z = true;
        this.f8655v.post(this.f8653t);
    }

    public final int q() {
        int size = this.f8656w.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            ue0 ue0 = this.f8656w.valueAt(i11).f6694c;
            i10 += ue0.f16937j + ue0.f16936i;
        }
        return i10;
    }

    public final long r() {
        int size = this.f8656w.size();
        long j10 = Long.MIN_VALUE;
        for (int i10 = 0; i10 < size; i10++) {
            j10 = Math.max(j10, this.f8656w.valueAt(i10).j());
        }
        return j10;
    }

    public final boolean s() {
        return this.L != -9223372036854775807L;
    }
}
