package cb;

import android.content.Context;
import la.b;
import la.c;
import la.m;

/* compiled from: LibraryVersionComponent */
public class g {

    /* compiled from: LibraryVersionComponent */
    public interface a<T> {
        String a(T t10);
    }

    public static c<?> a(String str, String str2) {
        a aVar = new a(str, str2);
        c.b<e> a10 = c.a(e.class);
        a10.f21194d = 1;
        a10.f21195e = new b(aVar);
        return a10.b();
    }

    public static c<?> b(String str, a<Context> aVar) {
        c.b<e> a10 = c.a(e.class);
        a10.f21194d = 1;
        a10.a(new m(Context.class, 1, 0));
        a10.f21195e = new f(str, aVar);
        return a10.b();
    }
}
