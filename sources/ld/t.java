package ld;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kd.g;
import ud.k;

/* compiled from: _MapsJvm.kt */
public class t extends s {
    public static final <K, V> Map<K, V> c(Iterable<? extends g<? extends K, ? extends V>> iterable) {
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return o.f21257a;
        }
        if (size != 1) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(s.a(collection.size()));
            d(iterable, linkedHashMap);
            return linkedHashMap;
        }
        g gVar = (g) ((List) iterable).get(0);
        k.f(gVar, "pair");
        Map<K, V> singletonMap = Collections.singletonMap(gVar.f20614a, gVar.f20615b);
        k.e(singletonMap, "singletonMap(pair.first, pair.second)");
        return singletonMap;
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M d(Iterable<? extends g<? extends K, ? extends V>> iterable, M m10) {
        for (g gVar : iterable) {
            m10.put(gVar.f20614a, gVar.f20615b);
        }
        return m10;
    }

    public static final <K, V> Map<K, V> e(Map<? extends K, ? extends V> map) {
        k.f(map, "<this>");
        int size = map.size();
        if (size == 0) {
            return o.f21257a;
        }
        if (size == 1) {
            return s.b(map);
        }
        k.f(map, "<this>");
        return new LinkedHashMap(map);
    }
}
