package u7;

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final /* synthetic */ class l implements Executor {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f26114a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Handler f26115b;

    public l(Handler handler, int i10) {
        this.f26114a = i10;
        if (i10 != 1) {
            this.f26115b = handler;
        } else {
            this.f26115b = handler;
        }
    }

    public final void execute(Runnable runnable) {
        switch (this.f26114a) {
            case 0:
                this.f26115b.post(runnable);
                return;
            default:
                this.f26115b.post(runnable);
                return;
        }
    }
}
