package k8;

import b8.a;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import n2.g;
import o8.q3;
import t1.c;
import x.f;

/* compiled from: com.google.android.gms:play-services-measurement@@19.0.2 */
public final class f8 extends i {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f20208c = 1;

    /* renamed from: d  reason: collision with root package name */
    public final Object f20209d;

    public f8(String str, c cVar) {
        super("internal.remoteConfig");
        this.f20209d = cVar;
        this.f20255b.put("getValue", new f8(cVar));
    }

    public final o b(g gVar, List list) {
        switch (this.f20208c) {
            case 0:
                f.n("getValue", 2, list);
                o y10 = gVar.y((o) list.get(0));
                o y11 = gVar.y((o) list.get(1));
                String q10 = y10.q();
                c cVar = (c) this.f20209d;
                Map map = ((q3) cVar.f25351c).f23399d.get((String) cVar.f25350b);
                String str = (map == null || !map.containsKey(q10)) ? null : (String) map.get(q10);
                return str != null ? new r(str) : y11;
            case 1:
                return o.f20381n;
            default:
                try {
                    return a.k(((Callable) this.f20209d).call());
                } catch (Exception unused) {
                    return o.f20381n;
                }
        }
    }

    public f8(Callable callable) {
        super("internal.appMetadata");
        this.f20209d = callable;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f8(c cVar) {
        super("getValue");
        this.f20209d = cVar;
    }
}
