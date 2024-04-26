package o8;

import com.google.android.gms.common.internal.i;
import java.util.LinkedHashMap;
import k8.nb;
import k8.p0;
import s.g;

/* compiled from: com.google.android.gms:play-services-measurement@@19.0.2 */
public final class p3 extends g<String, p0> {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ q3 f23386i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p3(q3 q3Var) {
        super(20);
        this.f23386i = q3Var;
    }

    public final Object a(Object obj) {
        LinkedHashMap linkedHashMap;
        String str = (String) obj;
        i.e(str);
        q3 q3Var = this.f23386i;
        q3Var.i();
        i.e(str);
        nb.b();
        if (!q3Var.f8864a.f8843g.v((String) null, v2.f23536s0) || !q3Var.o(str)) {
            return null;
        }
        if (!q3Var.f23402g.containsKey(str) || q3Var.f23402g.get(str) == null) {
            q3Var.w(str);
        } else {
            q3Var.x(str, q3Var.f23402g.get(str));
        }
        g<String, p0> gVar = q3Var.f23404i;
        synchronized (gVar) {
            linkedHashMap = new LinkedHashMap(gVar.f24822a);
        }
        return (p0) linkedHashMap.get(str);
    }
}
