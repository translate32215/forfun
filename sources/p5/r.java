package p5;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import p5.i;
import v6.e0;

/* compiled from: SynchronousMediaCodecAdapter */
public final class r implements i {

    /* renamed from: a  reason: collision with root package name */
    public final MediaCodec f23934a;

    /* renamed from: b  reason: collision with root package name */
    public ByteBuffer[] f23935b;

    /* renamed from: c  reason: collision with root package name */
    public ByteBuffer[] f23936c;

    /* compiled from: SynchronousMediaCodecAdapter */
    public static final class b implements i.a {
        public i a(MediaCodec mediaCodec) {
            return new r(mediaCodec, (a) null);
        }
    }

    public r(MediaCodec mediaCodec, a aVar) {
        this.f23934a = mediaCodec;
    }

    public void a() {
        this.f23935b = null;
        this.f23936c = null;
        this.f23934a.release();
    }

    public int b(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.f23934a.dequeueOutputBuffer(bufferInfo, 0);
            if (dequeueOutputBuffer == -3 && e0.f26436a < 21) {
                this.f23936c = this.f23934a.getOutputBuffers();
                continue;
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    public void c(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i10) {
        this.f23934a.configure(mediaFormat, surface, mediaCrypto, i10);
    }

    public void d(int i10, boolean z10) {
        this.f23934a.releaseOutputBuffer(i10, z10);
    }

    public void e(int i10) {
        this.f23934a.setVideoScalingMode(i10);
    }

    public MediaFormat f() {
        return this.f23934a.getOutputFormat();
    }

    public void flush() {
        this.f23934a.flush();
    }

    public ByteBuffer g(int i10) {
        if (e0.f26436a >= 21) {
            return this.f23934a.getInputBuffer(i10);
        }
        return this.f23935b[i10];
    }

    public void h(Surface surface) {
        this.f23934a.setOutputSurface(surface);
    }

    public void i(int i10, int i11, a5.b bVar, long j10, int i12) {
        this.f23934a.queueSecureInputBuffer(i10, i11, bVar.f70i, j10, i12);
    }

    public void j(int i10, int i11, int i12, long j10, int i13) {
        this.f23934a.queueInputBuffer(i10, i11, i12, j10, i13);
    }

    public void k(i.b bVar, Handler handler) {
        this.f23934a.setOnFrameRenderedListener(new q(this, bVar), handler);
    }

    public void l(Bundle bundle) {
        this.f23934a.setParameters(bundle);
    }

    public ByteBuffer m(int i10) {
        if (e0.f26436a >= 21) {
            return this.f23934a.getOutputBuffer(i10);
        }
        return this.f23936c[i10];
    }

    public void n(int i10, long j10) {
        this.f23934a.releaseOutputBuffer(i10, j10);
    }

    public int o() {
        return this.f23934a.dequeueInputBuffer(0);
    }

    public void start() {
        this.f23934a.start();
        if (e0.f26436a < 21) {
            this.f23935b = this.f23934a.getInputBuffers();
            this.f23936c = this.f23934a.getOutputBuffers();
        }
    }
}
