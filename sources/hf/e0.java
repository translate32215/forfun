package hf;

import android.content.Context;
import android.content.res.AssetManager;
import jf.i;
import ud.k;
import ud.l;

/* compiled from: module.kt */
public final class e0 extends l implements td.l<i<? extends Context>, AssetManager> {

    /* renamed from: b  reason: collision with root package name */
    public static final e0 f19000b = new e0();

    public e0() {
        super(1);
    }

    public Object c(Object obj) {
        i iVar = (i) obj;
        k.g(iVar, "$receiver");
        return ((Context) iVar.getContext()).getAssets();
    }
}
