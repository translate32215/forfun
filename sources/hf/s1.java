package hf;

import android.content.Context;
import android.media.tv.TvInputManager;
import jf.i;
import ud.k;
import ud.l;

/* compiled from: module.kt */
public final class s1 extends l implements td.l<i<? extends Context>, TvInputManager> {

    /* renamed from: b  reason: collision with root package name */
    public static final s1 f19047b = new s1();

    public s1() {
        super(1);
    }

    public Object c(Object obj) {
        i iVar = (i) obj;
        k.g(iVar, "$receiver");
        Object systemService = ((Context) iVar.getContext()).getSystemService("tv_input");
        if (systemService != null) {
            return (TvInputManager) systemService;
        }
        throw new kd.l("null cannot be cast to non-null type android.media.tv.TvInputManager");
    }
}
