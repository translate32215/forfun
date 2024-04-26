package e8;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public class u90 extends AbstractSet<Map.Entry<K, V>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ p90 f16864a;

    public u90(p90 p90, o90 o90) {
        this.f16864a = p90;
    }

    public /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.f16864a.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    public void clear() {
        this.f16864a.clear();
    }

    public boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.f16864a.get(entry.getKey());
        Object value = entry.getValue();
        if (obj2 != value) {
            return obj2 != null && obj2.equals(value);
        }
        return true;
    }

    public Iterator<Map.Entry<K, V>> iterator() {
        return new v90(this.f16864a, (o90) null);
    }

    public boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.f16864a.remove(entry.getKey());
        return true;
    }

    public int size() {
        return this.f16864a.size();
    }
}
