package hf;

import android.app.admin.DevicePolicyManager;
import android.content.Context;
import jf.i;
import ud.k;
import ud.l;

/* compiled from: module.kt */
public final class z extends l implements td.l<i<? extends Context>, DevicePolicyManager> {

    /* renamed from: b  reason: collision with root package name */
    public static final z f19066b = new z();

    public z() {
        super(1);
    }

    public Object c(Object obj) {
        i iVar = (i) obj;
        k.g(iVar, "$receiver");
        Object systemService = ((Context) iVar.getContext()).getSystemService("device_policy");
        if (systemService != null) {
            return (DevicePolicyManager) systemService;
        }
        throw new kd.l("null cannot be cast to non-null type android.app.admin.DevicePolicyManager");
    }
}
