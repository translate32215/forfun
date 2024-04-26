package kf;

import gf.l;
import java.util.Map;
import jf.e;
import kd.k;
import kf.q;
import ud.l;

/* compiled from: KodeinTreeImpl.kt */
public final class n extends l implements td.l<Map.Entry<? extends q.a, ? extends Map<Object, l.e<?, ?, ?>>>, k<? extends q.a, ? extends Map<Object, l.e<?, ?, ?>>, ? extends e<?, ?>>> {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e f20952b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n(e eVar) {
        super(1);
        this.f20952b = eVar;
    }

    public Object c(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        ud.k.g(entry, "it");
        return new k(entry.getKey(), entry.getValue(), this.f20952b);
    }
}
