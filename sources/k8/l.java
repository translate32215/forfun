package k8;

import e.j;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import n2.g;

/* compiled from: com.google.android.gms:play-services-measurement@@19.0.2 */
public class l implements o, k {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, o> f20299a = new HashMap();

    public final Double a() {
        return Double.valueOf(Double.NaN);
    }

    public final Iterator<o> c() {
        return new j(this.f20299a.keySet().iterator());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        return this.f20299a.equals(((l) obj).f20299a);
    }

    public final o f() {
        l lVar = new l();
        for (Map.Entry next : this.f20299a.entrySet()) {
            if (next.getValue() instanceof k) {
                lVar.f20299a.put((String) next.getKey(), (o) next.getValue());
            } else {
                lVar.f20299a.put((String) next.getKey(), ((o) next.getValue()).f());
            }
        }
        return lVar;
    }

    public final boolean h(String str) {
        return this.f20299a.containsKey(str);
    }

    public final int hashCode() {
        return this.f20299a.hashCode();
    }

    public final o i(String str) {
        return this.f20299a.containsKey(str) ? this.f20299a.get(str) : o.f20381n;
    }

    public final Boolean j() {
        return Boolean.TRUE;
    }

    public final void o(String str, o oVar) {
        if (oVar == null) {
            this.f20299a.remove(str);
        } else {
            this.f20299a.put(str, oVar);
        }
    }

    public final String q() {
        return "[object Object]";
    }

    public o s(String str, g gVar, List<o> list) {
        if ("toString".equals(str)) {
            return new r(toString());
        }
        return j.e(this, new r(str), gVar, list);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("{");
        if (!this.f20299a.isEmpty()) {
            for (String next : this.f20299a.keySet()) {
                sb2.append(String.format("%s: %s,", new Object[]{next, this.f20299a.get(next)}));
            }
            sb2.deleteCharAt(sb2.lastIndexOf(","));
        }
        sb2.append("}");
        return sb2.toString();
    }
}
