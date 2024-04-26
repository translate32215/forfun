package s;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import s.h;

/* compiled from: ArrayMap */
public class a<K, V> extends i<K, V> implements Map<K, V> {

    /* renamed from: h  reason: collision with root package name */
    public h<K, V> f24796h;

    /* renamed from: s.a$a  reason: collision with other inner class name */
    /* compiled from: ArrayMap */
    public class C0238a extends h<K, V> {
        public C0238a() {
        }

        public void a() {
            a.this.clear();
        }

        public Object b(int i10, int i11) {
            return a.this.f24850b[(i10 << 1) + i11];
        }

        public Map<K, V> c() {
            return a.this;
        }

        public int d() {
            return a.this.f24851c;
        }

        public int e(Object obj) {
            return a.this.e(obj);
        }

        public int f(Object obj) {
            return a.this.g(obj);
        }

        public void g(K k10, V v10) {
            a.this.put(k10, v10);
        }

        public void h(int i10) {
            a.this.j(i10);
        }

        public V i(int i10, V v10) {
            return a.this.k(i10, v10);
        }
    }

    public a() {
    }

    public Set<Map.Entry<K, V>> entrySet() {
        h m10 = m();
        if (m10.f24830a == null) {
            m10.f24830a = new h.b();
        }
        return m10.f24830a;
    }

    public Set<K> keySet() {
        h m10 = m();
        if (m10.f24831b == null) {
            m10.f24831b = new h.c();
        }
        return m10.f24831b;
    }

    public final h<K, V> m() {
        if (this.f24796h == null) {
            this.f24796h = new C0238a();
        }
        return this.f24796h;
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        b(map.size() + this.f24851c);
        for (Map.Entry next : map.entrySet()) {
            put(next.getKey(), next.getValue());
        }
    }

    public Collection<V> values() {
        h m10 = m();
        if (m10.f24832c == null) {
            m10.f24832c = new h.e();
        }
        return m10.f24832c;
    }

    public a(int i10) {
        super(i10);
    }

    public a(i iVar) {
        if (iVar != null) {
            i(iVar);
        }
    }
}
