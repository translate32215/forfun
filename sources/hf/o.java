package hf;

import android.content.Context;
import jf.i;
import ud.k;
import ud.l;

/* compiled from: module.kt */
public final class o extends l implements td.l<i<? extends Context>, String> {

    /* renamed from: b  reason: collision with root package name */
    public static final o f19033b = new o();

    public o() {
        super(1);
    }

    public Object c(Object obj) {
        i iVar = (i) obj;
        k.g(iVar, "$receiver");
        return ((Context) iVar.getContext()).getPackageCodePath();
    }
}
