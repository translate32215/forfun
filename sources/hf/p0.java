package hf;

import android.content.ContentResolver;
import android.content.Context;
import jf.i;
import ud.k;
import ud.l;

/* compiled from: module.kt */
public final class p0 extends l implements td.l<i<? extends Context>, ContentResolver> {

    /* renamed from: b  reason: collision with root package name */
    public static final p0 f19037b = new p0();

    public p0() {
        super(1);
    }

    public Object c(Object obj) {
        i iVar = (i) obj;
        k.g(iVar, "$receiver");
        return ((Context) iVar.getContext()).getContentResolver();
    }
}
