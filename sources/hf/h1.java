package hf;

import android.content.Context;
import android.print.PrintManager;
import jf.i;
import ud.k;
import ud.l;

/* compiled from: module.kt */
public final class h1 extends l implements td.l<i<? extends Context>, PrintManager> {

    /* renamed from: b  reason: collision with root package name */
    public static final h1 f19013b = new h1();

    public h1() {
        super(1);
    }

    public Object c(Object obj) {
        i iVar = (i) obj;
        k.g(iVar, "$receiver");
        Object systemService = ((Context) iVar.getContext()).getSystemService("print");
        if (systemService != null) {
            return (PrintManager) systemService;
        }
        throw new kd.l("null cannot be cast to non-null type android.print.PrintManager");
    }
}
