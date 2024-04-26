package lf;

import ud.l;

/* compiled from: KotlinExtensions.kt */
public final class o extends l implements td.l<Throwable, kd.o> {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b f21371b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o(b bVar) {
        super(1);
        this.f21371b = bVar;
    }

    public Object c(Object obj) {
        Throwable th = (Throwable) obj;
        this.f21371b.cancel();
        return kd.o.f20627a;
    }
}
