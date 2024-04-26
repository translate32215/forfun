package e8;

import android.os.Bundle;
import com.google.android.gms.internal.ads.b9;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class hi implements ta0<Bundle> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14917a;

    /* renamed from: b  reason: collision with root package name */
    public final b9 f14918b;

    public hi(b9 b9Var, int i10) {
        this.f14917a = i10;
        if (i10 != 1) {
            this.f14918b = b9Var;
        } else {
            this.f14918b = b9Var;
        }
    }

    public static hi a(b9 b9Var) {
        return new hi(b9Var, 0);
    }

    public static hi b(b9 b9Var) {
        return new hi(b9Var, 1);
    }

    public static w00 c(b9 b9Var) {
        w00 w00 = b9Var.f5998b;
        jc0.b(w00, "Cannot return null from a non-@Nullable @Provides method");
        return w00;
    }

    public final Object get() {
        switch (this.f14917a) {
            case 0:
                return this.f14918b.f5999c;
            default:
                return c(this.f14918b);
        }
    }
}
