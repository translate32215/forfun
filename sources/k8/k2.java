package k8;

import b8.a;
import java.util.Map;
import m3.t;
import n2.g;
import x.f;

/* compiled from: com.google.android.gms:play-services-measurement@@19.0.2 */
public final class k2 {

    /* renamed from: a  reason: collision with root package name */
    public final t f20287a;

    /* renamed from: b  reason: collision with root package name */
    public final g f20288b;

    /* renamed from: c  reason: collision with root package name */
    public final g f20289c;

    /* renamed from: d  reason: collision with root package name */
    public final b2.t f20290d;

    public k2() {
        t tVar = new t(3);
        this.f20287a = tVar;
        g gVar = new g((g) null, tVar);
        this.f20289c = gVar;
        this.f20288b = gVar.w();
        b2.t tVar2 = new b2.t(13);
        this.f20290d = tVar2;
        gVar.C("require", new qc(tVar2));
        ((Map) tVar2.f3445b).put("internal.platform", q1.f20432a);
        gVar.C("runtime.counter", new h(Double.valueOf(0.0d)));
    }

    public final o a(g gVar, b4... b4VarArr) {
        o oVar = o.f20381n;
        for (b4 j10 : b4VarArr) {
            oVar = a.j(j10);
            f.h(this.f20289c);
            if ((oVar instanceof p) || (oVar instanceof n)) {
                oVar = this.f20287a.d(gVar, oVar);
            }
        }
        return oVar;
    }
}
