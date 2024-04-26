package e8;

import android.app.Activity;
import android.os.RemoteException;
import c8.a;
import c8.b;
import com.google.android.gms.internal.ads.bv;
import com.google.android.gms.internal.ads.dy;
import com.google.android.gms.internal.ads.ev;
import com.google.android.gms.internal.ads.gz;
import com.google.android.gms.internal.ads.u8;
import com.google.android.gms.internal.ads.zu;
import l0.e;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class yf extends zu {

    /* renamed from: a  reason: collision with root package name */
    public final u8 f17623a;

    /* renamed from: b  reason: collision with root package name */
    public final dy f17624b;

    /* renamed from: c  reason: collision with root package name */
    public final hz f17625c;

    public yf(u8 u8Var, dy dyVar, hz hzVar) {
        this.f17623a = u8Var;
        this.f17624b = dyVar;
        this.f17625c = hzVar;
    }

    public final void A3(a aVar, ev evVar) {
        try {
            this.f17625c.f14960d.set(evVar);
            this.f17623a.c((Activity) b.z0(aVar), evVar);
        } catch (RemoteException e10) {
            e.F("#007 Could not call remote method.", e10);
        }
    }

    public final gz B() {
        if (!((Boolean) ti0.f16763j.f16769f.a(t.Y3)).booleanValue()) {
            return null;
        }
        return this.f17623a.f13729f;
    }

    public final dy R5() {
        return this.f17624b;
    }

    public final void i6(bv bvVar) {
    }
}
