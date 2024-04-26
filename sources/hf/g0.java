package hf;

import android.content.Context;
import android.location.LocationManager;
import jf.i;
import ud.k;
import ud.l;

/* compiled from: module.kt */
public final class g0 extends l implements td.l<i<? extends Context>, LocationManager> {

    /* renamed from: b  reason: collision with root package name */
    public static final g0 f19008b = new g0();

    public g0() {
        super(1);
    }

    public Object c(Object obj) {
        i iVar = (i) obj;
        k.g(iVar, "$receiver");
        Object systemService = ((Context) iVar.getContext()).getSystemService("location");
        if (systemService != null) {
            return (LocationManager) systemService;
        }
        throw new kd.l("null cannot be cast to non-null type android.location.LocationManager");
    }
}
