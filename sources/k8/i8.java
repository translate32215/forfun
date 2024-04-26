package k8;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.2 */
public class i8<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: g  reason: collision with root package name */
    public static final /* synthetic */ int f20260g = 0;

    /* renamed from: a  reason: collision with root package name */
    public final int f20261a;

    /* renamed from: b  reason: collision with root package name */
    public List<e8> f20262b = Collections.emptyList();

    /* renamed from: c  reason: collision with root package name */
    public Map<K, V> f20263c = Collections.emptyMap();

    /* renamed from: d  reason: collision with root package name */
    public boolean f20264d;

    /* renamed from: e  reason: collision with root package name */
    public volatile h8 f20265e;

    /* renamed from: f  reason: collision with root package name */
    public Map<K, V> f20266f = Collections.emptyMap();

    public /* synthetic */ i8(int i10) {
        this.f20261a = i10;
    }

    public void a() {
        Map<K, V> map;
        Map<K, V> map2;
        if (!this.f20264d) {
            if (this.f20263c.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(this.f20263c);
            }
            this.f20263c = map;
            if (this.f20266f.isEmpty()) {
                map2 = Collections.emptyMap();
            } else {
                map2 = Collections.unmodifiableMap(this.f20266f);
            }
            this.f20266f = map2;
            this.f20264d = true;
        }
    }

    public final int b() {
        return this.f20262b.size();
    }

    /* renamed from: c */
    public final V put(K k10, V v10) {
        h();
        int e10 = e(k10);
        if (e10 >= 0) {
            e8 e8Var = this.f20262b.get(e10);
            e8Var.f20191c.h();
            V v11 = e8Var.f20190b;
            e8Var.f20190b = v10;
            return v11;
        }
        h();
        if (this.f20262b.isEmpty() && !(this.f20262b instanceof ArrayList)) {
            this.f20262b = new ArrayList(this.f20261a);
        }
        int i10 = -(e10 + 1);
        if (i10 >= this.f20261a) {
            return g().put(k10, v10);
        }
        int size = this.f20262b.size();
        int i11 = this.f20261a;
        if (size == i11) {
            e8 remove = this.f20262b.remove(i11 - 1);
            g().put(remove.f20189a, remove.f20190b);
        }
        this.f20262b.add(i10, new e8(this, k10, v10));
        return null;
    }

    public final void clear() {
        h();
        if (!this.f20262b.isEmpty()) {
            this.f20262b.clear();
        }
        if (!this.f20263c.isEmpty()) {
            this.f20263c.clear();
        }
    }

    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return e(comparable) >= 0 || this.f20263c.containsKey(comparable);
    }

    public final Map.Entry<K, V> d(int i10) {
        return this.f20262b.get(i10);
    }

    public final int e(K k10) {
        int size = this.f20262b.size() - 1;
        int i10 = 0;
        if (size >= 0) {
            int compareTo = k10.compareTo(this.f20262b.get(size).f20189a);
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        while (i10 <= size) {
            int i11 = (i10 + size) / 2;
            int compareTo2 = k10.compareTo(this.f20262b.get(i11).f20189a);
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

    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.f20265e == null) {
            this.f20265e = new h8(this);
        }
        return this.f20265e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i8)) {
            return super.equals(obj);
        }
        i8 i8Var = (i8) obj;
        int size = size();
        if (size != i8Var.size()) {
            return false;
        }
        int b10 = b();
        if (b10 == i8Var.b()) {
            for (int i10 = 0; i10 < b10; i10++) {
                if (!d(i10).equals(i8Var.d(i10))) {
                    return false;
                }
            }
            if (b10 != size) {
                return this.f20263c.equals(i8Var.f20263c);
            }
            return true;
        }
        return ((AbstractSet) entrySet()).equals(i8Var.entrySet());
    }

    public final V f(int i10) {
        h();
        V v10 = this.f20262b.remove(i10).f20190b;
        if (!this.f20263c.isEmpty()) {
            Iterator it = g().entrySet().iterator();
            List<e8> list = this.f20262b;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new e8(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return v10;
    }

    public final SortedMap<K, V> g() {
        h();
        if (this.f20263c.isEmpty() && !(this.f20263c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f20263c = treeMap;
            this.f20266f = treeMap.descendingMap();
        }
        return (SortedMap) this.f20263c;
    }

    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int e10 = e(comparable);
        if (e10 >= 0) {
            return this.f20262b.get(e10).f20190b;
        }
        return this.f20263c.get(comparable);
    }

    public final void h() {
        if (this.f20264d) {
            throw new UnsupportedOperationException();
        }
    }

    public final int hashCode() {
        int b10 = b();
        int i10 = 0;
        for (int i11 = 0; i11 < b10; i11++) {
            i10 += this.f20262b.get(i11).hashCode();
        }
        return this.f20263c.size() > 0 ? this.f20263c.hashCode() + i10 : i10;
    }

    public final V remove(Object obj) {
        h();
        Comparable comparable = (Comparable) obj;
        int e10 = e(comparable);
        if (e10 >= 0) {
            return f(e10);
        }
        if (this.f20263c.isEmpty()) {
            return null;
        }
        return this.f20263c.remove(comparable);
    }

    public final int size() {
        return this.f20263c.size() + this.f20262b.size();
    }
}
