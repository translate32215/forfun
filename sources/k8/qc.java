package k8;

import b2.t;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import n2.g;
import x.f;

/* compiled from: com.google.android.gms:play-services-measurement@@19.0.2 */
public final class qc extends i {

    /* renamed from: c  reason: collision with root package name */
    public final t f20443c;

    /* renamed from: d  reason: collision with root package name */
    public final Map<String, i> f20444d = new HashMap();

    public qc(t tVar) {
        super("require");
        this.f20443c = tVar;
    }

    public final o b(g gVar, List<o> list) {
        o oVar;
        f.n("require", 1, list);
        String q10 = gVar.y(list.get(0)).q();
        if (this.f20444d.containsKey(q10)) {
            return this.f20444d.get(q10);
        }
        t tVar = this.f20443c;
        if (((Map) tVar.f3445b).containsKey(q10)) {
            try {
                oVar = (o) ((Callable) ((Map) tVar.f3445b).get(q10)).call();
            } catch (Exception unused) {
                String valueOf = String.valueOf(q10);
                throw new IllegalStateException(valueOf.length() != 0 ? "Failed to create API implementation: ".concat(valueOf) : new String("Failed to create API implementation: "));
            }
        } else {
            oVar = o.f20381n;
        }
        if (oVar instanceof i) {
            this.f20444d.put(q10, (i) oVar);
        }
        return oVar;
    }
}
