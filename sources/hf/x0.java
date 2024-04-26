package hf;

import android.content.Context;
import android.hardware.input.InputManager;
import jf.i;
import ud.k;
import ud.l;

/* compiled from: module.kt */
public final class x0 extends l implements td.l<i<? extends Context>, InputManager> {

    /* renamed from: b  reason: collision with root package name */
    public static final x0 f19061b = new x0();

    public x0() {
        super(1);
    }

    public Object c(Object obj) {
        i iVar = (i) obj;
        k.g(iVar, "$receiver");
        Object systemService = ((Context) iVar.getContext()).getSystemService("input");
        if (systemService != null) {
            return (InputManager) systemService;
        }
        throw new kd.l("null cannot be cast to non-null type android.hardware.input.InputManager");
    }
}
