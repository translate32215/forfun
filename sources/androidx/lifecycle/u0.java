package androidx.lifecycle;

import java.io.Closeable;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: ViewModelStore */
public class u0 {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, q0> f2735a = new HashMap<>();

    public final void a() {
        for (q0 next : this.f2735a.values()) {
            next.f2709c = true;
            Map<String, Object> map = next.f2707a;
            if (map != null) {
                synchronized (map) {
                    for (Object b10 : next.f2707a.values()) {
                        q0.b(b10);
                    }
                }
            }
            Set<Closeable> set = next.f2708b;
            if (set != null) {
                synchronized (set) {
                    for (Closeable b11 : next.f2708b) {
                        q0.b(b11);
                    }
                }
            }
            next.d();
        }
        this.f2735a.clear();
    }
}
