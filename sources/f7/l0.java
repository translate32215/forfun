package f7;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.ads.internal.util.p;
import com.google.android.gms.internal.ads.b7;
import e.i;
import l0.e;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class l0 extends BroadcastReceiver {
    public l0(p pVar) {
    }

    public final void onReceive(Context context, Intent intent) {
        synchronized (b7.f5991b) {
            b7.f5992c = false;
            b7.f5993d = false;
            e.K("Ad debug logging enablement is out of date.");
        }
        i.h(context);
    }
}
