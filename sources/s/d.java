package s;

/* compiled from: CircularArray */
public final class d<E> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f24809a;

    /* renamed from: b  reason: collision with root package name */
    public E[] f24810b;

    /* renamed from: c  reason: collision with root package name */
    public int f24811c;

    /* renamed from: d  reason: collision with root package name */
    public int f24812d;

    /* renamed from: e  reason: collision with root package name */
    public int f24813e;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public d() {
        this(8, 1);
        this.f24809a = 1;
    }

    public void a(int i10) {
        int i11 = this.f24812d;
        ((int[]) this.f24810b)[i11] = i10;
        int i12 = this.f24813e & (i11 + 1);
        this.f24812d = i12;
        if (i12 == this.f24811c) {
            c();
        }
    }

    public void b() {
        switch (this.f24809a) {
            case 0:
                f(g());
                return;
            default:
                this.f24812d = this.f24811c;
                return;
        }
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [int[], E[], java.lang.Object] */
    public final void c() {
        switch (this.f24809a) {
            case 0:
                Object[] objArr = this.f24810b;
                int length = objArr.length;
                int i10 = this.f24811c;
                int i11 = length - i10;
                int i12 = length << 1;
                if (i12 >= 0) {
                    E[] eArr = new Object[i12];
                    System.arraycopy(objArr, i10, eArr, 0, i11);
                    System.arraycopy(this.f24810b, 0, eArr, i11, this.f24811c);
                    this.f24810b = eArr;
                    this.f24811c = 0;
                    this.f24812d = length;
                    this.f24813e = i12 - 1;
                    return;
                }
                throw new RuntimeException("Max array capacity exceeded");
            default:
                int[] iArr = (int[]) this.f24810b;
                int length2 = iArr.length;
                int i13 = this.f24811c;
                int i14 = length2 - i13;
                int i15 = length2 << 1;
                if (i15 >= 0) {
                    ? r22 = new int[i15];
                    System.arraycopy(iArr, i13, r22, 0, i14);
                    System.arraycopy((int[]) this.f24810b, 0, r22, i14, this.f24811c);
                    this.f24810b = r22;
                    this.f24811c = 0;
                    this.f24812d = length2;
                    this.f24813e = i15 - 1;
                    return;
                }
                throw new RuntimeException("Max array capacity exceeded");
        }
    }

    public int d(int i10) {
        if (i10 < 0 || i10 >= g()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return ((int[]) this.f24810b)[this.f24813e & (this.f24811c + i10)];
    }

    public void e(int i10) {
        int i11;
        if (i10 > 0) {
            if (i10 <= g()) {
                int i12 = 0;
                int i13 = this.f24812d;
                if (i10 < i13) {
                    i12 = i13 - i10;
                }
                int i14 = i12;
                while (true) {
                    i11 = this.f24812d;
                    if (i14 >= i11) {
                        break;
                    }
                    ((Object[]) this.f24810b)[i14] = null;
                    i14++;
                }
                int i15 = i11 - i12;
                int i16 = i10 - i15;
                this.f24812d = i11 - i15;
                if (i16 > 0) {
                    int length = ((Object[]) this.f24810b).length;
                    this.f24812d = length;
                    int i17 = length - i16;
                    for (int i18 = i17; i18 < this.f24812d; i18++) {
                        ((Object[]) this.f24810b)[i18] = null;
                    }
                    this.f24812d = i17;
                    return;
                }
                return;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public void f(int i10) {
        if (i10 > 0) {
            if (i10 <= g()) {
                int length = ((Object[]) this.f24810b).length;
                int i11 = this.f24811c;
                if (i10 < length - i11) {
                    length = i11 + i10;
                }
                while (i11 < length) {
                    ((Object[]) this.f24810b)[i11] = null;
                    i11++;
                }
                int i12 = this.f24811c;
                int i13 = length - i12;
                int i14 = i10 - i13;
                this.f24811c = this.f24813e & (i12 + i13);
                if (i14 > 0) {
                    for (int i15 = 0; i15 < i14; i15++) {
                        ((Object[]) this.f24810b)[i15] = null;
                    }
                    this.f24811c = i14;
                    return;
                }
                return;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public int g() {
        int i10;
        int i11;
        switch (this.f24809a) {
            case 0:
                i10 = this.f24812d - this.f24811c;
                i11 = this.f24813e;
                break;
            default:
                i10 = this.f24812d - this.f24811c;
                i11 = this.f24813e;
                break;
        }
        return i10 & i11;
    }

    /* JADX WARNING: type inference failed for: r5v4, types: [int[], E[]] */
    public d(int i10, int i11) {
        this.f24809a = i11;
        if (i11 != 1) {
            if (i10 < 1) {
                throw new IllegalArgumentException("capacity must be >= 1");
            } else if (i10 <= 1073741824) {
                i10 = Integer.bitCount(i10) != 1 ? Integer.highestOneBit(i10 - 1) << 1 : i10;
                this.f24813e = i10 - 1;
                this.f24810b = new Object[i10];
            } else {
                throw new IllegalArgumentException("capacity must be <= 2^30");
            }
        } else if (i10 < 1) {
            throw new IllegalArgumentException("capacity must be >= 1");
        } else if (i10 <= 1073741824) {
            i10 = Integer.bitCount(i10) != 1 ? Integer.highestOneBit(i10 - 1) << 1 : i10;
            this.f24813e = i10 - 1;
            this.f24810b = new int[i10];
        } else {
            throw new IllegalArgumentException("capacity must be <= 2^30");
        }
    }
}
