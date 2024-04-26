package hf;

import android.content.Context;
import android.net.wifi.WifiManager;
import jf.i;
import ud.k;
import ud.l;

/* compiled from: module.kt */
public final class v0 extends l implements td.l<i<? extends Context>, WifiManager> {

    /* renamed from: b  reason: collision with root package name */
    public static final v0 f19055b = new v0();

    public v0() {
        super(1);
    }

    public Object c(Object obj) {
        i iVar = (i) obj;
        k.g(iVar, "$receiver");
        Object systemService = ((Context) iVar.getContext()).getSystemService("wifi");
        if (systemService != null) {
            return (WifiManager) systemService;
        }
        throw new kd.l("null cannot be cast to non-null type android.net.wifi.WifiManager");
    }
}
