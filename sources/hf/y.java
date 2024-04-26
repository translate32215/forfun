package hf;

import android.content.Context;
import android.net.ConnectivityManager;
import jf.i;
import ud.k;
import ud.l;

/* compiled from: module.kt */
public final class y extends l implements td.l<i<? extends Context>, ConnectivityManager> {

    /* renamed from: b  reason: collision with root package name */
    public static final y f19063b = new y();

    public y() {
        super(1);
    }

    public Object c(Object obj) {
        i iVar = (i) obj;
        k.g(iVar, "$receiver");
        Object systemService = ((Context) iVar.getContext()).getSystemService("connectivity");
        if (systemService != null) {
            return (ConnectivityManager) systemService;
        }
        throw new kd.l("null cannot be cast to non-null type android.net.ConnectivityManager");
    }
}
