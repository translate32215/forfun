package ld;

import java.util.Collections;
import java.util.Set;
import ud.k;

/* compiled from: Sets.kt */
public class u {
    public static final <T> Set<T> a(T t10) {
        Set<T> singleton = Collections.singleton(t10);
        k.e(singleton, "singleton(element)");
        return singleton;
    }
}
