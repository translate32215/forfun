package e8;

import android.content.Context;
import com.google.android.gms.internal.ads.x9;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class pm implements ta0<j8> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f16008a;

    /* renamed from: b  reason: collision with root package name */
    public final ab0<Context> f16009b;

    /* renamed from: c  reason: collision with root package name */
    public final ab0<w00> f16010c;

    public pm(gf0 gf0, ab0 ab0, ab0 ab02, int i10) {
        this.f16008a = i10;
        if (i10 != 1) {
            this.f16009b = ab0;
            this.f16010c = ab02;
            return;
        }
        this.f16009b = ab0;
        this.f16010c = ab02;
    }

    public static pm a(gf0 gf0, ab0<Context> ab0, ab0<w00> ab02) {
        return new pm(gf0, ab0, ab02, 0);
    }

    public static pm b(gf0 gf0, ab0<x9> ab0, ab0<Executor> ab02) {
        return new pm(gf0, ab0, ab02, 1);
    }

    public final Object get() {
        switch (this.f16008a) {
            case 0:
                return new j8(this.f16009b.get(), this.f16010c.get().f17192f);
            default:
                return new ul((x9) this.f16009b.get(), (Executor) this.f16010c.get());
        }
    }
}
