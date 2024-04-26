package hf;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import jf.i;
import ud.k;
import ud.l;

/* compiled from: module.kt */
public final class a1 extends l implements td.l<i<? extends Context>, ApplicationInfo> {

    /* renamed from: b  reason: collision with root package name */
    public static final a1 f18984b = new a1();

    public a1() {
        super(1);
    }

    public Object c(Object obj) {
        i iVar = (i) obj;
        k.g(iVar, "$receiver");
        return ((Context) iVar.getContext()).getApplicationInfo();
    }
}
