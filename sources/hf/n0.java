package hf;

import android.content.Context;
import android.telephony.TelephonyManager;
import jf.i;
import ud.k;
import ud.l;

/* compiled from: module.kt */
public final class n0 extends l implements td.l<i<? extends Context>, TelephonyManager> {

    /* renamed from: b  reason: collision with root package name */
    public static final n0 f19031b = new n0();

    public n0() {
        super(1);
    }

    public Object c(Object obj) {
        i iVar = (i) obj;
        k.g(iVar, "$receiver");
        Object systemService = ((Context) iVar.getContext()).getSystemService("phone");
        if (systemService != null) {
            return (TelephonyManager) systemService;
        }
        throw new kd.l("null cannot be cast to non-null type android.telephony.TelephonyManager");
    }
}
