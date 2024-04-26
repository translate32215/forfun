package ba;

import aa.f;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: AbstractMapEntry */
public abstract class e<K, V> implements Map.Entry<K, V> {
    public boolean equals(@NullableDecl Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (!f.a(getKey(), entry.getKey()) || !f.a(getValue(), entry.getValue())) {
            return false;
        }
        return true;
    }

    public abstract K getKey();

    public abstract V getValue();

    public int hashCode() {
        int i10;
        Object key = getKey();
        Object value = getValue();
        int i11 = 0;
        if (key == null) {
            i10 = 0;
        } else {
            i10 = key.hashCode();
        }
        if (value != null) {
            i11 = value.hashCode();
        }
        return i10 ^ i11;
    }

    public String toString() {
        return getKey() + "=" + getValue();
    }
}
