package hf;

import android.content.Context;
import android.view.inputmethod.InputMethodManager;
import jf.i;
import ud.k;
import ud.l;

/* compiled from: module.kt */
public final class c0 extends l implements td.l<i<? extends Context>, InputMethodManager> {

    /* renamed from: b  reason: collision with root package name */
    public static final c0 f18992b = new c0();

    public c0() {
        super(1);
    }

    public Object c(Object obj) {
        i iVar = (i) obj;
        k.g(iVar, "$receiver");
        Object systemService = ((Context) iVar.getContext()).getSystemService("input_method");
        if (systemService != null) {
            return (InputMethodManager) systemService;
        }
        throw new kd.l("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
    }
}
