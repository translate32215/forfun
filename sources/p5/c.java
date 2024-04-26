package p5;

import aa.m;
import android.os.HandlerThread;

public final /* synthetic */ class c implements m {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f23839a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f23840b;

    public /* synthetic */ c(int i10, int i11) {
        this.f23839a = i11;
        this.f23840b = i10;
    }

    public final Object get() {
        switch (this.f23839a) {
            case 0:
                return new HandlerThread(b.p(this.f23840b, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(b.p(this.f23840b, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
