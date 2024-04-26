package f7;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.ads.internal.util.p;
import com.google.android.gms.internal.ads.a5;
import com.google.android.gms.internal.ads.y6;
import d7.l;
import e8.d40;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class e0 extends d40 {
    public e0(Looper looper) {
        super(looper);
    }

    public final void a(Message message) {
        try {
            super.a(message);
        } catch (Throwable th) {
            p pVar = l.B.f13186c;
            p.g(l.B.f13190g.f8584e, th);
            throw th;
        }
    }

    public final void handleMessage(Message message) {
        try {
            super.handleMessage(message);
        } catch (Exception e10) {
            y6 y6Var = l.B.f13190g;
            a5.d(y6Var.f8584e, y6Var.f8585f).c(e10, "AdMobHandler.handleMessage");
        }
    }
}
