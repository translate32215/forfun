package hf;

import android.content.Context;
import android.hardware.SensorManager;
import jf.i;
import ud.k;
import ud.l;

/* compiled from: module.kt */
public final class l0 extends l implements td.l<i<? extends Context>, SensorManager> {

    /* renamed from: b  reason: collision with root package name */
    public static final l0 f19025b = new l0();

    public l0() {
        super(1);
    }

    public Object c(Object obj) {
        i iVar = (i) obj;
        k.g(iVar, "$receiver");
        Object systemService = ((Context) iVar.getContext()).getSystemService("sensor");
        if (systemService != null) {
            return (SensorManager) systemService;
        }
        throw new kd.l("null cannot be cast to non-null type android.hardware.SensorManager");
    }
}
