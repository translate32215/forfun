package ba;

import aa.f;
import aa.g;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: CompactHashMap */
public class l<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: t  reason: collision with root package name */
    public static final /* synthetic */ int f3736t = 0;
    @MonotonicNonNullDecl

    /* renamed from: a  reason: collision with root package name */
    public transient int[] f3737a;
    @MonotonicNonNullDecl

    /* renamed from: b  reason: collision with root package name */
    public transient long[] f3738b;
    @MonotonicNonNullDecl

    /* renamed from: c  reason: collision with root package name */
    public transient Object[] f3739c;
    @MonotonicNonNullDecl

    /* renamed from: d  reason: collision with root package name */
    public transient Object[] f3740d;

    /* renamed from: e  reason: collision with root package name */
    public transient float f3741e;

    /* renamed from: f  reason: collision with root package name */
    public transient int f3742f;

    /* renamed from: g  reason: collision with root package name */
    public transient int f3743g;

    /* renamed from: h  reason: collision with root package name */
    public transient int f3744h;
    @MonotonicNonNullDecl

    /* renamed from: i  reason: collision with root package name */
    public transient Set<K> f3745i;
    @MonotonicNonNullDecl

    /* renamed from: r  reason: collision with root package name */
    public transient Set<Map.Entry<K, V>> f3746r;
    @MonotonicNonNullDecl

    /* renamed from: s  reason: collision with root package name */
    public transient Collection<V> f3747s;

    /* compiled from: CompactHashMap */
    public class a extends AbstractSet<Map.Entry<K, V>> {
        public a() {
        }

        public void clear() {
            l.this.clear();
        }

        public boolean contains(@NullableDecl Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int d10 = l.this.d(entry.getKey());
            if (d10 == -1 || !f.a(l.this.f3740d[d10], entry.getValue())) {
                return false;
            }
            return true;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            l lVar = l.this;
            lVar.getClass();
            return new j(lVar);
        }

        public boolean remove(@NullableDecl Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int d10 = l.this.d(entry.getKey());
            if (d10 == -1 || !f.a(l.this.f3740d[d10], entry.getValue())) {
                return false;
            }
            l.a(l.this, d10);
            return true;
        }

        public int size() {
            return l.this.f3744h;
        }
    }

    /* compiled from: CompactHashMap */
    public abstract class b<T> implements Iterator<T> {

        /* renamed from: a  reason: collision with root package name */
        public int f3749a;

        /* renamed from: b  reason: collision with root package name */
        public int f3750b;

        /* renamed from: c  reason: collision with root package name */
        public int f3751c;

        public b(i iVar) {
            this.f3749a = l.this.f3742f;
            this.f3750b = l.this.isEmpty() ? -1 : 0;
            this.f3751c = -1;
        }

        public abstract T a(int i10);

        public boolean hasNext() {
            return this.f3750b >= 0;
        }

        public T next() {
            if (l.this.f3742f != this.f3749a) {
                throw new ConcurrentModificationException();
            } else if (hasNext()) {
                int i10 = this.f3750b;
                this.f3751c = i10;
                T a10 = a(i10);
                l lVar = l.this;
                int i11 = this.f3750b + 1;
                if (i11 >= lVar.f3744h) {
                    i11 = -1;
                }
                this.f3750b = i11;
                return a10;
            } else {
                throw new NoSuchElementException();
            }
        }

        public void remove() {
            if (l.this.f3742f == this.f3749a) {
                h.c(this.f3751c >= 0);
                this.f3749a++;
                l.a(l.this, this.f3751c);
                l lVar = l.this;
                int i10 = this.f3750b;
                lVar.getClass();
                this.f3750b = i10 - 1;
                this.f3751c = -1;
                return;
            }
            throw new ConcurrentModificationException();
        }
    }

    /* compiled from: CompactHashMap */
    public class c extends AbstractSet<K> {
        public c() {
        }

        public void clear() {
            l.this.clear();
        }

        public boolean contains(Object obj) {
            return l.this.containsKey(obj);
        }

        public Iterator<K> iterator() {
            l lVar = l.this;
            lVar.getClass();
            return new i(lVar);
        }

        public boolean remove(@NullableDecl Object obj) {
            int d10 = l.this.d(obj);
            if (d10 == -1) {
                return false;
            }
            l.a(l.this, d10);
            return true;
        }

        public int size() {
            return l.this.f3744h;
        }
    }

    /* compiled from: CompactHashMap */
    public final class d extends e<K, V> {
        @NullableDecl

        /* renamed from: a  reason: collision with root package name */
        public final K f3754a;

        /* renamed from: b  reason: collision with root package name */
        public int f3755b;

        public d(int i10) {
            this.f3754a = l.this.f3739c[i10];
            this.f3755b = i10;
        }

        public final void a() {
            int i10 = this.f3755b;
            if (i10 != -1) {
                l lVar = l.this;
                if (i10 < lVar.f3744h && f.a(this.f3754a, lVar.f3739c[i10])) {
                    return;
                }
            }
            l lVar2 = l.this;
            K k10 = this.f3754a;
            int i11 = l.f3736t;
            this.f3755b = lVar2.d(k10);
        }

        public K getKey() {
            return this.f3754a;
        }

        public V getValue() {
            a();
            int i10 = this.f3755b;
            if (i10 == -1) {
                return null;
            }
            return l.this.f3740d[i10];
        }

        public V setValue(V v10) {
            a();
            int i10 = this.f3755b;
            if (i10 == -1) {
                l.this.put(this.f3754a, v10);
                return null;
            }
            V[] vArr = l.this.f3740d;
            V v11 = vArr[i10];
            vArr[i10] = v10;
            return v11;
        }
    }

    /* compiled from: CompactHashMap */
    public class e extends AbstractCollection<V> {
        public e() {
        }

        public void clear() {
            l.this.clear();
        }

        public Iterator<V> iterator() {
            l lVar = l.this;
            lVar.getClass();
            return new k(lVar);
        }

        public int size() {
            return l.this.f3744h;
        }
    }

    public l() {
        g.b(true, "Initial capacity must be non-negative");
        g.b(true, "Illegal load factor");
        double d10 = (double) 1.0f;
        int max = Math.max(3, 2);
        int highestOneBit = Integer.highestOneBit(max);
        double d11 = (double) highestOneBit;
        Double.isNaN(d11);
        Double.isNaN(d10);
        Double.isNaN(d11);
        Double.isNaN(d10);
        Double.isNaN(d11);
        if (max > ((int) (d10 * d11)) && (highestOneBit = highestOneBit << 1) <= 0) {
            highestOneBit = 1073741824;
        }
        int[] iArr = new int[highestOneBit];
        Arrays.fill(iArr, -1);
        this.f3737a = iArr;
        this.f3741e = 1.0f;
        this.f3739c = new Object[3];
        this.f3740d = new Object[3];
        long[] jArr = new long[3];
        Arrays.fill(jArr, -1);
        this.f3738b = jArr;
        this.f3743g = Math.max(1, (int) (((float) highestOneBit) * 1.0f));
    }

    public static Object a(l lVar, int i10) {
        return lVar.e(lVar.f3739c[i10], b(lVar.f3738b[i10]));
    }

    public static int b(long j10) {
        return (int) (j10 >>> 32);
    }

    public static long f(long j10, int i10) {
        return (j10 & -4294967296L) | (((long) i10) & 4294967295L);
    }

    public final int c() {
        return this.f3737a.length - 1;
    }

    public void clear() {
        this.f3742f++;
        Arrays.fill(this.f3739c, 0, this.f3744h, (Object) null);
        Arrays.fill(this.f3740d, 0, this.f3744h, (Object) null);
        Arrays.fill(this.f3737a, -1);
        Arrays.fill(this.f3738b, -1);
        this.f3744h = 0;
    }

    public boolean containsKey(@NullableDecl Object obj) {
        return d(obj) != -1;
    }

    public boolean containsValue(@NullableDecl Object obj) {
        for (int i10 = 0; i10 < this.f3744h; i10++) {
            if (f.a(obj, this.f3740d[i10])) {
                return true;
            }
        }
        return false;
    }

    public final int d(@NullableDecl Object obj) {
        int b10 = p.b(obj);
        int i10 = this.f3737a[c() & b10];
        while (i10 != -1) {
            long j10 = this.f3738b[i10];
            if (b(j10) == b10 && f.a(obj, this.f3739c[i10])) {
                return i10;
            }
            i10 = (int) j10;
        }
        return -1;
    }

    @NullableDecl
    public final V e(@NullableDecl Object obj, int i10) {
        long[] jArr;
        long j10;
        int c10 = c() & i10;
        int i11 = this.f3737a[c10];
        if (i11 == -1) {
            return null;
        }
        int i12 = -1;
        while (true) {
            if (b(this.f3738b[i11]) != i10 || !f.a(obj, this.f3739c[i11])) {
                int i13 = (int) this.f3738b[i11];
                if (i13 == -1) {
                    return null;
                }
                int i14 = i13;
                i12 = i11;
                i11 = i14;
            } else {
                V v10 = this.f3740d[i11];
                if (i12 == -1) {
                    this.f3737a[c10] = (int) this.f3738b[i11];
                } else {
                    long[] jArr2 = this.f3738b;
                    jArr2[i12] = f(jArr2[i12], (int) jArr2[i11]);
                }
                int i15 = this.f3744h - 1;
                if (i11 < i15) {
                    Object[] objArr = this.f3739c;
                    objArr[i11] = objArr[i15];
                    Object[] objArr2 = this.f3740d;
                    objArr2[i11] = objArr2[i15];
                    objArr[i15] = null;
                    objArr2[i15] = null;
                    long[] jArr3 = this.f3738b;
                    long j11 = jArr3[i15];
                    jArr3[i11] = j11;
                    jArr3[i15] = -1;
                    int b10 = b(j11) & c();
                    int[] iArr = this.f3737a;
                    int i16 = iArr[b10];
                    if (i16 == i15) {
                        iArr[b10] = i11;
                    } else {
                        while (true) {
                            jArr = this.f3738b;
                            j10 = jArr[i16];
                            int i17 = (int) j10;
                            if (i17 == i15) {
                                break;
                            }
                            i16 = i17;
                        }
                        jArr[i16] = f(j10, i11);
                    }
                } else {
                    this.f3739c[i11] = null;
                    this.f3740d[i11] = null;
                    this.f3738b[i11] = -1;
                }
                this.f3744h--;
                this.f3742f++;
                return v10;
            }
        }
    }

    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f3746r;
        if (set != null) {
            return set;
        }
        a aVar = new a();
        this.f3746r = aVar;
        return aVar;
    }

    public V get(@NullableDecl Object obj) {
        int d10 = d(obj);
        if (d10 == -1) {
            return null;
        }
        return this.f3740d[d10];
    }

    public boolean isEmpty() {
        return this.f3744h == 0;
    }

    public Set<K> keySet() {
        Set<K> set = this.f3745i;
        if (set != null) {
            return set;
        }
        c cVar = new c();
        this.f3745i = cVar;
        return cVar;
    }

    @NullableDecl
    @CanIgnoreReturnValue
    public V put(@NullableDecl K k10, @NullableDecl V v10) {
        long[] jArr = this.f3738b;
        Object[] objArr = this.f3739c;
        V[] vArr = this.f3740d;
        int b10 = p.b(k10);
        int c10 = c() & b10;
        int i10 = this.f3744h;
        int[] iArr = this.f3737a;
        int i11 = iArr[c10];
        if (i11 == -1) {
            iArr[c10] = i10;
        } else {
            while (true) {
                long j10 = jArr[i11];
                if (b(j10) != b10 || !f.a(k10, objArr[i11])) {
                    int i12 = (int) j10;
                    if (i12 == -1) {
                        jArr[i11] = f(j10, i10);
                        break;
                    }
                    i11 = i12;
                } else {
                    V v11 = vArr[i11];
                    vArr[i11] = v10;
                    return v11;
                }
            }
        }
        if (i10 != Integer.MAX_VALUE) {
            int i13 = i10 + 1;
            int length = this.f3738b.length;
            if (i13 > length) {
                int max = Math.max(1, length >>> 1) + length;
                if (max < 0) {
                    max = Integer.MAX_VALUE;
                }
                if (max != length) {
                    this.f3739c = Arrays.copyOf(this.f3739c, max);
                    this.f3740d = Arrays.copyOf(this.f3740d, max);
                    long[] jArr2 = this.f3738b;
                    int length2 = jArr2.length;
                    long[] copyOf = Arrays.copyOf(jArr2, max);
                    if (max > length2) {
                        Arrays.fill(copyOf, length2, max, -1);
                    }
                    this.f3738b = copyOf;
                }
            }
            this.f3738b[i10] = (((long) b10) << 32) | 4294967295L;
            this.f3739c[i10] = k10;
            this.f3740d[i10] = v10;
            this.f3744h = i13;
            if (i10 >= this.f3743g) {
                int[] iArr2 = this.f3737a;
                int length3 = iArr2.length * 2;
                if (iArr2.length >= 1073741824) {
                    this.f3743g = Integer.MAX_VALUE;
                } else {
                    int i14 = ((int) (((float) length3) * this.f3741e)) + 1;
                    int[] iArr3 = new int[length3];
                    Arrays.fill(iArr3, -1);
                    long[] jArr3 = this.f3738b;
                    int i15 = length3 - 1;
                    for (int i16 = 0; i16 < this.f3744h; i16++) {
                        int b11 = b(jArr3[i16]);
                        int i17 = b11 & i15;
                        int i18 = iArr3[i17];
                        iArr3[i17] = i16;
                        jArr3[i16] = (((long) b11) << 32) | (((long) i18) & 4294967295L);
                    }
                    this.f3743g = i14;
                    this.f3737a = iArr3;
                }
            }
            this.f3742f++;
            return null;
        }
        throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
    }

    @NullableDecl
    @CanIgnoreReturnValue
    public V remove(@NullableDecl Object obj) {
        return e(obj, p.b(obj));
    }

    public int size() {
        return this.f3744h;
    }

    public Collection<V> values() {
        Collection<V> collection = this.f3747s;
        if (collection != null) {
            return collection;
        }
        e eVar = new e();
        this.f3747s = eVar;
        return eVar;
    }
}
