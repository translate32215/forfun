package p5;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import androidx.activity.f;
import c1.c;
import java.nio.ByteBuffer;
import p5.e;
import p5.i;
import v6.e0;
import v6.l;

/* compiled from: AsynchronousMediaCodecAdapter */
public final class b implements i {

    /* renamed from: a  reason: collision with root package name */
    public final MediaCodec f23833a;

    /* renamed from: b  reason: collision with root package name */
    public final f f23834b;

    /* renamed from: c  reason: collision with root package name */
    public final e f23835c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f23836d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f23837e;

    /* renamed from: f  reason: collision with root package name */
    public int f23838f = 0;

    public b(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z10, boolean z11, a aVar) {
        this.f23833a = mediaCodec;
        this.f23834b = new f(handlerThread);
        this.f23835c = new e(mediaCodec, handlerThread2, z10);
        this.f23836d = z11;
    }

    public static String p(int i10, String str) {
        StringBuilder sb2 = new StringBuilder(str);
        if (i10 == 1) {
            sb2.append("Audio");
        } else if (i10 == 2) {
            sb2.append("Video");
        } else {
            sb2.append("Unknown(");
            sb2.append(i10);
            sb2.append(")");
        }
        return sb2.toString();
    }

    public void a() {
        try {
            if (this.f23838f == 2) {
                e eVar = this.f23835c;
                if (eVar.f23850g) {
                    eVar.d();
                    eVar.f23845b.quit();
                }
                eVar.f23850g = false;
            }
            int i10 = this.f23838f;
            if (i10 == 1 || i10 == 2) {
                f fVar = this.f23834b;
                synchronized (fVar.f23857a) {
                    fVar.f23868l = true;
                    fVar.f23858b.quit();
                    fVar.a();
                }
            }
            this.f23838f = 3;
            if (!this.f23837e) {
                this.f23833a.release();
                this.f23837e = true;
            }
        } catch (Throwable th) {
            if (!this.f23837e) {
                this.f23833a.release();
                this.f23837e = true;
            }
            throw th;
        }
    }

    public int b(MediaCodec.BufferInfo bufferInfo) {
        int i10;
        f fVar = this.f23834b;
        synchronized (fVar.f23857a) {
            i10 = -1;
            if (!fVar.b()) {
                IllegalStateException illegalStateException = fVar.f23869m;
                if (illegalStateException == null) {
                    MediaCodec.CodecException codecException = fVar.f23866j;
                    if (codecException == null) {
                        l lVar = fVar.f23861e;
                        if (!(lVar.f26470c == 0)) {
                            i10 = lVar.e();
                            if (i10 >= 0) {
                                v6.a.f(fVar.f23864h);
                                MediaCodec.BufferInfo remove = fVar.f23862f.remove();
                                bufferInfo.set(remove.offset, remove.size, remove.presentationTimeUs, remove.flags);
                            } else if (i10 == -2) {
                                fVar.f23864h = fVar.f23863g.remove();
                            }
                        }
                    } else {
                        fVar.f23866j = null;
                        throw codecException;
                    }
                } else {
                    fVar.f23869m = null;
                    throw illegalStateException;
                }
            }
        }
        return i10;
    }

    public void c(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i10) {
        f fVar = this.f23834b;
        MediaCodec mediaCodec = this.f23833a;
        v6.a.d(fVar.f23859c == null);
        fVar.f23858b.start();
        Handler handler = new Handler(fVar.f23858b.getLooper());
        mediaCodec.setCallback(fVar, handler);
        fVar.f23859c = handler;
        this.f23833a.configure(mediaFormat, surface, mediaCrypto, i10);
        this.f23838f = 1;
    }

    public void d(int i10, boolean z10) {
        this.f23833a.releaseOutputBuffer(i10, z10);
    }

    public void e(int i10) {
        q();
        this.f23833a.setVideoScalingMode(i10);
    }

    public MediaFormat f() {
        MediaFormat mediaFormat;
        f fVar = this.f23834b;
        synchronized (fVar.f23857a) {
            mediaFormat = fVar.f23864h;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    public void flush() {
        this.f23835c.d();
        this.f23833a.flush();
        f fVar = this.f23834b;
        MediaCodec mediaCodec = this.f23833a;
        mediaCodec.getClass();
        f fVar2 = new f(mediaCodec);
        synchronized (fVar.f23857a) {
            fVar.f23867k++;
            Handler handler = fVar.f23859c;
            int i10 = e0.f26436a;
            handler.post(new c(fVar, (Runnable) fVar2));
        }
    }

    public ByteBuffer g(int i10) {
        return this.f23833a.getInputBuffer(i10);
    }

    public void h(Surface surface) {
        q();
        this.f23833a.setOutputSurface(surface);
    }

    public void i(int i10, int i11, a5.b bVar, long j10, int i12) {
        e eVar = this.f23835c;
        eVar.f();
        e.a e10 = e.e();
        e10.f23851a = i10;
        e10.f23852b = i11;
        e10.f23853c = 0;
        e10.f23855e = j10;
        e10.f23856f = i12;
        MediaCodec.CryptoInfo cryptoInfo = e10.f23854d;
        cryptoInfo.numSubSamples = bVar.f67f;
        cryptoInfo.numBytesOfClearData = e.c(bVar.f65d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = e.c(bVar.f66e, cryptoInfo.numBytesOfEncryptedData);
        byte[] b10 = e.b(bVar.f63b, cryptoInfo.key);
        b10.getClass();
        cryptoInfo.key = b10;
        byte[] b11 = e.b(bVar.f62a, cryptoInfo.iv);
        b11.getClass();
        cryptoInfo.iv = b11;
        cryptoInfo.mode = bVar.f64c;
        if (e0.f26436a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(bVar.f68g, bVar.f69h));
        }
        eVar.f23846c.obtainMessage(1, e10).sendToTarget();
    }

    public void j(int i10, int i11, int i12, long j10, int i13) {
        e eVar = this.f23835c;
        eVar.f();
        e.a e10 = e.e();
        e10.f23851a = i10;
        e10.f23852b = i11;
        e10.f23853c = i12;
        e10.f23855e = j10;
        e10.f23856f = i13;
        Handler handler = eVar.f23846c;
        int i14 = e0.f26436a;
        handler.obtainMessage(0, e10).sendToTarget();
    }

    public void k(i.b bVar, Handler handler) {
        q();
        this.f23833a.setOnFrameRenderedListener(new a(this, bVar), handler);
    }

    public void l(Bundle bundle) {
        q();
        this.f23833a.setParameters(bundle);
    }

    public ByteBuffer m(int i10) {
        return this.f23833a.getOutputBuffer(i10);
    }

    public void n(int i10, long j10) {
        this.f23833a.releaseOutputBuffer(i10, j10);
    }

    public int o() {
        int i10;
        f fVar = this.f23834b;
        synchronized (fVar.f23857a) {
            i10 = -1;
            if (!fVar.b()) {
                IllegalStateException illegalStateException = fVar.f23869m;
                if (illegalStateException == null) {
                    MediaCodec.CodecException codecException = fVar.f23866j;
                    if (codecException == null) {
                        l lVar = fVar.f23860d;
                        if (!(lVar.f26470c == 0)) {
                            i10 = lVar.e();
                        }
                    } else {
                        fVar.f23866j = null;
                        throw codecException;
                    }
                } else {
                    fVar.f23869m = null;
                    throw illegalStateException;
                }
            }
        }
        return i10;
    }

    public final void q() {
        if (this.f23836d) {
            try {
                this.f23835c.a();
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }

    public void start() {
        e eVar = this.f23835c;
        if (!eVar.f23850g) {
            eVar.f23845b.start();
            eVar.f23846c = new d(eVar, eVar.f23845b.getLooper());
            eVar.f23850g = true;
        }
        this.f23833a.start();
        this.f23838f = 2;
    }
}
