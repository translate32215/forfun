package e8;

import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class oa0 implements Iterator<E> {

    /* renamed from: a  reason: collision with root package name */
    public int f15765a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ la0 f15766b;

    public oa0(la0 la0) {
        this.f15766b = la0;
    }

    public final boolean hasNext() {
        return this.f15765a < this.f15766b.f15374a.size() || this.f15766b.f15375b.hasNext();
    }

    public final E next() {
        while (this.f15765a >= this.f15766b.f15374a.size()) {
            la0 la0 = this.f15766b;
            la0.f15374a.add(la0.f15375b.next());
        }
        List<E> list = this.f15766b.f15374a;
        int i10 = this.f15765a;
        this.f15765a = i10 + 1;
        return list.get(i10);
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
