package e8;

import com.google.android.gms.internal.ads.t7;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final /* synthetic */ class yo implements ug0 {

    /* renamed from: a  reason: collision with root package name */
    public final t7 f17644a;

    public yo(t7 t7Var) {
        this.f17644a = t7Var;
    }

    public final void t(vg0 vg0) {
        t7 t7Var = this.f17644a;
        HashMap hashMap = new HashMap();
        hashMap.put("isVisible", vg0.f17142j ? "1" : "0");
        t7Var.O("onAdVisibilityChanged", hashMap);
    }
}
