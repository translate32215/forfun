package n5;

import aa.c;
import android.util.SparseArray;
import ba.a;
import ba.o0;
import ba.s;
import com.startapp.b4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import n5.e0;
import x4.b0;

/* compiled from: DefaultTsPayloadReaderFactory */
public final class g implements e0.c {

    /* renamed from: a  reason: collision with root package name */
    public final int f22101a;

    /* renamed from: b  reason: collision with root package name */
    public final List<b0> f22102b;

    public g(int i10) {
        a<Object> aVar = s.f3795b;
        s<Object> sVar = o0.f3765e;
        this.f22101a = i10;
        this.f22102b = sVar;
    }

    public SparseArray<e0> a() {
        return new SparseArray<>();
    }

    public e0 b(int i10, e0.b bVar) {
        if (i10 == 2) {
            return new t(new k(new f0(c(bVar))));
        }
        if (i10 == 3 || i10 == 4) {
            return new t(new q(bVar.f22069a));
        }
        if (i10 == 21) {
            return new t(new o());
        }
        if (i10 != 27) {
            if (i10 == 36) {
                return new t(new n(new z(c(bVar))));
            }
            if (i10 == 89) {
                return new t(new i(bVar.f22070b));
            }
            if (i10 != 138) {
                if (i10 == 172) {
                    return new t(new d(bVar.f22069a));
                }
                if (i10 == 257) {
                    return new y(new s("application/vnd.dvb.ait"));
                }
                if (i10 != 129) {
                    if (i10 != 130) {
                        if (i10 != 134) {
                            if (i10 != 135) {
                                switch (i10) {
                                    case 15:
                                        if (d(2)) {
                                            return null;
                                        }
                                        return new t(new f(false, bVar.f22069a));
                                    case 16:
                                        return new t(new l(new f0(c(bVar))));
                                    case 17:
                                        if (d(2)) {
                                            return null;
                                        }
                                        return new t(new p(bVar.f22069a));
                                    default:
                                        return null;
                                }
                            }
                        } else if (d(16)) {
                            return null;
                        } else {
                            return new y(new s("application/x-scte35"));
                        }
                    } else if (!d(64)) {
                        return null;
                    }
                }
                return new t(new b(bVar.f22069a));
            }
            return new t(new h(bVar.f22069a));
        } else if (d(4)) {
            return null;
        } else {
            return new t(new m(new z(c(bVar)), d(1), d(8)));
        }
    }

    public final List<b0> c(e0.b bVar) {
        String str;
        byte b10;
        if (d(32)) {
            return this.f22102b;
        }
        byte[] bArr = bVar.f22071c;
        int length = bArr.length;
        int i10 = 0;
        List<b0> list = this.f22102b;
        while (length - i10 > 0) {
            int i11 = i10 + 1;
            byte b11 = bArr[i10] & 255;
            int i12 = i11 + 1;
            int i13 = (bArr[i11] & 255) + i12;
            boolean z10 = true;
            ArrayList arrayList = list;
            if (b11 == 134) {
                ArrayList arrayList2 = new ArrayList();
                int i14 = i12 + 1;
                byte b12 = bArr[i12] & 255 & 31;
                int i15 = 0;
                while (i15 < b12) {
                    String str2 = new String(bArr, i14, 3, c.f178c);
                    int i16 = i14 + 3;
                    int i17 = i16 + 1;
                    byte b13 = bArr[i16] & 255;
                    boolean z11 = (b13 & b4.f10104d) != 0;
                    if (z11) {
                        b10 = b13 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        b10 = 1;
                    }
                    int i18 = i17 + 1;
                    byte b14 = (byte) (bArr[i17] & 255);
                    int i19 = i18 + 1;
                    v6.a.a(i19 >= 0 && i19 <= length);
                    List<byte[]> list2 = null;
                    if (z11) {
                        list2 = Collections.singletonList((b14 & 64) != 0 ? new byte[]{1} : new byte[]{0});
                    }
                    b0.b bVar2 = new b0.b();
                    bVar2.f27425k = str;
                    bVar2.f27417c = str2;
                    bVar2.C = b10;
                    bVar2.f27427m = list2;
                    arrayList2.add(bVar2.a());
                    i15++;
                    i14 = i19;
                }
                arrayList = arrayList2;
            }
            if (i13 < 0 || i13 > length) {
                z10 = false;
            }
            v6.a.a(z10);
            i10 = i13;
            list = arrayList;
        }
        return list;
    }

    public final boolean d(int i10) {
        return (i10 & this.f22101a) != 0;
    }

    public g(int i10, List<b0> list) {
        this.f22101a = i10;
        this.f22102b = list;
    }
}
