package e8;

import android.os.RemoteException;
import com.google.android.gms.internal.ads.bz;
import com.google.android.gms.internal.ads.me;
import k7.a;
import l0.e;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class p00 extends a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ bz f15861a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ me f15862b;

    public p00(me meVar, bz bzVar) {
        this.f15862b = meVar;
        this.f15861a = bzVar;
    }

    public final void w() {
        if (this.f15862b.f7484f != null) {
            try {
                this.f15861a.Q();
            } catch (RemoteException e10) {
                e.F("#007 Could not call remote method.", e10);
            }
        }
    }
}
