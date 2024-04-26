package kf;

import gf.l;
import java.util.Map;
import jf.e;
import kd.k;
import ud.l;

/* compiled from: KodeinTreeImpl.kt */
public final class p extends l implements td.l<Map.Entry<? extends Object, ? extends l.e<?, ?, ?>>, k<? extends Object, ? extends l.e<?, ?, ?>, ? extends e<?, ?>>> {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e f20954b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p(e eVar) {
        super(1);
        this.f20954b = eVar;
    }

    public Object c(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        ud.k.g(entry, "it");
        return new k(entry.getKey(), entry.getValue(), this.f20954b);
    }
}
