package ba;

import java.util.Collection;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: AbstractListMultimap */
public abstract class c<K, V> extends d<K, V> {
    public c(Map<K, Collection<V>> map) {
        super(map);
    }

    public Map<K, Collection<V>> a() {
        Map<K, Collection<V>> map = this.f3726c;
        if (map != null) {
            return map;
        }
        Map<K, Collection<V>> c10 = c();
        this.f3726c = c10;
        return c10;
    }

    public boolean equals(@NullableDecl Object obj) {
        return super.equals(obj);
    }
}
