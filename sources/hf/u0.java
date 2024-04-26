package hf;

import android.content.Context;
import android.net.wifi.p2p.WifiP2pManager;
import jf.i;
import ud.k;
import ud.l;

/* compiled from: module.kt */
public final class u0 extends l implements td.l<i<? extends Context>, WifiP2pManager> {

    /* renamed from: b  reason: collision with root package name */
    public static final u0 f19052b = new u0();

    public u0() {
        super(1);
    }

    public Object c(Object obj) {
        i iVar = (i) obj;
        k.g(iVar, "$receiver");
        Object systemService = ((Context) iVar.getContext()).getSystemService("wifip2p");
        if (systemService != null) {
            return (WifiP2pManager) systemService;
        }
        throw new kd.l("null cannot be cast to non-null type android.net.wifi.p2p.WifiP2pManager");
    }
}
