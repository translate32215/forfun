package ld;

import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import ud.x;

/* compiled from: ReversedViews.kt */
public class k extends j {
    public static final <T> boolean g(Collection<? super T> collection, Iterable<? extends T> iterable) {
        ud.k.f(collection, "<this>");
        ud.k.f(iterable, "elements");
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        boolean z10 = false;
        for (Object add : iterable) {
            if (collection.add(add)) {
                z10 = true;
            }
        }
        return z10;
    }

    public static final <T> T h(List<T> list) {
        if (!list.isEmpty()) {
            return list.remove(h.b(list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static final <T> boolean i(Collection<? super T> collection, Iterable<? extends T> iterable) {
        return x.a(collection).retainAll(f.a(iterable, collection));
    }
}
