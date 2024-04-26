package h4;

import android.util.Log;
import h4.d;

/* compiled from: FactoryPools */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final e<Object> f18885a = new C0155a();

    /* renamed from: h4.a$a  reason: collision with other inner class name */
    /* compiled from: FactoryPools */
    public class C0155a implements e<Object> {
        public void a(Object obj) {
        }
    }

    /* compiled from: FactoryPools */
    public interface b<T> {
        T a();
    }

    /* compiled from: FactoryPools */
    public static final class c<T> implements n0.d<T> {

        /* renamed from: a  reason: collision with root package name */
        public final b<T> f18886a;

        /* renamed from: b  reason: collision with root package name */
        public final e<T> f18887b;

        /* renamed from: c  reason: collision with root package name */
        public final n0.d<T> f18888c;

        public c(n0.d<T> dVar, b<T> bVar, e<T> eVar) {
            this.f18888c = dVar;
            this.f18886a = bVar;
            this.f18887b = eVar;
        }

        public boolean a(T t10) {
            if (t10 instanceof d) {
                ((d.b) ((d) t10).f()).f18889a = true;
            }
            this.f18887b.a(t10);
            return this.f18888c.a(t10);
        }

        public T b() {
            T b10 = this.f18888c.b();
            if (b10 == null) {
                b10 = this.f18886a.a();
                if (Log.isLoggable("FactoryPools", 2)) {
                    StringBuilder a10 = android.support.v4.media.a.a("Created new ");
                    a10.append(b10.getClass());
                    Log.v("FactoryPools", a10.toString());
                }
            }
            if (b10 instanceof d) {
                ((d.b) ((d) b10).f()).f18889a = false;
            }
            return b10;
        }
    }

    /* compiled from: FactoryPools */
    public interface d {
        d f();
    }

    /* compiled from: FactoryPools */
    public interface e<T> {
        void a(T t10);
    }

    public static <T extends d> n0.d<T> a(int i10, b<T> bVar) {
        return new c(new n0.e(i10), bVar, f18885a);
    }
}
