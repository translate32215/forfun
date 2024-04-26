package gf;

import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;

/* compiled from: types.kt */
public abstract class k<T> implements g0<T> {
    public String a() {
        Type h10 = h();
        ud.k.g(h10, "$this$fullDispString");
        return f0.c(j.f18666a, h10, false, 2, (Object) null);
    }

    public String e() {
        Type h10 = h();
        ud.k.g(h10, "$this$simpleDispString");
        return f0.c(c0.f18656a, h10, false, 2, (Object) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && !(ud.k.a(h(), ((k) obj).h()) ^ true);
    }

    public boolean g(g0<?> g0Var) {
        ud.k.g(g0Var, "typeToken");
        ud.k.g(g0Var, "typeToken");
        if (ud.k.a(this, g0Var)) {
            return true;
        }
        d0 d0Var = d0.f18660c;
        if (ud.k.a(this, d0.f18659b)) {
            return true;
        }
        g0 c10 = c();
        if (c10 == null || !ud.k.a(c10, g0Var.c())) {
            List<g0<?>> d10 = g0Var.d();
            if (!(d10 instanceof Collection) || !d10.isEmpty()) {
                for (g0 g10 : d10) {
                    if (g(g10)) {
                        return true;
                    }
                }
            }
        } else {
            g0[] b10 = b();
            if (b10.length == 0) {
                return true;
            }
            g0[] b11 = g0Var.b();
            int length = b10.length;
            int i10 = 0;
            int i11 = 0;
            while (i10 < length) {
                int i12 = i11 + 1;
                if (b10[i10].g(b11[i11])) {
                    i10++;
                    i11 = i12;
                }
            }
            return true;
        }
        return false;
    }

    public abstract Type h();

    public int hashCode() {
        return h().hashCode();
    }
}
