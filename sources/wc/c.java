package wc;

import dev.pankaj.ytvclib.ui.dlna.ControlActivity;
import ud.k;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f27185a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ControlActivity f27186b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f27187c;

    public /* synthetic */ c(ControlActivity controlActivity, boolean z10, int i10) {
        this.f27185a = i10;
        if (i10 == 1) {
            this.f27186b = controlActivity;
            this.f27187c = z10;
        } else if (i10 != 2) {
            this.f27186b = controlActivity;
            this.f27187c = z10;
        } else {
            this.f27186b = controlActivity;
            this.f27187c = z10;
        }
    }

    public final void run() {
        switch (this.f27185a) {
            case 0:
                ControlActivity controlActivity = this.f27186b;
                boolean z10 = this.f27187c;
                k.f(controlActivity, "this$0");
                ControlActivity.P(controlActivity, z10);
                return;
            case 1:
                ControlActivity controlActivity2 = this.f27186b;
                boolean z11 = this.f27187c;
                int i10 = e.f27190b;
                k.f(controlActivity2, "this$0");
                ControlActivity.P(controlActivity2, !z11);
                return;
            case 2:
                ControlActivity controlActivity3 = this.f27186b;
                boolean z12 = this.f27187c;
                int i11 = f.f27192b;
                k.f(controlActivity3, "this$0");
                ControlActivity.P(controlActivity3, z12);
                synchronized (controlActivity3) {
                    new a(controlActivity3).start();
                }
                return;
            default:
                ControlActivity controlActivity4 = this.f27186b;
                boolean z13 = this.f27187c;
                int i12 = h.f27196b;
                k.f(controlActivity4, "this$0");
                ControlActivity.P(controlActivity4, !z13);
                return;
        }
    }
}
