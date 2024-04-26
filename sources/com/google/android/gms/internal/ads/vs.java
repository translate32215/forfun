package com.google.android.gms.internal.ads;

import android.util.Log;
import e8.bf0;
import e8.eg0;
import e8.kf0;
import e8.lf0;
import e8.mf0;
import e8.oe0;
import e8.ra;
import o.a;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class vs {

    /* renamed from: a  reason: collision with root package name */
    public final cu f8387a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f8388b;

    /* renamed from: c  reason: collision with root package name */
    public final int f8389c;

    /* renamed from: d  reason: collision with root package name */
    public final oe0[] f8390d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean[] f8391e;

    /* renamed from: f  reason: collision with root package name */
    public final long f8392f;

    /* renamed from: g  reason: collision with root package name */
    public int f8393g;

    /* renamed from: h  reason: collision with root package name */
    public long f8394h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f8395i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f8396j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f8397k;

    /* renamed from: l  reason: collision with root package name */
    public vs f8398l;

    /* renamed from: m  reason: collision with root package name */
    public mf0 f8399m;

    /* renamed from: n  reason: collision with root package name */
    public final ws[] f8400n;

    /* renamed from: o  reason: collision with root package name */
    public final ss[] f8401o;

    /* renamed from: p  reason: collision with root package name */
    public final iu f8402p;

    /* renamed from: q  reason: collision with root package name */
    public final ra f8403q;

    /* renamed from: r  reason: collision with root package name */
    public final du f8404r;

    /* renamed from: s  reason: collision with root package name */
    public mf0 f8405s;

    public vs(ws[] wsVarArr, ss[] ssVarArr, long j10, iu iuVar, ra raVar, du duVar, Object obj, int i10, int i11, boolean z10, long j11) {
        this.f8400n = wsVarArr;
        this.f8401o = ssVarArr;
        this.f8392f = j10;
        this.f8402p = iuVar;
        this.f8403q = raVar;
        this.f8404r = duVar;
        obj.getClass();
        this.f8388b = obj;
        this.f8389c = i10;
        this.f8393g = i11;
        this.f8395i = z10;
        this.f8394h = j11;
        this.f8390d = new oe0[wsVarArr.length];
        this.f8391e = new boolean[wsVarArr.length];
        this.f8387a = duVar.a(i11, raVar.f16253a);
    }

    public final void a() {
        try {
            this.f8404r.c(this.f8387a);
        } catch (RuntimeException e10) {
            Log.e("ExoPlayerImplInternal", "Period release failed.", e10);
        }
    }

    public final long b(long j10, boolean z10, boolean[] zArr) {
        int i10;
        lf0 lf0 = this.f8399m.f15502b;
        int i11 = 0;
        while (true) {
            boolean z11 = true;
            if (i11 >= lf0.f15383a) {
                break;
            }
            boolean[] zArr2 = this.f8391e;
            if (z10 || !this.f8399m.a(this.f8405s, i11)) {
                z11 = false;
            }
            zArr2[i11] = z11;
            i11++;
        }
        long e10 = this.f8387a.e((kf0[]) lf0.f15384b.clone(), this.f8391e, this.f8390d, zArr, j10);
        this.f8405s = this.f8399m;
        this.f8397k = false;
        int i12 = 0;
        while (true) {
            oe0[] oe0Arr = this.f8390d;
            if (i12 >= oe0Arr.length) {
                break;
            }
            if (oe0Arr[i12] != null) {
                a.c(lf0.f15384b[i12] != null);
                this.f8397k = true;
            } else {
                a.c(lf0.f15384b[i12] == null);
            }
            i12++;
        }
        ra raVar = this.f8403q;
        ws[] wsVarArr = this.f8400n;
        bf0 bf0 = this.f8399m.f15501a;
        raVar.f16258f = 0;
        for (int i13 = 0; i13 < wsVarArr.length; i13++) {
            if (lf0.f15384b[i13] != null) {
                int i14 = raVar.f16258f;
                int g10 = wsVarArr[i13].g();
                int i15 = eg0.f14479a;
                if (g10 == 0) {
                    i10 = 16777216;
                } else if (g10 == 1) {
                    i10 = 3538944;
                } else if (g10 != 2) {
                    i10 = 131072;
                    if (!(g10 == 3 || g10 == 4)) {
                        throw new IllegalStateException();
                    }
                } else {
                    i10 = 13107200;
                }
                raVar.f16258f = i14 + i10;
            }
        }
        raVar.f16253a.g(raVar.f16258f);
        return e10;
    }

    public final long c(long j10) {
        return b(j10, false, new boolean[this.f8400n.length]);
    }

    public final void d(int i10, boolean z10) {
        this.f8393g = i10;
        this.f8395i = z10;
    }

    public final long e() {
        return this.f8392f - this.f8394h;
    }

    public final boolean f() {
        if (this.f8396j) {
            return !this.f8397k || this.f8387a.i() == Long.MIN_VALUE;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean g() throws e8.rb0 {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.iu r0 = r6.f8402p
            com.google.android.gms.internal.ads.ss[] r1 = r6.f8401o
            com.google.android.gms.internal.ads.cu r2 = r6.f8387a
            e8.bf0 r2 = r2.d()
            e8.mf0 r0 = r0.a(r1, r2)
            e8.mf0 r1 = r6.f8405s
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0016
        L_0x0014:
            r1 = 0
            goto L_0x0028
        L_0x0016:
            r4 = 0
        L_0x0017:
            e8.lf0 r5 = r0.f15502b
            int r5 = r5.f15383a
            if (r4 >= r5) goto L_0x0027
            boolean r5 = r0.a(r1, r4)
            if (r5 != 0) goto L_0x0024
            goto L_0x0014
        L_0x0024:
            int r4 = r4 + 1
            goto L_0x0017
        L_0x0027:
            r1 = 1
        L_0x0028:
            if (r1 == 0) goto L_0x002b
            return r3
        L_0x002b:
            r6.f8399m = r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.vs.g():boolean");
    }
}
