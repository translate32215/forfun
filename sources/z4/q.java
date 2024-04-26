package z4;

import java.nio.ByteBuffer;
import z4.g;

/* compiled from: ChannelMappingAudioProcessor */
public final class q extends p {

    /* renamed from: i  reason: collision with root package name */
    public int[] f28418i;

    /* renamed from: j  reason: collision with root package name */
    public int[] f28419j;

    public void f(ByteBuffer byteBuffer) {
        int[] iArr = this.f28419j;
        iArr.getClass();
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer l10 = l(((limit - position) / this.f28411b.f28352d) * this.f28412c.f28352d);
        while (position < limit) {
            for (int i10 : iArr) {
                l10.putShort(byteBuffer.getShort((i10 * 2) + position));
            }
            position += this.f28411b.f28352d;
        }
        byteBuffer.position(limit);
        l10.flip();
    }

    public g.a h(g.a aVar) throws g.b {
        int[] iArr = this.f28418i;
        if (iArr == null) {
            return g.a.f28348e;
        }
        if (aVar.f28351c == 2) {
            boolean z10 = aVar.f28350b != iArr.length;
            int i10 = 0;
            while (i10 < iArr.length) {
                int i11 = iArr[i10];
                if (i11 < aVar.f28350b) {
                    z10 |= i11 != i10;
                    i10++;
                } else {
                    throw new g.b(aVar);
                }
            }
            if (z10) {
                return new g.a(aVar.f28349a, iArr.length, 2);
            }
            return g.a.f28348e;
        }
        throw new g.b(aVar);
    }

    public void i() {
        this.f28419j = this.f28418i;
    }

    public void k() {
        this.f28419j = null;
        this.f28418i = null;
    }
}
