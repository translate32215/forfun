package wc;

import dev.pankaj.ytvclib.ui.dlna.ControlActivity;
import ud.k;
import v6.n;

/* compiled from: ControlActivity.kt */
public final class i extends Thread {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f27198b = 0;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ControlActivity f27199a;

    public i(ControlActivity controlActivity) {
        this.f27199a = controlActivity;
    }

    public void run() {
        int R;
        k kVar = this.f27199a.L;
        k.c(kVar);
        String e10 = kVar.e(this.f27199a.M);
        k.f(k.j("Get position info and the value is ", e10), "msg");
        if (!(e10 == null || e10.length() == 0) && !k.a(this.f27199a.O, e10) && (R = this.f27199a.R(e10)) > 0) {
            ControlActivity controlActivity = this.f27199a;
            if (R <= controlActivity.K) {
                controlActivity.runOnUiThread(new n(controlActivity, e10, R));
            }
        }
    }
}
