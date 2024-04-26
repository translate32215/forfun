package e8;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.internal.ads.gv;
import com.google.android.gms.internal.ads.jv;
import l0.e;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ih0 implements b.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ gv f15048a;

    public ih0(gv gvVar) {
        this.f15048a = gvVar;
    }

    public final void Y(int i10) {
        synchronized (this.f15048a.f6705b) {
            gv gvVar = this.f15048a;
            gvVar.f6708e = null;
            gvVar.f6705b.notifyAll();
        }
    }

    public final void z0(Bundle bundle) {
        synchronized (this.f15048a.f6705b) {
            try {
                gv gvVar = this.f15048a;
                lh0 lh0 = gvVar.f6706c;
                if (lh0 != null) {
                    gvVar.f6708e = (jv) lh0.v();
                }
            } catch (DeadObjectException e10) {
                e.C("Unable to obtain a cache service instance.", e10);
                gv.d(this.f15048a);
            }
            this.f15048a.f6705b.notifyAll();
        }
    }
}
