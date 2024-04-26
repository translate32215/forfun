package v6;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: CopyOnWriteMultiset */
public final class h<E> implements Iterable<E> {

    /* renamed from: a  reason: collision with root package name */
    public final Object f26452a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final Map<E, Integer> f26453b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public Set<E> f26454c = Collections.emptySet();

    /* renamed from: d  reason: collision with root package name */
    public List<E> f26455d = Collections.emptyList();

    public Iterator<E> iterator() {
        Iterator<E> it;
        synchronized (this.f26452a) {
            it = this.f26455d.iterator();
        }
        return it;
    }
}
