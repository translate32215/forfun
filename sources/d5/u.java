package d5;

import java.io.EOFException;
import java.io.IOException;
import q5.a;
import v5.g;
import v6.v;

/* compiled from: Id3Peeker */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    public final v f13058a = new v(10);

    public a a(j jVar, g.a aVar) throws IOException {
        a aVar2 = null;
        int i10 = 0;
        while (true) {
            try {
                jVar.j(this.f13058a.f26518a, 0, 10);
                this.f13058a.D(0);
                if (this.f13058a.u() != 4801587) {
                    break;
                }
                this.f13058a.E(3);
                int r10 = this.f13058a.r();
                int i11 = r10 + 10;
                if (aVar2 == null) {
                    byte[] bArr = new byte[i11];
                    System.arraycopy(this.f13058a.f26518a, 0, bArr, 0, 10);
                    jVar.j(bArr, 10, r10);
                    aVar2 = new g(aVar).d(bArr, i11);
                } else {
                    jVar.k(r10);
                }
                i10 += i11;
            } catch (EOFException unused) {
            }
        }
        jVar.f();
        jVar.k(i10);
        return aVar2;
    }
}
