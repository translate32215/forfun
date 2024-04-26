package z3;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.p;
import d7.l;
import e8.wh0;
import z7.h;

/* compiled from: FirstFrameWaiter */
public class i implements j {
    public i(int i10) {
    }

    public static void b(Context context, AdOverlayInfoParcel adOverlayInfoParcel, boolean z10) {
        if (adOverlayInfoParcel.f5617s == 4 && adOverlayInfoParcel.f5609c == null) {
            wh0 wh0 = adOverlayInfoParcel.f5608b;
            if (wh0 != null) {
                wh0.n();
            }
            b bVar = l.B.f13184a;
            b.d(context, adOverlayInfoParcel.f5607a, adOverlayInfoParcel.f5615i);
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.ads.AdActivity");
        intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", adOverlayInfoParcel.f5619u.f14547d);
        intent.putExtra("shouldCallOnOverlayOpened", z10);
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", adOverlayInfoParcel);
        intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
        if (!h.c()) {
            intent.addFlags(524288);
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        p pVar = l.B.f13186c;
        p.e(context, intent);
    }

    public void a(Activity activity) {
    }
}
