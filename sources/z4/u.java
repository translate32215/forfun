package z4;

import java.nio.ByteBuffer;
import v6.e0;
import z4.g;

/* compiled from: FloatResamplingAudioProcessor */
public final class u extends p {

    /* renamed from: i  reason: collision with root package name */
    public static final int f28475i = Float.floatToIntBits(Float.NaN);

    public static void m(int i10, ByteBuffer byteBuffer) {
        double d10 = (double) i10;
        Double.isNaN(d10);
        int floatToIntBits = Float.floatToIntBits((float) (d10 * 4.656612875245797E-10d));
        if (floatToIntBits == f28475i) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    public void f(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i10 = limit - position;
        int i11 = this.f28411b.f28351c;
        if (i11 == 536870912) {
            byteBuffer2 = l((i10 / 3) * 4);
            while (position < limit) {
                m(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), byteBuffer2);
                position += 3;
            }
        } else if (i11 == 805306368) {
            byteBuffer2 = l(i10);
            while (position < limit) {
                m((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), byteBuffer2);
                position += 4;
            }
        } else {
            throw new IllegalStateException();
        }
        byteBuffer.position(byteBuffer.limit());
        byteBuffer2.flip();
    }

    public g.a h(g.a aVar) throws g.b {
        int i10 = aVar.f28351c;
        if (!e0.G(i10)) {
            throw new g.b(aVar);
        } else if (i10 != 4) {
            return new g.a(aVar.f28349a, aVar.f28350b, 4);
        } else {
            return g.a.f28348e;
        }
    }
}
