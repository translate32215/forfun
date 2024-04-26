package e8;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public abstract class gc0 {

    /* renamed from: a  reason: collision with root package name */
    public static final gc0 f14764a = new fc0();

    public final boolean a() {
        return g() == 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        if ((g() - 1) == 0) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int b(int r3, e8.ic0 r4, e8.hc0 r5, int r6) {
        /*
            r2 = this;
            r0 = 0
            r2.e(r3, r4, r0)
            r2.c(r0, r5)
            r4 = 1
            if (r3 != 0) goto L_0x0031
            r3 = -1
            if (r6 == 0) goto L_0x0022
            if (r6 == r4) goto L_0x0020
            r1 = 2
            if (r6 != r1) goto L_0x001a
            int r6 = r2.g()
            int r6 = r6 - r4
            if (r6 != 0) goto L_0x002a
            goto L_0x0020
        L_0x001a:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            r3.<init>()
            throw r3
        L_0x0020:
            r4 = 0
            goto L_0x002a
        L_0x0022:
            int r6 = r2.g()
            int r6 = r6 - r4
            if (r6 != 0) goto L_0x002a
            r4 = -1
        L_0x002a:
            if (r4 != r3) goto L_0x002d
            return r3
        L_0x002d:
            r2.c(r4, r5)
            return r0
        L_0x0031:
            int r3 = r3 + r4
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: e8.gc0.b(int, e8.ic0, e8.hc0, int):int");
    }

    public final hc0 c(int i10, hc0 hc0) {
        return d(i10, hc0, false, 0);
    }

    public abstract hc0 d(int i10, hc0 hc0, boolean z10, long j10);

    public abstract ic0 e(int i10, ic0 ic0, boolean z10);

    public abstract int f(Object obj);

    public abstract int g();

    public abstract int h();
}
