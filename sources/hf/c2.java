package hf;

import android.content.Context;
import android.content.pm.ShortcutManager;
import jf.i;
import ud.k;
import ud.l;

/* compiled from: module.kt */
public final class c2 extends l implements td.l<i<? extends Context>, ShortcutManager> {

    /* renamed from: b  reason: collision with root package name */
    public static final c2 f18994b = new c2();

    public c2() {
        super(1);
    }

    public Object c(Object obj) {
        i iVar = (i) obj;
        k.g(iVar, "$receiver");
        Object systemService = ((Context) iVar.getContext()).getSystemService("shortcut");
        if (systemService != null) {
            return (ShortcutManager) systemService;
        }
        throw new kd.l("null cannot be cast to non-null type android.content.pm.ShortcutManager");
    }
}
