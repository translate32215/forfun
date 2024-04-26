package hf;

import android.content.Context;
import android.view.LayoutInflater;
import jf.i;
import ud.k;
import ud.l;

/* compiled from: module.kt */
public final class f0 extends l implements td.l<i<? extends Context>, LayoutInflater> {

    /* renamed from: b  reason: collision with root package name */
    public static final f0 f19004b = new f0();

    public f0() {
        super(1);
    }

    public Object c(Object obj) {
        i iVar = (i) obj;
        k.g(iVar, "$receiver");
        Object systemService = ((Context) iVar.getContext()).getSystemService("layout_inflater");
        if (systemService != null) {
            return (LayoutInflater) systemService;
        }
        throw new kd.l("null cannot be cast to non-null type android.view.LayoutInflater");
    }
}
