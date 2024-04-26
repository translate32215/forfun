package hf;

import android.content.Context;
import android.telephony.SubscriptionManager;
import jf.i;
import ud.k;
import ud.l;

/* compiled from: module.kt */
public final class t1 extends l implements td.l<i<? extends Context>, SubscriptionManager> {

    /* renamed from: b  reason: collision with root package name */
    public static final t1 f19050b = new t1();

    public t1() {
        super(1);
    }

    public Object c(Object obj) {
        i iVar = (i) obj;
        k.g(iVar, "$receiver");
        Object systemService = ((Context) iVar.getContext()).getSystemService("telephony_subscription_service");
        if (systemService != null) {
            return (SubscriptionManager) systemService;
        }
        throw new kd.l("null cannot be cast to non-null type android.telephony.SubscriptionManager");
    }
}
