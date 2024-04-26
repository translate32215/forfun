package f0;

import android.content.res.ColorStateList;
import android.graphics.Shader;

/* compiled from: ComplexColorCompat */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final Shader f18030a;

    /* renamed from: b  reason: collision with root package name */
    public final ColorStateList f18031b;

    /* renamed from: c  reason: collision with root package name */
    public int f18032c;

    public d(Shader shader, ColorStateList colorStateList, int i10) {
        this.f18030a = shader;
        this.f18031b = colorStateList;
        this.f18032c = i10;
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [android.graphics.Shader] */
    /* JADX WARNING: type inference failed for: r16v2, types: [android.graphics.RadialGradient] */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r11v7, types: [android.graphics.LinearGradient] */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01c4, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r2.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static f0.d a(android.content.res.Resources r29, int r30, android.content.res.Resources.Theme r31) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        /*
            r0 = r29
            r1 = r31
            android.content.res.XmlResourceParser r2 = r29.getXml(r30)
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r2)
        L_0x000c:
            int r4 = r2.next()
            r5 = 2
            r6 = 1
            if (r4 == r5) goto L_0x0017
            if (r4 == r6) goto L_0x0017
            goto L_0x000c
        L_0x0017:
            if (r4 != r5) goto L_0x027d
            java.lang.String r4 = r2.getName()
            r4.getClass()
            java.lang.String r7 = "gradient"
            boolean r8 = r4.equals(r7)
            r9 = 0
            if (r8 != 0) goto L_0x005d
            java.lang.String r5 = "selector"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x003f
            android.content.res.ColorStateList r0 = f0.c.b(r0, r2, r3, r1)
            f0.d r1 = new f0.d
            int r2 = r0.getDefaultColor()
            r1.<init>(r9, r0, r2)
            return r1
        L_0x003f:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r2.getPositionDescription()
            r1.append(r2)
            java.lang.String r2 = ": unsupported complex color tag "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x005d:
            java.lang.String r4 = r2.getName()
            boolean r7 = r4.equals(r7)
            if (r7 == 0) goto L_0x025f
            int[] r4 = b0.a.f3342d
            android.content.res.TypedArray r4 = f0.m.d(r0, r1, r3, r4)
            r7 = 8
            java.lang.String r8 = "startX"
            boolean r8 = f0.m.c(r2, r8)
            r10 = 0
            if (r8 != 0) goto L_0x007a
            r12 = 0
            goto L_0x007f
        L_0x007a:
            float r7 = r4.getFloat(r7, r10)
            r12 = r7
        L_0x007f:
            r7 = 9
            java.lang.String r8 = "startY"
            boolean r8 = f0.m.c(r2, r8)
            if (r8 != 0) goto L_0x008b
            r13 = 0
            goto L_0x0090
        L_0x008b:
            float r7 = r4.getFloat(r7, r10)
            r13 = r7
        L_0x0090:
            r7 = 10
            java.lang.String r8 = "endX"
            boolean r8 = f0.m.c(r2, r8)
            if (r8 != 0) goto L_0x009c
            r14 = 0
            goto L_0x00a1
        L_0x009c:
            float r7 = r4.getFloat(r7, r10)
            r14 = r7
        L_0x00a1:
            r7 = 11
            java.lang.String r8 = "endY"
            boolean r8 = f0.m.c(r2, r8)
            if (r8 != 0) goto L_0x00ad
            r15 = 0
            goto L_0x00b2
        L_0x00ad:
            float r7 = r4.getFloat(r7, r10)
            r15 = r7
        L_0x00b2:
            java.lang.String r7 = "centerX"
            boolean r7 = f0.m.c(r2, r7)
            r8 = 3
            if (r7 != 0) goto L_0x00bd
            r7 = 0
            goto L_0x00c1
        L_0x00bd:
            float r7 = r4.getFloat(r8, r10)
        L_0x00c1:
            r11 = 4
            java.lang.String r9 = "centerY"
            boolean r9 = f0.m.c(r2, r9)
            if (r9 != 0) goto L_0x00cc
            r9 = 0
            goto L_0x00d0
        L_0x00cc:
            float r9 = r4.getFloat(r11, r10)
        L_0x00d0:
            java.lang.String r11 = "type"
            boolean r11 = f0.m.c(r2, r11)
            r8 = 0
            if (r11 != 0) goto L_0x00db
            r11 = 0
            goto L_0x00df
        L_0x00db:
            int r11 = r4.getInt(r5, r8)
        L_0x00df:
            java.lang.String r5 = "startColor"
            boolean r5 = f0.m.c(r2, r5)
            if (r5 != 0) goto L_0x00e9
            r5 = 0
            goto L_0x00ed
        L_0x00e9:
            int r5 = r4.getColor(r8, r8)
        L_0x00ed:
            java.lang.String r10 = "centerColor"
            boolean r19 = f0.m.c(r2, r10)
            r6 = 7
            boolean r10 = f0.m.c(r2, r10)
            if (r10 != 0) goto L_0x00fc
            r6 = 0
            goto L_0x0100
        L_0x00fc:
            int r6 = r4.getColor(r6, r8)
        L_0x0100:
            java.lang.String r10 = "endColor"
            boolean r10 = f0.m.c(r2, r10)
            if (r10 != 0) goto L_0x010a
            r10 = 0
            goto L_0x0111
        L_0x010a:
            r10 = 1
            int r21 = r4.getColor(r10, r8)
            r10 = r21
        L_0x0111:
            java.lang.String r8 = "tileMode"
            boolean r8 = f0.m.c(r2, r8)
            if (r8 != 0) goto L_0x011d
            r21 = r7
            r7 = 0
            goto L_0x0126
        L_0x011d:
            r21 = r7
            r7 = 0
            r8 = 6
            int r8 = r4.getInt(r8, r7)
            r7 = r8
        L_0x0126:
            java.lang.String r8 = "gradientRadius"
            boolean r8 = f0.m.c(r2, r8)
            if (r8 != 0) goto L_0x0132
            r22 = r9
            r8 = 0
            goto L_0x013a
        L_0x0132:
            r8 = 5
            r22 = r9
            r9 = 0
            float r8 = r4.getFloat(r8, r9)
        L_0x013a:
            r4.recycle()
            int r4 = r2.getDepth()
            r9 = 1
            int r4 = r4 + r9
            java.util.ArrayList r9 = new java.util.ArrayList
            r23 = r8
            r8 = 20
            r9.<init>(r8)
            r24 = r15
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>(r8)
        L_0x0153:
            int r8 = r2.next()
            r25 = r14
            r14 = 1
            if (r8 == r14) goto L_0x01ca
            int r14 = r2.getDepth()
            r26 = r13
            if (r14 >= r4) goto L_0x0167
            r13 = 3
            if (r8 == r13) goto L_0x01cc
        L_0x0167:
            r13 = 2
            if (r8 == r13) goto L_0x016b
            goto L_0x01c5
        L_0x016b:
            if (r14 > r4) goto L_0x01c5
            java.lang.String r8 = r2.getName()
            java.lang.String r13 = "item"
            boolean r8 = r8.equals(r13)
            if (r8 != 0) goto L_0x017a
            goto L_0x01c5
        L_0x017a:
            int[] r8 = b0.a.f3343e
            android.content.res.TypedArray r8 = f0.m.d(r0, r1, r3, r8)
            r13 = 0
            boolean r14 = r8.hasValue(r13)
            r13 = 1
            boolean r20 = r8.hasValue(r13)
            if (r14 == 0) goto L_0x01aa
            if (r20 == 0) goto L_0x01aa
            r14 = 0
            int r27 = r8.getColor(r14, r14)
            r14 = 0
            float r28 = r8.getFloat(r13, r14)
            r8.recycle()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r27)
            r15.add(r8)
            java.lang.Float r8 = java.lang.Float.valueOf(r28)
            r9.add(r8)
            goto L_0x01c5
        L_0x01aa:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r2.getPositionDescription()
            r1.append(r2)
            java.lang.String r2 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x01c5:
            r14 = r25
            r13 = r26
            goto L_0x0153
        L_0x01ca:
            r26 = r13
        L_0x01cc:
            int r0 = r15.size()
            if (r0 <= 0) goto L_0x01d8
            f0.f r0 = new f0.f
            r0.<init>((java.util.List<java.lang.Integer>) r15, (java.util.List<java.lang.Float>) r9)
            goto L_0x01d9
        L_0x01d8:
            r0 = 0
        L_0x01d9:
            if (r0 == 0) goto L_0x01dd
        L_0x01db:
            r1 = 1
            goto L_0x01eb
        L_0x01dd:
            if (r19 == 0) goto L_0x01e5
            f0.f r0 = new f0.f
            r0.<init>(r5, r6, r10)
            goto L_0x01db
        L_0x01e5:
            f0.f r0 = new f0.f
            r0.<init>((int) r5, (int) r10)
            goto L_0x01db
        L_0x01eb:
            if (r11 == r1) goto L_0x0221
            r2 = 2
            if (r11 == r2) goto L_0x0213
            android.graphics.LinearGradient r3 = new android.graphics.LinearGradient
            int[] r4 = r0.f18044a
            float[] r0 = r0.f18045b
            if (r7 == r1) goto L_0x0200
            if (r7 == r2) goto L_0x01fd
            android.graphics.Shader$TileMode r1 = android.graphics.Shader.TileMode.CLAMP
            goto L_0x0202
        L_0x01fd:
            android.graphics.Shader$TileMode r1 = android.graphics.Shader.TileMode.MIRROR
            goto L_0x0202
        L_0x0200:
            android.graphics.Shader$TileMode r1 = android.graphics.Shader.TileMode.REPEAT
        L_0x0202:
            r18 = r1
            r11 = r3
            r13 = r26
            r14 = r25
            r15 = r24
            r16 = r4
            r17 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            goto L_0x024f
        L_0x0213:
            android.graphics.SweepGradient r3 = new android.graphics.SweepGradient
            int[] r1 = r0.f18044a
            float[] r0 = r0.f18045b
            r10 = r21
            r9 = r22
            r3.<init>(r10, r9, r1, r0)
            goto L_0x024f
        L_0x0221:
            r10 = r21
            r9 = r22
            r1 = 0
            int r1 = (r23 > r1 ? 1 : (r23 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x0257
            android.graphics.RadialGradient r3 = new android.graphics.RadialGradient
            int[] r1 = r0.f18044a
            float[] r0 = r0.f18045b
            r2 = 1
            if (r7 == r2) goto L_0x023c
            r2 = 2
            if (r7 == r2) goto L_0x0239
            android.graphics.Shader$TileMode r2 = android.graphics.Shader.TileMode.CLAMP
            goto L_0x023e
        L_0x0239:
            android.graphics.Shader$TileMode r2 = android.graphics.Shader.TileMode.MIRROR
            goto L_0x023e
        L_0x023c:
            android.graphics.Shader$TileMode r2 = android.graphics.Shader.TileMode.REPEAT
        L_0x023e:
            r22 = r2
            r16 = r3
            r17 = r10
            r18 = r9
            r19 = r23
            r20 = r1
            r21 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22)
        L_0x024f:
            f0.d r0 = new f0.d
            r1 = 0
            r2 = 0
            r0.<init>(r3, r1, r2)
            return r0
        L_0x0257:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r1 = "<gradient> tag requires 'gradientRadius' attribute with radial type"
            r0.<init>(r1)
            throw r0
        L_0x025f:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r2.getPositionDescription()
            r1.append(r2)
            java.lang.String r2 = ": invalid gradient color tag "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x027d:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r1 = "No start tag found"
            r0.<init>(r1)
            goto L_0x0286
        L_0x0285:
            throw r0
        L_0x0286:
            goto L_0x0285
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.d.a(android.content.res.Resources, int, android.content.res.Resources$Theme):f0.d");
    }

    public boolean b() {
        return this.f18030a != null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.f18031b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean c() {
        /*
            r1 = this;
            android.graphics.Shader r0 = r1.f18030a
            if (r0 != 0) goto L_0x0010
            android.content.res.ColorStateList r0 = r1.f18031b
            if (r0 == 0) goto L_0x0010
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.d.c():boolean");
    }

    public boolean d(int[] iArr) {
        if (c()) {
            ColorStateList colorStateList = this.f18031b;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f18032c) {
                this.f18032c = colorForState;
                return true;
            }
        }
        return false;
    }
}
