package com.bumptech.glide;

import b2.t;
import b4.a;
import b4.c;
import b4.d;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.e;
import com.bumptech.glide.load.data.f;
import h4.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import q3.m;
import q3.n;
import q3.o;
import q3.q;
import y3.d;

/* compiled from: Registry */
public class g {

    /* renamed from: a  reason: collision with root package name */
    public final o f4925a;

    /* renamed from: b  reason: collision with root package name */
    public final b4.a f4926b;

    /* renamed from: c  reason: collision with root package name */
    public final b4.c f4927c;

    /* renamed from: d  reason: collision with root package name */
    public final b4.d f4928d;

    /* renamed from: e  reason: collision with root package name */
    public final f f4929e;

    /* renamed from: f  reason: collision with root package name */
    public final y3.d f4930f;

    /* renamed from: g  reason: collision with root package name */
    public final t f4931g;

    /* renamed from: h  reason: collision with root package name */
    public final m3.t f4932h = new m3.t(1);

    /* renamed from: i  reason: collision with root package name */
    public final b4.b f4933i = new b4.b();

    /* renamed from: j  reason: collision with root package name */
    public final n0.d<List<Throwable>> f4934j;

    /* compiled from: Registry */
    public static class a extends RuntimeException {
        public a(String str) {
            super(str);
        }
    }

    /* compiled from: Registry */
    public static final class b extends a {
        public b() {
            super("Failed to find image header parser.");
        }
    }

    /* compiled from: Registry */
    public static class c extends a {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public c(java.lang.Object r2) {
            /*
                r1 = this;
                java.lang.String r0 = "Failed to find any ModelLoaders registered for model class: "
                java.lang.StringBuilder r0 = android.support.v4.media.a.a(r0)
                java.lang.Class r2 = r2.getClass()
                r0.append(r2)
                java.lang.String r2 = r0.toString()
                r1.<init>(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.g.c.<init>(java.lang.Object):void");
        }

        public <M> c(M m10, List<m<M, ?>> list) {
            super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + m10);
        }

        public c(Class<?> cls, Class<?> cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }
    }

    /* compiled from: Registry */
    public static class d extends a {
        public d(Class<?> cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    /* compiled from: Registry */
    public static class e extends a {
        public e(Class<?> cls) {
            super("Failed to find source encoder for data class: " + cls);
        }
    }

    public g() {
        a.c cVar = new a.c(new n0.e(20), new h4.b(), new h4.c());
        this.f4934j = cVar;
        this.f4925a = new o(cVar);
        this.f4926b = new b4.a();
        this.f4927c = new b4.c();
        this.f4928d = new b4.d();
        this.f4929e = new f();
        this.f4930f = new y3.d();
        this.f4931g = new t(3);
        List<String> asList = Arrays.asList(new String[]{"Gif", "Bitmap", "BitmapDrawable"});
        ArrayList arrayList = new ArrayList(asList.size());
        arrayList.add("legacy_prepend_all");
        for (String add : asList) {
            arrayList.add(add);
        }
        arrayList.add("legacy_append");
        b4.c cVar2 = this.f4927c;
        synchronized (cVar2) {
            ArrayList arrayList2 = new ArrayList(cVar2.f3555a);
            cVar2.f3555a.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                cVar2.f3555a.add((String) it.next());
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                String str = (String) it2.next();
                if (!arrayList.contains(str)) {
                    cVar2.f3555a.add(str);
                }
            }
        }
    }

    public <Model, Data> g a(Class<Model> cls, Class<Data> cls2, n<Model, Data> nVar) {
        o oVar = this.f4925a;
        synchronized (oVar) {
            q qVar = oVar.f24107a;
            synchronized (qVar) {
                q.b bVar = new q.b(cls, cls2, nVar);
                List<q.b<?, ?>> list = qVar.f24122a;
                list.add(list.size(), bVar);
            }
            oVar.f24108b.f24109a.clear();
        }
        return this;
    }

    public <Data> g b(Class<Data> cls, k3.a<Data> aVar) {
        b4.a aVar2 = this.f4926b;
        synchronized (aVar2) {
            aVar2.f3549a.add(new a.C0049a(cls, aVar));
        }
        return this;
    }

    public <TResource> g c(Class<TResource> cls, k3.f<TResource> fVar) {
        b4.d dVar = this.f4928d;
        synchronized (dVar) {
            dVar.f3560a.add(new d.a(cls, fVar));
        }
        return this;
    }

    public <Data, TResource> g d(String str, Class<Data> cls, Class<TResource> cls2, com.bumptech.glide.load.f<Data, TResource> fVar) {
        b4.c cVar = this.f4927c;
        synchronized (cVar) {
            cVar.a(str).add(new c.a(cls, cls2, fVar));
        }
        return this;
    }

    public List<ImageHeaderParser> e() {
        List<ImageHeaderParser> list;
        t tVar = this.f4931g;
        synchronized (tVar) {
            list = (List) tVar.f3445b;
        }
        if (!list.isEmpty()) {
            return list;
        }
        throw new b();
    }

    public <Model> List<m<Model, ?>> f(Model model) {
        List<m<Model, ?>> list;
        o oVar = this.f4925a;
        oVar.getClass();
        Class cls = model.getClass();
        synchronized (oVar) {
            o.a.C0223a aVar = oVar.f24108b.f24109a.get(cls);
            if (aVar == null) {
                list = null;
            } else {
                list = aVar.f24110a;
            }
            if (list == null) {
                list = Collections.unmodifiableList(oVar.f24107a.a(cls));
                if (oVar.f24108b.f24109a.put(cls, new o.a.C0223a(list)) != null) {
                    throw new IllegalStateException("Already cached loaders for model: " + cls);
                }
            }
        }
        if (!list.isEmpty()) {
            int size = list.size();
            List<m<Model, ?>> emptyList = Collections.emptyList();
            boolean z10 = true;
            for (int i10 = 0; i10 < size; i10++) {
                m mVar = list.get(i10);
                if (mVar.b(model)) {
                    if (z10) {
                        emptyList = new ArrayList<>(size - i10);
                        z10 = false;
                    }
                    emptyList.add(mVar);
                }
            }
            if (!emptyList.isEmpty()) {
                return emptyList;
            }
            throw new c(model, list);
        }
        throw new c(model);
    }

    public g g(e.a<?> aVar) {
        f fVar = this.f4929e;
        synchronized (fVar) {
            fVar.f4975a.put(aVar.a(), aVar);
        }
        return this;
    }

    public <TResource, Transcode> g h(Class<TResource> cls, Class<Transcode> cls2, y3.c<TResource, Transcode> cVar) {
        y3.d dVar = this.f4930f;
        synchronized (dVar) {
            dVar.f28003a.add(new d.a(cls, cls2, cVar));
        }
        return this;
    }
}
