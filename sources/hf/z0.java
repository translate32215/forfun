package hf;

import android.content.Context;
import android.net.nsd.NsdManager;
import jf.i;
import ud.k;
import ud.l;

/* compiled from: module.kt */
public final class z0 extends l implements td.l<i<? extends Context>, NsdManager> {

    /* renamed from: b  reason: collision with root package name */
    public static final z0 f19067b = new z0();

    public z0() {
        super(1);
    }

    public Object c(Object obj) {
        i iVar = (i) obj;
        k.g(iVar, "$receiver");
        Object systemService = ((Context) iVar.getContext()).getSystemService("servicediscovery");
        if (systemService != null) {
            return (NsdManager) systemService;
        }
        throw new kd.l("null cannot be cast to non-null type android.net.nsd.NsdManager");
    }
}
