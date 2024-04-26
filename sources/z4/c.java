package z4;

import v6.v;

/* compiled from: Ac4Util */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f28326a = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    /* compiled from: Ac4Util */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f28327a;

        /* renamed from: b  reason: collision with root package name */
        public final int f28328b;

        /* renamed from: c  reason: collision with root package name */
        public final int f28329c;

        public b(int i10, int i11, int i12, int i13, int i14, a aVar) {
            this.f28327a = i12;
            this.f28328b = i13;
            this.f28329c = i14;
        }
    }

    public static void a(int i10, v vVar) {
        vVar.z(7);
        byte[] bArr = vVar.f26518a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i10 >> 16) & 255);
        bArr[5] = (byte) ((i10 >> 8) & 255);
        bArr[6] = (byte) (i10 & 255);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0093, code lost:
        if (r10 != 11) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0098, code lost:
        if (r10 != 11) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x009d, code lost:
        if (r10 != 8) goto L_0x00a0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static z4.c.b b(d5.b0 r10) {
        /*
            r0 = 16
            int r1 = r10.i(r0)
            int r0 = r10.i(r0)
            r2 = 4
            r3 = 65535(0xffff, float:9.1834E-41)
            if (r0 != r3) goto L_0x0018
            r0 = 24
            int r0 = r10.i(r0)
            r3 = 7
            goto L_0x0019
        L_0x0018:
            r3 = 4
        L_0x0019:
            int r0 = r0 + r3
            r3 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r3) goto L_0x0021
            int r0 = r0 + 2
        L_0x0021:
            r7 = r0
            r0 = 2
            int r1 = r10.i(r0)
            r3 = 0
            r4 = 3
            if (r1 != r4) goto L_0x003e
            r5 = 0
        L_0x002c:
            int r6 = r10.i(r0)
            int r6 = r6 + r5
            boolean r5 = r10.h()
            if (r5 != 0) goto L_0x0039
            int r1 = r1 + r6
            goto L_0x003e
        L_0x0039:
            int r6 = r6 + 1
            int r5 = r6 << 2
            goto L_0x002c
        L_0x003e:
            r5 = 10
            int r5 = r10.i(r5)
            boolean r6 = r10.h()
            if (r6 == 0) goto L_0x0053
            int r6 = r10.i(r4)
            if (r6 <= 0) goto L_0x0053
            r10.s(r0)
        L_0x0053:
            boolean r6 = r10.h()
            r8 = 48000(0xbb80, float:6.7262E-41)
            r9 = 44100(0xac44, float:6.1797E-41)
            if (r6 == 0) goto L_0x0063
            r6 = 48000(0xbb80, float:6.7262E-41)
            goto L_0x0066
        L_0x0063:
            r6 = 44100(0xac44, float:6.1797E-41)
        L_0x0066:
            int r10 = r10.i(r2)
            if (r6 != r9) goto L_0x0076
            r9 = 13
            if (r10 != r9) goto L_0x0076
            int[] r0 = f28326a
            r10 = r0[r10]
            r8 = r10
            goto L_0x00a6
        L_0x0076:
            if (r6 != r8) goto L_0x00a5
            int[] r8 = f28326a
            int r9 = r8.length
            if (r10 >= r9) goto L_0x00a5
            r3 = r8[r10]
            int r5 = r5 % 5
            r8 = 8
            r9 = 1
            if (r5 == r9) goto L_0x009b
            r9 = 11
            if (r5 == r0) goto L_0x0096
            if (r5 == r4) goto L_0x009b
            if (r5 == r2) goto L_0x008f
            goto L_0x00a0
        L_0x008f:
            if (r10 == r4) goto L_0x00a2
            if (r10 == r8) goto L_0x00a2
            if (r10 != r9) goto L_0x00a0
            goto L_0x00a2
        L_0x0096:
            if (r10 == r8) goto L_0x00a2
            if (r10 != r9) goto L_0x00a0
            goto L_0x00a2
        L_0x009b:
            if (r10 == r4) goto L_0x00a2
            if (r10 != r8) goto L_0x00a0
            goto L_0x00a2
        L_0x00a0:
            r8 = r3
            goto L_0x00a6
        L_0x00a2:
            int r3 = r3 + 1
            goto L_0x00a0
        L_0x00a5:
            r8 = 0
        L_0x00a6:
            z4.c$b r10 = new z4.c$b
            r5 = 2
            r9 = 0
            r3 = r10
            r4 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.c.b(d5.b0):z4.c$b");
    }
}
