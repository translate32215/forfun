package p5;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import p5.r;

/* compiled from: MediaCodecAdapter */
public interface i {

    /* compiled from: MediaCodecAdapter */
    public interface a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f23876a = new r.b();

        i a(MediaCodec mediaCodec);
    }

    /* compiled from: MediaCodecAdapter */
    public interface b {
    }

    void a();

    int b(MediaCodec.BufferInfo bufferInfo);

    void c(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i10);

    void d(int i10, boolean z10);

    void e(int i10);

    MediaFormat f();

    void flush();

    ByteBuffer g(int i10);

    void h(Surface surface);

    void i(int i10, int i11, a5.b bVar, long j10, int i12);

    void j(int i10, int i11, int i12, long j10, int i13);

    void k(b bVar, Handler handler);

    void l(Bundle bundle);

    ByteBuffer m(int i10);

    void n(int i10, long j10);

    int o();

    void start();
}
