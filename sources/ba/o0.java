package ba;

import aa.g;

/* compiled from: RegularImmutableList */
public class o0<E> extends s<E> {

    /* renamed from: e  reason: collision with root package name */
    public static final s<Object> f3765e = new o0(new Object[0], 0);

    /* renamed from: c  reason: collision with root package name */
    public final transient Object[] f3766c;

    /* renamed from: d  reason: collision with root package name */
    public final transient int f3767d;

    public o0(Object[] objArr, int i10) {
        this.f3766c = objArr;
        this.f3767d = i10;
    }

    public int f(Object[] objArr, int i10) {
        System.arraycopy(this.f3766c, 0, objArr, i10, this.f3767d);
        return i10 + this.f3767d;
    }

    public E get(int i10) {
        g.c(i10, this.f3767d);
        return this.f3766c[i10];
    }

    public Object[] h() {
        return this.f3766c;
    }

    public int i() {
        return this.f3767d;
    }

    public int j() {
        return 0;
    }

    public boolean o() {
        return false;
    }

    public int size() {
        return this.f3767d;
    }
}
