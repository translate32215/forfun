package z4;

import android.os.Handler;
import java.util.concurrent.Executor;

public final /* synthetic */ class s implements Executor {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Handler f28471a;

    public /* synthetic */ s(Handler handler) {
        this.f28471a = handler;
    }

    public final void execute(Runnable runnable) {
        this.f28471a.post(runnable);
    }
}
