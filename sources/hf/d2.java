package hf;

import android.content.Context;
import android.content.res.Resources;
import jf.i;
import ud.k;
import ud.l;

/* compiled from: module.kt */
public final class d2 extends l implements td.l<i<? extends Context>, Resources> {

    /* renamed from: b  reason: collision with root package name */
    public static final d2 f18998b = new d2();

    public d2() {
        super(1);
    }

    public Object c(Object obj) {
        i iVar = (i) obj;
        k.g(iVar, "$receiver");
        return ((Context) iVar.getContext()).getResources();
    }
}
