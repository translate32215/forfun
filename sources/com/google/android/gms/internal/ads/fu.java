package com.google.android.gms.internal.ads;

import e8.bf0;
import e8.kf0;
import e8.oe0;
import e8.re0;
import e8.xe0;
import e8.y10;
import e8.ye0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import o.a;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class fu implements re0, cu {

    /* renamed from: a  reason: collision with root package name */
    public final cu[] f6497a;

    /* renamed from: b  reason: collision with root package name */
    public final IdentityHashMap<oe0, Integer> f6498b = new IdentityHashMap<>();

    /* renamed from: c  reason: collision with root package name */
    public re0 f6499c;

    /* renamed from: d  reason: collision with root package name */
    public int f6500d;

    /* renamed from: e  reason: collision with root package name */
    public bf0 f6501e;

    /* renamed from: f  reason: collision with root package name */
    public cu[] f6502f;

    /* renamed from: g  reason: collision with root package name */
    public xe0 f6503g;

    public fu(cu... cuVarArr) {
        this.f6497a = cuVarArr;
    }

    public final boolean a(long j10) {
        return this.f6503g.a(j10);
    }

    public final long b() {
        return this.f6503g.b();
    }

    public final void c(cu cuVar) {
        int i10 = this.f6500d - 1;
        this.f6500d = i10;
        if (i10 <= 0) {
            int i11 = 0;
            for (cu d10 : this.f6497a) {
                i11 += d10.d().f14006a;
            }
            ye0[] ye0Arr = new ye0[i11];
            int i12 = 0;
            for (cu d11 : this.f6497a) {
                bf0 d12 = d11.d();
                int i13 = d12.f14006a;
                int i14 = 0;
                while (i14 < i13) {
                    ye0Arr[i12] = d12.f14007b[i14];
                    i14++;
                    i12++;
                }
            }
            this.f6501e = new bf0(ye0Arr);
            this.f6499c.c(this);
        }
    }

    public final bf0 d() {
        return this.f6501e;
    }

    public final long e(kf0[] kf0Arr, boolean[] zArr, oe0[] oe0Arr, boolean[] zArr2, long j10) {
        int i10;
        kf0[] kf0Arr2 = kf0Arr;
        oe0[] oe0Arr2 = oe0Arr;
        int[] iArr = new int[kf0Arr2.length];
        int[] iArr2 = new int[kf0Arr2.length];
        for (int i11 = 0; i11 < kf0Arr2.length; i11++) {
            if (oe0Arr2[i11] == null) {
                i10 = -1;
            } else {
                i10 = this.f6498b.get(oe0Arr2[i11]).intValue();
            }
            iArr[i11] = i10;
            iArr2[i11] = -1;
            if (kf0Arr2[i11] != null) {
                ye0 b10 = kf0Arr2[i11].b();
                int i12 = 0;
                while (true) {
                    cu[] cuVarArr = this.f6497a;
                    if (i12 >= cuVarArr.length) {
                        break;
                    } else if (cuVarArr[i12].d().a(b10) != -1) {
                        iArr2[i11] = i12;
                        break;
                    } else {
                        i12++;
                    }
                }
            }
        }
        this.f6498b.clear();
        int length = kf0Arr2.length;
        oe0[] oe0Arr3 = new oe0[length];
        oe0[] oe0Arr4 = new oe0[kf0Arr2.length];
        kf0[] kf0Arr3 = new kf0[kf0Arr2.length];
        ArrayList arrayList = new ArrayList(this.f6497a.length);
        long j11 = j10;
        int i13 = 0;
        while (i13 < this.f6497a.length) {
            for (int i14 = 0; i14 < kf0Arr2.length; i14++) {
                kf0 kf0 = null;
                oe0Arr4[i14] = iArr[i14] == i13 ? oe0Arr2[i14] : null;
                if (iArr2[i14] == i13) {
                    kf0 = kf0Arr2[i14];
                }
                kf0Arr3[i14] = kf0;
            }
            int i15 = i13;
            kf0[] kf0Arr4 = kf0Arr3;
            ArrayList arrayList2 = arrayList;
            long e10 = this.f6497a[i13].e(kf0Arr3, zArr, oe0Arr4, zArr2, j11);
            if (i15 == 0) {
                j11 = e10;
            } else if (e10 != j11) {
                throw new IllegalStateException("Children enabled at different positions");
            }
            boolean z10 = false;
            for (int i16 = 0; i16 < kf0Arr2.length; i16++) {
                boolean z11 = true;
                if (iArr2[i16] == i15) {
                    a.c(oe0Arr4[i16] != null);
                    oe0Arr3[i16] = oe0Arr4[i16];
                    this.f6498b.put(oe0Arr4[i16], Integer.valueOf(i15));
                    z10 = true;
                } else if (iArr[i16] == i15) {
                    if (oe0Arr4[i16] != null) {
                        z11 = false;
                    }
                    a.c(z11);
                }
            }
            if (z10) {
                arrayList2.add(this.f6497a[i15]);
            }
            i13 = i15 + 1;
            arrayList = arrayList2;
            kf0Arr3 = kf0Arr4;
            oe0Arr2 = oe0Arr;
        }
        oe0[] oe0Arr5 = oe0Arr2;
        ArrayList arrayList3 = arrayList;
        System.arraycopy(oe0Arr3, 0, oe0Arr5, 0, length);
        cu[] cuVarArr2 = new cu[arrayList3.size()];
        this.f6502f = cuVarArr2;
        arrayList3.toArray(cuVarArr2);
        this.f6503g = new y10((xe0[]) this.f6502f);
        return j11;
    }

    public final long f() {
        long f10 = this.f6497a[0].f();
        int i10 = 1;
        while (true) {
            cu[] cuVarArr = this.f6497a;
            if (i10 >= cuVarArr.length) {
                if (f10 != -9223372036854775807L) {
                    cu[] cuVarArr2 = this.f6502f;
                    int length = cuVarArr2.length;
                    int i11 = 0;
                    while (i11 < length) {
                        cu cuVar = cuVarArr2[i11];
                        if (cuVar == this.f6497a[0] || cuVar.j(f10) == f10) {
                            i11++;
                        } else {
                            throw new IllegalStateException("Children seeked to different positions");
                        }
                    }
                }
                return f10;
            } else if (cuVarArr[i10].f() == -9223372036854775807L) {
                i10++;
            } else {
                throw new IllegalStateException("Child reported discontinuity");
            }
        }
    }

    public final void g(long j10) {
        for (cu g10 : this.f6502f) {
            g10.g(j10);
        }
    }

    public final /* synthetic */ void h(xe0 xe0) {
        if (this.f6501e != null) {
            this.f6499c.h(this);
        }
    }

    public final long i() {
        long j10 = Long.MAX_VALUE;
        for (cu i10 : this.f6502f) {
            long i11 = i10.i();
            if (i11 != Long.MIN_VALUE) {
                j10 = Math.min(j10, i11);
            }
        }
        if (j10 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j10;
    }

    public final long j(long j10) {
        long j11 = this.f6502f[0].j(j10);
        int i10 = 1;
        while (true) {
            cu[] cuVarArr = this.f6502f;
            if (i10 >= cuVarArr.length) {
                return j11;
            }
            if (cuVarArr[i10].j(j11) == j11) {
                i10++;
            } else {
                throw new IllegalStateException("Children seeked to different positions");
            }
        }
    }

    public final void k(re0 re0, long j10) {
        this.f6499c = re0;
        cu[] cuVarArr = this.f6497a;
        this.f6500d = cuVarArr.length;
        for (cu k10 : cuVarArr) {
            k10.k(this, j10);
        }
    }

    public final void l() throws IOException {
        for (cu l10 : this.f6497a) {
            l10.l();
        }
    }
}
