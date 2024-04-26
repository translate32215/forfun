package ba;

import ba.v0;
import com.google.j2objc.annotations.Weak;
import java.util.Map;

/* compiled from: Maps */
public class e0<K, V> extends v0.b<K> {
    @Weak

    /* renamed from: a  reason: collision with root package name */
    public final Map<K, V> f3723a;

    public e0(Map<K, V> map) {
        map.getClass();
        this.f3723a = map;
    }

    public boolean contains(Object obj) {
        return this.f3723a.containsKey(obj);
    }

    public boolean isEmpty() {
        return this.f3723a.isEmpty();
    }

    public int size() {
        return this.f3723a.size();
    }
}
