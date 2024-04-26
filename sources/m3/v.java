package m3;

import e.e;
import h4.a;
import h4.d;
import n0.d;

/* compiled from: LockedResource */
public final class v<Z> implements w<Z>, a.d {

    /* renamed from: e  reason: collision with root package name */
    public static final d<v<?>> f21670e = h4.a.a(20, new a());

    /* renamed from: a  reason: collision with root package name */
    public final h4.d f21671a = new d.b();

    /* renamed from: b  reason: collision with root package name */
    public w<Z> f21672b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f21673c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f21674d;

    /* compiled from: LockedResource */
    public class a implements a.b<v<?>> {
        public Object a() {
            return new v();
        }
    }

    public static <Z> v<Z> d(w<Z> wVar) {
        v<Z> vVar = (v) ((a.c) f21670e).b();
        e.b(vVar);
        v<Z> vVar2 = vVar;
        vVar2.f21674d = false;
        vVar2.f21673c = true;
        vVar2.f21672b = wVar;
        return vVar2;
    }

    public int a() {
        return this.f21672b.a();
    }

    public Class<Z> b() {
        return this.f21672b.b();
    }

    public synchronized void c() {
        this.f21671a.a();
        this.f21674d = true;
        if (!this.f21673c) {
            this.f21672b.c();
            this.f21672b = null;
            ((a.c) f21670e).a(this);
        }
    }

    public synchronized void e() {
        this.f21671a.a();
        if (this.f21673c) {
            this.f21673c = false;
            if (this.f21674d) {
                c();
            }
        } else {
            throw new IllegalStateException("Already unlocked");
        }
    }

    public h4.d f() {
        return this.f21671a;
    }

    public Z get() {
        return this.f21672b.get();
    }
}
