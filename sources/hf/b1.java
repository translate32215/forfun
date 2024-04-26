package hf;

import android.content.Context;
import android.hardware.display.DisplayManager;
import jf.i;
import ud.k;
import ud.l;

/* compiled from: module.kt */
public final class b1 extends l implements td.l<i<? extends Context>, DisplayManager> {

    /* renamed from: b  reason: collision with root package name */
    public static final b1 f18987b = new b1();

    public b1() {
        super(1);
    }

    public Object c(Object obj) {
        i iVar = (i) obj;
        k.g(iVar, "$receiver");
        Object systemService = ((Context) iVar.getContext()).getSystemService("display");
        if (systemService != null) {
            return (DisplayManager) systemService;
        }
        throw new kd.l("null cannot be cast to non-null type android.hardware.display.DisplayManager");
    }
}
