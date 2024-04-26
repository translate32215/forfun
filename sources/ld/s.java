package ld;

import java.util.Collections;
import java.util.Map;
import ud.k;

/* compiled from: MapsJVM.kt */
public class s {
    public static final int a(int i10) {
        if (i10 < 0) {
            return i10;
        }
        if (i10 < 3) {
            return i10 + 1;
        }
        if (i10 < 1073741824) {
            return (int) ((((float) i10) / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static final <K, V> Map<K, V> b(Map<? extends K, ? extends V> map) {
        Map.Entry next = map.entrySet().iterator().next();
        Map<K, V> singletonMap = Collections.singletonMap(next.getKey(), next.getValue());
        k.e(singletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        return singletonMap;
    }
}
