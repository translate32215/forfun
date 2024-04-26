package hf;

import android.content.Context;
import java.io.File;
import jf.i;
import ud.k;

/* compiled from: module.kt */
public final class l extends ud.l implements td.l<i<? extends Context>, File> {

    /* renamed from: b  reason: collision with root package name */
    public static final l f19024b = new l();

    public l() {
        super(1);
    }

    public Object c(Object obj) {
        i iVar = (i) obj;
        k.g(iVar, "$receiver");
        return ((Context) iVar.getContext()).getExternalCacheDir();
    }
}
