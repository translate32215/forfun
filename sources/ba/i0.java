package ba;

import aa.m;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MultimapBuilder */
public final class i0<V> implements m<List<V>>, Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final int f3732a;

    public i0(int i10) {
        h.b(i10, "expectedValuesPerKey");
        this.f3732a = i10;
    }

    public Object get() {
        return new ArrayList(this.f3732a);
    }
}
