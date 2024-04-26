package e8;

import com.google.android.gms.internal.ads.g7;
import com.google.android.gms.internal.ads.uk;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class va0<K, V> extends ra0<K, V, V> {
    static {
        wa0.a(Collections.emptyMap());
    }

    public va0(Map map, uk ukVar) {
        super(map);
    }

    public static <K, V> xa0<K, V> a(int i10) {
        return new xa0<>(i10, (uk) null);
    }

    public final Object get() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(g7.t(this.f16260a.size()));
        for (Map.Entry next : this.f16260a.entrySet()) {
            linkedHashMap.put(next.getKey(), ((ab0) next.getValue()).get());
        }
        return Collections.unmodifiableMap(linkedHashMap);
    }
}
