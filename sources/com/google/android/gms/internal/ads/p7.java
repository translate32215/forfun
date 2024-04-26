package com.google.android.gms.internal.ads;

import android.net.Uri;
import e8.qf0;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class p7 implements ju {

    /* renamed from: a  reason: collision with root package name */
    public final ju f7822a;

    /* renamed from: b  reason: collision with root package name */
    public final long f7823b;

    /* renamed from: c  reason: collision with root package name */
    public final ju f7824c;

    /* renamed from: d  reason: collision with root package name */
    public long f7825d;

    /* renamed from: e  reason: collision with root package name */
    public Uri f7826e;

    public p7(ju juVar, int i10, ju juVar2) {
        this.f7822a = juVar;
        this.f7823b = (long) i10;
        this.f7824c = juVar2;
    }

    public final Uri M() {
        return this.f7826e;
    }

    public final int a(byte[] bArr, int i10, int i11) throws IOException {
        int i12;
        long j10 = this.f7825d;
        long j11 = this.f7823b;
        if (j10 < j11) {
            i12 = this.f7822a.a(bArr, i10, (int) Math.min((long) i11, j11 - j10));
            this.f7825d += (long) i12;
        } else {
            i12 = 0;
        }
        if (this.f7825d < this.f7823b) {
            return i12;
        }
        int a10 = this.f7824c.a(bArr, i10 + i12, i11 - i12);
        int i13 = i12 + a10;
        this.f7825d += (long) a10;
        return i13;
    }

    public final long b(qf0 qf0) throws IOException {
        qf0 qf02;
        qf0 qf03 = qf0;
        this.f7826e = qf03.f16161a;
        long j10 = qf03.f16164d;
        long j11 = this.f7823b;
        qf0 qf04 = null;
        if (j10 >= j11) {
            qf02 = null;
        } else {
            long j12 = qf03.f16165e;
            qf02 = new qf0(qf03.f16161a, j10, j12 != -1 ? Math.min(j12, j11 - j10) : j11 - j10, (String) null);
        }
        long j13 = qf03.f16165e;
        if (j13 == -1 || qf03.f16164d + j13 > this.f7823b) {
            long max = Math.max(this.f7823b, qf03.f16164d);
            long j14 = qf03.f16165e;
            qf04 = new qf0(qf03.f16161a, max, j14 != -1 ? Math.min(j14, (qf03.f16164d + j14) - this.f7823b) : -1, (String) null);
        }
        long j15 = 0;
        long b10 = qf02 != null ? this.f7822a.b(qf02) : 0;
        if (qf04 != null) {
            j15 = this.f7824c.b(qf04);
        }
        this.f7825d = qf03.f16164d;
        if (b10 == -1 || j15 == -1) {
            return -1;
        }
        return b10 + j15;
    }

    public final void close() throws IOException {
        this.f7822a.close();
        this.f7824c.close();
    }
}
