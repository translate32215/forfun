package wc;

import dev.pankaj.ytvclib.ui.dlna.ControlActivity;
import ud.k;

/* compiled from: ControlActivity.kt */
public final class f extends Thread {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f27192b = 0;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ControlActivity f27193a;

    public f(ControlActivity controlActivity) {
        this.f27193a = controlActivity;
    }

    public void run() {
        k kVar = this.f27193a.L;
        k.c(kVar);
        ControlActivity controlActivity = this.f27193a;
        boolean b10 = kVar.b(controlActivity.M, controlActivity.J);
        if (b10) {
            k.f("play success", "msg");
        } else {
            k.f("play failed..", "msg");
        }
        ControlActivity controlActivity2 = this.f27193a;
        controlActivity2.runOnUiThread(new c(controlActivity2, b10, 2));
    }
}
