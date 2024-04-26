package com.google.android.gms.internal.ads;

import e8.fd0;
import e8.md0;
import java.io.IOException;
import java.util.Stack;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class jt {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f7174a = new byte[8];

    /* renamed from: b  reason: collision with root package name */
    public final Stack<md0> f7175b = new Stack<>();

    /* renamed from: c  reason: collision with root package name */
    public final lt f7176c = new lt();

    /* renamed from: d  reason: collision with root package name */
    public g2 f7177d;

    /* renamed from: e  reason: collision with root package name */
    public int f7178e;

    /* renamed from: f  reason: collision with root package name */
    public int f7179f;

    /* renamed from: g  reason: collision with root package name */
    public long f7180g;

    public final long a(fd0 fd0, int i10) throws IOException, InterruptedException {
        ((gt) fd0).c(this.f7174a, 0, i10, false);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = (j10 << 8) | ((long) (this.f7174a[i11] & 255));
        }
        return j10;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r53v2, resolved type: java.util.ArrayList} */
    /* JADX WARNING: type inference failed for: r0v2 */
    /* JADX WARNING: type inference failed for: r0v44, types: [int, boolean] */
    /* JADX WARNING: type inference failed for: r0v46 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x0520, code lost:
        r56 = r1;
        r1 = r0;
        r0 = r56;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x05da, code lost:
        r53 = null;
        r9 = -1;
        r30 = 4096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x0641, code lost:
        r53 = r0;
        r30 = r1;
        r0 = r2;
        r9 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x06b1, code lost:
        if (r0.c() == r5.getLeastSignificantBits()) goto L_0x06b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x06e3, code lost:
        r3 = null;
        r56 = r1;
        r1 = r0;
        r0 = r56;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x06f4, code lost:
        r1 = "audio/x-unknown";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x06f5, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x070b, code lost:
        r3 = r0;
        r0 = r1;
        r1 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x070f, code lost:
        r9 = r1;
        r53 = r3;
        r30 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x0715, code lost:
        r1 = r15.M | 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x071b, code lost:
        if (r15.L == false) goto L_0x071f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x071d, code lost:
        r2 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x071f, code lost:
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x0720, code lost:
        r12 = r1 | r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x0726, code lost:
        if (p.a.e(r0) == false) goto L_0x0740;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x0728, code lost:
        r0 = e8.bc0.a(java.lang.Integer.toString(r27), r0, r30, r15.G, r15.I, r9, r53, r15.f15656i, r12, r15.N);
        r1 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x0744, code lost:
        if (p.a.f(r0) == false) goto L_0x0870;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x0748, code lost:
        if (r15.f15661n != 0) goto L_0x075c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x074a, code lost:
        r1 = r15.f15659l;
        r2 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x074d, code lost:
        if (r1 != -1) goto L_0x0751;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x074f, code lost:
        r1 = r15.f15657j;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x0751, code lost:
        r15.f15659l = r1;
        r1 = r15.f15660m;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x0755, code lost:
        if (r1 != -1) goto L_0x0759;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x0757, code lost:
        r1 = r15.f15658k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x0759, code lost:
        r15.f15660m = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x075c, code lost:
        r2 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x075d, code lost:
        r1 = r15.f15659l;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:0x0761, code lost:
        if (r1 == r2) goto L_0x0775;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x0763, code lost:
        r4 = r15.f15660m;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x0765, code lost:
        if (r4 == r2) goto L_0x0775;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x0767, code lost:
        r35 = ((float) (r15.f15658k * r1)) / ((float) (r15.f15657j * r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x0775, code lost:
        r35 = -1.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x077b, code lost:
        if (r15.f15664q == false) goto L_0x0848;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x0781, code lost:
        if (r15.f15670w == -1.0f) goto L_0x0839;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:385:0x0787, code lost:
        if (r15.f15671x == -1.0f) goto L_0x0839;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:387:0x078d, code lost:
        if (r15.f15672y == -1.0f) goto L_0x0839;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:389:0x0793, code lost:
        if (r15.f15673z == -1.0f) goto L_0x0839;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:0x0799, code lost:
        if (r15.A == -1.0f) goto L_0x0839;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:393:0x079f, code lost:
        if (r15.B == -1.0f) goto L_0x0839;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:395:0x07a5, code lost:
        if (r15.C == -1.0f) goto L_0x0839;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:397:0x07ab, code lost:
        if (r15.D == -1.0f) goto L_0x0839;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:399:0x07b1, code lost:
        if (r15.E == -1.0f) goto L_0x0839;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:401:0x07b7, code lost:
        if (r15.F != -1.0f) goto L_0x07bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:402:0x07bb, code lost:
        r1 = new byte[25];
        r2 = java.nio.ByteBuffer.wrap(r1);
        r2.put((byte) 0);
        r2.putShort((short) ((int) ((r15.f15670w * 50000.0f) + 0.5f)));
        r2.putShort((short) ((int) ((r15.f15671x * 50000.0f) + 0.5f)));
        r2.putShort((short) ((int) ((r15.f15672y * 50000.0f) + 0.5f)));
        r2.putShort((short) ((int) ((r15.f15673z * 50000.0f) + 0.5f)));
        r2.putShort((short) ((int) ((r15.A * 50000.0f) + 0.5f)));
        r2.putShort((short) ((int) ((r15.B * 50000.0f) + 0.5f)));
        r2.putShort((short) ((int) ((r15.C * 50000.0f) + 0.5f)));
        r2.putShort((short) ((int) ((r15.D * 50000.0f) + 0.5f)));
        r2.putShort((short) ((int) (r15.E + 0.5f)));
        r2.putShort((short) ((int) (r15.F + 0.5f)));
        r2.putShort((short) r15.f15668u);
        r2.putShort((short) r15.f15669v);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:403:0x0839, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:404:0x083a, code lost:
        r38 = new e8.hg0(r15.f15665r, r15.f15667t, r15.f15666s, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:405:0x0848, code lost:
        r38 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:406:0x084b, code lost:
        r0 = e8.bc0.b(java.lang.Integer.toString(r27), r0, r30, r15.f15657j, r15.f15658k, r53, -1, r35, r15.f15662o, r15.f15663p, r38, r15.f15656i);
        r1 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:408:0x0876, code lost:
        if ("application/x-subrip".equals(r0) == false) goto L_0x0885;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:409:0x0878, code lost:
        r0 = e8.bc0.e(java.lang.Integer.toString(r27), r0, r12, r15.N, r15.f15656i);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:411:0x088b, code lost:
        if ("application/vobsub".equals(r0) != false) goto L_0x08a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:413:0x0893, code lost:
        if ("application/pgs".equals(r0) != false) goto L_0x08a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:415:0x089b, code lost:
        if ("application/dvbsubs".equals(r0) == false) goto L_0x089e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:417:0x08a5, code lost:
        throw new e8.cc0("Unexpected MIME type.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:418:0x08a6, code lost:
        r0 = new e8.bc0(java.lang.Integer.toString(r27), (java.lang.String) null, r0, (java.lang.String) null, -1, -1, -1, -1, -1.0f, -1, -1.0f, (byte[]) null, -1, (e8.hg0) null, -1, -1, -1, -1, -1, 0, r15.N, -1, Long.MAX_VALUE, r53, r15.f15656i, (com.google.android.gms.internal.ads.wt) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:419:0x08e9, code lost:
        r1 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:420:0x08ea, code lost:
        r1 = ((com.google.android.gms.internal.ads.yt) r25).o(r15.f15649b, r1);
        r15.O = r1;
        r1.g(r0);
        r1 = r24;
        r0 = r1.f7274c;
        r2 = r1.f7291t;
        r0.put(r2.f15649b, r2);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x02b6  */
    /* JADX WARNING: Removed duplicated region for block: B:337:0x06b8  */
    /* JADX WARNING: Removed duplicated region for block: B:342:0x06eb  */
    /* JADX WARNING: Removed duplicated region for block: B:421:0x0905  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(e8.fd0 r58) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r57 = this;
            r0 = r57
            r1 = r58
            com.google.android.gms.internal.ads.g2 r2 = r0.f7177d
            if (r2 == 0) goto L_0x000a
            r2 = 1
            goto L_0x000b
        L_0x000a:
            r2 = 0
        L_0x000b:
            o.a.c(r2)
        L_0x000e:
            java.util.Stack<e8.md0> r2 = r0.f7175b
            boolean r2 = r2.isEmpty()
            r3 = 374648427(0x1654ae6b, float:1.718026E-25)
            r4 = 357149030(0x1549a966, float:4.072526E-26)
            r5 = 475249515(0x1c53bb6b, float:7.0056276E-22)
            r6 = -1
            r8 = 0
            r9 = -1
            if (r2 != 0) goto L_0x092f
            r2 = r1
            com.google.android.gms.internal.ads.gt r2 = (com.google.android.gms.internal.ads.gt) r2
            long r10 = r2.f6688c
            java.util.Stack<e8.md0> r2 = r0.f7175b
            java.lang.Object r2 = r2.peek()
            e8.md0 r2 = (e8.md0) r2
            long r12 = r2.f15497b
            int r2 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r2 < 0) goto L_0x092f
            com.google.android.gms.internal.ads.g2 r1 = r0.f7177d
            java.util.Stack<e8.md0> r2 = r0.f7175b
            java.lang.Object r2 = r2.pop()
            e8.md0 r2 = (e8.md0) r2
            int r2 = r2.f15496a
            java.lang.Object r1 = r1.f6511b
            com.google.android.gms.internal.ads.kt r1 = (com.google.android.gms.internal.ads.kt) r1
            r1.getClass()
            r10 = 160(0xa0, float:2.24E-43)
            if (r2 == r10) goto L_0x090b
            r10 = 174(0xae, float:2.44E-43)
            if (r2 == r10) goto L_0x0187
            r10 = 19899(0x4dbb, float:2.7884E-41)
            if (r2 == r10) goto L_0x016f
            r9 = 25152(0x6240, float:3.5245E-41)
            if (r2 == r9) goto L_0x0143
            r9 = 28032(0x6d80, float:3.9281E-41)
            if (r2 == r9) goto L_0x012f
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r2 == r4) goto L_0x0116
            if (r2 == r3) goto L_0x00fd
            if (r2 == r5) goto L_0x006a
            goto L_0x092d
        L_0x006a:
            boolean r2 = r1.f7292u
            if (r2 != 0) goto L_0x092d
            e8.id0 r2 = r1.Y
            long r3 = r1.f7287p
            int r5 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r5 == 0) goto L_0x00e2
            long r3 = r1.f7290s
            int r5 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r5 == 0) goto L_0x00e2
            com.google.android.gms.internal.ads.se r3 = r1.B
            if (r3 == 0) goto L_0x00e2
            int r3 = r3.f8121a
            if (r3 == 0) goto L_0x00e2
            com.google.android.gms.internal.ads.se r4 = r1.C
            if (r4 == 0) goto L_0x00e2
            int r4 = r4.f8121a
            if (r4 == r3) goto L_0x008d
            goto L_0x00e2
        L_0x008d:
            int[] r4 = new int[r3]
            long[] r5 = new long[r3]
            long[] r6 = new long[r3]
            long[] r7 = new long[r3]
            r9 = 0
        L_0x0096:
            if (r9 >= r3) goto L_0x00ae
            com.google.android.gms.internal.ads.se r10 = r1.B
            long r10 = r10.c(r9)
            r7[r9] = r10
            long r10 = r1.f7287p
            com.google.android.gms.internal.ads.se r12 = r1.C
            long r12 = r12.c(r9)
            long r12 = r12 + r10
            r5[r9] = r12
            int r9 = r9 + 1
            goto L_0x0096
        L_0x00ae:
            r9 = 0
        L_0x00af:
            int r10 = r3 + -1
            if (r9 >= r10) goto L_0x00c6
            int r10 = r9 + 1
            r11 = r5[r10]
            r13 = r5[r9]
            long r11 = r11 - r13
            int r12 = (int) r11
            r4[r9] = r12
            r11 = r7[r10]
            r13 = r7[r9]
            long r11 = r11 - r13
            r6[r9] = r11
            r9 = r10
            goto L_0x00af
        L_0x00c6:
            long r11 = r1.f7287p
            long r13 = r1.f7286o
            long r11 = r11 + r13
            r13 = r5[r10]
            long r11 = r11 - r13
            int r3 = (int) r11
            r4[r10] = r3
            long r11 = r1.f7290s
            r13 = r7[r10]
            long r11 = r11 - r13
            r6[r10] = r11
            r1.B = r8
            r1.C = r8
            e8.ed0 r3 = new e8.ed0
            r3.<init>(r4, r5, r6, r7)
            goto L_0x00ed
        L_0x00e2:
            r1.B = r8
            r1.C = r8
            e8.kd0 r3 = new e8.kd0
            long r4 = r1.f7290s
            r3.<init>(r4)
        L_0x00ed:
            com.google.android.gms.internal.ads.yt r2 = (com.google.android.gms.internal.ads.yt) r2
            r2.f8658y = r3
            android.os.Handler r3 = r2.f8655v
            java.lang.Runnable r2 = r2.f8653t
            r3.post(r2)
            r2 = 1
            r1.f7292u = r2
            goto L_0x092d
        L_0x00fd:
            android.util.SparseArray<e8.nd0> r2 = r1.f7274c
            int r2 = r2.size()
            if (r2 == 0) goto L_0x010e
            e8.id0 r1 = r1.Y
            com.google.android.gms.internal.ads.yt r1 = (com.google.android.gms.internal.ads.yt) r1
            r1.p()
            goto L_0x092d
        L_0x010e:
            e8.cc0 r1 = new e8.cc0
            java.lang.String r2 = "No valid tracks were found"
            r1.<init>(r2)
            throw r1
        L_0x0116:
            long r2 = r1.f7288q
            int r4 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r4 != 0) goto L_0x0121
            r2 = 1000000(0xf4240, double:4.940656E-318)
            r1.f7288q = r2
        L_0x0121:
            long r2 = r1.f7289r
            int r4 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r4 == 0) goto L_0x092d
            long r2 = r1.k(r2)
            r1.f7290s = r2
            goto L_0x092d
        L_0x012f:
            e8.nd0 r1 = r1.f7291t
            boolean r2 = r1.f15652e
            if (r2 == 0) goto L_0x092d
            byte[] r1 = r1.f15653f
            if (r1 != 0) goto L_0x013b
            goto L_0x092d
        L_0x013b:
            e8.cc0 r1 = new e8.cc0
            java.lang.String r2 = "Combining encryption and compression is not supported"
            r1.<init>(r2)
            throw r1
        L_0x0143:
            e8.nd0 r1 = r1.f7291t
            boolean r2 = r1.f15652e
            if (r2 == 0) goto L_0x092d
            e8.ld0 r2 = r1.f15654g
            if (r2 == 0) goto L_0x0167
            com.google.android.gms.internal.ads.et r3 = new com.google.android.gms.internal.ads.et
            r4 = 1
            com.google.android.gms.internal.ads.et$a[] r5 = new com.google.android.gms.internal.ads.et.a[r4]
            com.google.android.gms.internal.ads.et$a r6 = new com.google.android.gms.internal.ads.et$a
            java.util.UUID r7 = e8.sb0.f16389b
            byte[] r2 = r2.f15380a
            java.lang.String r8 = "video/webm"
            r6.<init>(r7, r8, r2)
            r2 = 0
            r5[r2] = r6
            r3.<init>(r4, r5)
            r1.f15656i = r3
            goto L_0x092d
        L_0x0167:
            e8.cc0 r1 = new e8.cc0
            java.lang.String r2 = "Encrypted Track found but ContentEncKeyID was not found"
            r1.<init>(r2)
            throw r1
        L_0x016f:
            int r2 = r1.f7293v
            if (r2 == r9) goto L_0x017f
            long r3 = r1.f7294w
            int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x017f
            if (r2 != r5) goto L_0x092d
            r1.f7296y = r3
            goto L_0x092d
        L_0x017f:
            e8.cc0 r1 = new e8.cc0
            java.lang.String r2 = "Mandatory element SeekID or SeekPosition not found"
            r1.<init>(r2)
            throw r1
        L_0x0187:
            e8.nd0 r2 = r1.f7291t
            java.lang.String r2 = r2.f15648a
            java.lang.String r3 = "V_VP8"
            boolean r4 = r3.equals(r2)
            java.lang.String r5 = "V_MPEG4/ISO/SP"
            java.lang.String r6 = "V_MPEG4/ISO/AP"
            java.lang.String r7 = "V_MPEG2"
            java.lang.String r8 = "V_VP9"
            java.lang.String r9 = "A_DTS/LOSSLESS"
            java.lang.String r10 = "S_VOBSUB"
            java.lang.String r11 = "V_MPEG4/ISO/AVC"
            java.lang.String r12 = "V_MPEG4/ISO/ASP"
            java.lang.String r13 = "S_DVBSUB"
            java.lang.String r14 = "V_MS/VFW/FOURCC"
            java.lang.String r15 = "A_MPEG/L3"
            java.lang.String r0 = "A_MPEG/L2"
            r58 = r3
            java.lang.String r3 = "A_VORBIS"
            r16 = r1
            java.lang.String r1 = "A_TRUEHD"
            r17 = r13
            java.lang.String r13 = "A_MS/ACM"
            r18 = r10
            java.lang.String r10 = "A_DTS/EXPRESS"
            r19 = r13
            java.lang.String r13 = "V_THEORA"
            r20 = r9
            java.lang.String r9 = "S_HDMV/PGS"
            r21 = r9
            java.lang.String r9 = "A_DTS"
            r22 = r10
            java.lang.String r10 = "A_AC3"
            r23 = r9
            java.lang.String r9 = "A_AAC"
            if (r4 != 0) goto L_0x029d
            boolean r4 = r8.equals(r2)
            if (r4 != 0) goto L_0x029d
            boolean r4 = r7.equals(r2)
            if (r4 != 0) goto L_0x029d
            boolean r4 = r5.equals(r2)
            if (r4 != 0) goto L_0x029d
            boolean r4 = r12.equals(r2)
            if (r4 != 0) goto L_0x029d
            boolean r4 = r6.equals(r2)
            if (r4 != 0) goto L_0x029d
            boolean r4 = r11.equals(r2)
            if (r4 != 0) goto L_0x029d
            java.lang.String r4 = "V_MPEGH/ISO/HEVC"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L_0x029d
            boolean r4 = r14.equals(r2)
            if (r4 != 0) goto L_0x029d
            boolean r4 = r13.equals(r2)
            if (r4 != 0) goto L_0x029d
            java.lang.String r4 = "A_OPUS"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L_0x029d
            boolean r4 = r3.equals(r2)
            if (r4 != 0) goto L_0x029d
            boolean r4 = r9.equals(r2)
            if (r4 != 0) goto L_0x029d
            boolean r4 = r0.equals(r2)
            if (r4 != 0) goto L_0x029d
            boolean r4 = r15.equals(r2)
            if (r4 != 0) goto L_0x029d
            boolean r4 = r10.equals(r2)
            if (r4 != 0) goto L_0x029d
            java.lang.String r4 = "A_EAC3"
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L_0x029d
            boolean r4 = r1.equals(r2)
            if (r4 != 0) goto L_0x029d
            r4 = r23
            boolean r23 = r4.equals(r2)
            if (r23 != 0) goto L_0x029f
            r23 = r6
            r6 = r22
            boolean r22 = r6.equals(r2)
            if (r22 != 0) goto L_0x02a3
            r22 = r5
            r5 = r20
            boolean r20 = r5.equals(r2)
            if (r20 != 0) goto L_0x02a7
            r20 = r1
            java.lang.String r1 = "A_FLAC"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x02a9
            r1 = r19
            boolean r19 = r1.equals(r2)
            if (r19 != 0) goto L_0x029a
            r19 = r1
            java.lang.String r1 = "A_PCM/INT/LIT"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x02a9
            java.lang.String r1 = "S_TEXT/UTF8"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x02a9
            r1 = r18
            boolean r18 = r1.equals(r2)
            if (r18 != 0) goto L_0x02ab
            r18 = r3
            r3 = r21
            boolean r21 = r3.equals(r2)
            if (r21 != 0) goto L_0x02af
            r21 = r0
            r0 = r17
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x0298
            goto L_0x02b3
        L_0x0298:
            r2 = 0
            goto L_0x02b4
        L_0x029a:
            r19 = r1
            goto L_0x02a9
        L_0x029d:
            r4 = r23
        L_0x029f:
            r23 = r6
            r6 = r22
        L_0x02a3:
            r22 = r5
            r5 = r20
        L_0x02a7:
            r20 = r1
        L_0x02a9:
            r1 = r18
        L_0x02ab:
            r18 = r3
            r3 = r21
        L_0x02af:
            r21 = r0
            r0 = r17
        L_0x02b3:
            r2 = 1
        L_0x02b4:
            if (r2 == 0) goto L_0x0905
            r2 = r16
            r16 = r15
            e8.nd0 r15 = r2.f7291t
            r17 = r14
            e8.id0 r14 = r2.Y
            r24 = r2
            int r2 = r15.f15649b
            r25 = r14
            java.lang.String r14 = r15.f15648a
            r14.getClass()
            int r26 = r14.hashCode()
            r27 = r2
            r2 = 16
            switch(r26) {
                case -2095576542: goto L_0x0423;
                case -2095575984: goto L_0x0418;
                case -1985379776: goto L_0x040d;
                case -1784763192: goto L_0x0402;
                case -1730367663: goto L_0x03f7;
                case -1482641358: goto L_0x03ec;
                case -1482641357: goto L_0x03e1;
                case -1373388978: goto L_0x03d6;
                case -933872740: goto L_0x03ca;
                case -538363189: goto L_0x03be;
                case -538363109: goto L_0x03b2;
                case -425012669: goto L_0x03a6;
                case -356037306: goto L_0x039a;
                case 62923557: goto L_0x038e;
                case 62923603: goto L_0x0382;
                case 62927045: goto L_0x0376;
                case 82338133: goto L_0x0368;
                case 82338134: goto L_0x035c;
                case 99146302: goto L_0x0350;
                case 444813526: goto L_0x0344;
                case 542569478: goto L_0x0338;
                case 725957860: goto L_0x032a;
                case 855502857: goto L_0x031c;
                case 1422270023: goto L_0x030e;
                case 1809237540: goto L_0x0302;
                case 1950749482: goto L_0x02f4;
                case 1950789798: goto L_0x02e6;
                case 1951062397: goto L_0x02d8;
                default: goto L_0x02d6;
            }
        L_0x02d6:
            goto L_0x042e
        L_0x02d8:
            java.lang.String r0 = "A_OPUS"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x02e2
            goto L_0x042e
        L_0x02e2:
            r0 = 27
            goto L_0x042f
        L_0x02e6:
            java.lang.String r0 = "A_FLAC"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x02f0
            goto L_0x042e
        L_0x02f0:
            r0 = 26
            goto L_0x042f
        L_0x02f4:
            java.lang.String r0 = "A_EAC3"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x02fe
            goto L_0x042e
        L_0x02fe:
            r0 = 25
            goto L_0x042f
        L_0x0302:
            boolean r0 = r14.equals(r7)
            if (r0 != 0) goto L_0x030a
            goto L_0x042e
        L_0x030a:
            r0 = 24
            goto L_0x042f
        L_0x030e:
            java.lang.String r0 = "S_TEXT/UTF8"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0318
            goto L_0x042e
        L_0x0318:
            r0 = 23
            goto L_0x042f
        L_0x031c:
            java.lang.String r0 = "V_MPEGH/ISO/HEVC"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0326
            goto L_0x042e
        L_0x0326:
            r0 = 22
            goto L_0x042f
        L_0x032a:
            java.lang.String r0 = "A_PCM/INT/LIT"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0334
            goto L_0x042e
        L_0x0334:
            r0 = 21
            goto L_0x042f
        L_0x0338:
            boolean r0 = r14.equals(r6)
            if (r0 != 0) goto L_0x0340
            goto L_0x042e
        L_0x0340:
            r0 = 20
            goto L_0x042f
        L_0x0344:
            boolean r0 = r14.equals(r13)
            if (r0 != 0) goto L_0x034c
            goto L_0x042e
        L_0x034c:
            r0 = 19
            goto L_0x042f
        L_0x0350:
            boolean r0 = r14.equals(r3)
            if (r0 != 0) goto L_0x0358
            goto L_0x042e
        L_0x0358:
            r0 = 18
            goto L_0x042f
        L_0x035c:
            boolean r0 = r14.equals(r8)
            if (r0 != 0) goto L_0x0364
            goto L_0x042e
        L_0x0364:
            r0 = 17
            goto L_0x042f
        L_0x0368:
            r0 = r58
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0372
            goto L_0x042e
        L_0x0372:
            r0 = 16
            goto L_0x042f
        L_0x0376:
            boolean r0 = r14.equals(r4)
            if (r0 != 0) goto L_0x037e
            goto L_0x042e
        L_0x037e:
            r0 = 15
            goto L_0x042f
        L_0x0382:
            boolean r0 = r14.equals(r10)
            if (r0 != 0) goto L_0x038a
            goto L_0x042e
        L_0x038a:
            r0 = 14
            goto L_0x042f
        L_0x038e:
            boolean r0 = r14.equals(r9)
            if (r0 != 0) goto L_0x0396
            goto L_0x042e
        L_0x0396:
            r0 = 13
            goto L_0x042f
        L_0x039a:
            boolean r0 = r14.equals(r5)
            if (r0 != 0) goto L_0x03a2
            goto L_0x042e
        L_0x03a2:
            r0 = 12
            goto L_0x042f
        L_0x03a6:
            boolean r0 = r14.equals(r1)
            if (r0 != 0) goto L_0x03ae
            goto L_0x042e
        L_0x03ae:
            r0 = 11
            goto L_0x042f
        L_0x03b2:
            boolean r0 = r14.equals(r11)
            if (r0 != 0) goto L_0x03ba
            goto L_0x042e
        L_0x03ba:
            r0 = 10
            goto L_0x042f
        L_0x03be:
            boolean r0 = r14.equals(r12)
            if (r0 != 0) goto L_0x03c6
            goto L_0x042e
        L_0x03c6:
            r0 = 9
            goto L_0x042f
        L_0x03ca:
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x03d2
            goto L_0x042e
        L_0x03d2:
            r0 = 8
            goto L_0x042f
        L_0x03d6:
            r0 = r17
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x03df
            goto L_0x042e
        L_0x03df:
            r0 = 7
            goto L_0x042f
        L_0x03e1:
            r0 = r16
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x03ea
            goto L_0x042e
        L_0x03ea:
            r0 = 6
            goto L_0x042f
        L_0x03ec:
            r0 = r21
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x03f5
            goto L_0x042e
        L_0x03f5:
            r0 = 5
            goto L_0x042f
        L_0x03f7:
            r0 = r18
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0400
            goto L_0x042e
        L_0x0400:
            r0 = 4
            goto L_0x042f
        L_0x0402:
            r0 = r20
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x040b
            goto L_0x042e
        L_0x040b:
            r0 = 3
            goto L_0x042f
        L_0x040d:
            r0 = r19
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0416
            goto L_0x042e
        L_0x0416:
            r0 = 2
            goto L_0x042f
        L_0x0418:
            r0 = r22
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x0421
            goto L_0x042e
        L_0x0421:
            r0 = 1
            goto L_0x042f
        L_0x0423:
            r0 = r23
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x042c
            goto L_0x042e
        L_0x042c:
            r0 = 0
            goto L_0x042f
        L_0x042e:
            r0 = -1
        L_0x042f:
            java.lang.String r1 = "video/x-unknown"
            java.lang.String r3 = "audio/x-unknown"
            java.lang.String r4 = "MatroskaExtractor"
            switch(r0) {
                case 0: goto L_0x06ff;
                case 1: goto L_0x06ff;
                case 2: goto L_0x066c;
                case 3: goto L_0x0668;
                case 4: goto L_0x05e5;
                case 5: goto L_0x05d8;
                case 6: goto L_0x05d5;
                case 7: goto L_0x0548;
                case 8: goto L_0x0527;
                case 9: goto L_0x06ff;
                case 10: goto L_0x050c;
                case 11: goto L_0x0502;
                case 12: goto L_0x04fe;
                case 13: goto L_0x04f4;
                case 14: goto L_0x04f0;
                case 15: goto L_0x04ec;
                case 16: goto L_0x04e8;
                case 17: goto L_0x04e4;
                case 18: goto L_0x04e0;
                case 19: goto L_0x06f5;
                case 20: goto L_0x04ec;
                case 21: goto L_0x04b2;
                case 22: goto L_0x049b;
                case 23: goto L_0x0497;
                case 24: goto L_0x0493;
                case 25: goto L_0x048f;
                case 26: goto L_0x0485;
                case 27: goto L_0x0440;
                default: goto L_0x0438;
            }
        L_0x0438:
            e8.cc0 r0 = new e8.cc0
            java.lang.String r1 = "Unrecognized codec identifier."
            r0.<init>(r1)
            throw r0
        L_0x0440:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 3
            r0.<init>(r1)
            byte[] r1 = r15.f15655h
            r0.add(r1)
            r1 = 8
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r1)
            java.nio.ByteOrder r3 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r2 = r2.order(r3)
            long r3 = r15.J
            java.nio.ByteBuffer r2 = r2.putLong(r3)
            byte[] r2 = r2.array()
            r0.add(r2)
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r1)
            java.nio.ByteOrder r2 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r1 = r1.order(r2)
            long r2 = r15.K
            java.nio.ByteBuffer r1 = r1.putLong(r2)
            byte[] r1 = r1.array()
            r0.add(r1)
            r1 = 5760(0x1680, float:8.071E-42)
            java.lang.String r2 = "audio/opus"
            goto L_0x0641
        L_0x0485:
            byte[] r0 = r15.f15655h
            java.util.List r0 = java.util.Collections.singletonList(r0)
            java.lang.String r1 = "audio/x-flac"
            goto L_0x070b
        L_0x048f:
            java.lang.String r1 = "audio/eac3"
            goto L_0x06f5
        L_0x0493:
            java.lang.String r1 = "video/mpeg2"
            goto L_0x06f5
        L_0x0497:
            java.lang.String r1 = "application/x-subrip"
            goto L_0x06f5
        L_0x049b:
            e8.w60 r0 = new e8.w60
            byte[] r1 = r15.f15655h
            r2 = 1
            r0.<init>(r1, r2)
            com.google.android.gms.internal.ads.se r0 = com.google.android.gms.internal.ads.se.g(r0)
            java.lang.Object r1 = r0.f8122b
            java.util.List r1 = (java.util.List) r1
            int r0 = r0.f8121a
            r15.P = r0
            java.lang.String r0 = "video/hevc"
            goto L_0x0520
        L_0x04b2:
            int r0 = r15.H
            int r0 = e8.eg0.g(r0)
            if (r0 != 0) goto L_0x04dc
            int r0 = r15.H
            r1 = 75
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r1 = "Unsupported PCM bit depth: "
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = ". Setting mimeType to "
            r2.append(r0)
            r2.append(r3)
            java.lang.String r0 = r2.toString()
            android.util.Log.w(r4, r0)
            goto L_0x06f4
        L_0x04dc:
            java.lang.String r1 = "audio/raw"
            goto L_0x06e3
        L_0x04e0:
            java.lang.String r1 = "application/pgs"
            goto L_0x06f5
        L_0x04e4:
            java.lang.String r1 = "video/x-vnd.on2.vp9"
            goto L_0x06f5
        L_0x04e8:
            java.lang.String r1 = "video/x-vnd.on2.vp8"
            goto L_0x06f5
        L_0x04ec:
            java.lang.String r1 = "audio/vnd.dts"
            goto L_0x06f5
        L_0x04f0:
            java.lang.String r1 = "audio/ac3"
            goto L_0x06f5
        L_0x04f4:
            byte[] r0 = r15.f15655h
            java.util.List r0 = java.util.Collections.singletonList(r0)
            java.lang.String r1 = "audio/mp4a-latm"
            goto L_0x070b
        L_0x04fe:
            java.lang.String r1 = "audio/vnd.dts.hd"
            goto L_0x06f5
        L_0x0502:
            byte[] r0 = r15.f15655h
            java.util.List r0 = java.util.Collections.singletonList(r0)
            java.lang.String r1 = "application/vobsub"
            goto L_0x070b
        L_0x050c:
            e8.w60 r0 = new e8.w60
            byte[] r1 = r15.f15655h
            r2 = 1
            r0.<init>(r1, r2)
            com.google.android.gms.internal.ads.mu r0 = com.google.android.gms.internal.ads.mu.a(r0)
            java.util.List<byte[]> r1 = r0.f7507a
            int r0 = r0.f7508b
            r15.P = r0
            java.lang.String r0 = "video/avc"
        L_0x0520:
            r56 = r1
            r1 = r0
            r0 = r56
            goto L_0x070b
        L_0x0527:
            r0 = 4
            byte[] r0 = new byte[r0]
            byte[] r1 = r15.f15655h
            r2 = 0
            byte r3 = r1[r2]
            r0[r2] = r3
            r2 = 1
            byte r3 = r1[r2]
            r0[r2] = r3
            r2 = 2
            byte r3 = r1[r2]
            r0[r2] = r3
            r2 = 3
            byte r1 = r1[r2]
            r0[r2] = r1
            java.util.List r0 = java.util.Collections.singletonList(r0)
            java.lang.String r1 = "application/dvbsubs"
            goto L_0x070b
        L_0x0548:
            r0 = 1
            e8.w60 r3 = new e8.w60
            byte[] r5 = r15.f15655h
            r3.<init>(r5, r0)
            r3.i(r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x05cd }
            byte[] r0 = r3.f17220a     // Catch:{ ArrayIndexOutOfBoundsException -> 0x05cd }
            int r5 = r3.f17221b     // Catch:{ ArrayIndexOutOfBoundsException -> 0x05cd }
            int r6 = r5 + 1
            r3.f17221b = r6     // Catch:{ ArrayIndexOutOfBoundsException -> 0x05cd }
            byte r5 = r0[r5]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x05cd }
            long r7 = (long) r5     // Catch:{ ArrayIndexOutOfBoundsException -> 0x05cd }
            r9 = 255(0xff, double:1.26E-321)
            long r7 = r7 & r9
            int r5 = r6 + 1
            r3.f17221b = r5     // Catch:{ ArrayIndexOutOfBoundsException -> 0x05cd }
            byte r6 = r0[r6]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x05cd }
            long r11 = (long) r6     // Catch:{ ArrayIndexOutOfBoundsException -> 0x05cd }
            long r11 = r11 & r9
            r6 = 8
            long r11 = r11 << r6
            long r7 = r7 | r11
            int r6 = r5 + 1
            r3.f17221b = r6     // Catch:{ ArrayIndexOutOfBoundsException -> 0x05cd }
            byte r5 = r0[r5]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x05cd }
            long r11 = (long) r5     // Catch:{ ArrayIndexOutOfBoundsException -> 0x05cd }
            long r11 = r11 & r9
            long r11 = r11 << r2
            long r7 = r7 | r11
            int r2 = r6 + 1
            r3.f17221b = r2     // Catch:{ ArrayIndexOutOfBoundsException -> 0x05cd }
            byte r3 = r0[r6]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x05cd }
            long r5 = (long) r3     // Catch:{ ArrayIndexOutOfBoundsException -> 0x05cd }
            long r5 = r5 & r9
            r3 = 24
            long r5 = r5 << r3
            long r5 = r5 | r7
            r7 = 826496599(0x31435657, double:4.08343576E-315)
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x058c
            r0 = 0
            goto L_0x05b5
        L_0x058c:
            int r2 = r2 + 20
        L_0x058e:
            int r3 = r0.length     // Catch:{ ArrayIndexOutOfBoundsException -> 0x05cd }
            int r3 = r3 + -4
            if (r2 >= r3) goto L_0x05c5
            byte r3 = r0[r2]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x05cd }
            if (r3 != 0) goto L_0x05c2
            int r3 = r2 + 1
            byte r3 = r0[r3]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x05cd }
            if (r3 != 0) goto L_0x05c2
            int r3 = r2 + 2
            byte r3 = r0[r3]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x05cd }
            r5 = 1
            if (r3 != r5) goto L_0x05c2
            int r3 = r2 + 3
            byte r3 = r0[r3]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x05cd }
            r5 = 15
            if (r3 != r5) goto L_0x05c2
            int r3 = r0.length     // Catch:{ ArrayIndexOutOfBoundsException -> 0x05cd }
            byte[] r0 = java.util.Arrays.copyOfRange(r0, r2, r3)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x05cd }
            java.util.List r0 = java.util.Collections.singletonList(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x05cd }
        L_0x05b5:
            if (r0 == 0) goto L_0x05bb
            java.lang.String r1 = "video/wvc1"
            goto L_0x070b
        L_0x05bb:
            java.lang.String r2 = "Unsupported FourCC. Setting mimeType to video/x-unknown"
            android.util.Log.w(r4, r2)
            goto L_0x070b
        L_0x05c2:
            int r2 = r2 + 1
            goto L_0x058e
        L_0x05c5:
            e8.cc0 r0 = new e8.cc0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x05cd }
            java.lang.String r1 = "Failed to find FourCC VC1 initialization data"
            r0.<init>(r1)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x05cd }
            throw r0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x05cd }
        L_0x05cd:
            e8.cc0 r0 = new e8.cc0
            java.lang.String r1 = "Error parsing FourCC VC1 codec private"
            r0.<init>(r1)
            throw r0
        L_0x05d5:
            java.lang.String r0 = "audio/mpeg"
            goto L_0x05da
        L_0x05d8:
            java.lang.String r0 = "audio/mpeg-L2"
        L_0x05da:
            r1 = -1
            r2 = 4096(0x1000, float:5.74E-42)
            r3 = 0
            r53 = r3
            r9 = -1
            r30 = 4096(0x1000, float:5.74E-42)
            goto L_0x0715
        L_0x05e5:
            byte[] r0 = r15.f15655h
            java.lang.String r1 = "Error parsing vorbis codec private"
            r2 = 0
            byte r2 = r0[r2]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0662 }
            r3 = 2
            if (r2 != r3) goto L_0x065c
            r2 = 0
            r3 = 1
        L_0x05f1:
            byte r4 = r0[r3]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0662 }
            r5 = -1
            if (r4 != r5) goto L_0x05fb
            int r2 = r2 + 255
            int r3 = r3 + 1
            goto L_0x05f1
        L_0x05fb:
            int r4 = r3 + 1
            byte r3 = r0[r3]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0662 }
            int r2 = r2 + r3
            r3 = 0
        L_0x0601:
            byte r5 = r0[r4]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0662 }
            r6 = -1
            if (r5 != r6) goto L_0x060b
            int r3 = r3 + 255
            int r4 = r4 + 1
            goto L_0x0601
        L_0x060b:
            int r5 = r4 + 1
            byte r4 = r0[r4]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0662 }
            int r3 = r3 + r4
            byte r4 = r0[r5]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0662 }
            r6 = 1
            if (r4 != r6) goto L_0x0656
            byte[] r4 = new byte[r2]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0662 }
            r6 = 0
            java.lang.System.arraycopy(r0, r5, r4, r6, r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0662 }
            int r5 = r5 + r2
            byte r2 = r0[r5]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0662 }
            r6 = 3
            if (r2 != r6) goto L_0x0650
            int r5 = r5 + r3
            byte r2 = r0[r5]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0662 }
            r3 = 5
            if (r2 != r3) goto L_0x064a
            int r2 = r0.length     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0662 }
            int r2 = r2 - r5
            byte[] r2 = new byte[r2]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0662 }
            int r3 = r0.length     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0662 }
            int r3 = r3 - r5
            r6 = 0
            java.lang.System.arraycopy(r0, r5, r2, r6, r3)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0662 }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0662 }
            r3 = 2
            r0.<init>(r3)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0662 }
            r0.add(r4)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0662 }
            r0.add(r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0662 }
            r1 = 8192(0x2000, float:1.14794E-41)
            java.lang.String r2 = "audio/vorbis"
        L_0x0641:
            r3 = -1
            r53 = r0
            r30 = r1
            r0 = r2
            r9 = -1
            goto L_0x0715
        L_0x064a:
            e8.cc0 r0 = new e8.cc0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0662 }
            r0.<init>(r1)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0662 }
            throw r0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0662 }
        L_0x0650:
            e8.cc0 r0 = new e8.cc0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0662 }
            r0.<init>(r1)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0662 }
            throw r0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0662 }
        L_0x0656:
            e8.cc0 r0 = new e8.cc0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0662 }
            r0.<init>(r1)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0662 }
            throw r0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0662 }
        L_0x065c:
            e8.cc0 r0 = new e8.cc0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0662 }
            r0.<init>(r1)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0662 }
            throw r0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0662 }
        L_0x0662:
            e8.cc0 r0 = new e8.cc0
            r0.<init>(r1)
            throw r0
        L_0x0668:
            java.lang.String r1 = "audio/true-hd"
            goto L_0x06f5
        L_0x066c:
            e8.w60 r0 = new e8.w60
            byte[] r1 = r15.f15655h
            r2 = 1
            r0.<init>(r1, r2)
            byte[] r1 = r0.f17220a     // Catch:{ ArrayIndexOutOfBoundsException -> 0x06f7 }
            int r2 = r0.f17221b     // Catch:{ ArrayIndexOutOfBoundsException -> 0x06f7 }
            int r5 = r2 + 1
            r0.f17221b = r5     // Catch:{ ArrayIndexOutOfBoundsException -> 0x06f7 }
            byte r2 = r1[r2]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x06f7 }
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r6 = r5 + 1
            r0.f17221b = r6     // Catch:{ ArrayIndexOutOfBoundsException -> 0x06f7 }
            byte r1 = r1[r5]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x06f7 }
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r1 = r1 | r2
            r2 = 1
            if (r1 != r2) goto L_0x068f
            goto L_0x06b3
        L_0x068f:
            r2 = 65534(0xfffe, float:9.1833E-41)
            if (r1 != r2) goto L_0x06b5
            r1 = 24
            r0.h(r1)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x06f7 }
            long r1 = r0.c()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x06f7 }
            java.util.UUID r5 = com.google.android.gms.internal.ads.kt.f7271b0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x06f7 }
            long r6 = r5.getMostSignificantBits()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x06f7 }
            int r8 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x06b5
            long r0 = r0.c()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x06f7 }
            long r5 = r5.getLeastSignificantBits()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x06f7 }
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x06b5
        L_0x06b3:
            r0 = 1
            goto L_0x06b6
        L_0x06b5:
            r0 = 0
        L_0x06b6:
            if (r0 == 0) goto L_0x06eb
            int r0 = r15.H
            int r0 = e8.eg0.g(r0)
            if (r0 != 0) goto L_0x06e1
            int r0 = r15.H
            r1 = 75
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r1 = "Unsupported PCM bit depth: "
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = ". Setting mimeType to "
            r2.append(r0)
            r2.append(r3)
            java.lang.String r0 = r2.toString()
            android.util.Log.w(r4, r0)
            goto L_0x06f4
        L_0x06e1:
            java.lang.String r1 = "audio/raw"
        L_0x06e3:
            r2 = 0
            r3 = r2
            r56 = r1
            r1 = r0
            r0 = r56
            goto L_0x070f
        L_0x06eb:
            java.lang.String r0 = "Non-PCM MS/ACM is unsupported. Setting mimeType to "
            java.lang.String r0 = r0.concat(r3)
            android.util.Log.w(r4, r0)
        L_0x06f4:
            r1 = r3
        L_0x06f5:
            r0 = 0
            goto L_0x070b
        L_0x06f7:
            e8.cc0 r0 = new e8.cc0
            java.lang.String r1 = "Error parsing MS/ACM codec private"
            r0.<init>(r1)
            throw r0
        L_0x06ff:
            byte[] r0 = r15.f15655h
            if (r0 != 0) goto L_0x0705
            r0 = 0
            goto L_0x0709
        L_0x0705:
            java.util.List r0 = java.util.Collections.singletonList(r0)
        L_0x0709:
            java.lang.String r1 = "video/mp4v-es"
        L_0x070b:
            r2 = -1
            r3 = r0
            r0 = r1
            r1 = -1
        L_0x070f:
            r2 = -1
            r9 = r1
            r53 = r3
            r30 = -1
        L_0x0715:
            boolean r1 = r15.M
            r1 = r1 | 0
            boolean r2 = r15.L
            if (r2 == 0) goto L_0x071f
            r2 = 2
            goto L_0x0720
        L_0x071f:
            r2 = 0
        L_0x0720:
            r12 = r1 | r2
            boolean r1 = p.a.e(r0)
            if (r1 == 0) goto L_0x0740
            java.lang.String r4 = java.lang.Integer.toString(r27)
            int r7 = r15.G
            int r8 = r15.I
            com.google.android.gms.internal.ads.et r11 = r15.f15656i
            java.lang.String r13 = r15.N
            r5 = r0
            r6 = r30
            r10 = r53
            e8.bc0 r0 = e8.bc0.a(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r1 = 1
            goto L_0x08ea
        L_0x0740:
            boolean r1 = p.a.f(r0)
            if (r1 == 0) goto L_0x0870
            int r1 = r15.f15661n
            if (r1 != 0) goto L_0x075c
            int r1 = r15.f15659l
            r2 = -1
            if (r1 != r2) goto L_0x0751
            int r1 = r15.f15657j
        L_0x0751:
            r15.f15659l = r1
            int r1 = r15.f15660m
            if (r1 != r2) goto L_0x0759
            int r1 = r15.f15658k
        L_0x0759:
            r15.f15660m = r1
            goto L_0x075d
        L_0x075c:
            r2 = -1
        L_0x075d:
            int r1 = r15.f15659l
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 == r2) goto L_0x0775
            int r4 = r15.f15660m
            if (r4 == r2) goto L_0x0775
            int r2 = r15.f15658k
            int r2 = r2 * r1
            float r1 = (float) r2
            int r2 = r15.f15657j
            int r2 = r2 * r4
            float r2 = (float) r2
            float r1 = r1 / r2
            r35 = r1
            goto L_0x0779
        L_0x0775:
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r35 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x0779:
            boolean r1 = r15.f15664q
            if (r1 == 0) goto L_0x0848
            float r1 = r15.f15670w
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x0839
            float r1 = r15.f15671x
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x0839
            float r1 = r15.f15672y
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x0839
            float r1 = r15.f15673z
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x0839
            float r1 = r15.A
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x0839
            float r1 = r15.B
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x0839
            float r1 = r15.C
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x0839
            float r1 = r15.D
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x0839
            float r1 = r15.E
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x0839
            float r1 = r15.F
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x07bb
            goto L_0x0839
        L_0x07bb:
            r1 = 25
            byte[] r1 = new byte[r1]
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.wrap(r1)
            r3 = 0
            r2.put(r3)
            float r3 = r15.f15670w
            r4 = 1195593728(0x47435000, float:50000.0)
            float r3 = r3 * r4
            r5 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 + r5
            int r3 = (int) r3
            short r3 = (short) r3
            r2.putShort(r3)
            float r3 = r15.f15671x
            float r3 = r3 * r4
            float r3 = r3 + r5
            int r3 = (int) r3
            short r3 = (short) r3
            r2.putShort(r3)
            float r3 = r15.f15672y
            float r3 = r3 * r4
            float r3 = r3 + r5
            int r3 = (int) r3
            short r3 = (short) r3
            r2.putShort(r3)
            float r3 = r15.f15673z
            float r3 = r3 * r4
            float r3 = r3 + r5
            int r3 = (int) r3
            short r3 = (short) r3
            r2.putShort(r3)
            float r3 = r15.A
            float r3 = r3 * r4
            float r3 = r3 + r5
            int r3 = (int) r3
            short r3 = (short) r3
            r2.putShort(r3)
            float r3 = r15.B
            float r3 = r3 * r4
            float r3 = r3 + r5
            int r3 = (int) r3
            short r3 = (short) r3
            r2.putShort(r3)
            float r3 = r15.C
            float r3 = r3 * r4
            float r3 = r3 + r5
            int r3 = (int) r3
            short r3 = (short) r3
            r2.putShort(r3)
            float r3 = r15.D
            float r3 = r3 * r4
            float r3 = r3 + r5
            int r3 = (int) r3
            short r3 = (short) r3
            r2.putShort(r3)
            float r3 = r15.E
            float r3 = r3 + r5
            int r3 = (int) r3
            short r3 = (short) r3
            r2.putShort(r3)
            float r3 = r15.F
            float r3 = r3 + r5
            int r3 = (int) r3
            short r3 = (short) r3
            r2.putShort(r3)
            int r3 = r15.f15668u
            short r3 = (short) r3
            r2.putShort(r3)
            int r3 = r15.f15669v
            short r3 = (short) r3
            r2.putShort(r3)
            goto L_0x083a
        L_0x0839:
            r1 = 0
        L_0x083a:
            e8.hg0 r2 = new e8.hg0
            int r3 = r15.f15665r
            int r4 = r15.f15667t
            int r5 = r15.f15666s
            r2.<init>(r3, r4, r5, r1)
            r38 = r2
            goto L_0x084b
        L_0x0848:
            r1 = 0
            r38 = r1
        L_0x084b:
            java.lang.String r28 = java.lang.Integer.toString(r27)
            int r1 = r15.f15657j
            int r2 = r15.f15658k
            r34 = -1
            byte[] r3 = r15.f15662o
            int r4 = r15.f15663p
            com.google.android.gms.internal.ads.et r5 = r15.f15656i
            r29 = r0
            r31 = r1
            r32 = r2
            r33 = r53
            r36 = r3
            r37 = r4
            r39 = r5
            e8.bc0 r0 = e8.bc0.b(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            r1 = 2
            goto L_0x08ea
        L_0x0870:
            java.lang.String r1 = "application/x-subrip"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0885
            java.lang.String r1 = java.lang.Integer.toString(r27)
            java.lang.String r2 = r15.N
            com.google.android.gms.internal.ads.et r3 = r15.f15656i
            e8.bc0 r0 = e8.bc0.e(r1, r0, r12, r2, r3)
            goto L_0x08e9
        L_0x0885:
            java.lang.String r1 = "application/vobsub"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x08a6
            java.lang.String r1 = "application/pgs"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x08a6
            java.lang.String r1 = "application/dvbsubs"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x089e
            goto L_0x08a6
        L_0x089e:
            e8.cc0 r0 = new e8.cc0
            java.lang.String r1 = "Unexpected MIME type."
            r0.<init>(r1)
            throw r0
        L_0x08a6:
            java.lang.String r29 = java.lang.Integer.toString(r27)
            java.lang.String r1 = r15.N
            r49 = r1
            com.google.android.gms.internal.ads.et r1 = r15.f15656i
            r54 = r1
            e8.bc0 r1 = new e8.bc0
            r28 = r1
            r30 = 0
            r32 = 0
            r33 = -1
            r34 = -1
            r35 = -1
            r36 = -1
            r37 = -1082130432(0xffffffffbf800000, float:-1.0)
            r38 = -1
            r39 = -1082130432(0xffffffffbf800000, float:-1.0)
            r40 = 0
            r41 = -1
            r42 = 0
            r43 = -1
            r44 = -1
            r45 = -1
            r46 = -1
            r47 = -1
            r48 = 0
            r50 = -1
            r51 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r55 = 0
            r31 = r0
            r28.<init>(r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r53, r54, r55)
            r0 = r1
        L_0x08e9:
            r1 = 3
        L_0x08ea:
            int r2 = r15.f15649b
            r14 = r25
            com.google.android.gms.internal.ads.yt r14 = (com.google.android.gms.internal.ads.yt) r14
            com.google.android.gms.internal.ads.gu r1 = r14.o(r2, r1)
            r15.O = r1
            r1.g(r0)
            r1 = r24
            android.util.SparseArray<e8.nd0> r0 = r1.f7274c
            e8.nd0 r2 = r1.f7291t
            int r3 = r2.f15649b
            r0.put(r3, r2)
            goto L_0x0907
        L_0x0905:
            r1 = r16
        L_0x0907:
            r0 = 0
            r1.f7291t = r0
            goto L_0x092d
        L_0x090b:
            int r0 = r1.E
            r2 = 2
            if (r0 == r2) goto L_0x0911
            goto L_0x092d
        L_0x0911:
            boolean r0 = r1.X
            if (r0 != 0) goto L_0x091b
            int r0 = r1.M
            r0 = r0 | 1
            r1.M = r0
        L_0x091b:
            android.util.SparseArray<e8.nd0> r0 = r1.f7274c
            int r2 = r1.K
            java.lang.Object r0 = r0.get(r2)
            e8.nd0 r0 = (e8.nd0) r0
            long r2 = r1.F
            r1.d(r0, r2)
            r0 = 0
            r1.E = r0
        L_0x092d:
            r0 = 1
            return r0
        L_0x092f:
            r0 = 0
            r2 = 1
            r8 = r57
            int r9 = r8.f7178e
            if (r9 != 0) goto L_0x0997
            com.google.android.gms.internal.ads.lt r9 = r8.f7176c
            r10 = 4
            long r9 = r9.a(r1, r2, r0, r10)
            r11 = -2
            int r2 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r2 != 0) goto L_0x0989
            r2 = r1
            com.google.android.gms.internal.ads.gt r2 = (com.google.android.gms.internal.ads.gt) r2
            r2.f6690e = r0
        L_0x0949:
            byte[] r2 = r8.f7174a
            r9 = r1
            com.google.android.gms.internal.ads.gt r9 = (com.google.android.gms.internal.ads.gt) r9
            r10 = 4
            r9.b(r2, r0, r10)
            byte[] r2 = r8.f7174a
            byte r2 = r2[r0]
            int r2 = com.google.android.gms.internal.ads.lt.c(r2)
            r11 = -1
            if (r2 == r11) goto L_0x0983
            if (r2 > r10) goto L_0x0983
            byte[] r10 = r8.f7174a
            long r10 = com.google.android.gms.internal.ads.lt.b(r10, r2, r0)
            int r0 = (int) r10
            com.google.android.gms.internal.ads.g2 r10 = r8.f7177d
            r10.getClass()
            byte[] r10 = com.google.android.gms.internal.ads.kt.Z
            if (r0 == r4) goto L_0x097b
            r10 = 524531317(0x1f43b675, float:4.144378E-20)
            if (r0 == r10) goto L_0x097b
            if (r0 == r5) goto L_0x097b
            if (r0 != r3) goto L_0x0979
            goto L_0x097b
        L_0x0979:
            r10 = 0
            goto L_0x097c
        L_0x097b:
            r10 = 1
        L_0x097c:
            if (r10 == 0) goto L_0x0983
            r9.d(r2)
            long r9 = (long) r0
            goto L_0x0989
        L_0x0983:
            r0 = 1
            r9.d(r0)
            r0 = 0
            goto L_0x0949
        L_0x0989:
            r0 = 1
            int r2 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r2 != 0) goto L_0x0990
            r0 = 0
            return r0
        L_0x0990:
            r2 = 0
            int r3 = (int) r9
            r8.f7179f = r3
            r8.f7178e = r0
            goto L_0x0999
        L_0x0997:
            r0 = 1
            r2 = 0
        L_0x0999:
            int r3 = r8.f7178e
            if (r3 != r0) goto L_0x09aa
            com.google.android.gms.internal.ads.lt r3 = r8.f7176c
            r4 = 8
            long r2 = r3.a(r1, r2, r0, r4)
            r8.f7180g = r2
            r0 = 2
            r8.f7178e = r0
        L_0x09aa:
            com.google.android.gms.internal.ads.g2 r0 = r8.f7177d
            int r2 = r8.f7179f
            r0.getClass()
            byte[] r0 = com.google.android.gms.internal.ads.kt.Z
            switch(r2) {
                case 131: goto L_0x09c0;
                case 134: goto L_0x09be;
                case 136: goto L_0x09c0;
                case 155: goto L_0x09c0;
                case 159: goto L_0x09c0;
                case 160: goto L_0x09bc;
                case 161: goto L_0x09ba;
                case 163: goto L_0x09ba;
                case 174: goto L_0x09bc;
                case 176: goto L_0x09c0;
                case 179: goto L_0x09c0;
                case 181: goto L_0x09b8;
                case 183: goto L_0x09bc;
                case 186: goto L_0x09c0;
                case 187: goto L_0x09bc;
                case 215: goto L_0x09c0;
                case 224: goto L_0x09bc;
                case 225: goto L_0x09bc;
                case 231: goto L_0x09c0;
                case 241: goto L_0x09c0;
                case 251: goto L_0x09c0;
                case 16980: goto L_0x09c0;
                case 16981: goto L_0x09ba;
                case 17026: goto L_0x09be;
                case 17029: goto L_0x09c0;
                case 17143: goto L_0x09c0;
                case 17545: goto L_0x09b8;
                case 18401: goto L_0x09c0;
                case 18402: goto L_0x09ba;
                case 18407: goto L_0x09bc;
                case 18408: goto L_0x09c0;
                case 19899: goto L_0x09bc;
                case 20529: goto L_0x09c0;
                case 20530: goto L_0x09c0;
                case 20532: goto L_0x09bc;
                case 20533: goto L_0x09bc;
                case 21419: goto L_0x09ba;
                case 21420: goto L_0x09c0;
                case 21432: goto L_0x09c0;
                case 21680: goto L_0x09c0;
                case 21682: goto L_0x09c0;
                case 21690: goto L_0x09c0;
                case 21930: goto L_0x09c0;
                case 21936: goto L_0x09bc;
                case 21945: goto L_0x09c0;
                case 21946: goto L_0x09c0;
                case 21947: goto L_0x09c0;
                case 21948: goto L_0x09c0;
                case 21949: goto L_0x09c0;
                case 21968: goto L_0x09bc;
                case 21969: goto L_0x09b8;
                case 21970: goto L_0x09b8;
                case 21971: goto L_0x09b8;
                case 21972: goto L_0x09b8;
                case 21973: goto L_0x09b8;
                case 21974: goto L_0x09b8;
                case 21975: goto L_0x09b8;
                case 21976: goto L_0x09b8;
                case 21977: goto L_0x09b8;
                case 21978: goto L_0x09b8;
                case 22186: goto L_0x09c0;
                case 22203: goto L_0x09c0;
                case 25152: goto L_0x09bc;
                case 25188: goto L_0x09c0;
                case 25506: goto L_0x09ba;
                case 28032: goto L_0x09bc;
                case 30320: goto L_0x09bc;
                case 30322: goto L_0x09ba;
                case 2274716: goto L_0x09be;
                case 2352003: goto L_0x09c0;
                case 2807729: goto L_0x09c0;
                case 290298740: goto L_0x09bc;
                case 357149030: goto L_0x09bc;
                case 374648427: goto L_0x09bc;
                case 408125543: goto L_0x09bc;
                case 440786851: goto L_0x09bc;
                case 475249515: goto L_0x09bc;
                case 524531317: goto L_0x09bc;
                default: goto L_0x09b6;
            }
        L_0x09b6:
            r0 = 0
            goto L_0x09c1
        L_0x09b8:
            r0 = 5
            goto L_0x09c1
        L_0x09ba:
            r0 = 4
            goto L_0x09c1
        L_0x09bc:
            r0 = 1
            goto L_0x09c1
        L_0x09be:
            r0 = 3
            goto L_0x09c1
        L_0x09c0:
            r0 = 2
        L_0x09c1:
            if (r0 == 0) goto L_0x0ad0
            r2 = 1
            if (r0 == r2) goto L_0x0aad
            r2 = 2
            if (r0 == r2) goto L_0x0a79
            r2 = 3
            if (r0 == r2) goto L_0x0a37
            r2 = 4
            if (r0 == r2) goto L_0x0a29
            r2 = 5
            if (r0 != r2) goto L_0x0a1b
            long r2 = r8.f7180g
            r4 = 4
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x09fc
            r4 = 8
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x09e1
            goto L_0x09fc
        L_0x09e1:
            e8.cc0 r0 = new e8.cc0
            long r1 = r8.f7180g
            r3 = 40
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            java.lang.String r3 = "Invalid float size: "
            r4.append(r3)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r0.<init>(r1)
            throw r0
        L_0x09fc:
            com.google.android.gms.internal.ads.g2 r0 = r8.f7177d
            int r4 = r8.f7179f
            int r3 = (int) r2
            long r1 = r8.a(r1, r3)
            r5 = 4
            if (r3 != r5) goto L_0x0a0f
            int r2 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r2)
            double r1 = (double) r1
            goto L_0x0a13
        L_0x0a0f:
            double r1 = java.lang.Double.longBitsToDouble(r1)
        L_0x0a13:
            r0.h(r4, r1)
            r0 = 0
            r8.f7178e = r0
            goto L_0x0a90
        L_0x0a1b:
            e8.cc0 r1 = new e8.cc0
            r2 = 32
            java.lang.String r3 = "Invalid element type "
            java.lang.String r0 = l0.d.a(r2, r3, r0)
            r1.<init>(r0)
            throw r1
        L_0x0a29:
            com.google.android.gms.internal.ads.g2 r0 = r8.f7177d
            int r2 = r8.f7179f
            long r3 = r8.f7180g
            int r4 = (int) r3
            r0.i(r2, r4, r1)
            r0 = 0
            r8.f7178e = r0
            goto L_0x0a90
        L_0x0a37:
            long r2 = r8.f7180g
            r4 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x0a5e
            com.google.android.gms.internal.ads.g2 r0 = r8.f7177d
            int r4 = r8.f7179f
            int r3 = (int) r2
            if (r3 != 0) goto L_0x0a4a
            java.lang.String r1 = ""
            goto L_0x0a57
        L_0x0a4a:
            byte[] r2 = new byte[r3]
            com.google.android.gms.internal.ads.gt r1 = (com.google.android.gms.internal.ads.gt) r1
            r5 = 0
            r1.c(r2, r5, r3, r5)
            java.lang.String r1 = new java.lang.String
            r1.<init>(r2)
        L_0x0a57:
            r2 = 0
            r0.j(r4, r1)
            r8.f7178e = r2
            goto L_0x0a90
        L_0x0a5e:
            e8.cc0 r0 = new e8.cc0
            long r1 = r8.f7180g
            r3 = 41
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            java.lang.String r3 = "String element size: "
            r4.append(r3)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r0.<init>(r1)
            throw r0
        L_0x0a79:
            long r2 = r8.f7180g
            r4 = 8
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x0a92
            com.google.android.gms.internal.ads.g2 r0 = r8.f7177d
            int r4 = r8.f7179f
            int r3 = (int) r2
            long r1 = r8.a(r1, r3)
            r0.k(r4, r1)
            r0 = 0
            r8.f7178e = r0
        L_0x0a90:
            r0 = 1
            return r0
        L_0x0a92:
            e8.cc0 r0 = new e8.cc0
            long r1 = r8.f7180g
            r3 = 42
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            java.lang.String r3 = "Invalid integer size: "
            r4.append(r3)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r0.<init>(r1)
            throw r0
        L_0x0aad:
            r0 = r1
            com.google.android.gms.internal.ads.gt r0 = (com.google.android.gms.internal.ads.gt) r0
            long r3 = r0.f6688c
            long r0 = r8.f7180g
            long r0 = r0 + r3
            java.util.Stack<e8.md0> r2 = r8.f7175b
            e8.md0 r5 = new e8.md0
            int r6 = r8.f7179f
            r7 = 0
            r5.<init>(r6, r0, r7)
            r2.add(r5)
            com.google.android.gms.internal.ads.g2 r1 = r8.f7177d
            int r2 = r8.f7179f
            long r5 = r8.f7180g
            r1.l(r2, r3, r5)
            r0 = 0
            r8.f7178e = r0
            r0 = 1
            return r0
        L_0x0ad0:
            r0 = 0
            long r2 = r8.f7180g
            int r3 = (int) r2
            r2 = r1
            com.google.android.gms.internal.ads.gt r2 = (com.google.android.gms.internal.ads.gt) r2
            r2.d(r3)
            r8.f7178e = r0
            r0 = r8
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.jt.b(e8.fd0):boolean");
    }
}
