package m3;

import com.bumptech.glide.load.a;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.util.List;
import k3.c;
import m3.g;
import q3.m;

/* compiled from: DataCacheGenerator */
public class d implements g, d.a<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final List<c> f21514a;

    /* renamed from: b  reason: collision with root package name */
    public final h<?> f21515b;

    /* renamed from: c  reason: collision with root package name */
    public final g.a f21516c;

    /* renamed from: d  reason: collision with root package name */
    public int f21517d = -1;

    /* renamed from: e  reason: collision with root package name */
    public c f21518e;

    /* renamed from: f  reason: collision with root package name */
    public List<m<File, ?>> f21519f;

    /* renamed from: g  reason: collision with root package name */
    public int f21520g;

    /* renamed from: h  reason: collision with root package name */
    public volatile m.a<?> f21521h;

    /* renamed from: i  reason: collision with root package name */
    public File f21522i;

    public d(h<?> hVar, g.a aVar) {
        List<c> a10 = hVar.a();
        this.f21514a = a10;
        this.f21515b = hVar;
        this.f21516c = aVar;
    }

    public void c(Exception exc) {
        this.f21516c.c(this.f21518e, exc, this.f21521h.f24106c, a.DATA_DISK_CACHE);
    }

    public void cancel() {
        m.a<?> aVar = this.f21521h;
        if (aVar != null) {
            aVar.f24106c.cancel();
        }
    }

    public void d(Object obj) {
        this.f21516c.b(this.f21518e, obj, this.f21521h.f24106c, a.DATA_DISK_CACHE, this.f21518e);
    }

    public boolean e() {
        while (true) {
            List<m<File, ?>> list = this.f21519f;
            if (list != null) {
                if (this.f21520g < list.size()) {
                    this.f21521h = null;
                    boolean z10 = false;
                    while (!z10) {
                        if (!(this.f21520g < this.f21519f.size())) {
                            break;
                        }
                        List<m<File, ?>> list2 = this.f21519f;
                        int i10 = this.f21520g;
                        this.f21520g = i10 + 1;
                        File file = this.f21522i;
                        h<?> hVar = this.f21515b;
                        this.f21521h = list2.get(i10).a(file, hVar.f21532e, hVar.f21533f, hVar.f21536i);
                        if (this.f21521h != null && this.f21515b.g(this.f21521h.f24106c.a())) {
                            this.f21521h.f24106c.f(this.f21515b.f21542o, this);
                            z10 = true;
                        }
                    }
                    return z10;
                }
            }
            int i11 = this.f21517d + 1;
            this.f21517d = i11;
            if (i11 >= this.f21514a.size()) {
                return false;
            }
            c cVar = this.f21514a.get(this.f21517d);
            h<?> hVar2 = this.f21515b;
            File b10 = hVar2.b().b(new e(cVar, hVar2.f21541n));
            this.f21522i = b10;
            if (b10 != null) {
                this.f21518e = cVar;
                this.f21519f = this.f21515b.f21530c.f4909b.f(b10);
                this.f21520g = 0;
            }
        }
    }

    public d(List<c> list, h<?> hVar, g.a aVar) {
        this.f21514a = list;
        this.f21515b = hVar;
        this.f21516c = aVar;
    }
}
