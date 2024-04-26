package ba;

import aa.g;
import java.util.AbstractMap;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: RegularImmutableMap */
public final class p0<K, V> extends u<K, V> {

    /* renamed from: g  reason: collision with root package name */
    public static final u<Object, Object> f3768g = new p0((int[]) null, new Object[0], 0);

    /* renamed from: d  reason: collision with root package name */
    public final transient int[] f3769d;

    /* renamed from: e  reason: collision with root package name */
    public final transient Object[] f3770e;

    /* renamed from: f  reason: collision with root package name */
    public final transient int f3771f;

    /* compiled from: RegularImmutableMap */
    public static class a<K, V> extends x<Map.Entry<K, V>> {

        /* renamed from: d  reason: collision with root package name */
        public final transient u<K, V> f3772d;

        /* renamed from: e  reason: collision with root package name */
        public final transient Object[] f3773e;

        /* renamed from: f  reason: collision with root package name */
        public final transient int f3774f;

        /* renamed from: g  reason: collision with root package name */
        public final transient int f3775g;

        /* renamed from: ba.p0$a$a  reason: collision with other inner class name */
        /* compiled from: RegularImmutableMap */
        public class C0054a extends s<Map.Entry<K, V>> {
            public C0054a() {
            }

            public Object get(int i10) {
                g.c(i10, a.this.f3775g);
                a aVar = a.this;
                Object[] objArr = aVar.f3773e;
                int i11 = i10 * 2;
                int i12 = aVar.f3774f;
                return new AbstractMap.SimpleImmutableEntry(objArr[i11 + i12], objArr[i11 + (i12 ^ 1)]);
            }

            public boolean o() {
                return true;
            }

            public int size() {
                return a.this.f3775g;
            }
        }

        public a(u<K, V> uVar, Object[] objArr, int i10, int i11) {
            this.f3772d = uVar;
            this.f3773e = objArr;
            this.f3774f = i10;
            this.f3775g = i11;
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value == null || !value.equals(this.f3772d.get(key))) {
                return false;
            }
            return true;
        }

        public int f(Object[] objArr, int i10) {
            return c().f(objArr, i10);
        }

        public boolean o() {
            return true;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [ba.y0<java.util.Map$Entry<K, V>>, ba.a] */
        /* renamed from: q */
        public y0<Map.Entry<K, V>> iterator() {
            return c().listIterator();
        }

        public int size() {
            return this.f3775g;
        }

        public s<Map.Entry<K, V>> y() {
            return new C0054a();
        }
    }

    /* compiled from: RegularImmutableMap */
    public static final class b<K> extends x<K> {

        /* renamed from: d  reason: collision with root package name */
        public final transient u<K, ?> f3777d;

        /* renamed from: e  reason: collision with root package name */
        public final transient s<K> f3778e;

        public b(u<K, ?> uVar, s<K> sVar) {
            this.f3777d = uVar;
            this.f3778e = sVar;
        }

        public s<K> c() {
            return this.f3778e;
        }

        public boolean contains(@NullableDecl Object obj) {
            return this.f3777d.get(obj) != null;
        }

        public int f(Object[] objArr, int i10) {
            return this.f3778e.f(objArr, i10);
        }

        public boolean o() {
            return true;
        }

        /* JADX WARNING: type inference failed for: r0v1, types: [ba.y0<K>, ba.a] */
        /* renamed from: q */
        public y0<K> iterator() {
            return this.f3778e.listIterator();
        }

        public int size() {
            return this.f3777d.size();
        }
    }

    /* compiled from: RegularImmutableMap */
    public static final class c extends s<Object> {

        /* renamed from: c  reason: collision with root package name */
        public final transient Object[] f3779c;

        /* renamed from: d  reason: collision with root package name */
        public final transient int f3780d;

        /* renamed from: e  reason: collision with root package name */
        public final transient int f3781e;

        public c(Object[] objArr, int i10, int i11) {
            this.f3779c = objArr;
            this.f3780d = i10;
            this.f3781e = i11;
        }

        public Object get(int i10) {
            g.c(i10, this.f3781e);
            return this.f3779c[(i10 * 2) + this.f3780d];
        }

        public boolean o() {
            return true;
        }

        public int size() {
            return this.f3781e;
        }
    }

    public p0(int[] iArr, Object[] objArr, int i10) {
        this.f3769d = iArr;
        this.f3770e = objArr;
        this.f3771f = i10;
    }

    public x<Map.Entry<K, V>> b() {
        return new a(this, this.f3770e, 0, this.f3771f);
    }

    public x<K> c() {
        return new b(this, new c(this.f3770e, 0, this.f3771f));
    }

    public q<V> d() {
        return new c(this.f3770e, 1, this.f3771f);
    }

    public boolean e() {
        return false;
    }

    @NullableDecl
    public V get(@NullableDecl Object obj) {
        int[] iArr = this.f3769d;
        V[] vArr = this.f3770e;
        int i10 = this.f3771f;
        if (obj == null) {
            return null;
        }
        if (i10 == 1) {
            if (vArr[0].equals(obj)) {
                return vArr[1];
            }
            return null;
        } else if (iArr == null) {
            return null;
        } else {
            int length = iArr.length - 1;
            int a10 = p.a(obj.hashCode());
            while (true) {
                int i11 = a10 & length;
                int i12 = iArr[i11];
                if (i12 == -1) {
                    return null;
                }
                if (vArr[i12].equals(obj)) {
                    return vArr[i12 ^ 1];
                }
                a10 = i11 + 1;
            }
        }
    }

    public int size() {
        return this.f3771f;
    }
}
