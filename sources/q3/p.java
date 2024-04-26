package q3;

import com.bumptech.glide.f;
import com.bumptech.glide.load.data.d;
import e.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import k3.c;
import m3.r;
import n0.d;
import q3.m;

/* compiled from: MultiModelLoader */
public class p<Model, Data> implements m<Model, Data> {

    /* renamed from: a  reason: collision with root package name */
    public final List<m<Model, Data>> f24111a;

    /* renamed from: b  reason: collision with root package name */
    public final d<List<Throwable>> f24112b;

    /* compiled from: MultiModelLoader */
    public static class a<Data> implements com.bumptech.glide.load.data.d<Data>, d.a<Data> {

        /* renamed from: a  reason: collision with root package name */
        public final List<com.bumptech.glide.load.data.d<Data>> f24113a;

        /* renamed from: b  reason: collision with root package name */
        public final n0.d<List<Throwable>> f24114b;

        /* renamed from: c  reason: collision with root package name */
        public int f24115c;

        /* renamed from: d  reason: collision with root package name */
        public f f24116d;

        /* renamed from: e  reason: collision with root package name */
        public d.a<? super Data> f24117e;

        /* renamed from: f  reason: collision with root package name */
        public List<Throwable> f24118f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f24119g;

        public a(List<com.bumptech.glide.load.data.d<Data>> list, n0.d<List<Throwable>> dVar) {
            this.f24114b = dVar;
            if (!list.isEmpty()) {
                this.f24113a = list;
                this.f24115c = 0;
                return;
            }
            throw new IllegalArgumentException("Must not be empty.");
        }

        public Class<Data> a() {
            return this.f24113a.get(0).a();
        }

        public void b() {
            List<Throwable> list = this.f24118f;
            if (list != null) {
                this.f24114b.a(list);
            }
            this.f24118f = null;
            for (com.bumptech.glide.load.data.d<Data> b10 : this.f24113a) {
                b10.b();
            }
        }

        public void c(Exception exc) {
            List<Throwable> list = this.f24118f;
            e.b(list);
            list.add(exc);
            g();
        }

        public void cancel() {
            this.f24119g = true;
            for (com.bumptech.glide.load.data.d<Data> cancel : this.f24113a) {
                cancel.cancel();
            }
        }

        public void d(Data data) {
            if (data != null) {
                this.f24117e.d(data);
            } else {
                g();
            }
        }

        public com.bumptech.glide.load.a e() {
            return this.f24113a.get(0).e();
        }

        public void f(f fVar, d.a<? super Data> aVar) {
            this.f24116d = fVar;
            this.f24117e = aVar;
            this.f24118f = this.f24114b.b();
            this.f24113a.get(this.f24115c).f(fVar, this);
            if (this.f24119g) {
                cancel();
            }
        }

        public final void g() {
            if (!this.f24119g) {
                if (this.f24115c < this.f24113a.size() - 1) {
                    this.f24115c++;
                    f(this.f24116d, this.f24117e);
                    return;
                }
                e.b(this.f24118f);
                this.f24117e.c(new r("Fetch failed", (List<Throwable>) new ArrayList(this.f24118f)));
            }
        }
    }

    public p(List<m<Model, Data>> list, n0.d<List<Throwable>> dVar) {
        this.f24111a = list;
        this.f24112b = dVar;
    }

    public m.a<Data> a(Model model, int i10, int i11, k3.e eVar) {
        m.a a10;
        int size = this.f24111a.size();
        ArrayList arrayList = new ArrayList(size);
        c cVar = null;
        for (int i12 = 0; i12 < size; i12++) {
            m mVar = this.f24111a.get(i12);
            if (mVar.b(model) && (a10 = mVar.a(model, i10, i11, eVar)) != null) {
                cVar = a10.f24104a;
                arrayList.add(a10.f24106c);
            }
        }
        if (arrayList.isEmpty() || cVar == null) {
            return null;
        }
        return new m.a<>(cVar, new a(arrayList, this.f24112b));
    }

    public boolean b(Model model) {
        for (m<Model, Data> b10 : this.f24111a) {
            if (b10.b(model)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder a10 = android.support.v4.media.a.a("MultiModelLoader{modelLoaders=");
        a10.append(Arrays.toString(this.f24111a.toArray()));
        a10.append('}');
        return a10.toString();
    }
}
