package hf;

import android.app.SearchManager;
import android.content.Context;
import jf.i;
import ud.k;
import ud.l;

/* compiled from: module.kt */
public final class k0 extends l implements td.l<i<? extends Context>, SearchManager> {

    /* renamed from: b  reason: collision with root package name */
    public static final k0 f19022b = new k0();

    public k0() {
        super(1);
    }

    public Object c(Object obj) {
        i iVar = (i) obj;
        k.g(iVar, "$receiver");
        Object systemService = ((Context) iVar.getContext()).getSystemService("search");
        if (systemService != null) {
            return (SearchManager) systemService;
        }
        throw new kd.l("null cannot be cast to non-null type android.app.SearchManager");
    }
}
