package hf;

import android.content.ClipboardManager;
import android.content.Context;
import jf.i;
import ud.k;
import ud.l;

/* compiled from: module.kt */
public final class x extends l implements td.l<i<? extends Context>, ClipboardManager> {

    /* renamed from: b  reason: collision with root package name */
    public static final x f19060b = new x();

    public x() {
        super(1);
    }

    public Object c(Object obj) {
        i iVar = (i) obj;
        k.g(iVar, "$receiver");
        Object systemService = ((Context) iVar.getContext()).getSystemService("clipboard");
        if (systemService != null) {
            return (ClipboardManager) systemService;
        }
        throw new kd.l("null cannot be cast to non-null type android.content.ClipboardManager");
    }
}
