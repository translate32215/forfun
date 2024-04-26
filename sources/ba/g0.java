package ba;

import ba.d;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;

/* compiled from: Maps */
public abstract class g0<K, V> extends AbstractMap<K, V> {
    @MonotonicNonNullDecl

    /* renamed from: a  reason: collision with root package name */
    public transient Set<Map.Entry<K, V>> f3729a;
    @MonotonicNonNullDecl

    /* renamed from: b  reason: collision with root package name */
    public transient Collection<V> f3730b;

    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f3729a;
        if (set != null) {
            return set;
        }
        d.b.a aVar = new d.b.a();
        this.f3729a = aVar;
        return aVar;
    }

    public Collection<V> values() {
        Collection<V> collection = this.f3730b;
        if (collection != null) {
            return collection;
        }
        f0 f0Var = new f0(this);
        this.f3730b = f0Var;
        return f0Var;
    }
}
