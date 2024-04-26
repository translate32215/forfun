package hf;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import jf.i;
import ud.k;
import ud.l;

/* compiled from: module.kt */
public final class x1 extends l implements td.l<i<? extends Context>, FingerprintManager> {

    /* renamed from: b  reason: collision with root package name */
    public static final x1 f19062b = new x1();

    public x1() {
        super(1);
    }

    public Object c(Object obj) {
        i iVar = (i) obj;
        k.g(iVar, "$receiver");
        Object systemService = ((Context) iVar.getContext()).getSystemService("fingerprint");
        if (systemService != null) {
            return (FingerprintManager) systemService;
        }
        throw new kd.l("null cannot be cast to non-null type android.hardware.fingerprint.FingerprintManager");
    }
}
