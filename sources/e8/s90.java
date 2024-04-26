package e8;

import e.g;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class s90 implements Comparable<s90>, Map.Entry<K, V> {

    /* renamed from: a  reason: collision with root package name */
    public final K f16382a;

    /* renamed from: b  reason: collision with root package name */
    public V f16383b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ p90 f16384c;

    public s90(p90 p90, Map.Entry<K, V> entry) {
        V value = entry.getValue();
        this.f16384c = p90;
        this.f16382a = (Comparable) entry.getKey();
        this.f16383b = value;
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return this.f16382a.compareTo(((s90) obj).f16382a);
    }

    public final boolean equals(Object obj) {
        boolean z10;
        boolean z11;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        K k10 = this.f16382a;
        Object key = entry.getKey();
        if (k10 == null) {
            z10 = key == null;
        } else {
            z10 = k10.equals(key);
        }
        if (z10) {
            V v10 = this.f16383b;
            Object value = entry.getValue();
            if (v10 == null) {
                z11 = value == null;
            } else {
                z11 = v10.equals(value);
            }
            if (z11) {
                return true;
            }
        }
        return false;
    }

    public final /* synthetic */ Object getKey() {
        return this.f16382a;
    }

    public final V getValue() {
        return this.f16383b;
    }

    public final int hashCode() {
        K k10 = this.f16382a;
        int i10 = 0;
        int hashCode = k10 == null ? 0 : k10.hashCode();
        V v10 = this.f16383b;
        if (v10 != null) {
            i10 = v10.hashCode();
        }
        return hashCode ^ i10;
    }

    public final V setValue(V v10) {
        p90 p90 = this.f16384c;
        int i10 = p90.f15882g;
        p90.f();
        V v11 = this.f16383b;
        this.f16383b = v10;
        return v11;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f16382a);
        String valueOf2 = String.valueOf(this.f16383b);
        return g.a(valueOf2.length() + valueOf.length() + 1, valueOf, "=", valueOf2);
    }

    public s90(p90 p90, K k10, V v10) {
        this.f16384c = p90;
        this.f16382a = k10;
        this.f16383b = v10;
    }
}
