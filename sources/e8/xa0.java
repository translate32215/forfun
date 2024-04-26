package e8;

import com.google.android.gms.internal.ads.g7;
import com.google.android.gms.internal.ads.uk;
import java.util.LinkedHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class xa0<K, V> {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedHashMap<K, ab0<V>> f17456a;

    public xa0(int i10, uk ukVar) {
        this.f17456a = new LinkedHashMap<>(g7.t(i10));
    }

    public final xa0 a(Object obj, ab0 ab0) {
        LinkedHashMap<K, ab0<V>> linkedHashMap = this.f17456a;
        if (ab0 != null) {
            linkedHashMap.put(obj, ab0);
            return this;
        }
        throw new NullPointerException("provider");
    }

    public final va0<K, V> b() {
        return new va0<>(this.f17456a, (uk) null);
    }
}
