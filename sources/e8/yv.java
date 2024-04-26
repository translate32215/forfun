package e8;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.c2;
import l0.e;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final /* synthetic */ class yv implements pi {

    /* renamed from: a  reason: collision with root package name */
    public final ov f17669a;

    /* renamed from: b  reason: collision with root package name */
    public final c2 f17670b;

    public yv(ov ovVar, c2 c2Var) {
        this.f17669a = ovVar;
        this.f17670b = c2Var;
    }

    public final void j0(zh0 zh0) {
        ov ovVar = this.f17669a;
        c2 c2Var = this.f17670b;
        ovVar.j0(zh0);
        if (c2Var != null) {
            try {
                c2Var.z4(zh0);
            } catch (RemoteException e10) {
                e.F("#007 Could not call remote method.", e10);
            }
        }
        if (c2Var != null) {
            try {
                c2Var.V4(zh0.f17753a);
            } catch (RemoteException e11) {
                e.F("#007 Could not call remote method.", e11);
            }
        }
    }
}
