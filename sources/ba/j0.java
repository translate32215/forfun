package ba;

import aa.m;
import ba.d;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.SortedMap;

/* compiled from: Multimaps */
public class j0<K, V> extends c<K, V> {

    /* renamed from: f  reason: collision with root package name */
    public transient m<? extends List<V>> f3734f;

    public j0(Map<K, Collection<V>> map, m<? extends List<V>> mVar) {
        super(map);
        mVar.getClass();
        this.f3734f = mVar;
    }

    public Map<K, Collection<V>> c() {
        Map<K, Collection<V>> map = this.f3691d;
        if (map instanceof NavigableMap) {
            return new d.e((NavigableMap) this.f3691d);
        }
        if (map instanceof SortedMap) {
            return new d.h((SortedMap) this.f3691d);
        }
        return new d.b(this.f3691d);
    }

    public Set<K> d() {
        Map<K, Collection<V>> map = this.f3691d;
        if (map instanceof NavigableMap) {
            return new d.f((NavigableMap) this.f3691d);
        }
        if (map instanceof SortedMap) {
            return new d.i((SortedMap) this.f3691d);
        }
        return new d.C0053d(this.f3691d);
    }

    public Collection h() {
        return (List) this.f3734f.get();
    }
}
