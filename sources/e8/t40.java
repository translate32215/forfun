package e8;

import com.google.android.gms.internal.ads.mg;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class t40<F, T> extends AbstractList<T> implements Serializable, RandomAccess {

    /* renamed from: a  reason: collision with root package name */
    public final List<F> f16704a;

    /* renamed from: b  reason: collision with root package name */
    public final mg<? super F, ? extends T> f16705b;

    public t40(List<F> list, mg<? super F, ? extends T> mgVar) {
        list.getClass();
        this.f16704a = list;
        mgVar.getClass();
        this.f16705b = mgVar;
    }

    public final void clear() {
        this.f16704a.clear();
    }

    public final T get(int i10) {
        return this.f16705b.apply(this.f16704a.get(i10));
    }

    public final boolean isEmpty() {
        return this.f16704a.isEmpty();
    }

    public final Iterator<T> iterator() {
        return listIterator();
    }

    public final ListIterator<T> listIterator(int i10) {
        return new v40(this, this.f16704a.listIterator(i10));
    }

    public final T remove(int i10) {
        return this.f16705b.apply(this.f16704a.remove(i10));
    }

    public final int size() {
        return this.f16704a.size();
    }
}
