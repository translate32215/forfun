package g4;

import s.a;
import s.i;

/* compiled from: CachedHashCodeArrayMap */
public final class b<K, V> extends a<K, V> {

    /* renamed from: i  reason: collision with root package name */
    public int f18448i;

    public void clear() {
        this.f18448i = 0;
        super.clear();
    }

    public int hashCode() {
        if (this.f18448i == 0) {
            this.f18448i = super.hashCode();
        }
        return this.f18448i;
    }

    public void i(i<? extends K, ? extends V> iVar) {
        this.f18448i = 0;
        super.i(iVar);
    }

    public V j(int i10) {
        this.f18448i = 0;
        return super.j(i10);
    }

    public V k(int i10, V v10) {
        this.f18448i = 0;
        int i11 = (i10 << 1) + 1;
        V[] vArr = this.f24850b;
        V v11 = vArr[i11];
        vArr[i11] = v10;
        return v11;
    }

    public V put(K k10, V v10) {
        this.f18448i = 0;
        return super.put(k10, v10);
    }
}
