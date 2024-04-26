package hf;

import android.content.Context;
import android.view.textservice.TextServicesManager;
import jf.i;
import ud.k;
import ud.l;

/* compiled from: module.kt */
public final class o0 extends l implements td.l<i<? extends Context>, TextServicesManager> {

    /* renamed from: b  reason: collision with root package name */
    public static final o0 f19034b = new o0();

    public o0() {
        super(1);
    }

    public Object c(Object obj) {
        i iVar = (i) obj;
        k.g(iVar, "$receiver");
        Object systemService = ((Context) iVar.getContext()).getSystemService("textservices");
        if (systemService != null) {
            return (TextServicesManager) systemService;
        }
        throw new kd.l("null cannot be cast to non-null type android.view.textservice.TextServicesManager");
    }
}
