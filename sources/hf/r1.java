package hf;

import android.content.Context;
import android.telecom.TelecomManager;
import jf.i;
import ud.k;
import ud.l;

/* compiled from: module.kt */
public final class r1 extends l implements td.l<i<? extends Context>, TelecomManager> {

    /* renamed from: b  reason: collision with root package name */
    public static final r1 f19044b = new r1();

    public r1() {
        super(1);
    }

    public Object c(Object obj) {
        i iVar = (i) obj;
        k.g(iVar, "$receiver");
        Object systemService = ((Context) iVar.getContext()).getSystemService("telecom");
        if (systemService != null) {
            return (TelecomManager) systemService;
        }
        throw new kd.l("null cannot be cast to non-null type android.telecom.TelecomManager");
    }
}
