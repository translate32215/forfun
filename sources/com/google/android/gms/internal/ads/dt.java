package com.google.android.gms.internal.ads;

import e8.lc0;
import e8.wc0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class dt implements ys {

    /* renamed from: b  reason: collision with root package name */
    public int f6241b = -1;

    /* renamed from: c  reason: collision with root package name */
    public int f6242c = -1;

    /* renamed from: d  reason: collision with root package name */
    public wc0 f6243d;

    /* renamed from: e  reason: collision with root package name */
    public float f6244e = 1.0f;

    /* renamed from: f  reason: collision with root package name */
    public float f6245f = 1.0f;

    /* renamed from: g  reason: collision with root package name */
    public ByteBuffer f6246g;

    /* renamed from: h  reason: collision with root package name */
    public ShortBuffer f6247h;

    /* renamed from: i  reason: collision with root package name */
    public ByteBuffer f6248i;

    /* renamed from: j  reason: collision with root package name */
    public long f6249j;

    /* renamed from: k  reason: collision with root package name */
    public long f6250k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f6251l;

    public dt() {
        ByteBuffer byteBuffer = ys.f8641a;
        this.f6246g = byteBuffer;
        this.f6247h = byteBuffer.asShortBuffer();
        this.f6248i = byteBuffer;
    }

    public final boolean a() {
        return Math.abs(this.f6244e - 1.0f) >= 0.01f || Math.abs(this.f6245f - 1.0f) >= 0.01f;
    }

    public final void b() {
        this.f6243d = null;
        ByteBuffer byteBuffer = ys.f8641a;
        this.f6246g = byteBuffer;
        this.f6247h = byteBuffer.asShortBuffer();
        this.f6248i = byteBuffer;
        this.f6241b = -1;
        this.f6242c = -1;
        this.f6249j = 0;
        this.f6250k = 0;
        this.f6251l = false;
    }

    public final int c() {
        return this.f6241b;
    }

    public final boolean d(int i10, int i11, int i12) throws lc0 {
        if (i12 != 2) {
            throw new lc0(i10, i11, i12);
        } else if (this.f6242c == i10 && this.f6241b == i11) {
            return false;
        } else {
            this.f6242c = i10;
            this.f6241b = i11;
            return true;
        }
    }

    public final int e() {
        return 2;
    }

    public final boolean f() {
        if (!this.f6251l) {
            return false;
        }
        wc0 wc0 = this.f6243d;
        return wc0 == null || wc0.f17257r == 0;
    }

    public final void flush() {
        wc0 wc0 = new wc0(this.f6242c, this.f6241b);
        this.f6243d = wc0;
        wc0.f17254o = this.f6244e;
        wc0.f17255p = this.f6245f;
        this.f6248i = ys.f8641a;
        this.f6249j = 0;
        this.f6250k = 0;
        this.f6251l = false;
    }

    public final void g() {
        int i10;
        wc0 wc0 = this.f6243d;
        int i11 = wc0.f17256q;
        float f10 = wc0.f17254o;
        float f11 = wc0.f17255p;
        int i12 = wc0.f17257r + ((int) ((((((float) i11) / (f10 / f11)) + ((float) wc0.f17258s)) / f11) + 0.5f));
        wc0.g((wc0.f17244e * 2) + i11);
        int i13 = 0;
        while (true) {
            i10 = wc0.f17244e * 2;
            int i14 = wc0.f17241b;
            if (i13 >= i10 * i14) {
                break;
            }
            wc0.f17247h[(i14 * i11) + i13] = 0;
            i13++;
        }
        wc0.f17256q = i10 + wc0.f17256q;
        wc0.e();
        if (wc0.f17257r > i12) {
            wc0.f17257r = i12;
        }
        wc0.f17256q = 0;
        wc0.f17259t = 0;
        wc0.f17258s = 0;
        this.f6251l = true;
    }

    public final void h(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.f6249j += (long) remaining;
            wc0 wc0 = this.f6243d;
            wc0.getClass();
            int remaining2 = asShortBuffer.remaining();
            int i10 = wc0.f17241b;
            int i11 = remaining2 / i10;
            wc0.g(i11);
            asShortBuffer.get(wc0.f17247h, wc0.f17256q * wc0.f17241b, ((i10 * i11) << 1) / 2);
            wc0.f17256q += i11;
            wc0.e();
            byteBuffer.position(byteBuffer.position() + remaining);
        }
        int i12 = (this.f6243d.f17257r * this.f6241b) << 1;
        if (i12 > 0) {
            if (this.f6246g.capacity() < i12) {
                ByteBuffer order = ByteBuffer.allocateDirect(i12).order(ByteOrder.nativeOrder());
                this.f6246g = order;
                this.f6247h = order.asShortBuffer();
            } else {
                this.f6246g.clear();
                this.f6247h.clear();
            }
            wc0 wc02 = this.f6243d;
            ShortBuffer shortBuffer = this.f6247h;
            wc02.getClass();
            int min = Math.min(shortBuffer.remaining() / wc02.f17241b, wc02.f17257r);
            shortBuffer.put(wc02.f17249j, 0, wc02.f17241b * min);
            int i13 = wc02.f17257r - min;
            wc02.f17257r = i13;
            short[] sArr = wc02.f17249j;
            int i14 = wc02.f17241b;
            System.arraycopy(sArr, min * i14, sArr, 0, i13 * i14);
            this.f6250k += (long) i12;
            this.f6246g.limit(i12);
            this.f6248i = this.f6246g;
        }
    }

    public final ByteBuffer i() {
        ByteBuffer byteBuffer = this.f6248i;
        this.f6248i = ys.f8641a;
        return byteBuffer;
    }
}
