package e8;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class f30 implements ta0<e30> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14528a;

    /* renamed from: b  reason: collision with root package name */
    public final ab0<Executor> f14529b;

    /* renamed from: c  reason: collision with root package name */
    public final ab0<c9> f14530c;

    public f30(ab0 ab0, ab0 ab02, int i10) {
        this.f14528a = i10;
        if (i10 != 1) {
            this.f14529b = ab0;
            this.f14530c = ab02;
            return;
        }
        this.f14529b = ab0;
        this.f14530c = ab02;
    }

    public final /* synthetic */ Object get() {
        switch (this.f14528a) {
            case 0:
                return new e30(this.f14529b.get(), this.f14530c.get());
            default:
                return new c30((a30) this.f14529b.get(), (z20) this.f14530c.get());
        }
    }
}
