package hf;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import jf.i;
import ud.k;
import ud.l;

/* compiled from: module.kt */
public final class r extends l implements td.l<i<? extends Context>, AccessibilityManager> {

    /* renamed from: b  reason: collision with root package name */
    public static final r f19042b = new r();

    public r() {
        super(1);
    }

    public Object c(Object obj) {
        i iVar = (i) obj;
        k.g(iVar, "$receiver");
        Object systemService = ((Context) iVar.getContext()).getSystemService("accessibility");
        if (systemService != null) {
            return (AccessibilityManager) systemService;
        }
        throw new kd.l("null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
    }
}
