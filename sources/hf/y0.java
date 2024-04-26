package hf;

import android.content.Context;
import android.media.MediaRouter;
import jf.i;
import ud.k;
import ud.l;

/* compiled from: module.kt */
public final class y0 extends l implements td.l<i<? extends Context>, MediaRouter> {

    /* renamed from: b  reason: collision with root package name */
    public static final y0 f19064b = new y0();

    public y0() {
        super(1);
    }

    public Object c(Object obj) {
        i iVar = (i) obj;
        k.g(iVar, "$receiver");
        Object systemService = ((Context) iVar.getContext()).getSystemService("media_router");
        if (systemService != null) {
            return (MediaRouter) systemService;
        }
        throw new kd.l("null cannot be cast to non-null type android.media.MediaRouter");
    }
}
