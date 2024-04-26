package s;

import java.util.Map;

/* compiled from: ArraySet */
public class b extends h<Object, Object> {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ c f24798d;

    public b(c cVar) {
        this.f24798d = cVar;
    }

    public void a() {
        this.f24798d.clear();
    }

    public Object b(int i10, int i11) {
        return this.f24798d.f24806b[i10];
    }

    public Map<Object, Object> c() {
        throw new UnsupportedOperationException("not a map");
    }

    public int d() {
        return this.f24798d.f24807c;
    }

    public int e(Object obj) {
        return this.f24798d.indexOf(obj);
    }

    public int f(Object obj) {
        return this.f24798d.indexOf(obj);
    }

    public void g(Object obj, Object obj2) {
        this.f24798d.add(obj);
    }

    public void h(int i10) {
        this.f24798d.j(i10);
    }

    public Object i(int i10, Object obj) {
        throw new UnsupportedOperationException("not a map");
    }
}
