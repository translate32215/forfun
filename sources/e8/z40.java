package e8;

import com.google.android.gms.internal.ads.ug;
import com.google.android.gms.internal.ads.vg;
import com.google.android.gms.internal.ads.wg;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class z40<K, V> extends vg<Map.Entry<K, V>> {

    /* renamed from: d  reason: collision with root package name */
    public final transient wg<K, V> f17689d;

    /* renamed from: e  reason: collision with root package name */
    public final transient Object[] f17690e;

    /* renamed from: f  reason: collision with root package name */
    public final transient int f17691f;

    public z40(wg wgVar, Object[] objArr, int i10) {
        this.f17689d = wgVar;
        this.f17690e = objArr;
        this.f17691f = i10;
    }

    public final int c(Object[] objArr, int i10) {
        return o().c(objArr, i10);
    }

    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value == null || !value.equals(this.f17689d.get(key))) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final d50<Map.Entry<K, V>> iterator() {
        return o().iterator();
    }

    public final boolean q() {
        return true;
    }

    public final int size() {
        return this.f17691f;
    }

    public final ug<Map.Entry<K, V>> z() {
        return new y40(this);
    }
}
