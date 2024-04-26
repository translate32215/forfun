package hf;

import android.content.Context;
import android.os.health.SystemHealthManager;
import jf.i;
import ud.k;
import ud.l;

/* compiled from: module.kt */
public final class b2 extends l implements td.l<i<? extends Context>, SystemHealthManager> {

    /* renamed from: b  reason: collision with root package name */
    public static final b2 f18988b = new b2();

    public b2() {
        super(1);
    }

    public Object c(Object obj) {
        i iVar = (i) obj;
        k.g(iVar, "$receiver");
        Object systemService = ((Context) iVar.getContext()).getSystemService("systemhealth");
        if (systemService != null) {
            return (SystemHealthManager) systemService;
        }
        throw new kd.l("null cannot be cast to non-null type android.os.health.SystemHealthManager");
    }
}
