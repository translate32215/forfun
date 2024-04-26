package e8;

import com.google.android.gms.internal.ads.cq;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class h80<K> implements Map.Entry<K, Object> {

    /* renamed from: a  reason: collision with root package name */
    public Map.Entry<K, g80> f14880a;

    public h80(Map.Entry entry, jc0 jc0) {
        this.f14880a = entry;
    }

    public final K getKey() {
        return this.f14880a.getKey();
    }

    public final Object getValue() {
        if (this.f14880a.getValue() == null) {
            return null;
        }
        int i10 = g80.f14736c;
        throw new NoSuchMethodError();
    }

    public final Object setValue(Object obj) {
        if (obj instanceof cq) {
            g80 value = this.f14880a.getValue();
            cq cqVar = value.f14997a;
            value.f14998b = null;
            value.f14997a = (cq) obj;
            return cqVar;
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
