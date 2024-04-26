package k8;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.2 */
public final class h8 extends AbstractSet<Map.Entry> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ i8 f20246a;

    public /* synthetic */ h8(i8 i8Var) {
        this.f20246a = i8Var;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.f20246a.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    public final void clear() {
        this.f20246a.clear();
    }

    public final boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.f20246a.get(entry.getKey());
        Object value = entry.getValue();
        if (obj2 == value || (obj2 != null && obj2.equals(value))) {
            return true;
        }
        return false;
    }

    public final Iterator<Map.Entry> iterator() {
        return new g8(this.f20246a);
    }

    public final boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.f20246a.remove(entry.getKey());
        return true;
    }

    public final int size() {
        return this.f20246a.size();
    }
}
