package hf;

import android.content.Context;
import android.os.DropBoxManager;
import jf.i;
import ud.k;
import ud.l;

/* compiled from: module.kt */
public final class b0 extends l implements td.l<i<? extends Context>, DropBoxManager> {

    /* renamed from: b  reason: collision with root package name */
    public static final b0 f18986b = new b0();

    public b0() {
        super(1);
    }

    public Object c(Object obj) {
        i iVar = (i) obj;
        k.g(iVar, "$receiver");
        Object systemService = ((Context) iVar.getContext()).getSystemService("dropbox");
        if (systemService != null) {
            return (DropBoxManager) systemService;
        }
        throw new kd.l("null cannot be cast to non-null type android.os.DropBoxManager");
    }
}
