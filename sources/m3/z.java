package m3;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: ResourceRecycler */
public class z {

    /* renamed from: a  reason: collision with root package name */
    public boolean f21694a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f21695b = new Handler(Looper.getMainLooper(), new a());

    /* compiled from: ResourceRecycler */
    public static final class a implements Handler.Callback {
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((w) message.obj).c();
            return true;
        }
    }

    public synchronized void a(w<?> wVar, boolean z10) {
        if (!this.f21694a) {
            if (!z10) {
                this.f21694a = true;
                wVar.c();
                this.f21694a = false;
            }
        }
        this.f21695b.obtainMessage(1, wVar).sendToTarget();
    }
}
