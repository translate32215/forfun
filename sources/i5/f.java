package i5;

import d5.j;
import java.io.IOException;
import v6.v;

/* compiled from: Sniffer */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final v f19232a = new v(8);

    /* renamed from: b  reason: collision with root package name */
    public int f19233b;

    public final long a(j jVar) throws IOException {
        int i10 = 0;
        jVar.j(this.f19232a.f26518a, 0, 1);
        byte b10 = this.f19232a.f26518a[0] & 255;
        if (b10 == 0) {
            return Long.MIN_VALUE;
        }
        int i11 = 128;
        int i12 = 0;
        while ((b10 & i11) == 0) {
            i11 >>= 1;
            i12++;
        }
        int i13 = b10 & (i11 ^ -1);
        jVar.j(this.f19232a.f26518a, 1, i12);
        while (i10 < i12) {
            i10++;
            i13 = (this.f19232a.f26518a[i10] & 255) + (i13 << 8);
        }
        this.f19233b = i12 + 1 + this.f19233b;
        return (long) i13;
    }
}
