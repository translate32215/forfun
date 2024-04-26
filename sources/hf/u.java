package hf;

import android.app.ActivityManager;
import android.content.Context;
import jf.i;
import ud.k;
import ud.l;

/* compiled from: module.kt */
public final class u extends l implements td.l<i<? extends Context>, ActivityManager> {

    /* renamed from: b  reason: collision with root package name */
    public static final u f19051b = new u();

    public u() {
        super(1);
    }

    public Object c(Object obj) {
        i iVar = (i) obj;
        k.g(iVar, "$receiver");
        Object systemService = ((Context) iVar.getContext()).getSystemService("activity");
        if (systemService != null) {
            return (ActivityManager) systemService;
        }
        throw new kd.l("null cannot be cast to non-null type android.app.ActivityManager");
    }
}
