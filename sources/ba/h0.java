package ba;

import java.util.Collection;
import java.util.Map;

/* compiled from: Multimap */
public interface h0<K, V> {
    Map<K, Collection<V>> a();

    void clear();

    int size();
}
