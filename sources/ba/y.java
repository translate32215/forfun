package ba;

import ba.v0;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: Iterables */
public final class y {
    @NullableDecl
    public static <T> T a(Iterable<? extends T> iterable, @NullableDecl T t10) {
        u0 u0Var = new u0((v0.a) iterable);
        return u0Var.hasNext() ? u0Var.next() : t10;
    }

    public static <T> T b(Iterable<T> iterable) {
        T next;
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (!list.isEmpty()) {
                return list.get(list.size() - 1);
            }
            throw new NoSuchElementException();
        }
        Iterator<T> it = iterable.iterator();
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }
}
