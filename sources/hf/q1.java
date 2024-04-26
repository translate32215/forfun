package hf;

import android.content.Context;
import android.content.RestrictionsManager;
import jf.i;
import ud.k;
import ud.l;

/* compiled from: module.kt */
public final class q1 extends l implements td.l<i<? extends Context>, RestrictionsManager> {

    /* renamed from: b  reason: collision with root package name */
    public static final q1 f19041b = new q1();

    public q1() {
        super(1);
    }

    public Object c(Object obj) {
        i iVar = (i) obj;
        k.g(iVar, "$receiver");
        Object systemService = ((Context) iVar.getContext()).getSystemService("restrictions");
        if (systemService != null) {
            return (RestrictionsManager) systemService;
        }
        throw new kd.l("null cannot be cast to non-null type android.content.RestrictionsManager");
    }
}
