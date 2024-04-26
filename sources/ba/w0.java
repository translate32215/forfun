package ba;

import com.google.errorprone.annotations.concurrent.LazyInit;
import q.c;

/* compiled from: SingletonImmutableSet */
public final class w0<E> extends x<E> {

    /* renamed from: d  reason: collision with root package name */
    public final transient E f3815d;
    @LazyInit

    /* renamed from: e  reason: collision with root package name */
    public transient int f3816e;

    public w0(E e10) {
        e10.getClass();
        this.f3815d = e10;
    }

    public boolean contains(Object obj) {
        return this.f3815d.equals(obj);
    }

    public int f(Object[] objArr, int i10) {
        objArr[i10] = this.f3815d;
        return i10 + 1;
    }

    public final int hashCode() {
        int i10 = this.f3816e;
        if (i10 != 0) {
            return i10;
        }
        int hashCode = this.f3815d.hashCode();
        this.f3816e = hashCode;
        return hashCode;
    }

    public boolean o() {
        return false;
    }

    /* renamed from: q */
    public y0<E> iterator() {
        return new z(this.f3815d);
    }

    public int size() {
        return 1;
    }

    public String toString() {
        StringBuilder a10 = c.a('[');
        a10.append(this.f3815d.toString());
        a10.append(']');
        return a10.toString();
    }

    public s<E> y() {
        return s.C(this.f3815d);
    }

    public boolean z() {
        return this.f3816e != 0;
    }

    public w0(E e10, int i10) {
        this.f3815d = e10;
        this.f3816e = i10;
    }
}
