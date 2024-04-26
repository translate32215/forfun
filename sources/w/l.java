package w;

import android.support.v4.media.a;
import v.d;
import v.f;
import v.i;
import w.f;

/* compiled from: HorizontalWidgetRun */
public class l extends p {

    /* renamed from: k  reason: collision with root package name */
    public static int[] f26837k = new int[2];

    public l(f fVar) {
        super(fVar);
        this.f26856h.f26816e = f.a.LEFT;
        this.f26857i.f26816e = f.a.RIGHT;
        this.f26854f = 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0276, code lost:
        if (r15 != 1) goto L_0x02d8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:166:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0167  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(w.d r19) {
        /*
            r18 = this;
            r8 = r18
            int r0 = r8.f26858j
            int r0 = t.g.f(r0)
            r9 = 3
            r10 = 0
            if (r0 == r9) goto L_0x03f2
            w.g r0 = r8.f26853e
            boolean r1 = r0.f26821j
            r11 = 1056964608(0x3f000000, float:0.5)
            r12 = 1
            if (r1 != 0) goto L_0x02d8
            int r1 = r8.f26852d
            if (r1 != r9) goto L_0x02d8
            v.f r1 = r8.f26850b
            int r2 = r1.f26281r
            r3 = 2
            if (r2 == r3) goto L_0x02c0
            if (r2 == r9) goto L_0x0024
            goto L_0x02d8
        L_0x0024:
            int r2 = r1.f26282s
            r3 = -1
            if (r2 == 0) goto L_0x005d
            if (r2 != r9) goto L_0x002c
            goto L_0x005d
        L_0x002c:
            int r2 = r1.Z
            if (r2 == r3) goto L_0x004b
            if (r2 == 0) goto L_0x0040
            if (r2 == r12) goto L_0x0036
            r1 = 0
            goto L_0x0058
        L_0x0036:
            w.n r2 = r1.f26255e
            w.g r2 = r2.f26853e
            int r2 = r2.f26818g
            float r2 = (float) r2
            float r1 = r1.Y
            goto L_0x0054
        L_0x0040:
            w.n r2 = r1.f26255e
            w.g r2 = r2.f26853e
            int r2 = r2.f26818g
            float r2 = (float) r2
            float r1 = r1.Y
            float r2 = r2 / r1
            goto L_0x0056
        L_0x004b:
            w.n r2 = r1.f26255e
            w.g r2 = r2.f26853e
            int r2 = r2.f26818g
            float r2 = (float) r2
            float r1 = r1.Y
        L_0x0054:
            float r2 = r2 * r1
        L_0x0056:
            float r2 = r2 + r11
            int r1 = (int) r2
        L_0x0058:
            r0.c(r1)
            goto L_0x02d8
        L_0x005d:
            w.n r0 = r1.f26255e
            w.f r13 = r0.f26856h
            w.f r14 = r0.f26857i
            v.d r0 = r1.J
            v.d r0 = r0.f26234f
            if (r0 == 0) goto L_0x006b
            r0 = 1
            goto L_0x006c
        L_0x006b:
            r0 = 0
        L_0x006c:
            v.d r2 = r1.K
            v.d r2 = r2.f26234f
            if (r2 == 0) goto L_0x0074
            r2 = 1
            goto L_0x0075
        L_0x0074:
            r2 = 0
        L_0x0075:
            v.d r4 = r1.L
            v.d r4 = r4.f26234f
            if (r4 == 0) goto L_0x007d
            r4 = 1
            goto L_0x007e
        L_0x007d:
            r4 = 0
        L_0x007e:
            v.d r5 = r1.M
            v.d r5 = r5.f26234f
            if (r5 == 0) goto L_0x0086
            r5 = 1
            goto L_0x0087
        L_0x0086:
            r5 = 0
        L_0x0087:
            int r15 = r1.Z
            if (r0 == 0) goto L_0x01c5
            if (r2 == 0) goto L_0x01c5
            if (r4 == 0) goto L_0x01c5
            if (r5 == 0) goto L_0x01c5
            float r7 = r1.Y
            boolean r0 = r13.f26821j
            if (r0 == 0) goto L_0x00f3
            boolean r0 = r14.f26821j
            if (r0 == 0) goto L_0x00f3
            w.f r0 = r8.f26856h
            boolean r1 = r0.f26814c
            if (r1 == 0) goto L_0x00f2
            w.f r1 = r8.f26857i
            boolean r1 = r1.f26814c
            if (r1 != 0) goto L_0x00a8
            goto L_0x00f2
        L_0x00a8:
            java.util.List<w.f> r0 = r0.f26823l
            java.lang.Object r0 = r0.get(r10)
            w.f r0 = (w.f) r0
            int r0 = r0.f26818g
            w.f r1 = r8.f26856h
            int r1 = r1.f26817f
            int r2 = r0 + r1
            w.f r0 = r8.f26857i
            java.util.List<w.f> r0 = r0.f26823l
            java.lang.Object r0 = r0.get(r10)
            w.f r0 = (w.f) r0
            int r0 = r0.f26818g
            w.f r1 = r8.f26857i
            int r1 = r1.f26817f
            int r3 = r0 - r1
            int r0 = r13.f26818g
            int r1 = r13.f26817f
            int r4 = r0 + r1
            int r0 = r14.f26818g
            int r1 = r14.f26817f
            int r5 = r0 - r1
            int[] r9 = f26837k
            r0 = r18
            r1 = r9
            r6 = r7
            r7 = r15
            r0.m(r1, r2, r3, r4, r5, r6, r7)
            w.g r0 = r8.f26853e
            r1 = r9[r10]
            r0.c(r1)
            v.f r0 = r8.f26850b
            w.n r0 = r0.f26255e
            w.g r0 = r0.f26853e
            r1 = r9[r12]
            r0.c(r1)
        L_0x00f2:
            return
        L_0x00f3:
            w.f r0 = r8.f26856h
            boolean r1 = r0.f26821j
            if (r1 == 0) goto L_0x0150
            w.f r1 = r8.f26857i
            boolean r2 = r1.f26821j
            if (r2 == 0) goto L_0x0150
            boolean r2 = r13.f26814c
            if (r2 == 0) goto L_0x014f
            boolean r2 = r14.f26814c
            if (r2 != 0) goto L_0x0108
            goto L_0x014f
        L_0x0108:
            int r2 = r0.f26818g
            int r0 = r0.f26817f
            int r2 = r2 + r0
            int r0 = r1.f26818g
            int r1 = r1.f26817f
            int r3 = r0 - r1
            java.util.List<w.f> r0 = r13.f26823l
            java.lang.Object r0 = r0.get(r10)
            w.f r0 = (w.f) r0
            int r0 = r0.f26818g
            int r1 = r13.f26817f
            int r4 = r0 + r1
            java.util.List<w.f> r0 = r14.f26823l
            java.lang.Object r0 = r0.get(r10)
            w.f r0 = (w.f) r0
            int r0 = r0.f26818g
            int r1 = r14.f26817f
            int r5 = r0 - r1
            int[] r16 = f26837k
            r0 = r18
            r1 = r16
            r6 = r7
            r17 = r7
            r7 = r15
            r0.m(r1, r2, r3, r4, r5, r6, r7)
            w.g r0 = r8.f26853e
            r1 = r16[r10]
            r0.c(r1)
            v.f r0 = r8.f26850b
            w.n r0 = r0.f26255e
            w.g r0 = r0.f26853e
            r1 = r16[r12]
            r0.c(r1)
            goto L_0x0152
        L_0x014f:
            return
        L_0x0150:
            r17 = r7
        L_0x0152:
            w.f r0 = r8.f26856h
            boolean r1 = r0.f26814c
            if (r1 == 0) goto L_0x01c4
            w.f r1 = r8.f26857i
            boolean r1 = r1.f26814c
            if (r1 == 0) goto L_0x01c4
            boolean r1 = r13.f26814c
            if (r1 == 0) goto L_0x01c4
            boolean r1 = r14.f26814c
            if (r1 != 0) goto L_0x0167
            goto L_0x01c4
        L_0x0167:
            java.util.List<w.f> r0 = r0.f26823l
            java.lang.Object r0 = r0.get(r10)
            w.f r0 = (w.f) r0
            int r0 = r0.f26818g
            w.f r1 = r8.f26856h
            int r1 = r1.f26817f
            int r2 = r0 + r1
            w.f r0 = r8.f26857i
            java.util.List<w.f> r0 = r0.f26823l
            java.lang.Object r0 = r0.get(r10)
            w.f r0 = (w.f) r0
            int r0 = r0.f26818g
            w.f r1 = r8.f26857i
            int r1 = r1.f26817f
            int r3 = r0 - r1
            java.util.List<w.f> r0 = r13.f26823l
            java.lang.Object r0 = r0.get(r10)
            w.f r0 = (w.f) r0
            int r0 = r0.f26818g
            int r1 = r13.f26817f
            int r4 = r0 + r1
            java.util.List<w.f> r0 = r14.f26823l
            java.lang.Object r0 = r0.get(r10)
            w.f r0 = (w.f) r0
            int r0 = r0.f26818g
            int r1 = r14.f26817f
            int r5 = r0 - r1
            int[] r13 = f26837k
            r0 = r18
            r1 = r13
            r6 = r17
            r7 = r15
            r0.m(r1, r2, r3, r4, r5, r6, r7)
            w.g r0 = r8.f26853e
            r1 = r13[r10]
            r0.c(r1)
            v.f r0 = r8.f26850b
            w.n r0 = r0.f26255e
            w.g r0 = r0.f26853e
            r1 = r13[r12]
            r0.c(r1)
            goto L_0x02d8
        L_0x01c4:
            return
        L_0x01c5:
            if (r0 == 0) goto L_0x0249
            if (r4 == 0) goto L_0x0249
            w.f r0 = r8.f26856h
            boolean r2 = r0.f26814c
            if (r2 == 0) goto L_0x0248
            w.f r2 = r8.f26857i
            boolean r2 = r2.f26814c
            if (r2 != 0) goto L_0x01d6
            goto L_0x0248
        L_0x01d6:
            float r1 = r1.Y
            java.util.List<w.f> r0 = r0.f26823l
            java.lang.Object r0 = r0.get(r10)
            w.f r0 = (w.f) r0
            int r0 = r0.f26818g
            w.f r2 = r8.f26856h
            int r2 = r2.f26817f
            int r0 = r0 + r2
            w.f r2 = r8.f26857i
            java.util.List<w.f> r2 = r2.f26823l
            java.lang.Object r2 = r2.get(r10)
            w.f r2 = (w.f) r2
            int r2 = r2.f26818g
            w.f r4 = r8.f26857i
            int r4 = r4.f26817f
            int r2 = r2 - r4
            if (r15 == r3) goto L_0x0224
            if (r15 == 0) goto L_0x0224
            if (r15 == r12) goto L_0x0200
            goto L_0x02d8
        L_0x0200:
            int r2 = r2 - r0
            int r0 = r8.g(r2, r10)
            float r2 = (float) r0
            float r2 = r2 / r1
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.g(r2, r12)
            if (r2 == r3) goto L_0x0214
            float r0 = (float) r3
            float r0 = r0 * r1
            float r0 = r0 + r11
            int r0 = (int) r0
        L_0x0214:
            w.g r1 = r8.f26853e
            r1.c(r0)
            v.f r0 = r8.f26850b
            w.n r0 = r0.f26255e
            w.g r0 = r0.f26853e
            r0.c(r3)
            goto L_0x02d8
        L_0x0224:
            int r2 = r2 - r0
            int r0 = r8.g(r2, r10)
            float r2 = (float) r0
            float r2 = r2 * r1
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.g(r2, r12)
            if (r2 == r3) goto L_0x0238
            float r0 = (float) r3
            float r0 = r0 / r1
            float r0 = r0 + r11
            int r0 = (int) r0
        L_0x0238:
            w.g r1 = r8.f26853e
            r1.c(r0)
            v.f r0 = r8.f26850b
            w.n r0 = r0.f26255e
            w.g r0 = r0.f26853e
            r0.c(r3)
            goto L_0x02d8
        L_0x0248:
            return
        L_0x0249:
            if (r2 == 0) goto L_0x02d8
            if (r5 == 0) goto L_0x02d8
            boolean r0 = r13.f26814c
            if (r0 == 0) goto L_0x02bf
            boolean r0 = r14.f26814c
            if (r0 != 0) goto L_0x0256
            goto L_0x02bf
        L_0x0256:
            float r0 = r1.Y
            java.util.List<w.f> r1 = r13.f26823l
            java.lang.Object r1 = r1.get(r10)
            w.f r1 = (w.f) r1
            int r1 = r1.f26818g
            int r2 = r13.f26817f
            int r1 = r1 + r2
            java.util.List<w.f> r2 = r14.f26823l
            java.lang.Object r2 = r2.get(r10)
            w.f r2 = (w.f) r2
            int r2 = r2.f26818g
            int r4 = r14.f26817f
            int r2 = r2 - r4
            if (r15 == r3) goto L_0x029c
            if (r15 == 0) goto L_0x0279
            if (r15 == r12) goto L_0x029c
            goto L_0x02d8
        L_0x0279:
            int r2 = r2 - r1
            int r1 = r8.g(r2, r12)
            float r2 = (float) r1
            float r2 = r2 * r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.g(r2, r10)
            if (r2 == r3) goto L_0x028d
            float r1 = (float) r3
            float r1 = r1 / r0
            float r1 = r1 + r11
            int r1 = (int) r1
        L_0x028d:
            w.g r0 = r8.f26853e
            r0.c(r3)
            v.f r0 = r8.f26850b
            w.n r0 = r0.f26255e
            w.g r0 = r0.f26853e
            r0.c(r1)
            goto L_0x02d8
        L_0x029c:
            int r2 = r2 - r1
            int r1 = r8.g(r2, r12)
            float r2 = (float) r1
            float r2 = r2 / r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.g(r2, r10)
            if (r2 == r3) goto L_0x02b0
            float r1 = (float) r3
            float r1 = r1 * r0
            float r1 = r1 + r11
            int r1 = (int) r1
        L_0x02b0:
            w.g r0 = r8.f26853e
            r0.c(r3)
            v.f r0 = r8.f26850b
            w.n r0 = r0.f26255e
            w.g r0 = r0.f26853e
            r0.c(r1)
            goto L_0x02d8
        L_0x02bf:
            return
        L_0x02c0:
            v.f r2 = r1.V
            if (r2 == 0) goto L_0x02d8
            w.l r2 = r2.f26253d
            w.g r2 = r2.f26853e
            boolean r3 = r2.f26821j
            if (r3 == 0) goto L_0x02d8
            float r1 = r1.f26286w
            int r2 = r2.f26818g
            float r2 = (float) r2
            float r2 = r2 * r1
            float r2 = r2 + r11
            int r1 = (int) r2
            r0.c(r1)
        L_0x02d8:
            w.f r0 = r8.f26856h
            boolean r1 = r0.f26814c
            if (r1 == 0) goto L_0x03f1
            w.f r1 = r8.f26857i
            boolean r2 = r1.f26814c
            if (r2 != 0) goto L_0x02e6
            goto L_0x03f1
        L_0x02e6:
            boolean r0 = r0.f26821j
            if (r0 == 0) goto L_0x02f5
            boolean r0 = r1.f26821j
            if (r0 == 0) goto L_0x02f5
            w.g r0 = r8.f26853e
            boolean r0 = r0.f26821j
            if (r0 == 0) goto L_0x02f5
            return
        L_0x02f5:
            w.g r0 = r8.f26853e
            boolean r0 = r0.f26821j
            if (r0 != 0) goto L_0x033d
            int r0 = r8.f26852d
            if (r0 != r9) goto L_0x033d
            v.f r0 = r8.f26850b
            int r1 = r0.f26281r
            if (r1 != 0) goto L_0x033d
            boolean r0 = r0.A()
            if (r0 != 0) goto L_0x033d
            w.f r0 = r8.f26856h
            java.util.List<w.f> r0 = r0.f26823l
            java.lang.Object r0 = r0.get(r10)
            w.f r0 = (w.f) r0
            w.f r1 = r8.f26857i
            java.util.List<w.f> r1 = r1.f26823l
            java.lang.Object r1 = r1.get(r10)
            w.f r1 = (w.f) r1
            int r0 = r0.f26818g
            w.f r2 = r8.f26856h
            int r3 = r2.f26817f
            int r0 = r0 + r3
            int r1 = r1.f26818g
            w.f r3 = r8.f26857i
            int r3 = r3.f26817f
            int r1 = r1 + r3
            int r3 = r1 - r0
            r2.c(r0)
            w.f r0 = r8.f26857i
            r0.c(r1)
            w.g r0 = r8.f26853e
            r0.c(r3)
            return
        L_0x033d:
            w.g r0 = r8.f26853e
            boolean r0 = r0.f26821j
            if (r0 != 0) goto L_0x039f
            int r0 = r8.f26852d
            if (r0 != r9) goto L_0x039f
            int r0 = r8.f26849a
            if (r0 != r12) goto L_0x039f
            w.f r0 = r8.f26856h
            java.util.List<w.f> r0 = r0.f26823l
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x039f
            w.f r0 = r8.f26857i
            java.util.List<w.f> r0 = r0.f26823l
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x039f
            w.f r0 = r8.f26856h
            java.util.List<w.f> r0 = r0.f26823l
            java.lang.Object r0 = r0.get(r10)
            w.f r0 = (w.f) r0
            w.f r1 = r8.f26857i
            java.util.List<w.f> r1 = r1.f26823l
            java.lang.Object r1 = r1.get(r10)
            w.f r1 = (w.f) r1
            int r0 = r0.f26818g
            w.f r2 = r8.f26856h
            int r2 = r2.f26817f
            int r0 = r0 + r2
            int r1 = r1.f26818g
            w.f r2 = r8.f26857i
            int r2 = r2.f26817f
            int r1 = r1 + r2
            int r1 = r1 - r0
            w.g r0 = r8.f26853e
            int r0 = r0.f26833m
            int r0 = java.lang.Math.min(r1, r0)
            v.f r1 = r8.f26850b
            int r2 = r1.f26285v
            int r1 = r1.f26284u
            int r0 = java.lang.Math.max(r1, r0)
            if (r2 <= 0) goto L_0x039a
            int r0 = java.lang.Math.min(r2, r0)
        L_0x039a:
            w.g r1 = r8.f26853e
            r1.c(r0)
        L_0x039f:
            w.g r0 = r8.f26853e
            boolean r0 = r0.f26821j
            if (r0 != 0) goto L_0x03a6
            return
        L_0x03a6:
            w.f r0 = r8.f26856h
            java.util.List<w.f> r0 = r0.f26823l
            java.lang.Object r0 = r0.get(r10)
            w.f r0 = (w.f) r0
            w.f r1 = r8.f26857i
            java.util.List<w.f> r1 = r1.f26823l
            java.lang.Object r1 = r1.get(r10)
            w.f r1 = (w.f) r1
            int r2 = r0.f26818g
            w.f r3 = r8.f26856h
            int r4 = r3.f26817f
            int r4 = r4 + r2
            int r5 = r1.f26818g
            w.f r6 = r8.f26857i
            int r6 = r6.f26817f
            int r6 = r6 + r5
            v.f r7 = r8.f26850b
            float r7 = r7.f26258f0
            if (r0 != r1) goto L_0x03d1
            r7 = 1056964608(0x3f000000, float:0.5)
            goto L_0x03d3
        L_0x03d1:
            r2 = r4
            r5 = r6
        L_0x03d3:
            int r5 = r5 - r2
            w.g r0 = r8.f26853e
            int r0 = r0.f26818g
            int r5 = r5 - r0
            float r0 = (float) r2
            float r0 = r0 + r11
            float r1 = (float) r5
            float r1 = r1 * r7
            float r1 = r1 + r0
            int r0 = (int) r1
            r3.c(r0)
            w.f r0 = r8.f26857i
            w.f r1 = r8.f26856h
            int r1 = r1.f26818g
            w.g r2 = r8.f26853e
            int r2 = r2.f26818g
            int r1 = r1 + r2
            r0.c(r1)
        L_0x03f1:
            return
        L_0x03f2:
            v.f r0 = r8.f26850b
            v.d r1 = r0.J
            v.d r0 = r0.L
            r8.l(r1, r0, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w.l.a(w.d):void");
    }

    public void d() {
        v.f fVar;
        v.f fVar2;
        v.f fVar3;
        v.f fVar4 = this.f26850b;
        if (fVar4.f26247a) {
            this.f26853e.c(fVar4.u());
        }
        if (!this.f26853e.f26821j) {
            int m10 = this.f26850b.m();
            this.f26852d = m10;
            if (m10 != 3) {
                if (m10 == 4 && (fVar3 = this.f26850b.V) != null && (fVar3.m() == 1 || fVar3.m() == 4)) {
                    int u10 = (fVar3.u() - this.f26850b.J.d()) - this.f26850b.L.d();
                    b(this.f26856h, fVar3.f26253d.f26856h, this.f26850b.J.d());
                    b(this.f26857i, fVar3.f26253d.f26857i, -this.f26850b.L.d());
                    this.f26853e.c(u10);
                    return;
                } else if (this.f26852d == 1) {
                    this.f26853e.c(this.f26850b.u());
                }
            }
        } else if (this.f26852d == 4 && (fVar2 = this.f26850b.V) != null && (fVar2.m() == 1 || fVar2.m() == 4)) {
            b(this.f26856h, fVar2.f26253d.f26856h, this.f26850b.J.d());
            b(this.f26857i, fVar2.f26253d.f26857i, -this.f26850b.L.d());
            return;
        }
        g gVar = this.f26853e;
        if (gVar.f26821j) {
            v.f fVar5 = this.f26850b;
            if (fVar5.f26247a) {
                d[] dVarArr = fVar5.R;
                if (dVarArr[0].f26234f == null || dVarArr[1].f26234f == null) {
                    if (dVarArr[0].f26234f != null) {
                        f h10 = h(dVarArr[0]);
                        if (h10 != null) {
                            f fVar6 = this.f26856h;
                            int d10 = this.f26850b.R[0].d();
                            fVar6.f26823l.add(h10);
                            fVar6.f26817f = d10;
                            h10.f26822k.add(fVar6);
                            b(this.f26857i, this.f26856h, this.f26853e.f26818g);
                            return;
                        }
                        return;
                    } else if (dVarArr[1].f26234f != null) {
                        f h11 = h(dVarArr[1]);
                        if (h11 != null) {
                            f fVar7 = this.f26857i;
                            fVar7.f26823l.add(h11);
                            fVar7.f26817f = -this.f26850b.R[1].d();
                            h11.f26822k.add(fVar7);
                            b(this.f26856h, this.f26857i, -this.f26853e.f26818g);
                            return;
                        }
                        return;
                    } else if (!(fVar5 instanceof i) && fVar5.V != null && fVar5.i(d.a.CENTER).f26234f == null) {
                        v.f fVar8 = this.f26850b;
                        b(this.f26856h, fVar8.V.f26253d.f26856h, fVar8.v());
                        b(this.f26857i, this.f26856h, this.f26853e.f26818g);
                        return;
                    } else {
                        return;
                    }
                } else if (fVar5.A()) {
                    this.f26856h.f26817f = this.f26850b.R[0].d();
                    this.f26857i.f26817f = -this.f26850b.R[1].d();
                    return;
                } else {
                    f h12 = h(this.f26850b.R[0]);
                    if (h12 != null) {
                        f fVar9 = this.f26856h;
                        int d11 = this.f26850b.R[0].d();
                        fVar9.f26823l.add(h12);
                        fVar9.f26817f = d11;
                        h12.f26822k.add(fVar9);
                    }
                    f h13 = h(this.f26850b.R[1]);
                    if (h13 != null) {
                        f fVar10 = this.f26857i;
                        fVar10.f26823l.add(h13);
                        fVar10.f26817f = -this.f26850b.R[1].d();
                        h13.f26822k.add(fVar10);
                    }
                    this.f26856h.f26813b = true;
                    this.f26857i.f26813b = true;
                    return;
                }
            }
        }
        if (this.f26852d == 3) {
            v.f fVar11 = this.f26850b;
            int i10 = fVar11.f26281r;
            if (i10 == 2) {
                v.f fVar12 = fVar11.V;
                if (fVar12 != null) {
                    g gVar2 = fVar12.f26255e.f26853e;
                    gVar.f26823l.add(gVar2);
                    gVar2.f26822k.add(this.f26853e);
                    g gVar3 = this.f26853e;
                    gVar3.f26813b = true;
                    gVar3.f26822k.add(this.f26856h);
                    this.f26853e.f26822k.add(this.f26857i);
                }
            } else if (i10 == 3) {
                if (fVar11.f26282s == 3) {
                    this.f26856h.f26812a = this;
                    this.f26857i.f26812a = this;
                    n nVar = fVar11.f26255e;
                    nVar.f26856h.f26812a = this;
                    nVar.f26857i.f26812a = this;
                    gVar.f26812a = this;
                    if (fVar11.B()) {
                        this.f26853e.f26823l.add(this.f26850b.f26255e.f26853e);
                        this.f26850b.f26255e.f26853e.f26822k.add(this.f26853e);
                        n nVar2 = this.f26850b.f26255e;
                        nVar2.f26853e.f26812a = this;
                        this.f26853e.f26823l.add(nVar2.f26856h);
                        this.f26853e.f26823l.add(this.f26850b.f26255e.f26857i);
                        this.f26850b.f26255e.f26856h.f26822k.add(this.f26853e);
                        this.f26850b.f26255e.f26857i.f26822k.add(this.f26853e);
                    } else if (this.f26850b.A()) {
                        this.f26850b.f26255e.f26853e.f26823l.add(this.f26853e);
                        this.f26853e.f26822k.add(this.f26850b.f26255e.f26853e);
                    } else {
                        this.f26850b.f26255e.f26853e.f26823l.add(this.f26853e);
                    }
                } else {
                    g gVar4 = fVar11.f26255e.f26853e;
                    gVar.f26823l.add(gVar4);
                    gVar4.f26822k.add(this.f26853e);
                    this.f26850b.f26255e.f26856h.f26822k.add(this.f26853e);
                    this.f26850b.f26255e.f26857i.f26822k.add(this.f26853e);
                    g gVar5 = this.f26853e;
                    gVar5.f26813b = true;
                    gVar5.f26822k.add(this.f26856h);
                    this.f26853e.f26822k.add(this.f26857i);
                    this.f26856h.f26823l.add(this.f26853e);
                    this.f26857i.f26823l.add(this.f26853e);
                }
            }
        }
        v.f fVar13 = this.f26850b;
        d[] dVarArr2 = fVar13.R;
        if (dVarArr2[0].f26234f == null || dVarArr2[1].f26234f == null) {
            if (dVarArr2[0].f26234f != null) {
                f h14 = h(dVarArr2[0]);
                if (h14 != null) {
                    f fVar14 = this.f26856h;
                    int d12 = this.f26850b.R[0].d();
                    fVar14.f26823l.add(h14);
                    fVar14.f26817f = d12;
                    h14.f26822k.add(fVar14);
                    c(this.f26857i, this.f26856h, 1, this.f26853e);
                }
            } else if (dVarArr2[1].f26234f != null) {
                f h15 = h(dVarArr2[1]);
                if (h15 != null) {
                    f fVar15 = this.f26857i;
                    fVar15.f26823l.add(h15);
                    fVar15.f26817f = -this.f26850b.R[1].d();
                    h15.f26822k.add(fVar15);
                    c(this.f26856h, this.f26857i, -1, this.f26853e);
                }
            } else if (!(fVar13 instanceof i) && (fVar = fVar13.V) != null) {
                b(this.f26856h, fVar.f26253d.f26856h, fVar13.v());
                c(this.f26857i, this.f26856h, 1, this.f26853e);
            }
        } else if (fVar13.A()) {
            this.f26856h.f26817f = this.f26850b.R[0].d();
            this.f26857i.f26817f = -this.f26850b.R[1].d();
        } else {
            f h16 = h(this.f26850b.R[0]);
            f h17 = h(this.f26850b.R[1]);
            if (h16 != null) {
                h16.f26822k.add(this);
                if (h16.f26821j) {
                    a(this);
                }
            }
            if (h17 != null) {
                h17.f26822k.add(this);
                if (h17.f26821j) {
                    a(this);
                }
            }
            this.f26858j = 4;
        }
    }

    public void e() {
        f fVar = this.f26856h;
        if (fVar.f26821j) {
            this.f26850b.f26248a0 = fVar.f26818g;
        }
    }

    public void f() {
        this.f26851c = null;
        this.f26856h.b();
        this.f26857i.b();
        this.f26853e.b();
        this.f26855g = false;
    }

    public boolean k() {
        if (this.f26852d != 3 || this.f26850b.f26281r == 0) {
            return true;
        }
        return false;
    }

    public final void m(int[] iArr, int i10, int i11, int i12, int i13, float f10, int i14) {
        int i15 = i11 - i10;
        int i16 = i13 - i12;
        if (i14 == -1) {
            int i17 = (int) ((((float) i16) * f10) + 0.5f);
            int i18 = (int) ((((float) i15) / f10) + 0.5f);
            if (i17 <= i15) {
                iArr[0] = i17;
                iArr[1] = i16;
            } else if (i18 <= i16) {
                iArr[0] = i15;
                iArr[1] = i18;
            }
        } else if (i14 == 0) {
            iArr[0] = (int) ((((float) i16) * f10) + 0.5f);
            iArr[1] = i16;
        } else if (i14 == 1) {
            iArr[0] = i15;
            iArr[1] = (int) ((((float) i15) * f10) + 0.5f);
        }
    }

    public void n() {
        this.f26855g = false;
        this.f26856h.b();
        this.f26856h.f26821j = false;
        this.f26857i.b();
        this.f26857i.f26821j = false;
        this.f26853e.f26821j = false;
    }

    public String toString() {
        StringBuilder a10 = a.a("HorizontalRun ");
        a10.append(this.f26850b.f26266j0);
        return a10.toString();
    }
}
