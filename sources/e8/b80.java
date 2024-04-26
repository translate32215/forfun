package e8;

import java.util.AbstractList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class b80<F, T> extends AbstractList<T> {

    /* renamed from: a  reason: collision with root package name */
    public final List<F> f13903a;

    /* renamed from: b  reason: collision with root package name */
    public final a80<F, T> f13904b;

    public b80(List<F> list, a80<F, T> a80) {
        this.f13903a = list;
        this.f13904b = a80;
    }

    public final T get(int i10) {
        return this.f13904b.a(this.f13903a.get(i10));
    }

    public final int size() {
        return this.f13903a.size();
    }
}
