package hf;

import android.content.Context;
import android.nfc.NfcManager;
import jf.i;
import ud.k;
import ud.l;

/* compiled from: module.kt */
public final class h0 extends l implements td.l<i<? extends Context>, NfcManager> {

    /* renamed from: b  reason: collision with root package name */
    public static final h0 f19012b = new h0();

    public h0() {
        super(1);
    }

    public Object c(Object obj) {
        i iVar = (i) obj;
        k.g(iVar, "$receiver");
        Object systemService = ((Context) iVar.getContext()).getSystemService("nfc");
        if (systemService != null) {
            return (NfcManager) systemService;
        }
        throw new kd.l("null cannot be cast to non-null type android.nfc.NfcManager");
    }
}
