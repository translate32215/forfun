package wc;

import dev.pankaj.ytvclib.ui.dlna.ControlActivity;
import ud.k;

/* compiled from: ControlActivity.kt */
public final class g extends Thread {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ControlActivity f27194a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f27195b;

    public g(ControlActivity controlActivity, String str) {
        this.f27194a = controlActivity;
        this.f27195b = str;
    }

    public void run() {
        k kVar = this.f27194a.L;
        k.c(kVar);
        if (kVar.c(this.f27194a.M, this.f27195b)) {
            k.f("seek success", "msg");
            ControlActivity.O(this.f27194a).B.setProgress(this.f27194a.R(this.f27195b));
            return;
        }
        k.f("seek failed..", "msg");
    }
}
