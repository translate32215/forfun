package o4;

import com.google.auto.value.AutoValue;
import java.util.HashMap;
import java.util.Map;
import o4.a;

@AutoValue
/* compiled from: EventInternal */
public abstract class f {

    @AutoValue.Builder
    /* compiled from: EventInternal */
    public static abstract class a {
        public final a a(String str, String str2) {
            c().put(str, str2);
            return this;
        }

        public abstract f b();

        public abstract Map<String, String> c();
    }

    public final String a(String str) {
        String str2 = b().get(str);
        return str2 == null ? "" : str2;
    }

    public abstract Map<String, String> b();

    public abstract Integer c();

    public abstract e d();

    public abstract long e();

    public final int f(String str) {
        String str2 = b().get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public abstract String g();

    public abstract long h();

    public a i() {
        a.b bVar = new a.b();
        bVar.f(g());
        bVar.f22931b = c();
        bVar.d(d());
        bVar.e(e());
        bVar.g(h());
        bVar.f22935f = new HashMap(b());
        return bVar;
    }
}
