package ba;

import ba.d;
import ba.v0;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;

/* compiled from: Maps */
public abstract class d0<K, V> extends v0.b<Map.Entry<K, V>> {
    public void clear() {
        d.b.this.clear();
    }

    public abstract boolean contains(Object obj);

    public boolean isEmpty() {
        return d.b.this.isEmpty();
    }

    public boolean removeAll(Collection<?> collection) {
        try {
            collection.getClass();
            return super.removeAll(collection);
        } catch (UnsupportedOperationException unused) {
            return v0.c(this, collection.iterator());
        }
    }

    public boolean retainAll(Collection<?> collection) {
        int i10;
        try {
            collection.getClass();
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            int size = collection.size();
            if (size < 3) {
                h.b(size, "expectedSize");
                i10 = size + 1;
            } else {
                i10 = size < 1073741824 ? (int) ((((float) size) / 0.75f) + 1.0f) : Integer.MAX_VALUE;
            }
            HashSet hashSet = new HashSet(i10);
            for (Object next : collection) {
                if (contains(next)) {
                    hashSet.add(((Map.Entry) next).getKey());
                }
            }
            return d.b.this.keySet().retainAll(hashSet);
        }
    }

    public int size() {
        return d.b.this.size();
    }
}
