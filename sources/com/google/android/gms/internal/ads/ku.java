package com.google.android.gms.internal.ads;

import android.net.Uri;
import e8.qf0;
import java.io.IOException;
import o.a;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ku implements ju {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f7298a;

    /* renamed from: b  reason: collision with root package name */
    public Uri f7299b;

    /* renamed from: c  reason: collision with root package name */
    public int f7300c;

    /* renamed from: d  reason: collision with root package name */
    public int f7301d;

    public ku(byte[] bArr) {
        bArr.getClass();
        a.a(bArr.length > 0);
        this.f7298a = bArr;
    }

    public final Uri M() {
        return this.f7299b;
    }

    public final int a(byte[] bArr, int i10, int i11) throws IOException {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.f7301d;
        if (i12 == 0) {
            return -1;
        }
        int min = Math.min(i11, i12);
        System.arraycopy(this.f7298a, this.f7300c, bArr, i10, min);
        this.f7300c += min;
        this.f7301d -= min;
        return min;
    }

    public final long b(qf0 qf0) throws IOException {
        this.f7299b = qf0.f16161a;
        long j10 = qf0.f16164d;
        int i10 = (int) j10;
        this.f7300c = i10;
        long j11 = qf0.f16165e;
        if (j11 == -1) {
            j11 = ((long) this.f7298a.length) - j10;
        }
        int i11 = (int) j11;
        this.f7301d = i11;
        if (i11 > 0 && i10 + i11 <= this.f7298a.length) {
            return (long) i11;
        }
        int i12 = this.f7300c;
        long j12 = qf0.f16165e;
        int length = this.f7298a.length;
        StringBuilder sb2 = new StringBuilder(77);
        sb2.append("Unsatisfiable range: [");
        sb2.append(i12);
        sb2.append(", ");
        sb2.append(j12);
        sb2.append("], length: ");
        sb2.append(length);
        throw new IOException(sb2.toString());
    }

    public final void close() throws IOException {
        this.f7299b = null;
    }
}
