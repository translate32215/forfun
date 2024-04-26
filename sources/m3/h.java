package m3;

import b4.a;
import b4.b;
import b4.c;
import com.bumptech.glide.d;
import com.bumptech.glide.f;
import com.bumptech.glide.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k3.c;
import k3.e;
import k3.g;
import m3.i;
import m3.l;
import o3.a;
import q3.m;
import y3.d;

/* compiled from: DecodeHelper */
public final class h<Transcode> {

    /* renamed from: a  reason: collision with root package name */
    public final List<m.a<?>> f21528a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final List<c> f21529b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public d f21530c;

    /* renamed from: d  reason: collision with root package name */
    public Object f21531d;

    /* renamed from: e  reason: collision with root package name */
    public int f21532e;

    /* renamed from: f  reason: collision with root package name */
    public int f21533f;

    /* renamed from: g  reason: collision with root package name */
    public Class<?> f21534g;

    /* renamed from: h  reason: collision with root package name */
    public i.d f21535h;

    /* renamed from: i  reason: collision with root package name */
    public e f21536i;

    /* renamed from: j  reason: collision with root package name */
    public Map<Class<?>, g<?>> f21537j;

    /* renamed from: k  reason: collision with root package name */
    public Class<Transcode> f21538k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f21539l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f21540m;

    /* renamed from: n  reason: collision with root package name */
    public c f21541n;

    /* renamed from: o  reason: collision with root package name */
    public f f21542o;

    /* renamed from: p  reason: collision with root package name */
    public k f21543p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f21544q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f21545r;

    public List<c> a() {
        if (!this.f21540m) {
            this.f21540m = true;
            this.f21529b.clear();
            List<m.a<?>> c10 = c();
            int size = c10.size();
            for (int i10 = 0; i10 < size; i10++) {
                m.a aVar = c10.get(i10);
                if (!this.f21529b.contains(aVar.f24104a)) {
                    this.f21529b.add(aVar.f24104a);
                }
                for (int i11 = 0; i11 < aVar.f24105b.size(); i11++) {
                    if (!this.f21529b.contains(aVar.f24105b.get(i11))) {
                        this.f21529b.add(aVar.f24105b.get(i11));
                    }
                }
            }
        }
        return this.f21529b;
    }

    public a b() {
        return ((l.c) this.f21535h).a();
    }

    public List<m.a<?>> c() {
        if (!this.f21539l) {
            this.f21539l = true;
            this.f21528a.clear();
            List f10 = this.f21530c.f4909b.f(this.f21531d);
            int size = f10.size();
            for (int i10 = 0; i10 < size; i10++) {
                m.a a10 = ((m) f10.get(i10)).a(this.f21531d, this.f21532e, this.f21533f, this.f21536i);
                if (a10 != null) {
                    this.f21528a.add(a10);
                }
            }
        }
        return this.f21528a;
    }

    public <Data> u<Data, ?, Transcode> d(Class<Data> cls) {
        u<Data, ?, Transcode> orDefault;
        u<Data, ?, Transcode> uVar;
        u<?, ?, ?> uVar2;
        ArrayList arrayList;
        y3.c cVar;
        Class<Data> cls2 = cls;
        com.bumptech.glide.g gVar = this.f21530c.f4909b;
        Class<?> cls3 = this.f21534g;
        Class<Transcode> cls4 = this.f21538k;
        b bVar = gVar.f4933i;
        g4.i andSet = bVar.f3554b.getAndSet((Object) null);
        if (andSet == null) {
            andSet = new g4.i();
        }
        andSet.f18464a = cls2;
        andSet.f18465b = cls3;
        andSet.f18466c = cls4;
        synchronized (bVar.f3553a) {
            orDefault = bVar.f3553a.getOrDefault(andSet, null);
        }
        bVar.f3554b.set(andSet);
        gVar.f4933i.getClass();
        if (b.f3552c.equals(orDefault)) {
            return null;
        }
        if (orDefault != null) {
            return orDefault;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = ((ArrayList) gVar.f4927c.b(cls2, cls3)).iterator();
        while (it.hasNext()) {
            Class cls5 = (Class) it.next();
            Iterator it2 = ((ArrayList) gVar.f4930f.a(cls5, cls4)).iterator();
            while (true) {
                if (it2.hasNext()) {
                    Class cls6 = (Class) it2.next();
                    b4.c cVar2 = gVar.f4927c;
                    synchronized (cVar2) {
                        arrayList = new ArrayList();
                        for (String str : cVar2.f3555a) {
                            List<c.a> list = cVar2.f3556b.get(str);
                            if (list != null) {
                                for (c.a aVar : list) {
                                    if (aVar.a(cls2, cls5)) {
                                        arrayList.add(aVar.f3559c);
                                    }
                                }
                            }
                        }
                    }
                    y3.d dVar = gVar.f4930f;
                    synchronized (dVar) {
                        if (cls6.isAssignableFrom(cls5)) {
                            cVar = y3.e.f28007a;
                        } else {
                            for (d.a next : dVar.f28003a) {
                                if (next.a(cls5, cls6)) {
                                    cVar = next.f28006c;
                                }
                            }
                            throw new IllegalArgumentException("No transcoder registered to transcode from " + cls5 + " to " + cls6);
                        }
                    }
                    y3.c cVar3 = cVar;
                    j jVar = r2;
                    j jVar2 = new j(cls, cls5, cls6, arrayList, cVar3, gVar.f4934j);
                    arrayList2.add(jVar);
                }
            }
        }
        if (arrayList2.isEmpty()) {
            uVar = null;
        } else {
            uVar = new u<>(cls, cls3, cls4, arrayList2, gVar.f4934j);
        }
        b bVar2 = gVar.f4933i;
        synchronized (bVar2.f3553a) {
            s.a<g4.i, u<?, ?, ?>> aVar2 = bVar2.f3553a;
            g4.i iVar = new g4.i(cls2, cls3, cls4);
            if (uVar != null) {
                uVar2 = uVar;
            } else {
                uVar2 = b.f3552c;
            }
            aVar2.put(iVar, uVar2);
        }
        return uVar;
    }

    public <X> k3.a<X> e(X x10) throws g.e {
        k3.a<T> aVar;
        b4.a aVar2 = this.f21530c.f4909b.f4926b;
        Class<?> cls = x10.getClass();
        synchronized (aVar2) {
            Iterator<a.C0049a<?>> it = aVar2.f3549a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    aVar = null;
                    break;
                }
                a.C0049a next = it.next();
                if (next.f3550a.isAssignableFrom(cls)) {
                    aVar = next.f3551b;
                    break;
                }
            }
        }
        if (aVar != null) {
            return aVar;
        }
        throw new g.e(x10.getClass());
    }

    public <Z> k3.g<Z> f(Class<Z> cls) {
        k3.g<Z> gVar = this.f21537j.get(cls);
        if (gVar == null) {
            Iterator<Map.Entry<Class<?>, k3.g<?>>> it = this.f21537j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry next = it.next();
                if (((Class) next.getKey()).isAssignableFrom(cls)) {
                    gVar = (k3.g) next.getValue();
                    break;
                }
            }
        }
        if (gVar != null) {
            return gVar;
        }
        if (!this.f21537j.isEmpty() || !this.f21544q) {
            return (s3.b) s3.b.f24912b;
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }

    public boolean g(Class<?> cls) {
        return d(cls) != null;
    }
}
