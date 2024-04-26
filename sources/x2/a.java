package x2;

import java.util.ArrayList;
import java.util.List;
import o1.p;

/* compiled from: BaseKeyframeAnimation */
public abstract class a<K, A> {

    /* renamed from: a  reason: collision with root package name */
    public final List<b> f27249a = new ArrayList(1);

    /* renamed from: b  reason: collision with root package name */
    public boolean f27250b = false;

    /* renamed from: c  reason: collision with root package name */
    public final d<K> f27251c;

    /* renamed from: d  reason: collision with root package name */
    public float f27252d = 0.0f;

    /* renamed from: e  reason: collision with root package name */
    public p f27253e;

    /* renamed from: f  reason: collision with root package name */
    public A f27254f = null;

    /* renamed from: g  reason: collision with root package name */
    public float f27255g = -1.0f;

    /* renamed from: h  reason: collision with root package name */
    public float f27256h = -1.0f;

    /* compiled from: BaseKeyframeAnimation */
    public interface b {
        void d();
    }

    /* compiled from: BaseKeyframeAnimation */
    public static final class c<T> implements d<T> {
        public c(C0275a aVar) {
        }

        public float a() {
            return 1.0f;
        }

        public boolean b(float f10) {
            throw new IllegalStateException("not implemented");
        }

        public float c() {
            return 0.0f;
        }

        public h3.a<T> d() {
            throw new IllegalStateException("not implemented");
        }

        public boolean e(float f10) {
            return false;
        }

        public boolean isEmpty() {
            return true;
        }
    }

    /* compiled from: BaseKeyframeAnimation */
    public interface d<T> {
        float a();

        boolean b(float f10);

        float c();

        h3.a<T> d();

        boolean e(float f10);

        boolean isEmpty();
    }

    /* compiled from: BaseKeyframeAnimation */
    public static final class e<T> implements d<T> {

        /* renamed from: a  reason: collision with root package name */
        public final List<? extends h3.a<T>> f27257a;

        /* renamed from: b  reason: collision with root package name */
        public h3.a<T> f27258b;

        /* renamed from: c  reason: collision with root package name */
        public h3.a<T> f27259c = null;

        /* renamed from: d  reason: collision with root package name */
        public float f27260d = -1.0f;

        public e(List<? extends h3.a<T>> list) {
            this.f27257a = list;
            this.f27258b = f(0.0f);
        }

        public float a() {
            List<? extends h3.a<T>> list = this.f27257a;
            return ((h3.a) list.get(list.size() - 1)).b();
        }

        public boolean b(float f10) {
            h3.a<T> aVar = this.f27259c;
            h3.a<T> aVar2 = this.f27258b;
            if (aVar == aVar2 && this.f27260d == f10) {
                return true;
            }
            this.f27259c = aVar2;
            this.f27260d = f10;
            return false;
        }

        public float c() {
            return ((h3.a) this.f27257a.get(0)).c();
        }

        public h3.a<T> d() {
            return this.f27258b;
        }

        public boolean e(float f10) {
            if (this.f27258b.a(f10)) {
                return !this.f27258b.d();
            }
            this.f27258b = f(f10);
            return true;
        }

        public final h3.a<T> f(float f10) {
            List<? extends h3.a<T>> list = this.f27257a;
            h3.a<T> aVar = (h3.a) list.get(list.size() - 1);
            if (f10 >= aVar.c()) {
                return aVar;
            }
            for (int size = this.f27257a.size() - 2; size >= 1; size--) {
                h3.a<T> aVar2 = (h3.a) this.f27257a.get(size);
                if (this.f27258b != aVar2 && aVar2.a(f10)) {
                    return aVar2;
                }
            }
            return (h3.a) this.f27257a.get(0);
        }

        public boolean isEmpty() {
            return false;
        }
    }

    /* compiled from: BaseKeyframeAnimation */
    public static final class f<T> implements d<T> {

        /* renamed from: a  reason: collision with root package name */
        public final h3.a<T> f27261a;

        /* renamed from: b  reason: collision with root package name */
        public float f27262b = -1.0f;

        public f(List<? extends h3.a<T>> list) {
            this.f27261a = (h3.a) list.get(0);
        }

        public float a() {
            return this.f27261a.b();
        }

        public boolean b(float f10) {
            if (this.f27262b == f10) {
                return true;
            }
            this.f27262b = f10;
            return false;
        }

        public float c() {
            return this.f27261a.c();
        }

        public h3.a<T> d() {
            return this.f27261a;
        }

        public boolean e(float f10) {
            return !this.f27261a.d();
        }

        public boolean isEmpty() {
            return false;
        }
    }

    public a(List<? extends h3.a<K>> list) {
        d<K> dVar;
        d<K> dVar2;
        if (list.isEmpty()) {
            dVar = new c<>((C0275a) null);
        } else {
            if (list.size() == 1) {
                dVar2 = new f<>(list);
            } else {
                dVar2 = new e<>(list);
            }
            dVar = dVar2;
        }
        this.f27251c = dVar;
    }

    public h3.a<K> a() {
        h3.a<K> d10 = this.f27251c.d();
        u2.c.a("BaseKeyframeAnimation#getCurrentKeyframe");
        return d10;
    }

    public float b() {
        if (this.f27256h == -1.0f) {
            this.f27256h = this.f27251c.a();
        }
        return this.f27256h;
    }

    public float c() {
        h3.a a10 = a();
        if (a10.d()) {
            return 0.0f;
        }
        return a10.f18870d.getInterpolation(d());
    }

    public float d() {
        if (this.f27250b) {
            return 0.0f;
        }
        h3.a a10 = a();
        if (a10.d()) {
            return 0.0f;
        }
        return (this.f27252d - a10.c()) / (a10.b() - a10.c());
    }

    public A e() {
        float c10 = c();
        if (this.f27253e == null && this.f27251c.b(c10)) {
            return this.f27254f;
        }
        A f10 = f(a(), c10);
        this.f27254f = f10;
        return f10;
    }

    public abstract A f(h3.a<K> aVar, float f10);

    public void g() {
        for (int i10 = 0; i10 < this.f27249a.size(); i10++) {
            this.f27249a.get(i10).d();
        }
    }

    public void h(float f10) {
        if (!this.f27251c.isEmpty()) {
            if (this.f27255g == -1.0f) {
                this.f27255g = this.f27251c.c();
            }
            float f11 = this.f27255g;
            if (f10 < f11) {
                if (f11 == -1.0f) {
                    this.f27255g = this.f27251c.c();
                }
                f10 = this.f27255g;
            } else if (f10 > b()) {
                f10 = b();
            }
            if (f10 != this.f27252d) {
                this.f27252d = f10;
                if (this.f27251c.e(f10)) {
                    g();
                }
            }
        }
    }

    public void i(p pVar) {
        p pVar2 = this.f27253e;
        if (pVar2 != null) {
            pVar2.f22796c = null;
        }
        this.f27253e = pVar;
        if (pVar != null) {
            pVar.f22796c = this;
        }
    }
}
