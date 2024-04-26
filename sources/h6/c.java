package h6;

import a5.e;
import a5.f;
import a5.h;
import a5.i;
import java.nio.ByteBuffer;
import v6.a;

/* compiled from: SimpleSubtitleDecoder */
public abstract class c extends i<i, j, g> implements f {
    public c(String str) {
        super(new i[2], new j[2]);
        a.d(this.f104g == this.f102e.length);
        for (I v10 : this.f102e) {
            v10.v(1024);
        }
    }

    public void b(long j10) {
    }

    public e f(f fVar, h hVar, boolean z10) {
        i iVar = (i) fVar;
        j jVar = (j) hVar;
        try {
            ByteBuffer byteBuffer = iVar.f86c;
            byteBuffer.getClass();
            jVar.v(iVar.f88e, k(byteBuffer.array(), byteBuffer.limit(), z10), iVar.f18956i);
            jVar.f61a &= Integer.MAX_VALUE;
            return null;
        } catch (g e10) {
            return e10;
        }
    }

    public abstract e k(byte[] bArr, int i10, boolean z10) throws g;
}
