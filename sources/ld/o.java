package ld;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import ud.k;
import vd.a;

/* compiled from: Maps.kt */
public final class o implements Map, Serializable, a {

    /* renamed from: a  reason: collision with root package name */
    public static final o f21257a = new o();

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean containsKey(Object obj) {
        return false;
    }

    public final boolean containsValue(Object obj) {
        if (!(obj instanceof Void)) {
            return false;
        }
        k.f((Void) obj, "value");
        return false;
    }

    public final /* bridge */ Set<Map.Entry> entrySet() {
        return p.f21258a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof Map) && ((Map) obj).isEmpty();
    }

    public /* bridge */ /* synthetic */ Object get(Object obj) {
        return null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean isEmpty() {
        return true;
    }

    public final /* bridge */ Set<Object> keySet() {
        return p.f21258a;
    }

    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return 0;
    }

    public String toString() {
        return "{}";
    }

    public final /* bridge */ Collection values() {
        return n.f21256a;
    }
}
