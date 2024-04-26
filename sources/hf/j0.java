package hf;

import android.content.Context;
import android.os.PowerManager;
import jf.i;
import ud.k;
import ud.l;

/* compiled from: module.kt */
public final class j0 extends l implements td.l<i<? extends Context>, PowerManager> {

    /* renamed from: b  reason: collision with root package name */
    public static final j0 f19019b = new j0();

    public j0() {
        super(1);
    }

    public Object c(Object obj) {
        i iVar = (i) obj;
        k.g(iVar, "$receiver");
        Object systemService = ((Context) iVar.getContext()).getSystemService("power");
        if (systemService != null) {
            return (PowerManager) systemService;
        }
        throw new kd.l("null cannot be cast to non-null type android.os.PowerManager");
    }
}
