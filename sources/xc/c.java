package xc;

import com.startapp.startappsdk.R;
import dev.pankaj.ytvclib.ui.main.PlayerActivity;
import dev.pankaj.ytvclib.utils.b;
import ud.k;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f27928a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ PlayerActivity f27929b;

    public /* synthetic */ c(PlayerActivity playerActivity, int i10) {
        this.f27928a = i10;
        this.f27929b = playerActivity;
    }

    public final void run() {
        switch (this.f27928a) {
            case 0:
                PlayerActivity playerActivity = this.f27929b;
                PlayerActivity.a aVar = PlayerActivity.f13437n0;
                k.f(playerActivity, "this$0");
                b bVar = playerActivity.f13450k0;
                if (bVar != null) {
                    bVar.g();
                    return;
                } else {
                    k.l("adUtil");
                    throw null;
                }
            default:
                PlayerActivity playerActivity2 = this.f27929b;
                int i10 = e.f27931d;
                k.f(playerActivity2, "this$0");
                PlayerActivity.O(playerActivity2, R.string.video_not_support);
                return;
        }
    }
}
