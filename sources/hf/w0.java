package hf;

import android.content.Context;
import android.view.WindowManager;
import jf.i;
import ud.k;
import ud.l;

/* compiled from: module.kt */
public final class w0 extends l implements td.l<i<? extends Context>, WindowManager> {

    /* renamed from: b  reason: collision with root package name */
    public static final w0 f19058b = new w0();

    public w0() {
        super(1);
    }

    public Object c(Object obj) {
        i iVar = (i) obj;
        k.g(iVar, "$receiver");
        Object systemService = ((Context) iVar.getContext()).getSystemService("window");
        if (systemService != null) {
            return (WindowManager) systemService;
        }
        throw new kd.l("null cannot be cast to non-null type android.view.WindowManager");
    }
}
