package hf;

import android.app.NotificationManager;
import android.content.Context;
import jf.i;
import ud.k;
import ud.l;

/* compiled from: module.kt */
public final class i0 extends l implements td.l<i<? extends Context>, NotificationManager> {

    /* renamed from: b  reason: collision with root package name */
    public static final i0 f19016b = new i0();

    public i0() {
        super(1);
    }

    public Object c(Object obj) {
        i iVar = (i) obj;
        k.g(iVar, "$receiver");
        Object systemService = ((Context) iVar.getContext()).getSystemService("notification");
        if (systemService != null) {
            return (NotificationManager) systemService;
        }
        throw new kd.l("null cannot be cast to non-null type android.app.NotificationManager");
    }
}
