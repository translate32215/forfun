package e8;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.a5;
import com.google.android.gms.internal.ads.c5;
import com.google.android.gms.internal.ads.we;
import com.google.android.gms.internal.ads.y6;
import d7.l;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class pr extends or {
    public pr(Context context) {
        this.f15838f = new c5(context, l.B.f13200q.b(), this, this);
    }

    public final void z0(Bundle bundle) {
        we weVar = we.INTERNAL_ERROR;
        synchronized (this.f15834b) {
            if (!this.f15836d) {
                this.f15836d = true;
                try {
                    this.f15838f.E().c2(this.f15837e, new qr(this));
                } catch (RemoteException | IllegalArgumentException unused) {
                    this.f15833a.c(new wr(weVar));
                } catch (Throwable th) {
                    y6 y6Var = l.B.f13190g;
                    a5.d(y6Var.f8584e, y6Var.f8585f).c(th, "RemoteSignalsClientTask.onConnected");
                    this.f15833a.c(new wr(weVar));
                }
            }
        }
    }
}
