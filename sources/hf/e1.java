package hf;

import android.app.AppOpsManager;
import android.content.Context;
import jf.i;
import ud.k;
import ud.l;

/* compiled from: module.kt */
public final class e1 extends l implements td.l<i<? extends Context>, AppOpsManager> {

    /* renamed from: b  reason: collision with root package name */
    public static final e1 f19001b = new e1();

    public e1() {
        super(1);
    }

    public Object c(Object obj) {
        i iVar = (i) obj;
        k.g(iVar, "$receiver");
        Object systemService = ((Context) iVar.getContext()).getSystemService("appops");
        if (systemService != null) {
            return (AppOpsManager) systemService;
        }
        throw new kd.l("null cannot be cast to non-null type android.app.AppOpsManager");
    }
}
