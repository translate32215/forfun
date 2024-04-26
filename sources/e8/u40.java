package e8;

import com.google.android.gms.internal.ads.mg;
import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class u40<F, T> extends AbstractSequentialList<T> implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final List<F> f16847a;

    /* renamed from: b  reason: collision with root package name */
    public final mg<? super F, ? extends T> f16848b;

    public u40(List<F> list, mg<? super F, ? extends T> mgVar) {
        list.getClass();
        this.f16847a = list;
        mgVar.getClass();
        this.f16848b = mgVar;
    }

    public final void clear() {
        this.f16847a.clear();
    }

    public final ListIterator<T> listIterator(int i10) {
        return new w40(this, this.f16847a.listIterator(i10));
    }

    public final int size() {
        return this.f16847a.size();
    }
}
