package f7;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.ads.internal.util.p;
import e8.sg0;
import p.a;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class k0 extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f18299a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f18300b;

    public k0(sg0 sg0) {
        this.f18299a = 1;
        this.f18300b = sg0;
    }

    public final void onReceive(Context context, Intent intent) {
        switch (this.f18299a) {
            case 0:
                if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
                    ((p) this.f18300b).f5705c = true;
                    return;
                } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                    ((p) this.f18300b).f5705c = false;
                    return;
                } else {
                    return;
                }
            default:
                int i10 = sg0.f16472x;
                ((sg0) this.f18300b).c(3);
                return;
        }
    }

    public k0(p pVar, a aVar) {
        this.f18299a = 0;
        this.f18299a = 0;
        this.f18300b = pVar;
    }
}
