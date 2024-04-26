package hf;

import android.app.usage.NetworkStatsManager;
import android.content.Context;
import jf.i;
import ud.k;
import ud.l;

/* compiled from: module.kt */
public final class z1 extends l implements td.l<i<? extends Context>, NetworkStatsManager> {

    /* renamed from: b  reason: collision with root package name */
    public static final z1 f19068b = new z1();

    public z1() {
        super(1);
    }

    public Object c(Object obj) {
        i iVar = (i) obj;
        k.g(iVar, "$receiver");
        Object systemService = ((Context) iVar.getContext()).getSystemService("netstats");
        if (systemService != null) {
            return (NetworkStatsManager) systemService;
        }
        throw new kd.l("null cannot be cast to non-null type android.app.usage.NetworkStatsManager");
    }
}
