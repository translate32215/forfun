package hf;

import android.content.Context;
import android.hardware.usb.UsbManager;
import jf.i;
import ud.k;
import ud.l;

/* compiled from: module.kt */
public final class r0 extends l implements td.l<i<? extends Context>, UsbManager> {

    /* renamed from: b  reason: collision with root package name */
    public static final r0 f19043b = new r0();

    public r0() {
        super(1);
    }

    public Object c(Object obj) {
        i iVar = (i) obj;
        k.g(iVar, "$receiver");
        Object systemService = ((Context) iVar.getContext()).getSystemService("usb");
        if (systemService != null) {
            return (UsbManager) systemService;
        }
        throw new kd.l("null cannot be cast to non-null type android.hardware.usb.UsbManager");
    }
}
