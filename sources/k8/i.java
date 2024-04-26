package k8;

import e.j;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import n2.g;

/* compiled from: com.google.android.gms:play-services-measurement@@19.0.2 */
public abstract class i implements o, k {

    /* renamed from: a  reason: collision with root package name */
    public final String f20254a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, o> f20255b = new HashMap();

    public i(String str) {
        this.f20254a = str;
    }

    public final Double a() {
        return Double.valueOf(Double.NaN);
    }

    public abstract o b(g gVar, List<o> list);

    public final Iterator<o> c() {
        return new j(this.f20255b.keySet().iterator());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        String str = this.f20254a;
        if (str != null) {
            return str.equals(iVar.f20254a);
        }
        return false;
    }

    public o f() {
        return this;
    }

    public final boolean h(String str) {
        return this.f20255b.containsKey(str);
    }

    public final int hashCode() {
        String str = this.f20254a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final o i(String str) {
        return this.f20255b.containsKey(str) ? this.f20255b.get(str) : o.f20381n;
    }

    public final Boolean j() {
        return Boolean.TRUE;
    }

    public final void o(String str, o oVar) {
        if (oVar == null) {
            this.f20255b.remove(str);
        } else {
            this.f20255b.put(str, oVar);
        }
    }

    public final String q() {
        return this.f20254a;
    }

    public final o s(String str, g gVar, List<o> list) {
        if ("toString".equals(str)) {
            return new r(this.f20254a);
        }
        return j.e(this, new r(str), gVar, list);
    }
}
