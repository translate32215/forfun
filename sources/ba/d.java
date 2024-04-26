package ba;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: AbstractMapBasedMultimap */
public abstract class d<K, V> extends f<K, V> implements Serializable {

    /* renamed from: d  reason: collision with root package name */
    public transient Map<K, Collection<V>> f3691d;

    /* renamed from: e  reason: collision with root package name */
    public transient int f3692e;

    /* compiled from: AbstractMapBasedMultimap */
    public class a extends d<K, V>.c<V> {
        public a(d dVar) {
            super();
        }
    }

    /* compiled from: AbstractMapBasedMultimap */
    public class b extends g0<K, Collection<V>> {

        /* renamed from: c  reason: collision with root package name */
        public final transient Map<K, Collection<V>> f3693c;

        /* compiled from: AbstractMapBasedMultimap */
        public class a extends d0<K, Collection<V>> {
            public a() {
            }

            public boolean contains(Object obj) {
                Set<Map.Entry<K, Collection<V>>> entrySet = b.this.f3693c.entrySet();
                entrySet.getClass();
                try {
                    return entrySet.contains(obj);
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }

            public Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return new C0052b();
            }

            public boolean remove(Object obj) {
                Collection<V> collection;
                if (!contains(obj)) {
                    return false;
                }
                d dVar = d.this;
                Object key = ((Map.Entry) obj).getKey();
                Map<K, Collection<V>> map = dVar.f3691d;
                map.getClass();
                try {
                    collection = map.remove(key);
                } catch (ClassCastException | NullPointerException unused) {
                    collection = null;
                }
                Collection collection2 = collection;
                if (collection2 == null) {
                    return true;
                }
                int size = collection2.size();
                collection2.clear();
                dVar.f3692e -= size;
                return true;
            }
        }

        /* renamed from: ba.d$b$b  reason: collision with other inner class name */
        /* compiled from: AbstractMapBasedMultimap */
        public class C0052b implements Iterator<Map.Entry<K, Collection<V>>> {

            /* renamed from: a  reason: collision with root package name */
            public final Iterator<Map.Entry<K, Collection<V>>> f3696a;
            @NullableDecl

            /* renamed from: b  reason: collision with root package name */
            public Collection<V> f3697b;

            public C0052b() {
                this.f3696a = b.this.f3693c.entrySet().iterator();
            }

            public boolean hasNext() {
                return this.f3696a.hasNext();
            }

            public Object next() {
                Map.Entry next = this.f3696a.next();
                this.f3697b = (Collection) next.getValue();
                return b.this.a(next);
            }

            public void remove() {
                h.c(this.f3697b != null);
                this.f3696a.remove();
                d.this.f3692e -= this.f3697b.size();
                this.f3697b.clear();
                this.f3697b = null;
            }
        }

        public b(Map<K, Collection<V>> map) {
            this.f3693c = map;
        }

        public Map.Entry<K, Collection<V>> a(Map.Entry<K, Collection<V>> entry) {
            K key = entry.getKey();
            c cVar = (c) d.this;
            cVar.getClass();
            List list = (List) entry.getValue();
            return new r(key, list instanceof RandomAccess ? new g(cVar, key, list, (d<K, V>.j) null) : new k(key, list, (d<K, V>.j) null));
        }

        public void clear() {
            Map<K, Collection<V>> map = this.f3693c;
            d dVar = d.this;
            if (map == dVar.f3691d) {
                dVar.clear();
                return;
            }
            Iterator<Map.Entry<K, Collection<V>>> it = this.f3693c.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry next = it.next();
                Collection collection = (Collection) next.getValue();
                a(next);
                h.c(collection != null);
                it.remove();
                d.this.f3692e -= collection.size();
                collection.clear();
            }
        }

        public boolean containsKey(Object obj) {
            Map<K, Collection<V>> map = this.f3693c;
            map.getClass();
            try {
                return map.containsKey(obj);
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }

        public boolean equals(@NullableDecl Object obj) {
            return this == obj || this.f3693c.equals(obj);
        }

        public Object get(Object obj) {
            Collection<V> collection;
            Map<K, Collection<V>> map = this.f3693c;
            map.getClass();
            try {
                collection = map.get(obj);
            } catch (ClassCastException | NullPointerException unused) {
                collection = null;
            }
            Collection collection2 = collection;
            if (collection2 == null) {
                return null;
            }
            c cVar = (c) d.this;
            cVar.getClass();
            List list = (List) collection2;
            return list instanceof RandomAccess ? new g(cVar, obj, list, (d<K, V>.j) null) : new k(obj, list, (d<K, V>.j) null);
        }

        public int hashCode() {
            return this.f3693c.hashCode();
        }

        public Set<K> keySet() {
            d dVar = d.this;
            Set<K> set = dVar.f3724a;
            if (set != null) {
                return set;
            }
            Set<K> d10 = dVar.d();
            dVar.f3724a = d10;
            return d10;
        }

        public Object remove(Object obj) {
            Collection remove = this.f3693c.remove(obj);
            if (remove == null) {
                return null;
            }
            Collection h10 = d.this.h();
            h10.addAll(remove);
            d.this.f3692e -= remove.size();
            remove.clear();
            return h10;
        }

        public int size() {
            return this.f3693c.size();
        }

        public String toString() {
            return this.f3693c.toString();
        }
    }

    /* compiled from: AbstractMapBasedMultimap */
    public abstract class c<T> implements Iterator<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Iterator<Map.Entry<K, Collection<V>>> f3699a;
        @NullableDecl

        /* renamed from: b  reason: collision with root package name */
        public K f3700b = null;
        @MonotonicNonNullDecl

        /* renamed from: c  reason: collision with root package name */
        public Collection<V> f3701c = null;

        /* renamed from: d  reason: collision with root package name */
        public Iterator<V> f3702d = b0.INSTANCE;

        public c() {
            this.f3699a = d.this.f3691d.entrySet().iterator();
        }

        public boolean hasNext() {
            return this.f3699a.hasNext() || this.f3702d.hasNext();
        }

        public T next() {
            if (!this.f3702d.hasNext()) {
                Map.Entry next = this.f3699a.next();
                this.f3700b = next.getKey();
                Collection<V> collection = (Collection) next.getValue();
                this.f3701c = collection;
                this.f3702d = collection.iterator();
            }
            return this.f3702d.next();
        }

        public void remove() {
            this.f3702d.remove();
            if (this.f3701c.isEmpty()) {
                this.f3699a.remove();
            }
            d.g(d.this);
        }
    }

    /* renamed from: ba.d$d  reason: collision with other inner class name */
    /* compiled from: AbstractMapBasedMultimap */
    public class C0053d extends e0<K, Collection<V>> {

        /* renamed from: ba.d$d$a */
        /* compiled from: AbstractMapBasedMultimap */
        public class a implements Iterator<K> {
            @NullableDecl

            /* renamed from: a  reason: collision with root package name */
            public Map.Entry<K, Collection<V>> f3705a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ Iterator f3706b;

            public a(Iterator it) {
                this.f3706b = it;
            }

            public boolean hasNext() {
                return this.f3706b.hasNext();
            }

            public K next() {
                Map.Entry<K, Collection<V>> entry = (Map.Entry) this.f3706b.next();
                this.f3705a = entry;
                return entry.getKey();
            }

            public void remove() {
                h.c(this.f3705a != null);
                Collection value = this.f3705a.getValue();
                this.f3706b.remove();
                d.this.f3692e -= value.size();
                value.clear();
                this.f3705a = null;
            }
        }

        public C0053d(Map<K, Collection<V>> map) {
            super(map);
        }

        public void clear() {
            Iterator it = iterator();
            while (true) {
                a aVar = (a) it;
                if (aVar.hasNext()) {
                    aVar.next();
                    aVar.remove();
                } else {
                    return;
                }
            }
        }

        public boolean containsAll(Collection<?> collection) {
            return this.f3723a.keySet().containsAll(collection);
        }

        public boolean equals(@NullableDecl Object obj) {
            return this == obj || this.f3723a.keySet().equals(obj);
        }

        public int hashCode() {
            return this.f3723a.keySet().hashCode();
        }

        public Iterator<K> iterator() {
            return new a(this.f3723a.entrySet().iterator());
        }

        public boolean remove(Object obj) {
            int i10;
            Collection collection = (Collection) this.f3723a.remove(obj);
            if (collection != null) {
                i10 = collection.size();
                collection.clear();
                d.this.f3692e -= i10;
            } else {
                i10 = 0;
            }
            if (i10 > 0) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: AbstractMapBasedMultimap */
    public class e extends d<K, V>.h implements NavigableMap<K, Collection<V>> {
        public e(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        public SortedSet b() {
            return new f(d());
        }

        public Map.Entry<K, Collection<V>> ceilingEntry(K k10) {
            Map.Entry ceilingEntry = d().ceilingEntry(k10);
            if (ceilingEntry == null) {
                return null;
            }
            return a(ceilingEntry);
        }

        public K ceilingKey(K k10) {
            return d().ceilingKey(k10);
        }

        public NavigableSet<K> descendingKeySet() {
            return ((e) descendingMap()).navigableKeySet();
        }

        public NavigableMap<K, Collection<V>> descendingMap() {
            return new e(d().descendingMap());
        }

        /* renamed from: e */
        public NavigableSet<K> keySet() {
            SortedSet<K> sortedSet = this.f3710e;
            if (sortedSet == null) {
                sortedSet = b();
                this.f3710e = sortedSet;
            }
            return (NavigableSet) sortedSet;
        }

        public Map.Entry<K, Collection<V>> f(Iterator<Map.Entry<K, Collection<V>>> it) {
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry next = it.next();
            Collection h10 = d.this.h();
            h10.addAll((Collection) next.getValue());
            it.remove();
            Object key = next.getKey();
            ((c) d.this).getClass();
            return new r(key, Collections.unmodifiableList((List) h10));
        }

        public Map.Entry<K, Collection<V>> firstEntry() {
            Map.Entry firstEntry = d().firstEntry();
            if (firstEntry == null) {
                return null;
            }
            return a(firstEntry);
        }

        public Map.Entry<K, Collection<V>> floorEntry(K k10) {
            Map.Entry floorEntry = d().floorEntry(k10);
            if (floorEntry == null) {
                return null;
            }
            return a(floorEntry);
        }

        public K floorKey(K k10) {
            return d().floorKey(k10);
        }

        /* renamed from: g */
        public NavigableMap<K, Collection<V>> d() {
            return (NavigableMap) ((SortedMap) this.f3693c);
        }

        public SortedMap headMap(Object obj) {
            return headMap(obj, false);
        }

        public Map.Entry<K, Collection<V>> higherEntry(K k10) {
            Map.Entry higherEntry = d().higherEntry(k10);
            if (higherEntry == null) {
                return null;
            }
            return a(higherEntry);
        }

        public K higherKey(K k10) {
            return d().higherKey(k10);
        }

        public Map.Entry<K, Collection<V>> lastEntry() {
            Map.Entry lastEntry = d().lastEntry();
            if (lastEntry == null) {
                return null;
            }
            return a(lastEntry);
        }

        public Map.Entry<K, Collection<V>> lowerEntry(K k10) {
            Map.Entry lowerEntry = d().lowerEntry(k10);
            if (lowerEntry == null) {
                return null;
            }
            return a(lowerEntry);
        }

        public K lowerKey(K k10) {
            return d().lowerKey(k10);
        }

        public NavigableSet<K> navigableKeySet() {
            return keySet();
        }

        public Map.Entry<K, Collection<V>> pollFirstEntry() {
            return f(entrySet().iterator());
        }

        public Map.Entry<K, Collection<V>> pollLastEntry() {
            return f(((g0) descendingMap()).entrySet().iterator());
        }

        public SortedMap subMap(Object obj, Object obj2) {
            return subMap(obj, true, obj2, false);
        }

        public SortedMap tailMap(Object obj) {
            return tailMap(obj, true);
        }

        public NavigableMap<K, Collection<V>> headMap(K k10, boolean z10) {
            return new e(d().headMap(k10, z10));
        }

        public NavigableMap<K, Collection<V>> subMap(K k10, boolean z10, K k11, boolean z11) {
            return new e(d().subMap(k10, z10, k11, z11));
        }

        public NavigableMap<K, Collection<V>> tailMap(K k10, boolean z10) {
            return new e(d().tailMap(k10, z10));
        }
    }

    /* compiled from: AbstractMapBasedMultimap */
    public class f extends d<K, V>.i implements NavigableSet<K> {
        public f(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        public K ceiling(K k10) {
            return c().ceilingKey(k10);
        }

        public Iterator<K> descendingIterator() {
            return ((C0053d) descendingSet()).iterator();
        }

        public NavigableSet<K> descendingSet() {
            return new f(c().descendingMap());
        }

        /* renamed from: f */
        public NavigableMap<K, Collection<V>> c() {
            return (NavigableMap) ((SortedMap) this.f3723a);
        }

        public K floor(K k10) {
            return c().floorKey(k10);
        }

        public SortedSet headSet(Object obj) {
            return headSet(obj, false);
        }

        public K higher(K k10) {
            return c().higherKey(k10);
        }

        public K lower(K k10) {
            return c().lowerKey(k10);
        }

        public K pollFirst() {
            C0053d.a aVar = (C0053d.a) iterator();
            if (!aVar.hasNext()) {
                return null;
            }
            K next = aVar.next();
            aVar.remove();
            return next;
        }

        public K pollLast() {
            Iterator descendingIterator = descendingIterator();
            if (!descendingIterator.hasNext()) {
                return null;
            }
            K next = descendingIterator.next();
            descendingIterator.remove();
            return next;
        }

        public SortedSet subSet(Object obj, Object obj2) {
            return subSet(obj, true, obj2, false);
        }

        public SortedSet tailSet(Object obj) {
            return tailSet(obj, true);
        }

        public NavigableSet<K> headSet(K k10, boolean z10) {
            return new f(c().headMap(k10, z10));
        }

        public NavigableSet<K> subSet(K k10, boolean z10, K k11, boolean z11) {
            return new f(c().subMap(k10, z10, k11, z11));
        }

        public NavigableSet<K> tailSet(K k10, boolean z10) {
            return new f(c().tailMap(k10, z10));
        }
    }

    /* compiled from: AbstractMapBasedMultimap */
    public class g extends d<K, V>.k implements RandomAccess {
        public g(@NullableDecl d dVar, K k10, @NullableDecl List<V> list, d<K, V>.j jVar) {
            super(k10, list, jVar);
        }
    }

    /* compiled from: AbstractMapBasedMultimap */
    public class h extends d<K, V>.b implements SortedMap<K, Collection<V>> {
        @MonotonicNonNullDecl

        /* renamed from: e  reason: collision with root package name */
        public SortedSet<K> f3710e;

        public h(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        public SortedSet<K> b() {
            return new i(d());
        }

        /* renamed from: c */
        public SortedSet<K> keySet() {
            SortedSet<K> sortedSet = this.f3710e;
            if (sortedSet != null) {
                return sortedSet;
            }
            SortedSet<K> b10 = b();
            this.f3710e = b10;
            return b10;
        }

        public Comparator<? super K> comparator() {
            return d().comparator();
        }

        public SortedMap<K, Collection<V>> d() {
            return (SortedMap) this.f3693c;
        }

        public K firstKey() {
            return d().firstKey();
        }

        public SortedMap<K, Collection<V>> headMap(K k10) {
            return new h(d().headMap(k10));
        }

        public K lastKey() {
            return d().lastKey();
        }

        public SortedMap<K, Collection<V>> subMap(K k10, K k11) {
            return new h(d().subMap(k10, k11));
        }

        public SortedMap<K, Collection<V>> tailMap(K k10) {
            return new h(d().tailMap(k10));
        }
    }

    /* compiled from: AbstractMapBasedMultimap */
    public class i extends d<K, V>.d implements SortedSet<K> {
        public i(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        public SortedMap<K, Collection<V>> c() {
            return (SortedMap) this.f3723a;
        }

        public Comparator<? super K> comparator() {
            return c().comparator();
        }

        public K first() {
            return c().firstKey();
        }

        public SortedSet<K> headSet(K k10) {
            return new i(c().headMap(k10));
        }

        public K last() {
            return c().lastKey();
        }

        public SortedSet<K> subSet(K k10, K k11) {
            return new i(c().subMap(k10, k11));
        }

        public SortedSet<K> tailSet(K k10) {
            return new i(c().tailMap(k10));
        }
    }

    public d(Map<K, Collection<V>> map) {
        if (map.isEmpty()) {
            this.f3691d = map;
            return;
        }
        throw new IllegalArgumentException();
    }

    public static /* synthetic */ int f(d dVar) {
        int i10 = dVar.f3692e;
        dVar.f3692e = i10 + 1;
        return i10;
    }

    public static /* synthetic */ int g(d dVar) {
        int i10 = dVar.f3692e;
        dVar.f3692e = i10 - 1;
        return i10;
    }

    public void clear() {
        for (Collection<V> clear : this.f3691d.values()) {
            clear.clear();
        }
        this.f3691d.clear();
        this.f3692e = 0;
    }

    public Iterator<V> e() {
        return new a(this);
    }

    public abstract Collection<V> h();

    public int size() {
        return this.f3692e;
    }

    /* compiled from: AbstractMapBasedMultimap */
    public class k extends d<K, V>.j implements List<V> {

        /* compiled from: AbstractMapBasedMultimap */
        public class a extends d<K, V>.j.a implements ListIterator<V> {
            public a() {
                super();
            }

            public void add(V v10) {
                boolean isEmpty = k.this.isEmpty();
                b().add(v10);
                d.f(d.this);
                if (isEmpty) {
                    k.this.c();
                }
            }

            /* JADX WARNING: type inference failed for: r1v0, types: [ba.d$k$a, ba.d$j$a] */
            public final ListIterator<V> b() {
                a();
                return (ListIterator) this.f3718a;
            }

            public boolean hasPrevious() {
                return b().hasPrevious();
            }

            public int nextIndex() {
                return b().nextIndex();
            }

            public V previous() {
                return b().previous();
            }

            public int previousIndex() {
                return b().previousIndex();
            }

            public void set(V v10) {
                b().set(v10);
            }

            public a(int i10) {
                super(((List) k.this.f3714b).listIterator(i10));
            }
        }

        public k(@NullableDecl K k10, List<V> list, @NullableDecl d<K, V>.j jVar) {
            super(k10, list, jVar);
        }

        public void add(int i10, V v10) {
            f();
            boolean isEmpty = this.f3714b.isEmpty();
            ((List) this.f3714b).add(i10, v10);
            d.f(d.this);
            if (isEmpty) {
                c();
            }
        }

        public boolean addAll(int i10, Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = ((List) this.f3714b).addAll(i10, collection);
            if (addAll) {
                int size2 = this.f3714b.size();
                d dVar = d.this;
                dVar.f3692e = (size2 - size) + dVar.f3692e;
                if (size == 0) {
                    c();
                }
            }
            return addAll;
        }

        public V get(int i10) {
            f();
            return ((List) this.f3714b).get(i10);
        }

        public int indexOf(Object obj) {
            f();
            return ((List) this.f3714b).indexOf(obj);
        }

        public int lastIndexOf(Object obj) {
            f();
            return ((List) this.f3714b).lastIndexOf(obj);
        }

        public ListIterator<V> listIterator() {
            f();
            return new a();
        }

        public V remove(int i10) {
            f();
            V remove = ((List) this.f3714b).remove(i10);
            d.g(d.this);
            h();
            return remove;
        }

        public V set(int i10, V v10) {
            f();
            return ((List) this.f3714b).set(i10, v10);
        }

        public List<V> subList(int i10, int i11) {
            f();
            d dVar = d.this;
            K k10 = this.f3713a;
            List subList = ((List) this.f3714b).subList(i10, i11);
            d<K, V>.j jVar = this.f3715c;
            if (jVar == null) {
                jVar = this;
            }
            dVar.getClass();
            return subList instanceof RandomAccess ? new g(dVar, k10, subList, jVar) : new k(k10, subList, jVar);
        }

        public ListIterator<V> listIterator(int i10) {
            f();
            return new a(i10);
        }
    }

    /* compiled from: AbstractMapBasedMultimap */
    public class j extends AbstractCollection<V> {
        @NullableDecl

        /* renamed from: a  reason: collision with root package name */
        public final K f3713a;

        /* renamed from: b  reason: collision with root package name */
        public Collection<V> f3714b;
        @NullableDecl

        /* renamed from: c  reason: collision with root package name */
        public final d<K, V>.j f3715c;
        @NullableDecl

        /* renamed from: d  reason: collision with root package name */
        public final Collection<V> f3716d;

        public j(@NullableDecl K k10, Collection<V> collection, @NullableDecl d<K, V>.j jVar) {
            Collection<V> collection2;
            this.f3713a = k10;
            this.f3714b = collection;
            this.f3715c = jVar;
            if (jVar == null) {
                collection2 = null;
            } else {
                collection2 = jVar.f3714b;
            }
            this.f3716d = collection2;
        }

        public boolean add(V v10) {
            f();
            boolean isEmpty = this.f3714b.isEmpty();
            boolean add = this.f3714b.add(v10);
            if (add) {
                d.f(d.this);
                if (isEmpty) {
                    c();
                }
            }
            return add;
        }

        public boolean addAll(Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = this.f3714b.addAll(collection);
            if (addAll) {
                int size2 = this.f3714b.size();
                d dVar = d.this;
                dVar.f3692e = (size2 - size) + dVar.f3692e;
                if (size == 0) {
                    c();
                }
            }
            return addAll;
        }

        public void c() {
            d<K, V>.j jVar = this.f3715c;
            if (jVar != null) {
                jVar.c();
            } else {
                d.this.f3691d.put(this.f3713a, this.f3714b);
            }
        }

        public void clear() {
            int size = size();
            if (size != 0) {
                this.f3714b.clear();
                d.this.f3692e -= size;
                h();
            }
        }

        public boolean contains(Object obj) {
            f();
            return this.f3714b.contains(obj);
        }

        public boolean containsAll(Collection<?> collection) {
            f();
            return this.f3714b.containsAll(collection);
        }

        public boolean equals(@NullableDecl Object obj) {
            if (obj == this) {
                return true;
            }
            f();
            return this.f3714b.equals(obj);
        }

        public void f() {
            Collection<V> collection;
            d<K, V>.j jVar = this.f3715c;
            if (jVar != null) {
                jVar.f();
                if (this.f3715c.f3714b != this.f3716d) {
                    throw new ConcurrentModificationException();
                }
            } else if (this.f3714b.isEmpty() && (collection = d.this.f3691d.get(this.f3713a)) != null) {
                this.f3714b = collection;
            }
        }

        public void h() {
            d<K, V>.j jVar = this.f3715c;
            if (jVar != null) {
                jVar.h();
            } else if (this.f3714b.isEmpty()) {
                d.this.f3691d.remove(this.f3713a);
            }
        }

        public int hashCode() {
            f();
            return this.f3714b.hashCode();
        }

        public Iterator<V> iterator() {
            f();
            return new a();
        }

        public boolean remove(Object obj) {
            f();
            boolean remove = this.f3714b.remove(obj);
            if (remove) {
                d.g(d.this);
                h();
            }
            return remove;
        }

        public boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean removeAll = this.f3714b.removeAll(collection);
            if (removeAll) {
                int size2 = this.f3714b.size();
                d dVar = d.this;
                dVar.f3692e = (size2 - size) + dVar.f3692e;
                h();
            }
            return removeAll;
        }

        public boolean retainAll(Collection<?> collection) {
            collection.getClass();
            int size = size();
            boolean retainAll = this.f3714b.retainAll(collection);
            if (retainAll) {
                int size2 = this.f3714b.size();
                d dVar = d.this;
                dVar.f3692e = (size2 - size) + dVar.f3692e;
                h();
            }
            return retainAll;
        }

        public int size() {
            f();
            return this.f3714b.size();
        }

        public String toString() {
            f();
            return this.f3714b.toString();
        }

        /* compiled from: AbstractMapBasedMultimap */
        public class a implements Iterator<V> {

            /* renamed from: a  reason: collision with root package name */
            public final Iterator<V> f3718a;

            /* renamed from: b  reason: collision with root package name */
            public final Collection<V> f3719b;

            public a() {
                Iterator<V> it;
                Collection<V> collection = j.this.f3714b;
                this.f3719b = collection;
                if (collection instanceof List) {
                    it = ((List) collection).listIterator();
                } else {
                    it = collection.iterator();
                }
                this.f3718a = it;
            }

            public void a() {
                j.this.f();
                if (j.this.f3714b != this.f3719b) {
                    throw new ConcurrentModificationException();
                }
            }

            public boolean hasNext() {
                a();
                return this.f3718a.hasNext();
            }

            public V next() {
                a();
                return this.f3718a.next();
            }

            public void remove() {
                this.f3718a.remove();
                d.g(d.this);
                j.this.h();
            }

            public a(Iterator<V> it) {
                this.f3719b = j.this.f3714b;
                this.f3718a = it;
            }
        }
    }
}
