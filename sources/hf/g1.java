package hf;

import android.content.Context;
import android.hardware.ConsumerIrManager;
import jf.i;
import ud.k;
import ud.l;

/* compiled from: module.kt */
public final class g1 extends l implements td.l<i<? extends Context>, ConsumerIrManager> {

    /* renamed from: b  reason: collision with root package name */
    public static final g1 f19009b = new g1();

    public g1() {
        super(1);
    }

    public Object c(Object obj) {
        i iVar = (i) obj;
        k.g(iVar, "$receiver");
        Object systemService = ((Context) iVar.getContext()).getSystemService("consumer_ir");
        if (systemService != null) {
            return (ConsumerIrManager) systemService;
        }
        throw new kd.l("null cannot be cast to non-null type android.hardware.ConsumerIrManager");
    }
}
