package kf;

import td.a;
import ud.l;

/* compiled from: KodeinImpl.kt */
public final class k extends l implements a<e> {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ j f20934b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(j jVar) {
        super(0);
        this.f20934b = jVar;
    }

    public Object d() {
        if (this.f20934b.f20933b.f20915a == null) {
            return this.f20934b.f20933b;
        }
        throw new IllegalStateException("Kodein has not been initialized");
    }
}
