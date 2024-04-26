package e8;

import com.google.android.gms.ads.f;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ho implements ta0<ul<f.a>> {

    /* renamed from: a  reason: collision with root package name */
    public final ab0<hp> f14926a;

    /* renamed from: b  reason: collision with root package name */
    public final ab0<Executor> f14927b;

    public ho(eo eoVar, ab0<hp> ab0, ab0<Executor> ab02) {
        this.f14926a = ab0;
        this.f14927b = ab02;
    }

    public final Object get() {
        return new ul(this.f14926a.get(), this.f14927b.get());
    }
}
