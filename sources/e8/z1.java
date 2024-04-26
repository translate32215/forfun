package e8;

import a7.c;
import a7.j;
import android.content.Context;
import android.os.RemoteException;
import c8.b;
import com.google.android.gms.internal.ads.l0;
import l0.e;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class z1 implements j {

    /* renamed from: a  reason: collision with root package name */
    public final l0 f17680a;

    public z1(l0 l0Var) {
        this.f17680a = l0Var;
        Context context = null;
        try {
            context = (Context) b.z0(l0Var.s5());
        } catch (RemoteException | NullPointerException e10) {
            e.C("", e10);
        }
        if (context != null) {
            try {
                this.f17680a.W0(new b(new c(context)));
            } catch (RemoteException e11) {
                e.C("", e11);
            }
        }
    }
}
