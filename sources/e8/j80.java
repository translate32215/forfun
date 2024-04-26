package e8;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class j80<K> implements Iterator<Map.Entry<K, Object>> {

    /* renamed from: a  reason: collision with root package name */
    public Iterator<Map.Entry<K, Object>> f15102a;

    public j80(Iterator<Map.Entry<K, Object>> it) {
        this.f15102a = it;
    }

    public final boolean hasNext() {
        return this.f15102a.hasNext();
    }

    public final /* synthetic */ Object next() {
        Map.Entry next = this.f15102a.next();
        return next.getValue() instanceof g80 ? new h80(next, (jc0) null) : next;
    }

    public final void remove() {
        this.f15102a.remove();
    }
}
