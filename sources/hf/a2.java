package hf;

import android.content.Context;
import android.os.HardwarePropertiesManager;
import jf.i;
import ud.k;
import ud.l;

/* compiled from: module.kt */
public final class a2 extends l implements td.l<i<? extends Context>, HardwarePropertiesManager> {

    /* renamed from: b  reason: collision with root package name */
    public static final a2 f18985b = new a2();

    public a2() {
        super(1);
    }

    public Object c(Object obj) {
        i iVar = (i) obj;
        k.g(iVar, "$receiver");
        Object systemService = ((Context) iVar.getContext()).getSystemService("hardware_properties");
        if (systemService != null) {
            return (HardwarePropertiesManager) systemService;
        }
        throw new kd.l("null cannot be cast to non-null type android.os.HardwarePropertiesManager");
    }
}
