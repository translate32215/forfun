package hf;

import android.content.Context;
import java.io.File;
import jf.i;
import ud.l;

/* compiled from: module.kt */
public final class k extends l implements td.l<i<? extends Context>, File> {

    /* renamed from: b  reason: collision with root package name */
    public static final k f19021b = new k();

    public k() {
        super(1);
    }

    public Object c(Object obj) {
        i iVar = (i) obj;
        ud.k.g(iVar, "$receiver");
        return ((Context) iVar.getContext()).getCacheDir();
    }
}
