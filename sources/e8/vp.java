package e8;

import android.content.Context;
import com.google.android.gms.internal.ads.t7;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class vp implements bj {

    /* renamed from: a  reason: collision with root package name */
    public final t7 f17157a;

    public vp(t7 t7Var) {
        this.f17157a = !((Boolean) ti0.f16763j.f16769f.a(t.f16639q0)).booleanValue() ? null : t7Var;
    }

    public final void l(Context context) {
        t7 t7Var = this.f17157a;
        if (t7Var != null) {
            t7Var.onResume();
        }
    }

    public final void m(Context context) {
        t7 t7Var = this.f17157a;
        if (t7Var != null) {
            t7Var.destroy();
        }
    }

    public final void w(Context context) {
        t7 t7Var = this.f17157a;
        if (t7Var != null) {
            t7Var.onPause();
        }
    }
}
