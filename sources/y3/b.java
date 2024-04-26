package y3;

import g4.a;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;
import k3.e;
import m3.w;
import x3.c;

/* compiled from: GifDrawableBytesTranscoder */
public class b implements c<c, byte[]> {
    public b(int i10) {
    }

    public w<byte[]> m(w<c> wVar, e eVar) {
        byte[] bArr;
        ByteBuffer asReadOnlyBuffer = wVar.get().f27305a.f27315a.f27317a.g().asReadOnlyBuffer();
        AtomicReference<byte[]> atomicReference = a.f18442a;
        a.b bVar = (asReadOnlyBuffer.isReadOnly() || !asReadOnlyBuffer.hasArray()) ? null : new a.b(asReadOnlyBuffer.array(), asReadOnlyBuffer.arrayOffset(), asReadOnlyBuffer.limit());
        if (bVar != null && bVar.f18445a == 0 && bVar.f18446b == bVar.f18447c.length) {
            bArr = asReadOnlyBuffer.array();
        } else {
            ByteBuffer asReadOnlyBuffer2 = asReadOnlyBuffer.asReadOnlyBuffer();
            byte[] bArr2 = new byte[asReadOnlyBuffer2.limit()];
            asReadOnlyBuffer2.position(0);
            asReadOnlyBuffer2.get(bArr2);
            bArr = bArr2;
        }
        return new u3.b(bArr);
    }
}
