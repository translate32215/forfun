package z4;

import android.util.Log;
import androidx.appcompat.widget.d0;
import d5.b0;
import q.e;
import x4.m0;

/* compiled from: AacUtil */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f28278a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f28279b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* compiled from: AacUtil */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f28280a;

        /* renamed from: b  reason: collision with root package name */
        public final int f28281b;

        /* renamed from: c  reason: collision with root package name */
        public final String f28282c;

        public b(int i10, int i11, String str, C0288a aVar) {
            this.f28280a = i10;
            this.f28281b = i11;
            this.f28282c = str;
        }
    }

    public static byte[] a(int i10, int i11, int i12) {
        return new byte[]{(byte) (((i10 << 3) & 248) | ((i11 >> 1) & 7)), (byte) (((i11 << 7) & 128) | ((i12 << 3) & 120))};
    }

    public static int b(int i10) {
        if (i10 == 2) {
            return 10;
        }
        if (i10 == 5) {
            return 11;
        }
        if (i10 == 29) {
            return 12;
        }
        if (i10 == 42) {
            return 16;
        }
        if (i10 != 22) {
            return i10 != 23 ? 0 : 15;
        }
        return 1073741824;
    }

    public static int c(b0 b0Var) throws m0 {
        int i10 = b0Var.i(4);
        if (i10 == 15) {
            return b0Var.i(24);
        }
        if (i10 < 13) {
            return f28278a[i10];
        }
        throw new m0();
    }

    public static b d(b0 b0Var, boolean z10) throws m0 {
        int i10 = b0Var.i(5);
        if (i10 == 31) {
            i10 = b0Var.i(6) + 32;
        }
        int c10 = c(b0Var);
        int i11 = b0Var.i(4);
        String a10 = d0.a("mp4a.40.", i10);
        if (i10 == 5 || i10 == 29) {
            c10 = c(b0Var);
            int i12 = b0Var.i(5);
            if (i12 == 31) {
                i12 = b0Var.i(6) + 32;
            }
            i10 = i12;
            if (i10 == 22) {
                i11 = b0Var.i(4);
            }
        }
        if (z10) {
            if (!(i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4 || i10 == 6 || i10 == 7 || i10 == 17)) {
                switch (i10) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw new m0(d0.a("Unsupported audio object type: ", i10));
                }
            }
            if (b0Var.h()) {
                Log.w("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (b0Var.h()) {
                b0Var.s(14);
            }
            boolean h10 = b0Var.h();
            if (i11 != 0) {
                if (i10 == 6 || i10 == 20) {
                    b0Var.s(3);
                }
                if (h10) {
                    if (i10 == 22) {
                        b0Var.s(16);
                    }
                    if (i10 == 17 || i10 == 19 || i10 == 20 || i10 == 23) {
                        b0Var.s(3);
                    }
                    b0Var.s(1);
                }
                switch (i10) {
                    case 17:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        int i13 = b0Var.i(2);
                        if (i13 == 2 || i13 == 3) {
                            throw new m0(d0.a("Unsupported epConfig: ", i13));
                        }
                }
            } else {
                throw new UnsupportedOperationException();
            }
        }
        int i14 = f28279b[i11];
        if (i14 != -1) {
            return new b(c10, i14, a10, (C0288a) null);
        }
        throw new m0();
    }

    public static b e(byte[] bArr) throws m0 {
        return d(new b0(bArr, 1, (e) null), false);
    }
}
