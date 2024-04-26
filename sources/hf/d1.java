package hf;

import android.bluetooth.BluetoothManager;
import android.content.Context;
import jf.i;
import ud.k;
import ud.l;

/* compiled from: module.kt */
public final class d1 extends l implements td.l<i<? extends Context>, BluetoothManager> {

    /* renamed from: b  reason: collision with root package name */
    public static final d1 f18997b = new d1();

    public d1() {
        super(1);
    }

    public Object c(Object obj) {
        i iVar = (i) obj;
        k.g(iVar, "$receiver");
        Object systemService = ((Context) iVar.getContext()).getSystemService("bluetooth");
        if (systemService != null) {
            return (BluetoothManager) systemService;
        }
        throw new kd.l("null cannot be cast to non-null type android.bluetooth.BluetoothManager");
    }
}
