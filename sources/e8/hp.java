package e8;

import android.os.RemoteException;
import com.google.android.gms.ads.f;
import com.google.android.gms.internal.ads.hz;
import com.google.android.gms.internal.ads.mz;
import l0.e;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class hp extends f.a {

    /* renamed from: a  reason: collision with root package name */
    public final jn f14928a;

    public hp(jn jnVar) {
        this.f14928a = jnVar;
    }

    public static mz d(jn jnVar) {
        hz h10 = jnVar.h();
        if (h10 == null) {
            return null;
        }
        try {
            return h10.R1();
        } catch (RemoteException unused) {
            return null;
        }
    }

    public final void a() {
        mz d10 = d(this.f14928a);
        if (d10 != null) {
            try {
                d10.y0();
            } catch (RemoteException e10) {
                e.D("Unable to call onVideoEnd()", e10);
            }
        }
    }

    public final void b() {
        mz d10 = d(this.f14928a);
        if (d10 != null) {
            try {
                d10.a0();
            } catch (RemoteException e10) {
                e.D("Unable to call onVideoEnd()", e10);
            }
        }
    }

    public final void c() {
        mz d10 = d(this.f14928a);
        if (d10 != null) {
            try {
                d10.a2();
            } catch (RemoteException e10) {
                e.D("Unable to call onVideoEnd()", e10);
            }
        }
    }
}
