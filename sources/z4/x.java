package z4;

/* compiled from: MpegAudioUtil */
public final class x {

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f28483a = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f28484b = {44100, 48000, 32000};

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f28485c = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f28486d = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f28487e = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f28488f = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* renamed from: g  reason: collision with root package name */
    public static final int[] f28489g = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    /* compiled from: MpegAudioUtil */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public int f28490a;

        /* renamed from: b  reason: collision with root package name */
        public String f28491b;

        /* renamed from: c  reason: collision with root package name */
        public int f28492c;

        /* renamed from: d  reason: collision with root package name */
        public int f28493d;

        /* renamed from: e  reason: collision with root package name */
        public int f28494e;

        /* renamed from: f  reason: collision with root package name */
        public int f28495f;

        /* renamed from: g  reason: collision with root package name */
        public int f28496g;

        public boolean a(int i10) {
            int i11;
            int i12;
            int i13;
            int i14;
            if (!x.c(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
                return false;
            }
            this.f28490a = i11;
            this.f28491b = x.f28483a[3 - i12];
            int i15 = x.f28484b[i14];
            this.f28493d = i15;
            int i16 = 2;
            if (i11 == 2) {
                this.f28493d = i15 / 2;
            } else if (i11 == 0) {
                this.f28493d = i15 / 4;
            }
            int i17 = (i10 >>> 9) & 1;
            this.f28496g = x.b(i11, i12);
            if (i12 == 3) {
                int i18 = i11 == 3 ? x.f28485c[i13 - 1] : x.f28486d[i13 - 1];
                this.f28495f = i18;
                this.f28492c = (((i18 * 12) / this.f28493d) + i17) * 4;
            } else {
                int i19 = 144;
                if (i11 == 3) {
                    int i20 = i12 == 2 ? x.f28487e[i13 - 1] : x.f28488f[i13 - 1];
                    this.f28495f = i20;
                    this.f28492c = ((i20 * 144) / this.f28493d) + i17;
                } else {
                    int i21 = x.f28489g[i13 - 1];
                    this.f28495f = i21;
                    if (i12 == 1) {
                        i19 = 72;
                    }
                    this.f28492c = ((i19 * i21) / this.f28493d) + i17;
                }
            }
            if (((i10 >> 6) & 3) == 3) {
                i16 = 1;
            }
            this.f28494e = i16;
            return true;
        }
    }

    public static int a(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        if (!c(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return -1;
        }
        int i16 = f28484b[i14];
        if (i11 == 2) {
            i16 /= 2;
        } else if (i11 == 0) {
            i16 /= 4;
        }
        int i17 = (i10 >>> 9) & 1;
        if (i12 == 3) {
            return ((((i11 == 3 ? f28485c[i13 - 1] : f28486d[i13 - 1]) * 12) / i16) + i17) * 4;
        }
        if (i11 == 3) {
            i15 = i12 == 2 ? f28487e[i13 - 1] : f28488f[i13 - 1];
        } else {
            i15 = f28489g[i13 - 1];
        }
        int i18 = 144;
        if (i11 == 3) {
            return w.a(i15, 144, i16, i17);
        }
        if (i12 == 1) {
            i18 = 72;
        }
        return w.a(i18, i15, i16, i17);
    }

    public static int b(int i10, int i11) {
        if (i11 == 1) {
            return i10 == 3 ? 1152 : 576;
        }
        if (i11 == 2) {
            return 1152;
        }
        if (i11 == 3) {
            return 384;
        }
        throw new IllegalArgumentException();
    }

    public static boolean c(int i10) {
        return (i10 & -2097152) == -2097152;
    }

    public static int d(int i10) {
        int i11;
        int i12;
        if (!c(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0) {
            return -1;
        }
        int i13 = (i10 >>> 12) & 15;
        int i14 = (i10 >>> 10) & 3;
        if (i13 == 0 || i13 == 15 || i14 == 3) {
            return -1;
        }
        return b(i11, i12);
    }
}
