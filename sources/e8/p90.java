package e8;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public class p90<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: g  reason: collision with root package name */
    public static final /* synthetic */ int f15882g = 0;

    /* renamed from: a  reason: collision with root package name */
    public final int f15883a;

    /* renamed from: b  reason: collision with root package name */
    public List<s90> f15884b = Collections.emptyList();

    /* renamed from: c  reason: collision with root package name */
    public Map<K, V> f15885c = Collections.emptyMap();

    /* renamed from: d  reason: collision with root package name */
    public boolean f15886d;

    /* renamed from: e  reason: collision with root package name */
    public volatile u90 f15887e;

    /* renamed from: f  reason: collision with root package name */
    public Map<K, V> f15888f = Collections.emptyMap();

    public p90(int i10, o90 o90) {
        this.f15883a = i10;
    }

    public final int a(K k10) {
        int size = this.f15884b.size() - 1;
        if (size >= 0) {
            int compareTo = k10.compareTo(this.f15884b.get(size).f16382a);
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i10 = 0;
        while (i10 <= size) {
            int i11 = (i10 + size) / 2;
            int compareTo2 = k10.compareTo(this.f15884b.get(i11).f16382a);
            if (compareTo2 < 0) {
                size = i11 - 1;
            } else if (compareTo2 <= 0) {
                return i11;
            } else {
                i10 = i11 + 1;
            }
        }
        return -(i10 + 1);
    }

    /* renamed from: b */
    public final V put(K k10, V v10) {
        f();
        int a10 = a(k10);
        if (a10 >= 0) {
            s90 s90 = this.f15884b.get(a10);
            s90.f16384c.f();
            V v11 = s90.f16383b;
            s90.f16383b = v10;
            return v11;
        }
        f();
        if (this.f15884b.isEmpty() && !(this.f15884b instanceof ArrayList)) {
            this.f15884b = new ArrayList(this.f15883a);
        }
        int i10 = -(a10 + 1);
        if (i10 >= this.f15883a) {
            return g().put(k10, v10);
        }
        int size = this.f15884b.size();
        int i11 = this.f15883a;
        if (size == i11) {
            s90 remove = this.f15884b.remove(i11 - 1);
            g().put(remove.f16382a, remove.f16383b);
        }
        this.f15884b.add(i10, new s90(this, k10, v10));
        return null;
    }

    public void c() {
        Map<K, V> map;
        Map<K, V> map2;
        if (!this.f15886d) {
            if (this.f15885c.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(this.f15885c);
            }
            this.f15885c = map;
            if (this.f15888f.isEmpty()) {
                map2 = Collections.emptyMap();
            } else {
                map2 = Collections.unmodifiableMap(this.f15888f);
            }
            this.f15888f = map2;
            this.f15886d = true;
        }
    }

    public void clear() {
        f();
        if (!this.f15884b.isEmpty()) {
            this.f15884b.clear();
        }
        if (!this.f15885c.isEmpty()) {
            this.f15885c.clear();
        }
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f15885c.containsKey(comparable);
    }

    public final int d() {
        return this.f15884b.size();
    }

    public final Iterable<Map.Entry<K, V>> e() {
        if (this.f15885c.isEmpty()) {
            return r90.f16252b;
        }
        return this.f15885c.entrySet();
    }

    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f15887e == null) {
            this.f15887e = new u90(this, (o90) null);
        }
        return this.f15887e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p90)) {
            return super.equals(obj);
        }
        p90 p90 = (p90) obj;
        int size = size();
        if (size != p90.size()) {
            return false;
        }
        int d10 = d();
        if (d10 != p90.d()) {
            return entrySet().equals(p90.entrySet());
        }
        for (int i10 = 0; i10 < d10; i10++) {
            if (!h(i10).equals(p90.h(i10))) {
                return false;
            }
        }
        if (d10 != size) {
            return this.f15885c.equals(p90.f15885c);
        }
        return true;
    }

    public final void f() {
        if (this.f15886d) {
            throw new UnsupportedOperationException();
        }
    }

    public final SortedMap<K, V> g() {
        f();
        if (this.f15885c.isEmpty() && !(this.f15885c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f15885c = treeMap;
            this.f15888f = treeMap.descendingMap();
        }
        return (SortedMap) this.f15885c;
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a10 = a(comparable);
        if (a10 >= 0) {
            return this.f15884b.get(a10).f16383b;
        }
        return this.f15885c.get(comparable);
    }

    public final Map.Entry<K, V> h(int i10) {
        return this.f15884b.get(i10);
    }

    public int hashCode() {
        int d10 = d();
        int i10 = 0;
        for (int i11 = 0; i11 < d10; i11++) {
            i10 += this.f15884b.get(i11).hashCode();
        }
        return this.f15885c.size() > 0 ? i10 + this.f15885c.hashCode() : i10;
    }

    public final V i(int i10) {
        f();
        V v10 = this.f15884b.remove(i10).f16383b;
        if (!this.f15885c.isEmpty()) {
            Iterator it = g().entrySet().iterator();
            this.f15884b.add(new s90(this, (Map.Entry) it.next()));
            it.remove();
        }
        return v10;
    }

    public V remove(Object obj) {
        f();
        Comparable comparable = (Comparable) obj;
        int a10 = a(comparable);
        if (a10 >= 0) {
            return i(a10);
        }
        if (this.f15885c.isEmpty()) {
            return null;
        }
        return this.f15885c.remove(comparable);
    }

    public int size() {
        return this.f15885c.size() + this.f15884b.size();
    }
}
