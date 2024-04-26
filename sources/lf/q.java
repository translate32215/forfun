package lf;

import kd.o;
import ud.l;

/* compiled from: KotlinExtensions.kt */
public final class q extends l implements td.l<Throwable, o> {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b f21373b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q(b bVar) {
        super(1);
        this.f21373b = bVar;
    }

    public Object c(Object obj) {
        Throwable th = (Throwable) obj;
        this.f21373b.cancel();
        return o.f20627a;
    }
}
