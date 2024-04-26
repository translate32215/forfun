package w;

import java.util.ArrayList;
import java.util.Iterator;
import v.d;
import v.f;
import v.g;

/* compiled from: ChainRun */
public class c extends p {

    /* renamed from: k  reason: collision with root package name */
    public ArrayList<p> f26802k = new ArrayList<>();

    /* renamed from: l  reason: collision with root package name */
    public int f26803l;

    public c(f fVar, int i10) {
        super(fVar);
        f fVar2;
        Object obj;
        int i11;
        Object obj2;
        this.f26854f = i10;
        f fVar3 = this.f26850b;
        f o10 = fVar3.o(i10);
        while (true) {
            f fVar4 = o10;
            fVar2 = fVar3;
            fVar3 = fVar4;
            if (fVar3 == null) {
                break;
            }
            o10 = fVar3.o(this.f26854f);
        }
        this.f26850b = fVar2;
        ArrayList<p> arrayList = this.f26802k;
        int i12 = this.f26854f;
        if (i12 == 0) {
            obj = fVar2.f26253d;
        } else {
            obj = i12 == 1 ? fVar2.f26255e : null;
        }
        arrayList.add(obj);
        f n10 = fVar2.n(this.f26854f);
        while (n10 != null) {
            ArrayList<p> arrayList2 = this.f26802k;
            int i13 = this.f26854f;
            if (i13 == 0) {
                obj2 = n10.f26253d;
            } else {
                obj2 = i13 == 1 ? n10.f26255e : null;
            }
            arrayList2.add(obj2);
            n10 = n10.n(this.f26854f);
        }
        Iterator<p> it = this.f26802k.iterator();
        while (it.hasNext()) {
            p next = it.next();
            int i14 = this.f26854f;
            if (i14 == 0) {
                next.f26850b.f26249b = this;
            } else if (i14 == 1) {
                next.f26850b.f26251c = this;
            }
        }
        if ((this.f26854f == 0 && ((g) this.f26850b.V).f26294w0) && this.f26802k.size() > 1) {
            ArrayList<p> arrayList3 = this.f26802k;
            this.f26850b = arrayList3.get(arrayList3.size() - 1).f26850b;
        }
        if (this.f26854f == 0) {
            i11 = this.f26850b.f26268k0;
        } else {
            i11 = this.f26850b.f26270l0;
        }
        this.f26803l = i11;
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00d5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(w.d r26) {
        /*
            r25 = this;
            r0 = r25
            w.f r1 = r0.f26856h
            boolean r2 = r1.f26821j
            if (r2 == 0) goto L_0x03ee
            w.f r2 = r0.f26857i
            boolean r3 = r2.f26821j
            if (r3 != 0) goto L_0x0010
            goto L_0x03ee
        L_0x0010:
            v.f r3 = r0.f26850b
            v.f r3 = r3.V
            boolean r4 = r3 instanceof v.g
            if (r4 == 0) goto L_0x001d
            v.g r3 = (v.g) r3
            boolean r3 = r3.f26294w0
            goto L_0x001e
        L_0x001d:
            r3 = 0
        L_0x001e:
            int r2 = r2.f26818g
            int r1 = r1.f26818g
            int r2 = r2 - r1
            java.util.ArrayList<w.p> r1 = r0.f26802k
            int r1 = r1.size()
            r4 = 0
        L_0x002a:
            r6 = -1
            r7 = 8
            if (r4 >= r1) goto L_0x0040
            java.util.ArrayList<w.p> r8 = r0.f26802k
            java.lang.Object r8 = r8.get(r4)
            w.p r8 = (w.p) r8
            v.f r8 = r8.f26850b
            int r8 = r8.f26264i0
            if (r8 != r7) goto L_0x0041
            int r4 = r4 + 1
            goto L_0x002a
        L_0x0040:
            r4 = -1
        L_0x0041:
            int r8 = r1 + -1
            r9 = r8
        L_0x0044:
            if (r9 < 0) goto L_0x0058
            java.util.ArrayList<w.p> r10 = r0.f26802k
            java.lang.Object r10 = r10.get(r9)
            w.p r10 = (w.p) r10
            v.f r10 = r10.f26850b
            int r10 = r10.f26264i0
            if (r10 != r7) goto L_0x0057
            int r9 = r9 + -1
            goto L_0x0044
        L_0x0057:
            r6 = r9
        L_0x0058:
            r9 = 0
        L_0x0059:
            r11 = 2
            r13 = 3
            if (r9 >= r11) goto L_0x00f8
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
        L_0x0065:
            if (r14 >= r1) goto L_0x00e8
            java.util.ArrayList<w.p> r5 = r0.f26802k
            java.lang.Object r5 = r5.get(r14)
            w.p r5 = (w.p) r5
            v.f r11 = r5.f26850b
            int r10 = r11.f26264i0
            if (r10 != r7) goto L_0x0077
            goto L_0x00e0
        L_0x0077:
            int r17 = r17 + 1
            if (r14 <= 0) goto L_0x0082
            if (r14 < r4) goto L_0x0082
            w.f r10 = r5.f26856h
            int r10 = r10.f26817f
            int r15 = r15 + r10
        L_0x0082:
            w.g r10 = r5.f26853e
            int r7 = r10.f26818g
            int r12 = r5.f26852d
            if (r12 == r13) goto L_0x008c
            r12 = 1
            goto L_0x008d
        L_0x008c:
            r12 = 0
        L_0x008d:
            if (r12 == 0) goto L_0x00ab
            int r10 = r0.f26854f
            if (r10 != 0) goto L_0x009c
            w.l r13 = r11.f26253d
            w.g r13 = r13.f26853e
            boolean r13 = r13.f26821j
            if (r13 != 0) goto L_0x009c
            return
        L_0x009c:
            r13 = 1
            if (r10 != r13) goto L_0x00a8
            w.n r10 = r11.f26255e
            w.g r10 = r10.f26853e
            boolean r10 = r10.f26821j
            if (r10 != 0) goto L_0x00a8
            return
        L_0x00a8:
            r20 = r7
            goto L_0x00c1
        L_0x00ab:
            r20 = r7
            r13 = 1
            int r7 = r5.f26849a
            if (r7 != r13) goto L_0x00b9
            if (r9 != 0) goto L_0x00b9
            int r7 = r10.f26833m
            int r16 = r16 + 1
            goto L_0x00bf
        L_0x00b9:
            boolean r7 = r10.f26821j
            if (r7 == 0) goto L_0x00c1
            r7 = r20
        L_0x00bf:
            r12 = 1
            goto L_0x00c3
        L_0x00c1:
            r7 = r20
        L_0x00c3:
            if (r12 != 0) goto L_0x00d5
            int r16 = r16 + 1
            float[] r7 = r11.f26272m0
            int r10 = r0.f26854f
            r7 = r7[r10]
            r10 = 0
            int r11 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r11 < 0) goto L_0x00d6
            float r18 = r18 + r7
            goto L_0x00d6
        L_0x00d5:
            int r15 = r15 + r7
        L_0x00d6:
            if (r14 >= r8) goto L_0x00e0
            if (r14 >= r6) goto L_0x00e0
            w.f r5 = r5.f26857i
            int r5 = r5.f26817f
            int r5 = -r5
            int r15 = r15 + r5
        L_0x00e0:
            int r14 = r14 + 1
            r7 = 8
            r11 = 2
            r13 = 3
            goto L_0x0065
        L_0x00e8:
            if (r15 < r2) goto L_0x00f3
            if (r16 != 0) goto L_0x00ed
            goto L_0x00f3
        L_0x00ed:
            int r9 = r9 + 1
            r7 = 8
            goto L_0x0059
        L_0x00f3:
            r5 = r16
            r7 = r17
            goto L_0x00fd
        L_0x00f8:
            r5 = 0
            r7 = 0
            r15 = 0
            r18 = 0
        L_0x00fd:
            w.f r9 = r0.f26856h
            int r9 = r9.f26818g
            if (r3 == 0) goto L_0x0107
            w.f r9 = r0.f26857i
            int r9 = r9.f26818g
        L_0x0107:
            r10 = 1056964608(0x3f000000, float:0.5)
            if (r15 <= r2) goto L_0x0118
            r11 = 1073741824(0x40000000, float:2.0)
            int r12 = r15 - r2
            float r12 = (float) r12
            float r12 = r12 / r11
            float r12 = r12 + r10
            int r11 = (int) r12
            if (r3 == 0) goto L_0x0117
            int r9 = r9 + r11
            goto L_0x0118
        L_0x0117:
            int r9 = r9 - r11
        L_0x0118:
            if (r5 <= 0) goto L_0x01f9
            int r11 = r2 - r15
            float r11 = (float) r11
            float r12 = (float) r5
            float r12 = r11 / r12
            float r12 = r12 + r10
            int r12 = (int) r12
            r13 = 0
            r14 = 0
        L_0x0124:
            if (r13 >= r1) goto L_0x01ad
            java.util.ArrayList<w.p> r10 = r0.f26802k
            java.lang.Object r10 = r10.get(r13)
            w.p r10 = (w.p) r10
            r17 = r12
            v.f r12 = r10.f26850b
            r20 = r15
            int r15 = r12.f26264i0
            r21 = r9
            r9 = 8
            if (r15 != r9) goto L_0x013d
            goto L_0x0195
        L_0x013d:
            int r9 = r10.f26852d
            r15 = 3
            if (r9 != r15) goto L_0x0195
            w.g r9 = r10.f26853e
            boolean r15 = r9.f26821j
            if (r15 != 0) goto L_0x0195
            r15 = 0
            int r19 = (r18 > r15 ? 1 : (r18 == r15 ? 0 : -1))
            if (r19 <= 0) goto L_0x015e
            float[] r15 = r12.f26272m0
            r22 = r3
            int r3 = r0.f26854f
            r3 = r15[r3]
            float r3 = r3 * r11
            float r3 = r3 / r18
            r15 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 + r15
            int r3 = (int) r3
            goto L_0x0162
        L_0x015e:
            r22 = r3
            r3 = r17
        L_0x0162:
            int r15 = r0.f26854f
            if (r15 != 0) goto L_0x016b
            int r15 = r12.f26285v
            int r12 = r12.f26284u
            goto L_0x016f
        L_0x016b:
            int r15 = r12.f26288y
            int r12 = r12.f26287x
        L_0x016f:
            r23 = r11
            int r11 = r10.f26849a
            r24 = r7
            r7 = 1
            if (r11 != r7) goto L_0x017f
            int r7 = r9.f26833m
            int r7 = java.lang.Math.min(r3, r7)
            goto L_0x0180
        L_0x017f:
            r7 = r3
        L_0x0180:
            int r7 = java.lang.Math.max(r12, r7)
            if (r15 <= 0) goto L_0x018a
            int r7 = java.lang.Math.min(r15, r7)
        L_0x018a:
            if (r7 == r3) goto L_0x018f
            int r14 = r14 + 1
            r3 = r7
        L_0x018f:
            w.g r7 = r10.f26853e
            r7.c(r3)
            goto L_0x019b
        L_0x0195:
            r22 = r3
            r24 = r7
            r23 = r11
        L_0x019b:
            int r13 = r13 + 1
            r12 = r17
            r15 = r20
            r9 = r21
            r3 = r22
            r11 = r23
            r7 = r24
            r10 = 1056964608(0x3f000000, float:0.5)
            goto L_0x0124
        L_0x01ad:
            r22 = r3
            r24 = r7
            r21 = r9
            r20 = r15
            if (r14 <= 0) goto L_0x01ea
            int r5 = r5 - r14
            r3 = 0
            r7 = 0
        L_0x01ba:
            if (r3 >= r1) goto L_0x01e8
            java.util.ArrayList<w.p> r9 = r0.f26802k
            java.lang.Object r9 = r9.get(r3)
            w.p r9 = (w.p) r9
            v.f r10 = r9.f26850b
            int r10 = r10.f26264i0
            r11 = 8
            if (r10 != r11) goto L_0x01cd
            goto L_0x01e5
        L_0x01cd:
            if (r3 <= 0) goto L_0x01d6
            if (r3 < r4) goto L_0x01d6
            w.f r10 = r9.f26856h
            int r10 = r10.f26817f
            int r7 = r7 + r10
        L_0x01d6:
            w.g r10 = r9.f26853e
            int r10 = r10.f26818g
            int r7 = r7 + r10
            if (r3 >= r8) goto L_0x01e5
            if (r3 >= r6) goto L_0x01e5
            w.f r9 = r9.f26857i
            int r9 = r9.f26817f
            int r9 = -r9
            int r7 = r7 + r9
        L_0x01e5:
            int r3 = r3 + 1
            goto L_0x01ba
        L_0x01e8:
            r15 = r7
            goto L_0x01ec
        L_0x01ea:
            r15 = r20
        L_0x01ec:
            int r3 = r0.f26803l
            r7 = 2
            if (r3 != r7) goto L_0x01f7
            if (r14 != 0) goto L_0x01f7
            r3 = 0
            r0.f26803l = r3
            goto L_0x0203
        L_0x01f7:
            r3 = 0
            goto L_0x0203
        L_0x01f9:
            r22 = r3
            r24 = r7
            r21 = r9
            r20 = r15
            r3 = 0
            r7 = 2
        L_0x0203:
            if (r15 <= r2) goto L_0x0207
            r0.f26803l = r7
        L_0x0207:
            if (r24 <= 0) goto L_0x020f
            if (r5 != 0) goto L_0x020f
            if (r4 != r6) goto L_0x020f
            r0.f26803l = r7
        L_0x020f:
            int r7 = r0.f26803l
            r9 = 1
            if (r7 != r9) goto L_0x02b0
            r10 = r24
            if (r10 <= r9) goto L_0x021d
            int r2 = r2 - r15
            int r7 = r10 + -1
            int r2 = r2 / r7
            goto L_0x0224
        L_0x021d:
            if (r10 != r9) goto L_0x0223
            int r2 = r2 - r15
            r7 = 2
            int r2 = r2 / r7
            goto L_0x0224
        L_0x0223:
            r2 = 0
        L_0x0224:
            if (r5 <= 0) goto L_0x0227
            r2 = 0
        L_0x0227:
            r9 = r21
            r5 = 0
        L_0x022a:
            if (r5 >= r1) goto L_0x03ee
            if (r22 == 0) goto L_0x0233
            int r3 = r5 + 1
            int r3 = r1 - r3
            goto L_0x0234
        L_0x0233:
            r3 = r5
        L_0x0234:
            java.util.ArrayList<w.p> r7 = r0.f26802k
            java.lang.Object r3 = r7.get(r3)
            w.p r3 = (w.p) r3
            v.f r7 = r3.f26850b
            int r7 = r7.f26264i0
            r10 = 8
            if (r7 != r10) goto L_0x024f
            w.f r7 = r3.f26856h
            r7.c(r9)
            w.f r3 = r3.f26857i
            r3.c(r9)
            goto L_0x02ac
        L_0x024f:
            if (r5 <= 0) goto L_0x0256
            if (r22 == 0) goto L_0x0255
            int r9 = r9 - r2
            goto L_0x0256
        L_0x0255:
            int r9 = r9 + r2
        L_0x0256:
            if (r5 <= 0) goto L_0x0267
            if (r5 < r4) goto L_0x0267
            if (r22 == 0) goto L_0x0262
            w.f r7 = r3.f26856h
            int r7 = r7.f26817f
            int r9 = r9 - r7
            goto L_0x0267
        L_0x0262:
            w.f r7 = r3.f26856h
            int r7 = r7.f26817f
            int r9 = r9 + r7
        L_0x0267:
            if (r22 == 0) goto L_0x026f
            w.f r7 = r3.f26857i
            r7.c(r9)
            goto L_0x0274
        L_0x026f:
            w.f r7 = r3.f26856h
            r7.c(r9)
        L_0x0274:
            w.g r7 = r3.f26853e
            int r10 = r7.f26818g
            int r11 = r3.f26852d
            r12 = 3
            if (r11 != r12) goto L_0x0284
            int r11 = r3.f26849a
            r12 = 1
            if (r11 != r12) goto L_0x0284
            int r10 = r7.f26833m
        L_0x0284:
            if (r22 == 0) goto L_0x0288
            int r9 = r9 - r10
            goto L_0x0289
        L_0x0288:
            int r9 = r9 + r10
        L_0x0289:
            if (r22 == 0) goto L_0x0291
            w.f r7 = r3.f26856h
            r7.c(r9)
            goto L_0x0296
        L_0x0291:
            w.f r7 = r3.f26857i
            r7.c(r9)
        L_0x0296:
            r7 = 1
            r3.f26855g = r7
            if (r5 >= r8) goto L_0x02ac
            if (r5 >= r6) goto L_0x02ac
            if (r22 == 0) goto L_0x02a6
            w.f r3 = r3.f26857i
            int r3 = r3.f26817f
            int r3 = -r3
            int r9 = r9 - r3
            goto L_0x02ac
        L_0x02a6:
            w.f r3 = r3.f26857i
            int r3 = r3.f26817f
            int r3 = -r3
            int r9 = r9 + r3
        L_0x02ac:
            int r5 = r5 + 1
            goto L_0x022a
        L_0x02b0:
            r10 = r24
            if (r7 != 0) goto L_0x0344
            int r2 = r2 - r15
            r7 = 1
            int r9 = r10 + 1
            int r2 = r2 / r9
            if (r5 <= 0) goto L_0x02bc
            r2 = 0
        L_0x02bc:
            r9 = r21
            r5 = 0
        L_0x02bf:
            if (r5 >= r1) goto L_0x03ee
            if (r22 == 0) goto L_0x02c8
            int r3 = r5 + 1
            int r3 = r1 - r3
            goto L_0x02c9
        L_0x02c8:
            r3 = r5
        L_0x02c9:
            java.util.ArrayList<w.p> r7 = r0.f26802k
            java.lang.Object r3 = r7.get(r3)
            w.p r3 = (w.p) r3
            v.f r7 = r3.f26850b
            int r7 = r7.f26264i0
            r10 = 8
            if (r7 != r10) goto L_0x02e4
            w.f r7 = r3.f26856h
            r7.c(r9)
            w.f r3 = r3.f26857i
            r3.c(r9)
            goto L_0x0340
        L_0x02e4:
            if (r22 == 0) goto L_0x02e8
            int r9 = r9 - r2
            goto L_0x02e9
        L_0x02e8:
            int r9 = r9 + r2
        L_0x02e9:
            if (r5 <= 0) goto L_0x02fa
            if (r5 < r4) goto L_0x02fa
            if (r22 == 0) goto L_0x02f5
            w.f r7 = r3.f26856h
            int r7 = r7.f26817f
            int r9 = r9 - r7
            goto L_0x02fa
        L_0x02f5:
            w.f r7 = r3.f26856h
            int r7 = r7.f26817f
            int r9 = r9 + r7
        L_0x02fa:
            if (r22 == 0) goto L_0x0302
            w.f r7 = r3.f26857i
            r7.c(r9)
            goto L_0x0307
        L_0x0302:
            w.f r7 = r3.f26856h
            r7.c(r9)
        L_0x0307:
            w.g r7 = r3.f26853e
            int r10 = r7.f26818g
            int r11 = r3.f26852d
            r12 = 3
            if (r11 != r12) goto L_0x031b
            int r11 = r3.f26849a
            r12 = 1
            if (r11 != r12) goto L_0x031b
            int r7 = r7.f26833m
            int r10 = java.lang.Math.min(r10, r7)
        L_0x031b:
            if (r22 == 0) goto L_0x031f
            int r9 = r9 - r10
            goto L_0x0320
        L_0x031f:
            int r9 = r9 + r10
        L_0x0320:
            if (r22 == 0) goto L_0x0328
            w.f r7 = r3.f26856h
            r7.c(r9)
            goto L_0x032d
        L_0x0328:
            w.f r7 = r3.f26857i
            r7.c(r9)
        L_0x032d:
            if (r5 >= r8) goto L_0x0340
            if (r5 >= r6) goto L_0x0340
            if (r22 == 0) goto L_0x033a
            w.f r3 = r3.f26857i
            int r3 = r3.f26817f
            int r3 = -r3
            int r9 = r9 - r3
            goto L_0x0340
        L_0x033a:
            w.f r3 = r3.f26857i
            int r3 = r3.f26817f
            int r3 = -r3
            int r9 = r9 + r3
        L_0x0340:
            int r5 = r5 + 1
            goto L_0x02bf
        L_0x0344:
            r9 = 2
            if (r7 != r9) goto L_0x03ee
            int r7 = r0.f26854f
            if (r7 != 0) goto L_0x0350
            v.f r7 = r0.f26850b
            float r7 = r7.f26258f0
            goto L_0x0354
        L_0x0350:
            v.f r7 = r0.f26850b
            float r7 = r7.f26260g0
        L_0x0354:
            if (r22 == 0) goto L_0x035a
            r9 = 1065353216(0x3f800000, float:1.0)
            float r7 = r9 - r7
        L_0x035a:
            int r2 = r2 - r15
            float r2 = (float) r2
            float r2 = r2 * r7
            r7 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r7
            int r2 = (int) r2
            if (r2 < 0) goto L_0x0366
            if (r5 <= 0) goto L_0x0367
        L_0x0366:
            r2 = 0
        L_0x0367:
            if (r22 == 0) goto L_0x036c
            int r9 = r21 - r2
            goto L_0x036e
        L_0x036c:
            int r9 = r21 + r2
        L_0x036e:
            r5 = 0
        L_0x036f:
            if (r5 >= r1) goto L_0x03ee
            if (r22 == 0) goto L_0x0378
            int r2 = r5 + 1
            int r2 = r1 - r2
            goto L_0x0379
        L_0x0378:
            r2 = r5
        L_0x0379:
            java.util.ArrayList<w.p> r3 = r0.f26802k
            java.lang.Object r2 = r3.get(r2)
            w.p r2 = (w.p) r2
            v.f r3 = r2.f26850b
            int r3 = r3.f26264i0
            r7 = 8
            if (r3 != r7) goto L_0x0396
            w.f r3 = r2.f26856h
            r3.c(r9)
            w.f r2 = r2.f26857i
            r2.c(r9)
            r12 = 3
            r13 = 1
            goto L_0x03eb
        L_0x0396:
            if (r5 <= 0) goto L_0x03a7
            if (r5 < r4) goto L_0x03a7
            if (r22 == 0) goto L_0x03a2
            w.f r3 = r2.f26856h
            int r3 = r3.f26817f
            int r9 = r9 - r3
            goto L_0x03a7
        L_0x03a2:
            w.f r3 = r2.f26856h
            int r3 = r3.f26817f
            int r9 = r9 + r3
        L_0x03a7:
            if (r22 == 0) goto L_0x03af
            w.f r3 = r2.f26857i
            r3.c(r9)
            goto L_0x03b4
        L_0x03af:
            w.f r3 = r2.f26856h
            r3.c(r9)
        L_0x03b4:
            w.g r3 = r2.f26853e
            int r10 = r3.f26818g
            int r11 = r2.f26852d
            r12 = 3
            if (r11 != r12) goto L_0x03c5
            int r11 = r2.f26849a
            r13 = 1
            if (r11 != r13) goto L_0x03c6
            int r10 = r3.f26833m
            goto L_0x03c6
        L_0x03c5:
            r13 = 1
        L_0x03c6:
            if (r22 == 0) goto L_0x03ca
            int r9 = r9 - r10
            goto L_0x03cb
        L_0x03ca:
            int r9 = r9 + r10
        L_0x03cb:
            if (r22 == 0) goto L_0x03d3
            w.f r3 = r2.f26856h
            r3.c(r9)
            goto L_0x03d8
        L_0x03d3:
            w.f r3 = r2.f26857i
            r3.c(r9)
        L_0x03d8:
            if (r5 >= r8) goto L_0x03eb
            if (r5 >= r6) goto L_0x03eb
            if (r22 == 0) goto L_0x03e5
            w.f r2 = r2.f26857i
            int r2 = r2.f26817f
            int r2 = -r2
            int r9 = r9 - r2
            goto L_0x03eb
        L_0x03e5:
            w.f r2 = r2.f26857i
            int r2 = r2.f26817f
            int r2 = -r2
            int r9 = r9 + r2
        L_0x03eb:
            int r5 = r5 + 1
            goto L_0x036f
        L_0x03ee:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w.c.a(w.d):void");
    }

    public void d() {
        Iterator<p> it = this.f26802k.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
        int size = this.f26802k.size();
        if (size >= 1) {
            f fVar = this.f26802k.get(0).f26850b;
            f fVar2 = this.f26802k.get(size - 1).f26850b;
            if (this.f26854f == 0) {
                d dVar = fVar.J;
                d dVar2 = fVar2.L;
                f i10 = i(dVar, 0);
                int d10 = dVar.d();
                f m10 = m();
                if (m10 != null) {
                    d10 = m10.J.d();
                }
                if (i10 != null) {
                    f fVar3 = this.f26856h;
                    fVar3.f26823l.add(i10);
                    fVar3.f26817f = d10;
                    i10.f26822k.add(fVar3);
                }
                f i11 = i(dVar2, 0);
                int d11 = dVar2.d();
                f n10 = n();
                if (n10 != null) {
                    d11 = n10.L.d();
                }
                if (i11 != null) {
                    f fVar4 = this.f26857i;
                    fVar4.f26823l.add(i11);
                    fVar4.f26817f = -d11;
                    i11.f26822k.add(fVar4);
                }
            } else {
                d dVar3 = fVar.K;
                d dVar4 = fVar2.M;
                f i12 = i(dVar3, 1);
                int d12 = dVar3.d();
                f m11 = m();
                if (m11 != null) {
                    d12 = m11.K.d();
                }
                if (i12 != null) {
                    f fVar5 = this.f26856h;
                    fVar5.f26823l.add(i12);
                    fVar5.f26817f = d12;
                    i12.f26822k.add(fVar5);
                }
                f i13 = i(dVar4, 1);
                int d13 = dVar4.d();
                f n11 = n();
                if (n11 != null) {
                    d13 = n11.M.d();
                }
                if (i13 != null) {
                    f fVar6 = this.f26857i;
                    fVar6.f26823l.add(i13);
                    fVar6.f26817f = -d13;
                    i13.f26822k.add(fVar6);
                }
            }
            this.f26856h.f26812a = this;
            this.f26857i.f26812a = this;
        }
    }

    public void e() {
        for (int i10 = 0; i10 < this.f26802k.size(); i10++) {
            this.f26802k.get(i10).e();
        }
    }

    public void f() {
        this.f26851c = null;
        Iterator<p> it = this.f26802k.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
    }

    public long j() {
        int size = this.f26802k.size();
        long j10 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            p pVar = this.f26802k.get(i10);
            j10 = ((long) pVar.f26857i.f26817f) + pVar.j() + j10 + ((long) pVar.f26856h.f26817f);
        }
        return j10;
    }

    public boolean k() {
        int size = this.f26802k.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!this.f26802k.get(i10).k()) {
                return false;
            }
        }
        return true;
    }

    public final f m() {
        for (int i10 = 0; i10 < this.f26802k.size(); i10++) {
            f fVar = this.f26802k.get(i10).f26850b;
            if (fVar.f26264i0 != 8) {
                return fVar;
            }
        }
        return null;
    }

    public final f n() {
        for (int size = this.f26802k.size() - 1; size >= 0; size--) {
            f fVar = this.f26802k.get(size).f26850b;
            if (fVar.f26264i0 != 8) {
                return fVar;
            }
        }
        return null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ChainRun ");
        sb2.append(this.f26854f == 0 ? "horizontal : " : "vertical : ");
        Iterator<p> it = this.f26802k.iterator();
        while (it.hasNext()) {
            sb2.append("<");
            sb2.append(it.next());
            sb2.append("> ");
        }
        return sb2.toString();
    }
}
