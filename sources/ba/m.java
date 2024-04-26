package ba;

import java.io.Serializable;
import java.util.Comparator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: ComparatorOrdering */
public final class m<T> extends n0<T> implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final Comparator<T> f3759a;

    public m(Comparator<T> comparator) {
        comparator.getClass();
        this.f3759a = comparator;
    }

    public int compare(T t10, T t11) {
        return this.f3759a.compare(t10, t11);
    }

    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m) {
            return this.f3759a.equals(((m) obj).f3759a);
        }
        return false;
    }

    public int hashCode() {
        return this.f3759a.hashCode();
    }

    public String toString() {
        return this.f3759a.toString();
    }
}
