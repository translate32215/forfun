package hf;

import android.content.Context;
import android.view.accessibility.CaptioningManager;
import jf.i;
import ud.k;
import ud.l;

/* compiled from: module.kt */
public final class f1 extends l implements td.l<i<? extends Context>, CaptioningManager> {

    /* renamed from: b  reason: collision with root package name */
    public static final f1 f19005b = new f1();

    public f1() {
        super(1);
    }

    public Object c(Object obj) {
        i iVar = (i) obj;
        k.g(iVar, "$receiver");
        Object systemService = ((Context) iVar.getContext()).getSystemService("captioning");
        if (systemService != null) {
            return (CaptioningManager) systemService;
        }
        throw new kd.l("null cannot be cast to non-null type android.view.accessibility.CaptioningManager");
    }
}
