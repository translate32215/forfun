package s;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: MapCollections */
public abstract class h<K, V> {

    /* renamed from: a  reason: collision with root package name */
    public h<K, V>.b f24830a;

    /* renamed from: b  reason: collision with root package name */
    public h<K, V>.c f24831b;

    /* renamed from: c  reason: collision with root package name */
    public h<K, V>.e f24832c;

    /* compiled from: MapCollections */
    public final class a<T> implements Iterator<T> {

        /* renamed from: a  reason: collision with root package name */
        public final int f24833a;

        /* renamed from: b  reason: collision with root package name */
        public int f24834b;

        /* renamed from: c  reason: collision with root package name */
        public int f24835c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f24836d = false;

        public a(int i10) {
            this.f24833a = i10;
            this.f24834b = h.this.d();
        }

        public boolean hasNext() {
            return this.f24835c < this.f24834b;
        }

        public T next() {
            if (hasNext()) {
                T b10 = h.this.b(this.f24835c, this.f24833a);
                this.f24835c++;
                this.f24836d = true;
                return b10;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            if (this.f24836d) {
                int i10 = this.f24835c - 1;
                this.f24835c = i10;
                this.f24834b--;
                this.f24836d = false;
                h.this.h(i10);
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* compiled from: MapCollections */
    public final class b implements Set<Map.Entry<K, V>> {
        public b() {
        }

        public boolean add(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int d10 = h.this.d();
            for (Map.Entry entry : collection) {
                h.this.g(entry.getKey(), entry.getValue());
            }
            return d10 != h.this.d();
        }

        public void clear() {
            h.this.a();
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int e10 = h.this.e(entry.getKey());
            if (e10 < 0) {
                return false;
            }
            return e.c(h.this.b(e10, 1), entry.getValue());
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            return h.j(this, obj);
        }

        public int hashCode() {
            int i10;
            int i11;
            int i12 = 0;
            for (int d10 = h.this.d() - 1; d10 >= 0; d10--) {
                Object b10 = h.this.b(d10, 0);
                Object b11 = h.this.b(d10, 1);
                if (b10 == null) {
                    i10 = 0;
                } else {
                    i10 = b10.hashCode();
                }
                if (b11 == null) {
                    i11 = 0;
                } else {
                    i11 = b11.hashCode();
                }
                i12 += i10 ^ i11;
            }
            return i12;
        }

        public boolean isEmpty() {
            return h.this.d() == 0;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public int size() {
            return h.this.d();
        }

        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: MapCollections */
    public final class c implements Set<K> {
        public c() {
        }

        public boolean add(K k10) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            h.this.a();
        }

        public boolean contains(Object obj) {
            return h.this.e(obj) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            Map c10 = h.this.c();
            for (Object containsKey : collection) {
                if (!c10.containsKey(containsKey)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            return h.j(this, obj);
        }

        public int hashCode() {
            int i10;
            int i11 = 0;
            for (int d10 = h.this.d() - 1; d10 >= 0; d10--) {
                Object b10 = h.this.b(d10, 0);
                if (b10 == null) {
                    i10 = 0;
                } else {
                    i10 = b10.hashCode();
                }
                i11 += i10;
            }
            return i11;
        }

        public boolean isEmpty() {
            return h.this.d() == 0;
        }

        public Iterator<K> iterator() {
            return new a(0);
        }

        public boolean remove(Object obj) {
            int e10 = h.this.e(obj);
            if (e10 < 0) {
                return false;
            }
            h.this.h(e10);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            Map c10 = h.this.c();
            int size = c10.size();
            for (Object remove : collection) {
                c10.remove(remove);
            }
            return size != c10.size();
        }

        public boolean retainAll(Collection<?> collection) {
            return h.k(h.this.c(), collection);
        }

        public int size() {
            return h.this.d();
        }

        public Object[] toArray() {
            return h.this.l(0);
        }

        public <T> T[] toArray(T[] tArr) {
            return h.this.m(tArr, 0);
        }
    }

    /* compiled from: MapCollections */
    public final class d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public int f24840a;

        /* renamed from: b  reason: collision with root package name */
        public int f24841b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f24842c = false;

        public d() {
            this.f24840a = h.this.d() - 1;
            this.f24841b = -1;
        }

        public boolean equals(Object obj) {
            if (!this.f24842c) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            } else if (!(obj instanceof Map.Entry)) {
                return false;
            } else {
                Map.Entry entry = (Map.Entry) obj;
                if (!e.c(entry.getKey(), h.this.b(this.f24841b, 0)) || !e.c(entry.getValue(), h.this.b(this.f24841b, 1))) {
                    return false;
                }
                return true;
            }
        }

        public K getKey() {
            if (this.f24842c) {
                return h.this.b(this.f24841b, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public V getValue() {
            if (this.f24842c) {
                return h.this.b(this.f24841b, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public boolean hasNext() {
            return this.f24841b < this.f24840a;
        }

        public int hashCode() {
            int i10;
            if (this.f24842c) {
                int i11 = 0;
                Object b10 = h.this.b(this.f24841b, 0);
                Object b11 = h.this.b(this.f24841b, 1);
                if (b10 == null) {
                    i10 = 0;
                } else {
                    i10 = b10.hashCode();
                }
                if (b11 != null) {
                    i11 = b11.hashCode();
                }
                return i10 ^ i11;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public Object next() {
            if (hasNext()) {
                this.f24841b++;
                this.f24842c = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            if (this.f24842c) {
                h.this.h(this.f24841b);
                this.f24841b--;
                this.f24840a--;
                this.f24842c = false;
                return;
            }
            throw new IllegalStateException();
        }

        public V setValue(V v10) {
            if (this.f24842c) {
                return h.this.i(this.f24841b, v10);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* compiled from: MapCollections */
    public final class e implements Collection<V> {
        public e() {
        }

        public boolean add(V v10) {
            throw new UnsupportedOperationException();
        }

        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        public void clear() {
            h.this.a();
        }

        public boolean contains(Object obj) {
            return h.this.f(obj) >= 0;
        }

        public boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public boolean isEmpty() {
            return h.this.d() == 0;
        }

        public Iterator<V> iterator() {
            return new a(1);
        }

        public boolean remove(Object obj) {
            int f10 = h.this.f(obj);
            if (f10 < 0) {
                return false;
            }
            h.this.h(f10);
            return true;
        }

        public boolean removeAll(Collection<?> collection) {
            int d10 = h.this.d();
            int i10 = 0;
            boolean z10 = false;
            while (i10 < d10) {
                if (collection.contains(h.this.b(i10, 1))) {
                    h.this.h(i10);
                    i10--;
                    d10--;
                    z10 = true;
                }
                i10++;
            }
            return z10;
        }

        public boolean retainAll(Collection<?> collection) {
            int d10 = h.this.d();
            int i10 = 0;
            boolean z10 = false;
            while (i10 < d10) {
                if (!collection.contains(h.this.b(i10, 1))) {
                    h.this.h(i10);
                    i10--;
                    d10--;
                    z10 = true;
                }
                i10++;
            }
            return z10;
        }

        public int size() {
            return h.this.d();
        }

        public Object[] toArray() {
            return h.this.l(1);
        }

        public <T> T[] toArray(T[] tArr) {
            return h.this.m(tArr, 1);
        }
    }

    public static <T> boolean j(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() != set2.size() || !set.containsAll(set2)) {
                    return false;
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static <K, V> boolean k(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    public abstract void a();

    public abstract Object b(int i10, int i11);

    public abstract Map<K, V> c();

    public abstract int d();

    public abstract int e(Object obj);

    public abstract int f(Object obj);

    public abstract void g(K k10, V v10);

    public abstract void h(int i10);

    public abstract V i(int i10, V v10);

    public Object[] l(int i10) {
        int d10 = d();
        Object[] objArr = new Object[d10];
        for (int i11 = 0; i11 < d10; i11++) {
            objArr[i11] = b(i11, i10);
        }
        return objArr;
    }

    public <T> T[] m(T[] tArr, int i10) {
        int d10 = d();
        if (tArr.length < d10) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), d10);
        }
        for (int i11 = 0; i11 < d10; i11++) {
            tArr[i11] = b(i11, i10);
        }
        if (tArr.length > d10) {
            tArr[d10] = null;
        }
        return tArr;
    }
}
