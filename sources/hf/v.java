package hf;

import android.app.AlarmManager;
import android.content.Context;
import jf.i;
import ud.k;
import ud.l;

/* compiled from: module.kt */
public final class v extends l implements td.l<i<? extends Context>, AlarmManager> {

    /* renamed from: b  reason: collision with root package name */
    public static final v f19054b = new v();

    public v() {
        super(1);
    }

    public Object c(Object obj) {
        i iVar = (i) obj;
        k.g(iVar, "$receiver");
        Object systemService = ((Context) iVar.getContext()).getSystemService("alarm");
        if (systemService != null) {
            return (AlarmManager) systemService;
        }
        throw new kd.l("null cannot be cast to non-null type android.app.AlarmManager");
    }
}
