package j6;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import d5.b0;
import v6.e0;

/* compiled from: DvbParser */
public final class b {

    /* renamed from: h  reason: collision with root package name */
    public static final byte[] f19571h = {0, 7, 8, 15};

    /* renamed from: i  reason: collision with root package name */
    public static final byte[] f19572i = {0, 119, -120, -1};

    /* renamed from: j  reason: collision with root package name */
    public static final byte[] f19573j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* renamed from: a  reason: collision with root package name */
    public final Paint f19574a;

    /* renamed from: b  reason: collision with root package name */
    public final Paint f19575b;

    /* renamed from: c  reason: collision with root package name */
    public final Canvas f19576c = new Canvas();

    /* renamed from: d  reason: collision with root package name */
    public final C0167b f19577d = new C0167b(719, 575, 0, 719, 0, 575);

    /* renamed from: e  reason: collision with root package name */
    public final a f19578e = new a(0, new int[]{0, -1, -16777216, -8421505}, b(), c());

    /* renamed from: f  reason: collision with root package name */
    public final h f19579f;

    /* renamed from: g  reason: collision with root package name */
    public Bitmap f19580g;

    /* compiled from: DvbParser */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f19581a;

        /* renamed from: b  reason: collision with root package name */
        public final int[] f19582b;

        /* renamed from: c  reason: collision with root package name */
        public final int[] f19583c;

        /* renamed from: d  reason: collision with root package name */
        public final int[] f19584d;

        public a(int i10, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f19581a = i10;
            this.f19582b = iArr;
            this.f19583c = iArr2;
            this.f19584d = iArr3;
        }
    }

    /* renamed from: j6.b$b  reason: collision with other inner class name */
    /* compiled from: DvbParser */
    public static final class C0167b {

        /* renamed from: a  reason: collision with root package name */
        public final int f19585a;

        /* renamed from: b  reason: collision with root package name */
        public final int f19586b;

        /* renamed from: c  reason: collision with root package name */
        public final int f19587c;

        /* renamed from: d  reason: collision with root package name */
        public final int f19588d;

        /* renamed from: e  reason: collision with root package name */
        public final int f19589e;

        /* renamed from: f  reason: collision with root package name */
        public final int f19590f;

        public C0167b(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f19585a = i10;
            this.f19586b = i11;
            this.f19587c = i12;
            this.f19588d = i13;
            this.f19589e = i14;
            this.f19590f = i15;
        }
    }

    /* compiled from: DvbParser */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final int f19591a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f19592b;

        /* renamed from: c  reason: collision with root package name */
        public final byte[] f19593c;

        /* renamed from: d  reason: collision with root package name */
        public final byte[] f19594d;

        public c(int i10, boolean z10, byte[] bArr, byte[] bArr2) {
            this.f19591a = i10;
            this.f19592b = z10;
            this.f19593c = bArr;
            this.f19594d = bArr2;
        }
    }

    /* compiled from: DvbParser */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        public final int f19595a;

        /* renamed from: b  reason: collision with root package name */
        public final int f19596b;

        /* renamed from: c  reason: collision with root package name */
        public final SparseArray<e> f19597c;

        public d(int i10, int i11, int i12, SparseArray<e> sparseArray) {
            this.f19595a = i11;
            this.f19596b = i12;
            this.f19597c = sparseArray;
        }
    }

    /* compiled from: DvbParser */
    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        public final int f19598a;

        /* renamed from: b  reason: collision with root package name */
        public final int f19599b;

        public e(int i10, int i11) {
            this.f19598a = i10;
            this.f19599b = i11;
        }
    }

    /* compiled from: DvbParser */
    public static final class f {

        /* renamed from: a  reason: collision with root package name */
        public final int f19600a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f19601b;

        /* renamed from: c  reason: collision with root package name */
        public final int f19602c;

        /* renamed from: d  reason: collision with root package name */
        public final int f19603d;

        /* renamed from: e  reason: collision with root package name */
        public final int f19604e;

        /* renamed from: f  reason: collision with root package name */
        public final int f19605f;

        /* renamed from: g  reason: collision with root package name */
        public final int f19606g;

        /* renamed from: h  reason: collision with root package name */
        public final int f19607h;

        /* renamed from: i  reason: collision with root package name */
        public final int f19608i;

        /* renamed from: j  reason: collision with root package name */
        public final SparseArray<g> f19609j;

        public f(int i10, boolean z10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, SparseArray<g> sparseArray) {
            this.f19600a = i10;
            this.f19601b = z10;
            this.f19602c = i11;
            this.f19603d = i12;
            this.f19604e = i14;
            this.f19605f = i15;
            this.f19606g = i16;
            this.f19607h = i17;
            this.f19608i = i18;
            this.f19609j = sparseArray;
        }
    }

    /* compiled from: DvbParser */
    public static final class g {

        /* renamed from: a  reason: collision with root package name */
        public final int f19610a;

        /* renamed from: b  reason: collision with root package name */
        public final int f19611b;

        public g(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f19610a = i12;
            this.f19611b = i13;
        }
    }

    /* compiled from: DvbParser */
    public static final class h {

        /* renamed from: a  reason: collision with root package name */
        public final int f19612a;

        /* renamed from: b  reason: collision with root package name */
        public final int f19613b;

        /* renamed from: c  reason: collision with root package name */
        public final SparseArray<f> f19614c = new SparseArray<>();

        /* renamed from: d  reason: collision with root package name */
        public final SparseArray<a> f19615d = new SparseArray<>();

        /* renamed from: e  reason: collision with root package name */
        public final SparseArray<c> f19616e = new SparseArray<>();

        /* renamed from: f  reason: collision with root package name */
        public final SparseArray<a> f19617f = new SparseArray<>();

        /* renamed from: g  reason: collision with root package name */
        public final SparseArray<c> f19618g = new SparseArray<>();

        /* renamed from: h  reason: collision with root package name */
        public C0167b f19619h;

        /* renamed from: i  reason: collision with root package name */
        public d f19620i;

        public h(int i10, int i11) {
            this.f19612a = i10;
            this.f19613b = i11;
        }
    }

    public b(int i10, int i11) {
        Paint paint = new Paint();
        this.f19574a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect((PathEffect) null);
        Paint paint2 = new Paint();
        this.f19575b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect((PathEffect) null);
        this.f19579f = new h(i10, i11);
    }

    public static byte[] a(int i10, int i11, b0 b0Var) {
        byte[] bArr = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr[i12] = (byte) b0Var.i(i11);
        }
        return bArr;
    }

    public static int[] b() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i10 = 1; i10 < 16; i10++) {
            if (i10 < 8) {
                iArr[i10] = d(255, (i10 & 1) != 0 ? 255 : 0, (i10 & 2) != 0 ? 255 : 0, (i10 & 4) != 0 ? 255 : 0);
            } else {
                int i11 = 127;
                int i12 = (i10 & 1) != 0 ? 127 : 0;
                int i13 = (i10 & 2) != 0 ? 127 : 0;
                if ((i10 & 4) == 0) {
                    i11 = 0;
                }
                iArr[i10] = d(255, i12, i13, i11);
            }
        }
        return iArr;
    }

    public static int[] c() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i10 = 0; i10 < 256; i10++) {
            int i11 = 255;
            if (i10 < 8) {
                int i12 = (i10 & 1) != 0 ? 255 : 0;
                int i13 = (i10 & 2) != 0 ? 255 : 0;
                if ((i10 & 4) == 0) {
                    i11 = 0;
                }
                iArr[i10] = d(63, i12, i13, i11);
            } else {
                int i14 = i10 & 136;
                int i15 = 170;
                int i16 = 85;
                if (i14 == 0) {
                    int i17 = ((i10 & 1) != 0 ? 85 : 0) + ((i10 & 16) != 0 ? 170 : 0);
                    int i18 = ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0);
                    if ((i10 & 4) == 0) {
                        i16 = 0;
                    }
                    if ((i10 & 64) == 0) {
                        i15 = 0;
                    }
                    iArr[i10] = d(255, i17, i18, i16 + i15);
                } else if (i14 != 8) {
                    int i19 = 43;
                    if (i14 == 128) {
                        int i20 = ((i10 & 1) != 0 ? 43 : 0) + 127 + ((i10 & 16) != 0 ? 85 : 0);
                        int i21 = ((i10 & 2) != 0 ? 43 : 0) + 127 + ((i10 & 32) != 0 ? 85 : 0);
                        if ((i10 & 4) == 0) {
                            i19 = 0;
                        }
                        int i22 = i19 + 127;
                        if ((i10 & 64) == 0) {
                            i16 = 0;
                        }
                        iArr[i10] = d(255, i20, i21, i22 + i16);
                    } else if (i14 == 136) {
                        int i23 = ((i10 & 1) != 0 ? 43 : 0) + ((i10 & 16) != 0 ? 85 : 0);
                        int i24 = ((i10 & 2) != 0 ? 43 : 0) + ((i10 & 32) != 0 ? 85 : 0);
                        if ((i10 & 4) == 0) {
                            i19 = 0;
                        }
                        if ((i10 & 64) == 0) {
                            i16 = 0;
                        }
                        iArr[i10] = d(255, i23, i24, i19 + i16);
                    }
                } else {
                    int i25 = ((i10 & 1) != 0 ? 85 : 0) + ((i10 & 16) != 0 ? 170 : 0);
                    int i26 = ((i10 & 2) != 0 ? 85 : 0) + ((i10 & 32) != 0 ? 170 : 0);
                    if ((i10 & 4) == 0) {
                        i16 = 0;
                    }
                    if ((i10 & 64) == 0) {
                        i15 = 0;
                    }
                    iArr[i10] = d(127, i25, i26, i16 + i15);
                }
            }
        }
        return iArr;
    }

    public static int d(int i10, int i11, int i12, int i13) {
        return (i10 << 24) | (i11 << 16) | (i12 << 8) | i13;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r2v31, types: [byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r2v6, types: [byte] */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x01d9 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0211 A[LOOP:3: B:82:0x016b->B:112:0x0211, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0141 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x020c A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0116 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0147 A[LOOP:2: B:37:0x00ae->B:69:0x0147, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0172  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void e(byte[] r24, int[] r25, int r26, int r27, int r28, android.graphics.Paint r29, android.graphics.Canvas r30) {
        /*
            r0 = r26
            r7 = r29
            d5.b0 r8 = new d5.b0
            r9 = 1
            r10 = 0
            r1 = r24
            r8.<init>((byte[]) r1, (int) r9, (q.e) r10)
            r1 = r27
            r11 = r28
            r12 = r10
            r13 = r12
            r14 = r13
        L_0x0014:
            int r2 = r8.b()
            if (r2 == 0) goto L_0x021c
            r15 = 8
            int r2 = r8.i(r15)
            r3 = 240(0xf0, float:3.36E-43)
            if (r2 == r3) goto L_0x0215
            r6 = 3
            r5 = 4
            r4 = 2
            r16 = 0
            switch(r2) {
                case 16: goto L_0x0151;
                case 17: goto L_0x009f;
                case 18: goto L_0x0045;
                default: goto L_0x002c;
            }
        L_0x002c:
            switch(r2) {
                case 32: goto L_0x003f;
                case 33: goto L_0x0039;
                case 34: goto L_0x0031;
                default: goto L_0x002f;
            }
        L_0x002f:
            goto L_0x0219
        L_0x0031:
            r2 = 16
            byte[] r13 = a(r2, r15, r8)
            goto L_0x0219
        L_0x0039:
            byte[] r12 = a(r5, r15, r8)
            goto L_0x0219
        L_0x003f:
            byte[] r14 = a(r5, r5, r8)
            goto L_0x0219
        L_0x0045:
            r6 = r1
            r1 = 0
        L_0x0047:
            int r2 = r8.i(r15)
            if (r2 == 0) goto L_0x0052
            r17 = r1
            r18 = 1
            goto L_0x0078
        L_0x0052:
            boolean r2 = r8.h()
            r3 = 7
            if (r2 != 0) goto L_0x006b
            int r2 = r8.i(r3)
            if (r2 == 0) goto L_0x0065
            r17 = r1
            r18 = r2
            r2 = 0
            goto L_0x0078
        L_0x0065:
            r2 = 0
            r17 = 1
            r18 = 0
            goto L_0x0078
        L_0x006b:
            int r2 = r8.i(r3)
            int r3 = r8.i(r15)
            r17 = r1
            r18 = r2
            r2 = r3
        L_0x0078:
            if (r18 == 0) goto L_0x0093
            if (r7 == 0) goto L_0x0093
            r1 = r25[r2]
            r7.setColor(r1)
            float r2 = (float) r6
            float r3 = (float) r11
            int r1 = r6 + r18
            float r4 = (float) r1
            int r1 = r11 + 1
            float r5 = (float) r1
            r1 = r30
            r19 = r6
            r6 = r29
            r1.drawRect(r2, r3, r4, r5, r6)
            goto L_0x0095
        L_0x0093:
            r19 = r6
        L_0x0095:
            int r6 = r19 + r18
            if (r17 == 0) goto L_0x009c
        L_0x0099:
            r1 = r6
            goto L_0x0219
        L_0x009c:
            r1 = r17
            goto L_0x0047
        L_0x009f:
            if (r0 != r6) goto L_0x00aa
            if (r13 != 0) goto L_0x00a6
            byte[] r2 = f19573j
            goto L_0x00a7
        L_0x00a6:
            r2 = r13
        L_0x00a7:
            r17 = r2
            goto L_0x00ac
        L_0x00aa:
            r17 = r10
        L_0x00ac:
            r3 = r1
            r1 = 0
        L_0x00ae:
            int r2 = r8.i(r5)
            if (r2 == 0) goto L_0x00b5
            goto L_0x0110
        L_0x00b5:
            boolean r2 = r8.h()
            if (r2 != 0) goto L_0x00cb
            int r2 = r8.i(r6)
            if (r2 == 0) goto L_0x00c9
            int r2 = r2 + 2
            r18 = r1
            r19 = r2
            r2 = 0
            goto L_0x0114
        L_0x00c9:
            r1 = 1
            goto L_0x00e7
        L_0x00cb:
            boolean r2 = r8.h()
            if (r2 != 0) goto L_0x00db
            int r2 = r8.i(r4)
            int r2 = r2 + r5
            int r18 = r8.i(r5)
            goto L_0x0102
        L_0x00db:
            int r2 = r8.i(r4)
            if (r2 == 0) goto L_0x010f
            if (r2 == r9) goto L_0x0109
            if (r2 == r4) goto L_0x00f8
            if (r2 == r6) goto L_0x00ed
        L_0x00e7:
            r18 = r1
            r2 = 0
            r19 = 0
            goto L_0x0114
        L_0x00ed:
            int r2 = r8.i(r15)
            int r2 = r2 + 25
            int r18 = r8.i(r5)
            goto L_0x0102
        L_0x00f8:
            int r2 = r8.i(r5)
            int r2 = r2 + 9
            int r18 = r8.i(r5)
        L_0x0102:
            r19 = r2
            r2 = r18
            r18 = r1
            goto L_0x0114
        L_0x0109:
            r18 = r1
            r2 = 0
            r19 = 2
            goto L_0x0114
        L_0x010f:
            r2 = 0
        L_0x0110:
            r18 = r1
            r19 = 1
        L_0x0114:
            if (r19 == 0) goto L_0x0139
            if (r7 == 0) goto L_0x0139
            if (r17 == 0) goto L_0x011c
            byte r2 = r17[r2]
        L_0x011c:
            r1 = r25[r2]
            r7.setColor(r1)
            float r2 = (float) r3
            float r1 = (float) r11
            int r4 = r3 + r19
            float r4 = (float) r4
            int r5 = r11 + 1
            float r5 = (float) r5
            r20 = r1
            r1 = r30
            r21 = r3
            r3 = r20
            r10 = 2
            r15 = 3
            r6 = r29
            r1.drawRect(r2, r3, r4, r5, r6)
            goto L_0x013d
        L_0x0139:
            r21 = r3
            r10 = 2
            r15 = 3
        L_0x013d:
            int r3 = r21 + r19
            if (r18 == 0) goto L_0x0147
            r8.c()
            r1 = r3
            goto L_0x0219
        L_0x0147:
            r1 = r18
            r4 = 2
            r5 = 4
            r6 = 3
            r10 = 0
            r15 = 8
            goto L_0x00ae
        L_0x0151:
            r10 = 2
            r15 = 3
            if (r0 != r15) goto L_0x015e
            if (r12 != 0) goto L_0x015a
            byte[] r2 = f19572i
            goto L_0x015b
        L_0x015a:
            r2 = r12
        L_0x015b:
            r17 = r2
            goto L_0x0169
        L_0x015e:
            if (r0 != r10) goto L_0x0167
            if (r14 != 0) goto L_0x0165
            byte[] r2 = f19571h
            goto L_0x015b
        L_0x0165:
            r2 = r14
            goto L_0x015b
        L_0x0167:
            r17 = 0
        L_0x0169:
            r6 = r1
            r1 = 0
        L_0x016b:
            int r2 = r8.i(r10)
            if (r2 == 0) goto L_0x0172
            goto L_0x018c
        L_0x0172:
            boolean r2 = r8.h()
            if (r2 == 0) goto L_0x0185
            int r2 = r8.i(r15)
            int r2 = r2 + r15
            int r3 = r8.i(r10)
            r4 = 4
            r5 = 8
            goto L_0x01bf
        L_0x0185:
            boolean r2 = r8.h()
            if (r2 == 0) goto L_0x0194
            r2 = 0
        L_0x018c:
            r18 = r1
            r4 = 4
            r5 = 8
            r19 = 1
            goto L_0x01d7
        L_0x0194:
            int r2 = r8.i(r10)
            if (r2 == 0) goto L_0x01ce
            if (r2 == r9) goto L_0x01c5
            if (r2 == r10) goto L_0x01b2
            if (r2 == r15) goto L_0x01a4
            r4 = 4
            r5 = 8
            goto L_0x01d2
        L_0x01a4:
            r5 = 8
            int r2 = r8.i(r5)
            int r2 = r2 + 29
            int r3 = r8.i(r10)
            r4 = 4
            goto L_0x01bf
        L_0x01b2:
            r4 = 4
            r5 = 8
            int r2 = r8.i(r4)
            int r2 = r2 + 12
            int r3 = r8.i(r10)
        L_0x01bf:
            r18 = r1
            r19 = r2
            r2 = r3
            goto L_0x01d7
        L_0x01c5:
            r4 = 4
            r5 = 8
            r18 = r1
            r2 = 0
            r19 = 2
            goto L_0x01d7
        L_0x01ce:
            r4 = 4
            r5 = 8
            r1 = 1
        L_0x01d2:
            r18 = r1
            r2 = 0
            r19 = 0
        L_0x01d7:
            if (r19 == 0) goto L_0x0202
            if (r7 == 0) goto L_0x0202
            if (r17 == 0) goto L_0x01df
            byte r2 = r17[r2]
        L_0x01df:
            r1 = r25[r2]
            r7.setColor(r1)
            float r2 = (float) r6
            float r3 = (float) r11
            int r1 = r6 + r19
            float r1 = (float) r1
            int r4 = r11 + 1
            float r4 = (float) r4
            r21 = r1
            r1 = r30
            r22 = r4
            r23 = 4
            r4 = r21
            r21 = 8
            r5 = r22
            r22 = r6
            r6 = r29
            r1.drawRect(r2, r3, r4, r5, r6)
            goto L_0x0208
        L_0x0202:
            r22 = r6
            r21 = 8
            r23 = 4
        L_0x0208:
            int r6 = r22 + r19
            if (r18 == 0) goto L_0x0211
            r8.c()
            goto L_0x0099
        L_0x0211:
            r1 = r18
            goto L_0x016b
        L_0x0215:
            int r11 = r11 + 2
            r1 = r27
        L_0x0219:
            r10 = 0
            goto L_0x0014
        L_0x021c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j6.b.e(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    public static a f(b0 b0Var, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        b0 b0Var2 = b0Var;
        int i15 = 8;
        int i16 = b0Var2.i(8);
        b0Var2.s(8);
        int i17 = i10 - 2;
        int i18 = 4;
        int[] iArr = {0, -1, -16777216, -8421505};
        int[] b10 = b();
        int[] c10 = c();
        while (i17 > 0) {
            int i19 = b0Var2.i(i15);
            int i20 = b0Var2.i(i15);
            int i21 = i17 - 2;
            int[] iArr2 = (i20 & 128) != 0 ? iArr : (i20 & 64) != 0 ? b10 : c10;
            if ((i20 & 1) != 0) {
                i14 = b0Var2.i(i15);
                i13 = b0Var2.i(i15);
                i12 = b0Var2.i(i15);
                i11 = b0Var2.i(i15);
                i17 = i21 - 4;
            } else {
                i17 = i21 - 2;
                i13 = b0Var2.i(i18) << i18;
                i11 = b0Var2.i(2) << 6;
                i14 = b0Var2.i(6) << 2;
                i12 = b0Var2.i(i18) << i18;
            }
            if (i14 == 0) {
                i13 = 0;
                i12 = 0;
                i11 = 255;
            }
            double d10 = (double) i14;
            double d11 = (double) (i13 - 128);
            Double.isNaN(d11);
            Double.isNaN(d11);
            Double.isNaN(d10);
            Double.isNaN(d10);
            double d12 = (double) (i12 - 128);
            Double.isNaN(d12);
            Double.isNaN(d12);
            Double.isNaN(d10);
            Double.isNaN(d10);
            Double.isNaN(d11);
            Double.isNaN(d11);
            Double.isNaN(d12);
            Double.isNaN(d12);
            Double.isNaN(d10);
            Double.isNaN(d10);
            iArr2[i19] = d((byte) (255 - (i11 & 255)), e0.i((int) ((1.402d * d11) + d10), 0, 255), e0.i((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), 0, 255), e0.i((int) ((d12 * 1.772d) + d10), 0, 255));
            iArr = iArr;
            i16 = i16;
            i15 = 8;
            i18 = 4;
        }
        return new a(i16, iArr, b10, c10);
    }

    public static c g(b0 b0Var) {
        byte[] bArr;
        int i10 = b0Var.i(16);
        b0Var.s(4);
        int i11 = b0Var.i(2);
        boolean h10 = b0Var.h();
        b0Var.s(1);
        byte[] bArr2 = e0.f26441f;
        if (i11 == 1) {
            b0Var.s(b0Var.i(8) * 16);
        } else if (i11 == 0) {
            int i12 = b0Var.i(16);
            int i13 = b0Var.i(16);
            if (i12 > 0) {
                bArr2 = new byte[i12];
                b0Var.k(bArr2, 0, i12);
            }
            if (i13 > 0) {
                bArr = new byte[i13];
                b0Var.k(bArr, 0, i13);
                return new c(i10, h10, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new c(i10, h10, bArr2, bArr);
    }
}
