package ba;

import ba.q;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.LazyInit;
import com.google.j2objc.annotations.RetainedWith;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: ImmutableMap */
public abstract class u<K, V> implements Map<K, V>, Serializable {
    @LazyInit

    /* renamed from: a  reason: collision with root package name */
    public transient x<Map.Entry<K, V>> f3801a;
    @RetainedWith
    @LazyInit

    /* renamed from: b  reason: collision with root package name */
    public transient x<K> f3802b;
    @RetainedWith
    @LazyInit

    /* renamed from: c  reason: collision with root package name */
    public transient q<V> f3803c;

    /* compiled from: ImmutableMap */
    public static class a<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public Object[] f3804a;

        /* renamed from: b  reason: collision with root package name */
        public int f3805b = 0;

        public a(int i10) {
            this.f3804a = new Object[(i10 * 2)];
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0055, code lost:
            r5[r10] = r8;
            r3 = r3 + 1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public ba.u<K, V> a() {
            /*
                r13 = this;
                int r0 = r13.f3805b
                java.lang.Object[] r1 = r13.f3804a
                if (r0 != 0) goto L_0x000c
                ba.u<java.lang.Object, java.lang.Object> r0 = ba.p0.f3768g
                ba.p0 r0 = (ba.p0) r0
                goto L_0x009f
            L_0x000c:
                r2 = 0
                r3 = 0
                r4 = 1
                if (r0 != r4) goto L_0x001f
                r0 = r1[r3]
                r3 = r1[r4]
                ba.h.a(r0, r3)
                ba.p0 r0 = new ba.p0
                r0.<init>(r2, r1, r4)
                goto L_0x009f
            L_0x001f:
                int r5 = r1.length
                int r5 = r5 >> r4
                aa.g.d(r0, r5)
                int r5 = ba.x.s(r0)
                if (r0 != r4) goto L_0x0032
                r3 = r1[r3]
                r4 = r1[r4]
                ba.h.a(r3, r4)
                goto L_0x0099
            L_0x0032:
                int r2 = r5 + -1
                int[] r5 = new int[r5]
                r6 = -1
                java.util.Arrays.fill(r5, r6)
            L_0x003a:
                if (r3 >= r0) goto L_0x0098
                int r7 = r3 * 2
                int r8 = r7 + 0
                r9 = r1[r8]
                int r7 = r7 + r4
                r7 = r1[r7]
                ba.h.a(r9, r7)
                int r10 = r9.hashCode()
                int r10 = ba.p.a(r10)
            L_0x0050:
                r10 = r10 & r2
                r11 = r5[r10]
                if (r11 != r6) goto L_0x005a
                r5[r10] = r8
                int r3 = r3 + 1
                goto L_0x003a
            L_0x005a:
                r12 = r1[r11]
                boolean r12 = r12.equals(r9)
                if (r12 != 0) goto L_0x0065
                int r10 = r10 + 1
                goto L_0x0050
            L_0x0065:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Multiple entries with same key: "
                r2.append(r3)
                r2.append(r9)
                java.lang.String r3 = "="
                r2.append(r3)
                r2.append(r7)
                java.lang.String r5 = " and "
                r2.append(r5)
                r5 = r1[r11]
                r2.append(r5)
                r2.append(r3)
                r3 = r4 ^ r11
                r1 = r1[r3]
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                r0.<init>(r1)
                throw r0
            L_0x0098:
                r2 = r5
            L_0x0099:
                ba.p0 r3 = new ba.p0
                r3.<init>(r2, r1, r0)
                r0 = r3
            L_0x009f:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: ba.u.a.a():ba.u");
        }

        public final void b(int i10) {
            int i11 = i10 * 2;
            Object[] objArr = this.f3804a;
            if (i11 > objArr.length) {
                this.f3804a = Arrays.copyOf(objArr, q.b.a(objArr.length, i11));
            }
        }

        @CanIgnoreReturnValue
        public a<K, V> c(K k10, V v10) {
            b(this.f3805b + 1);
            h.a(k10, v10);
            Object[] objArr = this.f3804a;
            int i10 = this.f3805b;
            objArr[i10 * 2] = k10;
            objArr[(i10 * 2) + 1] = v10;
            this.f3805b = i10 + 1;
            return this;
        }
    }

    public static <K, V> u<K, V> a(Map<? extends K, ? extends V> map) {
        if ((map instanceof u) && !(map instanceof SortedMap)) {
            u<K, V> uVar = (u) map;
            if (!uVar.e()) {
                return uVar;
            }
        }
        Set<Map.Entry<? extends K, ? extends V>> entrySet = map.entrySet();
        boolean z10 = entrySet instanceof Collection;
        a aVar = new a(z10 ? entrySet.size() : 4);
        if (z10) {
            aVar.b(entrySet.size() + aVar.f3805b);
        }
        for (Map.Entry entry : entrySet) {
            aVar.c(entry.getKey(), entry.getValue());
        }
        return aVar.a();
    }

    public abstract x<Map.Entry<K, V>> b();

    public abstract x<K> c();

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public boolean containsKey(@NullableDecl Object obj) {
        return get(obj) != null;
    }

    public boolean containsValue(@NullableDecl Object obj) {
        return values().contains(obj);
    }

    public abstract q<V> d();

    public abstract boolean e();

    public Set entrySet() {
        x<Map.Entry<K, V>> xVar = this.f3801a;
        if (xVar != null) {
            return xVar;
        }
        x<Map.Entry<K, V>> b10 = b();
        this.f3801a = b10;
        return b10;
    }

    public boolean equals(@NullableDecl Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    /* renamed from: f */
    public q<V> values() {
        q<V> qVar = this.f3803c;
        if (qVar != null) {
            return qVar;
        }
        q<V> d10 = d();
        this.f3803c = d10;
        return d10;
    }

    public abstract V get(@NullableDecl Object obj);

    public final V getOrDefault(@NullableDecl Object obj, @NullableDecl V v10) {
        V v11 = get(obj);
        return v11 != null ? v11 : v10;
    }

    public int hashCode() {
        x<Map.Entry<K, V>> xVar = this.f3801a;
        if (xVar == null) {
            xVar = b();
            this.f3801a = xVar;
        }
        return v0.a(xVar);
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public Set keySet() {
        x<K> xVar = this.f3802b;
        if (xVar != null) {
            return xVar;
        }
        x<K> c10 = c();
        this.f3802b = c10;
        return c10;
    }

    @CanIgnoreReturnValue
    @Deprecated
    public final V put(K k10, V v10) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @CanIgnoreReturnValue
    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        int size = size();
        h.b(size, "size");
        StringBuilder sb2 = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824));
        sb2.append('{');
        boolean z10 = true;
        for (Map.Entry entry : entrySet()) {
            if (!z10) {
                sb2.append(", ");
            }
            z10 = false;
            sb2.append(entry.getKey());
            sb2.append('=');
            sb2.append(entry.getValue());
        }
        sb2.append('}');
        return sb2.toString();
    }
}
