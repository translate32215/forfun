package androidx.lifecycle;

import androidx.lifecycle.f;
import androidx.lifecycle.o;

@Deprecated
class ReflectiveGenericLifecycleObserver implements r {

    /* renamed from: a  reason: collision with root package name */
    public final Object f2611a;

    /* renamed from: b  reason: collision with root package name */
    public final f.a f2612b;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f2611a = obj;
        this.f2612b = f.f2648c.b(obj.getClass());
    }

    public void d(t tVar, o.b bVar) {
        f.a aVar = this.f2612b;
        Object obj = this.f2611a;
        f.a.a(aVar.f2651a.get(bVar), tVar, bVar, obj);
        f.a.a(aVar.f2651a.get(o.b.ON_ANY), tVar, bVar, obj);
    }
}
