package hf;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import jf.i;
import ud.k;
import ud.l;

/* compiled from: module.kt */
public final class i1 extends l implements td.l<i<? extends Context>, AppWidgetManager> {

    /* renamed from: b  reason: collision with root package name */
    public static final i1 f19017b = new i1();

    public i1() {
        super(1);
    }

    public Object c(Object obj) {
        i iVar = (i) obj;
        k.g(iVar, "$receiver");
        Object systemService = ((Context) iVar.getContext()).getSystemService("appwidget");
        if (systemService != null) {
            return (AppWidgetManager) systemService;
        }
        throw new kd.l("null cannot be cast to non-null type android.appwidget.AppWidgetManager");
    }
}
