package com.google.android.gms.internal.ads;

import e8.f80;
import e8.ha0;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class nq {

    /* renamed from: f  reason: collision with root package name */
    public static final nq f7603f = new nq(0, new int[0], new Object[0], false);

    /* renamed from: a  reason: collision with root package name */
    public int f7604a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f7605b;

    /* renamed from: c  reason: collision with root package name */
    public Object[] f7606c;

    /* renamed from: d  reason: collision with root package name */
    public int f7607d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f7608e;

    public nq() {
        this(0, new int[8], new Object[8], true);
    }

    public static void a(int i10, Object obj, ha0 ha0) throws IOException {
        int i11 = i10 >>> 3;
        int i12 = i10 & 7;
        if (i12 == 0) {
            ((tp) ha0).f8209a.N(i11, ((Long) obj).longValue());
        } else if (i12 == 1) {
            ((tp) ha0).f8209a.R(i11, ((Long) obj).longValue());
        } else if (i12 == 2) {
            ((tp) ha0).f8209a.e(i11, (mp) obj);
        } else if (i12 == 3) {
            tp tpVar = (tp) ha0;
            tpVar.f8209a.c(i11, 3);
            ((nq) obj).b(ha0);
            tpVar.f8209a.c(i11, 4);
        } else if (i12 == 5) {
            ((tp) ha0).f8209a.j(i11, ((Integer) obj).intValue());
        } else {
            throw new RuntimeException(f80.f());
        }
    }

    public static nq d() {
        return new nq(0, new int[8], new Object[8], true);
    }

    public final void b(ha0 ha0) throws IOException {
        if (this.f7604a != 0) {
            ha0.getClass();
            for (int i10 = 0; i10 < this.f7604a; i10++) {
                a(this.f7605b[i10], this.f7606c[i10], ha0);
            }
        }
    }

    public final int c() {
        int i10;
        int i11 = this.f7607d;
        if (i11 != -1) {
            return i11;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.f7604a; i13++) {
            int i14 = this.f7605b[i13];
            int i15 = i14 >>> 3;
            int i16 = i14 & 7;
            if (i16 == 0) {
                i10 = sp.T(i15, ((Long) this.f7606c[i13]).longValue());
            } else if (i16 == 1) {
                ((Long) this.f7606c[i13]).longValue();
                i10 = sp.V(i15);
            } else if (i16 == 2) {
                i10 = sp.v(i15, (mp) this.f7606c[i13]);
            } else if (i16 == 3) {
                i12 = ((nq) this.f7606c[i13]).c() + (sp.G(i15) << 1) + i12;
            } else if (i16 == 5) {
                ((Integer) this.f7606c[i13]).intValue();
                i10 = sp.n(i15);
            } else {
                throw new IllegalStateException(f80.f());
            }
            i12 = i10 + i12;
        }
        this.f7607d = i12;
        return i12;
    }

    public final void e(int i10, Object obj) {
        if (this.f7608e) {
            int i11 = this.f7604a;
            int[] iArr = this.f7605b;
            if (i11 == iArr.length) {
                int i12 = i11 + (i11 < 4 ? 8 : i11 >> 1);
                this.f7605b = Arrays.copyOf(iArr, i12);
                this.f7606c = Arrays.copyOf(this.f7606c, i12);
            }
            int[] iArr2 = this.f7605b;
            int i13 = this.f7604a;
            iArr2[i13] = i10;
            this.f7606c[i13] = obj;
            this.f7604a = i13 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof nq)) {
            return false;
        }
        nq nqVar = (nq) obj;
        int i10 = this.f7604a;
        if (i10 == nqVar.f7604a) {
            int[] iArr = this.f7605b;
            int[] iArr2 = nqVar.f7605b;
            int i11 = 0;
            while (true) {
                if (i11 >= i10) {
                    z10 = true;
                    break;
                } else if (iArr[i11] != iArr2[i11]) {
                    z10 = false;
                    break;
                } else {
                    i11++;
                }
            }
            if (z10) {
                Object[] objArr = this.f7606c;
                Object[] objArr2 = nqVar.f7606c;
                int i12 = this.f7604a;
                int i13 = 0;
                while (true) {
                    if (i13 >= i12) {
                        z11 = true;
                        break;
                    } else if (!objArr[i13].equals(objArr2[i13])) {
                        z11 = false;
                        break;
                    } else {
                        i13++;
                    }
                }
                return z11;
            }
        }
    }

    public final int hashCode() {
        int i10 = this.f7604a;
        int i11 = (i10 + 527) * 31;
        int[] iArr = this.f7605b;
        int i12 = 17;
        int i13 = 17;
        for (int i14 = 0; i14 < i10; i14++) {
            i13 = (i13 * 31) + iArr[i14];
        }
        int i15 = (i11 + i13) * 31;
        Object[] objArr = this.f7606c;
        int i16 = this.f7604a;
        for (int i17 = 0; i17 < i16; i17++) {
            i12 = (i12 * 31) + objArr[i17].hashCode();
        }
        return i15 + i12;
    }

    public nq(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f7607d = -1;
        this.f7604a = i10;
        this.f7605b = iArr;
        this.f7606c = objArr;
        this.f7608e = z10;
    }
}
