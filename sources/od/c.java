package od;

import md.d;
import md.e;
import md.f;
import ud.k;

/* compiled from: ContinuationImpl.kt */
public abstract class c extends a {

    /* renamed from: b  reason: collision with root package name */
    public final f f23685b;

    /* renamed from: c  reason: collision with root package name */
    public transient d<Object> f23686c;

    public c(d<Object> dVar, f fVar) {
        super(dVar);
        this.f23685b = fVar;
    }

    public f getContext() {
        f fVar = this.f23685b;
        k.c(fVar);
        return fVar;
    }

    public void m() {
        d<Object> dVar = this.f23686c;
        if (!(dVar == null || dVar == this)) {
            f fVar = this.f23685b;
            k.c(fVar);
            int i10 = e.X;
            f.b bVar = fVar.get(e.a.f21795a);
            k.c(bVar);
            ((e) bVar).J(dVar);
        }
        this.f23686c = b.f23684a;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(d<Object> dVar) {
        super(dVar);
        f context = dVar != null ? dVar.getContext() : null;
        this.f23685b = context;
    }
}
