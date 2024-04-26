package com.google.android.gms.internal.ads;

import e8.k70;
import e8.l90;
import e8.m90;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class jq extends InputStream {

    /* renamed from: a  reason: collision with root package name */
    public m90 f7157a;

    /* renamed from: b  reason: collision with root package name */
    public k70 f7158b;

    /* renamed from: c  reason: collision with root package name */
    public int f7159c;

    /* renamed from: d  reason: collision with root package name */
    public int f7160d;

    /* renamed from: e  reason: collision with root package name */
    public int f7161e;

    /* renamed from: f  reason: collision with root package name */
    public int f7162f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ hq f7163g;

    public jq(hq hqVar) {
        this.f7163g = hqVar;
        a();
    }

    public final void a() {
        m90 m90 = new m90(this.f7163g, (l90) null);
        this.f7157a = m90;
        k70 k70 = (k70) m90.next();
        this.f7158b = k70;
        this.f7159c = k70.size();
        this.f7160d = 0;
        this.f7161e = 0;
    }

    public final int available() throws IOException {
        return this.f7163g.f6888d - (this.f7161e + this.f7160d);
    }

    public final void d() {
        int i10;
        if (this.f7158b != null && this.f7160d == (i10 = this.f7159c)) {
            this.f7161e += i10;
            this.f7160d = 0;
            if (this.f7157a.hasNext()) {
                k70 k70 = (k70) this.f7157a.next();
                this.f7158b = k70;
                this.f7159c = k70.size();
                return;
            }
            this.f7158b = null;
            this.f7159c = 0;
        }
    }

    public final int i(byte[] bArr, int i10, int i11) {
        int i12 = i11;
        while (i12 > 0) {
            d();
            if (this.f7158b == null) {
                break;
            }
            int min = Math.min(this.f7159c - this.f7160d, i12);
            if (bArr != null) {
                this.f7158b.j(bArr, this.f7160d, i10, min);
                i10 += min;
            }
            this.f7160d += min;
            i12 -= min;
        }
        return i11 - i12;
    }

    public final void mark(int i10) {
        this.f7162f = this.f7161e + this.f7160d;
    }

    public final boolean markSupported() {
        return true;
    }

    public final int read(byte[] bArr, int i10, int i11) {
        bArr.getClass();
        if (i10 < 0 || i11 < 0 || i11 > bArr.length - i10) {
            throw new IndexOutOfBoundsException();
        }
        int i12 = i(bArr, i10, i11);
        if (i12 != 0) {
            return i12;
        }
        if (i11 <= 0) {
            if (this.f7163g.f6888d - (this.f7161e + this.f7160d) == 0) {
                return -1;
            }
            return i12;
        }
        return -1;
    }

    public final synchronized void reset() {
        a();
        i((byte[]) null, 0, this.f7162f);
    }

    public final long skip(long j10) {
        if (j10 >= 0) {
            if (j10 > 2147483647L) {
                j10 = 2147483647L;
            }
            return (long) i((byte[]) null, 0, (int) j10);
        }
        throw new IndexOutOfBoundsException();
    }

    public final int read() throws IOException {
        d();
        k70 k70 = this.f7158b;
        if (k70 == null) {
            return -1;
        }
        int i10 = this.f7160d;
        this.f7160d = i10 + 1;
        return k70.D(i10) & 255;
    }
}
