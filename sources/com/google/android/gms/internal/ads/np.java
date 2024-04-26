package com.google.android.gms.internal.ads;

import e8.h70;
import e8.k70;
import e8.v70;
import java.io.IOException;
import java.nio.charset.Charset;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public class np extends k70 {

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f7602d;

    public np(byte[] bArr) {
        bArr.getClass();
        this.f7602d = bArr;
    }

    public byte D(int i10) {
        return this.f7602d[i10];
    }

    public final int E(int i10, int i11, int i12) {
        int N = N() + i11;
        return qq.f7993a.b(i10, this.f7602d, N, i12 + N);
    }

    public byte F(int i10) {
        return this.f7602d[i10];
    }

    public final int G(int i10, int i11, int i12) {
        byte[] bArr = this.f7602d;
        int N = N() + i11;
        Charset charset = v70.f17029a;
        for (int i13 = N; i13 < N + i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    public final boolean M(mp mpVar, int i10, int i11) {
        if (i11 <= mpVar.size()) {
            int i12 = i10 + i11;
            if (i12 > mpVar.size()) {
                int size = mpVar.size();
                StringBuilder sb2 = new StringBuilder(59);
                sb2.append("Ran off end of other: ");
                sb2.append(i10);
                sb2.append(", ");
                sb2.append(i11);
                sb2.append(", ");
                sb2.append(size);
                throw new IllegalArgumentException(sb2.toString());
            } else if (!(mpVar instanceof np)) {
                return mpVar.o(i10, i12).equals(o(0, i11));
            } else {
                np npVar = (np) mpVar;
                byte[] bArr = this.f7602d;
                byte[] bArr2 = npVar.f7602d;
                int N = N() + i11;
                int N2 = N();
                int N3 = npVar.N() + i10;
                while (N2 < N) {
                    if (bArr[N2] != bArr2[N3]) {
                        return false;
                    }
                    N2++;
                    N3++;
                }
                return true;
            }
        } else {
            int size2 = size();
            StringBuilder sb3 = new StringBuilder(40);
            sb3.append("Length too large: ");
            sb3.append(i11);
            sb3.append(size2);
            throw new IllegalArgumentException(sb3.toString());
        }
    }

    public int N() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mp) || size() != ((mp) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof np)) {
            return obj.equals(this);
        }
        np npVar = (np) obj;
        int i10 = this.f7496a;
        int i11 = npVar.f7496a;
        if (i10 == 0 || i11 == 0 || i10 == i11) {
            return M(npVar, 0, size());
        }
        return false;
    }

    public final String h(Charset charset) {
        return new String(this.f7602d, N(), size(), charset);
    }

    public final void i(w4 w4Var) throws IOException {
        w4Var.b(this.f7602d, N(), size());
    }

    public final mp o(int i10, int i11) {
        int H = mp.H(i10, i11, size());
        if (H == 0) {
            return mp.f7494b;
        }
        return new h70(this.f7602d, N() + i10, H);
    }

    public void s(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.f7602d, i10, bArr, i11, i12);
    }

    public int size() {
        return this.f7602d.length;
    }

    public final boolean y() {
        int N = N();
        return qq.d(this.f7602d, N, size() + N);
    }

    public final op z() {
        return op.d(this.f7602d, N(), size(), true);
    }
}
