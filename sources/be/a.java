package be;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SequencesJVM.kt */
public final class a<T> implements f<T> {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReference<f<T>> f3892a;

    public a(f<? extends T> fVar) {
        this.f3892a = new AtomicReference<>(fVar);
    }

    public Iterator<T> iterator() {
        f andSet = this.f3892a.getAndSet((Object) null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
