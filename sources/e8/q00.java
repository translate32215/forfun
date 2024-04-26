package e8;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.jy;
import com.google.android.gms.internal.ads.ne;
import k7.a;
import l0.e;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class q00 extends a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ jy f16046a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ne f16047b;

    public q00(ne neVar, jy jyVar) {
        this.f16047b = neVar;
        this.f16046a = jyVar;
    }

    public final void w() {
        if (this.f16047b.f7576e != null) {
            try {
                this.f16046a.Q();
            } catch (RemoteException e10) {
                e.F("#007 Could not call remote method.", e10);
            }
        }
    }
}
