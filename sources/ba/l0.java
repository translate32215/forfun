package ba;

import java.io.Serializable;

/* compiled from: NaturalOrdering */
public final class l0 extends n0<Comparable> implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public static final l0 f3758a = new l0();

    public <S extends Comparable> n0<S> b() {
        return r0.f3794a;
    }

    public int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    public String toString() {
        return "Ordering.natural()";
    }
}
