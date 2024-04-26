package e8;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public class la0<E> extends AbstractList<E> {

    /* renamed from: c  reason: collision with root package name */
    public static final na0 f15373c = na0.b(la0.class);

    /* renamed from: a  reason: collision with root package name */
    public List<E> f15374a;

    /* renamed from: b  reason: collision with root package name */
    public Iterator<E> f15375b;

    public la0(List<E> list, Iterator<E> it) {
        this.f15374a = list;
        this.f15375b = it;
    }

    public E get(int i10) {
        if (this.f15374a.size() > i10) {
            return this.f15374a.get(i10);
        }
        if (this.f15375b.hasNext()) {
            this.f15374a.add(this.f15375b.next());
            return get(i10);
        }
        throw new NoSuchElementException();
    }

    public Iterator<E> iterator() {
        return new oa0(this);
    }

    public int size() {
        na0 na0 = f15373c;
        na0.a("potentially expensive size() call");
        na0.a("blowup running");
        while (this.f15375b.hasNext()) {
            this.f15374a.add(this.f15375b.next());
        }
        return this.f15374a.size();
    }
}
