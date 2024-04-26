package hf;

import android.app.KeyguardManager;
import android.content.Context;
import jf.i;
import ud.k;
import ud.l;

/* compiled from: module.kt */
public final class d0 extends l implements td.l<i<? extends Context>, KeyguardManager> {

    /* renamed from: b  reason: collision with root package name */
    public static final d0 f18996b = new d0();

    public d0() {
        super(1);
    }

    public Object c(Object obj) {
        i iVar = (i) obj;
        k.g(iVar, "$receiver");
        Object systemService = ((Context) iVar.getContext()).getSystemService("keyguard");
        if (systemService != null) {
            return (KeyguardManager) systemService;
        }
        throw new kd.l("null cannot be cast to non-null type android.app.KeyguardManager");
    }
}
