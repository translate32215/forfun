package com.google.android.gms.internal.ads;

import e8.i70;
import e8.k70;
import e8.l90;
import e8.m90;
import java.io.IOException;
import java.nio.charset.Charset;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class hq extends mp {

    /* renamed from: i  reason: collision with root package name */
    public static final int[] f6887i = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};

    /* renamed from: d  reason: collision with root package name */
    public final int f6888d;

    /* renamed from: e  reason: collision with root package name */
    public final mp f6889e;

    /* renamed from: f  reason: collision with root package name */
    public final mp f6890f;

    /* renamed from: g  reason: collision with root package name */
    public final int f6891g;

    /* renamed from: h  reason: collision with root package name */
    public final int f6892h;

    public hq(mp mpVar, mp mpVar2) {
        this.f6889e = mpVar;
        this.f6890f = mpVar2;
        int size = mpVar.size();
        this.f6891g = size;
        this.f6888d = mpVar2.size() + size;
        this.f6892h = Math.max(mpVar.A(), mpVar2.A()) + 1;
    }

    public static mp M(mp mpVar, mp mpVar2) {
        int size = mpVar.size();
        int size2 = mpVar2.size();
        byte[] bArr = new byte[(size + size2)];
        mpVar.j(bArr, 0, 0, size);
        mpVar2.j(bArr, 0, size, size2);
        return new np(bArr);
    }

    public static int N(int i10) {
        int[] iArr = f6887i;
        if (i10 >= iArr.length) {
            return Integer.MAX_VALUE;
        }
        return iArr[i10];
    }

    public final int A() {
        return this.f6892h;
    }

    public final boolean B() {
        return this.f6888d >= N(this.f6892h);
    }

    public final byte D(int i10) {
        mp.q(i10, this.f6888d);
        return F(i10);
    }

    public final int E(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        int i14 = this.f6891g;
        if (i13 <= i14) {
            return this.f6889e.E(i10, i11, i12);
        }
        if (i11 >= i14) {
            return this.f6890f.E(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return this.f6890f.E(this.f6889e.E(i10, i11, i15), 0, i12 - i15);
    }

    public final byte F(int i10) {
        int i11 = this.f6891g;
        if (i10 < i11) {
            return this.f6889e.F(i10);
        }
        return this.f6890f.F(i10 - i11);
    }

    public final int G(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        int i14 = this.f6891g;
        if (i13 <= i14) {
            return this.f6889e.G(i10, i11, i12);
        }
        if (i11 >= i14) {
            return this.f6890f.G(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return this.f6890f.G(this.f6889e.G(i10, i11, i15), 0, i12 - i15);
    }

    public final boolean equals(Object obj) {
        boolean z10;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mp)) {
            return false;
        }
        mp mpVar = (mp) obj;
        if (this.f6888d != mpVar.size()) {
            return false;
        }
        if (this.f6888d == 0) {
            return true;
        }
        int i10 = this.f7496a;
        int i11 = mpVar.f7496a;
        if (i10 != 0 && i11 != 0 && i10 != i11) {
            return false;
        }
        m90 m90 = new m90(this, (l90) null);
        k70 k70 = (k70) m90.next();
        m90 m902 = new m90(mpVar, (l90) null);
        k70 k702 = (k70) m902.next();
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            int size = k70.size() - i12;
            int size2 = k702.size() - i13;
            int min = Math.min(size, size2);
            if (i12 == 0) {
                z10 = k70.M(k702, i13, min);
            } else {
                z10 = k702.M(k70, i12, min);
            }
            if (!z10) {
                return false;
            }
            i14 += min;
            int i15 = this.f6888d;
            if (i14 < i15) {
                if (min == size) {
                    k70 = (k70) m90.next();
                    i12 = 0;
                } else {
                    i12 += min;
                }
                if (min == size2) {
                    k702 = (k70) m902.next();
                    i13 = 0;
                } else {
                    i13 += min;
                }
            } else if (i14 == i15) {
                return true;
            } else {
                throw new IllegalStateException();
            }
        }
    }

    public final String h(Charset charset) {
        return new String(c(), charset);
    }

    public final void i(w4 w4Var) throws IOException {
        this.f6889e.i(w4Var);
        this.f6890f.i(w4Var);
    }

    public final mp o(int i10, int i11) {
        int H = mp.H(i10, i11, this.f6888d);
        if (H == 0) {
            return mp.f7494b;
        }
        if (H == this.f6888d) {
            return this;
        }
        int i12 = this.f6891g;
        if (i11 <= i12) {
            return this.f6889e.o(i10, i11);
        }
        if (i10 >= i12) {
            return this.f6890f.o(i10 - i12, i11 - i12);
        }
        mp mpVar = this.f6889e;
        return new hq(mpVar.o(i10, mpVar.size()), this.f6890f.o(0, i11 - this.f6891g));
    }

    public final void s(byte[] bArr, int i10, int i11, int i12) {
        int i13 = i10 + i12;
        int i14 = this.f6891g;
        if (i13 <= i14) {
            this.f6889e.s(bArr, i10, i11, i12);
        } else if (i10 >= i14) {
            this.f6890f.s(bArr, i10 - i14, i11, i12);
        } else {
            int i15 = i14 - i10;
            this.f6889e.s(bArr, i10, i11, i15);
            this.f6890f.s(bArr, 0, i11 + i15, i12 - i15);
        }
    }

    public final int size() {
        return this.f6888d;
    }

    /* renamed from: x */
    public final i70 iterator() {
        return new l90(this);
    }

    public final boolean y() {
        int E = this.f6889e.E(0, 0, this.f6891g);
        mp mpVar = this.f6890f;
        if (mpVar.E(E, 0, mpVar.size()) == 0) {
            return true;
        }
        return false;
    }

    public final op z() {
        return new qp(new jq(this), 4096);
    }
}
