package e8;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class mg0 implements Handler.Callback, Choreographer.FrameCallback {

    /* renamed from: e  reason: collision with root package name */
    public static final mg0 f15507e = new mg0();

    /* renamed from: a  reason: collision with root package name */
    public volatile long f15508a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f15509b;

    /* renamed from: c  reason: collision with root package name */
    public Choreographer f15510c;

    /* renamed from: d  reason: collision with root package name */
    public int f15511d;

    public mg0() {
        HandlerThread handlerThread = new HandlerThread("ChoreographerOwner:Handler");
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper(), this);
        this.f15509b = handler;
        handler.sendEmptyMessage(0);
    }

    public final void doFrame(long j10) {
        this.f15508a = j10;
        this.f15510c.postFrameCallbackDelayed(this, 500);
    }

    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            this.f15510c = Choreographer.getInstance();
            return true;
        } else if (i10 == 1) {
            int i11 = this.f15511d + 1;
            this.f15511d = i11;
            if (i11 == 1) {
                this.f15510c.postFrameCallback(this);
            }
            return true;
        } else if (i10 != 2) {
            return false;
        } else {
            int i12 = this.f15511d - 1;
            this.f15511d = i12;
            if (i12 == 0) {
                this.f15510c.removeFrameCallback(this);
                this.f15508a = 0;
            }
            return true;
        }
    }
}
