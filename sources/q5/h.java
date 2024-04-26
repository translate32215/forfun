package q5;

import java.nio.ByteBuffer;
import v6.a;

/* compiled from: SimpleMetadataDecoder */
public abstract class h implements c {
    public final a a(e eVar) {
        ByteBuffer byteBuffer = eVar.f86c;
        byteBuffer.getClass();
        a.a(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        if (eVar.q()) {
            return null;
        }
        return b(eVar, byteBuffer);
    }

    public abstract a b(e eVar, ByteBuffer byteBuffer);
}
