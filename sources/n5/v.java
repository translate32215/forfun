package n5;

import d5.j;
import v6.b0;
import v6.e0;

/* compiled from: PsDurationReader */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    public final b0 f22305a = new b0(0);

    /* renamed from: b  reason: collision with root package name */
    public final v6.v f22306b = new v6.v();

    /* renamed from: c  reason: collision with root package name */
    public boolean f22307c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f22308d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f22309e;

    /* renamed from: f  reason: collision with root package name */
    public long f22310f = -9223372036854775807L;

    /* renamed from: g  reason: collision with root package name */
    public long f22311g = -9223372036854775807L;

    /* renamed from: h  reason: collision with root package name */
    public long f22312h = -9223372036854775807L;

    public static long c(v6.v vVar) {
        v6.v vVar2 = vVar;
        int i10 = vVar2.f26519b;
        if (vVar.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        System.arraycopy(vVar2.f26518a, vVar2.f26519b, bArr, 0, 9);
        vVar2.f26519b += 9;
        vVar2.D(i10);
        if (!((bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3)) {
            return -9223372036854775807L;
        }
        return (((((long) bArr[0]) & 56) >> 3) << 30) | ((((long) bArr[0]) & 3) << 28) | ((((long) bArr[1]) & 255) << 20) | (((((long) bArr[2]) & 248) >> 3) << 15) | ((((long) bArr[2]) & 3) << 13) | ((((long) bArr[3]) & 255) << 5) | ((((long) bArr[4]) & 248) >> 3);
    }

    public final int a(j jVar) {
        this.f22306b.A(e0.f26441f);
        this.f22307c = true;
        jVar.f();
        return 0;
    }

    public final int b(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }
}
