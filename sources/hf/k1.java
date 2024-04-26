package hf;

import android.content.Context;
import android.hardware.camera2.CameraManager;
import jf.i;
import ud.k;
import ud.l;

/* compiled from: module.kt */
public final class k1 extends l implements td.l<i<? extends Context>, CameraManager> {

    /* renamed from: b  reason: collision with root package name */
    public static final k1 f19023b = new k1();

    public k1() {
        super(1);
    }

    public Object c(Object obj) {
        i iVar = (i) obj;
        k.g(iVar, "$receiver");
        Object systemService = ((Context) iVar.getContext()).getSystemService("camera");
        if (systemService != null) {
            return (CameraManager) systemService;
        }
        throw new kd.l("null cannot be cast to non-null type android.hardware.camera2.CameraManager");
    }
}
