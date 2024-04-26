package d5;

import com.startapp.b4;
import v6.v;

/* compiled from: FlacFrameReader */
public final class p {

    /* compiled from: FlacFrameReader */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public long f13038a;
    }

    public static boolean a(v vVar, s sVar, boolean z10, a aVar) {
        try {
            long y10 = vVar.y();
            if (!z10) {
                y10 *= (long) sVar.f13042b;
            }
            aVar.f13038a = y10;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x008e, code lost:
        if (r7 == r1.f13046f) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x009b, code lost:
        if ((r17.s() * 1000) == r3) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00aa, code lost:
        if (r4 == r3) goto L_0x00ac;
     */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean b(v6.v r17, d5.s r18, int r19, d5.p.a r20) {
        /*
            r0 = r17
            r1 = r18
            int r2 = r0.f26519b
            long r3 = r17.t()
            r5 = 16
            long r5 = r3 >>> r5
            r7 = r19
            long r7 = (long) r7
            r9 = 0
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 == 0) goto L_0x0017
            return r9
        L_0x0017:
            r7 = 1
            long r5 = r5 & r7
            r10 = 1
            int r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r11 != 0) goto L_0x0021
            r5 = 1
            goto L_0x0022
        L_0x0021:
            r5 = 0
        L_0x0022:
            r6 = 12
            long r11 = r3 >> r6
            r13 = 15
            long r11 = r11 & r13
            int r12 = (int) r11
            r11 = 8
            long r15 = r3 >> r11
            long r6 = r15 & r13
            int r7 = (int) r6
            r6 = 4
            long r15 = r3 >> r6
            long r13 = r13 & r15
            int r6 = (int) r13
            long r13 = r3 >> r10
            r15 = 7
            long r13 = r13 & r15
            int r8 = (int) r13
            r13 = 1
            long r3 = r3 & r13
            int r11 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r11 != 0) goto L_0x0045
            r3 = 1
            goto L_0x0046
        L_0x0045:
            r3 = 0
        L_0x0046:
            r4 = 7
            if (r6 > r4) goto L_0x004f
            int r4 = r1.f13047g
            int r4 = r4 - r10
            if (r6 != r4) goto L_0x005a
            goto L_0x0058
        L_0x004f:
            r4 = 10
            if (r6 > r4) goto L_0x005a
            int r4 = r1.f13047g
            r6 = 2
            if (r4 != r6) goto L_0x005a
        L_0x0058:
            r4 = 1
            goto L_0x005b
        L_0x005a:
            r4 = 0
        L_0x005b:
            if (r4 == 0) goto L_0x00d3
            if (r8 != 0) goto L_0x0060
            goto L_0x0064
        L_0x0060:
            int r4 = r1.f13049i
            if (r8 != r4) goto L_0x0066
        L_0x0064:
            r4 = 1
            goto L_0x0067
        L_0x0066:
            r4 = 0
        L_0x0067:
            if (r4 == 0) goto L_0x00d3
            if (r3 != 0) goto L_0x00d3
            r3 = r20
            boolean r3 = a(r0, r1, r5, r3)
            if (r3 == 0) goto L_0x00d3
            int r3 = c(r0, r12)
            r4 = -1
            if (r3 == r4) goto L_0x0080
            int r4 = r1.f13042b
            if (r3 > r4) goto L_0x0080
            r3 = 1
            goto L_0x0081
        L_0x0080:
            r3 = 0
        L_0x0081:
            if (r3 == 0) goto L_0x00d3
            int r3 = r1.f13045e
            if (r7 != 0) goto L_0x0088
            goto L_0x00ac
        L_0x0088:
            r4 = 11
            if (r7 > r4) goto L_0x0091
            int r1 = r1.f13046f
            if (r7 != r1) goto L_0x00ae
            goto L_0x00ac
        L_0x0091:
            r1 = 12
            if (r7 != r1) goto L_0x009e
            int r1 = r17.s()
            int r1 = r1 * 1000
            if (r1 != r3) goto L_0x00ae
            goto L_0x00ac
        L_0x009e:
            r1 = 14
            if (r7 > r1) goto L_0x00ae
            int r4 = r17.x()
            if (r7 != r1) goto L_0x00aa
            int r4 = r4 * 10
        L_0x00aa:
            if (r4 != r3) goto L_0x00ae
        L_0x00ac:
            r1 = 1
            goto L_0x00af
        L_0x00ae:
            r1 = 0
        L_0x00af:
            if (r1 == 0) goto L_0x00d3
            int r1 = r17.s()
            int r3 = r0.f26519b
            byte[] r0 = r0.f26518a
            int r3 = r3 - r10
            int r4 = v6.e0.f26436a
            r4 = 0
        L_0x00bd:
            if (r2 >= r3) goto L_0x00cb
            int[] r5 = v6.e0.f26449n
            byte r6 = r0[r2]
            r6 = r6 & 255(0xff, float:3.57E-43)
            r4 = r4 ^ r6
            r4 = r5[r4]
            int r2 = r2 + 1
            goto L_0x00bd
        L_0x00cb:
            if (r1 != r4) goto L_0x00cf
            r0 = 1
            goto L_0x00d0
        L_0x00cf:
            r0 = 0
        L_0x00d0:
            if (r0 == 0) goto L_0x00d3
            r9 = 1
        L_0x00d3:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: d5.p.b(v6.v, d5.s, int, d5.p$a):boolean");
    }

    public static int c(v vVar, int i10) {
        switch (i10) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i10 - 2);
            case 6:
                return vVar.s() + 1;
            case 7:
                return vVar.x() + 1;
            case b4.f10106f:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i10 - 8);
            default:
                return -1;
        }
    }
}
