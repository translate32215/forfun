package e8;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.x4;
import com.google.android.gms.internal.ads.zh;
import java.util.Collections;
import l0.e;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ph implements zh<Void> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f16002a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f16003b;

    public ph(x4 x4Var) {
        this.f16003b = x4Var;
    }

    public final /* synthetic */ void a(Object obj) {
        switch (this.f16002a) {
            case 0:
                Void voidR = (Void) obj;
                ((mh) this.f16003b).f15517f.m(true);
                return;
            default:
                try {
                    ((x4) this.f16003b).V5(Collections.singletonList((Uri) obj));
                    return;
                } catch (RemoteException e10) {
                    e.C("", e10);
                    return;
                }
        }
    }

    public final void n(Throwable th) {
        switch (this.f16002a) {
            case 0:
                ((mh) this.f16003b).f15517f.m(false);
                return;
            default:
                try {
                    x4 x4Var = (x4) this.f16003b;
                    String valueOf = String.valueOf(th.getMessage());
                    x4Var.s0(valueOf.length() != 0 ? "Internal error: ".concat(valueOf) : new String("Internal error: "));
                    return;
                } catch (RemoteException e10) {
                    e.C("", e10);
                    return;
                }
        }
    }

    public ph(mh mhVar) {
        this.f16003b = mhVar;
    }
}
