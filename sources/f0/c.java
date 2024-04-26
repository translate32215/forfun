package f0;

import android.util.TypedValue;

/* compiled from: ColorStateListInflaterCompat */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f18029a = new ThreadLocal<>();

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0011  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0016  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.res.ColorStateList a(android.content.res.Resources r4, org.xmlpull.v1.XmlPullParser r5, android.content.res.Resources.Theme r6) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r5)
        L_0x0004:
            int r1 = r5.next()
            r2 = 2
            if (r1 == r2) goto L_0x000f
            r3 = 1
            if (r1 == r3) goto L_0x000f
            goto L_0x0004
        L_0x000f:
            if (r1 != r2) goto L_0x0016
            android.content.res.ColorStateList r4 = b(r4, r5, r0, r6)
            return r4
        L_0x0016:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r5 = "No start tag found"
            r4.<init>(r5)
            goto L_0x001f
        L_0x001e:
            throw r4
        L_0x001f:
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.c.a(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.content.res.Resources$Theme):android.content.res.ColorStateList");
    }

    /* JADX WARNING: type inference failed for: r1v13, types: [java.lang.Object[], java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x02fb  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0316  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x032a  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x013b  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.res.ColorStateList b(android.content.res.Resources r36, org.xmlpull.v1.XmlPullParser r37, android.util.AttributeSet r38, android.content.res.Resources.Theme r39) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r0 = r36
            r1 = r38
            r2 = r39
            java.lang.String r3 = r37.getName()
            java.lang.String r4 = "selector"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L_0x0378
            int r3 = r37.getDepth()
            r4 = 1
            int r3 = r3 + r4
            r5 = 20
            int[][] r6 = new int[r5][]
            int[] r5 = new int[r5]
            r7 = 0
            r8 = 0
        L_0x0020:
            int r9 = r37.next()
            if (r9 == r4) goto L_0x0366
            int r10 = r37.getDepth()
            r11 = 3
            if (r10 >= r3) goto L_0x002f
            if (r9 == r11) goto L_0x0366
        L_0x002f:
            r12 = 2
            if (r9 != r12) goto L_0x0354
            if (r10 > r3) goto L_0x0354
            java.lang.String r9 = r37.getName()
            java.lang.String r10 = "item"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x0042
            goto L_0x0354
        L_0x0042:
            int[] r9 = b0.a.f3339a
            if (r2 != 0) goto L_0x004b
            android.content.res.TypedArray r9 = r0.obtainAttributes(r1, r9)
            goto L_0x004f
        L_0x004b:
            android.content.res.TypedArray r9 = r2.obtainStyledAttributes(r1, r9, r7, r7)
        L_0x004f:
            r10 = -1
            int r13 = r9.getResourceId(r7, r10)
            r14 = 31
            r15 = -65281(0xffffffffffff00ff, float:NaN)
            if (r13 == r10) goto L_0x0092
            java.lang.ThreadLocal<android.util.TypedValue> r10 = f18029a
            java.lang.Object r16 = r10.get()
            android.util.TypedValue r16 = (android.util.TypedValue) r16
            if (r16 != 0) goto L_0x006e
            android.util.TypedValue r12 = new android.util.TypedValue
            r12.<init>()
            r10.set(r12)
            goto L_0x0070
        L_0x006e:
            r12 = r16
        L_0x0070:
            r0.getValue(r13, r12, r4)
            int r10 = r12.type
            r12 = 28
            if (r10 < r12) goto L_0x007d
            if (r10 > r14) goto L_0x007d
            r10 = 1
            goto L_0x007e
        L_0x007d:
            r10 = 0
        L_0x007e:
            if (r10 != 0) goto L_0x0092
            android.content.res.XmlResourceParser r10 = r0.getXml(r13)     // Catch:{ Exception -> 0x008d }
            android.content.res.ColorStateList r10 = a(r0, r10, r2)     // Catch:{ Exception -> 0x008d }
            int r10 = r10.getDefaultColor()     // Catch:{ Exception -> 0x008d }
            goto L_0x0096
        L_0x008d:
            int r10 = r9.getColor(r7, r15)
            goto L_0x0096
        L_0x0092:
            int r10 = r9.getColor(r7, r15)
        L_0x0096:
            boolean r12 = r9.hasValue(r4)
            r13 = 1065353216(0x3f800000, float:1.0)
            if (r12 == 0) goto L_0x00a3
            float r11 = r9.getFloat(r4, r13)
            goto L_0x00b0
        L_0x00a3:
            boolean r12 = r9.hasValue(r11)
            if (r12 == 0) goto L_0x00ae
            float r11 = r9.getFloat(r11, r13)
            goto L_0x00b0
        L_0x00ae:
            r11 = 1065353216(0x3f800000, float:1.0)
        L_0x00b0:
            int r12 = android.os.Build.VERSION.SDK_INT
            r15 = -1082130432(0xffffffffbf800000, float:-1.0)
            r4 = 4
            if (r12 < r14) goto L_0x00c3
            r12 = 2
            boolean r14 = r9.hasValue(r12)
            if (r14 == 0) goto L_0x00c3
            float r14 = r9.getFloat(r12, r15)
            goto L_0x00c7
        L_0x00c3:
            float r14 = r9.getFloat(r4, r15)
        L_0x00c7:
            r9.recycle()
            int r9 = r38.getAttributeCount()
            int[] r12 = new int[r9]
            r4 = 0
            r15 = 0
        L_0x00d2:
            if (r15 >= r9) goto L_0x0102
            int r13 = r1.getAttributeNameResource(r15)
            r7 = 16843173(0x10101a5, float:2.3694738E-38)
            if (r13 == r7) goto L_0x00fa
            r7 = 16843551(0x101031f, float:2.3695797E-38)
            if (r13 == r7) goto L_0x00fa
            r7 = 2130968629(0x7f040035, float:1.7545917E38)
            if (r13 == r7) goto L_0x00fa
            r7 = 2130969261(0x7f0402ad, float:1.7547199E38)
            if (r13 == r7) goto L_0x00fa
            int r7 = r4 + 1
            r0 = 0
            boolean r19 = r1.getAttributeBooleanValue(r15, r0)
            if (r19 == 0) goto L_0x00f6
            goto L_0x00f7
        L_0x00f6:
            int r13 = -r13
        L_0x00f7:
            r12[r4] = r13
            r4 = r7
        L_0x00fa:
            int r15 = r15 + 1
            r0 = r36
            r7 = 0
            r13 = 1065353216(0x3f800000, float:1.0)
            goto L_0x00d2
        L_0x0102:
            int[] r0 = android.util.StateSet.trimStateSet(r12, r4)
            r4 = 1120403456(0x42c80000, float:100.0)
            r7 = 0
            int r9 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r9 < 0) goto L_0x0113
            int r9 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r9 > 0) goto L_0x0113
            r9 = 1
            goto L_0x0114
        L_0x0113:
            r9 = 0
        L_0x0114:
            r12 = 1065353216(0x3f800000, float:1.0)
            int r13 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r13 != 0) goto L_0x0127
            if (r9 != 0) goto L_0x0127
            r34 = r0
            r31 = r3
            r13 = r5
            r28 = r8
            r16 = 1
            goto L_0x030c
        L_0x0127:
            int r12 = android.graphics.Color.alpha(r10)
            float r12 = (float) r12
            float r12 = r12 * r11
            r11 = 1056964608(0x3f000000, float:0.5)
            float r12 = r12 + r11
            int r11 = (int) r12
            r12 = 255(0xff, float:3.57E-43)
            r13 = 0
            int r11 = b8.a.c(r11, r13, r12)
            if (r9 == 0) goto L_0x02fb
            f0.a r9 = f0.a.a(r10)
            float r10 = r9.f18019a
            float r9 = r9.f18020b
            f0.n r12 = f0.n.f18063k
            r13 = r5
            double r4 = (double) r9
            r19 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r21 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1))
            if (r21 < 0) goto L_0x02ee
            int r4 = java.lang.Math.round(r14)
            double r4 = (double) r4
            r19 = 0
            int r21 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1))
            if (r21 <= 0) goto L_0x02ee
            int r4 = java.lang.Math.round(r14)
            double r4 = (double) r4
            r19 = 4636737291354636288(0x4059000000000000, double:100.0)
            int r21 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1))
            if (r21 < 0) goto L_0x0165
            goto L_0x02ee
        L_0x0165:
            int r4 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r4 >= 0) goto L_0x016b
            r4 = 0
            goto L_0x0171
        L_0x016b:
            r4 = 1135869952(0x43b40000, float:360.0)
            float r4 = java.lang.Math.min(r4, r10)
        L_0x0171:
            r10 = r9
            r5 = 0
            r19 = 1
            r20 = 0
        L_0x0177:
            float r22 = r20 - r9
            float r22 = java.lang.Math.abs(r22)
            r23 = 1053609165(0x3ecccccd, float:0.4)
            int r22 = (r22 > r23 ? 1 : (r22 == r23 ? 0 : -1))
            if (r22 < 0) goto L_0x02da
            r22 = 1148846080(0x447a0000, float:1000.0)
            r23 = 1148846080(0x447a0000, float:1000.0)
            r24 = 0
            r25 = 1120403456(0x42c80000, float:100.0)
            r26 = 0
        L_0x018e:
            float r27 = r24 - r25
            float r27 = java.lang.Math.abs(r27)
            r28 = 1008981770(0x3c23d70a, float:0.01)
            r29 = 1073741824(0x40000000, float:2.0)
            int r27 = (r27 > r28 ? 1 : (r27 == r28 ? 0 : -1))
            if (r27 <= 0) goto L_0x028c
            float r27 = r25 - r24
            float r27 = r27 / r29
            float r15 = r27 + r24
            f0.a r7 = f0.a.b(r15, r10, r4)
            f0.n r1 = f0.n.f18063k
            int r1 = r7.c(r1)
            int r7 = android.graphics.Color.red(r1)
            float r7 = f0.b.b(r7)
            int r30 = android.graphics.Color.green(r1)
            float r30 = f0.b.b(r30)
            int r31 = android.graphics.Color.blue(r1)
            float r31 = f0.b.b(r31)
            float[][] r32 = f0.b.f18028d
            r16 = 1
            r33 = r32[r16]
            r18 = 0
            r33 = r33[r18]
            float r7 = r7 * r33
            r33 = r32[r16]
            r33 = r33[r16]
            float r30 = r30 * r33
            float r30 = r30 + r7
            r7 = r32[r16]
            r17 = 2
            r7 = r7[r17]
            float r31 = r31 * r7
            float r31 = r31 + r30
            r7 = 1120403456(0x42c80000, float:100.0)
            float r2 = r31 / r7
            r28 = 1007753895(0x3c111aa7, float:0.008856452)
            int r28 = (r2 > r28 ? 1 : (r2 == r28 ? 0 : -1))
            if (r28 > 0) goto L_0x01f6
            r28 = 1147261687(0x4461d2f7, float:903.2963)
            float r2 = r2 * r28
            r28 = r8
            goto L_0x0205
        L_0x01f6:
            r28 = r8
            double r7 = (double) r2
            double r7 = java.lang.Math.cbrt(r7)
            float r2 = (float) r7
            r7 = 1122500608(0x42e80000, float:116.0)
            float r2 = r2 * r7
            r7 = 1098907648(0x41800000, float:16.0)
            float r2 = r2 - r7
        L_0x0205:
            float r7 = r14 - r2
            float r7 = java.lang.Math.abs(r7)
            r8 = 1045220557(0x3e4ccccd, float:0.2)
            int r8 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r8 >= 0) goto L_0x0262
            f0.a r1 = f0.a.a(r1)
            float r8 = r1.f18021c
            r31 = r3
            float r3 = r1.f18020b
            f0.a r3 = f0.a.b(r8, r3, r4)
            float r8 = r1.f18022d
            r32 = r4
            float r4 = r3.f18022d
            float r8 = r8 - r4
            float r4 = r1.f18023e
            r33 = r7
            float r7 = r3.f18023e
            float r4 = r4 - r7
            float r7 = r1.f18024f
            float r3 = r3.f18024f
            float r7 = r7 - r3
            float r8 = r8 * r8
            float r4 = r4 * r4
            float r4 = r4 + r8
            float r7 = r7 * r7
            float r7 = r7 + r4
            double r3 = (double) r7
            double r3 = java.lang.Math.sqrt(r3)
            r7 = 4609028894647239311(0x3ff68f5c28f5c28f, double:1.41)
            r34 = r0
            r35 = r1
            r0 = 4603849755075763241(0x3fe428f5c28f5c29, double:0.63)
            double r0 = java.lang.Math.pow(r3, r0)
            double r0 = r0 * r7
            float r0 = (float) r0
            r1 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r3 > 0) goto L_0x026a
            r23 = r0
            r22 = r33
            r26 = r35
            goto L_0x026a
        L_0x0262:
            r34 = r0
            r31 = r3
            r32 = r4
            r1 = 1065353216(0x3f800000, float:1.0)
        L_0x026a:
            r0 = 0
            int r3 = (r22 > r0 ? 1 : (r22 == r0 ? 0 : -1))
            if (r3 != 0) goto L_0x0274
            int r3 = (r23 > r0 ? 1 : (r23 == r0 ? 0 : -1))
            if (r3 != 0) goto L_0x0274
            goto L_0x029b
        L_0x0274:
            int r2 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r2 >= 0) goto L_0x027b
            r24 = r15
            goto L_0x027d
        L_0x027b:
            r25 = r15
        L_0x027d:
            r1 = r38
            r2 = r39
            r8 = r28
            r3 = r31
            r4 = r32
            r0 = r34
            r7 = 0
            goto L_0x018e
        L_0x028c:
            r34 = r0
            r31 = r3
            r32 = r4
            r28 = r8
            r0 = 0
            r1 = 1065353216(0x3f800000, float:1.0)
            r16 = 1
            r17 = 2
        L_0x029b:
            r2 = r26
            if (r19 == 0) goto L_0x02be
            if (r2 == 0) goto L_0x02a7
            int r10 = r2.c(r12)
            goto L_0x0304
        L_0x02a7:
            float r2 = r9 - r20
            float r2 = r2 / r29
            float r10 = r2 + r20
            r1 = r38
            r2 = r39
            r8 = r28
            r3 = r31
            r4 = r32
            r0 = r34
            r7 = 0
            r19 = 0
            goto L_0x0177
        L_0x02be:
            if (r2 != 0) goto L_0x02c2
            r9 = r10
            goto L_0x02c5
        L_0x02c2:
            r5 = r2
            r20 = r10
        L_0x02c5:
            float r2 = r9 - r20
            float r2 = r2 / r29
            float r10 = r2 + r20
            r1 = r38
            r2 = r39
            r8 = r28
            r3 = r31
            r4 = r32
            r0 = r34
            r7 = 0
            goto L_0x0177
        L_0x02da:
            r34 = r0
            r31 = r3
            r28 = r8
            r16 = 1
            if (r5 != 0) goto L_0x02e9
            int r10 = f0.b.a(r14)
            goto L_0x0304
        L_0x02e9:
            int r10 = r5.c(r12)
            goto L_0x0304
        L_0x02ee:
            r34 = r0
            r31 = r3
            r28 = r8
            r16 = 1
            int r10 = f0.b.a(r14)
            goto L_0x0304
        L_0x02fb:
            r34 = r0
            r31 = r3
            r13 = r5
            r28 = r8
            r16 = 1
        L_0x0304:
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            r0 = r0 & r10
            int r1 = r11 << 24
            r10 = r0 | r1
        L_0x030c:
            int r0 = r28 + 1
            r5 = r13
            int r1 = r5.length
            r2 = 8
            r7 = r28
            if (r0 <= r1) goto L_0x0325
            r1 = 4
            if (r7 > r1) goto L_0x031c
            r8 = 8
            goto L_0x031e
        L_0x031c:
            int r8 = r7 * 2
        L_0x031e:
            int[] r1 = new int[r8]
            r3 = 0
            java.lang.System.arraycopy(r5, r3, r1, r3, r7)
            r5 = r1
        L_0x0325:
            r5[r7] = r10
            int r1 = r6.length
            if (r0 <= r1) goto L_0x0343
            java.lang.Class r1 = r6.getClass()
            java.lang.Class r1 = r1.getComponentType()
            r3 = 4
            if (r7 > r3) goto L_0x0336
            goto L_0x0338
        L_0x0336:
            int r2 = r7 * 2
        L_0x0338:
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r2)
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            r2 = 0
            java.lang.System.arraycopy(r6, r2, r1, r2, r7)
            r6 = r1
        L_0x0343:
            r6[r7] = r34
            int[][] r6 = (int[][]) r6
            r1 = r38
            r2 = r39
            r8 = r0
            r3 = r31
            r4 = 1
            r7 = 0
            r0 = r36
            goto L_0x0020
        L_0x0354:
            r31 = r3
            r7 = r8
            r16 = 1
            r0 = r36
            r1 = r38
            r2 = r39
            r8 = r7
            r3 = r31
            r4 = 1
            r7 = 0
            goto L_0x0020
        L_0x0366:
            r7 = r8
            int[] r0 = new int[r7]
            int[][] r1 = new int[r7][]
            r2 = 0
            java.lang.System.arraycopy(r5, r2, r0, r2, r7)
            java.lang.System.arraycopy(r6, r2, r1, r2, r7)
            android.content.res.ColorStateList r2 = new android.content.res.ColorStateList
            r2.<init>(r1, r0)
            return r2
        L_0x0378:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r37.getPositionDescription()
            r1.append(r2)
            java.lang.String r2 = ": invalid color state list tag "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            goto L_0x0397
        L_0x0396:
            throw r0
        L_0x0397:
            goto L_0x0396
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.c.b(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):android.content.res.ColorStateList");
    }
}
