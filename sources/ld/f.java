package ld;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

/* compiled from: BrittleContainsOptimization.kt */
public final class f {
    public static final <T> Collection<T> a(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        if (iterable instanceof Set) {
            return (Collection) iterable;
        }
        if (!(iterable instanceof Collection)) {
            return g.f21253a ? l.u(iterable) : l.w(iterable);
        }
        if (((Collection) iterable2).size() < 2) {
            return (Collection) iterable;
        }
        Collection<T> collection = (Collection) iterable;
        return g.f21253a && collection.size() > 2 && (collection instanceof ArrayList) ? l.u(iterable) : collection;
    }
}
