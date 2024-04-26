package d5;

import com.google.android.exoplayer2.upstream.c;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import v6.e0;

/* compiled from: DefaultExtractorInput */
public final class f implements j {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f13026a = new byte[4096];

    /* renamed from: b  reason: collision with root package name */
    public final c f13027b;

    /* renamed from: c  reason: collision with root package name */
    public final long f13028c;

    /* renamed from: d  reason: collision with root package name */
    public long f13029d;

    /* renamed from: e  reason: collision with root package name */
    public byte[] f13030e = new byte[65536];

    /* renamed from: f  reason: collision with root package name */
    public int f13031f;

    /* renamed from: g  reason: collision with root package name */
    public int f13032g;

    public f(c cVar, long j10, long j11) {
        this.f13027b = cVar;
        this.f13029d = j10;
        this.f13028c = j11;
    }

    public int a(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.f13032g;
        int i13 = 0;
        if (i12 != 0) {
            int min = Math.min(i12, i11);
            System.arraycopy(this.f13030e, 0, bArr, i10, min);
            q(min);
            i13 = min;
        }
        if (i13 == 0) {
            i13 = p(bArr, i10, i11, 0, true);
        }
        n(i13);
        return i13;
    }

    public long b() {
        return this.f13028c;
    }

    public int c(int i10) throws IOException {
        int min = Math.min(this.f13032g, i10);
        q(min);
        if (min == 0) {
            byte[] bArr = this.f13026a;
            min = p(bArr, 0, Math.min(i10, bArr.length), 0, true);
        }
        n(min);
        return min;
    }

    public boolean d(byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        int i12;
        int i13 = this.f13032g;
        if (i13 == 0) {
            i12 = 0;
        } else {
            i12 = Math.min(i13, i11);
            System.arraycopy(this.f13030e, 0, bArr, i10, i12);
            q(i12);
        }
        int i14 = i12;
        while (i14 < i11 && i14 != -1) {
            i14 = p(bArr, i10, i11, i14, z10);
        }
        n(i14);
        if (i14 != -1) {
            return true;
        }
        return false;
    }

    public int e(byte[] bArr, int i10, int i11) throws IOException {
        int i12;
        o(i11);
        int i13 = this.f13032g;
        int i14 = this.f13031f;
        int i15 = i13 - i14;
        if (i15 == 0) {
            i12 = p(this.f13030e, i14, i11, 0, true);
            if (i12 == -1) {
                return -1;
            }
            this.f13032g += i12;
        } else {
            i12 = Math.min(i11, i15);
        }
        System.arraycopy(this.f13030e, this.f13031f, bArr, i10, i12);
        this.f13031f += i12;
        return i12;
    }

    public void f() {
        this.f13031f = 0;
    }

    public void g(int i10) throws IOException {
        int min = Math.min(this.f13032g, i10);
        q(min);
        int i11 = min;
        while (i11 < i10 && i11 != -1) {
            i11 = p(this.f13026a, -i11, Math.min(i10, this.f13026a.length + i11), i11, false);
        }
        n(i11);
    }

    public boolean h(byte[] bArr, int i10, int i11, boolean z10) throws IOException {
        if (!m(i11, z10)) {
            return false;
        }
        System.arraycopy(this.f13030e, this.f13031f - i11, bArr, i10, i11);
        return true;
    }

    public long i() {
        return this.f13029d + ((long) this.f13031f);
    }

    public void j(byte[] bArr, int i10, int i11) throws IOException {
        h(bArr, i10, i11, false);
    }

    public void k(int i10) throws IOException {
        m(i10, false);
    }

    public long l() {
        return this.f13029d;
    }

    public boolean m(int i10, boolean z10) throws IOException {
        o(i10);
        int i11 = this.f13032g - this.f13031f;
        while (i11 < i10) {
            i11 = p(this.f13030e, this.f13031f, i10, i11, z10);
            if (i11 == -1) {
                return false;
            }
            this.f13032g = this.f13031f + i11;
        }
        this.f13031f += i10;
        return true;
    }

    public final void n(int i10) {
        if (i10 != -1) {
            this.f13029d += (long) i10;
        }
    }

    public final void o(int i10) {
        int i11 = this.f13031f + i10;
        byte[] bArr = this.f13030e;
        if (i11 > bArr.length) {
            this.f13030e = Arrays.copyOf(this.f13030e, e0.i(bArr.length * 2, 65536 + i11, i11 + 524288));
        }
    }

    public final int p(byte[] bArr, int i10, int i11, int i12, boolean z10) throws IOException {
        if (!Thread.interrupted()) {
            int a10 = this.f13027b.a(bArr, i10 + i12, i11 - i12);
            if (a10 != -1) {
                return i12 + a10;
            }
            if (i12 == 0 && z10) {
                return -1;
            }
            throw new EOFException();
        }
        throw new InterruptedIOException();
    }

    public final void q(int i10) {
        int i11 = this.f13032g - i10;
        this.f13032g = i11;
        this.f13031f = 0;
        byte[] bArr = this.f13030e;
        byte[] bArr2 = i11 < bArr.length - 524288 ? new byte[(65536 + i11)] : bArr;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        this.f13030e = bArr2;
    }

    public void readFully(byte[] bArr, int i10, int i11) throws IOException {
        d(bArr, i10, i11, false);
    }
}
