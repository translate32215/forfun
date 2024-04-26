package q3;

import com.bumptech.glide.f;
import com.bumptech.glide.load.data.d;
import k3.e;
import q3.m;

/* compiled from: UnitModelLoader */
public class t<Model> implements m<Model, Model> {

    /* renamed from: a  reason: collision with root package name */
    public static final t<?> f24136a = new t<>();

    /* compiled from: UnitModelLoader */
    public static class a<Model> implements n<Model, Model> {

        /* renamed from: a  reason: collision with root package name */
        public static final a<?> f24137a = new a<>();

        public m<Model, Model> a(q qVar) {
            return t.f24136a;
        }
    }

    /* compiled from: UnitModelLoader */
    public static class b<Model> implements d<Model> {

        /* renamed from: a  reason: collision with root package name */
        public final Model f24138a;

        public b(Model model) {
            this.f24138a = model;
        }

        public Class<Model> a() {
            return this.f24138a.getClass();
        }

        public void b() {
        }

        public void cancel() {
        }

        public com.bumptech.glide.load.a e() {
            return com.bumptech.glide.load.a.LOCAL;
        }

        public void f(f fVar, d.a<? super Model> aVar) {
            aVar.d(this.f24138a);
        }
    }

    public m.a<Model> a(Model model, int i10, int i11, e eVar) {
        return new m.a<>(new f4.b(model), new b(model));
    }

    public boolean b(Model model) {
        return true;
    }
}
