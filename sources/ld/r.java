package ld;

import be.f;
import java.util.Map;
import ud.k;

public final class r extends t {
    public static final <K, V> f<Map.Entry<K, V>> f(Map<? extends K, ? extends V> map) {
        k.f(map, "<this>");
        return l.j(map.entrySet());
    }
}
