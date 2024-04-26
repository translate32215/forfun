package com.google.android.gms.internal.ads;

import e.h;
import e8.a50;
import e8.b50;
import e8.z40;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public abstract class wg<K, V> implements Serializable, Map<K, V> {

    /* renamed from: a  reason: collision with root package name */
    public transient vg<Map.Entry<K, V>> f8466a;

    /* renamed from: b  reason: collision with root package name */
    public transient vg<K> f8467b;

    /* renamed from: c  reason: collision with root package name */
    public transient sg<V> f8468c;

    public static <K, V> wg<K, V> a(K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14) {
        h.e(k12, v12);
        return zg.d(5, new Object[]{k10, v10, k11, v11, k12, v12, k13, v13, k14, v14});
    }

    public static <K, V> wg<K, V> b(K k10, V v10) {
        h.e(k10, v10);
        return zg.d(1, new Object[]{k10, v10});
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public boolean containsKey(@NullableDecl Object obj) {
        return get(obj) != null;
    }

    public boolean containsValue(@NullableDecl Object obj) {
        return ((sg) values()).contains(obj);
    }

    public Set entrySet() {
        vg<Map.Entry<K, V>> vgVar = this.f8466a;
        if (vgVar != null) {
            return vgVar;
        }
        zg zgVar = (zg) this;
        z40 z40 = new z40(zgVar, zgVar.f8713e, zgVar.f8714f);
        this.f8466a = z40;
        return z40;
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

    public abstract V get(@NullableDecl Object obj);

    public final V getOrDefault(@NullableDecl Object obj, @NullableDecl V v10) {
        V v11 = get(obj);
        return v11 != null ? v11 : v10;
    }

    public int hashCode() {
        return b50.a((vg) entrySet());
    }

    public boolean isEmpty() {
        return ((zg) this).size() == 0;
    }

    public Set keySet() {
        vg<K> vgVar = this.f8467b;
        if (vgVar != null) {
            return vgVar;
        }
        zg zgVar = (zg) this;
        ah ahVar = new ah(zgVar, new a50(zgVar.f8713e, 0, zgVar.f8714f));
        this.f8467b = ahVar;
        return ahVar;
    }

    @Deprecated
    public final V put(K k10, V v10) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        int size = ((zg) this).size();
        h.f(size, "size");
        StringBuilder sb2 = new StringBuilder((int) Math.min(((long) size) << 3, 1073741824));
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

    public Collection values() {
        sg<V> sgVar = this.f8468c;
        if (sgVar != null) {
            return sgVar;
        }
        zg zgVar = (zg) this;
        a50 a50 = new a50(zgVar.f8713e, 1, zgVar.f8714f);
        this.f8468c = a50;
        return a50;
    }
}
