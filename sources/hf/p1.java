package hf;

import android.content.Context;
import android.media.session.MediaSessionManager;
import jf.i;
import ud.k;
import ud.l;

/* compiled from: module.kt */
public final class p1 extends l implements td.l<i<? extends Context>, MediaSessionManager> {

    /* renamed from: b  reason: collision with root package name */
    public static final p1 f19038b = new p1();

    public p1() {
        super(1);
    }

    public Object c(Object obj) {
        i iVar = (i) obj;
        k.g(iVar, "$receiver");
        Object systemService = ((Context) iVar.getContext()).getSystemService("media_session");
        if (systemService != null) {
            return (MediaSessionManager) systemService;
        }
        throw new kd.l("null cannot be cast to non-null type android.media.session.MediaSessionManager");
    }
}
