package p5;

import android.media.MediaCodec;
import p5.i;
import w6.h;

public final /* synthetic */ class q implements MediaCodec.OnFrameRenderedListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ r f23932a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ i.b f23933b;

    public /* synthetic */ q(r rVar, i.b bVar) {
        this.f23932a = rVar;
        this.f23933b = bVar;
    }

    public final void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
        r rVar = this.f23932a;
        i.b bVar = this.f23933b;
        rVar.getClass();
        ((h.b) bVar).b(rVar, j10, j11);
    }
}
