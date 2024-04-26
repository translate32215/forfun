package ve;

import java.util.Arrays;

/* compiled from: SegmentedByteString */
public final class w extends i {

    /* renamed from: f  reason: collision with root package name */
    public final transient byte[][] f26783f;

    /* renamed from: g  reason: collision with root package name */
    public final transient int[] f26784g;

    public w(f fVar, int i10) {
        super((byte[]) null);
        a0.b(fVar.f26740b, 0, (long) i10);
        u uVar = fVar.f26739a;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            int i14 = uVar.f26776c;
            int i15 = uVar.f26775b;
            if (i14 != i15) {
                i12 += i14 - i15;
                i13++;
                uVar = uVar.f26779f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        this.f26783f = new byte[i13][];
        this.f26784g = new int[(i13 * 2)];
        u uVar2 = fVar.f26739a;
        int i16 = 0;
        while (i11 < i10) {
            byte[][] bArr = this.f26783f;
            bArr[i16] = uVar2.f26774a;
            int i17 = uVar2.f26776c;
            int i18 = uVar2.f26775b;
            int i19 = (i17 - i18) + i11;
            i11 = i19 > i10 ? i10 : i19;
            int[] iArr = this.f26784g;
            iArr[i16] = i11;
            iArr[bArr.length + i16] = i18;
            uVar2.f26777d = true;
            i16++;
            uVar2 = uVar2.f26779f;
        }
    }

    public byte[] A() {
        int[] iArr = this.f26784g;
        byte[][] bArr = this.f26783f;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int[] iArr2 = this.f26784g;
            int i12 = iArr2[length + i10];
            int i13 = iArr2[i10];
            System.arraycopy(this.f26783f[i10], i12, bArr2, i11, i13 - i11);
            i10++;
            i11 = i13;
        }
        return bArr2;
    }

    public final i B() {
        return new i(A());
    }

    public String a() {
        return B().a();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (iVar.u() != u() || !s(0, iVar, 0, u())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10 = this.f26745b;
        if (i10 != 0) {
            return i10;
        }
        int length = this.f26783f.length;
        int i11 = 0;
        int i12 = 0;
        int i13 = 1;
        while (i11 < length) {
            byte[] bArr = this.f26783f[i11];
            int[] iArr = this.f26784g;
            int i14 = iArr[length + i11];
            int i15 = iArr[i11];
            int i16 = (i15 - i12) + i14;
            while (i14 < i16) {
                i13 = (i13 * 31) + bArr[i14];
                i14++;
            }
            i11++;
            i12 = i15;
        }
        this.f26745b = i13;
        return i13;
    }

    public byte m(int i10) {
        int i11;
        a0.b((long) this.f26784g[this.f26783f.length - 1], (long) i10, 1);
        int z10 = z(i10);
        if (z10 == 0) {
            i11 = 0;
        } else {
            i11 = this.f26784g[z10 - 1];
        }
        int[] iArr = this.f26784g;
        byte[][] bArr = this.f26783f;
        return bArr[z10][(i10 - i11) + iArr[bArr.length + z10]];
    }

    public String o() {
        return B().o();
    }

    public byte[] q() {
        return A();
    }

    public boolean s(int i10, i iVar, int i11, int i12) {
        int i13;
        if (i10 < 0 || i10 > u() - i12) {
            return false;
        }
        int z10 = z(i10);
        while (i12 > 0) {
            if (z10 == 0) {
                i13 = 0;
            } else {
                i13 = this.f26784g[z10 - 1];
            }
            int min = Math.min(i12, ((this.f26784g[z10] - i13) + i13) - i10);
            int[] iArr = this.f26784g;
            byte[][] bArr = this.f26783f;
            if (!iVar.t(i11, bArr[z10], (i10 - i13) + iArr[bArr.length + z10], min)) {
                return false;
            }
            i10 += min;
            i11 += min;
            i12 -= min;
            z10++;
        }
        return true;
    }

    public boolean t(int i10, byte[] bArr, int i11, int i12) {
        int i13;
        if (i10 < 0 || i10 > u() - i12 || i11 < 0 || i11 > bArr.length - i12) {
            return false;
        }
        int z10 = z(i10);
        while (i12 > 0) {
            if (z10 == 0) {
                i13 = 0;
            } else {
                i13 = this.f26784g[z10 - 1];
            }
            int min = Math.min(i12, ((this.f26784g[z10] - i13) + i13) - i10);
            int[] iArr = this.f26784g;
            byte[][] bArr2 = this.f26783f;
            if (!a0.a(bArr2[z10], (i10 - i13) + iArr[bArr2.length + z10], bArr, i11, min)) {
                return false;
            }
            i10 += min;
            i11 += min;
            i12 -= min;
            z10++;
        }
        return true;
    }

    public String toString() {
        return B().toString();
    }

    public int u() {
        return this.f26784g[this.f26783f.length - 1];
    }

    public i v(int i10, int i11) {
        return B().v(i10, i11);
    }

    public i w() {
        return B().w();
    }

    public String x() {
        return B().x();
    }

    public void y(f fVar) {
        int length = this.f26783f.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int[] iArr = this.f26784g;
            int i12 = iArr[length + i10];
            int i13 = iArr[i10];
            u uVar = new u(this.f26783f[i10], i12, (i12 + i13) - i11, true, false);
            u uVar2 = fVar.f26739a;
            if (uVar2 == null) {
                uVar.f26780g = uVar;
                uVar.f26779f = uVar;
                fVar.f26739a = uVar;
            } else {
                uVar2.f26780g.b(uVar);
            }
            i10++;
            i11 = i13;
        }
        fVar.f26740b += (long) i11;
    }

    public final int z(int i10) {
        int binarySearch = Arrays.binarySearch(this.f26784g, 0, this.f26783f.length, i10 + 1);
        return binarySearch >= 0 ? binarySearch : binarySearch ^ -1;
    }
}
