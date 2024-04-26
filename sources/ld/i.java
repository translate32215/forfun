package ld;

import java.util.Collection;
import ud.k;

/* compiled from: IteratorsJVM.kt */
public class i extends h {
    public static final <T> int f(Iterable<? extends T> iterable, int i10) {
        k.f(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i10;
    }
}
