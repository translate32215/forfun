package hf;

import android.content.Context;
import android.os.Vibrator;
import jf.i;
import ud.k;
import ud.l;

/* compiled from: module.kt */
public final class s0 extends l implements td.l<i<? extends Context>, Vibrator> {

    /* renamed from: b  reason: collision with root package name */
    public static final s0 f19046b = new s0();

    public s0() {
        super(1);
    }

    public Object c(Object obj) {
        i iVar = (i) obj;
        k.g(iVar, "$receiver");
        Object systemService = ((Context) iVar.getContext()).getSystemService("vibrator");
        if (systemService != null) {
            return (Vibrator) systemService;
        }
        throw new kd.l("null cannot be cast to non-null type android.os.Vibrator");
    }
}
