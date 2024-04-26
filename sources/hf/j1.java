package hf;

import android.content.Context;
import android.os.BatteryManager;
import jf.i;
import ud.k;
import ud.l;

/* compiled from: module.kt */
public final class j1 extends l implements td.l<i<? extends Context>, BatteryManager> {

    /* renamed from: b  reason: collision with root package name */
    public static final j1 f19020b = new j1();

    public j1() {
        super(1);
    }

    public Object c(Object obj) {
        i iVar = (i) obj;
        k.g(iVar, "$receiver");
        Object systemService = ((Context) iVar.getContext()).getSystemService("batterymanager");
        if (systemService != null) {
            return (BatteryManager) systemService;
        }
        throw new kd.l("null cannot be cast to non-null type android.os.BatteryManager");
    }
}
