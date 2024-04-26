package m3;

import com.bumptech.glide.load.a;
import com.bumptech.glide.load.data.d;
import g4.i;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import k3.c;
import m3.g;
import q3.m;
import q3.o;

/* compiled from: ResourceCacheGenerator */
public class x implements g, d.a<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final g.a f21675a;

    /* renamed from: b  reason: collision with root package name */
    public final h<?> f21676b;

    /* renamed from: c  reason: collision with root package name */
    public int f21677c;

    /* renamed from: d  reason: collision with root package name */
    public int f21678d = -1;

    /* renamed from: e  reason: collision with root package name */
    public c f21679e;

    /* renamed from: f  reason: collision with root package name */
    public List<m<File, ?>> f21680f;

    /* renamed from: g  reason: collision with root package name */
    public int f21681g;

    /* renamed from: h  reason: collision with root package name */
    public volatile m.a<?> f21682h;

    /* renamed from: i  reason: collision with root package name */
    public File f21683i;

    /* renamed from: r  reason: collision with root package name */
    public y f21684r;

    public x(h<?> hVar, g.a aVar) {
        this.f21676b = hVar;
        this.f21675a = aVar;
    }

    public void c(Exception exc) {
        this.f21675a.c(this.f21684r, exc, this.f21682h.f24106c, a.RESOURCE_DISK_CACHE);
    }

    public void cancel() {
        m.a<?> aVar = this.f21682h;
        if (aVar != null) {
            aVar.f24106c.cancel();
        }
    }

    public void d(Object obj) {
        this.f21675a.b(this.f21679e, obj, this.f21682h.f24106c, a.RESOURCE_DISK_CACHE, this.f21684r);
    }

    public boolean e() {
        List list;
        List<Class<?>> d10;
        List<c> a10 = this.f21676b.a();
        if (a10.isEmpty()) {
            return false;
        }
        h<?> hVar = this.f21676b;
        com.bumptech.glide.g gVar = hVar.f21530c.f4909b;
        Class<?> cls = hVar.f21531d.getClass();
        Class<?> cls2 = hVar.f21534g;
        Class<Transcode> cls3 = hVar.f21538k;
        t tVar = gVar.f4932h;
        i iVar = (i) ((AtomicReference) tVar.f21665a).getAndSet((Object) null);
        if (iVar == null) {
            iVar = new i(cls, cls2, cls3);
        } else {
            iVar.f18464a = cls;
            iVar.f18465b = cls2;
            iVar.f18466c = cls3;
        }
        synchronized (((s.a) tVar.f21666b)) {
            list = (List) ((s.a) tVar.f21666b).getOrDefault(iVar, null);
        }
        ((AtomicReference) tVar.f21665a).set(iVar);
        ArrayList arrayList = list;
        if (list == null) {
            ArrayList arrayList2 = new ArrayList();
            o oVar = gVar.f4925a;
            synchronized (oVar) {
                d10 = oVar.f24107a.d(cls);
            }
            Iterator it = ((ArrayList) d10).iterator();
            while (it.hasNext()) {
                Iterator it2 = ((ArrayList) gVar.f4927c.b((Class) it.next(), cls2)).iterator();
                while (it2.hasNext()) {
                    Class cls4 = (Class) it2.next();
                    if (!((ArrayList) gVar.f4930f.a(cls4, cls3)).isEmpty() && !arrayList2.contains(cls4)) {
                        arrayList2.add(cls4);
                    }
                }
            }
            t tVar2 = gVar.f4932h;
            List unmodifiableList = Collections.unmodifiableList(arrayList2);
            synchronized (((s.a) tVar2.f21666b)) {
                ((s.a) tVar2.f21666b).put(new i(cls, cls2, cls3), unmodifiableList);
            }
            arrayList = arrayList2;
        }
        if (!arrayList.isEmpty()) {
            while (true) {
                List<m<File, ?>> list2 = this.f21680f;
                if (list2 != null) {
                    if (this.f21681g < list2.size()) {
                        this.f21682h = null;
                        boolean z10 = false;
                        while (!z10) {
                            if (!(this.f21681g < this.f21680f.size())) {
                                break;
                            }
                            List<m<File, ?>> list3 = this.f21680f;
                            int i10 = this.f21681g;
                            this.f21681g = i10 + 1;
                            File file = this.f21683i;
                            h<?> hVar2 = this.f21676b;
                            this.f21682h = list3.get(i10).a(file, hVar2.f21532e, hVar2.f21533f, hVar2.f21536i);
                            if (this.f21682h != null && this.f21676b.g(this.f21682h.f24106c.a())) {
                                this.f21682h.f24106c.f(this.f21676b.f21542o, this);
                                z10 = true;
                            }
                        }
                        return z10;
                    }
                }
                int i11 = this.f21678d + 1;
                this.f21678d = i11;
                if (i11 >= arrayList.size()) {
                    int i12 = this.f21677c + 1;
                    this.f21677c = i12;
                    if (i12 >= a10.size()) {
                        return false;
                    }
                    this.f21678d = 0;
                }
                c cVar = a10.get(this.f21677c);
                Class cls5 = (Class) arrayList.get(this.f21678d);
                k3.g<Z> f10 = this.f21676b.f(cls5);
                h<?> hVar3 = this.f21676b;
                this.f21684r = new y(hVar3.f21530c.f4908a, cVar, hVar3.f21541n, hVar3.f21532e, hVar3.f21533f, f10, cls5, hVar3.f21536i);
                File b10 = hVar3.b().b(this.f21684r);
                this.f21683i = b10;
                if (b10 != null) {
                    this.f21679e = cVar;
                    this.f21680f = this.f21676b.f21530c.f4909b.f(b10);
                    this.f21681g = 0;
                }
            }
        } else if (File.class.equals(this.f21676b.f21538k)) {
            return false;
        } else {
            StringBuilder a11 = android.support.v4.media.a.a("Failed to find any load path from ");
            a11.append(this.f21676b.f21531d.getClass());
            a11.append(" to ");
            a11.append(this.f21676b.f21538k);
            throw new IllegalStateException(a11.toString());
        }
    }
}
