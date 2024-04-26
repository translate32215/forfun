package s;

/* compiled from: SparseArrayCompat */
public class j<E> implements Cloneable {

    /* renamed from: e  reason: collision with root package name */
    public static final Object f24852e = new Object();

    /* renamed from: a  reason: collision with root package name */
    public boolean f24853a = false;

    /* renamed from: b  reason: collision with root package name */
    public int[] f24854b;

    /* renamed from: c  reason: collision with root package name */
    public Object[] f24855c;

    /* renamed from: d  reason: collision with root package name */
    public int f24856d;

    public j() {
        int e10 = e.e(10);
        this.f24854b = new int[e10];
        this.f24855c = new Object[e10];
    }

    public void a(int i10, E e10) {
        int i11 = this.f24856d;
        if (i11 == 0 || i10 > this.f24854b[i11 - 1]) {
            if (this.f24853a && i11 >= this.f24854b.length) {
                c();
            }
            int i12 = this.f24856d;
            if (i12 >= this.f24854b.length) {
                int e11 = e.e(i12 + 1);
                int[] iArr = new int[e11];
                Object[] objArr = new Object[e11];
                int[] iArr2 = this.f24854b;
                System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
                Object[] objArr2 = this.f24855c;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f24854b = iArr;
                this.f24855c = objArr;
            }
            this.f24854b[i12] = i10;
            this.f24855c[i12] = e10;
            this.f24856d = i12 + 1;
            return;
        }
        h(i10, e10);
    }

    /* renamed from: b */
    public j<E> clone() {
        try {
            j<E> jVar = (j) super.clone();
            jVar.f24854b = (int[]) this.f24854b.clone();
            jVar.f24855c = (Object[]) this.f24855c.clone();
            return jVar;
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    public final void c() {
        int i10 = this.f24856d;
        int[] iArr = this.f24854b;
        Object[] objArr = this.f24855c;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != f24852e) {
                if (i12 != i11) {
                    iArr[i11] = iArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        this.f24853a = false;
        this.f24856d = i11;
    }

    public E d(int i10) {
        return e(i10, (Object) null);
    }

    public E e(int i10, E e10) {
        int a10 = e.a(this.f24854b, this.f24856d, i10);
        if (a10 >= 0) {
            E[] eArr = this.f24855c;
            if (eArr[a10] != f24852e) {
                return eArr[a10];
            }
        }
        return e10;
    }

    public int f(E e10) {
        if (this.f24853a) {
            c();
        }
        for (int i10 = 0; i10 < this.f24856d; i10++) {
            if (this.f24855c[i10] == e10) {
                return i10;
            }
        }
        return -1;
    }

    public int g(int i10) {
        if (this.f24853a) {
            c();
        }
        return this.f24854b[i10];
    }

    public void h(int i10, E e10) {
        int a10 = e.a(this.f24854b, this.f24856d, i10);
        if (a10 >= 0) {
            this.f24855c[a10] = e10;
            return;
        }
        int i11 = a10 ^ -1;
        int i12 = this.f24856d;
        if (i11 < i12) {
            Object[] objArr = this.f24855c;
            if (objArr[i11] == f24852e) {
                this.f24854b[i11] = i10;
                objArr[i11] = e10;
                return;
            }
        }
        if (this.f24853a && i12 >= this.f24854b.length) {
            c();
            i11 = e.a(this.f24854b, this.f24856d, i10) ^ -1;
        }
        int i13 = this.f24856d;
        if (i13 >= this.f24854b.length) {
            int e11 = e.e(i13 + 1);
            int[] iArr = new int[e11];
            Object[] objArr2 = new Object[e11];
            int[] iArr2 = this.f24854b;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f24855c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f24854b = iArr;
            this.f24855c = objArr2;
        }
        int i14 = this.f24856d;
        if (i14 - i11 != 0) {
            int[] iArr3 = this.f24854b;
            int i15 = i11 + 1;
            System.arraycopy(iArr3, i11, iArr3, i15, i14 - i11);
            Object[] objArr4 = this.f24855c;
            System.arraycopy(objArr4, i11, objArr4, i15, this.f24856d - i11);
        }
        this.f24854b[i11] = i10;
        this.f24855c[i11] = e10;
        this.f24856d++;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = r3.f24855c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void j(int r4) {
        /*
            r3 = this;
            int[] r0 = r3.f24854b
            int r1 = r3.f24856d
            int r4 = s.e.a(r0, r1, r4)
            if (r4 < 0) goto L_0x0017
            java.lang.Object[] r0 = r3.f24855c
            r1 = r0[r4]
            java.lang.Object r2 = f24852e
            if (r1 == r2) goto L_0x0017
            r0[r4] = r2
            r4 = 1
            r3.f24853a = r4
        L_0x0017:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s.j.j(int):void");
    }

    public int k() {
        if (this.f24853a) {
            c();
        }
        return this.f24856d;
    }

    public E l(int i10) {
        if (this.f24853a) {
            c();
        }
        return this.f24855c[i10];
    }

    public String toString() {
        if (k() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f24856d * 28);
        sb2.append('{');
        for (int i10 = 0; i10 < this.f24856d; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            sb2.append(g(i10));
            sb2.append('=');
            Object l10 = l(i10);
            if (l10 != this) {
                sb2.append(l10);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }
}
