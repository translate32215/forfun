package hf;

import android.content.Context;
import android.os.Looper;
import jf.i;
import ud.k;
import ud.l;

/* compiled from: module.kt */
public final class l1 extends l implements td.l<i<? extends Context>, Looper> {

    /* renamed from: b  reason: collision with root package name */
    public static final l1 f19026b = new l1();

    public l1() {
        super(1);
    }

    public Object c(Object obj) {
        i iVar = (i) obj;
        k.g(iVar, "$receiver");
        return ((Context) iVar.getContext()).getMainLooper();
    }
}
