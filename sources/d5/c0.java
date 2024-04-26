package d5;

import v6.v;
import x4.m0;

/* compiled from: VorbisUtil */
public final class c0 {

    /* compiled from: VorbisUtil */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String[] f13005a;

        public a(String str, String[] strArr, int i10) {
            this.f13005a = strArr;
        }
    }

    /* compiled from: VorbisUtil */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f13006a;

        public b(boolean z10, int i10, int i11, int i12) {
            this.f13006a = z10;
        }
    }

    /* compiled from: VorbisUtil */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final int f13007a;

        /* renamed from: b  reason: collision with root package name */
        public final int f13008b;

        /* renamed from: c  reason: collision with root package name */
        public final int f13009c;

        /* renamed from: d  reason: collision with root package name */
        public final int f13010d;

        /* renamed from: e  reason: collision with root package name */
        public final int f13011e;

        /* renamed from: f  reason: collision with root package name */
        public final int f13012f;

        /* renamed from: g  reason: collision with root package name */
        public final byte[] f13013g;

        public c(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, boolean z10, byte[] bArr) {
            this.f13007a = i11;
            this.f13008b = i12;
            this.f13009c = i13;
            this.f13010d = i14;
            this.f13011e = i16;
            this.f13012f = i17;
            this.f13013g = bArr;
        }
    }

    public static int a(int i10) {
        int i11 = 0;
        while (i10 > 0) {
            i11++;
            i10 >>>= 1;
        }
        return i11;
    }

    public static a b(v vVar, boolean z10, boolean z11) throws m0 {
        if (z10) {
            c(3, vVar, false);
        }
        String p10 = vVar.p((int) vVar.j());
        long j10 = vVar.j();
        String[] strArr = new String[((int) j10)];
        int length = p10.length() + 11 + 4;
        for (int i10 = 0; ((long) i10) < j10; i10++) {
            strArr[i10] = vVar.p((int) vVar.j());
            length = length + 4 + strArr[i10].length();
        }
        if (!z11 || (vVar.s() & 1) != 0) {
            return new a(p10, strArr, length + 1);
        }
        throw new m0("framing bit expected to be set");
    }

    public static boolean c(int i10, v vVar, boolean z10) throws m0 {
        if (vVar.a() < 7) {
            if (z10) {
                return false;
            }
            StringBuilder a10 = android.support.v4.media.a.a("too short header: ");
            a10.append(vVar.a());
            throw new m0(a10.toString());
        } else if (vVar.s() != i10) {
            if (z10) {
                return false;
            }
            StringBuilder a11 = android.support.v4.media.a.a("expected header type ");
            a11.append(Integer.toHexString(i10));
            throw new m0(a11.toString());
        } else if (vVar.s() == 118 && vVar.s() == 111 && vVar.s() == 114 && vVar.s() == 98 && vVar.s() == 105 && vVar.s() == 115) {
            return true;
        } else {
            if (z10) {
                return false;
            }
            throw new m0("expected characters 'vorbis'");
        }
    }
}
