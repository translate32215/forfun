package p5;

import android.media.MediaCodec;
import p5.i;
import w6.h;

public final /* synthetic */ class a implements MediaCodec.OnFrameRenderedListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f23831a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ i.b f23832b;

    public /* synthetic */ a(b bVar, i.b bVar2) {
        this.f23831a = bVar;
        this.f23832b = bVar2;
    }

    public final void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
        b bVar = this.f23831a;
        i.b bVar2 = this.f23832b;
        bVar.getClass();
        ((h.b) bVar2).b(bVar, j10, j11);
    }
}
