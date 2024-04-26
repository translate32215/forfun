package hf;

import android.content.Context;
import android.os.storage.StorageManager;
import jf.i;
import ud.k;
import ud.l;

/* compiled from: module.kt */
public final class m0 extends l implements td.l<i<? extends Context>, StorageManager> {

    /* renamed from: b  reason: collision with root package name */
    public static final m0 f19028b = new m0();

    public m0() {
        super(1);
    }

    public Object c(Object obj) {
        i iVar = (i) obj;
        k.g(iVar, "$receiver");
        Object systemService = ((Context) iVar.getContext()).getSystemService("storage");
        if (systemService != null) {
            return (StorageManager) systemService;
        }
        throw new kd.l("null cannot be cast to non-null type android.os.storage.StorageManager");
    }
}
