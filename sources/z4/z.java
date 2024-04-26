package z4;

import java.nio.ByteBuffer;
import v6.a;
import v6.e0;
import z4.g;

/* compiled from: SilenceSkippingAudioProcessor */
public final class z extends p {

    /* renamed from: i  reason: collision with root package name */
    public final long f28497i = 150000;

    /* renamed from: j  reason: collision with root package name */
    public final long f28498j = 20000;

    /* renamed from: k  reason: collision with root package name */
    public final short f28499k = 1024;

    /* renamed from: l  reason: collision with root package name */
    public int f28500l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f28501m;

    /* renamed from: n  reason: collision with root package name */
    public byte[] f28502n;

    /* renamed from: o  reason: collision with root package name */
    public byte[] f28503o;

    /* renamed from: p  reason: collision with root package name */
    public int f28504p;

    /* renamed from: q  reason: collision with root package name */
    public int f28505q;

    /* renamed from: r  reason: collision with root package name */
    public int f28506r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f28507s;

    /* renamed from: t  reason: collision with root package name */
    public long f28508t;

    public z() {
        a.a(true);
        byte[] bArr = e0.f26441f;
        this.f28502n = bArr;
        this.f28503o = bArr;
    }

    public boolean a() {
        return this.f28501m;
    }

    public void f(ByteBuffer byteBuffer) {
        int position;
        while (byteBuffer.hasRemaining() && !this.f28416g.hasRemaining()) {
            int i10 = this.f28504p;
            if (i10 == 0) {
                int limit = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.f28502n.length));
                int limit2 = byteBuffer.limit();
                while (true) {
                    limit2 -= 2;
                    if (limit2 >= byteBuffer.position()) {
                        if (Math.abs(byteBuffer.getShort(limit2)) > this.f28499k) {
                            int i11 = this.f28500l;
                            position = ((limit2 / i11) * i11) + i11;
                            break;
                        }
                    } else {
                        position = byteBuffer.position();
                        break;
                    }
                }
                if (position == byteBuffer.position()) {
                    this.f28504p = 1;
                } else {
                    byteBuffer.limit(position);
                    int remaining = byteBuffer.remaining();
                    l(remaining).put(byteBuffer).flip();
                    if (remaining > 0) {
                        this.f28507s = true;
                    }
                }
                byteBuffer.limit(limit);
            } else if (i10 == 1) {
                int limit3 = byteBuffer.limit();
                int m10 = m(byteBuffer);
                int position2 = m10 - byteBuffer.position();
                byte[] bArr = this.f28502n;
                int length = bArr.length;
                int i12 = this.f28505q;
                int i13 = length - i12;
                if (m10 >= limit3 || position2 >= i13) {
                    int min = Math.min(position2, i13);
                    byteBuffer.limit(byteBuffer.position() + min);
                    byteBuffer.get(this.f28502n, this.f28505q, min);
                    int i14 = this.f28505q + min;
                    this.f28505q = i14;
                    byte[] bArr2 = this.f28502n;
                    if (i14 == bArr2.length) {
                        if (this.f28507s) {
                            n(bArr2, this.f28506r);
                            this.f28508t += (long) ((this.f28505q - (this.f28506r * 2)) / this.f28500l);
                        } else {
                            this.f28508t += (long) ((i14 - this.f28506r) / this.f28500l);
                        }
                        o(byteBuffer, this.f28502n, this.f28505q);
                        this.f28505q = 0;
                        this.f28504p = 2;
                    }
                    byteBuffer.limit(limit3);
                } else {
                    n(bArr, i12);
                    this.f28505q = 0;
                    this.f28504p = 0;
                }
            } else if (i10 == 2) {
                int limit4 = byteBuffer.limit();
                int m11 = m(byteBuffer);
                byteBuffer.limit(m11);
                this.f28508t += (long) (byteBuffer.remaining() / this.f28500l);
                o(byteBuffer, this.f28503o, this.f28506r);
                if (m11 < limit4) {
                    n(this.f28503o, this.f28506r);
                    this.f28504p = 0;
                    byteBuffer.limit(limit4);
                }
            } else {
                throw new IllegalStateException();
            }
        }
    }

    public g.a h(g.a aVar) throws g.b {
        if (aVar.f28351c == 2) {
            return this.f28501m ? aVar : g.a.f28348e;
        }
        throw new g.b(aVar);
    }

    public void i() {
        if (this.f28501m) {
            g.a aVar = this.f28411b;
            int i10 = aVar.f28352d;
            this.f28500l = i10;
            long j10 = this.f28497i;
            long j11 = (long) aVar.f28349a;
            int i11 = ((int) ((j10 * j11) / 1000000)) * i10;
            if (this.f28502n.length != i11) {
                this.f28502n = new byte[i11];
            }
            int i12 = ((int) ((this.f28498j * j11) / 1000000)) * i10;
            this.f28506r = i12;
            if (this.f28503o.length != i12) {
                this.f28503o = new byte[i12];
            }
        }
        this.f28504p = 0;
        this.f28508t = 0;
        this.f28505q = 0;
        this.f28507s = false;
    }

    public void j() {
        int i10 = this.f28505q;
        if (i10 > 0) {
            n(this.f28502n, i10);
        }
        if (!this.f28507s) {
            this.f28508t += (long) (this.f28506r / this.f28500l);
        }
    }

    public void k() {
        this.f28501m = false;
        this.f28506r = 0;
        byte[] bArr = e0.f26441f;
        this.f28502n = bArr;
        this.f28503o = bArr;
    }

    public final int m(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position(); position < byteBuffer.limit(); position += 2) {
            if (Math.abs(byteBuffer.getShort(position)) > this.f28499k) {
                int i10 = this.f28500l;
                return (position / i10) * i10;
            }
        }
        return byteBuffer.limit();
    }

    public final void n(byte[] bArr, int i10) {
        l(i10).put(bArr, 0, i10).flip();
        if (i10 > 0) {
            this.f28507s = true;
        }
    }

    public final void o(ByteBuffer byteBuffer, byte[] bArr, int i10) {
        int min = Math.min(byteBuffer.remaining(), this.f28506r);
        int i11 = this.f28506r - min;
        System.arraycopy(bArr, i10 - i11, this.f28503o, 0, i11);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.f28503o, i11, min);
    }
}
