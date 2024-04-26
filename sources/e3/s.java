package e3;

import f3.c;

/* compiled from: LayerParser */
public class s {

    /* renamed from: a  reason: collision with root package name */
    public static final c.a f13575a = c.a.a("nm", "ind", "refId", "ty", "parent", "sw", "sh", "sc", "ks", "tt", "masksProperties", "shapes", "t", "ef", "sr", "st", "w", "h", "ip", "op", "tm", "cl", "hd");

    /* renamed from: b  reason: collision with root package name */
    public static final c.a f13576b = c.a.a("d", "a");

    /* renamed from: c  reason: collision with root package name */
    public static final c.a f13577c = c.a.a("nm");

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v21, resolved type: a3.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: a3.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v11, resolved type: a3.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v22, resolved type: a3.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v23, resolved type: a3.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v24, resolved type: a3.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v30, resolved type: a3.d} */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0389, code lost:
        r14 = r39;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00af, code lost:
        r37 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x03c2, code lost:
        r6 = r37;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x03c4, code lost:
        r2 = 1;
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01e9, code lost:
        r39 = r14;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0256  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x02af  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x02df  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x02f9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static c3.e a(f3.c r41, u2.d r42) throws java.io.IOException {
        /*
            r0 = r41
            r7 = r42
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r41.d()
            r1 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r9 = java.lang.Float.valueOf(r1)
            r11 = 0
            java.lang.Float r12 = java.lang.Float.valueOf(r11)
            r2 = 1
            r3 = 0
            java.lang.String r5 = "UNSET"
            r13 = 0
            r15 = -1
            r17 = r15
            r1 = 0
            r6 = 0
            r16 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 1065353216(0x3f800000, float:1.0)
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 1
            r31 = 0
            r32 = 0
            r14 = r13
            r13 = r5
            r5 = 0
        L_0x0049:
            boolean r33 = r41.t()
            if (r33 == 0) goto L_0x03c9
            f3.c$a r11 = f13575a
            int r11 = r0.T(r11)
            switch(r11) {
                case 0: goto L_0x03b9;
                case 1: goto L_0x03b0;
                case 2: goto L_0x03a6;
                case 3: goto L_0x038c;
                case 4: goto L_0x037d;
                case 5: goto L_0x0369;
                case 6: goto L_0x0355;
                case 7: goto L_0x0346;
                case 8: goto L_0x033b;
                case 9: goto L_0x0326;
                case 10: goto L_0x01ed;
                case 11: goto L_0x01d0;
                case 12: goto L_0x0102;
                case 13: goto L_0x00b4;
                case 14: goto L_0x00a8;
                case 15: goto L_0x00a0;
                case 16: goto L_0x0091;
                case 17: goto L_0x0082;
                case 18: goto L_0x007c;
                case 19: goto L_0x0074;
                case 20: goto L_0x006f;
                case 21: goto L_0x006a;
                case 22: goto L_0x0065;
                default: goto L_0x0058;
            }
        L_0x0058:
            r37 = r6
            r39 = r14
            r3 = 1
            r41.V()
            r41.f0()
            goto L_0x0389
        L_0x0065:
            boolean r32 = r41.u()
            goto L_0x0079
        L_0x006a:
            java.lang.String r6 = r41.J()
            goto L_0x0079
        L_0x006f:
            a3.b r31 = e3.d.d(r0, r7, r3)
            goto L_0x0079
        L_0x0074:
            double r4 = r41.v()
            float r5 = (float) r4
        L_0x0079:
            r3 = 1
            goto L_0x03c4
        L_0x007c:
            double r3 = r41.v()
            float r1 = (float) r3
            goto L_0x00af
        L_0x0082:
            int r3 = r41.G()
            float r3 = (float) r3
            float r4 = g3.g.c()
            float r4 = r4 * r3
            int r3 = (int) r4
            r27 = r3
            goto L_0x00af
        L_0x0091:
            int r3 = r41.G()
            float r3 = (float) r3
            float r4 = g3.g.c()
            float r4 = r4 * r3
            int r3 = (int) r4
            r26 = r3
            goto L_0x00af
        L_0x00a0:
            double r3 = r41.v()
            float r3 = (float) r3
            r25 = r3
            goto L_0x00af
        L_0x00a8:
            double r3 = r41.v()
            float r3 = (float) r3
            r24 = r3
        L_0x00af:
            r37 = r6
        L_0x00b1:
            r3 = 1
            goto L_0x03c2
        L_0x00b4:
            r41.a()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L_0x00bc:
            boolean r4 = r41.t()
            if (r4 == 0) goto L_0x00e6
            r41.d()
        L_0x00c5:
            boolean r4 = r41.t()
            if (r4 == 0) goto L_0x00e2
            f3.c$a r4 = f13577c
            int r4 = r0.T(r4)
            if (r4 == 0) goto L_0x00da
            r41.V()
            r41.f0()
            goto L_0x00c5
        L_0x00da:
            java.lang.String r4 = r41.J()
            r3.add(r4)
            goto L_0x00c5
        L_0x00e2:
            r41.o()
            goto L_0x00bc
        L_0x00e6:
            r41.i()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r11 = "Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: "
            r4.append(r11)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r7.a(r3)
            r37 = r6
            r4 = 0
            goto L_0x01e9
        L_0x0102:
            r41.d()
        L_0x0105:
            boolean r3 = r41.t()
            if (r3 == 0) goto L_0x01c8
            f3.c$a r3 = f13576b
            int r3 = r0.T(r3)
            if (r3 == 0) goto L_0x01b3
            if (r3 == r2) goto L_0x011c
            r41.V()
            r41.f0()
            goto L_0x0105
        L_0x011c:
            r41.a()
            boolean r3 = r41.t()
            if (r3 == 0) goto L_0x01a2
            f3.c$a r3 = e3.b.f13542a
            r41.d()
            r3 = 0
        L_0x012b:
            boolean r11 = r41.t()
            if (r11 == 0) goto L_0x018e
            f3.c$a r11 = e3.b.f13542a
            int r11 = r0.T(r11)
            if (r11 == 0) goto L_0x0140
            r41.V()
            r41.f0()
            goto L_0x012b
        L_0x0140:
            r41.d()
            r3 = 0
            r11 = 0
            r37 = 0
            r38 = 0
        L_0x0149:
            boolean r29 = r41.t()
            if (r29 == 0) goto L_0x017b
            f3.c$a r4 = e3.b.f13543b
            int r4 = r0.T(r4)
            if (r4 == 0) goto L_0x0175
            if (r4 == r2) goto L_0x0170
            r2 = 2
            if (r4 == r2) goto L_0x016b
            r2 = 3
            if (r4 == r2) goto L_0x0166
            r41.V()
            r41.f0()
            goto L_0x0179
        L_0x0166:
            a3.b r11 = e3.d.c(r41, r42)
            goto L_0x0179
        L_0x016b:
            a3.b r3 = e3.d.c(r41, r42)
            goto L_0x0179
        L_0x0170:
            a3.a r38 = e3.d.b(r41, r42)
            goto L_0x0179
        L_0x0175:
            a3.a r37 = e3.d.b(r41, r42)
        L_0x0179:
            r2 = 1
            goto L_0x0149
        L_0x017b:
            r41.o()
            n2.g r2 = new n2.g
            r4 = r37
            r37 = r6
            r6 = r38
            r2.<init>((a3.a) r4, (a3.a) r6, (a3.b) r3, (a3.b) r11)
            r3 = r2
            r6 = r37
            r2 = 1
            goto L_0x012b
        L_0x018e:
            r37 = r6
            r41.o()
            if (r3 != 0) goto L_0x019e
            n2.g r2 = new n2.g
            r4 = 0
            r2.<init>((a3.a) r4, (a3.a) r4, (a3.b) r4, (a3.b) r4)
            r29 = r2
            goto L_0x01a5
        L_0x019e:
            r4 = 0
            r29 = r3
            goto L_0x01a5
        L_0x01a2:
            r37 = r6
            r4 = 0
        L_0x01a5:
            boolean r2 = r41.t()
            if (r2 == 0) goto L_0x01af
            r41.f0()
            goto L_0x01a5
        L_0x01af:
            r41.i()
            goto L_0x01c3
        L_0x01b3:
            r37 = r6
            r4 = 0
            a3.i r2 = new a3.i
            e3.h r3 = e3.h.f13557a
            java.util.List r3 = e3.d.a(r0, r7, r3)
            r2.<init>(r3)
            r28 = r2
        L_0x01c3:
            r6 = r37
            r2 = 1
            goto L_0x0105
        L_0x01c8:
            r37 = r6
            r4 = 0
            r41.o()
            goto L_0x00b1
        L_0x01d0:
            r37 = r6
            r4 = 0
            r41.a()
        L_0x01d6:
            boolean r2 = r41.t()
            if (r2 == 0) goto L_0x01e6
            b3.b r2 = e3.g.a(r41, r42)
            if (r2 == 0) goto L_0x01d6
            r8.add(r2)
            goto L_0x01d6
        L_0x01e6:
            r41.i()
        L_0x01e9:
            r39 = r14
            goto L_0x0324
        L_0x01ed:
            r37 = r6
            r4 = 0
            r41.a()
        L_0x01f3:
            boolean r2 = r41.t()
            if (r2 == 0) goto L_0x0316
            r41.d()
            r3 = r4
            r6 = r3
            r2 = 0
            r11 = 0
        L_0x0200:
            boolean r34 = r41.t()
            if (r34 == 0) goto L_0x0303
            java.lang.String r4 = r41.H()
            r4.getClass()
            r39 = r14
            int r14 = r4.hashCode()
            r15 = 111(0x6f, float:1.56E-43)
            r38 = -1
            if (r14 == r15) goto L_0x0249
            r15 = 3588(0xe04, float:5.028E-42)
            if (r14 == r15) goto L_0x023e
            r15 = 104433(0x197f1, float:1.46342E-40)
            if (r14 == r15) goto L_0x0233
            r15 = 3357091(0x3339a3, float:4.704286E-39)
            if (r14 == r15) goto L_0x0228
            goto L_0x0251
        L_0x0228:
            java.lang.String r14 = "mode"
            boolean r14 = r4.equals(r14)
            if (r14 != 0) goto L_0x0231
            goto L_0x0251
        L_0x0231:
            r14 = 3
            goto L_0x0254
        L_0x0233:
            java.lang.String r14 = "inv"
            boolean r14 = r4.equals(r14)
            if (r14 != 0) goto L_0x023c
            goto L_0x0251
        L_0x023c:
            r14 = 2
            goto L_0x0254
        L_0x023e:
            java.lang.String r14 = "pt"
            boolean r14 = r4.equals(r14)
            if (r14 != 0) goto L_0x0247
            goto L_0x0251
        L_0x0247:
            r14 = 1
            goto L_0x0254
        L_0x0249:
            java.lang.String r14 = "o"
            boolean r14 = r4.equals(r14)
            if (r14 != 0) goto L_0x0253
        L_0x0251:
            r14 = -1
            goto L_0x0254
        L_0x0253:
            r14 = 0
        L_0x0254:
            if (r14 == 0) goto L_0x02f9
            r15 = 1
            if (r14 == r15) goto L_0x02e8
            r15 = 2
            if (r14 == r15) goto L_0x02e2
            r15 = 3
            if (r14 == r15) goto L_0x0265
            r41.f0()
            r15 = 3
            goto L_0x02fe
        L_0x0265:
            java.lang.String r2 = r41.J()
            r2.getClass()
            int r14 = r2.hashCode()
            r15 = 97
            if (r14 == r15) goto L_0x02a2
            r15 = 105(0x69, float:1.47E-43)
            if (r14 == r15) goto L_0x0297
            r15 = 110(0x6e, float:1.54E-43)
            if (r14 == r15) goto L_0x028c
            r15 = 115(0x73, float:1.61E-43)
            if (r14 == r15) goto L_0x0281
            goto L_0x02aa
        L_0x0281:
            java.lang.String r14 = "s"
            boolean r2 = r2.equals(r14)
            if (r2 != 0) goto L_0x028a
            goto L_0x02aa
        L_0x028a:
            r2 = 3
            goto L_0x02ad
        L_0x028c:
            java.lang.String r14 = "n"
            boolean r2 = r2.equals(r14)
            if (r2 != 0) goto L_0x0295
            goto L_0x02aa
        L_0x0295:
            r2 = 2
            goto L_0x02ad
        L_0x0297:
            java.lang.String r14 = "i"
            boolean r2 = r2.equals(r14)
            if (r2 != 0) goto L_0x02a0
            goto L_0x02aa
        L_0x02a0:
            r2 = 1
            goto L_0x02ad
        L_0x02a2:
            java.lang.String r14 = "a"
            boolean r2 = r2.equals(r14)
            if (r2 != 0) goto L_0x02ac
        L_0x02aa:
            r2 = -1
            goto L_0x02ad
        L_0x02ac:
            r2 = 0
        L_0x02ad:
            if (r2 == 0) goto L_0x02df
            r14 = 1
            if (r2 == r14) goto L_0x02d7
            r14 = 2
            if (r2 == r14) goto L_0x02d4
            r15 = 3
            if (r2 == r15) goto L_0x02d2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r14 = "Unknown mask mode "
            r2.append(r14)
            r2.append(r4)
            java.lang.String r4 = ". Defaulting to Add."
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            g3.c.a(r2)
            goto L_0x02e0
        L_0x02d2:
            r2 = 2
            goto L_0x02fe
        L_0x02d4:
            r15 = 3
            r2 = 4
            goto L_0x02fe
        L_0x02d7:
            r15 = 3
            java.lang.String r2 = "Animation contains intersect masks. They are not supported but will be treated like add masks."
            r7.a(r2)
            r2 = 3
            goto L_0x02fe
        L_0x02df:
            r15 = 3
        L_0x02e0:
            r2 = 1
            goto L_0x02fe
        L_0x02e2:
            r15 = 3
            boolean r11 = r41.u()
            goto L_0x02fe
        L_0x02e8:
            r15 = 3
            a3.g r3 = new a3.g
            float r4 = g3.g.c()
            e3.b0 r14 = e3.b0.f13544a
            java.util.List r4 = e3.r.a(r0, r7, r4, r14)
            r3.<init>(r4)
            goto L_0x02fe
        L_0x02f9:
            r15 = 3
            a3.d r6 = e3.d.e(r41, r42)
        L_0x02fe:
            r14 = r39
            r4 = 0
            goto L_0x0200
        L_0x0303:
            r39 = r14
            r15 = 3
            r41.o()
            b3.f r4 = new b3.f
            r4.<init>(r2, r3, r6, r11)
            r10.add(r4)
            r14 = r39
            r4 = 0
            goto L_0x01f3
        L_0x0316:
            r39 = r14
            int r2 = r10.size()
            int r3 = r7.f25933o
            int r3 = r3 + r2
            r7.f25933o = r3
            r41.i()
        L_0x0324:
            r3 = 1
            goto L_0x0389
        L_0x0326:
            r37 = r6
            r39 = r14
            int[] r2 = t.g.com$airbnb$lottie$model$layer$Layer$MatteType$s$values()
            int r3 = r41.G()
            r30 = r2[r3]
            int r2 = r7.f25933o
            r3 = 1
            int r2 = r2 + r3
            r7.f25933o = r2
            goto L_0x0389
        L_0x033b:
            r37 = r6
            r39 = r14
            r3 = 1
            a3.j r20 = e3.c.a(r41, r42)
            goto L_0x03c2
        L_0x0346:
            r37 = r6
            r39 = r14
            r3 = 1
            java.lang.String r2 = r41.J()
            int r23 = android.graphics.Color.parseColor(r2)
            goto L_0x03c2
        L_0x0355:
            r37 = r6
            r39 = r14
            r3 = 1
            int r2 = r41.G()
            float r2 = (float) r2
            float r4 = g3.g.c()
            float r4 = r4 * r2
            int r2 = (int) r4
            r22 = r2
            goto L_0x03c2
        L_0x0369:
            r37 = r6
            r39 = r14
            r3 = 1
            int r2 = r41.G()
            float r2 = (float) r2
            float r4 = g3.g.c()
            float r4 = r4 * r2
            int r2 = (int) r4
            r21 = r2
            goto L_0x03c2
        L_0x037d:
            r37 = r6
            r39 = r14
            r3 = 1
            int r2 = r41.G()
            long r14 = (long) r2
            r17 = r14
        L_0x0389:
            r14 = r39
            goto L_0x03c2
        L_0x038c:
            r37 = r6
            r39 = r14
            r3 = 1
            int r2 = r41.G()
            c3.e$a r4 = c3.e.a.UNKNOWN
            r6 = 6
            if (r2 >= r6) goto L_0x03a3
            c3.e$a[] r4 = c3.e.a.values()
            r2 = r4[r2]
            r16 = r2
            goto L_0x0389
        L_0x03a3:
            r16 = r4
            goto L_0x0389
        L_0x03a6:
            r37 = r6
            r39 = r14
            r3 = 1
            java.lang.String r19 = r41.J()
            goto L_0x03c2
        L_0x03b0:
            r37 = r6
            r3 = 1
            int r2 = r41.G()
            long r14 = (long) r2
            goto L_0x03c2
        L_0x03b9:
            r37 = r6
            r39 = r14
            r3 = 1
            java.lang.String r13 = r41.J()
        L_0x03c2:
            r6 = r37
        L_0x03c4:
            r2 = 1
            r3 = 0
            r11 = 0
            goto L_0x0049
        L_0x03c9:
            r37 = r6
            r39 = r14
            r41.o()
            float r11 = r1 / r24
            float r14 = r5 / r24
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            r0 = 0
            int r1 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r1 <= 0) goto L_0x03fb
            h3.a r6 = new h3.a
            r4 = 0
            r5 = 0
            java.lang.Float r34 = java.lang.Float.valueOf(r11)
            r0 = r6
            r1 = r42
            r2 = r12
            r3 = r12
            r36 = r8
            r35 = r10
            r10 = r37
            r8 = r6
            r6 = r34
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r15.add(r8)
            goto L_0x0401
        L_0x03fb:
            r36 = r8
            r35 = r10
            r10 = r37
        L_0x0401:
            r0 = 0
            int r0 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0407
            goto L_0x040a
        L_0x0407:
            float r0 = r7.f25930l
            r14 = r0
        L_0x040a:
            h3.a r8 = new h3.a
            r33 = 0
            java.lang.Float r6 = java.lang.Float.valueOf(r14)
            r4 = 0
            r0 = r8
            r1 = r42
            r2 = r9
            r3 = r9
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r15.add(r8)
            h3.a r8 = new h3.a
            r0 = 2139095039(0x7f7fffff, float:3.4028235E38)
            java.lang.Float r6 = java.lang.Float.valueOf(r0)
            r0 = r8
            r2 = r12
            r3 = r12
            r4 = r33
            r5 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r15.add(r8)
            java.lang.String r0 = ".ai"
            boolean r0 = r13.endsWith(r0)
            if (r0 != 0) goto L_0x0444
            java.lang.String r0 = "ai"
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x0449
        L_0x0444:
            java.lang.String r0 = "Convert your Illustrator layers to shape layers."
            r7.a(r0)
        L_0x0449:
            c3.e r33 = new c3.e
            r0 = r33
            r1 = r36
            r2 = r42
            r3 = r13
            r4 = r39
            r6 = r16
            r7 = r17
            r9 = r19
            r10 = r35
            r11 = r20
            r12 = r21
            r13 = r22
            r14 = r23
            r21 = r15
            r15 = r24
            r16 = r25
            r17 = r26
            r18 = r27
            r19 = r28
            r20 = r29
            r22 = r30
            r23 = r31
            r24 = r32
            r0.<init>(r1, r2, r3, r4, r6, r7, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            return r33
        */
        throw new UnsupportedOperationException("Method not decompiled: e3.s.a(f3.c, u2.d):c3.e");
    }
}
