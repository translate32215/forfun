package m;

import java.util.HashMap;
import m.b;

/* compiled from: FastSafeIterableMap */
public class a<K, V> extends b<K, V> {

    /* renamed from: e  reason: collision with root package name */
    public HashMap<K, b.c<K, V>> f21450e = new HashMap<>();

    public b.c<K, V> c(K k10) {
        return this.f21450e.get(k10);
    }

    public boolean contains(K k10) {
        return this.f21450e.containsKey(k10);
    }

    public V i(K k10, V v10) {
        b.c cVar = this.f21450e.get(k10);
        if (cVar != null) {
            return cVar.f21456b;
        }
        this.f21450e.put(k10, h(k10, v10));
        return null;
    }

    public V j(K k10) {
        V j10 = super.j(k10);
        this.f21450e.remove(k10);
        return j10;
    }
}
