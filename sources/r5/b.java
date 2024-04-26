package r5;

import aa.c;
import d5.b0;
import j.f;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import q5.a;
import q5.e;
import q5.h;

/* compiled from: AppInfoTableDecoder */
public final class b extends h {
    public a b(e eVar, ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            b0 b0Var = new b0(byteBuffer.array(), byteBuffer.limit());
            b0Var.s(12);
            int f10 = (b0Var.f() + b0Var.i(12)) - 4;
            b0Var.s(44);
            b0Var.t(b0Var.i(12));
            b0Var.s(16);
            ArrayList arrayList = new ArrayList();
            while (b0Var.f() < f10) {
                b0Var.s(48);
                int i10 = b0Var.i(8);
                b0Var.s(4);
                int f11 = b0Var.f() + b0Var.i(12);
                String str = null;
                String str2 = null;
                while (b0Var.f() < f11) {
                    int i11 = b0Var.i(8);
                    int i12 = b0Var.i(8);
                    int f12 = b0Var.f() + i12;
                    if (i11 == 2) {
                        int i13 = b0Var.i(16);
                        b0Var.s(8);
                        if (i13 != 3) {
                        }
                        while (b0Var.f() < f12) {
                            int i14 = b0Var.i(8);
                            Charset charset = c.f176a;
                            byte[] bArr = new byte[i14];
                            b0Var.k(bArr, 0, i14);
                            str = new String(bArr, charset);
                            int i15 = b0Var.i(8);
                            for (int i16 = 0; i16 < i15; i16++) {
                                b0Var.t(b0Var.i(8));
                            }
                        }
                    } else if (i11 == 21) {
                        Charset charset2 = c.f176a;
                        byte[] bArr2 = new byte[i12];
                        b0Var.k(bArr2, 0, i12);
                        str2 = new String(bArr2, charset2);
                    }
                    b0Var.p(f12 * 8);
                }
                b0Var.p(f11 * 8);
                if (!(str == null || str2 == null)) {
                    arrayList.add(new a(i10, f.a(str, str2)));
                }
            }
            if (!arrayList.isEmpty()) {
                return new a((List<? extends a.b>) arrayList);
            }
        }
        return null;
    }
}
