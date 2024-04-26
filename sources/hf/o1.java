package hf;

import android.content.Context;
import android.media.projection.MediaProjectionManager;
import jf.i;
import ud.k;
import ud.l;

/* compiled from: module.kt */
public final class o1 extends l implements td.l<i<? extends Context>, MediaProjectionManager> {

    /* renamed from: b  reason: collision with root package name */
    public static final o1 f19035b = new o1();

    public o1() {
        super(1);
    }

    public Object c(Object obj) {
        i iVar = (i) obj;
        k.g(iVar, "$receiver");
        Object systemService = ((Context) iVar.getContext()).getSystemService("media_projection");
        if (systemService != null) {
            return (MediaProjectionManager) systemService;
        }
        throw new kd.l("null cannot be cast to non-null type android.media.projection.MediaProjectionManager");
    }
}
