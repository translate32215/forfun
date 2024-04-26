package p5;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import v6.l;

/* compiled from: AsynchronousMediaCodecCallback */
public final class f extends MediaCodec.Callback {

    /* renamed from: a  reason: collision with root package name */
    public final Object f23857a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final HandlerThread f23858b;

    /* renamed from: c  reason: collision with root package name */
    public Handler f23859c;

    /* renamed from: d  reason: collision with root package name */
    public final l f23860d;

    /* renamed from: e  reason: collision with root package name */
    public final l f23861e;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayDeque<MediaCodec.BufferInfo> f23862f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayDeque<MediaFormat> f23863g;

    /* renamed from: h  reason: collision with root package name */
    public MediaFormat f23864h;

    /* renamed from: i  reason: collision with root package name */
    public MediaFormat f23865i;

    /* renamed from: j  reason: collision with root package name */
    public MediaCodec.CodecException f23866j;

    /* renamed from: k  reason: collision with root package name */
    public long f23867k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f23868l;

    /* renamed from: m  reason: collision with root package name */
    public IllegalStateException f23869m;

    public f(HandlerThread handlerThread) {
        this.f23858b = handlerThread;
        this.f23860d = new l();
        this.f23861e = new l();
        this.f23862f = new ArrayDeque<>();
        this.f23863g = new ArrayDeque<>();
    }

    public final void a() {
        if (!this.f23863g.isEmpty()) {
            this.f23865i = this.f23863g.getLast();
        }
        l lVar = this.f23860d;
        lVar.f26468a = 0;
        lVar.f26469b = -1;
        lVar.f26470c = 0;
        l lVar2 = this.f23861e;
        lVar2.f26468a = 0;
        lVar2.f26469b = -1;
        lVar2.f26470c = 0;
        this.f23862f.clear();
        this.f23863g.clear();
        this.f23866j = null;
    }

    public final boolean b() {
        return this.f23867k > 0 || this.f23868l;
    }

    public final void c(IllegalStateException illegalStateException) {
        synchronized (this.f23857a) {
            this.f23869m = illegalStateException;
        }
    }

    public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f23857a) {
            this.f23866j = codecException;
        }
    }

    public void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        synchronized (this.f23857a) {
            this.f23860d.d(i10);
        }
    }

    public void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f23857a) {
            MediaFormat mediaFormat = this.f23865i;
            if (mediaFormat != null) {
                this.f23861e.d(-2);
                this.f23863g.add(mediaFormat);
                this.f23865i = null;
            }
            this.f23861e.d(i10);
            this.f23862f.add(bufferInfo);
        }
    }

    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f23857a) {
            this.f23861e.d(-2);
            this.f23863g.add(mediaFormat);
            this.f23865i = null;
        }
    }
}
