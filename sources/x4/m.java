package x4;

import z5.p;

/* compiled from: ExoPlaybackException */
public final class m extends Exception {

    /* renamed from: a  reason: collision with root package name */
    public final int f27668a;

    /* renamed from: b  reason: collision with root package name */
    public final String f27669b;

    /* renamed from: c  reason: collision with root package name */
    public final int f27670c;

    /* renamed from: d  reason: collision with root package name */
    public final b0 f27671d;

    /* renamed from: e  reason: collision with root package name */
    public final int f27672e;

    /* renamed from: f  reason: collision with root package name */
    public final long f27673f;

    /* renamed from: g  reason: collision with root package name */
    public final p f27674g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f27675h;

    /* renamed from: i  reason: collision with root package name */
    public final Throwable f27676i;

    public m(int i10, Throwable th) {
        this(i10, th, (String) null, (String) null, -1, (b0) null, 4, false);
    }

    public static m b(Exception exc) {
        return new m(1, exc, (String) null, (String) null, -1, (b0) null, 4, false);
    }

    public m a(p pVar) {
        return new m(getMessage(), this.f27676i, this.f27668a, this.f27669b, this.f27670c, this.f27671d, this.f27672e, pVar, this.f27673f, this.f27675h);
    }

    public m(String str, Throwable th, int i10, String str2, int i11, b0 b0Var, int i12, p pVar, long j10, boolean z10) {
        super(str, th);
        this.f27668a = i10;
        this.f27676i = th;
        this.f27669b = str2;
        this.f27670c = i11;
        this.f27671d = b0Var;
        this.f27672e = i12;
        this.f27674g = pVar;
        this.f27673f = j10;
        this.f27675h = z10;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public m(int r13, java.lang.Throwable r14, java.lang.String r15, java.lang.String r16, int r17, x4.b0 r18, int r19, boolean r20) {
        /*
            r12 = this;
            r3 = r13
            if (r3 == 0) goto L_0x0044
            r0 = 1
            if (r3 == r0) goto L_0x0015
            r0 = 3
            if (r3 == r0) goto L_0x000c
            java.lang.String r0 = "Unexpected runtime error"
            goto L_0x000e
        L_0x000c:
            java.lang.String r0 = "Remote error"
        L_0x000e:
            r4 = r16
            r5 = r17
            r6 = r18
            goto L_0x004c
        L_0x0015:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r4 = r16
            r0.append(r4)
            java.lang.String r1 = " error, index="
            r0.append(r1)
            r5 = r17
            r0.append(r5)
            java.lang.String r1 = ", format="
            r0.append(r1)
            r6 = r18
            r0.append(r6)
            java.lang.String r1 = ", format_supported="
            r0.append(r1)
            java.lang.String r1 = x4.f.a(r19)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            goto L_0x004c
        L_0x0044:
            r4 = r16
            r5 = r17
            r6 = r18
            java.lang.String r0 = "Source error"
        L_0x004c:
            r1 = 0
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x0059
            java.lang.String r2 = ": "
            java.lang.String r0 = q.b.a(r0, r2, r1)
        L_0x0059:
            r1 = r0
            r8 = 0
            long r9 = android.os.SystemClock.elapsedRealtime()
            r0 = r12
            r2 = r14
            r3 = r13
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r11 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x4.m.<init>(int, java.lang.Throwable, java.lang.String, java.lang.String, int, x4.b0, int, boolean):void");
    }
}
