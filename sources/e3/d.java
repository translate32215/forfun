package e3;

import a3.b;
import a3.e;
import f3.c;
import g3.g;
import h3.a;
import java.io.IOException;
import java.util.List;

/* compiled from: AnimatableValueParser */
public class d {
    public static <T> List<a<T>> a(c cVar, u2.d dVar, h0<T> h0Var) throws IOException {
        return r.a(cVar, dVar, 1.0f, h0Var);
    }

    public static a3.a b(c cVar, u2.d dVar) throws IOException {
        return new a3.a(a(cVar, dVar, f.f13552a));
    }

    public static b c(c cVar, u2.d dVar) throws IOException {
        return d(cVar, dVar, true);
    }

    public static b d(c cVar, u2.d dVar, boolean z10) throws IOException {
        return new b(r.a(cVar, dVar, z10 ? g.c() : 1.0f, i.f13559a));
    }

    public static a3.d e(c cVar, u2.d dVar) throws IOException {
        return new a3.d(a(cVar, dVar, o.f13569a));
    }

    public static e f(c cVar, u2.d dVar) throws IOException {
        return new e(r.a(cVar, dVar, g.c(), w.f13584a));
    }
}
