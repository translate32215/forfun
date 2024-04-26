package x4;

import v6.b;
import v6.r;
import v6.y;

/* compiled from: DefaultMediaClock */
public final class k implements r {

    /* renamed from: a  reason: collision with root package name */
    public final y f27635a;

    /* renamed from: b  reason: collision with root package name */
    public final a f27636b;

    /* renamed from: c  reason: collision with root package name */
    public v0 f27637c;

    /* renamed from: d  reason: collision with root package name */
    public r f27638d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f27639e = true;

    /* renamed from: f  reason: collision with root package name */
    public boolean f27640f;

    /* compiled from: DefaultMediaClock */
    public interface a {
    }

    public k(a aVar, b bVar) {
        this.f27636b = aVar;
        this.f27635a = new y(bVar);
    }

    public o0 f() {
        r rVar = this.f27638d;
        if (rVar != null) {
            return rVar.f();
        }
        return this.f27635a.f26542e;
    }

    public void i(o0 o0Var) {
        r rVar = this.f27638d;
        if (rVar != null) {
            rVar.i(o0Var);
            o0Var = this.f27638d.f();
        }
        this.f27635a.i(o0Var);
    }

    public long x() {
        if (this.f27639e) {
            return this.f27635a.x();
        }
        r rVar = this.f27638d;
        rVar.getClass();
        return rVar.x();
    }
}
