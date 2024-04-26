package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import e8.bf0;
import e8.if0;
import e8.jf0;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public abstract class hu extends iu {

    /* renamed from: b  reason: collision with root package name */
    public final SparseArray<Map<bf0, if0>> f6900b = new SparseArray<>();

    /* renamed from: c  reason: collision with root package name */
    public final SparseBooleanArray f6901c = new SparseBooleanArray();

    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0277, code lost:
        if (r11 <= r13) goto L_0x027c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0293  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0295  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x02a1  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x02a5  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x02a7  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x02aa  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x02cd  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01b0  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01ba  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final e8.mf0 a(com.google.android.gms.internal.ads.ss[] r41, e8.bf0 r42) throws e8.rb0 {
        /*
            r40 = this;
            r1 = r40
            r0 = r41
            r2 = r42
            int r3 = r0.length
            r4 = 1
            int r3 = r3 + r4
            int[] r3 = new int[r3]
            int r5 = r0.length
            int r5 = r5 + r4
            e8.ye0[][] r6 = new e8.ye0[r5][]
            int r7 = r0.length
            int r7 = r7 + r4
            int[][][] r12 = new int[r7][][]
            r8 = 0
        L_0x0014:
            if (r8 >= r5) goto L_0x0023
            int r9 = r2.f14006a
            e8.ye0[] r10 = new e8.ye0[r9]
            r6[r8] = r10
            int[][] r9 = new int[r9][]
            r12[r8] = r9
            int r8 = r8 + 1
            goto L_0x0014
        L_0x0023:
            int r5 = r0.length
            int[] r11 = new int[r5]
            r8 = 0
        L_0x0027:
            if (r8 >= r5) goto L_0x0034
            r9 = r0[r8]
            r9.getClass()
            r9 = 4
            r11[r8] = r9
            int r8 = r8 + 1
            goto L_0x0027
        L_0x0034:
            r5 = 0
        L_0x0035:
            int r8 = r2.f14006a
            if (r5 >= r8) goto L_0x00c0
            e8.ye0[] r8 = r2.f14007b
            r8 = r8[r5]
            int r10 = r0.length
            r13 = 0
            r14 = 0
        L_0x0040:
            int r15 = r0.length
            if (r13 >= r15) goto L_0x007a
            r15 = r0[r13]
            r7 = 0
        L_0x0046:
            int r4 = r8.f17620a
            if (r7 >= r4) goto L_0x0074
            e8.bc0[] r4 = r8.f17621b
            r4 = r4[r7]
            r9 = r15
            com.google.android.gms.internal.ads.rt r9 = (com.google.android.gms.internal.ads.rt) r9
            r9.getClass()
            r19 = r10
            com.google.android.gms.internal.ads.st r10 = r9.f8052i     // Catch:{ ee0 -> 0x006c }
            int r4 = r9.B(r10, r4)     // Catch:{ ee0 -> 0x006c }
            r9 = 3
            r4 = r4 & r9
            if (r4 <= r14) goto L_0x0067
            if (r4 == r9) goto L_0x0065
            r14 = r4
            r10 = r13
            goto L_0x0069
        L_0x0065:
            r10 = r13
            goto L_0x007a
        L_0x0067:
            r10 = r19
        L_0x0069:
            int r7 = r7 + 1
            goto L_0x0046
        L_0x006c:
            r0 = move-exception
            int r2 = r9.f8145c
            e8.rb0 r0 = e8.rb0.b(r0, r2)
            throw r0
        L_0x0074:
            r19 = r10
            int r13 = r13 + 1
            r4 = 1
            goto L_0x0040
        L_0x007a:
            int r4 = r0.length
            if (r10 != r4) goto L_0x0082
            int r4 = r8.f17620a
            int[] r4 = new int[r4]
            goto L_0x00ab
        L_0x0082:
            r4 = r0[r10]
            int r7 = r8.f17620a
            int[] r7 = new int[r7]
            r9 = 0
        L_0x0089:
            int r13 = r8.f17620a
            if (r9 >= r13) goto L_0x00aa
            e8.bc0[] r13 = r8.f17621b
            r13 = r13[r9]
            r14 = r4
            com.google.android.gms.internal.ads.rt r14 = (com.google.android.gms.internal.ads.rt) r14
            r14.getClass()
            com.google.android.gms.internal.ads.st r15 = r14.f8052i     // Catch:{ ee0 -> 0x00a2 }
            int r13 = r14.B(r15, r13)     // Catch:{ ee0 -> 0x00a2 }
            r7[r9] = r13
            int r9 = r9 + 1
            goto L_0x0089
        L_0x00a2:
            r0 = move-exception
            int r2 = r14.f8145c
            e8.rb0 r0 = e8.rb0.b(r0, r2)
            throw r0
        L_0x00aa:
            r4 = r7
        L_0x00ab:
            r7 = r3[r10]
            r9 = r6[r10]
            r9[r7] = r8
            r8 = r12[r10]
            r8[r7] = r4
            r4 = r3[r10]
            r7 = 1
            int r4 = r4 + r7
            r3[r10] = r4
            int r5 = r5 + 1
            r4 = 1
            goto L_0x0035
        L_0x00c0:
            int r4 = r0.length
            e8.bf0[] r10 = new e8.bf0[r4]
            int r4 = r0.length
            int[] r9 = new int[r4]
            r4 = 0
        L_0x00c7:
            int r5 = r0.length
            if (r4 >= r5) goto L_0x00ee
            r5 = r3[r4]
            e8.bf0 r7 = new e8.bf0
            r8 = r6[r4]
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r5)
            e8.ye0[] r8 = (e8.ye0[]) r8
            r7.<init>(r8)
            r10[r4] = r7
            r7 = r12[r4]
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r7, r5)
            int[][] r5 = (int[][]) r5
            r12[r4] = r5
            r5 = r0[r4]
            int r5 = r5.f8143a
            r9[r4] = r5
            int r4 = r4 + 1
            goto L_0x00c7
        L_0x00ee:
            int r4 = r0.length
            r3 = r3[r4]
            e8.bf0 r13 = new e8.bf0
            int r4 = r0.length
            r4 = r6[r4]
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r4, r3)
            e8.ye0[] r3 = (e8.ye0[]) r3
            r13.<init>(r3)
            r3 = r1
            e8.ff0 r3 = (e8.ff0) r3
            int r4 = r0.length
            e8.kf0[] r5 = new e8.kf0[r4]
            java.util.concurrent.atomic.AtomicReference<e8.ef0> r3 = r3.f14616d
            java.lang.Object r3 = r3.get()
            e8.ef0 r3 = (e8.ef0) r3
            r6 = 0
            r7 = 0
        L_0x010f:
            r8 = 2
            if (r6 >= r4) goto L_0x0370
            r15 = r0[r6]
            int r15 = r15.f8143a
            if (r8 != r15) goto L_0x0344
            if (r7 != 0) goto L_0x032d
            r7 = r10[r6]
            r15 = r12[r6]
            int r8 = r3.f14461b
            int r14 = r3.f14462c
            int r2 = r3.f14463d
            r20 = r13
            int r13 = r3.f14466g
            r21 = r11
            int r11 = r3.f14467h
            r22 = r9
            boolean r9 = r3.f14468i
            boolean r1 = r3.f14464e
            r23 = r12
            boolean r12 = r3.f14465f
            r24 = r3
            r28 = r4
            r29 = r10
            r0 = 0
            r3 = 0
            r4 = 0
            r25 = 0
            r26 = -1
            r27 = -1
        L_0x0145:
            int r10 = r7.f14006a
            if (r3 >= r10) goto L_0x030d
            e8.ye0[] r10 = r7.f14007b
            r10 = r10[r3]
            r30 = r7
            java.util.ArrayList r7 = new java.util.ArrayList
            r31 = r5
            int r5 = r10.f17620a
            r7.<init>(r5)
            r32 = r6
            r5 = 0
        L_0x015b:
            int r6 = r10.f17620a
            if (r5 >= r6) goto L_0x0169
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r7.add(r6)
            int r5 = r5 + 1
            goto L_0x015b
        L_0x0169:
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r13 == r5) goto L_0x0231
            if (r11 != r5) goto L_0x0172
            goto L_0x0231
        L_0x0172:
            r33 = r0
            r6 = 0
        L_0x0175:
            int r0 = r10.f17620a
            if (r6 >= r0) goto L_0x01fb
            e8.bc0[] r0 = r10.f17621b
            r0 = r0[r6]
            r34 = r4
            int r4 = r0.f13924r
            if (r4 <= 0) goto L_0x01e1
            r35 = r1
            int r1 = r0.f13925s
            if (r1 <= 0) goto L_0x01e3
            r36 = r9
            if (r9 == 0) goto L_0x01a1
            if (r4 <= r1) goto L_0x0191
            r9 = 1
            goto L_0x0192
        L_0x0191:
            r9 = 0
        L_0x0192:
            r37 = r11
            if (r13 <= r11) goto L_0x0198
            r11 = 1
            goto L_0x0199
        L_0x0198:
            r11 = 0
        L_0x0199:
            if (r9 == r11) goto L_0x01a3
            r9 = r13
            r38 = r9
            r11 = r37
            goto L_0x01a8
        L_0x01a1:
            r37 = r11
        L_0x01a3:
            r11 = r13
            r38 = r11
            r9 = r37
        L_0x01a8:
            int r13 = r4 * r9
            r39 = r2
            int r2 = r1 * r11
            if (r13 < r2) goto L_0x01ba
            android.graphics.Point r1 = new android.graphics.Point
            int r2 = e8.eg0.h(r2, r4)
            r1.<init>(r11, r2)
            goto L_0x01c4
        L_0x01ba:
            android.graphics.Point r2 = new android.graphics.Point
            int r1 = e8.eg0.h(r13, r1)
            r2.<init>(r1, r9)
            r1 = r2
        L_0x01c4:
            int r2 = r0.f13924r
            int r0 = r0.f13925s
            int r4 = r2 * r0
            int r9 = r1.x
            float r9 = (float) r9
            r11 = 1065017672(0x3f7ae148, float:0.98)
            float r9 = r9 * r11
            int r9 = (int) r9
            if (r2 < r9) goto L_0x01eb
            int r1 = r1.y
            float r1 = (float) r1
            float r1 = r1 * r11
            int r1 = (int) r1
            if (r0 < r1) goto L_0x01eb
            if (r4 >= r5) goto L_0x01eb
            r5 = r4
            goto L_0x01eb
        L_0x01e1:
            r35 = r1
        L_0x01e3:
            r39 = r2
            r36 = r9
            r37 = r11
            r38 = r13
        L_0x01eb:
            int r6 = r6 + 1
            r4 = r34
            r1 = r35
            r9 = r36
            r11 = r37
            r13 = r38
            r2 = r39
            goto L_0x0175
        L_0x01fb:
            r35 = r1
            r39 = r2
            r34 = r4
            r36 = r9
            r37 = r11
            r38 = r13
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r5 == r0) goto L_0x023f
            int r0 = r7.size()
            r1 = 1
            int r0 = r0 - r1
        L_0x0212:
            if (r0 < 0) goto L_0x023f
            java.lang.Object r1 = r7.get(r0)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            e8.bc0[] r2 = r10.f17621b
            r1 = r2[r1]
            int r1 = r1.j()
            r2 = -1
            if (r1 == r2) goto L_0x022b
            if (r1 <= r5) goto L_0x022e
        L_0x022b:
            r7.remove(r0)
        L_0x022e:
            int r0 = r0 + -1
            goto L_0x0212
        L_0x0231:
            r33 = r0
            r35 = r1
            r39 = r2
            r34 = r4
            r36 = r9
            r37 = r11
            r38 = r13
        L_0x023f:
            r0 = r15[r3]
            r2 = r25
            r5 = r26
            r6 = r27
            r4 = r34
            r1 = 0
        L_0x024a:
            int r9 = r10.f17620a
            if (r1 >= r9) goto L_0x02ee
            r9 = r0[r1]
            boolean r9 = e8.ff0.d(r9, r12)
            if (r9 == 0) goto L_0x02da
            e8.bc0[] r9 = r10.f17621b
            r9 = r9[r1]
            java.lang.Integer r11 = java.lang.Integer.valueOf(r1)
            boolean r11 = r7.contains(r11)
            if (r11 == 0) goto L_0x027e
            int r11 = r9.f13924r
            r13 = -1
            if (r11 == r13) goto L_0x026b
            if (r11 > r8) goto L_0x027e
        L_0x026b:
            int r11 = r9.f13925s
            if (r11 == r13) goto L_0x0271
            if (r11 > r14) goto L_0x027e
        L_0x0271:
            int r11 = r9.f13916b
            if (r11 == r13) goto L_0x027a
            r13 = r39
            if (r11 > r13) goto L_0x0280
            goto L_0x027c
        L_0x027a:
            r13 = r39
        L_0x027c:
            r11 = 1
            goto L_0x0281
        L_0x027e:
            r13 = r39
        L_0x0280:
            r11 = 0
        L_0x0281:
            if (r11 != 0) goto L_0x028d
            if (r35 == 0) goto L_0x0286
            goto L_0x028d
        L_0x0286:
            r27 = r0
            r25 = r4
            r26 = r7
            goto L_0x02e2
        L_0x028d:
            r25 = r4
            r26 = r7
            if (r11 == 0) goto L_0x0295
            r4 = 2
            goto L_0x0296
        L_0x0295:
            r4 = 1
        L_0x0296:
            r7 = r0[r1]
            r27 = r0
            r0 = 0
            boolean r7 = e8.ff0.d(r7, r0)
            if (r7 == 0) goto L_0x02a3
            int r4 = r4 + 1000
        L_0x02a3:
            if (r4 <= r2) goto L_0x02a7
            r0 = 1
            goto L_0x02a8
        L_0x02a7:
            r0 = 0
        L_0x02a8:
            if (r4 != r2) goto L_0x02cb
            int r0 = r9.j()
            if (r0 == r5) goto L_0x02b9
            int r0 = r9.j()
            int r0 = e8.ff0.c(r0, r5)
            goto L_0x02bf
        L_0x02b9:
            int r0 = r9.f13916b
            int r0 = e8.ff0.c(r0, r6)
        L_0x02bf:
            if (r7 == 0) goto L_0x02c6
            if (r11 == 0) goto L_0x02c6
            if (r0 <= 0) goto L_0x02ca
            goto L_0x02c8
        L_0x02c6:
            if (r0 >= 0) goto L_0x02ca
        L_0x02c8:
            r0 = 1
            goto L_0x02cb
        L_0x02ca:
            r0 = 0
        L_0x02cb:
            if (r0 == 0) goto L_0x02e2
            int r0 = r9.f13916b
            int r2 = r9.j()
            r6 = r0
            r33 = r1
            r5 = r2
            r2 = r4
            r4 = r10
            goto L_0x02e4
        L_0x02da:
            r27 = r0
            r25 = r4
            r26 = r7
            r13 = r39
        L_0x02e2:
            r4 = r25
        L_0x02e4:
            int r1 = r1 + 1
            r39 = r13
            r7 = r26
            r0 = r27
            goto L_0x024a
        L_0x02ee:
            r25 = r4
            r13 = r39
            int r3 = r3 + 1
            r26 = r5
            r27 = r6
            r7 = r30
            r5 = r31
            r6 = r32
            r0 = r33
            r1 = r35
            r9 = r36
            r11 = r37
            r25 = r2
            r2 = r13
            r13 = r38
            goto L_0x0145
        L_0x030d:
            r33 = r0
            r34 = r4
            r31 = r5
            r32 = r6
            if (r34 != 0) goto L_0x0319
            r15 = 0
            goto L_0x0322
        L_0x0319:
            e8.hf0 r15 = new e8.hf0
            r0 = r33
            r1 = r34
            r15.<init>(r1, r0)
        L_0x0322:
            r31[r32] = r15
            r0 = r31[r32]
            if (r0 == 0) goto L_0x032a
            r0 = 1
            goto L_0x032b
        L_0x032a:
            r0 = 0
        L_0x032b:
            r7 = r0
            goto L_0x033f
        L_0x032d:
            r24 = r3
            r28 = r4
            r31 = r5
            r32 = r6
            r22 = r9
            r29 = r10
            r21 = r11
            r23 = r12
            r20 = r13
        L_0x033f:
            r0 = r29[r32]
            int r0 = r0.f14006a
            goto L_0x0356
        L_0x0344:
            r24 = r3
            r28 = r4
            r31 = r5
            r32 = r6
            r22 = r9
            r29 = r10
            r21 = r11
            r23 = r12
            r20 = r13
        L_0x0356:
            int r6 = r32 + 1
            r1 = r40
            r0 = r41
            r2 = r42
            r13 = r20
            r11 = r21
            r9 = r22
            r12 = r23
            r3 = r24
            r4 = r28
            r10 = r29
            r5 = r31
            goto L_0x010f
        L_0x0370:
            r24 = r3
            r31 = r5
            r22 = r9
            r29 = r10
            r21 = r11
            r23 = r12
            r20 = r13
            r3 = r4
            r0 = 0
            r1 = 0
            r2 = 0
        L_0x0382:
            if (r0 >= r3) goto L_0x0520
            r4 = r41
            r5 = r4[r0]
            int r5 = r5.f8143a
            r6 = 1
            if (r5 == r6) goto L_0x048a
            r6 = 2
            if (r5 == r6) goto L_0x0484
            r9 = 3
            if (r5 == r9) goto L_0x0407
            r5 = r4[r0]
            r5.getClass()
            r5 = r29[r0]
            r7 = r23[r0]
            r8 = r24
            boolean r10 = r8.f14465f
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
        L_0x03a4:
            int r15 = r5.f14006a
            if (r11 >= r15) goto L_0x03f8
            e8.ye0[] r15 = r5.f14007b
            r15 = r15[r11]
            r18 = r7[r11]
            r6 = 0
        L_0x03af:
            int r9 = r15.f17620a
            if (r6 >= r9) goto L_0x03ef
            r9 = r18[r6]
            boolean r9 = e8.ff0.d(r9, r10)
            if (r9 == 0) goto L_0x03e4
            e8.bc0[] r9 = r15.f17621b
            r9 = r9[r6]
            int r9 = r9.F
            r17 = 1
            r9 = r9 & 1
            if (r9 == 0) goto L_0x03c9
            r9 = 1
            goto L_0x03ca
        L_0x03c9:
            r9 = 0
        L_0x03ca:
            r28 = r3
            if (r9 == 0) goto L_0x03d0
            r9 = 2
            goto L_0x03d1
        L_0x03d0:
            r9 = 1
        L_0x03d1:
            r3 = r18[r6]
            r25 = r5
            r5 = 0
            boolean r3 = e8.ff0.d(r3, r5)
            if (r3 == 0) goto L_0x03de
            int r9 = r9 + 1000
        L_0x03de:
            if (r9 <= r13) goto L_0x03e8
            r12 = r6
            r13 = r9
            r14 = r15
            goto L_0x03e8
        L_0x03e4:
            r28 = r3
            r25 = r5
        L_0x03e8:
            int r6 = r6 + 1
            r5 = r25
            r3 = r28
            goto L_0x03af
        L_0x03ef:
            r28 = r3
            r25 = r5
            int r11 = r11 + 1
            r6 = 2
            r9 = 3
            goto L_0x03a4
        L_0x03f8:
            r28 = r3
            if (r14 != 0) goto L_0x03fe
            r3 = 0
            goto L_0x0403
        L_0x03fe:
            e8.hf0 r3 = new e8.hf0
            r3.<init>(r14, r12)
        L_0x0403:
            r31[r0] = r3
            goto L_0x0510
        L_0x0407:
            r28 = r3
            r8 = r24
            if (r2 != 0) goto L_0x0510
            r2 = r29[r0]
            r3 = r23[r0]
            boolean r5 = r8.f14465f
            r6 = 0
            r7 = 0
            r9 = 0
            r10 = 0
        L_0x0417:
            int r11 = r2.f14006a
            if (r6 >= r11) goto L_0x046e
            e8.ye0[] r11 = r2.f14007b
            r11 = r11[r6]
            r12 = r3[r6]
            r13 = r10
            r10 = r9
            r9 = r7
            r7 = 0
        L_0x0425:
            int r14 = r11.f17620a
            if (r7 >= r14) goto L_0x0466
            r14 = r12[r7]
            boolean r14 = e8.ff0.d(r14, r5)
            if (r14 == 0) goto L_0x045f
            e8.bc0[] r14 = r11.f17621b
            r14 = r14[r7]
            int r14 = r14.F
            r15 = r14 & 1
            if (r15 == 0) goto L_0x043d
            r15 = 1
            goto L_0x043e
        L_0x043d:
            r15 = 0
        L_0x043e:
            r14 = r14 & 2
            if (r14 == 0) goto L_0x0444
            r14 = 1
            goto L_0x0445
        L_0x0444:
            r14 = 0
        L_0x0445:
            if (r15 == 0) goto L_0x0449
            r14 = 3
            goto L_0x044c
        L_0x0449:
            if (r14 == 0) goto L_0x045f
            r14 = 1
        L_0x044c:
            r15 = r12[r7]
            r18 = r2
            r2 = 0
            boolean r15 = e8.ff0.d(r15, r2)
            if (r15 == 0) goto L_0x0459
            int r14 = r14 + 1000
        L_0x0459:
            if (r14 <= r10) goto L_0x0461
            r9 = r7
            r13 = r11
            r10 = r14
            goto L_0x0461
        L_0x045f:
            r18 = r2
        L_0x0461:
            int r7 = r7 + 1
            r2 = r18
            goto L_0x0425
        L_0x0466:
            r18 = r2
            int r6 = r6 + 1
            r7 = r9
            r9 = r10
            r10 = r13
            goto L_0x0417
        L_0x046e:
            if (r10 != 0) goto L_0x0472
            r2 = 0
            goto L_0x0477
        L_0x0472:
            e8.hf0 r2 = new e8.hf0
            r2.<init>(r10, r7)
        L_0x0477:
            r31[r0] = r2
            r2 = r31[r0]
            if (r2 == 0) goto L_0x047f
            r7 = 1
            goto L_0x0480
        L_0x047f:
            r7 = 0
        L_0x0480:
            r16 = r7
            goto L_0x0512
        L_0x0484:
            r28 = r3
            r8 = r24
            goto L_0x0510
        L_0x048a:
            r28 = r3
            r8 = r24
            if (r1 != 0) goto L_0x0510
            r1 = r29[r0]
            r3 = r23[r0]
            boolean r5 = r8.f14465f
            r6 = 0
            r7 = 0
            r9 = -1
            r10 = -1
        L_0x049a:
            int r11 = r1.f14006a
            if (r6 >= r11) goto L_0x04f2
            e8.ye0[] r11 = r1.f14007b
            r11 = r11[r6]
            r12 = r3[r6]
            r13 = r10
            r10 = r9
            r9 = r7
            r7 = 0
        L_0x04a8:
            int r14 = r11.f17620a
            if (r7 >= r14) goto L_0x04e5
            r14 = r12[r7]
            boolean r14 = e8.ff0.d(r14, r5)
            if (r14 == 0) goto L_0x04db
            e8.bc0[] r14 = r11.f17621b
            r14 = r14[r7]
            r15 = r12[r7]
            int r14 = r14.F
            r17 = 1
            r14 = r14 & 1
            if (r14 == 0) goto L_0x04c4
            r14 = 1
            goto L_0x04c5
        L_0x04c4:
            r14 = 0
        L_0x04c5:
            r16 = r2
            r2 = 0
            if (r14 == 0) goto L_0x04cc
            r14 = 2
            goto L_0x04cd
        L_0x04cc:
            r14 = 1
        L_0x04cd:
            boolean r15 = e8.ff0.d(r15, r2)
            if (r15 == 0) goto L_0x04d5
            int r14 = r14 + 1000
        L_0x04d5:
            if (r14 <= r9) goto L_0x04e0
            r10 = r6
            r13 = r7
            r9 = r14
            goto L_0x04e0
        L_0x04db:
            r16 = r2
            r2 = 0
            r17 = 1
        L_0x04e0:
            int r7 = r7 + 1
            r2 = r16
            goto L_0x04a8
        L_0x04e5:
            r16 = r2
            r2 = 0
            r17 = 1
            int r6 = r6 + 1
            r7 = r9
            r9 = r10
            r10 = r13
            r2 = r16
            goto L_0x049a
        L_0x04f2:
            r16 = r2
            r2 = 0
            r6 = -1
            r17 = 1
            if (r9 != r6) goto L_0x04fc
            r3 = 0
            goto L_0x0505
        L_0x04fc:
            e8.ye0[] r1 = r1.f14007b
            r1 = r1[r9]
            e8.hf0 r3 = new e8.hf0
            r3.<init>(r1, r10)
        L_0x0505:
            r31[r0] = r3
            r1 = r31[r0]
            if (r1 == 0) goto L_0x050d
            r7 = 1
            goto L_0x050e
        L_0x050d:
            r7 = 0
        L_0x050e:
            r1 = r7
            goto L_0x0516
        L_0x0510:
            r16 = r2
        L_0x0512:
            r2 = 0
            r6 = -1
            r17 = 1
        L_0x0516:
            int r0 = r0 + 1
            r24 = r8
            r2 = r16
            r3 = r28
            goto L_0x0382
        L_0x0520:
            r4 = r41
            r2 = 0
            r0 = 0
        L_0x0524:
            int r1 = r4.length
            if (r0 >= r1) goto L_0x0555
            r1 = r40
            android.util.SparseBooleanArray r3 = r1.f6901c
            boolean r3 = r3.get(r0)
            if (r3 == 0) goto L_0x0535
            r3 = 0
            r31[r0] = r3
            goto L_0x054c
        L_0x0535:
            r3 = 0
            r5 = r29[r0]
            android.util.SparseArray<java.util.Map<e8.bf0, e8.if0>> r6 = r1.f6900b
            java.lang.Object r6 = r6.get(r0)
            java.util.Map r6 = (java.util.Map) r6
            if (r6 != 0) goto L_0x0544
            r5 = r3
            goto L_0x054a
        L_0x0544:
            java.lang.Object r5 = r6.get(r5)
            e8.if0 r5 = (e8.if0) r5
        L_0x054a:
            if (r5 != 0) goto L_0x054f
        L_0x054c:
            int r0 = r0 + 1
            goto L_0x0524
        L_0x054f:
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError
            r0.<init>()
            throw r0
        L_0x0555:
            r1 = r40
            r3 = 0
            e8.jf0 r0 = new e8.jf0
            r8 = r0
            r9 = r22
            r10 = r29
            r11 = r21
            r12 = r23
            r13 = r20
            r8.<init>(r9, r10, r11, r12, r13)
            int r5 = r4.length
            e8.ec0[] r5 = new e8.ec0[r5]
            r7 = 0
        L_0x056c:
            int r2 = r4.length
            if (r7 >= r2) goto L_0x057c
            r2 = r31[r7]
            if (r2 == 0) goto L_0x0576
            e8.ec0 r2 = e8.ec0.f14396a
            goto L_0x0577
        L_0x0576:
            r2 = r3
        L_0x0577:
            r5[r7] = r2
            int r7 = r7 + 1
            goto L_0x056c
        L_0x057c:
            e8.mf0 r2 = new e8.mf0
            e8.lf0 r3 = new e8.lf0
            r4 = r31
            r3.<init>(r4)
            r4 = r42
            r2.<init>(r4, r3, r0, r5)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.hu.a(com.google.android.gms.internal.ads.ss[], e8.bf0):e8.mf0");
    }

    public final void b(Object obj) {
        jf0 jf0 = (jf0) obj;
    }
}
