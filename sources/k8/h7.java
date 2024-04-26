package k8;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.2 */
public final class h7<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: b  reason: collision with root package name */
    public static final h7 f20244b;

    /* renamed from: a  reason: collision with root package name */
    public boolean f20245a = true;

    static {
        h7 h7Var = new h7();
        f20244b = h7Var;
        h7Var.f20245a = false;
    }

    public h7() {
    }

    public static int a(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj.hashCode();
        }
        Charset charset = r6.f20450a;
        int i10 = r0;
        for (byte b10 : (byte[]) obj) {
            i10 = (i10 * 31) + b10;
        }
        if (i10 == 0) {
            return 1;
        }
        return i10;
    }

    public final void b() {
        if (!this.f20245a) {
            throw new UnsupportedOperationException();
        }
    }

    public final void clear() {
        b();
        super.clear();
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    public final boolean equals(Object obj) {
        boolean z10;
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        for (Map.Entry entry : entrySet()) {
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            Object value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(value instanceof byte[]) || !(obj2 instanceof byte[])) {
                z10 = value.equals(obj2);
                continue;
            } else {
                z10 = Arrays.equals((byte[]) value, (byte[]) obj2);
                continue;
            }
            if (!z10) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i10 = 0;
        for (Map.Entry entry : entrySet()) {
            i10 += a(entry.getValue()) ^ a(entry.getKey());
        }
        return i10;
    }

    public final V put(K k10, V v10) {
        b();
        Charset charset = r6.f20450a;
        k10.getClass();
        v10.getClass();
        return super.put(k10, v10);
    }

    public final void putAll(Map<? extends K, ? extends V> map) {
        b();
        for (Object next : map.keySet()) {
            Charset charset = r6.f20450a;
            next.getClass();
            map.get(next).getClass();
        }
        super.putAll(map);
    }

    public final V remove(Object obj) {
        b();
        return super.remove(obj);
    }

    public h7(Map<K, V> map) {
        super(map);
    }
}
