package qc;

import androidx.lifecycle.LiveData;
import java.lang.reflect.Type;
import lf.b;
import lf.c;

/* compiled from: LiveDataCallAdapter.kt */
public final class k<R> implements c<R, LiveData<e<R>>> {

    /* renamed from: a  reason: collision with root package name */
    public final Type f24278a;

    public k(Type type) {
        this.f24278a = type;
    }

    public Object a(b bVar) {
        ud.k.f(bVar, "call");
        return new j(bVar);
    }

    public Type b() {
        return this.f24278a;
    }
}
