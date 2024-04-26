package e8;

import android.os.Looper;
import com.google.android.gms.internal.ads.yg;
import t1.c;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class fa implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14549a;

    public fa(int i10) {
        this.f14549a = i10;
    }

    public final void run() {
        switch (this.f14549a) {
            case 0:
                Looper.myLooper().quit();
                return;
            default:
                try {
                    yg.G.j();
                    q10 q10 = yg.G;
                    if (c.i(q10.f16056h)) {
                        q10.f16055g.execute(new s30(q10));
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    yg.I.a(2001, -1, e10);
                    return;
                }
        }
    }
}
