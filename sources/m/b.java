package m;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: SafeIterableMap */
public class b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: a  reason: collision with root package name */
    public c<K, V> f21451a;

    /* renamed from: b  reason: collision with root package name */
    public c<K, V> f21452b;

    /* renamed from: c  reason: collision with root package name */
    public WeakHashMap<f<K, V>, Boolean> f21453c = new WeakHashMap<>();

    /* renamed from: d  reason: collision with root package name */
    public int f21454d = 0;

    /* compiled from: SafeIterableMap */
    public static class a<K, V> extends e<K, V> {
        public a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        public c<K, V> b(c<K, V> cVar) {
            return cVar.f21458d;
        }

        public c<K, V> c(c<K, V> cVar) {
            return cVar.f21457c;
        }
    }

    /* renamed from: m.b$b  reason: collision with other inner class name */
    /* compiled from: SafeIterableMap */
    public static class C0188b<K, V> extends e<K, V> {
        public C0188b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        public c<K, V> b(c<K, V> cVar) {
            return cVar.f21457c;
        }

        public c<K, V> c(c<K, V> cVar) {
            return cVar.f21458d;
        }
    }

    /* compiled from: SafeIterableMap */
    public static class c<K, V> implements Map.Entry<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public final K f21455a;

        /* renamed from: b  reason: collision with root package name */
        public final V f21456b;

        /* renamed from: c  reason: collision with root package name */
        public c<K, V> f21457c;

        /* renamed from: d  reason: collision with root package name */
        public c<K, V> f21458d;

        public c(K k10, V v10) {
            this.f21455a = k10;
            this.f21456b = v10;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (!this.f21455a.equals(cVar.f21455a) || !this.f21456b.equals(cVar.f21456b)) {
                return false;
            }
            return true;
        }

        public K getKey() {
            return this.f21455a;
        }

        public V getValue() {
            return this.f21456b;
        }

        public int hashCode() {
            return this.f21455a.hashCode() ^ this.f21456b.hashCode();
        }

        public V setValue(V v10) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f21455a + "=" + this.f21456b;
        }
    }

    /* compiled from: SafeIterableMap */
    public class d implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public c<K, V> f21459a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f21460b = true;

        public d() {
        }

        public void a(c<K, V> cVar) {
            c<K, V> cVar2 = this.f21459a;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.f21458d;
                this.f21459a = cVar3;
                this.f21460b = cVar3 == null;
            }
        }

        public boolean hasNext() {
            if (!this.f21460b) {
                c<K, V> cVar = this.f21459a;
                if (cVar == null || cVar.f21457c == null) {
                    return false;
                }
                return true;
            } else if (b.this.f21451a != null) {
                return true;
            } else {
                return false;
            }
        }

        public Object next() {
            if (this.f21460b) {
                this.f21460b = false;
                this.f21459a = b.this.f21451a;
            } else {
                c<K, V> cVar = this.f21459a;
                this.f21459a = cVar != null ? cVar.f21457c : null;
            }
            return this.f21459a;
        }
    }

    /* compiled from: SafeIterableMap */
    public static abstract class e<K, V> implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public c<K, V> f21462a;

        /* renamed from: b  reason: collision with root package name */
        public c<K, V> f21463b;

        public e(c<K, V> cVar, c<K, V> cVar2) {
            this.f21462a = cVar2;
            this.f21463b = cVar;
        }

        public void a(c<K, V> cVar) {
            c<K, V> cVar2 = null;
            if (this.f21462a == cVar && cVar == this.f21463b) {
                this.f21463b = null;
                this.f21462a = null;
            }
            c<K, V> cVar3 = this.f21462a;
            if (cVar3 == cVar) {
                this.f21462a = b(cVar3);
            }
            c<K, V> cVar4 = this.f21463b;
            if (cVar4 == cVar) {
                c<K, V> cVar5 = this.f21462a;
                if (!(cVar4 == cVar5 || cVar5 == null)) {
                    cVar2 = c(cVar4);
                }
                this.f21463b = cVar2;
            }
        }

        public abstract c<K, V> b(c<K, V> cVar);

        public abstract c<K, V> c(c<K, V> cVar);

        public boolean hasNext() {
            return this.f21463b != null;
        }

        public Object next() {
            c<K, V> cVar = this.f21463b;
            c<K, V> cVar2 = this.f21462a;
            this.f21463b = (cVar == cVar2 || cVar2 == null) ? null : c(cVar);
            return cVar;
        }
    }

    /* compiled from: SafeIterableMap */
    public interface f<K, V> {
        void a(c<K, V> cVar);
    }

    public c<K, V> c(K k10) {
        c<K, V> cVar = this.f21451a;
        while (cVar != null && !cVar.f21455a.equals(k10)) {
            cVar = cVar.f21457c;
        }
        return cVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0048, code lost:
        if (r3.hasNext() != false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0050, code lost:
        if (((m.b.e) r7).hasNext() != false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0053, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r7 instanceof m.b
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            m.b r7 = (m.b) r7
            int r1 = r6.f21454d
            int r3 = r7.f21454d
            if (r1 == r3) goto L_0x0013
            return r2
        L_0x0013:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L_0x001b:
            r3 = r1
            m.b$e r3 = (m.b.e) r3
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0044
            r4 = r7
            m.b$e r4 = (m.b.e) r4
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0044
            java.lang.Object r3 = r3.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r4.next()
            if (r3 != 0) goto L_0x003b
            if (r4 != 0) goto L_0x0043
        L_0x003b:
            if (r3 == 0) goto L_0x001b
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x001b
        L_0x0043:
            return r2
        L_0x0044:
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto L_0x0053
            m.b$e r7 = (m.b.e) r7
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            r0 = 0
        L_0x0054:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m.b.equals(java.lang.Object):boolean");
    }

    public b<K, V>.d f() {
        b<K, V>.d dVar = new d();
        this.f21453c.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public c<K, V> h(K k10, V v10) {
        c<K, V> cVar = new c<>(k10, v10);
        this.f21454d++;
        c<K, V> cVar2 = this.f21452b;
        if (cVar2 == null) {
            this.f21451a = cVar;
            this.f21452b = cVar;
            return cVar;
        }
        cVar2.f21457c = cVar;
        cVar.f21458d = cVar2;
        this.f21452b = cVar;
        return cVar;
    }

    public int hashCode() {
        Iterator it = iterator();
        int i10 = 0;
        while (true) {
            e eVar = (e) it;
            if (!eVar.hasNext()) {
                return i10;
            }
            i10 += ((Map.Entry) eVar.next()).hashCode();
        }
    }

    public V i(K k10, V v10) {
        c c10 = c(k10);
        if (c10 != null) {
            return c10.f21456b;
        }
        h(k10, v10);
        return null;
    }

    public Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f21451a, this.f21452b);
        this.f21453c.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public V j(K k10) {
        c c10 = c(k10);
        if (c10 == null) {
            return null;
        }
        this.f21454d--;
        if (!this.f21453c.isEmpty()) {
            for (f<K, V> a10 : this.f21453c.keySet()) {
                a10.a(c10);
            }
        }
        c<K, V> cVar = c10.f21458d;
        if (cVar != null) {
            cVar.f21457c = c10.f21457c;
        } else {
            this.f21451a = c10.f21457c;
        }
        c<K, V> cVar2 = c10.f21457c;
        if (cVar2 != null) {
            cVar2.f21458d = cVar;
        } else {
            this.f21452b = cVar;
        }
        c10.f21457c = null;
        c10.f21458d = null;
        return c10.f21456b;
    }

    public String toString() {
        StringBuilder a10 = android.support.v4.media.a.a("[");
        Iterator it = iterator();
        while (true) {
            e eVar = (e) it;
            if (eVar.hasNext()) {
                a10.append(((Map.Entry) eVar.next()).toString());
                if (eVar.hasNext()) {
                    a10.append(", ");
                }
            } else {
                a10.append("]");
                return a10.toString();
            }
        }
    }
}
