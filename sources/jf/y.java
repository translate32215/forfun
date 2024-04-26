package jf;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import ld.l;
import td.a;
import ud.f;
import ud.k;

/* compiled from: scopes.kt */
public final class y extends s {

    /* renamed from: a  reason: collision with root package name */
    public final Map<Object, a<Object>> f19831a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    public final Object f19832b = new Object();

    public y() {
        super((f) null);
    }

    public void a() {
        List<T> list;
        List<T> w10;
        Object obj = this.f19832b;
        if (obj == null) {
            list = l.w(this.f19831a.values());
            this.f19831a.clear();
        } else {
            synchronized (obj) {
                w10 = l.w(this.f19831a.values());
                this.f19831a.clear();
            }
            list = w10;
        }
        for (T d10 : list) {
            Object d11 = d10.d();
            if (!(d11 instanceof q)) {
                d11 = null;
            }
            q qVar = (q) d11;
            if (qVar != null) {
                qVar.close();
            }
        }
    }

    public Object b(Object obj, boolean z10, a<? extends o<? extends Object>> aVar) {
        k.g(obj, "key");
        Object obj2 = null;
        Object obj3 = z10 ? this.f19832b : null;
        a aVar2 = this.f19831a.get(obj);
        Object d10 = aVar2 != null ? aVar2.d() : null;
        if (d10 != null) {
            return d10;
        }
        if (obj3 == null) {
            a aVar3 = this.f19831a.get(obj);
            if (aVar3 != null) {
                obj2 = aVar3.d();
            }
            if (obj2 == null) {
                o oVar = (o) ((v) aVar).d();
                T t10 = oVar.f19810a;
                this.f19831a.put(obj, oVar.f19811b);
                return t10;
            }
        } else {
            synchronized (obj3) {
                a aVar4 = this.f19831a.get(obj);
                if (aVar4 != null) {
                    obj2 = aVar4.d();
                }
                if (obj2 == null) {
                    o oVar2 = (o) ((v) aVar).d();
                    T t11 = oVar2.f19810a;
                    this.f19831a.put(obj, oVar2.f19811b);
                    return t11;
                }
            }
        }
        return obj2;
    }
}
