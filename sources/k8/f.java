package k8;

import java.util.Iterator;
import java.util.List;
import n2.g;

/* compiled from: com.google.android.gms:play-services-measurement@@19.0.2 */
public final class f implements o {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f20198a;

    public f(Boolean bool) {
        this.f20198a = bool == null ? false : bool.booleanValue();
    }

    public final Double a() {
        return Double.valueOf(true != this.f20198a ? 0.0d : 1.0d);
    }

    public final Iterator<o> c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && this.f20198a == ((f) obj).f20198a;
    }

    public final o f() {
        return new f(Boolean.valueOf(this.f20198a));
    }

    public final int hashCode() {
        return Boolean.valueOf(this.f20198a).hashCode();
    }

    public final Boolean j() {
        return Boolean.valueOf(this.f20198a);
    }

    public final String q() {
        return Boolean.toString(this.f20198a);
    }

    public final o s(String str, g gVar, List<o> list) {
        if ("toString".equals(str)) {
            return new r(Boolean.toString(this.f20198a));
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", new Object[]{Boolean.toString(this.f20198a), str}));
    }

    public final String toString() {
        return String.valueOf(this.f20198a);
    }
}
