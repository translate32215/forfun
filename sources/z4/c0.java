package z4;

import java.nio.ByteBuffer;
import v6.e0;
import z4.g;

/* compiled from: TrimmingAudioProcessor */
public final class c0 extends p {

    /* renamed from: i  reason: collision with root package name */
    public int f28330i;

    /* renamed from: j  reason: collision with root package name */
    public int f28331j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f28332k;

    /* renamed from: l  reason: collision with root package name */
    public int f28333l;

    /* renamed from: m  reason: collision with root package name */
    public byte[] f28334m = e0.f26441f;

    /* renamed from: n  reason: collision with root package name */
    public int f28335n;

    /* renamed from: o  reason: collision with root package name */
    public long f28336o;

    public ByteBuffer c() {
        int i10;
        if (super.d() && (i10 = this.f28335n) > 0) {
            l(i10).put(this.f28334m, 0, this.f28335n).flip();
            this.f28335n = 0;
        }
        return super.c();
    }

    public boolean d() {
        return super.d() && this.f28335n == 0;
    }

    public void f(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i10 = limit - position;
        if (i10 != 0) {
            int min = Math.min(i10, this.f28333l);
            this.f28336o += (long) (min / this.f28411b.f28352d);
            this.f28333l -= min;
            byteBuffer.position(position + min);
            if (this.f28333l <= 0) {
                int i11 = i10 - min;
                int length = (this.f28335n + i11) - this.f28334m.length;
                ByteBuffer l10 = l(length);
                int i12 = e0.i(length, 0, this.f28335n);
                l10.put(this.f28334m, 0, i12);
                int i13 = e0.i(length - i12, 0, i11);
                byteBuffer.limit(byteBuffer.position() + i13);
                l10.put(byteBuffer);
                byteBuffer.limit(limit);
                int i14 = i11 - i13;
                int i15 = this.f28335n - i12;
                this.f28335n = i15;
                byte[] bArr = this.f28334m;
                System.arraycopy(bArr, i12, bArr, 0, i15);
                byteBuffer.get(this.f28334m, this.f28335n, i14);
                this.f28335n += i14;
                l10.flip();
            }
        }
    }

    public g.a h(g.a aVar) throws g.b {
        if (aVar.f28351c == 2) {
            this.f28332k = true;
            return (this.f28330i == 0 && this.f28331j == 0) ? g.a.f28348e : aVar;
        }
        throw new g.b(aVar);
    }

    public void i() {
        if (this.f28332k) {
            this.f28332k = false;
            int i10 = this.f28331j;
            int i11 = this.f28411b.f28352d;
            this.f28334m = new byte[(i10 * i11)];
            this.f28333l = this.f28330i * i11;
        }
        this.f28335n = 0;
    }

    public void j() {
        if (this.f28332k) {
            int i10 = this.f28335n;
            if (i10 > 0) {
                this.f28336o += (long) (i10 / this.f28411b.f28352d);
            }
            this.f28335n = 0;
        }
    }

    public void k() {
        this.f28334m = e0.f26441f;
    }
}
