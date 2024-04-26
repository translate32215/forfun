package ba;

import aa.f;
import com.google.j2objc.annotations.Weak;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: Maps */
public class f0<K, V> extends AbstractCollection<V> {
    @Weak

    /* renamed from: a  reason: collision with root package name */
    public final Map<K, V> f3728a;

    public f0(Map<K, V> map) {
        this.f3728a = map;
    }

    public void clear() {
        this.f3728a.clear();
    }

    public boolean contains(@NullableDecl Object obj) {
        return this.f3728a.containsValue(obj);
    }

    public boolean isEmpty() {
        return this.f3728a.isEmpty();
    }

    public Iterator<V> iterator() {
        return new c0(this.f3728a.entrySet().iterator());
    }

    public boolean remove(Object obj) {
        try {
            return super.remove(obj);
        } catch (UnsupportedOperationException unused) {
            for (Map.Entry next : this.f3728a.entrySet()) {
                if (f.a(obj, next.getValue())) {
                    this.f3728a.remove(next.getKey());
                    return true;
                }
            }
            return false;
        }
    }

    public boolean removeAll(Collection<?> collection) {
        try {
            collection.getClass();
            return super.removeAll(collection);
        } catch (UnsupportedOperationException unused) {
            HashSet hashSet = new HashSet();
            for (Map.Entry next : this.f3728a.entrySet()) {
                if (collection.contains(next.getValue())) {
                    hashSet.add(next.getKey());
                }
            }
            return this.f3728a.keySet().removeAll(hashSet);
        }
    }

    public boolean retainAll(Collection<?> collection) {
        try {
            collection.getClass();
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            HashSet hashSet = new HashSet();
            for (Map.Entry next : this.f3728a.entrySet()) {
                if (collection.contains(next.getValue())) {
                    hashSet.add(next.getKey());
                }
            }
            return this.f3728a.keySet().retainAll(hashSet);
        }
    }

    public int size() {
        return this.f3728a.size();
    }
}
