package e8;

import android.app.AlertDialog;
import com.google.android.gms.ads.internal.overlay.a;
import java.util.Timer;
import java.util.TimerTask;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class kt extends TimerTask {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AlertDialog f15328a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Timer f15329b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ a f15330c;

    public kt(AlertDialog alertDialog, Timer timer, a aVar) {
        this.f15328a = alertDialog;
        this.f15329b = timer;
        this.f15330c = aVar;
    }

    public final void run() {
        this.f15328a.dismiss();
        this.f15329b.cancel();
        a aVar = this.f15330c;
        if (aVar != null) {
            aVar.s6();
        }
    }
}
