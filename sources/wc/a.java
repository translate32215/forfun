package wc;

import c1.c;
import dev.pankaj.ytvclib.ui.dlna.ControlActivity;
import ud.k;

/* compiled from: ControlActivity.kt */
public final class a extends Thread {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f27182b = 0;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ControlActivity f27183a;

    public a(ControlActivity controlActivity) {
        this.f27183a = controlActivity;
    }

    public void run() {
        k kVar = this.f27183a.L;
        k.c(kVar);
        String h10 = kVar.h(this.f27183a.M);
        if (h10 != null) {
            ControlActivity controlActivity = this.f27183a;
            controlActivity.K = controlActivity.R(h10);
        }
        k.f(k.j("Get media duration and the value is ", Integer.valueOf(this.f27183a.K)), "msg");
        ControlActivity controlActivity2 = this.f27183a;
        controlActivity2.runOnUiThread(new c(h10, controlActivity2));
    }
}
