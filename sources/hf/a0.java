package hf;

import android.app.DownloadManager;
import android.content.Context;
import jf.i;
import ud.k;
import ud.l;

/* compiled from: module.kt */
public final class a0 extends l implements td.l<i<? extends Context>, DownloadManager> {

    /* renamed from: b  reason: collision with root package name */
    public static final a0 f18983b = new a0();

    public a0() {
        super(1);
    }

    public Object c(Object obj) {
        i iVar = (i) obj;
        k.g(iVar, "$receiver");
        Object systemService = ((Context) iVar.getContext()).getSystemService("download");
        if (systemService != null) {
            return (DownloadManager) systemService;
        }
        throw new kd.l("null cannot be cast to non-null type android.app.DownloadManager");
    }
}
