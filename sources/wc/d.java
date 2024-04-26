package wc;

import dev.pankaj.ytvclib.ui.dlna.ControlActivity;
import ud.k;

/* compiled from: ControlActivity.kt */
public final class d extends Thread {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ControlActivity f27188a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f27189b;

    public d(ControlActivity controlActivity, String str) {
        this.f27188a = controlActivity;
        this.f27189b = str;
    }

    public void run() {
        k kVar = this.f27188a.L;
        k.c(kVar);
        boolean i10 = kVar.i(this.f27188a.M, this.f27189b);
        if (i10) {
            k.f("Go on to play success", "msg");
        } else {
            k.f("Go on to play failed.", "msg");
        }
        ControlActivity controlActivity = this.f27188a;
        controlActivity.runOnUiThread(new c(controlActivity, i10, 0));
    }
}
