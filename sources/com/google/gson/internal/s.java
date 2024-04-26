package com.google.gson.internal;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: LinkedTreeMap */
public final class s<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: h  reason: collision with root package name */
    public static final Comparator<Comparable> f9961h = new a();

    /* renamed from: a  reason: collision with root package name */
    public Comparator<? super K> f9962a;

    /* renamed from: b  reason: collision with root package name */
    public e<K, V> f9963b;

    /* renamed from: c  reason: collision with root package name */
    public int f9964c = 0;

    /* renamed from: d  reason: collision with root package name */
    public int f9965d = 0;

    /* renamed from: e  reason: collision with root package name */
    public final e<K, V> f9966e = new e<>();

    /* renamed from: f  reason: collision with root package name */
    public s<K, V>.b f9967f;

    /* renamed from: g  reason: collision with root package name */
    public s<K, V>.c f9968g;

    /* compiled from: LinkedTreeMap */
    public static class a implements Comparator<Comparable> {
        public int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo((Comparable) obj2);
        }
    }

    /* compiled from: LinkedTreeMap */
    public class b extends AbstractSet<Map.Entry<K, V>> {

        /* compiled from: LinkedTreeMap */
        public class a extends s<K, V>.d<Map.Entry<K, V>> {
            public a(b bVar) {
                super();
            }

            public Object next() {
                return a();
            }
        }

        public b() {
        }

        public void clear() {
            s.this.clear();
        }

        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && s.this.b((Map.Entry) obj) != null;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new a(this);
        }

        public boolean remove(Object obj) {
            e b10;
            if (!(obj instanceof Map.Entry) || (b10 = s.this.b((Map.Entry) obj)) == null) {
                return false;
            }
            s.this.e(b10, true);
            return true;
        }

        public int size() {
            return s.this.f9964c;
        }
    }

    /* compiled from: LinkedTreeMap */
    public final class c extends AbstractSet<K> {

        /* compiled from: LinkedTreeMap */
        public class a extends s<K, V>.d<K> {
            public a(c cVar) {
                super();
            }

            public K next() {
                return a().f9980f;
            }
        }

        public c() {
        }

        public void clear() {
            s.this.clear();
        }

        public boolean contains(Object obj) {
            return s.this.c(obj) != null;
        }

        public Iterator<K> iterator() {
            return new a(this);
        }

        public boolean remove(Object obj) {
            s sVar = s.this;
            e c10 = sVar.c(obj);
            if (c10 != null) {
                sVar.e(c10, true);
            }
            if (c10 != null) {
                return true;
            }
            return false;
        }

        public int size() {
            return s.this.f9964c;
        }
    }

    /* compiled from: LinkedTreeMap */
    public abstract class d<T> implements Iterator<T> {

        /* renamed from: a  reason: collision with root package name */
        public e<K, V> f9971a;

        /* renamed from: b  reason: collision with root package name */
        public e<K, V> f9972b = null;

        /* renamed from: c  reason: collision with root package name */
        public int f9973c;

        public d() {
            this.f9971a = s.this.f9966e.f9978d;
            this.f9973c = s.this.f9965d;
        }

        public final e<K, V> a() {
            e<K, V> eVar = this.f9971a;
            s sVar = s.this;
            if (eVar == sVar.f9966e) {
                throw new NoSuchElementException();
            } else if (sVar.f9965d == this.f9973c) {
                this.f9971a = eVar.f9978d;
                this.f9972b = eVar;
                return eVar;
            } else {
                throw new ConcurrentModificationException();
            }
        }

        public final boolean hasNext() {
            return this.f9971a != s.this.f9966e;
        }

        public final void remove() {
            e<K, V> eVar = this.f9972b;
            if (eVar != null) {
                s.this.e(eVar, true);
                this.f9972b = null;
                this.f9973c = s.this.f9965d;
                return;
            }
            throw new IllegalStateException();
        }
    }

    static {
        Class<s> cls = s.class;
    }

    public s() {
        Comparator<Comparable> comparator = f9961h;
        this.f9962a = comparator;
    }

    public e<K, V> a(K k10, boolean z10) {
        int i10;
        e<K, V> eVar;
        Comparator<? super K> comparator = this.f9962a;
        e<K, V> eVar2 = this.f9963b;
        if (eVar2 != null) {
            Comparable comparable = comparator == f9961h ? (Comparable) k10 : null;
            while (true) {
                if (comparable != null) {
                    i10 = comparable.compareTo(eVar2.f9980f);
                } else {
                    i10 = comparator.compare(k10, eVar2.f9980f);
                }
                if (i10 == 0) {
                    return eVar2;
                }
                e<K, V> eVar3 = i10 < 0 ? eVar2.f9976b : eVar2.f9977c;
                if (eVar3 == null) {
                    break;
                }
                eVar2 = eVar3;
            }
        } else {
            i10 = 0;
        }
        if (!z10) {
            return null;
        }
        e<K, V> eVar4 = this.f9966e;
        if (eVar2 != null) {
            eVar = new e<>(eVar2, k10, eVar4, eVar4.f9979e);
            if (i10 < 0) {
                eVar2.f9976b = eVar;
            } else {
                eVar2.f9977c = eVar;
            }
            d(eVar2, true);
        } else if (comparator != f9961h || (k10 instanceof Comparable)) {
            eVar = new e<>(eVar2, k10, eVar4, eVar4.f9979e);
            this.f9963b = eVar;
        } else {
            throw new ClassCastException(k10.getClass().getName() + " is not Comparable");
        }
        this.f9964c++;
        this.f9965d++;
        return eVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        if ((r3 == r5 || (r3 != null && r3.equals(r5))) != false) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.gson.internal.s.e<K, V> b(java.util.Map.Entry<?, ?> r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r5.getKey()
            com.google.gson.internal.s$e r0 = r4.c(r0)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0023
            V r3 = r0.f9981g
            java.lang.Object r5 = r5.getValue()
            if (r3 == r5) goto L_0x001f
            if (r3 == 0) goto L_0x001d
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r5 = 0
            goto L_0x0020
        L_0x001f:
            r5 = 1
        L_0x0020:
            if (r5 == 0) goto L_0x0023
            goto L_0x0024
        L_0x0023:
            r1 = 0
        L_0x0024:
            if (r1 == 0) goto L_0x0027
            goto L_0x0028
        L_0x0027:
            r0 = 0
        L_0x0028:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.s.b(java.util.Map$Entry):com.google.gson.internal.s$e");
    }

    public e<K, V> c(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return a(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    public void clear() {
        this.f9963b = null;
        this.f9964c = 0;
        this.f9965d++;
        e<K, V> eVar = this.f9966e;
        eVar.f9979e = eVar;
        eVar.f9978d = eVar;
    }

    public boolean containsKey(Object obj) {
        return c(obj) != null;
    }

    public final void d(e<K, V> eVar, boolean z10) {
        while (eVar != null) {
            e<K, V> eVar2 = eVar.f9976b;
            e<K, V> eVar3 = eVar.f9977c;
            int i10 = 0;
            int i11 = eVar2 != null ? eVar2.f9982h : 0;
            int i12 = eVar3 != null ? eVar3.f9982h : 0;
            int i13 = i11 - i12;
            if (i13 == -2) {
                e<K, V> eVar4 = eVar3.f9976b;
                e<K, V> eVar5 = eVar3.f9977c;
                int i14 = eVar5 != null ? eVar5.f9982h : 0;
                if (eVar4 != null) {
                    i10 = eVar4.f9982h;
                }
                int i15 = i10 - i14;
                if (i15 == -1 || (i15 == 0 && !z10)) {
                    g(eVar);
                } else {
                    h(eVar3);
                    g(eVar);
                }
                if (z10) {
                    return;
                }
            } else if (i13 == 2) {
                e<K, V> eVar6 = eVar2.f9976b;
                e<K, V> eVar7 = eVar2.f9977c;
                int i16 = eVar7 != null ? eVar7.f9982h : 0;
                if (eVar6 != null) {
                    i10 = eVar6.f9982h;
                }
                int i17 = i10 - i16;
                if (i17 == 1 || (i17 == 0 && !z10)) {
                    h(eVar);
                } else {
                    g(eVar2);
                    h(eVar);
                }
                if (z10) {
                    return;
                }
            } else if (i13 == 0) {
                eVar.f9982h = i11 + 1;
                if (z10) {
                    return;
                }
            } else {
                eVar.f9982h = Math.max(i11, i12) + 1;
                if (!z10) {
                    return;
                }
            }
            eVar = eVar.f9975a;
        }
    }

    public void e(e<K, V> eVar, boolean z10) {
        e<K, V> eVar2;
        int i10;
        e<K, V> eVar3;
        if (z10) {
            e<K, V> eVar4 = eVar.f9979e;
            eVar4.f9978d = eVar.f9978d;
            eVar.f9978d.f9979e = eVar4;
        }
        e<K, V> eVar5 = eVar.f9976b;
        e<K, V> eVar6 = eVar.f9977c;
        e<K, V> eVar7 = eVar.f9975a;
        int i11 = 0;
        if (eVar5 == null || eVar6 == null) {
            if (eVar5 != null) {
                f(eVar, eVar5);
                eVar.f9976b = null;
            } else if (eVar6 != null) {
                f(eVar, eVar6);
                eVar.f9977c = null;
            } else {
                f(eVar, (e<K, V>) null);
            }
            d(eVar7, false);
            this.f9964c--;
            this.f9965d++;
            return;
        }
        if (eVar5.f9982h > eVar6.f9982h) {
            e<K, V> eVar8 = eVar5.f9977c;
            while (true) {
                e<K, V> eVar9 = eVar8;
                eVar2 = eVar5;
                eVar5 = eVar9;
                if (eVar5 == null) {
                    break;
                }
                eVar8 = eVar5.f9977c;
            }
        } else {
            e<K, V> eVar10 = eVar6.f9976b;
            while (true) {
                e<K, V> eVar11 = eVar6;
                eVar6 = eVar10;
                eVar3 = eVar11;
                if (eVar6 == null) {
                    break;
                }
                eVar10 = eVar6.f9976b;
            }
            eVar2 = eVar3;
        }
        e(eVar2, false);
        e<K, V> eVar12 = eVar.f9976b;
        if (eVar12 != null) {
            i10 = eVar12.f9982h;
            eVar2.f9976b = eVar12;
            eVar12.f9975a = eVar2;
            eVar.f9976b = null;
        } else {
            i10 = 0;
        }
        e<K, V> eVar13 = eVar.f9977c;
        if (eVar13 != null) {
            i11 = eVar13.f9982h;
            eVar2.f9977c = eVar13;
            eVar13.f9975a = eVar2;
            eVar.f9977c = null;
        }
        eVar2.f9982h = Math.max(i10, i11) + 1;
        f(eVar, eVar2);
    }

    public Set<Map.Entry<K, V>> entrySet() {
        s<K, V>.b bVar = this.f9967f;
        if (bVar != null) {
            return bVar;
        }
        s<K, V>.b bVar2 = new b();
        this.f9967f = bVar2;
        return bVar2;
    }

    public final void f(e<K, V> eVar, e<K, V> eVar2) {
        e<K, V> eVar3 = eVar.f9975a;
        eVar.f9975a = null;
        if (eVar2 != null) {
            eVar2.f9975a = eVar3;
        }
        if (eVar3 == null) {
            this.f9963b = eVar2;
        } else if (eVar3.f9976b == eVar) {
            eVar3.f9976b = eVar2;
        } else {
            eVar3.f9977c = eVar2;
        }
    }

    public final void g(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f9976b;
        e<K, V> eVar3 = eVar.f9977c;
        e<K, V> eVar4 = eVar3.f9976b;
        e<K, V> eVar5 = eVar3.f9977c;
        eVar.f9977c = eVar4;
        if (eVar4 != null) {
            eVar4.f9975a = eVar;
        }
        f(eVar, eVar3);
        eVar3.f9976b = eVar;
        eVar.f9975a = eVar3;
        int i10 = 0;
        int max = Math.max(eVar2 != null ? eVar2.f9982h : 0, eVar4 != null ? eVar4.f9982h : 0) + 1;
        eVar.f9982h = max;
        if (eVar5 != null) {
            i10 = eVar5.f9982h;
        }
        eVar3.f9982h = Math.max(max, i10) + 1;
    }

    public V get(Object obj) {
        e c10 = c(obj);
        if (c10 != null) {
            return c10.f9981g;
        }
        return null;
    }

    public final void h(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f9976b;
        e<K, V> eVar3 = eVar.f9977c;
        e<K, V> eVar4 = eVar2.f9976b;
        e<K, V> eVar5 = eVar2.f9977c;
        eVar.f9976b = eVar5;
        if (eVar5 != null) {
            eVar5.f9975a = eVar;
        }
        f(eVar, eVar2);
        eVar2.f9977c = eVar;
        eVar.f9975a = eVar2;
        int i10 = 0;
        int max = Math.max(eVar3 != null ? eVar3.f9982h : 0, eVar5 != null ? eVar5.f9982h : 0) + 1;
        eVar.f9982h = max;
        if (eVar4 != null) {
            i10 = eVar4.f9982h;
        }
        eVar2.f9982h = Math.max(max, i10) + 1;
    }

    public Set<K> keySet() {
        s<K, V>.c cVar = this.f9968g;
        if (cVar != null) {
            return cVar;
        }
        s<K, V>.c cVar2 = new c();
        this.f9968g = cVar2;
        return cVar2;
    }

    public V put(K k10, V v10) {
        if (k10 != null) {
            e a10 = a(k10, true);
            V v11 = a10.f9981g;
            a10.f9981g = v10;
            return v11;
        }
        throw new NullPointerException("key == null");
    }

    public V remove(Object obj) {
        e c10 = c(obj);
        if (c10 != null) {
            e(c10, true);
        }
        if (c10 != null) {
            return c10.f9981g;
        }
        return null;
    }

    public int size() {
        return this.f9964c;
    }

    /* compiled from: LinkedTreeMap */
    public static final class e<K, V> implements Map.Entry<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public e<K, V> f9975a;

        /* renamed from: b  reason: collision with root package name */
        public e<K, V> f9976b;

        /* renamed from: c  reason: collision with root package name */
        public e<K, V> f9977c;

        /* renamed from: d  reason: collision with root package name */
        public e<K, V> f9978d;

        /* renamed from: e  reason: collision with root package name */
        public e<K, V> f9979e;

        /* renamed from: f  reason: collision with root package name */
        public final K f9980f;

        /* renamed from: g  reason: collision with root package name */
        public V f9981g;

        /* renamed from: h  reason: collision with root package name */
        public int f9982h;

        public e() {
            this.f9980f = null;
            this.f9979e = this;
            this.f9978d = this;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0031 A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r4) {
            /*
                r3 = this;
                boolean r0 = r4 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 == 0) goto L_0x0032
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                K r0 = r3.f9980f
                if (r0 != 0) goto L_0x0012
                java.lang.Object r0 = r4.getKey()
                if (r0 != 0) goto L_0x0032
                goto L_0x001c
            L_0x0012:
                java.lang.Object r2 = r4.getKey()
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x0032
            L_0x001c:
                V r0 = r3.f9981g
                if (r0 != 0) goto L_0x0027
                java.lang.Object r4 = r4.getValue()
                if (r4 != 0) goto L_0x0032
                goto L_0x0031
            L_0x0027:
                java.lang.Object r4 = r4.getValue()
                boolean r4 = r0.equals(r4)
                if (r4 == 0) goto L_0x0032
            L_0x0031:
                r1 = 1
            L_0x0032:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.s.e.equals(java.lang.Object):boolean");
        }

        public K getKey() {
            return this.f9980f;
        }

        public V getValue() {
            return this.f9981g;
        }

        public int hashCode() {
            K k10 = this.f9980f;
            int i10 = 0;
            int hashCode = k10 == null ? 0 : k10.hashCode();
            V v10 = this.f9981g;
            if (v10 != null) {
                i10 = v10.hashCode();
            }
            return hashCode ^ i10;
        }

        public V setValue(V v10) {
            V v11 = this.f9981g;
            this.f9981g = v10;
            return v11;
        }

        public String toString() {
            return this.f9980f + "=" + this.f9981g;
        }

        public e(e<K, V> eVar, K k10, e<K, V> eVar2, e<K, V> eVar3) {
            this.f9975a = eVar;
            this.f9980f = k10;
            this.f9982h = 1;
            this.f9978d = eVar2;
            this.f9979e = eVar3;
            eVar3.f9978d = this;
            eVar2.f9979e = this;
        }
    }
}
