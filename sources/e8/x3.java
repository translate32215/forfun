package e8;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.internal.ads.d7;
import com.google.android.gms.internal.ads.r1;
import com.google.android.gms.internal.ads.t1;
import l0.d;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class x3 implements b.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d7 f17435a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ t1 f17436b;

    public x3(t1 t1Var, d7 d7Var) {
        this.f17436b = t1Var;
        this.f17435a = d7Var;
    }

    public final void Y(int i10) {
        this.f17435a.c(new RuntimeException(d.a(34, "onConnectionSuspended: ", i10)));
    }

    public final void z0(Bundle bundle) {
        try {
            this.f17435a.b((r1) this.f17436b.f8173a.v());
        } catch (DeadObjectException e10) {
            this.f17435a.c(e10);
        }
    }
}
