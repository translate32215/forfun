package hf;

import android.content.Context;
import java.io.File;
import jf.i;
import ud.k;
import ud.l;

/* compiled from: module.kt */
public final class n extends l implements td.l<i<? extends Context>, File> {

    /* renamed from: b  reason: collision with root package name */
    public static final n f19030b = new n();

    public n() {
        super(1);
    }

    public Object c(Object obj) {
        i iVar = (i) obj;
        k.g(iVar, "$receiver");
        return ((Context) iVar.getContext()).getObbDir();
    }
}
