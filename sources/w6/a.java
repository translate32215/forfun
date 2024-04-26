package w6;

import java.util.ArrayList;
import java.util.List;
import v6.c;
import v6.u;
import v6.v;
import x4.m0;

/* compiled from: AvcConfig */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final List<byte[]> f27017a;

    /* renamed from: b  reason: collision with root package name */
    public final int f27018b;

    /* renamed from: c  reason: collision with root package name */
    public final int f27019c;

    /* renamed from: d  reason: collision with root package name */
    public final int f27020d;

    /* renamed from: e  reason: collision with root package name */
    public final float f27021e;

    /* renamed from: f  reason: collision with root package name */
    public final String f27022f;

    public a(List<byte[]> list, int i10, int i11, int i12, float f10, String str) {
        this.f27017a = list;
        this.f27018b = i10;
        this.f27019c = i11;
        this.f27020d = i12;
        this.f27021e = f10;
        this.f27022f = str;
    }

    public static byte[] a(v vVar) {
        int x10 = vVar.x();
        int i10 = vVar.f26519b;
        vVar.E(x10);
        byte[] bArr = vVar.f26518a;
        byte[] bArr2 = c.f26429a;
        byte[] bArr3 = new byte[(bArr2.length + x10)];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i10, bArr3, bArr2.length, x10);
        return bArr3;
    }

    public static a b(v vVar) throws m0 {
        String str;
        float f10;
        int i10;
        int i11;
        try {
            vVar.E(4);
            int s10 = (vVar.s() & 3) + 1;
            if (s10 != 3) {
                ArrayList arrayList = new ArrayList();
                int s11 = vVar.s() & 31;
                for (int i12 = 0; i12 < s11; i12++) {
                    arrayList.add(a(vVar));
                }
                int s12 = vVar.s();
                for (int i13 = 0; i13 < s12; i13++) {
                    arrayList.add(a(vVar));
                }
                if (s11 > 0) {
                    u.b d10 = u.d((byte[]) arrayList.get(0), s10, ((byte[]) arrayList.get(0)).length);
                    int i14 = d10.f26509e;
                    int i15 = d10.f26510f;
                    float f11 = d10.f26511g;
                    str = c.a(d10.f26505a, d10.f26506b, d10.f26507c);
                    i11 = i14;
                    i10 = i15;
                    f10 = f11;
                } else {
                    str = null;
                    i11 = -1;
                    i10 = -1;
                    f10 = 1.0f;
                }
                return new a(arrayList, s10, i11, i10, f10, str);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw new m0("Error parsing AVC config", e10);
        }
    }
}
