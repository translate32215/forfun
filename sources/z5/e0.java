package z5;

import android.net.Uri;
import v6.a;
import x4.c1;
import x4.e0;

/* compiled from: SinglePeriodTimeline */
public final class e0 extends c1 {

    /* renamed from: m  reason: collision with root package name */
    public static final Object f28561m = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final long f28562b;

    /* renamed from: c  reason: collision with root package name */
    public final long f28563c;

    /* renamed from: d  reason: collision with root package name */
    public final long f28564d;

    /* renamed from: e  reason: collision with root package name */
    public final long f28565e;

    /* renamed from: f  reason: collision with root package name */
    public final long f28566f;

    /* renamed from: g  reason: collision with root package name */
    public final long f28567g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f28568h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f28569i;

    /* renamed from: j  reason: collision with root package name */
    public final Object f28570j;

    /* renamed from: k  reason: collision with root package name */
    public final x4.e0 f28571k;

    /* renamed from: l  reason: collision with root package name */
    public final e0.f f28572l;

    static {
        e0.c cVar = new e0.c();
        cVar.f27510a = "SinglePeriodTimeline";
        cVar.f27511b = Uri.EMPTY;
        cVar.a();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public e0(long j10, long j11, long j12, long j13, boolean z10, boolean z11, boolean z12, Object obj, x4.e0 e0Var) {
        this(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j10, j11, j12, j13, z10, z11, obj, e0Var, z12 ? e0Var.f27505c : null);
    }

    public int b(Object obj) {
        return f28561m.equals(obj) ? 0 : -1;
    }

    public c1.b g(int i10, c1.b bVar, boolean z10) {
        a.c(i10, 0, 1);
        bVar.f((Object) null, z10 ? f28561m : null, 0, this.f28564d, -this.f28566f);
        return bVar;
    }

    public int i() {
        return 1;
    }

    public Object m(int i10) {
        a.c(i10, 0, 1);
        return f28561m;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0025, code lost:
        if (r1 > r5) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public x4.c1.c o(int r25, x4.c1.c r26, long r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = 0
            r2 = 1
            r3 = r25
            v6.a.c(r3, r1, r2)
            long r1 = r0.f28567g
            boolean r14 = r0.f28569i
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r14 == 0) goto L_0x002a
            r5 = 0
            int r7 = (r27 > r5 ? 1 : (r27 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x002a
            long r5 = r0.f28565e
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 != 0) goto L_0x0021
            goto L_0x0027
        L_0x0021:
            long r1 = r1 + r27
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x002a
        L_0x0027:
            r16 = r3
            goto L_0x002c
        L_0x002a:
            r16 = r1
        L_0x002c:
            java.lang.Object r4 = x4.c1.c.f27468r
            x4.e0 r5 = r0.f28571k
            java.lang.Object r6 = r0.f28570j
            long r7 = r0.f28562b
            long r9 = r0.f28563c
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            boolean r13 = r0.f28568h
            x4.e0$f r15 = r0.f28572l
            long r1 = r0.f28565e
            r18 = r1
            r20 = 0
            r21 = 0
            long r1 = r0.f28566f
            r22 = r1
            r3 = r26
            r3.d(r4, r5, r6, r7, r9, r11, r13, r14, r15, r16, r18, r20, r21, r22)
            return r26
        */
        throw new UnsupportedOperationException("Method not decompiled: z5.e0.o(int, x4.c1$c, long):x4.c1$c");
    }

    public int p() {
        return 1;
    }

    public e0(long j10, long j11, long j12, long j13, long j14, long j15, long j16, boolean z10, boolean z11, Object obj, x4.e0 e0Var, e0.f fVar) {
        this.f28562b = j10;
        this.f28563c = j11;
        this.f28564d = j13;
        this.f28565e = j14;
        this.f28566f = j15;
        this.f28567g = j16;
        this.f28568h = z10;
        this.f28569i = z11;
        this.f28570j = obj;
        e0Var.getClass();
        this.f28571k = e0Var;
        this.f28572l = fVar;
    }
}
