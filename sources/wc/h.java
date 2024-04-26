package wc;

import dev.pankaj.ytvclib.ui.dlna.ControlActivity;
import ud.k;

/* compiled from: ControlActivity.kt */
public final class h extends Thread {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f27196b = 0;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ControlActivity f27197a;

    public h(ControlActivity controlActivity) {
        this.f27197a = controlActivity;
    }

    public void run() {
        k kVar = this.f27197a.L;
        k.c(kVar);
        boolean a10 = kVar.a(this.f27197a.M);
        ControlActivity controlActivity = this.f27197a;
        controlActivity.runOnUiThread(new c(controlActivity, a10, 3));
    }
}
