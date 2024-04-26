package hf;

import android.app.usage.UsageStatsManager;
import android.content.Context;
import jf.i;
import ud.k;
import ud.l;

/* compiled from: module.kt */
public final class u1 extends l implements td.l<i<? extends Context>, UsageStatsManager> {

    /* renamed from: b  reason: collision with root package name */
    public static final u1 f19053b = new u1();

    public u1() {
        super(1);
    }

    public Object c(Object obj) {
        i iVar = (i) obj;
        k.g(iVar, "$receiver");
        Object systemService = ((Context) iVar.getContext()).getSystemService("usagestats");
        if (systemService != null) {
            return (UsageStatsManager) systemService;
        }
        throw new kd.l("null cannot be cast to non-null type android.app.usage.UsageStatsManager");
    }
}
