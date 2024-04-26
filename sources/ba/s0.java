package ba;

import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: ReverseOrdering */
public final class s0<T> extends n0<T> implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final n0<? super T> f3800a;

    public s0(n0<? super T> n0Var) {
        this.f3800a = n0Var;
    }

    public <S extends T> n0<S> b() {
        return this.f3800a;
    }

    public int compare(T t10, T t11) {
        return this.f3800a.compare(t11, t10);
    }

    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof s0) {
            return this.f3800a.equals(((s0) obj).f3800a);
        }
        return false;
    }

    public int hashCode() {
        return -this.f3800a.hashCode();
    }

    public String toString() {
        return this.f3800a + ".reverse()";
    }
}
