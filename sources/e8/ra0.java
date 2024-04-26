package e8;

import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public abstract class ra0<K, V, V2> implements ta0<Map<K, V2>> {

    /* renamed from: a  reason: collision with root package name */
    public final Map<K, ab0<V>> f16260a;

    public ra0(Map<K, ab0<V>> map) {
        this.f16260a = Collections.unmodifiableMap(map);
    }
}
