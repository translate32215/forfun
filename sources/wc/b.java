package wc;

import dev.pankaj.ytvclib.ui.dlna.ControlActivity;
import ud.k;

/* compiled from: ControlActivity.kt */
public final class b extends Thread {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ControlActivity f27184a;

    public b(ControlActivity controlActivity) {
        this.f27184a = controlActivity;
    }

    public void run() {
        ControlActivity controlActivity = this.f27184a;
        k kVar = controlActivity.L;
        k.c(kVar);
        controlActivity.I = kVar.g(this.f27184a.M);
        k.f(k.j("getVoice: ", Integer.valueOf(this.f27184a.I)), "msg");
    }
}
