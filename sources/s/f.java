package s;

/* compiled from: LongSparseArray */
public class f<E> implements Cloneable {

    /* renamed from: e  reason: collision with root package name */
    public static final Object f24817e = new Object();

    /* renamed from: a  reason: collision with root package name */
    public boolean f24818a;

    /* renamed from: b  reason: collision with root package name */
    public long[] f24819b;

    /* renamed from: c  reason: collision with root package name */
    public Object[] f24820c;

    /* renamed from: d  reason: collision with root package name */
    public int f24821d;

    public f() {
        this(10);
    }

    public void a(long j10, E e10) {
        int i10 = this.f24821d;
        if (i10 == 0 || j10 > this.f24819b[i10 - 1]) {
            if (this.f24818a && i10 >= this.f24819b.length) {
                d();
            }
            int i11 = this.f24821d;
            if (i11 >= this.f24819b.length) {
                int f10 = e.f(i11 + 1);
                long[] jArr = new long[f10];
                Object[] objArr = new Object[f10];
                long[] jArr2 = this.f24819b;
                System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
                Object[] objArr2 = this.f24820c;
                System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
                this.f24819b = jArr;
                this.f24820c = objArr;
            }
            this.f24819b[i11] = j10;
            this.f24820c[i11] = e10;
            this.f24821d = i11 + 1;
            return;
        }
        h(j10, e10);
    }

    public void b() {
        int i10 = this.f24821d;
        Object[] objArr = this.f24820c;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.f24821d = 0;
        this.f24818a = false;
    }

    /* renamed from: c */
    public f<E> clone() {
        try {
            f<E> fVar = (f) super.clone();
            fVar.f24819b = (long[]) this.f24819b.clone();
            fVar.f24820c = (Object[]) this.f24820c.clone();
            return fVar;
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    public final void d() {
        int i10 = this.f24821d;
        long[] jArr = this.f24819b;
        Object[] objArr = this.f24820c;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != f24817e) {
                if (i12 != i11) {
                    jArr[i11] = jArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        this.f24818a = false;
        this.f24821d = i11;
    }

    public E e(long j10) {
        return f(j10, (Object) null);
    }

    public E f(long j10, E e10) {
        int b10 = e.b(this.f24819b, this.f24821d, j10);
        if (b10 >= 0) {
            E[] eArr = this.f24820c;
            if (eArr[b10] != f24817e) {
                return eArr[b10];
            }
        }
        return e10;
    }

    public long g(int i10) {
        if (this.f24818a) {
            d();
        }
        return this.f24819b[i10];
    }

    public void h(long j10, E e10) {
        int b10 = e.b(this.f24819b, this.f24821d, j10);
        if (b10 >= 0) {
            this.f24820c[b10] = e10;
            return;
        }
        int i10 = b10 ^ -1;
        int i11 = this.f24821d;
        if (i10 < i11) {
            Object[] objArr = this.f24820c;
            if (objArr[i10] == f24817e) {
                this.f24819b[i10] = j10;
                objArr[i10] = e10;
                return;
            }
        }
        if (this.f24818a && i11 >= this.f24819b.length) {
            d();
            i10 = e.b(this.f24819b, this.f24821d, j10) ^ -1;
        }
        int i12 = this.f24821d;
        if (i12 >= this.f24819b.length) {
            int f10 = e.f(i12 + 1);
            long[] jArr = new long[f10];
            Object[] objArr2 = new Object[f10];
            long[] jArr2 = this.f24819b;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f24820c;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f24819b = jArr;
            this.f24820c = objArr2;
        }
        int i13 = this.f24821d;
        if (i13 - i10 != 0) {
            long[] jArr3 = this.f24819b;
            int i14 = i10 + 1;
            System.arraycopy(jArr3, i10, jArr3, i14, i13 - i10);
            Object[] objArr4 = this.f24820c;
            System.arraycopy(objArr4, i10, objArr4, i14, this.f24821d - i10);
        }
        this.f24819b[i10] = j10;
        this.f24820c[i10] = e10;
        this.f24821d++;
    }

    public int j() {
        if (this.f24818a) {
            d();
        }
        return this.f24821d;
    }

    public E k(int i10) {
        if (this.f24818a) {
            d();
        }
        return this.f24820c[i10];
    }

    public String toString() {
        if (j() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(this.f24821d * 28);
        sb2.append('{');
        for (int i10 = 0; i10 < this.f24821d; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            sb2.append(g(i10));
            sb2.append('=');
            Object k10 = k(i10);
            if (k10 != this) {
                sb2.append(k10);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public f(int i10) {
        this.f24818a = false;
        if (i10 == 0) {
            this.f24819b = e.f24815b;
            this.f24820c = e.f24816c;
            return;
        }
        int f10 = e.f(i10);
        this.f24819b = new long[f10];
        this.f24820c = new Object[f10];
    }
}
