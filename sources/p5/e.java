package p5;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import v6.e0;
import v6.f;

/* compiled from: AsynchronousMediaCodecBufferEnqueuer */
public class e {

    /* renamed from: h  reason: collision with root package name */
    public static final ArrayDeque<a> f23842h = new ArrayDeque<>();

    /* renamed from: i  reason: collision with root package name */
    public static final Object f23843i = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final MediaCodec f23844a;

    /* renamed from: b  reason: collision with root package name */
    public final HandlerThread f23845b;

    /* renamed from: c  reason: collision with root package name */
    public Handler f23846c;

    /* renamed from: d  reason: collision with root package name */
    public final AtomicReference<RuntimeException> f23847d = new AtomicReference<>();

    /* renamed from: e  reason: collision with root package name */
    public final f f23848e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f23849f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f23850g;

    /* compiled from: AsynchronousMediaCodecBufferEnqueuer */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f23851a;

        /* renamed from: b  reason: collision with root package name */
        public int f23852b;

        /* renamed from: c  reason: collision with root package name */
        public int f23853c;

        /* renamed from: d  reason: collision with root package name */
        public final MediaCodec.CryptoInfo f23854d = new MediaCodec.CryptoInfo();

        /* renamed from: e  reason: collision with root package name */
        public long f23855e;

        /* renamed from: f  reason: collision with root package name */
        public int f23856f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0033, code lost:
        if ((r4.contains("samsung") || r4.contains("motorola")) != false) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public e(android.media.MediaCodec r2, android.os.HandlerThread r3, boolean r4) {
        /*
            r1 = this;
            v6.f r0 = new v6.f
            r0.<init>()
            r1.<init>()
            r1.f23844a = r2
            r1.f23845b = r3
            r1.f23848e = r0
            java.util.concurrent.atomic.AtomicReference r2 = new java.util.concurrent.atomic.AtomicReference
            r2.<init>()
            r1.f23847d = r2
            r2 = 0
            r3 = 1
            if (r4 != 0) goto L_0x0035
            java.lang.String r4 = v6.e0.f26438c
            java.lang.String r4 = v6.e0.V(r4)
            java.lang.String r0 = "samsung"
            boolean r0 = r4.contains(r0)
            if (r0 != 0) goto L_0x0032
            java.lang.String r0 = "motorola"
            boolean r4 = r4.contains(r0)
            if (r4 == 0) goto L_0x0030
            goto L_0x0032
        L_0x0030:
            r4 = 0
            goto L_0x0033
        L_0x0032:
            r4 = 1
        L_0x0033:
            if (r4 == 0) goto L_0x0036
        L_0x0035:
            r2 = 1
        L_0x0036:
            r1.f23849f = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p5.e.<init>(android.media.MediaCodec, android.os.HandlerThread, boolean):void");
    }

    public static byte[] b(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < bArr.length) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static int[] c(int[] iArr, int[] iArr2) {
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 == null || iArr2.length < iArr.length) {
            return Arrays.copyOf(iArr, iArr.length);
        }
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return iArr2;
    }

    public static a e() {
        ArrayDeque<a> arrayDeque = f23842h;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                a aVar = new a();
                return aVar;
            }
            a removeFirst = arrayDeque.removeFirst();
            return removeFirst;
        }
    }

    public final void a() throws InterruptedException {
        this.f23848e.b();
        Handler handler = this.f23846c;
        int i10 = e0.f26436a;
        handler.obtainMessage(2).sendToTarget();
        this.f23848e.a();
    }

    public void d() {
        if (this.f23850g) {
            try {
                Handler handler = this.f23846c;
                int i10 = e0.f26436a;
                handler.removeCallbacksAndMessages((Object) null);
                a();
                f();
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }

    public final void f() {
        RuntimeException andSet = this.f23847d.getAndSet((Object) null);
        if (andSet != null) {
            throw andSet;
        }
    }
}
