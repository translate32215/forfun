package hf;

import android.app.WallpaperManager;
import android.content.Context;
import jf.i;
import ud.k;
import ud.l;

/* compiled from: module.kt */
public final class t0 extends l implements td.l<i<? extends Context>, WallpaperManager> {

    /* renamed from: b  reason: collision with root package name */
    public static final t0 f19049b = new t0();

    public t0() {
        super(1);
    }

    public Object c(Object obj) {
        i iVar = (i) obj;
        k.g(iVar, "$receiver");
        Object systemService = ((Context) iVar.getContext()).getSystemService("wallpaper");
        if (systemService != null) {
            return (WallpaperManager) systemService;
        }
        throw new kd.l("null cannot be cast to non-null type android.app.WallpaperManager");
    }
}
