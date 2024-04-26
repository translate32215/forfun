package y0;

import java.nio.ByteBuffer;

/* compiled from: Table */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public int f27975a;

    /* renamed from: b  reason: collision with root package name */
    public ByteBuffer f27976b;

    /* renamed from: c  reason: collision with root package name */
    public int f27977c;

    /* renamed from: d  reason: collision with root package name */
    public int f27978d;

    public c() {
        if (d.f27979a == null) {
            d.f27979a = new d();
        }
    }

    public int a(int i10) {
        if (i10 < this.f27978d) {
            return this.f27976b.getShort(this.f27977c + i10);
        }
        return 0;
    }

    public void b(int i10, ByteBuffer byteBuffer) {
        this.f27976b = byteBuffer;
        if (byteBuffer != null) {
            this.f27975a = i10;
            int i11 = i10 - byteBuffer.getInt(i10);
            this.f27977c = i11;
            this.f27978d = this.f27976b.getShort(i11);
            return;
        }
        this.f27975a = 0;
        this.f27977c = 0;
        this.f27978d = 0;
    }
}
