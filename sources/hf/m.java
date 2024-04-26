package hf;

import android.content.Context;
import java.io.File;
import jf.i;
import ud.k;
import ud.l;

/* compiled from: module.kt */
public final class m extends l implements td.l<i<? extends Context>, File> {

    /* renamed from: b  reason: collision with root package name */
    public static final m f19027b = new m();

    public m() {
        super(1);
    }

    public Object c(Object obj) {
        i iVar = (i) obj;
        k.g(iVar, "$receiver");
        return ((Context) iVar.getContext()).getFilesDir();
    }
}
