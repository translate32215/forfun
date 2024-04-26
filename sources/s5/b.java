package s5;

import java.nio.ByteBuffer;
import java.util.Arrays;
import q5.a;
import q5.e;
import q5.h;
import v6.v;

/* compiled from: EventMessageDecoder */
public final class b extends h {
    public a b(e eVar, ByteBuffer byteBuffer) {
        return new a(c(new v(byteBuffer.array(), byteBuffer.limit())));
    }

    public a c(v vVar) {
        String n10 = vVar.n();
        n10.getClass();
        String n11 = vVar.n();
        n11.getClass();
        return new a(n10, n11, vVar.t(), vVar.t(), Arrays.copyOfRange(vVar.f26518a, vVar.f26519b, vVar.f26520c));
    }
}
