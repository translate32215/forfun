package kf;

import gf.l;
import java.util.Map;
import kd.k;
import kf.q;
import ud.l;

/* compiled from: KodeinTreeImpl.kt */
public final class o extends l implements td.l<Map.Entry<? extends q.a, ? extends Map<q.a, Map<Object, l.e<?, ?, ?>>>>, k> {

    /* renamed from: b  reason: collision with root package name */
    public static final o f20953b = new o();

    public o() {
        super(1);
    }

    public Object c(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        ud.k.g(entry, "it");
        return new k(entry.getKey(), entry.getValue(), null);
    }
}
