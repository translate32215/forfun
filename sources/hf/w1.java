package hf;

import android.content.Context;
import android.content.pm.PackageManager;
import jf.i;
import ud.k;
import ud.l;

/* compiled from: module.kt */
public final class w1 extends l implements td.l<i<? extends Context>, PackageManager> {

    /* renamed from: b  reason: collision with root package name */
    public static final w1 f19059b = new w1();

    public w1() {
        super(1);
    }

    public Object c(Object obj) {
        i iVar = (i) obj;
        k.g(iVar, "$receiver");
        return ((Context) iVar.getContext()).getPackageManager();
    }
}
