package w6;

import d5.b0;
import java.util.Collections;
import java.util.List;
import v6.c;
import v6.u;
import v6.v;
import x4.m0;

/* compiled from: HevcConfig */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final List<byte[]> f27053a;

    /* renamed from: b  reason: collision with root package name */
    public final int f27054b;

    /* renamed from: c  reason: collision with root package name */
    public final String f27055c;

    public f(List<byte[]> list, int i10, String str) {
        this.f27053a = list;
        this.f27054b = i10;
        this.f27055c = str;
    }

    public static f a(v vVar) throws m0 {
        List list;
        v vVar2 = vVar;
        try {
            vVar2.E(21);
            int s10 = vVar.s() & 3;
            int s11 = vVar.s();
            int i10 = vVar2.f26519b;
            int i11 = 0;
            for (int i12 = 0; i12 < s11; i12++) {
                vVar2.E(1);
                int x10 = vVar.x();
                for (int i13 = 0; i13 < x10; i13++) {
                    int x11 = vVar.x();
                    i11 += x11 + 4;
                    vVar2.E(x11);
                }
            }
            vVar2.D(i10);
            byte[] bArr = new byte[i11];
            String str = null;
            int i14 = 0;
            for (int i15 = 0; i15 < s11; i15++) {
                int s12 = vVar.s() & 127;
                int x12 = vVar.x();
                for (int i16 = 0; i16 < x12; i16++) {
                    int x13 = vVar.x();
                    byte[] bArr2 = u.f26498a;
                    System.arraycopy(bArr2, 0, bArr, i14, bArr2.length);
                    int length = i14 + bArr2.length;
                    System.arraycopy(vVar2.f26518a, vVar2.f26519b, bArr, length, x13);
                    if (s12 == 33 && i16 == 0) {
                        str = c.b(new b0(bArr, length, length + x13));
                    }
                    i14 = length + x13;
                    vVar2.E(x13);
                }
            }
            if (i11 == 0) {
                list = null;
            } else {
                list = Collections.singletonList(bArr);
            }
            return new f(list, s10 + 1, str);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw new m0("Error parsing HEVC config", e10);
        }
    }
}
