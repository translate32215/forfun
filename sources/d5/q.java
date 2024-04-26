package d5;

import d5.s;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import q5.a;
import v5.g;
import v6.v;

/* compiled from: FlacMetadataReader */
public final class q {
    public static a a(j jVar, boolean z10) throws IOException {
        g.a aVar = z10 ? null : g.f26400b;
        v vVar = new v(10);
        a aVar2 = null;
        int i10 = 0;
        while (true) {
            try {
                jVar.j(vVar.f26518a, 0, 10);
                vVar.D(0);
                if (vVar.u() != 4801587) {
                    break;
                }
                vVar.E(3);
                int r10 = vVar.r();
                int i11 = r10 + 10;
                if (aVar2 == null) {
                    byte[] bArr = new byte[i11];
                    System.arraycopy(vVar.f26518a, 0, bArr, 0, 10);
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
        if (aVar2 == null || aVar2.f24150a.length == 0) {
            return null;
        }
        return aVar2;
    }

    public static s.a b(v vVar) {
        vVar.E(1);
        int u10 = vVar.u();
        long j10 = ((long) vVar.f26519b) + ((long) u10);
        int i10 = u10 / 18;
        long[] jArr = new long[i10];
        long[] jArr2 = new long[i10];
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                break;
            }
            long m10 = vVar.m();
            if (m10 == -1) {
                jArr = Arrays.copyOf(jArr, i11);
                jArr2 = Arrays.copyOf(jArr2, i11);
                break;
            }
            jArr[i11] = m10;
            jArr2[i11] = vVar.m();
            vVar.E(2);
            i11++;
        }
        vVar.E((int) (j10 - ((long) vVar.f26519b)));
        return new s.a(jArr, jArr2);
    }
}
