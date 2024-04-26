package ld;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import ud.k;

/* compiled from: Collections.kt */
public class h {
    public static final <T> Collection<T> a(T[] tArr) {
        return new b(tArr, false);
    }

    public static final <T> int b(List<? extends T> list) {
        return list.size() - 1;
    }

    public static final <T> List<T> c(T t10) {
        List<T> singletonList = Collections.singletonList(t10);
        k.e(singletonList, "singletonList(element)");
        return singletonList;
    }

    public static final <T> List<T> d(List<? extends T> list) {
        int size = list.size();
        if (size == 0) {
            return n.f21256a;
        }
        if (size != 1) {
            return list;
        }
        return c(list.get(0));
    }

    public static final void e() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
