package o8;

import k8.e2;

/* compiled from: com.google.android.gms:play-services-measurement@@19.0.2 */
public final class h6 extends g6 {

    /* renamed from: g  reason: collision with root package name */
    public final e2 f23251g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ i6 f23252h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h6(i6 i6Var, String str, int i10, e2 e2Var) {
        super(str, i10);
        this.f23252h = i6Var;
        this.f23251g = e2Var;
    }

    public final int a() {
        return this.f23251g.s();
    }

    public final boolean b() {
        return false;
    }

    public final boolean c() {
        return true;
    }

    /* JADX WARNING: type inference failed for: r2v18, types: [java.lang.Integer] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean i(java.lang.Long r12, java.lang.Long r13, k8.r3 r14, boolean r15) {
        /*
            r11 = this;
            k8.fa.b()
            o8.i6 r0 = r11.f23252h
            com.google.android.gms.measurement.internal.l r0 = r0.f8864a
            o8.f r0 = r0.f8843g
            java.lang.String r1 = r11.f23224a
            o8.u2<java.lang.Boolean> r2 = o8.v2.W
            boolean r0 = r0.v(r1, r2)
            k8.e2 r1 = r11.f23251g
            boolean r1 = r1.y()
            k8.e2 r2 = r11.f23251g
            boolean r2 = r2.z()
            k8.e2 r3 = r11.f23251g
            boolean r3 = r3.A()
            r4 = 1
            r5 = 0
            if (r1 != 0) goto L_0x002e
            if (r2 != 0) goto L_0x002e
            if (r3 == 0) goto L_0x002c
            goto L_0x002e
        L_0x002c:
            r1 = 0
            goto L_0x002f
        L_0x002e:
            r1 = 1
        L_0x002f:
            r2 = 0
            if (r15 == 0) goto L_0x005c
            if (r1 != 0) goto L_0x005c
            o8.i6 r12 = r11.f23252h
            com.google.android.gms.measurement.internal.l r12 = r12.f8864a
            com.google.android.gms.measurement.internal.h r12 = r12.d()
            o8.a3 r12 = r12.f8805n
            int r13 = r11.f23225b
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            k8.e2 r14 = r11.f23251g
            boolean r14 = r14.B()
            if (r14 == 0) goto L_0x0056
            k8.e2 r14 = r11.f23251g
            int r14 = r14.s()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r14)
        L_0x0056:
            java.lang.String r14 = "Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID"
            r12.c(r14, r13, r2)
            return r4
        L_0x005c:
            k8.e2 r6 = r11.f23251g
            k8.y1 r6 = r6.t()
            boolean r7 = r6.y()
            boolean r8 = r14.I()
            if (r8 == 0) goto L_0x00a3
            boolean r8 = r6.A()
            if (r8 != 0) goto L_0x0091
            o8.i6 r6 = r11.f23252h
            com.google.android.gms.measurement.internal.l r6 = r6.f8864a
            com.google.android.gms.measurement.internal.h r6 = r6.d()
            o8.a3 r6 = r6.f8800i
            o8.i6 r7 = r11.f23252h
            com.google.android.gms.measurement.internal.l r7 = r7.f8864a
            o8.x2 r7 = r7.f8849m
            java.lang.String r8 = r14.x()
            java.lang.String r7 = r7.f(r8)
            java.lang.String r8 = "No number filter for long property. property"
            r6.b(r8, r7)
            goto L_0x018c
        L_0x0091:
            long r8 = r14.t()
            k8.c2 r2 = r6.u()
            java.lang.Boolean r2 = o8.g6.f(r8, r2)
            java.lang.Boolean r2 = o8.g6.h(r2, r7)
            goto L_0x018c
        L_0x00a3:
            boolean r8 = r14.H()
            if (r8 == 0) goto L_0x00e9
            boolean r8 = r6.A()
            if (r8 != 0) goto L_0x00ce
            o8.i6 r6 = r11.f23252h
            com.google.android.gms.measurement.internal.l r6 = r6.f8864a
            com.google.android.gms.measurement.internal.h r6 = r6.d()
            o8.a3 r6 = r6.f8800i
            o8.i6 r7 = r11.f23252h
            com.google.android.gms.measurement.internal.l r7 = r7.f8864a
            o8.x2 r7 = r7.f8849m
            java.lang.String r8 = r14.x()
            java.lang.String r7 = r7.f(r8)
            java.lang.String r8 = "No number filter for double property. property"
            r6.b(r8, r7)
            goto L_0x018c
        L_0x00ce:
            double r8 = r14.s()
            k8.c2 r6 = r6.u()
            java.math.BigDecimal r10 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x00e3 }
            r10.<init>(r8)     // Catch:{ NumberFormatException -> 0x00e3 }
            double r8 = java.lang.Math.ulp(r8)     // Catch:{ NumberFormatException -> 0x00e3 }
            java.lang.Boolean r2 = o8.g6.d(r10, r6, r8)     // Catch:{ NumberFormatException -> 0x00e3 }
        L_0x00e3:
            java.lang.Boolean r2 = o8.g6.h(r2, r7)
            goto L_0x018c
        L_0x00e9:
            boolean r8 = r14.K()
            if (r8 == 0) goto L_0x016f
            boolean r8 = r6.C()
            if (r8 != 0) goto L_0x0156
            boolean r8 = r6.A()
            if (r8 != 0) goto L_0x0119
            o8.i6 r6 = r11.f23252h
            com.google.android.gms.measurement.internal.l r6 = r6.f8864a
            com.google.android.gms.measurement.internal.h r6 = r6.d()
            o8.a3 r6 = r6.f8800i
            o8.i6 r7 = r11.f23252h
            com.google.android.gms.measurement.internal.l r7 = r7.f8864a
            o8.x2 r7 = r7.f8849m
            java.lang.String r8 = r14.x()
            java.lang.String r7 = r7.f(r8)
            java.lang.String r8 = "No string or number filter defined. property"
            r6.b(r8, r7)
            goto L_0x018c
        L_0x0119:
            java.lang.String r8 = r14.y()
            boolean r8 = com.google.android.gms.measurement.internal.q.N(r8)
            if (r8 == 0) goto L_0x0134
            java.lang.String r2 = r14.y()
            k8.c2 r6 = r6.u()
            java.lang.Boolean r2 = o8.g6.g(r2, r6)
            java.lang.Boolean r2 = o8.g6.h(r2, r7)
            goto L_0x018c
        L_0x0134:
            o8.i6 r6 = r11.f23252h
            com.google.android.gms.measurement.internal.l r6 = r6.f8864a
            com.google.android.gms.measurement.internal.h r6 = r6.d()
            o8.a3 r6 = r6.f8800i
            o8.i6 r7 = r11.f23252h
            com.google.android.gms.measurement.internal.l r7 = r7.f8864a
            o8.x2 r7 = r7.f8849m
            java.lang.String r8 = r14.x()
            java.lang.String r7 = r7.f(r8)
            java.lang.String r8 = r14.y()
            java.lang.String r9 = "Invalid user property value for Numeric number filter. property, value"
            r6.c(r9, r7, r8)
            goto L_0x018c
        L_0x0156:
            java.lang.String r2 = r14.y()
            k8.i2 r6 = r6.v()
            o8.i6 r8 = r11.f23252h
            com.google.android.gms.measurement.internal.l r8 = r8.f8864a
            com.google.android.gms.measurement.internal.h r8 = r8.d()
            java.lang.Boolean r2 = o8.g6.e(r2, r6, r8)
            java.lang.Boolean r2 = o8.g6.h(r2, r7)
            goto L_0x018c
        L_0x016f:
            o8.i6 r6 = r11.f23252h
            com.google.android.gms.measurement.internal.l r6 = r6.f8864a
            com.google.android.gms.measurement.internal.h r6 = r6.d()
            o8.a3 r6 = r6.f8800i
            o8.i6 r7 = r11.f23252h
            com.google.android.gms.measurement.internal.l r7 = r7.f8864a
            o8.x2 r7 = r7.f8849m
            java.lang.String r8 = r14.x()
            java.lang.String r7 = r7.f(r8)
            java.lang.String r8 = "User property has no value, property"
            r6.b(r8, r7)
        L_0x018c:
            o8.i6 r6 = r11.f23252h
            com.google.android.gms.measurement.internal.l r6 = r6.f8864a
            com.google.android.gms.measurement.internal.h r6 = r6.d()
            o8.a3 r6 = r6.f8805n
            if (r2 != 0) goto L_0x019b
            java.lang.String r7 = "null"
            goto L_0x019c
        L_0x019b:
            r7 = r2
        L_0x019c:
            java.lang.String r8 = "Property filter result"
            r6.b(r8, r7)
            if (r2 != 0) goto L_0x01a4
            return r5
        L_0x01a4:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            r11.f23226c = r5
            if (r3 == 0) goto L_0x01b2
            boolean r3 = r2.booleanValue()
            if (r3 == 0) goto L_0x01b1
            goto L_0x01b2
        L_0x01b1:
            return r4
        L_0x01b2:
            if (r15 == 0) goto L_0x01bc
            k8.e2 r15 = r11.f23251g
            boolean r15 = r15.y()
            if (r15 == 0) goto L_0x01be
        L_0x01bc:
            r11.f23227d = r2
        L_0x01be:
            boolean r15 = r2.booleanValue()
            if (r15 == 0) goto L_0x0203
            if (r1 == 0) goto L_0x0203
            boolean r15 = r14.J()
            if (r15 == 0) goto L_0x0203
            long r14 = r14.u()
            if (r12 == 0) goto L_0x01d6
            long r14 = r12.longValue()
        L_0x01d6:
            if (r0 == 0) goto L_0x01ee
            k8.e2 r12 = r11.f23251g
            boolean r12 = r12.y()
            if (r12 == 0) goto L_0x01ee
            k8.e2 r12 = r11.f23251g
            boolean r12 = r12.z()
            if (r12 != 0) goto L_0x01ee
            if (r13 == 0) goto L_0x01ee
            long r14 = r13.longValue()
        L_0x01ee:
            k8.e2 r12 = r11.f23251g
            boolean r12 = r12.z()
            if (r12 == 0) goto L_0x01fd
            java.lang.Long r12 = java.lang.Long.valueOf(r14)
            r11.f23229f = r12
            goto L_0x0203
        L_0x01fd:
            java.lang.Long r12 = java.lang.Long.valueOf(r14)
            r11.f23228e = r12
        L_0x0203:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o8.h6.i(java.lang.Long, java.lang.Long, k8.r3, boolean):boolean");
    }
}
