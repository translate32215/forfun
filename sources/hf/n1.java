package hf;

import android.content.Context;
import android.content.pm.LauncherApps;
import jf.i;
import ud.k;
import ud.l;

/* compiled from: module.kt */
public final class n1 extends l implements td.l<i<? extends Context>, LauncherApps> {

    /* renamed from: b  reason: collision with root package name */
    public static final n1 f19032b = new n1();

    public n1() {
        super(1);
    }

    public Object c(Object obj) {
        i iVar = (i) obj;
        k.g(iVar, "$receiver");
        Object systemService = ((Context) iVar.getContext()).getSystemService("launcherapps");
        if (systemService != null) {
            return (LauncherApps) systemService;
        }
        throw new kd.l("null cannot be cast to non-null type android.content.pm.LauncherApps");
    }
}
