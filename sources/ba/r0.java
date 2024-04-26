package ba;

import java.io.Serializable;

/* compiled from: ReverseNaturalOrdering */
public final class r0 extends n0<Comparable> implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public static final r0 f3794a = new r0();

    public <S extends Comparable> n0<S> b() {
        return l0.f3758a;
    }

    public int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public String toString() {
        return "Ordering.natural().reverse()";
    }
}
