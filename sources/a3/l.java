package a3;

import h3.a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: BaseAnimatableValue */
public abstract class l<V, O> implements k<V, O> {

    /* renamed from: a  reason: collision with root package name */
    public final List<a<V>> f60a;

    public l(V v10) {
        this.f60a = Collections.singletonList(new a(v10));
    }

    public List<a<V>> b() {
        return this.f60a;
    }

    public boolean c() {
        return this.f60a.isEmpty() || (this.f60a.size() == 1 && this.f60a.get(0).d());
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (!this.f60a.isEmpty()) {
            sb2.append("values=");
            sb2.append(Arrays.toString(this.f60a.toArray()));
        }
        return sb2.toString();
    }

    public l(List<a<V>> list) {
        this.f60a = list;
    }
}
