package wc;

import dev.pankaj.ytvclib.ui.dlna.ControlActivity;
import ud.k;

/* compiled from: ControlActivity.kt */
public final class e extends Thread {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f27190b = 0;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ControlActivity f27191a;

    public e(ControlActivity controlActivity) {
        this.f27191a = controlActivity;
    }

    public void run() {
        k kVar = this.f27191a.L;
        k.c(kVar);
        boolean f10 = kVar.f(this.f27191a.M);
        ControlActivity controlActivity = this.f27191a;
        controlActivity.runOnUiThread(new c(controlActivity, f10, 1));
    }
}
