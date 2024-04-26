package ba;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: RegularImmutableSet */
public final class q0<E> extends x<E> {

    /* renamed from: i  reason: collision with root package name */
    public static final q0<Object> f3786i = new q0(new Object[0], 0, (Object[]) null, 0, 0);

    /* renamed from: d  reason: collision with root package name */
    public final transient Object[] f3787d;

    /* renamed from: e  reason: collision with root package name */
    public final transient Object[] f3788e;

    /* renamed from: f  reason: collision with root package name */
    public final transient int f3789f;

    /* renamed from: g  reason: collision with root package name */
    public final transient int f3790g;

    /* renamed from: h  reason: collision with root package name */
    public final transient int f3791h;

    public q0(Object[] objArr, int i10, Object[] objArr2, int i11, int i12) {
        this.f3787d = objArr;
        this.f3788e = objArr2;
        this.f3789f = i11;
        this.f3790g = i10;
        this.f3791h = i12;
    }

    public boolean contains(@NullableDecl Object obj) {
        Object[] objArr = this.f3788e;
        if (obj == null || objArr == null) {
            return false;
        }
        int b10 = p.b(obj);
        while (true) {
            int i10 = b10 & this.f3789f;
            Object obj2 = objArr[i10];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            b10 = i10 + 1;
        }
    }

    public int f(Object[] objArr, int i10) {
        System.arraycopy(this.f3787d, 0, objArr, i10, this.f3791h);
        return i10 + this.f3791h;
    }

    public Object[] h() {
        return this.f3787d;
    }

    public int hashCode() {
        return this.f3790g;
    }

    public int i() {
        return this.f3791h;
    }

    public int j() {
        return 0;
    }

    public boolean o() {
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [ba.y0<E>, ba.a] */
    /* renamed from: q */
    public y0<E> iterator() {
        return c().listIterator();
    }

    public int size() {
        return this.f3791h;
    }

    public s<E> y() {
        return s.x(this.f3787d, this.f3791h);
    }
}
