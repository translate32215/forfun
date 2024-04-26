package hf;

import android.app.UiModeManager;
import android.content.Context;
import jf.i;
import ud.k;
import ud.l;

/* compiled from: module.kt */
public final class q0 extends l implements td.l<i<? extends Context>, UiModeManager> {

    /* renamed from: b  reason: collision with root package name */
    public static final q0 f19040b = new q0();

    public q0() {
        super(1);
    }

    public Object c(Object obj) {
        i iVar = (i) obj;
        k.g(iVar, "$receiver");
        Object systemService = ((Context) iVar.getContext()).getSystemService("uimode");
        if (systemService != null) {
            return (UiModeManager) systemService;
        }
        throw new kd.l("null cannot be cast to non-null type android.app.UiModeManager");
    }
}
