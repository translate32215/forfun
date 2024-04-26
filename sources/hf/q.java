package hf;

import android.content.Context;
import jf.i;
import ud.k;
import ud.l;

/* compiled from: module.kt */
public final class q extends l implements td.l<i<? extends Context>, String> {

    /* renamed from: b  reason: collision with root package name */
    public static final q f19039b = new q();

    public q() {
        super(1);
    }

    public Object c(Object obj) {
        i iVar = (i) obj;
        k.g(iVar, "$receiver");
        return ((Context) iVar.getContext()).getPackageResourcePath();
    }
}
