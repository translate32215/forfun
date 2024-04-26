package kd;

import com.google.gson.n;
import td.a;

/* compiled from: LazyJVM.kt */
public class e {
    public static final <T> d<T> a(f fVar, a<? extends T> aVar) {
        int ordinal = fVar.ordinal();
        if (ordinal == 0) {
            return new j(aVar, (Object) null, 2);
        }
        if (ordinal == 1) {
            return new i(aVar);
        }
        if (ordinal == 2) {
            return new p(aVar);
        }
        throw new n();
    }

    public static final <T> d<T> b(a<? extends T> aVar) {
        return new j(aVar, (Object) null, 2);
    }
}
