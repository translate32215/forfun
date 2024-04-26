package hf;

import android.content.Context;
import android.telephony.CarrierConfigManager;
import jf.i;
import ud.k;
import ud.l;

/* compiled from: module.kt */
public final class v1 extends l implements td.l<i<? extends Context>, CarrierConfigManager> {

    /* renamed from: b  reason: collision with root package name */
    public static final v1 f19056b = new v1();

    public v1() {
        super(1);
    }

    public Object c(Object obj) {
        i iVar = (i) obj;
        k.g(iVar, "$receiver");
        Object systemService = ((Context) iVar.getContext()).getSystemService("carrier_config");
        if (systemService != null) {
            return (CarrierConfigManager) systemService;
        }
        throw new kd.l("null cannot be cast to non-null type android.telephony.CarrierConfigManager");
    }
}
