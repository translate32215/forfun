package m3;

import k3.c;

/* compiled from: EngineResource */
public class q<Z> implements w<Z> {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f21650a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f21651b;

    /* renamed from: c  reason: collision with root package name */
    public final w<Z> f21652c;

    /* renamed from: d  reason: collision with root package name */
    public final a f21653d;

    /* renamed from: e  reason: collision with root package name */
    public final c f21654e;

    /* renamed from: f  reason: collision with root package name */
    public int f21655f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f21656g;

    /* compiled from: EngineResource */
    public interface a {
        void a(c cVar, q<?> qVar);
    }

    public q(w<Z> wVar, boolean z10, boolean z11, c cVar, a aVar) {
        if (wVar != null) {
            this.f21652c = wVar;
            this.f21650a = z10;
            this.f21651b = z11;
            this.f21654e = cVar;
            if (aVar != null) {
                this.f21653d = aVar;
                return;
            }
            throw new NullPointerException("Argument must not be null");
        }
        throw new NullPointerException("Argument must not be null");
    }

    public int a() {
        return this.f21652c.a();
    }

    public Class<Z> b() {
        return this.f21652c.b();
    }

    public synchronized void c() {
        if (this.f21655f > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        } else if (!this.f21656g) {
            this.f21656g = true;
            if (this.f21651b) {
                this.f21652c.c();
            }
        } else {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
    }

    public synchronized void d() {
        if (!this.f21656g) {
            this.f21655f++;
        } else {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
    }

    public void e() {
        boolean z10;
        synchronized (this) {
            int i10 = this.f21655f;
            if (i10 > 0) {
                z10 = true;
                int i11 = i10 - 1;
                this.f21655f = i11;
                if (i11 != 0) {
                    z10 = false;
                }
            } else {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
        }
        if (z10) {
            this.f21653d.a(this.f21654e, this);
        }
    }

    public Z get() {
        return this.f21652c.get();
    }

    public synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f21650a + ", listener=" + this.f21653d + ", key=" + this.f21654e + ", acquired=" + this.f21655f + ", isRecycled=" + this.f21656g + ", resource=" + this.f21652c + '}';
    }
}
