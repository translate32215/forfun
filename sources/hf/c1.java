package hf;

import android.content.Context;
import android.os.UserManager;
import jf.i;
import ud.k;
import ud.l;

/* compiled from: module.kt */
public final class c1 extends l implements td.l<i<? extends Context>, UserManager> {

    /* renamed from: b  reason: collision with root package name */
    public static final c1 f18993b = new c1();

    public c1() {
        super(1);
    }

    public Object c(Object obj) {
        i iVar = (i) obj;
        k.g(iVar, "$receiver");
        Object systemService = ((Context) iVar.getContext()).getSystemService("user");
        if (systemService != null) {
            return (UserManager) systemService;
        }
        throw new kd.l("null cannot be cast to non-null type android.os.UserManager");
    }
}
