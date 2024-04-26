package q3;

import com.bumptech.glide.g;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import k3.e;
import n0.d;
import q3.m;

/* compiled from: MultiModelLoaderFactory */
public class q {

    /* renamed from: e  reason: collision with root package name */
    public static final c f24120e = new c();

    /* renamed from: f  reason: collision with root package name */
    public static final m<Object, Object> f24121f = new a();

    /* renamed from: a  reason: collision with root package name */
    public final List<b<?, ?>> f24122a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final c f24123b;

    /* renamed from: c  reason: collision with root package name */
    public final Set<b<?, ?>> f24124c = new HashSet();

    /* renamed from: d  reason: collision with root package name */
    public final d<List<Throwable>> f24125d;

    /* compiled from: MultiModelLoaderFactory */
    public static class a implements m<Object, Object> {
        public m.a<Object> a(Object obj, int i10, int i11, e eVar) {
            return null;
        }

        public boolean b(Object obj) {
            return false;
        }
    }

    /* compiled from: MultiModelLoaderFactory */
    public static class b<Model, Data> {

        /* renamed from: a  reason: collision with root package name */
        public final Class<Model> f24126a;

        /* renamed from: b  reason: collision with root package name */
        public final Class<Data> f24127b;

        /* renamed from: c  reason: collision with root package name */
        public final n<? extends Model, ? extends Data> f24128c;

        public b(Class<Model> cls, Class<Data> cls2, n<? extends Model, ? extends Data> nVar) {
            this.f24126a = cls;
            this.f24127b = cls2;
            this.f24128c = nVar;
        }
    }

    /* compiled from: MultiModelLoaderFactory */
    public static class c {
    }

    public q(d<List<Throwable>> dVar) {
        c cVar = f24120e;
        this.f24125d = dVar;
        this.f24123b = cVar;
    }

    public synchronized <Model> List<m<Model, ?>> a(Class<Model> cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (b next : this.f24122a) {
                if (!this.f24124c.contains(next)) {
                    if (next.f24126a.isAssignableFrom(cls)) {
                        this.f24124c.add(next);
                        m<? extends Model, ? extends Data> a10 = next.f24128c.a(this);
                        e.e.b(a10);
                        arrayList.add(a10);
                        this.f24124c.remove(next);
                    }
                }
            }
        } catch (Throwable th) {
            this.f24124c.clear();
            throw th;
        }
        return arrayList;
    }

    public synchronized <Model, Data> m<Model, Data> b(Class<Model> cls, Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z10 = false;
            for (b next : this.f24122a) {
                if (this.f24124c.contains(next)) {
                    z10 = true;
                } else {
                    if (next.f24126a.isAssignableFrom(cls) && next.f24127b.isAssignableFrom(cls2)) {
                        this.f24124c.add(next);
                        arrayList.add(c(next));
                        this.f24124c.remove(next);
                    }
                }
            }
            if (arrayList.size() > 1) {
                c cVar = this.f24123b;
                d<List<Throwable>> dVar = this.f24125d;
                cVar.getClass();
                return new p(arrayList, dVar);
            } else if (arrayList.size() == 1) {
                return (m) arrayList.get(0);
            } else if (z10) {
                return f24121f;
            } else {
                throw new g.c((Class<?>) cls, (Class<?>) cls2);
            }
        } catch (Throwable th) {
            this.f24124c.clear();
            throw th;
        }
    }

    public final <Model, Data> m<Model, Data> c(b<?, ?> bVar) {
        m<? extends Model, ? extends Data> a10 = bVar.f24128c.a(this);
        e.e.b(a10);
        return a10;
    }

    public synchronized List<Class<?>> d(Class<?> cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (b next : this.f24122a) {
            if (!arrayList.contains(next.f24127b) && next.f24126a.isAssignableFrom(cls)) {
                arrayList.add(next.f24127b);
            }
        }
        return arrayList;
    }
}
