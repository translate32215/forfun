package com.google.android.gms.internal.ads;

import androidx.activity.e;
import androidx.appcompat.widget.o;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.startapp.b4;
import e8.e90;
import e8.f80;
import e8.ft;
import e8.ha0;
import e8.j90;
import e8.m80;
import e8.v70;
import e8.v80;
import e8.z70;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class eq<T> implements iq<T> {

    /* renamed from: q  reason: collision with root package name */
    public static final int[] f6296q = new int[0];

    /* renamed from: r  reason: collision with root package name */
    public static final Unsafe f6297r = oq.j();

    /* renamed from: a  reason: collision with root package name */
    public final int[] f6298a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f6299b;

    /* renamed from: c  reason: collision with root package name */
    public final int f6300c;

    /* renamed from: d  reason: collision with root package name */
    public final int f6301d;

    /* renamed from: e  reason: collision with root package name */
    public final cq f6302e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f6303f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f6304g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f6305h;

    /* renamed from: i  reason: collision with root package name */
    public final int[] f6306i;

    /* renamed from: j  reason: collision with root package name */
    public final int f6307j;

    /* renamed from: k  reason: collision with root package name */
    public final int f6308k;

    /* renamed from: l  reason: collision with root package name */
    public final e90 f6309l;

    /* renamed from: m  reason: collision with root package name */
    public final m80 f6310m;

    /* renamed from: n  reason: collision with root package name */
    public final lq<?, ?> f6311n;

    /* renamed from: o  reason: collision with root package name */
    public final vp<?> f6312o;

    /* renamed from: p  reason: collision with root package name */
    public final v80 f6313p;

    public eq(int[] iArr, Object[] objArr, int i10, int i11, cq cqVar, boolean z10, int[] iArr2, int i12, int i13, e90 e90, m80 m80, lq lqVar, vp vpVar, v80 v80) {
        this.f6298a = iArr;
        this.f6299b = objArr;
        this.f6300c = i10;
        this.f6301d = i11;
        this.f6304g = cqVar instanceof aq;
        this.f6305h = z10;
        this.f6303f = vpVar != null && vpVar.j(cqVar);
        this.f6306i = iArr2;
        this.f6307j = i12;
        this.f6308k = i13;
        this.f6309l = e90;
        this.f6310m = m80;
        this.f6311n = lqVar;
        this.f6312o = vpVar;
        this.f6302e = cqVar;
        this.f6313p = v80;
    }

    public static List<?> E(Object obj, long j10) {
        return (List) oq.u(obj, j10);
    }

    public static <T> double G(T t10, long j10) {
        return ((Double) oq.u(t10, j10)).doubleValue();
    }

    public static <T> float I(T t10, long j10) {
        return ((Float) oq.u(t10, j10)).floatValue();
    }

    public static <T> int J(T t10, long j10) {
        return ((Integer) oq.u(t10, j10)).intValue();
    }

    public static <T> long Q(T t10, long j10) {
        return ((Long) oq.u(t10, j10)).longValue();
    }

    public static <T> boolean R(T t10, long j10) {
        return ((Boolean) oq.u(t10, j10)).booleanValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:164:0x0356  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x03a5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> com.google.android.gms.internal.ads.eq o(e8.b90 r35, e8.e90 r36, e8.m80 r37, com.google.android.gms.internal.ads.lq r38, com.google.android.gms.internal.ads.vp r39, e8.v80 r40) {
        /*
            r0 = r35
            boolean r1 = r0 instanceof e8.k90
            if (r1 == 0) goto L_0x0425
            e8.k90 r0 = (e8.k90) r0
            int r1 = r0.f15248d
            r2 = 1
            r1 = r1 & r2
            r3 = 2
            if (r1 != r2) goto L_0x0011
            r1 = 1
            goto L_0x0012
        L_0x0011:
            r1 = 2
        L_0x0012:
            r4 = 0
            if (r1 != r3) goto L_0x0017
            r11 = 1
            goto L_0x0018
        L_0x0017:
            r11 = 0
        L_0x0018:
            java.lang.String r1 = r0.f15246b
            int r3 = r1.length()
            char r5 = r1.charAt(r4)
            r6 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r6) goto L_0x0032
            r5 = 1
        L_0x0028:
            int r7 = r5 + 1
            char r5 = r1.charAt(r5)
            if (r5 < r6) goto L_0x0033
            r5 = r7
            goto L_0x0028
        L_0x0032:
            r7 = 1
        L_0x0033:
            int r5 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r6) goto L_0x0052
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x003f:
            int r10 = r5 + 1
            char r5 = r1.charAt(r5)
            if (r5 < r6) goto L_0x004f
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r5 = r5 << r9
            r7 = r7 | r5
            int r9 = r9 + 13
            r5 = r10
            goto L_0x003f
        L_0x004f:
            int r5 = r5 << r9
            r7 = r7 | r5
            r5 = r10
        L_0x0052:
            if (r7 != 0) goto L_0x005f
            int[] r7 = f6296q
            r13 = r7
            r7 = 0
            r9 = 0
            r10 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            goto L_0x0170
        L_0x005f:
            int r7 = r5 + 1
            char r5 = r1.charAt(r5)
            if (r5 < r6) goto L_0x007e
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x006b:
            int r10 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r6) goto L_0x007b
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            int r7 = r7 << r9
            r5 = r5 | r7
            int r9 = r9 + 13
            r7 = r10
            goto L_0x006b
        L_0x007b:
            int r7 = r7 << r9
            r5 = r5 | r7
            r7 = r10
        L_0x007e:
            int r9 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r6) goto L_0x009d
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r10 = 13
        L_0x008a:
            int r12 = r9 + 1
            char r9 = r1.charAt(r9)
            if (r9 < r6) goto L_0x009a
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r10
            r7 = r7 | r9
            int r10 = r10 + 13
            r9 = r12
            goto L_0x008a
        L_0x009a:
            int r9 = r9 << r10
            r7 = r7 | r9
            r9 = r12
        L_0x009d:
            int r10 = r9 + 1
            char r9 = r1.charAt(r9)
            if (r9 < r6) goto L_0x00bc
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x00a9:
            int r13 = r10 + 1
            char r10 = r1.charAt(r10)
            if (r10 < r6) goto L_0x00b9
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            int r10 = r10 << r12
            r9 = r9 | r10
            int r12 = r12 + 13
            r10 = r13
            goto L_0x00a9
        L_0x00b9:
            int r10 = r10 << r12
            r9 = r9 | r10
            r10 = r13
        L_0x00bc:
            int r12 = r10 + 1
            char r10 = r1.charAt(r10)
            if (r10 < r6) goto L_0x00db
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x00c8:
            int r14 = r12 + 1
            char r12 = r1.charAt(r12)
            if (r12 < r6) goto L_0x00d8
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r10 = r10 | r12
            int r13 = r13 + 13
            r12 = r14
            goto L_0x00c8
        L_0x00d8:
            int r12 = r12 << r13
            r10 = r10 | r12
            r12 = r14
        L_0x00db:
            int r13 = r12 + 1
            char r12 = r1.charAt(r12)
            if (r12 < r6) goto L_0x00fa
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x00e7:
            int r15 = r13 + 1
            char r13 = r1.charAt(r13)
            if (r13 < r6) goto L_0x00f7
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto L_0x00e7
        L_0x00f7:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        L_0x00fa:
            int r14 = r13 + 1
            char r13 = r1.charAt(r13)
            if (r13 < r6) goto L_0x011b
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x0106:
            int r16 = r14 + 1
            char r14 = r1.charAt(r14)
            if (r14 < r6) goto L_0x0117
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L_0x0106
        L_0x0117:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
        L_0x011b:
            int r15 = r14 + 1
            char r14 = r1.charAt(r14)
            if (r14 < r6) goto L_0x013e
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x0127:
            int r17 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r6) goto L_0x0139
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r14 = r14 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L_0x0127
        L_0x0139:
            int r15 = r15 << r16
            r14 = r14 | r15
            r15 = r17
        L_0x013e:
            int r16 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r6) goto L_0x0163
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            r4 = r16
            r16 = 13
        L_0x014c:
            int r17 = r4 + 1
            char r4 = r1.charAt(r4)
            if (r4 < r6) goto L_0x015e
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 << r16
            r15 = r15 | r4
            int r16 = r16 + 13
            r4 = r17
            goto L_0x014c
        L_0x015e:
            int r4 = r4 << r16
            r15 = r15 | r4
            r16 = r17
        L_0x0163:
            int r4 = r15 + r13
            int r4 = r4 + r14
            int[] r4 = new int[r4]
            int r14 = r5 << 1
            int r14 = r14 + r7
            r7 = r13
            r13 = r4
            r4 = r5
            r5 = r16
        L_0x0170:
            sun.misc.Unsafe r8 = f6297r
            java.lang.Object[] r6 = r0.f15247c
            com.google.android.gms.internal.ads.cq r2 = r0.f15245a
            java.lang.Class r2 = r2.getClass()
            r19 = r5
            int r5 = r12 * 3
            int[] r5 = new int[r5]
            r18 = 1
            int r12 = r12 << 1
            java.lang.Object[] r12 = new java.lang.Object[r12]
            int r20 = r15 + r7
            r22 = r15
            r7 = r19
            r23 = r20
            r19 = 0
            r21 = 0
        L_0x0192:
            if (r7 >= r3) goto L_0x03f8
            int r24 = r7 + 1
            char r7 = r1.charAt(r7)
            r25 = r3
            r3 = 55296(0xd800, float:7.7486E-41)
            if (r7 < r3) goto L_0x01c6
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r3 = r24
            r24 = 13
        L_0x01a7:
            int r26 = r3 + 1
            char r3 = r1.charAt(r3)
            r27 = r15
            r15 = 55296(0xd800, float:7.7486E-41)
            if (r3 < r15) goto L_0x01c0
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            int r3 = r3 << r24
            r7 = r7 | r3
            int r24 = r24 + 13
            r3 = r26
            r15 = r27
            goto L_0x01a7
        L_0x01c0:
            int r3 = r3 << r24
            r7 = r7 | r3
            r3 = r26
            goto L_0x01ca
        L_0x01c6:
            r27 = r15
            r3 = r24
        L_0x01ca:
            int r15 = r3 + 1
            char r3 = r1.charAt(r3)
            r24 = r15
            r15 = 55296(0xd800, float:7.7486E-41)
            if (r3 < r15) goto L_0x01fc
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r15 = r24
            r24 = 13
        L_0x01dd:
            int r26 = r15 + 1
            char r15 = r1.charAt(r15)
            r28 = r10
            r10 = 55296(0xd800, float:7.7486E-41)
            if (r15 < r10) goto L_0x01f6
            r10 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r10 = r10 << r24
            r3 = r3 | r10
            int r24 = r24 + 13
            r15 = r26
            r10 = r28
            goto L_0x01dd
        L_0x01f6:
            int r10 = r15 << r24
            r3 = r3 | r10
            r15 = r26
            goto L_0x0200
        L_0x01fc:
            r28 = r10
            r15 = r24
        L_0x0200:
            r10 = r3 & 255(0xff, float:3.57E-43)
            r24 = r9
            r9 = r3 & 1024(0x400, float:1.435E-42)
            if (r9 == 0) goto L_0x020e
            int r9 = r19 + 1
            r13[r19] = r21
            r19 = r9
        L_0x020e:
            r9 = 51
            if (r10 < r9) goto L_0x02bc
            int r9 = r15 + 1
            char r15 = r1.charAt(r15)
            r26 = r9
            r9 = 55296(0xd800, float:7.7486E-41)
            if (r15 < r9) goto L_0x0246
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            r32 = 13
            r34 = r26
            r26 = r15
            r15 = r34
        L_0x0229:
            int r33 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r9) goto L_0x023f
            r9 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r32
            r26 = r26 | r9
            int r32 = r32 + 13
            r15 = r33
            r9 = 55296(0xd800, float:7.7486E-41)
            goto L_0x0229
        L_0x023f:
            int r9 = r15 << r32
            r15 = r26 | r9
            r9 = r33
            goto L_0x0248
        L_0x0246:
            r9 = r26
        L_0x0248:
            r26 = r9
            int r9 = r10 + -51
            r32 = r0
            r0 = 9
            if (r9 == r0) goto L_0x026b
            r0 = 17
            if (r9 != r0) goto L_0x0257
            goto L_0x026b
        L_0x0257:
            r0 = 12
            if (r9 != r0) goto L_0x0269
            if (r11 != 0) goto L_0x0269
            int r0 = r21 / 3
            r9 = 1
            int r0 = r0 << r9
            int r0 = r0 + r9
            int r9 = r14 + 1
            r14 = r6[r14]
            r12[r0] = r14
            r14 = r9
        L_0x0269:
            r9 = 1
            goto L_0x0278
        L_0x026b:
            int r0 = r21 / 3
            r9 = 1
            int r0 = r0 << r9
            int r0 = r0 + r9
            int r18 = r14 + 1
            r14 = r6[r14]
            r12[r0] = r14
            r14 = r18
        L_0x0278:
            int r0 = r15 << 1
            r9 = r6[r0]
            boolean r15 = r9 instanceof java.lang.reflect.Field
            if (r15 == 0) goto L_0x0283
            java.lang.reflect.Field r9 = (java.lang.reflect.Field) r9
            goto L_0x028b
        L_0x0283:
            java.lang.String r9 = (java.lang.String) r9
            java.lang.reflect.Field r9 = q(r2, r9)
            r6[r0] = r9
        L_0x028b:
            r29 = r14
            long r14 = r8.objectFieldOffset(r9)
            int r9 = (int) r14
            int r0 = r0 + 1
            r14 = r6[r0]
            boolean r15 = r14 instanceof java.lang.reflect.Field
            if (r15 == 0) goto L_0x029d
            java.lang.reflect.Field r14 = (java.lang.reflect.Field) r14
            goto L_0x02a5
        L_0x029d:
            java.lang.String r14 = (java.lang.String) r14
            java.lang.reflect.Field r14 = q(r2, r14)
            r6[r0] = r14
        L_0x02a5:
            long r14 = r8.objectFieldOffset(r14)
            int r0 = (int) r14
            r30 = r1
            r14 = r11
            r15 = r26
            r31 = r29
            r17 = 1
            r1 = r0
            r29 = r12
            r0 = 55296(0xd800, float:7.7486E-41)
            r12 = 0
            goto L_0x03c0
        L_0x02bc:
            r32 = r0
            int r0 = r14 + 1
            r9 = r6[r14]
            java.lang.String r9 = (java.lang.String) r9
            java.lang.reflect.Field r9 = q(r2, r9)
            r14 = 9
            if (r10 == r14) goto L_0x0336
            r14 = 17
            if (r10 != r14) goto L_0x02d2
            goto L_0x0336
        L_0x02d2:
            r14 = 27
            if (r10 == r14) goto L_0x0325
            r14 = 49
            if (r10 != r14) goto L_0x02db
            goto L_0x0325
        L_0x02db:
            r14 = 12
            if (r10 == r14) goto L_0x0311
            r14 = 30
            if (r10 == r14) goto L_0x0311
            r14 = 44
            if (r10 != r14) goto L_0x02e8
            goto L_0x0311
        L_0x02e8:
            r14 = 50
            if (r10 != r14) goto L_0x0344
            int r14 = r22 + 1
            r13[r22] = r21
            int r22 = r21 / 3
            r18 = 1
            int r22 = r22 << 1
            int r29 = r0 + 1
            r0 = r6[r0]
            r12[r22] = r0
            r0 = r3 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x030e
            int r22 = r22 + 1
            int r0 = r29 + 1
            r29 = r6[r29]
            r12[r22] = r29
            r29 = r12
            r22 = r14
            r14 = r11
            goto L_0x0347
        L_0x030e:
            r22 = r14
            goto L_0x0333
        L_0x0311:
            if (r11 != 0) goto L_0x0322
            int r14 = r21 / 3
            r18 = 1
            int r14 = r14 << 1
            int r14 = r14 + 1
            int r29 = r0 + 1
            r0 = r6[r0]
            r12[r14] = r0
            goto L_0x0333
        L_0x0322:
            r18 = 1
            goto L_0x0344
        L_0x0325:
            r18 = 1
            int r14 = r21 / 3
            int r14 = r14 << 1
            int r14 = r14 + 1
            int r29 = r0 + 1
            r0 = r6[r0]
            r12[r14] = r0
        L_0x0333:
            r0 = r29
            goto L_0x0344
        L_0x0336:
            r18 = 1
            int r14 = r21 / 3
            int r14 = r14 << 1
            int r14 = r14 + 1
            java.lang.Class r29 = r9.getType()
            r12[r14] = r29
        L_0x0344:
            r14 = r11
            r29 = r12
        L_0x0347:
            long r11 = r8.objectFieldOffset(r9)
            int r9 = (int) r11
            r11 = r3 & 4096(0x1000, float:5.74E-42)
            r12 = 4096(0x1000, float:5.74E-42)
            if (r11 != r12) goto L_0x03a5
            r11 = 17
            if (r10 > r11) goto L_0x03a5
            int r11 = r15 + 1
            char r12 = r1.charAt(r15)
            r15 = 55296(0xd800, float:7.7486E-41)
            if (r12 < r15) goto L_0x037c
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r17 = 13
        L_0x0365:
            int r30 = r11 + 1
            char r11 = r1.charAt(r11)
            if (r11 < r15) goto L_0x0377
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            int r11 = r11 << r17
            r12 = r12 | r11
            int r17 = r17 + 13
            r11 = r30
            goto L_0x0365
        L_0x0377:
            int r11 = r11 << r17
            r12 = r12 | r11
            r11 = r30
        L_0x037c:
            r17 = 1
            int r18 = r4 << 1
            int r30 = r12 / 32
            int r30 = r30 + r18
            r15 = r6[r30]
            r31 = r0
            boolean r0 = r15 instanceof java.lang.reflect.Field
            if (r0 == 0) goto L_0x038f
            java.lang.reflect.Field r15 = (java.lang.reflect.Field) r15
            goto L_0x0397
        L_0x038f:
            java.lang.String r15 = (java.lang.String) r15
            java.lang.reflect.Field r15 = q(r2, r15)
            r6[r30] = r15
        L_0x0397:
            r30 = r1
            long r0 = r8.objectFieldOffset(r15)
            int r1 = (int) r0
            int r12 = r12 % 32
            r15 = r11
            r0 = 55296(0xd800, float:7.7486E-41)
            goto L_0x03b2
        L_0x03a5:
            r31 = r0
            r30 = r1
            r0 = 55296(0xd800, float:7.7486E-41)
            r17 = 1
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r12 = 0
        L_0x03b2:
            r11 = 18
            if (r10 < r11) goto L_0x03c0
            r11 = 49
            if (r10 > r11) goto L_0x03c0
            int r11 = r23 + 1
            r13[r23] = r9
            r23 = r11
        L_0x03c0:
            int r11 = r21 + 1
            r5[r21] = r7
            int r7 = r11 + 1
            r0 = r3 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x03cd
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x03ce
        L_0x03cd:
            r0 = 0
        L_0x03ce:
            r3 = r3 & 256(0x100, float:3.59E-43)
            if (r3 == 0) goto L_0x03d5
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x03d6
        L_0x03d5:
            r3 = 0
        L_0x03d6:
            r0 = r0 | r3
            int r3 = r10 << 20
            r0 = r0 | r3
            r0 = r0 | r9
            r5[r11] = r0
            int r21 = r7 + 1
            int r0 = r12 << 20
            r0 = r0 | r1
            r5[r7] = r0
            r11 = r14
            r7 = r15
            r9 = r24
            r3 = r25
            r15 = r27
            r10 = r28
            r12 = r29
            r1 = r30
            r14 = r31
            r0 = r32
            goto L_0x0192
        L_0x03f8:
            r32 = r0
            r24 = r9
            r28 = r10
            r14 = r11
            r29 = r12
            r27 = r15
            com.google.android.gms.internal.ads.eq r0 = new com.google.android.gms.internal.ads.eq
            r1 = r32
            com.google.android.gms.internal.ads.cq r10 = r1.f15245a
            r1 = r5
            r5 = r0
            r6 = r1
            r7 = r29
            r8 = r24
            r9 = r28
            r12 = r13
            r13 = r27
            r14 = r20
            r15 = r36
            r16 = r37
            r17 = r38
            r18 = r39
            r19 = r40
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r0
        L_0x0425:
            e8.x90 r0 = (e8.x90) r0
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError
            r0.<init>()
            goto L_0x042e
        L_0x042d:
            throw r0
        L_0x042e:
            goto L_0x042d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.eq.o(e8.b90, e8.e90, e8.m80, com.google.android.gms.internal.ads.lq, com.google.android.gms.internal.ads.vp, e8.v80):com.google.android.gms.internal.ads.eq");
    }

    public static Field q(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            throw new RuntimeException(e.a(j4.e.a(o.a(arrays, name.length() + o.a(str, 40)), "Field ", str, " for ", name), " not found. Known fields are ", arrays));
        }
    }

    public static void r(int i10, Object obj, ha0 ha0) throws IOException {
        if (obj instanceof String) {
            ((tp) ha0).f8209a.O(i10, (String) obj);
            return;
        }
        ((tp) ha0).f8209a.e(i10, (mp) obj);
    }

    public static <UT, UB> void s(lq<UT, UB> lqVar, T t10, ha0 ha0) throws IOException {
        lqVar.d(lqVar.j(t10), ha0);
    }

    public static nq z(Object obj) {
        aq aqVar = (aq) obj;
        nq nqVar = aqVar.zziou;
        if (nqVar != nq.f7603f) {
            return nqVar;
        }
        nq d10 = nq.d();
        aqVar.zziou = d10;
        return d10;
    }

    public final void A(T t10, int i10, int i11) {
        oq.f7704d.e(t10, (long) (this.f6298a[i11 + 2] & 1048575), i10);
    }

    /* JADX WARNING: Removed duplicated region for block: B:168:0x0527  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0031  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void B(T r18, e8.ha0 r19) throws java.io.IOException {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            boolean r3 = r0.f6303f
            if (r3 == 0) goto L_0x0023
            com.google.android.gms.internal.ads.vp<?> r3 = r0.f6312o
            com.google.android.gms.internal.ads.xp r3 = r3.g(r1)
            e8.p90<T, java.lang.Object> r5 = r3.f8565a
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x0023
            java.util.Iterator r3 = r3.b()
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0025
        L_0x0023:
            r3 = 0
            r5 = 0
        L_0x0025:
            int[] r6 = r0.f6298a
            int r6 = r6.length
            sun.misc.Unsafe r7 = f6297r
            r10 = 0
            r11 = 1048575(0xfffff, float:1.469367E-39)
            r12 = 0
        L_0x002f:
            if (r10 >= r6) goto L_0x0525
            int r13 = r0.N(r10)
            int[] r14 = r0.f6298a
            r15 = r14[r10]
            r16 = 267386880(0xff00000, float:2.3665827E-29)
            r16 = r13 & r16
            int r4 = r16 >>> 20
            r9 = 17
            if (r4 > r9) goto L_0x005a
            int r9 = r10 + 2
            r9 = r14[r9]
            r14 = 1048575(0xfffff, float:1.469367E-39)
            r8 = r9 & r14
            if (r8 == r11) goto L_0x0054
            long r11 = (long) r8
            int r12 = r7.getInt(r1, r11)
            r11 = r8
        L_0x0054:
            int r8 = r9 >>> 20
            r9 = 1
            int r8 = r9 << r8
            goto L_0x005b
        L_0x005a:
            r8 = 0
        L_0x005b:
            if (r5 == 0) goto L_0x0079
            com.google.android.gms.internal.ads.vp<?> r9 = r0.f6312o
            int r9 = r9.a(r5)
            if (r9 > r15) goto L_0x0079
            com.google.android.gms.internal.ads.vp<?> r9 = r0.f6312o
            r9.f(r2, r5)
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0077
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x005b
        L_0x0077:
            r5 = 0
            goto L_0x005b
        L_0x0079:
            r9 = 1048575(0xfffff, float:1.469367E-39)
            r13 = r13 & r9
            long r13 = (long) r13
            switch(r4) {
                case 0: goto L_0x0513;
                case 1: goto L_0x0504;
                case 2: goto L_0x04f3;
                case 3: goto L_0x04e2;
                case 4: goto L_0x04d1;
                case 5: goto L_0x04c0;
                case 6: goto L_0x04af;
                case 7: goto L_0x049d;
                case 8: goto L_0x0490;
                case 9: goto L_0x047c;
                case 10: goto L_0x0468;
                case 11: goto L_0x0456;
                case 12: goto L_0x0444;
                case 13: goto L_0x0432;
                case 14: goto L_0x0420;
                case 15: goto L_0x0410;
                case 16: goto L_0x0400;
                case 17: goto L_0x03ec;
                case 18: goto L_0x03dc;
                case 19: goto L_0x03cc;
                case 20: goto L_0x03bc;
                case 21: goto L_0x03ac;
                case 22: goto L_0x039c;
                case 23: goto L_0x038c;
                case 24: goto L_0x037c;
                case 25: goto L_0x036c;
                case 26: goto L_0x035d;
                case 27: goto L_0x034a;
                case 28: goto L_0x033b;
                case 29: goto L_0x032b;
                case 30: goto L_0x031b;
                case 31: goto L_0x030b;
                case 32: goto L_0x02fb;
                case 33: goto L_0x02eb;
                case 34: goto L_0x02db;
                case 35: goto L_0x02cb;
                case 36: goto L_0x02bb;
                case 37: goto L_0x02ab;
                case 38: goto L_0x029b;
                case 39: goto L_0x028b;
                case 40: goto L_0x027b;
                case 41: goto L_0x026b;
                case 42: goto L_0x025b;
                case 43: goto L_0x024b;
                case 44: goto L_0x023b;
                case 45: goto L_0x022b;
                case 46: goto L_0x021b;
                case 47: goto L_0x020b;
                case 48: goto L_0x01fb;
                case 49: goto L_0x01e8;
                case 50: goto L_0x01df;
                case 51: goto L_0x01cd;
                case 52: goto L_0x01bb;
                case 53: goto L_0x01a7;
                case 54: goto L_0x0193;
                case 55: goto L_0x017f;
                case 56: goto L_0x016b;
                case 57: goto L_0x0157;
                case 58: goto L_0x0143;
                case 59: goto L_0x0134;
                case 60: goto L_0x011e;
                case 61: goto L_0x0108;
                case 62: goto L_0x00f4;
                case 63: goto L_0x00e1;
                case 64: goto L_0x00ce;
                case 65: goto L_0x00bb;
                case 66: goto L_0x00aa;
                case 67: goto L_0x0099;
                case 68: goto L_0x0084;
                default: goto L_0x0081;
            }
        L_0x0081:
            r4 = 0
            goto L_0x0521
        L_0x0084:
            boolean r4 = r0.w(r1, r15, r10)
            if (r4 == 0) goto L_0x0081
            java.lang.Object r4 = r7.getObject(r1, r13)
            com.google.android.gms.internal.ads.iq r8 = r0.K(r10)
            r13 = r2
            com.google.android.gms.internal.ads.tp r13 = (com.google.android.gms.internal.ads.tp) r13
            r13.e(r15, r4, r8)
            goto L_0x0081
        L_0x0099:
            boolean r4 = r0.w(r1, r15, r10)
            if (r4 == 0) goto L_0x0081
            long r13 = Q(r1, r13)
            r4 = r2
            com.google.android.gms.internal.ads.tp r4 = (com.google.android.gms.internal.ads.tp) r4
            r4.g(r15, r13)
            goto L_0x0081
        L_0x00aa:
            boolean r4 = r0.w(r1, r15, r10)
            if (r4 == 0) goto L_0x0081
            int r4 = J(r1, r13)
            r8 = r2
            com.google.android.gms.internal.ads.tp r8 = (com.google.android.gms.internal.ads.tp) r8
            r8.c(r15, r4)
            goto L_0x0081
        L_0x00bb:
            boolean r4 = r0.w(r1, r15, r10)
            if (r4 == 0) goto L_0x0081
            long r13 = Q(r1, r13)
            r4 = r2
            com.google.android.gms.internal.ads.tp r4 = (com.google.android.gms.internal.ads.tp) r4
            com.google.android.gms.internal.ads.sp r4 = r4.f8209a
            r4.R(r15, r13)
            goto L_0x0081
        L_0x00ce:
            boolean r4 = r0.w(r1, r15, r10)
            if (r4 == 0) goto L_0x0081
            int r4 = J(r1, r13)
            r8 = r2
            com.google.android.gms.internal.ads.tp r8 = (com.google.android.gms.internal.ads.tp) r8
            com.google.android.gms.internal.ads.sp r8 = r8.f8209a
            r8.j(r15, r4)
            goto L_0x0081
        L_0x00e1:
            boolean r4 = r0.w(r1, r15, r10)
            if (r4 == 0) goto L_0x0081
            int r4 = J(r1, r13)
            r8 = r2
            com.google.android.gms.internal.ads.tp r8 = (com.google.android.gms.internal.ads.tp) r8
            com.google.android.gms.internal.ads.sp r8 = r8.f8209a
            r8.h(r15, r4)
            goto L_0x0081
        L_0x00f4:
            boolean r4 = r0.w(r1, r15, r10)
            if (r4 == 0) goto L_0x0081
            int r4 = J(r1, r13)
            r8 = r2
            com.google.android.gms.internal.ads.tp r8 = (com.google.android.gms.internal.ads.tp) r8
            com.google.android.gms.internal.ads.sp r8 = r8.f8209a
            r8.i(r15, r4)
            goto L_0x0081
        L_0x0108:
            boolean r4 = r0.w(r1, r15, r10)
            if (r4 == 0) goto L_0x0081
            java.lang.Object r4 = r7.getObject(r1, r13)
            com.google.android.gms.internal.ads.mp r4 = (com.google.android.gms.internal.ads.mp) r4
            r8 = r2
            com.google.android.gms.internal.ads.tp r8 = (com.google.android.gms.internal.ads.tp) r8
            com.google.android.gms.internal.ads.sp r8 = r8.f8209a
            r8.e(r15, r4)
            goto L_0x0081
        L_0x011e:
            boolean r4 = r0.w(r1, r15, r10)
            if (r4 == 0) goto L_0x0081
            java.lang.Object r4 = r7.getObject(r1, r13)
            com.google.android.gms.internal.ads.iq r8 = r0.K(r10)
            r13 = r2
            com.google.android.gms.internal.ads.tp r13 = (com.google.android.gms.internal.ads.tp) r13
            r13.b(r15, r4, r8)
            goto L_0x0081
        L_0x0134:
            boolean r4 = r0.w(r1, r15, r10)
            if (r4 == 0) goto L_0x0081
            java.lang.Object r4 = r7.getObject(r1, r13)
            r(r15, r4, r2)
            goto L_0x0081
        L_0x0143:
            boolean r4 = r0.w(r1, r15, r10)
            if (r4 == 0) goto L_0x0081
            boolean r4 = R(r1, r13)
            r8 = r2
            com.google.android.gms.internal.ads.tp r8 = (com.google.android.gms.internal.ads.tp) r8
            com.google.android.gms.internal.ads.sp r8 = r8.f8209a
            r8.K(r15, r4)
            goto L_0x0081
        L_0x0157:
            boolean r4 = r0.w(r1, r15, r10)
            if (r4 == 0) goto L_0x0081
            int r4 = J(r1, r13)
            r8 = r2
            com.google.android.gms.internal.ads.tp r8 = (com.google.android.gms.internal.ads.tp) r8
            com.google.android.gms.internal.ads.sp r8 = r8.f8209a
            r8.j(r15, r4)
            goto L_0x0081
        L_0x016b:
            boolean r4 = r0.w(r1, r15, r10)
            if (r4 == 0) goto L_0x0081
            long r13 = Q(r1, r13)
            r4 = r2
            com.google.android.gms.internal.ads.tp r4 = (com.google.android.gms.internal.ads.tp) r4
            com.google.android.gms.internal.ads.sp r4 = r4.f8209a
            r4.R(r15, r13)
            goto L_0x0081
        L_0x017f:
            boolean r4 = r0.w(r1, r15, r10)
            if (r4 == 0) goto L_0x0081
            int r4 = J(r1, r13)
            r8 = r2
            com.google.android.gms.internal.ads.tp r8 = (com.google.android.gms.internal.ads.tp) r8
            com.google.android.gms.internal.ads.sp r8 = r8.f8209a
            r8.h(r15, r4)
            goto L_0x0081
        L_0x0193:
            boolean r4 = r0.w(r1, r15, r10)
            if (r4 == 0) goto L_0x0081
            long r13 = Q(r1, r13)
            r4 = r2
            com.google.android.gms.internal.ads.tp r4 = (com.google.android.gms.internal.ads.tp) r4
            com.google.android.gms.internal.ads.sp r4 = r4.f8209a
            r4.N(r15, r13)
            goto L_0x0081
        L_0x01a7:
            boolean r4 = r0.w(r1, r15, r10)
            if (r4 == 0) goto L_0x0081
            long r13 = Q(r1, r13)
            r4 = r2
            com.google.android.gms.internal.ads.tp r4 = (com.google.android.gms.internal.ads.tp) r4
            com.google.android.gms.internal.ads.sp r4 = r4.f8209a
            r4.N(r15, r13)
            goto L_0x0081
        L_0x01bb:
            boolean r4 = r0.w(r1, r15, r10)
            if (r4 == 0) goto L_0x0081
            float r4 = I(r1, r13)
            r8 = r2
            com.google.android.gms.internal.ads.tp r8 = (com.google.android.gms.internal.ads.tp) r8
            r8.a(r15, r4)
            goto L_0x0081
        L_0x01cd:
            boolean r4 = r0.w(r1, r15, r10)
            if (r4 == 0) goto L_0x0081
            double r13 = G(r1, r13)
            r4 = r2
            com.google.android.gms.internal.ads.tp r4 = (com.google.android.gms.internal.ads.tp) r4
            r4.d(r15, r13)
            goto L_0x0081
        L_0x01df:
            java.lang.Object r4 = r7.getObject(r1, r13)
            r0.t(r2, r15, r4, r10)
            goto L_0x0081
        L_0x01e8:
            int[] r4 = r0.f6298a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.iq r13 = r0.K(r10)
            com.google.android.gms.internal.ads.kq.q(r4, r8, r2, r13)
            goto L_0x0081
        L_0x01fb:
            int[] r4 = r0.f6298a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            r15 = 1
            com.google.android.gms.internal.ads.kq.A(r4, r8, r2, r15)
            goto L_0x0081
        L_0x020b:
            r15 = 1
            int[] r4 = r0.f6298a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.kq.G(r4, r8, r2, r15)
            goto L_0x0081
        L_0x021b:
            r15 = 1
            int[] r4 = r0.f6298a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.kq.C(r4, r8, r2, r15)
            goto L_0x0081
        L_0x022b:
            r15 = 1
            int[] r4 = r0.f6298a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.kq.I(r4, r8, r2, r15)
            goto L_0x0081
        L_0x023b:
            r15 = 1
            int[] r4 = r0.f6298a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.kq.J(r4, r8, r2, r15)
            goto L_0x0081
        L_0x024b:
            r15 = 1
            int[] r4 = r0.f6298a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.kq.F(r4, r8, r2, r15)
            goto L_0x0081
        L_0x025b:
            r15 = 1
            int[] r4 = r0.f6298a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.kq.K(r4, r8, r2, r15)
            goto L_0x0081
        L_0x026b:
            r15 = 1
            int[] r4 = r0.f6298a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.kq.H(r4, r8, r2, r15)
            goto L_0x0081
        L_0x027b:
            r15 = 1
            int[] r4 = r0.f6298a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.kq.B(r4, r8, r2, r15)
            goto L_0x0081
        L_0x028b:
            r15 = 1
            int[] r4 = r0.f6298a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.kq.D(r4, r8, r2, r15)
            goto L_0x0081
        L_0x029b:
            r15 = 1
            int[] r4 = r0.f6298a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.kq.z(r4, r8, r2, r15)
            goto L_0x0081
        L_0x02ab:
            r15 = 1
            int[] r4 = r0.f6298a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.kq.w(r4, r8, r2, r15)
            goto L_0x0081
        L_0x02bb:
            r15 = 1
            int[] r4 = r0.f6298a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.kq.r(r4, r8, r2, r15)
            goto L_0x0081
        L_0x02cb:
            r15 = 1
            int[] r4 = r0.f6298a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.kq.e(r4, r8, r2, r15)
            goto L_0x0081
        L_0x02db:
            int[] r4 = r0.f6298a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            r15 = 0
            com.google.android.gms.internal.ads.kq.A(r4, r8, r2, r15)
            goto L_0x0081
        L_0x02eb:
            r15 = 0
            int[] r4 = r0.f6298a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.kq.G(r4, r8, r2, r15)
            goto L_0x0081
        L_0x02fb:
            r15 = 0
            int[] r4 = r0.f6298a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.kq.C(r4, r8, r2, r15)
            goto L_0x0081
        L_0x030b:
            r15 = 0
            int[] r4 = r0.f6298a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.kq.I(r4, r8, r2, r15)
            goto L_0x0081
        L_0x031b:
            r15 = 0
            int[] r4 = r0.f6298a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.kq.J(r4, r8, r2, r15)
            goto L_0x0081
        L_0x032b:
            r15 = 0
            int[] r4 = r0.f6298a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.kq.F(r4, r8, r2, r15)
            goto L_0x0081
        L_0x033b:
            int[] r4 = r0.f6298a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.kq.p(r4, r8, r2)
            goto L_0x0081
        L_0x034a:
            int[] r4 = r0.f6298a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.iq r13 = r0.K(r10)
            com.google.android.gms.internal.ads.kq.d(r4, r8, r2, r13)
            goto L_0x0081
        L_0x035d:
            int[] r4 = r0.f6298a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.kq.c(r4, r8, r2)
            goto L_0x0081
        L_0x036c:
            int[] r4 = r0.f6298a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            r15 = 0
            com.google.android.gms.internal.ads.kq.K(r4, r8, r2, r15)
            goto L_0x0081
        L_0x037c:
            r15 = 0
            int[] r4 = r0.f6298a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.kq.H(r4, r8, r2, r15)
            goto L_0x0081
        L_0x038c:
            r15 = 0
            int[] r4 = r0.f6298a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.kq.B(r4, r8, r2, r15)
            goto L_0x0081
        L_0x039c:
            r15 = 0
            int[] r4 = r0.f6298a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.kq.D(r4, r8, r2, r15)
            goto L_0x0081
        L_0x03ac:
            r15 = 0
            int[] r4 = r0.f6298a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.kq.z(r4, r8, r2, r15)
            goto L_0x0081
        L_0x03bc:
            r15 = 0
            int[] r4 = r0.f6298a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.kq.w(r4, r8, r2, r15)
            goto L_0x0081
        L_0x03cc:
            r15 = 0
            int[] r4 = r0.f6298a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.kq.r(r4, r8, r2, r15)
            goto L_0x0081
        L_0x03dc:
            r15 = 0
            int[] r4 = r0.f6298a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.kq.e(r4, r8, r2, r15)
            goto L_0x0081
        L_0x03ec:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0521
            java.lang.Object r8 = r7.getObject(r1, r13)
            com.google.android.gms.internal.ads.iq r13 = r0.K(r10)
            r14 = r2
            com.google.android.gms.internal.ads.tp r14 = (com.google.android.gms.internal.ads.tp) r14
            r14.e(r15, r8, r13)
            goto L_0x0521
        L_0x0400:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0521
            long r13 = r7.getLong(r1, r13)
            r8 = r2
            com.google.android.gms.internal.ads.tp r8 = (com.google.android.gms.internal.ads.tp) r8
            r8.g(r15, r13)
            goto L_0x0521
        L_0x0410:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0521
            int r8 = r7.getInt(r1, r13)
            r13 = r2
            com.google.android.gms.internal.ads.tp r13 = (com.google.android.gms.internal.ads.tp) r13
            r13.c(r15, r8)
            goto L_0x0521
        L_0x0420:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0521
            long r13 = r7.getLong(r1, r13)
            r8 = r2
            com.google.android.gms.internal.ads.tp r8 = (com.google.android.gms.internal.ads.tp) r8
            com.google.android.gms.internal.ads.sp r8 = r8.f8209a
            r8.R(r15, r13)
            goto L_0x0521
        L_0x0432:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0521
            int r8 = r7.getInt(r1, r13)
            r13 = r2
            com.google.android.gms.internal.ads.tp r13 = (com.google.android.gms.internal.ads.tp) r13
            com.google.android.gms.internal.ads.sp r13 = r13.f8209a
            r13.j(r15, r8)
            goto L_0x0521
        L_0x0444:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0521
            int r8 = r7.getInt(r1, r13)
            r13 = r2
            com.google.android.gms.internal.ads.tp r13 = (com.google.android.gms.internal.ads.tp) r13
            com.google.android.gms.internal.ads.sp r13 = r13.f8209a
            r13.h(r15, r8)
            goto L_0x0521
        L_0x0456:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0521
            int r8 = r7.getInt(r1, r13)
            r13 = r2
            com.google.android.gms.internal.ads.tp r13 = (com.google.android.gms.internal.ads.tp) r13
            com.google.android.gms.internal.ads.sp r13 = r13.f8209a
            r13.i(r15, r8)
            goto L_0x0521
        L_0x0468:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0521
            java.lang.Object r8 = r7.getObject(r1, r13)
            com.google.android.gms.internal.ads.mp r8 = (com.google.android.gms.internal.ads.mp) r8
            r13 = r2
            com.google.android.gms.internal.ads.tp r13 = (com.google.android.gms.internal.ads.tp) r13
            com.google.android.gms.internal.ads.sp r13 = r13.f8209a
            r13.e(r15, r8)
            goto L_0x0521
        L_0x047c:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0521
            java.lang.Object r8 = r7.getObject(r1, r13)
            com.google.android.gms.internal.ads.iq r13 = r0.K(r10)
            r14 = r2
            com.google.android.gms.internal.ads.tp r14 = (com.google.android.gms.internal.ads.tp) r14
            r14.b(r15, r8, r13)
            goto L_0x0521
        L_0x0490:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0521
            java.lang.Object r8 = r7.getObject(r1, r13)
            r(r15, r8, r2)
            goto L_0x0521
        L_0x049d:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0521
            boolean r8 = com.google.android.gms.internal.ads.oq.r(r1, r13)
            r13 = r2
            com.google.android.gms.internal.ads.tp r13 = (com.google.android.gms.internal.ads.tp) r13
            com.google.android.gms.internal.ads.sp r13 = r13.f8209a
            r13.K(r15, r8)
            goto L_0x0521
        L_0x04af:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0521
            int r8 = r7.getInt(r1, r13)
            r13 = r2
            com.google.android.gms.internal.ads.tp r13 = (com.google.android.gms.internal.ads.tp) r13
            com.google.android.gms.internal.ads.sp r13 = r13.f8209a
            r13.j(r15, r8)
            goto L_0x0521
        L_0x04c0:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0521
            long r13 = r7.getLong(r1, r13)
            r8 = r2
            com.google.android.gms.internal.ads.tp r8 = (com.google.android.gms.internal.ads.tp) r8
            com.google.android.gms.internal.ads.sp r8 = r8.f8209a
            r8.R(r15, r13)
            goto L_0x0521
        L_0x04d1:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0521
            int r8 = r7.getInt(r1, r13)
            r13 = r2
            com.google.android.gms.internal.ads.tp r13 = (com.google.android.gms.internal.ads.tp) r13
            com.google.android.gms.internal.ads.sp r13 = r13.f8209a
            r13.h(r15, r8)
            goto L_0x0521
        L_0x04e2:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0521
            long r13 = r7.getLong(r1, r13)
            r8 = r2
            com.google.android.gms.internal.ads.tp r8 = (com.google.android.gms.internal.ads.tp) r8
            com.google.android.gms.internal.ads.sp r8 = r8.f8209a
            r8.N(r15, r13)
            goto L_0x0521
        L_0x04f3:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0521
            long r13 = r7.getLong(r1, r13)
            r8 = r2
            com.google.android.gms.internal.ads.tp r8 = (com.google.android.gms.internal.ads.tp) r8
            com.google.android.gms.internal.ads.sp r8 = r8.f8209a
            r8.N(r15, r13)
            goto L_0x0521
        L_0x0504:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0521
            float r8 = com.google.android.gms.internal.ads.oq.s(r1, r13)
            r13 = r2
            com.google.android.gms.internal.ads.tp r13 = (com.google.android.gms.internal.ads.tp) r13
            r13.a(r15, r8)
            goto L_0x0521
        L_0x0513:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0521
            double r13 = com.google.android.gms.internal.ads.oq.t(r1, r13)
            r8 = r2
            com.google.android.gms.internal.ads.tp r8 = (com.google.android.gms.internal.ads.tp) r8
            r8.d(r15, r13)
        L_0x0521:
            int r10 = r10 + 3
            goto L_0x002f
        L_0x0525:
            if (r5 == 0) goto L_0x053c
            com.google.android.gms.internal.ads.vp<?> r4 = r0.f6312o
            r4.f(r2, r5)
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x053a
            java.lang.Object r4 = r3.next()
            r5 = r4
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0525
        L_0x053a:
            r5 = 0
            goto L_0x0525
        L_0x053c:
            com.google.android.gms.internal.ads.lq<?, ?> r3 = r0.f6311n
            s(r3, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.eq.B(java.lang.Object, e8.ha0):void");
    }

    public final void C(T t10, T t11, int i10) {
        int[] iArr = this.f6298a;
        int i11 = iArr[i10 + 1];
        int i12 = iArr[i10];
        long j10 = (long) (i11 & 1048575);
        if (w(t11, i12, i10)) {
            Object obj = null;
            if (w(t10, i12, i10)) {
                obj = oq.u(t10, j10);
            }
            Object u10 = oq.u(t11, j10);
            if (obj != null && u10 != null) {
                oq.e(t10, j10, v70.b(obj, u10));
                A(t10, i12, i10);
            } else if (u10 != null) {
                oq.e(t10, j10, u10);
                A(t10, i12, i10);
            }
        }
    }

    public final boolean D(T t10, T t11, int i10) {
        return F(t10, i10) == F(t11, i10);
    }

    public final boolean F(T t10, int i10) {
        int[] iArr = this.f6298a;
        int i11 = iArr[i10 + 2];
        long j10 = (long) (i11 & 1048575);
        if (j10 == 1048575) {
            int i12 = iArr[i10 + 1];
            long j11 = (long) (i12 & 1048575);
            switch ((i12 & 267386880) >>> 20) {
                case 0:
                    return oq.t(t10, j11) != 0.0d;
                case 1:
                    return oq.s(t10, j11) != 0.0f;
                case 2:
                    return oq.p(t10, j11) != 0;
                case 3:
                    return oq.p(t10, j11) != 0;
                case 4:
                    return oq.n(t10, j11) != 0;
                case 5:
                    return oq.p(t10, j11) != 0;
                case 6:
                    return oq.n(t10, j11) != 0;
                case 7:
                    return oq.r(t10, j11);
                case b4.f10106f /*8*/:
                    Object u10 = oq.u(t10, j11);
                    if (u10 instanceof String) {
                        return !((String) u10).isEmpty();
                    }
                    if (u10 instanceof mp) {
                        return !mp.f7494b.equals(u10);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    return oq.u(t10, j11) != null;
                case 10:
                    return !mp.f7494b.equals(oq.u(t10, j11));
                case 11:
                    return oq.n(t10, j11) != 0;
                case 12:
                    return oq.n(t10, j11) != 0;
                case 13:
                    return oq.n(t10, j11) != 0;
                case 14:
                    return oq.p(t10, j11) != 0;
                case 15:
                    return oq.n(t10, j11) != 0;
                case 16:
                    return oq.p(t10, j11) != 0;
                case 17:
                    return oq.u(t10, j11) != null;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            return (oq.n(t10, j10) & (1 << (i11 >>> 20))) != 0;
        }
    }

    public final void H(T t10, int i10) {
        int i11 = this.f6298a[i10 + 2];
        long j10 = (long) (1048575 & i11);
        if (j10 != 1048575) {
            oq.f7704d.e(t10, j10, (1 << (i11 >>> 20)) | oq.n(t10, j10));
        }
    }

    public final iq K(int i10) {
        int i11 = (i10 / 3) << 1;
        Object[] objArr = this.f6299b;
        iq iqVar = (iq) objArr[i11];
        if (iqVar != null) {
            return iqVar;
        }
        iq b10 = j90.f15105c.b((Class) objArr[i11 + 1]);
        this.f6299b[i11] = b10;
        return b10;
    }

    public final Object L(int i10) {
        return this.f6299b[(i10 / 3) << 1];
    }

    public final z70 M(int i10) {
        return (z70) this.f6299b[((i10 / 3) << 1) + 1];
    }

    public final int N(int i10) {
        return this.f6298a[i10 + 1];
    }

    public final int O(int i10) {
        return this.f6298a[i10 + 2];
    }

    public final int P(int i10) {
        if (i10 < this.f6300c || i10 > this.f6301d) {
            return -1;
        }
        return y(i10, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0195, code lost:
        r2 = r4 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01a9, code lost:
        r2 = r4 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01ab, code lost:
        r12.putInt(r1, r13, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, long r26, int r28, e8.ft r29) throws java.io.IOException {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = r19
            r2 = r21
            r8 = r22
            r5 = r23
            r9 = r26
            r6 = r28
            r11 = r29
            sun.misc.Unsafe r12 = f6297r
            int[] r7 = r0.f6298a
            int r13 = r6 + 2
            r7 = r7[r13]
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r7 & r13
            long r13 = (long) r7
            r7 = 3
            r15 = 1
            switch(r25) {
                case 51: goto L_0x0198;
                case 52: goto L_0x0183;
                case 53: goto L_0x0173;
                case 54: goto L_0x0173;
                case 55: goto L_0x0163;
                case 56: goto L_0x0155;
                case 57: goto L_0x0146;
                case 58: goto L_0x012e;
                case 59: goto L_0x00f9;
                case 60: goto L_0x00ca;
                case 61: goto L_0x00bc;
                case 62: goto L_0x0163;
                case 63: goto L_0x0089;
                case 64: goto L_0x0146;
                case 65: goto L_0x0155;
                case 66: goto L_0x0074;
                case 67: goto L_0x005f;
                case 68: goto L_0x0028;
                default: goto L_0x0026;
            }
        L_0x0026:
            goto L_0x01af
        L_0x0028:
            if (r5 != r7) goto L_0x01af
            r2 = r2 & -8
            r7 = r2 | 4
            com.google.android.gms.internal.ads.iq r2 = r0.K(r6)
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r7
            r7 = r29
            int r2 = com.google.android.gms.internal.ads.lp.f(r2, r3, r4, r5, r6, r7)
            int r3 = r12.getInt(r1, r13)
            if (r3 != r8) goto L_0x004a
            java.lang.Object r15 = r12.getObject(r1, r9)
            goto L_0x004b
        L_0x004a:
            r15 = 0
        L_0x004b:
            if (r15 != 0) goto L_0x0054
            java.lang.Object r3 = r11.f14679b
            r12.putObject(r1, r9, r3)
            goto L_0x01ab
        L_0x0054:
            java.lang.Object r3 = r11.f14679b
            java.lang.Object r3 = e8.v70.b(r15, r3)
            r12.putObject(r1, r9, r3)
            goto L_0x01ab
        L_0x005f:
            if (r5 != 0) goto L_0x01af
            int r2 = com.google.android.gms.internal.ads.lp.j(r3, r4, r11)
            long r3 = r11.f14678a
            long r3 = com.google.android.gms.internal.ads.op.v(r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r12.putObject(r1, r9, r3)
            goto L_0x01ab
        L_0x0074:
            if (r5 != 0) goto L_0x01af
            int r2 = com.google.android.gms.internal.ads.lp.h(r3, r4, r11)
            int r3 = r11.f14681d
            int r3 = com.google.android.gms.internal.ads.op.A(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r12.putObject(r1, r9, r3)
            goto L_0x01ab
        L_0x0089:
            if (r5 != 0) goto L_0x01af
            int r3 = com.google.android.gms.internal.ads.lp.h(r3, r4, r11)
            int r4 = r11.f14681d
            java.lang.Object[] r5 = r0.f6299b
            int r6 = r6 / r7
            int r6 = r6 << r15
            int r6 = r6 + r15
            r5 = r5[r6]
            e8.z70 r5 = (e8.z70) r5
            if (r5 == 0) goto L_0x00b2
            boolean r5 = r5.a(r4)
            if (r5 == 0) goto L_0x00a3
            goto L_0x00b2
        L_0x00a3:
            com.google.android.gms.internal.ads.nq r1 = z(r17)
            long r4 = (long) r4
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r1.e(r2, r4)
            r2 = r3
            goto L_0x01b0
        L_0x00b2:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r12.putObject(r1, r9, r2)
            r2 = r3
            goto L_0x01ab
        L_0x00bc:
            r2 = 2
            if (r5 != r2) goto L_0x01af
            int r2 = com.google.android.gms.internal.ads.lp.m(r3, r4, r11)
            java.lang.Object r3 = r11.f14679b
            r12.putObject(r1, r9, r3)
            goto L_0x01ab
        L_0x00ca:
            r2 = 2
            if (r5 != r2) goto L_0x01af
            com.google.android.gms.internal.ads.iq r2 = r0.K(r6)
            r5 = r20
            int r2 = com.google.android.gms.internal.ads.lp.g(r2, r3, r4, r5, r11)
            int r3 = r12.getInt(r1, r13)
            if (r3 != r8) goto L_0x00e2
            java.lang.Object r15 = r12.getObject(r1, r9)
            goto L_0x00e3
        L_0x00e2:
            r15 = 0
        L_0x00e3:
            if (r15 != 0) goto L_0x00eb
            java.lang.Object r3 = r11.f14679b
            r12.putObject(r1, r9, r3)
            goto L_0x00f4
        L_0x00eb:
            java.lang.Object r3 = r11.f14679b
            java.lang.Object r3 = e8.v70.b(r15, r3)
            r12.putObject(r1, r9, r3)
        L_0x00f4:
            r12.putInt(r1, r13, r8)
            goto L_0x01b0
        L_0x00f9:
            r2 = 2
            if (r5 != r2) goto L_0x01af
            int r2 = com.google.android.gms.internal.ads.lp.h(r3, r4, r11)
            int r4 = r11.f14681d
            if (r4 != 0) goto L_0x010a
            java.lang.String r3 = ""
            r12.putObject(r1, r9, r3)
            goto L_0x0129
        L_0x010a:
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            r5 = r24 & r5
            if (r5 == 0) goto L_0x011e
            int r5 = r2 + r4
            boolean r5 = com.google.android.gms.internal.ads.qq.d(r3, r2, r5)
            if (r5 == 0) goto L_0x0119
            goto L_0x011e
        L_0x0119:
            e8.f80 r1 = e8.f80.h()
            throw r1
        L_0x011e:
            java.lang.String r5 = new java.lang.String
            java.nio.charset.Charset r6 = e8.v70.f17029a
            r5.<init>(r3, r2, r4, r6)
            r12.putObject(r1, r9, r5)
            int r2 = r2 + r4
        L_0x0129:
            r12.putInt(r1, r13, r8)
            goto L_0x01b0
        L_0x012e:
            if (r5 != 0) goto L_0x01af
            int r2 = com.google.android.gms.internal.ads.lp.j(r3, r4, r11)
            long r3 = r11.f14678a
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x013d
            goto L_0x013e
        L_0x013d:
            r15 = 0
        L_0x013e:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r15)
            r12.putObject(r1, r9, r3)
            goto L_0x01ab
        L_0x0146:
            r2 = 5
            if (r5 != r2) goto L_0x01af
            int r2 = com.google.android.gms.internal.ads.lp.n(r18, r19)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r12.putObject(r1, r9, r2)
            goto L_0x0195
        L_0x0155:
            if (r5 != r15) goto L_0x01af
            long r2 = com.google.android.gms.internal.ads.lp.o(r18, r19)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r12.putObject(r1, r9, r2)
            goto L_0x01a9
        L_0x0163:
            if (r5 != 0) goto L_0x01af
            int r2 = com.google.android.gms.internal.ads.lp.h(r3, r4, r11)
            int r3 = r11.f14681d
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r12.putObject(r1, r9, r3)
            goto L_0x01ab
        L_0x0173:
            if (r5 != 0) goto L_0x01af
            int r2 = com.google.android.gms.internal.ads.lp.j(r3, r4, r11)
            long r3 = r11.f14678a
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r12.putObject(r1, r9, r3)
            goto L_0x01ab
        L_0x0183:
            r2 = 5
            if (r5 != r2) goto L_0x01af
            int r2 = com.google.android.gms.internal.ads.lp.n(r18, r19)
            float r2 = java.lang.Float.intBitsToFloat(r2)
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            r12.putObject(r1, r9, r2)
        L_0x0195:
            int r2 = r4 + 4
            goto L_0x01ab
        L_0x0198:
            if (r5 != r15) goto L_0x01af
            long r2 = com.google.android.gms.internal.ads.lp.o(r18, r19)
            double r2 = java.lang.Double.longBitsToDouble(r2)
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            r12.putObject(r1, r9, r2)
        L_0x01a9:
            int r2 = r4 + 8
        L_0x01ab:
            r12.putInt(r1, r13, r8)
            goto L_0x01b0
        L_0x01af:
            r2 = r4
        L_0x01b0:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.eq.a(java.lang.Object, byte[], int, int, int, int, int, int, int, long, int, e8.ft):int");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x043d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01ed  */
    public final int b(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, long r25, int r27, long r28, e8.ft r30) throws java.io.IOException {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = r19
            r5 = r20
            r2 = r21
            r6 = r23
            r8 = r24
            r9 = r28
            r7 = r30
            sun.misc.Unsafe r11 = f6297r
            java.lang.Object r12 = r11.getObject(r1, r9)
            e8.c80 r12 = (e8.c80) r12
            boolean r13 = r12.k()
            r14 = 1
            if (r13 != 0) goto L_0x0034
            int r13 = r12.size()
            if (r13 != 0) goto L_0x002c
            r13 = 10
            goto L_0x002d
        L_0x002c:
            int r13 = r13 << r14
        L_0x002d:
            e8.c80 r12 = r12.r(r13)
            r11.putObject(r1, r9, r12)
        L_0x0034:
            r9 = 5
            r10 = 0
            r13 = 2
            r15 = 3
            switch(r27) {
                case 18: goto L_0x03f3;
                case 19: goto L_0x03a8;
                case 20: goto L_0x0367;
                case 21: goto L_0x0367;
                case 22: goto L_0x034d;
                case 23: goto L_0x030e;
                case 24: goto L_0x02cf;
                case 25: goto L_0x0278;
                case 26: goto L_0x01c5;
                case 27: goto L_0x01ab;
                case 28: goto L_0x0153;
                case 29: goto L_0x034d;
                case 30: goto L_0x0117;
                case 31: goto L_0x02cf;
                case 32: goto L_0x030e;
                case 33: goto L_0x00ca;
                case 34: goto L_0x007d;
                case 35: goto L_0x03f3;
                case 36: goto L_0x03a8;
                case 37: goto L_0x0367;
                case 38: goto L_0x0367;
                case 39: goto L_0x034d;
                case 40: goto L_0x030e;
                case 41: goto L_0x02cf;
                case 42: goto L_0x0278;
                case 43: goto L_0x034d;
                case 44: goto L_0x0117;
                case 45: goto L_0x02cf;
                case 46: goto L_0x030e;
                case 47: goto L_0x00ca;
                case 48: goto L_0x007d;
                case 49: goto L_0x003e;
                default: goto L_0x003c;
            }
        L_0x003c:
            goto L_0x043d
        L_0x003e:
            if (r6 != r15) goto L_0x043d
            com.google.android.gms.internal.ads.iq r1 = r0.K(r8)
            r6 = r2 & -8
            r6 = r6 | 4
            r22 = r1
            r23 = r18
            r24 = r19
            r25 = r20
            r26 = r6
            r27 = r30
            int r4 = com.google.android.gms.internal.ads.lp.f(r22, r23, r24, r25, r26, r27)
            java.lang.Object r8 = r7.f14679b
            r12.add(r8)
        L_0x005d:
            if (r4 >= r5) goto L_0x043d
            int r8 = com.google.android.gms.internal.ads.lp.h(r3, r4, r7)
            int r9 = r7.f14681d
            if (r2 != r9) goto L_0x043d
            r22 = r1
            r23 = r18
            r24 = r8
            r25 = r20
            r26 = r6
            r27 = r30
            int r4 = com.google.android.gms.internal.ads.lp.f(r22, r23, r24, r25, r26, r27)
            java.lang.Object r8 = r7.f14679b
            r12.add(r8)
            goto L_0x005d
        L_0x007d:
            if (r6 != r13) goto L_0x00a1
            e8.q80 r12 = (e8.q80) r12
            int r1 = com.google.android.gms.internal.ads.lp.h(r3, r4, r7)
            int r2 = r7.f14681d
            int r2 = r2 + r1
        L_0x0088:
            if (r1 >= r2) goto L_0x0098
            int r1 = com.google.android.gms.internal.ads.lp.j(r3, r1, r7)
            long r4 = r7.f14678a
            long r4 = com.google.android.gms.internal.ads.op.v(r4)
            r12.h(r4)
            goto L_0x0088
        L_0x0098:
            if (r1 != r2) goto L_0x009c
            goto L_0x043e
        L_0x009c:
            e8.f80 r1 = e8.f80.a()
            throw r1
        L_0x00a1:
            if (r6 != 0) goto L_0x043d
            e8.q80 r12 = (e8.q80) r12
            int r1 = com.google.android.gms.internal.ads.lp.j(r3, r4, r7)
            long r8 = r7.f14678a
            long r8 = com.google.android.gms.internal.ads.op.v(r8)
            r12.h(r8)
        L_0x00b2:
            if (r1 >= r5) goto L_0x043e
            int r4 = com.google.android.gms.internal.ads.lp.h(r3, r1, r7)
            int r6 = r7.f14681d
            if (r2 != r6) goto L_0x043e
            int r1 = com.google.android.gms.internal.ads.lp.j(r3, r4, r7)
            long r8 = r7.f14678a
            long r8 = com.google.android.gms.internal.ads.op.v(r8)
            r12.h(r8)
            goto L_0x00b2
        L_0x00ca:
            if (r6 != r13) goto L_0x00ee
            e8.w70 r12 = (e8.w70) r12
            int r1 = com.google.android.gms.internal.ads.lp.h(r3, r4, r7)
            int r2 = r7.f14681d
            int r2 = r2 + r1
        L_0x00d5:
            if (r1 >= r2) goto L_0x00e5
            int r1 = com.google.android.gms.internal.ads.lp.h(r3, r1, r7)
            int r4 = r7.f14681d
            int r4 = com.google.android.gms.internal.ads.op.A(r4)
            r12.o(r4)
            goto L_0x00d5
        L_0x00e5:
            if (r1 != r2) goto L_0x00e9
            goto L_0x043e
        L_0x00e9:
            e8.f80 r1 = e8.f80.a()
            throw r1
        L_0x00ee:
            if (r6 != 0) goto L_0x043d
            e8.w70 r12 = (e8.w70) r12
            int r1 = com.google.android.gms.internal.ads.lp.h(r3, r4, r7)
            int r4 = r7.f14681d
            int r4 = com.google.android.gms.internal.ads.op.A(r4)
            r12.o(r4)
        L_0x00ff:
            if (r1 >= r5) goto L_0x043e
            int r4 = com.google.android.gms.internal.ads.lp.h(r3, r1, r7)
            int r6 = r7.f14681d
            if (r2 != r6) goto L_0x043e
            int r1 = com.google.android.gms.internal.ads.lp.h(r3, r4, r7)
            int r4 = r7.f14681d
            int r4 = com.google.android.gms.internal.ads.op.A(r4)
            r12.o(r4)
            goto L_0x00ff
        L_0x0117:
            if (r6 != r13) goto L_0x011e
            int r2 = com.google.android.gms.internal.ads.lp.i(r3, r4, r12, r7)
            goto L_0x012f
        L_0x011e:
            if (r6 != 0) goto L_0x043d
            r2 = r21
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r12
            r7 = r30
            int r2 = com.google.android.gms.internal.ads.lp.c(r2, r3, r4, r5, r6, r7)
        L_0x012f:
            com.google.android.gms.internal.ads.aq r1 = (com.google.android.gms.internal.ads.aq) r1
            com.google.android.gms.internal.ads.nq r3 = r1.zziou
            com.google.android.gms.internal.ads.nq r4 = com.google.android.gms.internal.ads.nq.f7603f
            if (r3 != r4) goto L_0x0138
            r3 = 0
        L_0x0138:
            java.lang.Object[] r4 = r0.f6299b
            int r5 = r8 / 3
            int r5 = r5 << r14
            int r5 = r5 + r14
            r4 = r4[r5]
            e8.z70 r4 = (e8.z70) r4
            com.google.android.gms.internal.ads.lq<?, ?> r5 = r0.f6311n
            r6 = r22
            java.lang.Object r3 = com.google.android.gms.internal.ads.kq.b(r6, r12, r4, r3, r5)
            com.google.android.gms.internal.ads.nq r3 = (com.google.android.gms.internal.ads.nq) r3
            if (r3 == 0) goto L_0x0150
            r1.zziou = r3
        L_0x0150:
            r1 = r2
            goto L_0x043e
        L_0x0153:
            if (r6 != r13) goto L_0x043d
            int r1 = com.google.android.gms.internal.ads.lp.h(r3, r4, r7)
            int r4 = r7.f14681d
            if (r4 < 0) goto L_0x01a6
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x01a1
            if (r4 != 0) goto L_0x0169
            com.google.android.gms.internal.ads.mp r4 = com.google.android.gms.internal.ads.mp.f7494b
            r12.add(r4)
            goto L_0x0171
        L_0x0169:
            com.google.android.gms.internal.ads.mp r6 = com.google.android.gms.internal.ads.mp.I(r3, r1, r4)
            r12.add(r6)
        L_0x0170:
            int r1 = r1 + r4
        L_0x0171:
            if (r1 >= r5) goto L_0x043e
            int r4 = com.google.android.gms.internal.ads.lp.h(r3, r1, r7)
            int r6 = r7.f14681d
            if (r2 != r6) goto L_0x043e
            int r1 = com.google.android.gms.internal.ads.lp.h(r3, r4, r7)
            int r4 = r7.f14681d
            if (r4 < 0) goto L_0x019c
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x0197
            if (r4 != 0) goto L_0x018f
            com.google.android.gms.internal.ads.mp r4 = com.google.android.gms.internal.ads.mp.f7494b
            r12.add(r4)
            goto L_0x0171
        L_0x018f:
            com.google.android.gms.internal.ads.mp r6 = com.google.android.gms.internal.ads.mp.I(r3, r1, r4)
            r12.add(r6)
            goto L_0x0170
        L_0x0197:
            e8.f80 r1 = e8.f80.a()
            throw r1
        L_0x019c:
            e8.f80 r1 = e8.f80.b()
            throw r1
        L_0x01a1:
            e8.f80 r1 = e8.f80.a()
            throw r1
        L_0x01a6:
            e8.f80 r1 = e8.f80.b()
            throw r1
        L_0x01ab:
            if (r6 != r13) goto L_0x043d
            com.google.android.gms.internal.ads.iq r1 = r0.K(r8)
            r22 = r1
            r23 = r21
            r24 = r18
            r25 = r19
            r26 = r20
            r27 = r12
            r28 = r30
            int r1 = com.google.android.gms.internal.ads.lp.e(r22, r23, r24, r25, r26, r27, r28)
            goto L_0x043e
        L_0x01c5:
            if (r6 != r13) goto L_0x043d
            r8 = 536870912(0x20000000, double:2.652494739E-315)
            long r8 = r25 & r8
            java.lang.String r1 = ""
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 != 0) goto L_0x0218
            int r4 = com.google.android.gms.internal.ads.lp.h(r3, r4, r7)
            int r6 = r7.f14681d
            if (r6 < 0) goto L_0x0213
            if (r6 != 0) goto L_0x01e0
            r12.add(r1)
            goto L_0x01eb
        L_0x01e0:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = e8.v70.f17029a
            r8.<init>(r3, r4, r6, r9)
            r12.add(r8)
        L_0x01ea:
            int r4 = r4 + r6
        L_0x01eb:
            if (r4 >= r5) goto L_0x043d
            int r6 = com.google.android.gms.internal.ads.lp.h(r3, r4, r7)
            int r8 = r7.f14681d
            if (r2 != r8) goto L_0x043d
            int r4 = com.google.android.gms.internal.ads.lp.h(r3, r6, r7)
            int r6 = r7.f14681d
            if (r6 < 0) goto L_0x020e
            if (r6 != 0) goto L_0x0203
            r12.add(r1)
            goto L_0x01eb
        L_0x0203:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = e8.v70.f17029a
            r8.<init>(r3, r4, r6, r9)
            r12.add(r8)
            goto L_0x01ea
        L_0x020e:
            e8.f80 r1 = e8.f80.b()
            throw r1
        L_0x0213:
            e8.f80 r1 = e8.f80.b()
            throw r1
        L_0x0218:
            int r4 = com.google.android.gms.internal.ads.lp.h(r3, r4, r7)
            int r6 = r7.f14681d
            if (r6 < 0) goto L_0x0273
            if (r6 != 0) goto L_0x0226
            r12.add(r1)
            goto L_0x0239
        L_0x0226:
            int r8 = r4 + r6
            boolean r9 = com.google.android.gms.internal.ads.qq.d(r3, r4, r8)
            if (r9 == 0) goto L_0x026e
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = e8.v70.f17029a
            r9.<init>(r3, r4, r6, r10)
            r12.add(r9)
        L_0x0238:
            r4 = r8
        L_0x0239:
            if (r4 >= r5) goto L_0x043d
            int r6 = com.google.android.gms.internal.ads.lp.h(r3, r4, r7)
            int r8 = r7.f14681d
            if (r2 != r8) goto L_0x043d
            int r4 = com.google.android.gms.internal.ads.lp.h(r3, r6, r7)
            int r6 = r7.f14681d
            if (r6 < 0) goto L_0x0269
            if (r6 != 0) goto L_0x0251
            r12.add(r1)
            goto L_0x0239
        L_0x0251:
            int r8 = r4 + r6
            boolean r9 = com.google.android.gms.internal.ads.qq.d(r3, r4, r8)
            if (r9 == 0) goto L_0x0264
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = e8.v70.f17029a
            r9.<init>(r3, r4, r6, r10)
            r12.add(r9)
            goto L_0x0238
        L_0x0264:
            e8.f80 r1 = e8.f80.h()
            throw r1
        L_0x0269:
            e8.f80 r1 = e8.f80.b()
            throw r1
        L_0x026e:
            e8.f80 r1 = e8.f80.h()
            throw r1
        L_0x0273:
            e8.f80 r1 = e8.f80.b()
            throw r1
        L_0x0278:
            r1 = 0
            if (r6 != r13) goto L_0x02a0
            e8.e70 r12 = (e8.e70) r12
            int r2 = com.google.android.gms.internal.ads.lp.h(r3, r4, r7)
            int r4 = r7.f14681d
            int r4 = r4 + r2
        L_0x0284:
            if (r2 >= r4) goto L_0x0297
            int r2 = com.google.android.gms.internal.ads.lp.j(r3, r2, r7)
            long r5 = r7.f14678a
            int r8 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r8 == 0) goto L_0x0292
            r5 = 1
            goto L_0x0293
        L_0x0292:
            r5 = 0
        L_0x0293:
            r12.f(r5)
            goto L_0x0284
        L_0x0297:
            if (r2 != r4) goto L_0x029b
            goto L_0x0150
        L_0x029b:
            e8.f80 r1 = e8.f80.a()
            throw r1
        L_0x02a0:
            if (r6 != 0) goto L_0x043d
            e8.e70 r12 = (e8.e70) r12
            int r4 = com.google.android.gms.internal.ads.lp.j(r3, r4, r7)
            long r8 = r7.f14678a
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x02b0
            r6 = 1
            goto L_0x02b1
        L_0x02b0:
            r6 = 0
        L_0x02b1:
            r12.f(r6)
        L_0x02b4:
            if (r4 >= r5) goto L_0x043d
            int r6 = com.google.android.gms.internal.ads.lp.h(r3, r4, r7)
            int r8 = r7.f14681d
            if (r2 != r8) goto L_0x043d
            int r4 = com.google.android.gms.internal.ads.lp.j(r3, r6, r7)
            long r8 = r7.f14678a
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x02ca
            r6 = 1
            goto L_0x02cb
        L_0x02ca:
            r6 = 0
        L_0x02cb:
            r12.f(r6)
            goto L_0x02b4
        L_0x02cf:
            if (r6 != r13) goto L_0x02ef
            e8.w70 r12 = (e8.w70) r12
            int r1 = com.google.android.gms.internal.ads.lp.h(r3, r4, r7)
            int r2 = r7.f14681d
            int r2 = r2 + r1
        L_0x02da:
            if (r1 >= r2) goto L_0x02e6
            int r4 = com.google.android.gms.internal.ads.lp.n(r3, r1)
            r12.o(r4)
            int r1 = r1 + 4
            goto L_0x02da
        L_0x02e6:
            if (r1 != r2) goto L_0x02ea
            goto L_0x043e
        L_0x02ea:
            e8.f80 r1 = e8.f80.a()
            throw r1
        L_0x02ef:
            if (r6 != r9) goto L_0x043d
            e8.w70 r12 = (e8.w70) r12
            int r1 = com.google.android.gms.internal.ads.lp.n(r18, r19)
            r12.o(r1)
        L_0x02fa:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x043e
            int r4 = com.google.android.gms.internal.ads.lp.h(r3, r1, r7)
            int r6 = r7.f14681d
            if (r2 != r6) goto L_0x043e
            int r1 = com.google.android.gms.internal.ads.lp.n(r3, r4)
            r12.o(r1)
            goto L_0x02fa
        L_0x030e:
            if (r6 != r13) goto L_0x032e
            e8.q80 r12 = (e8.q80) r12
            int r1 = com.google.android.gms.internal.ads.lp.h(r3, r4, r7)
            int r2 = r7.f14681d
            int r2 = r2 + r1
        L_0x0319:
            if (r1 >= r2) goto L_0x0325
            long r4 = com.google.android.gms.internal.ads.lp.o(r3, r1)
            r12.h(r4)
            int r1 = r1 + 8
            goto L_0x0319
        L_0x0325:
            if (r1 != r2) goto L_0x0329
            goto L_0x043e
        L_0x0329:
            e8.f80 r1 = e8.f80.a()
            throw r1
        L_0x032e:
            if (r6 != r14) goto L_0x043d
            e8.q80 r12 = (e8.q80) r12
            long r8 = com.google.android.gms.internal.ads.lp.o(r18, r19)
            r12.h(r8)
        L_0x0339:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x043e
            int r4 = com.google.android.gms.internal.ads.lp.h(r3, r1, r7)
            int r6 = r7.f14681d
            if (r2 != r6) goto L_0x043e
            long r8 = com.google.android.gms.internal.ads.lp.o(r3, r4)
            r12.h(r8)
            goto L_0x0339
        L_0x034d:
            if (r6 != r13) goto L_0x0355
            int r1 = com.google.android.gms.internal.ads.lp.i(r3, r4, r12, r7)
            goto L_0x043e
        L_0x0355:
            if (r6 != 0) goto L_0x043d
            r22 = r18
            r23 = r19
            r24 = r20
            r25 = r12
            r26 = r30
            int r1 = com.google.android.gms.internal.ads.lp.c(r21, r22, r23, r24, r25, r26)
            goto L_0x043e
        L_0x0367:
            if (r6 != r13) goto L_0x0387
            e8.q80 r12 = (e8.q80) r12
            int r1 = com.google.android.gms.internal.ads.lp.h(r3, r4, r7)
            int r2 = r7.f14681d
            int r2 = r2 + r1
        L_0x0372:
            if (r1 >= r2) goto L_0x037e
            int r1 = com.google.android.gms.internal.ads.lp.j(r3, r1, r7)
            long r4 = r7.f14678a
            r12.h(r4)
            goto L_0x0372
        L_0x037e:
            if (r1 != r2) goto L_0x0382
            goto L_0x043e
        L_0x0382:
            e8.f80 r1 = e8.f80.a()
            throw r1
        L_0x0387:
            if (r6 != 0) goto L_0x043d
            e8.q80 r12 = (e8.q80) r12
            int r1 = com.google.android.gms.internal.ads.lp.j(r3, r4, r7)
            long r8 = r7.f14678a
            r12.h(r8)
        L_0x0394:
            if (r1 >= r5) goto L_0x043e
            int r4 = com.google.android.gms.internal.ads.lp.h(r3, r1, r7)
            int r6 = r7.f14681d
            if (r2 != r6) goto L_0x043e
            int r1 = com.google.android.gms.internal.ads.lp.j(r3, r4, r7)
            long r8 = r7.f14678a
            r12.h(r8)
            goto L_0x0394
        L_0x03a8:
            if (r6 != r13) goto L_0x03cc
            e8.t70 r12 = (e8.t70) r12
            int r1 = com.google.android.gms.internal.ads.lp.h(r3, r4, r7)
            int r2 = r7.f14681d
            int r2 = r2 + r1
        L_0x03b3:
            if (r1 >= r2) goto L_0x03c3
            int r4 = com.google.android.gms.internal.ads.lp.n(r3, r1)
            float r4 = java.lang.Float.intBitsToFloat(r4)
            r12.i(r4)
            int r1 = r1 + 4
            goto L_0x03b3
        L_0x03c3:
            if (r1 != r2) goto L_0x03c7
            goto L_0x043e
        L_0x03c7:
            e8.f80 r1 = e8.f80.a()
            throw r1
        L_0x03cc:
            if (r6 != r9) goto L_0x043d
            e8.t70 r12 = (e8.t70) r12
            int r1 = com.google.android.gms.internal.ads.lp.n(r18, r19)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r12.i(r1)
        L_0x03db:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x043e
            int r4 = com.google.android.gms.internal.ads.lp.h(r3, r1, r7)
            int r6 = r7.f14681d
            if (r2 != r6) goto L_0x043e
            int r1 = com.google.android.gms.internal.ads.lp.n(r3, r4)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r12.i(r1)
            goto L_0x03db
        L_0x03f3:
            if (r6 != r13) goto L_0x0416
            e8.n70 r12 = (e8.n70) r12
            int r1 = com.google.android.gms.internal.ads.lp.h(r3, r4, r7)
            int r2 = r7.f14681d
            int r2 = r2 + r1
        L_0x03fe:
            if (r1 >= r2) goto L_0x040e
            long r4 = com.google.android.gms.internal.ads.lp.o(r3, r1)
            double r4 = java.lang.Double.longBitsToDouble(r4)
            r12.f(r4)
            int r1 = r1 + 8
            goto L_0x03fe
        L_0x040e:
            if (r1 != r2) goto L_0x0411
            goto L_0x043e
        L_0x0411:
            e8.f80 r1 = e8.f80.a()
            throw r1
        L_0x0416:
            if (r6 != r14) goto L_0x043d
            e8.n70 r12 = (e8.n70) r12
            long r8 = com.google.android.gms.internal.ads.lp.o(r18, r19)
            double r8 = java.lang.Double.longBitsToDouble(r8)
            r12.f(r8)
        L_0x0425:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x043e
            int r4 = com.google.android.gms.internal.ads.lp.h(r3, r1, r7)
            int r6 = r7.f14681d
            if (r2 != r6) goto L_0x043e
            long r8 = com.google.android.gms.internal.ads.lp.o(r3, r4)
            double r8 = java.lang.Double.longBitsToDouble(r8)
            r12.f(r8)
            goto L_0x0425
        L_0x043d:
            r1 = r4
        L_0x043e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.eq.b(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, e8.ft):int");
    }

    public final void c(T t10, T t11) {
        t11.getClass();
        for (int i10 = 0; i10 < this.f6298a.length; i10 += 3) {
            int N = N(i10);
            long j10 = (long) (1048575 & N);
            int i11 = this.f6298a[i10];
            switch ((N & 267386880) >>> 20) {
                case 0:
                    if (!F(t11, i10)) {
                        break;
                    } else {
                        oq.c(t10, j10, oq.t(t11, j10));
                        H(t10, i10);
                        break;
                    }
                case 1:
                    if (!F(t11, i10)) {
                        break;
                    } else {
                        oq.f7704d.b(t10, j10, oq.s(t11, j10));
                        H(t10, i10);
                        break;
                    }
                case 2:
                    if (!F(t11, i10)) {
                        break;
                    } else {
                        oq.d(t10, j10, oq.p(t11, j10));
                        H(t10, i10);
                        break;
                    }
                case 3:
                    if (!F(t11, i10)) {
                        break;
                    } else {
                        oq.d(t10, j10, oq.p(t11, j10));
                        H(t10, i10);
                        break;
                    }
                case 4:
                    if (!F(t11, i10)) {
                        break;
                    } else {
                        oq.f7704d.e(t10, j10, oq.n(t11, j10));
                        H(t10, i10);
                        break;
                    }
                case 5:
                    if (!F(t11, i10)) {
                        break;
                    } else {
                        oq.d(t10, j10, oq.p(t11, j10));
                        H(t10, i10);
                        break;
                    }
                case 6:
                    if (!F(t11, i10)) {
                        break;
                    } else {
                        oq.f7704d.e(t10, j10, oq.n(t11, j10));
                        H(t10, i10);
                        break;
                    }
                case 7:
                    if (!F(t11, i10)) {
                        break;
                    } else {
                        oq.f7704d.d(t10, j10, oq.r(t11, j10));
                        H(t10, i10);
                        break;
                    }
                case b4.f10106f /*8*/:
                    if (!F(t11, i10)) {
                        break;
                    } else {
                        oq.e(t10, j10, oq.u(t11, j10));
                        H(t10, i10);
                        break;
                    }
                case 9:
                    v(t10, t11, i10);
                    break;
                case 10:
                    if (!F(t11, i10)) {
                        break;
                    } else {
                        oq.e(t10, j10, oq.u(t11, j10));
                        H(t10, i10);
                        break;
                    }
                case 11:
                    if (!F(t11, i10)) {
                        break;
                    } else {
                        oq.f7704d.e(t10, j10, oq.n(t11, j10));
                        H(t10, i10);
                        break;
                    }
                case 12:
                    if (!F(t11, i10)) {
                        break;
                    } else {
                        oq.f7704d.e(t10, j10, oq.n(t11, j10));
                        H(t10, i10);
                        break;
                    }
                case 13:
                    if (!F(t11, i10)) {
                        break;
                    } else {
                        oq.f7704d.e(t10, j10, oq.n(t11, j10));
                        H(t10, i10);
                        break;
                    }
                case 14:
                    if (!F(t11, i10)) {
                        break;
                    } else {
                        oq.d(t10, j10, oq.p(t11, j10));
                        H(t10, i10);
                        break;
                    }
                case 15:
                    if (!F(t11, i10)) {
                        break;
                    } else {
                        oq.f7704d.e(t10, j10, oq.n(t11, j10));
                        H(t10, i10);
                        break;
                    }
                case 16:
                    if (!F(t11, i10)) {
                        break;
                    } else {
                        oq.d(t10, j10, oq.p(t11, j10));
                        H(t10, i10);
                        break;
                    }
                case 17:
                    v(t10, t11, i10);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.f6310m.b(t10, t11, j10);
                    break;
                case 50:
                    v80 v80 = this.f6313p;
                    Class<?> cls = kq.f7265a;
                    oq.e(t10, j10, v80.h(oq.u(t10, j10), oq.u(t11, j10)));
                    break;
                case 51:
                case ModuleDescriptor.MODULE_VERSION:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (!w(t11, i11, i10)) {
                        break;
                    } else {
                        oq.e(t10, j10, oq.u(t11, j10));
                        A(t10, i11, i10);
                        break;
                    }
                case 60:
                    C(t10, t11, i10);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!w(t11, i11, i10)) {
                        break;
                    } else {
                        oq.e(t10, j10, oq.u(t11, j10));
                        A(t10, i11, i10);
                        break;
                    }
                case 68:
                    C(t10, t11, i10);
                    break;
            }
        }
        lq<?, ?> lqVar = this.f6311n;
        Class<?> cls2 = kq.f7265a;
        lqVar.q(t10, lqVar.s(lqVar.j(t10), lqVar.j(t11)));
        if (this.f6303f) {
            kq.f(this.f6312o, t10, t11);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x059e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(T r13, e8.ha0 r14) throws java.io.IOException {
        /*
            r12 = this;
            r14.getClass()
            boolean r0 = r12.f6305h
            if (r0 == 0) goto L_0x05b8
            boolean r0 = r12.f6303f
            r1 = 0
            if (r0 == 0) goto L_0x0025
            com.google.android.gms.internal.ads.vp<?> r0 = r12.f6312o
            com.google.android.gms.internal.ads.xp r0 = r0.g(r13)
            e8.p90<T, java.lang.Object> r2 = r0.f8565a
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0025
            java.util.Iterator r0 = r0.b()
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x0027
        L_0x0025:
            r0 = r1
            r2 = r0
        L_0x0027:
            int[] r3 = r12.f6298a
            int r3 = r3.length
            r4 = 0
            r5 = 0
        L_0x002c:
            if (r5 >= r3) goto L_0x059c
            int r6 = r12.N(r5)
            int[] r7 = r12.f6298a
            r7 = r7[r5]
        L_0x0036:
            if (r2 == 0) goto L_0x0054
            com.google.android.gms.internal.ads.vp<?> r8 = r12.f6312o
            int r8 = r8.a(r2)
            if (r8 > r7) goto L_0x0054
            com.google.android.gms.internal.ads.vp<?> r8 = r12.f6312o
            r8.f(r14, r2)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0052
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x0036
        L_0x0052:
            r2 = r1
            goto L_0x0036
        L_0x0054:
            r8 = 267386880(0xff00000, float:2.3665827E-29)
            r8 = r8 & r6
            int r8 = r8 >>> 20
            r9 = 1
            r10 = 1048575(0xfffff, float:1.469367E-39)
            switch(r8) {
                case 0: goto L_0x0586;
                case 1: goto L_0x0573;
                case 2: goto L_0x055e;
                case 3: goto L_0x0549;
                case 4: goto L_0x0534;
                case 5: goto L_0x051f;
                case 6: goto L_0x0509;
                case 7: goto L_0x04f3;
                case 8: goto L_0x04e2;
                case 9: goto L_0x04ca;
                case 10: goto L_0x04b2;
                case 11: goto L_0x049c;
                case 12: goto L_0x0486;
                case 13: goto L_0x0470;
                case 14: goto L_0x045a;
                case 15: goto L_0x0446;
                case 16: goto L_0x0432;
                case 17: goto L_0x041a;
                case 18: goto L_0x0409;
                case 19: goto L_0x03f8;
                case 20: goto L_0x03e7;
                case 21: goto L_0x03d6;
                case 22: goto L_0x03c5;
                case 23: goto L_0x03b4;
                case 24: goto L_0x03a3;
                case 25: goto L_0x0392;
                case 26: goto L_0x0381;
                case 27: goto L_0x036c;
                case 28: goto L_0x035b;
                case 29: goto L_0x034a;
                case 30: goto L_0x0339;
                case 31: goto L_0x0328;
                case 32: goto L_0x0317;
                case 33: goto L_0x0306;
                case 34: goto L_0x02f5;
                case 35: goto L_0x02e4;
                case 36: goto L_0x02d3;
                case 37: goto L_0x02c2;
                case 38: goto L_0x02b1;
                case 39: goto L_0x02a0;
                case 40: goto L_0x028f;
                case 41: goto L_0x027e;
                case 42: goto L_0x026d;
                case 43: goto L_0x025c;
                case 44: goto L_0x024b;
                case 45: goto L_0x023a;
                case 46: goto L_0x0229;
                case 47: goto L_0x0218;
                case 48: goto L_0x0207;
                case 49: goto L_0x01f2;
                case 50: goto L_0x01e7;
                case 51: goto L_0x01d3;
                case 52: goto L_0x01bf;
                case 53: goto L_0x01a9;
                case 54: goto L_0x0193;
                case 55: goto L_0x017d;
                case 56: goto L_0x0167;
                case 57: goto L_0x0151;
                case 58: goto L_0x013b;
                case 59: goto L_0x012a;
                case 60: goto L_0x0112;
                case 61: goto L_0x00fa;
                case 62: goto L_0x00e4;
                case 63: goto L_0x00ce;
                case 64: goto L_0x00b8;
                case 65: goto L_0x00a2;
                case 66: goto L_0x008e;
                case 67: goto L_0x007a;
                case 68: goto L_0x0062;
                default: goto L_0x0060;
            }
        L_0x0060:
            goto L_0x0598
        L_0x0062:
            boolean r8 = r12.w(r13, r7, r5)
            if (r8 == 0) goto L_0x0598
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.ads.oq.u(r13, r8)
            com.google.android.gms.internal.ads.iq r8 = r12.K(r5)
            r9 = r14
            com.google.android.gms.internal.ads.tp r9 = (com.google.android.gms.internal.ads.tp) r9
            r9.e(r7, r6, r8)
            goto L_0x0598
        L_0x007a:
            boolean r8 = r12.w(r13, r7, r5)
            if (r8 == 0) goto L_0x0598
            r6 = r6 & r10
            long r8 = (long) r6
            long r8 = Q(r13, r8)
            r6 = r14
            com.google.android.gms.internal.ads.tp r6 = (com.google.android.gms.internal.ads.tp) r6
            r6.g(r7, r8)
            goto L_0x0598
        L_0x008e:
            boolean r8 = r12.w(r13, r7, r5)
            if (r8 == 0) goto L_0x0598
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = J(r13, r8)
            r8 = r14
            com.google.android.gms.internal.ads.tp r8 = (com.google.android.gms.internal.ads.tp) r8
            r8.c(r7, r6)
            goto L_0x0598
        L_0x00a2:
            boolean r8 = r12.w(r13, r7, r5)
            if (r8 == 0) goto L_0x0598
            r6 = r6 & r10
            long r8 = (long) r6
            long r8 = Q(r13, r8)
            r6 = r14
            com.google.android.gms.internal.ads.tp r6 = (com.google.android.gms.internal.ads.tp) r6
            com.google.android.gms.internal.ads.sp r6 = r6.f8209a
            r6.R(r7, r8)
            goto L_0x0598
        L_0x00b8:
            boolean r8 = r12.w(r13, r7, r5)
            if (r8 == 0) goto L_0x0598
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = J(r13, r8)
            r8 = r14
            com.google.android.gms.internal.ads.tp r8 = (com.google.android.gms.internal.ads.tp) r8
            com.google.android.gms.internal.ads.sp r8 = r8.f8209a
            r8.j(r7, r6)
            goto L_0x0598
        L_0x00ce:
            boolean r8 = r12.w(r13, r7, r5)
            if (r8 == 0) goto L_0x0598
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = J(r13, r8)
            r8 = r14
            com.google.android.gms.internal.ads.tp r8 = (com.google.android.gms.internal.ads.tp) r8
            com.google.android.gms.internal.ads.sp r8 = r8.f8209a
            r8.h(r7, r6)
            goto L_0x0598
        L_0x00e4:
            boolean r8 = r12.w(r13, r7, r5)
            if (r8 == 0) goto L_0x0598
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = J(r13, r8)
            r8 = r14
            com.google.android.gms.internal.ads.tp r8 = (com.google.android.gms.internal.ads.tp) r8
            com.google.android.gms.internal.ads.sp r8 = r8.f8209a
            r8.i(r7, r6)
            goto L_0x0598
        L_0x00fa:
            boolean r8 = r12.w(r13, r7, r5)
            if (r8 == 0) goto L_0x0598
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.ads.oq.u(r13, r8)
            com.google.android.gms.internal.ads.mp r6 = (com.google.android.gms.internal.ads.mp) r6
            r8 = r14
            com.google.android.gms.internal.ads.tp r8 = (com.google.android.gms.internal.ads.tp) r8
            com.google.android.gms.internal.ads.sp r8 = r8.f8209a
            r8.e(r7, r6)
            goto L_0x0598
        L_0x0112:
            boolean r8 = r12.w(r13, r7, r5)
            if (r8 == 0) goto L_0x0598
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.ads.oq.u(r13, r8)
            com.google.android.gms.internal.ads.iq r8 = r12.K(r5)
            r9 = r14
            com.google.android.gms.internal.ads.tp r9 = (com.google.android.gms.internal.ads.tp) r9
            r9.b(r7, r6, r8)
            goto L_0x0598
        L_0x012a:
            boolean r8 = r12.w(r13, r7, r5)
            if (r8 == 0) goto L_0x0598
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.ads.oq.u(r13, r8)
            r(r7, r6, r14)
            goto L_0x0598
        L_0x013b:
            boolean r8 = r12.w(r13, r7, r5)
            if (r8 == 0) goto L_0x0598
            r6 = r6 & r10
            long r8 = (long) r6
            boolean r6 = R(r13, r8)
            r8 = r14
            com.google.android.gms.internal.ads.tp r8 = (com.google.android.gms.internal.ads.tp) r8
            com.google.android.gms.internal.ads.sp r8 = r8.f8209a
            r8.K(r7, r6)
            goto L_0x0598
        L_0x0151:
            boolean r8 = r12.w(r13, r7, r5)
            if (r8 == 0) goto L_0x0598
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = J(r13, r8)
            r8 = r14
            com.google.android.gms.internal.ads.tp r8 = (com.google.android.gms.internal.ads.tp) r8
            com.google.android.gms.internal.ads.sp r8 = r8.f8209a
            r8.j(r7, r6)
            goto L_0x0598
        L_0x0167:
            boolean r8 = r12.w(r13, r7, r5)
            if (r8 == 0) goto L_0x0598
            r6 = r6 & r10
            long r8 = (long) r6
            long r8 = Q(r13, r8)
            r6 = r14
            com.google.android.gms.internal.ads.tp r6 = (com.google.android.gms.internal.ads.tp) r6
            com.google.android.gms.internal.ads.sp r6 = r6.f8209a
            r6.R(r7, r8)
            goto L_0x0598
        L_0x017d:
            boolean r8 = r12.w(r13, r7, r5)
            if (r8 == 0) goto L_0x0598
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = J(r13, r8)
            r8 = r14
            com.google.android.gms.internal.ads.tp r8 = (com.google.android.gms.internal.ads.tp) r8
            com.google.android.gms.internal.ads.sp r8 = r8.f8209a
            r8.h(r7, r6)
            goto L_0x0598
        L_0x0193:
            boolean r8 = r12.w(r13, r7, r5)
            if (r8 == 0) goto L_0x0598
            r6 = r6 & r10
            long r8 = (long) r6
            long r8 = Q(r13, r8)
            r6 = r14
            com.google.android.gms.internal.ads.tp r6 = (com.google.android.gms.internal.ads.tp) r6
            com.google.android.gms.internal.ads.sp r6 = r6.f8209a
            r6.N(r7, r8)
            goto L_0x0598
        L_0x01a9:
            boolean r8 = r12.w(r13, r7, r5)
            if (r8 == 0) goto L_0x0598
            r6 = r6 & r10
            long r8 = (long) r6
            long r8 = Q(r13, r8)
            r6 = r14
            com.google.android.gms.internal.ads.tp r6 = (com.google.android.gms.internal.ads.tp) r6
            com.google.android.gms.internal.ads.sp r6 = r6.f8209a
            r6.N(r7, r8)
            goto L_0x0598
        L_0x01bf:
            boolean r8 = r12.w(r13, r7, r5)
            if (r8 == 0) goto L_0x0598
            r6 = r6 & r10
            long r8 = (long) r6
            float r6 = I(r13, r8)
            r8 = r14
            com.google.android.gms.internal.ads.tp r8 = (com.google.android.gms.internal.ads.tp) r8
            r8.a(r7, r6)
            goto L_0x0598
        L_0x01d3:
            boolean r8 = r12.w(r13, r7, r5)
            if (r8 == 0) goto L_0x0598
            r6 = r6 & r10
            long r8 = (long) r6
            double r8 = G(r13, r8)
            r6 = r14
            com.google.android.gms.internal.ads.tp r6 = (com.google.android.gms.internal.ads.tp) r6
            r6.d(r7, r8)
            goto L_0x0598
        L_0x01e7:
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.ads.oq.u(r13, r8)
            r12.t(r14, r7, r6, r5)
            goto L_0x0598
        L_0x01f2:
            int[] r7 = r12.f6298a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.ads.oq.u(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.ads.iq r8 = r12.K(r5)
            com.google.android.gms.internal.ads.kq.q(r7, r6, r14, r8)
            goto L_0x0598
        L_0x0207:
            int[] r7 = r12.f6298a
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.ads.oq.u(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.ads.kq.A(r7, r6, r14, r9)
            goto L_0x0598
        L_0x0218:
            int[] r7 = r12.f6298a
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.ads.oq.u(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.ads.kq.G(r7, r6, r14, r9)
            goto L_0x0598
        L_0x0229:
            int[] r7 = r12.f6298a
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.ads.oq.u(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.ads.kq.C(r7, r6, r14, r9)
            goto L_0x0598
        L_0x023a:
            int[] r7 = r12.f6298a
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.ads.oq.u(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.ads.kq.I(r7, r6, r14, r9)
            goto L_0x0598
        L_0x024b:
            int[] r7 = r12.f6298a
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.ads.oq.u(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.ads.kq.J(r7, r6, r14, r9)
            goto L_0x0598
        L_0x025c:
            int[] r7 = r12.f6298a
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.ads.oq.u(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.ads.kq.F(r7, r6, r14, r9)
            goto L_0x0598
        L_0x026d:
            int[] r7 = r12.f6298a
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.ads.oq.u(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.ads.kq.K(r7, r6, r14, r9)
            goto L_0x0598
        L_0x027e:
            int[] r7 = r12.f6298a
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.ads.oq.u(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.ads.kq.H(r7, r6, r14, r9)
            goto L_0x0598
        L_0x028f:
            int[] r7 = r12.f6298a
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.ads.oq.u(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.ads.kq.B(r7, r6, r14, r9)
            goto L_0x0598
        L_0x02a0:
            int[] r7 = r12.f6298a
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.ads.oq.u(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.ads.kq.D(r7, r6, r14, r9)
            goto L_0x0598
        L_0x02b1:
            int[] r7 = r12.f6298a
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.ads.oq.u(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.ads.kq.z(r7, r6, r14, r9)
            goto L_0x0598
        L_0x02c2:
            int[] r7 = r12.f6298a
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.ads.oq.u(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.ads.kq.w(r7, r6, r14, r9)
            goto L_0x0598
        L_0x02d3:
            int[] r7 = r12.f6298a
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.ads.oq.u(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.ads.kq.r(r7, r6, r14, r9)
            goto L_0x0598
        L_0x02e4:
            int[] r7 = r12.f6298a
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.ads.oq.u(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.ads.kq.e(r7, r6, r14, r9)
            goto L_0x0598
        L_0x02f5:
            int[] r7 = r12.f6298a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.ads.oq.u(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.ads.kq.A(r7, r6, r14, r4)
            goto L_0x0598
        L_0x0306:
            int[] r7 = r12.f6298a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.ads.oq.u(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.ads.kq.G(r7, r6, r14, r4)
            goto L_0x0598
        L_0x0317:
            int[] r7 = r12.f6298a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.ads.oq.u(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.ads.kq.C(r7, r6, r14, r4)
            goto L_0x0598
        L_0x0328:
            int[] r7 = r12.f6298a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.ads.oq.u(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.ads.kq.I(r7, r6, r14, r4)
            goto L_0x0598
        L_0x0339:
            int[] r7 = r12.f6298a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.ads.oq.u(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.ads.kq.J(r7, r6, r14, r4)
            goto L_0x0598
        L_0x034a:
            int[] r7 = r12.f6298a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.ads.oq.u(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.ads.kq.F(r7, r6, r14, r4)
            goto L_0x0598
        L_0x035b:
            int[] r7 = r12.f6298a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.ads.oq.u(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.ads.kq.p(r7, r6, r14)
            goto L_0x0598
        L_0x036c:
            int[] r7 = r12.f6298a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.ads.oq.u(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.ads.iq r8 = r12.K(r5)
            com.google.android.gms.internal.ads.kq.d(r7, r6, r14, r8)
            goto L_0x0598
        L_0x0381:
            int[] r7 = r12.f6298a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.ads.oq.u(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.ads.kq.c(r7, r6, r14)
            goto L_0x0598
        L_0x0392:
            int[] r7 = r12.f6298a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.ads.oq.u(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.ads.kq.K(r7, r6, r14, r4)
            goto L_0x0598
        L_0x03a3:
            int[] r7 = r12.f6298a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.ads.oq.u(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.ads.kq.H(r7, r6, r14, r4)
            goto L_0x0598
        L_0x03b4:
            int[] r7 = r12.f6298a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.ads.oq.u(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.ads.kq.B(r7, r6, r14, r4)
            goto L_0x0598
        L_0x03c5:
            int[] r7 = r12.f6298a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.ads.oq.u(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.ads.kq.D(r7, r6, r14, r4)
            goto L_0x0598
        L_0x03d6:
            int[] r7 = r12.f6298a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.ads.oq.u(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.ads.kq.z(r7, r6, r14, r4)
            goto L_0x0598
        L_0x03e7:
            int[] r7 = r12.f6298a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.ads.oq.u(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.ads.kq.w(r7, r6, r14, r4)
            goto L_0x0598
        L_0x03f8:
            int[] r7 = r12.f6298a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.ads.oq.u(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.ads.kq.r(r7, r6, r14, r4)
            goto L_0x0598
        L_0x0409:
            int[] r7 = r12.f6298a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.ads.oq.u(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.android.gms.internal.ads.kq.e(r7, r6, r14, r4)
            goto L_0x0598
        L_0x041a:
            boolean r8 = r12.F(r13, r5)
            if (r8 == 0) goto L_0x0598
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.ads.oq.u(r13, r8)
            com.google.android.gms.internal.ads.iq r8 = r12.K(r5)
            r9 = r14
            com.google.android.gms.internal.ads.tp r9 = (com.google.android.gms.internal.ads.tp) r9
            r9.e(r7, r6, r8)
            goto L_0x0598
        L_0x0432:
            boolean r8 = r12.F(r13, r5)
            if (r8 == 0) goto L_0x0598
            r6 = r6 & r10
            long r8 = (long) r6
            long r8 = com.google.android.gms.internal.ads.oq.p(r13, r8)
            r6 = r14
            com.google.android.gms.internal.ads.tp r6 = (com.google.android.gms.internal.ads.tp) r6
            r6.g(r7, r8)
            goto L_0x0598
        L_0x0446:
            boolean r8 = r12.F(r13, r5)
            if (r8 == 0) goto L_0x0598
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = com.google.android.gms.internal.ads.oq.n(r13, r8)
            r8 = r14
            com.google.android.gms.internal.ads.tp r8 = (com.google.android.gms.internal.ads.tp) r8
            r8.c(r7, r6)
            goto L_0x0598
        L_0x045a:
            boolean r8 = r12.F(r13, r5)
            if (r8 == 0) goto L_0x0598
            r6 = r6 & r10
            long r8 = (long) r6
            long r8 = com.google.android.gms.internal.ads.oq.p(r13, r8)
            r6 = r14
            com.google.android.gms.internal.ads.tp r6 = (com.google.android.gms.internal.ads.tp) r6
            com.google.android.gms.internal.ads.sp r6 = r6.f8209a
            r6.R(r7, r8)
            goto L_0x0598
        L_0x0470:
            boolean r8 = r12.F(r13, r5)
            if (r8 == 0) goto L_0x0598
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = com.google.android.gms.internal.ads.oq.n(r13, r8)
            r8 = r14
            com.google.android.gms.internal.ads.tp r8 = (com.google.android.gms.internal.ads.tp) r8
            com.google.android.gms.internal.ads.sp r8 = r8.f8209a
            r8.j(r7, r6)
            goto L_0x0598
        L_0x0486:
            boolean r8 = r12.F(r13, r5)
            if (r8 == 0) goto L_0x0598
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = com.google.android.gms.internal.ads.oq.n(r13, r8)
            r8 = r14
            com.google.android.gms.internal.ads.tp r8 = (com.google.android.gms.internal.ads.tp) r8
            com.google.android.gms.internal.ads.sp r8 = r8.f8209a
            r8.h(r7, r6)
            goto L_0x0598
        L_0x049c:
            boolean r8 = r12.F(r13, r5)
            if (r8 == 0) goto L_0x0598
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = com.google.android.gms.internal.ads.oq.n(r13, r8)
            r8 = r14
            com.google.android.gms.internal.ads.tp r8 = (com.google.android.gms.internal.ads.tp) r8
            com.google.android.gms.internal.ads.sp r8 = r8.f8209a
            r8.i(r7, r6)
            goto L_0x0598
        L_0x04b2:
            boolean r8 = r12.F(r13, r5)
            if (r8 == 0) goto L_0x0598
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.ads.oq.u(r13, r8)
            com.google.android.gms.internal.ads.mp r6 = (com.google.android.gms.internal.ads.mp) r6
            r8 = r14
            com.google.android.gms.internal.ads.tp r8 = (com.google.android.gms.internal.ads.tp) r8
            com.google.android.gms.internal.ads.sp r8 = r8.f8209a
            r8.e(r7, r6)
            goto L_0x0598
        L_0x04ca:
            boolean r8 = r12.F(r13, r5)
            if (r8 == 0) goto L_0x0598
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.ads.oq.u(r13, r8)
            com.google.android.gms.internal.ads.iq r8 = r12.K(r5)
            r9 = r14
            com.google.android.gms.internal.ads.tp r9 = (com.google.android.gms.internal.ads.tp) r9
            r9.b(r7, r6, r8)
            goto L_0x0598
        L_0x04e2:
            boolean r8 = r12.F(r13, r5)
            if (r8 == 0) goto L_0x0598
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = com.google.android.gms.internal.ads.oq.u(r13, r8)
            r(r7, r6, r14)
            goto L_0x0598
        L_0x04f3:
            boolean r8 = r12.F(r13, r5)
            if (r8 == 0) goto L_0x0598
            r6 = r6 & r10
            long r8 = (long) r6
            boolean r6 = com.google.android.gms.internal.ads.oq.r(r13, r8)
            r8 = r14
            com.google.android.gms.internal.ads.tp r8 = (com.google.android.gms.internal.ads.tp) r8
            com.google.android.gms.internal.ads.sp r8 = r8.f8209a
            r8.K(r7, r6)
            goto L_0x0598
        L_0x0509:
            boolean r8 = r12.F(r13, r5)
            if (r8 == 0) goto L_0x0598
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = com.google.android.gms.internal.ads.oq.n(r13, r8)
            r8 = r14
            com.google.android.gms.internal.ads.tp r8 = (com.google.android.gms.internal.ads.tp) r8
            com.google.android.gms.internal.ads.sp r8 = r8.f8209a
            r8.j(r7, r6)
            goto L_0x0598
        L_0x051f:
            boolean r8 = r12.F(r13, r5)
            if (r8 == 0) goto L_0x0598
            r6 = r6 & r10
            long r8 = (long) r6
            long r8 = com.google.android.gms.internal.ads.oq.p(r13, r8)
            r6 = r14
            com.google.android.gms.internal.ads.tp r6 = (com.google.android.gms.internal.ads.tp) r6
            com.google.android.gms.internal.ads.sp r6 = r6.f8209a
            r6.R(r7, r8)
            goto L_0x0598
        L_0x0534:
            boolean r8 = r12.F(r13, r5)
            if (r8 == 0) goto L_0x0598
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = com.google.android.gms.internal.ads.oq.n(r13, r8)
            r8 = r14
            com.google.android.gms.internal.ads.tp r8 = (com.google.android.gms.internal.ads.tp) r8
            com.google.android.gms.internal.ads.sp r8 = r8.f8209a
            r8.h(r7, r6)
            goto L_0x0598
        L_0x0549:
            boolean r8 = r12.F(r13, r5)
            if (r8 == 0) goto L_0x0598
            r6 = r6 & r10
            long r8 = (long) r6
            long r8 = com.google.android.gms.internal.ads.oq.p(r13, r8)
            r6 = r14
            com.google.android.gms.internal.ads.tp r6 = (com.google.android.gms.internal.ads.tp) r6
            com.google.android.gms.internal.ads.sp r6 = r6.f8209a
            r6.N(r7, r8)
            goto L_0x0598
        L_0x055e:
            boolean r8 = r12.F(r13, r5)
            if (r8 == 0) goto L_0x0598
            r6 = r6 & r10
            long r8 = (long) r6
            long r8 = com.google.android.gms.internal.ads.oq.p(r13, r8)
            r6 = r14
            com.google.android.gms.internal.ads.tp r6 = (com.google.android.gms.internal.ads.tp) r6
            com.google.android.gms.internal.ads.sp r6 = r6.f8209a
            r6.N(r7, r8)
            goto L_0x0598
        L_0x0573:
            boolean r8 = r12.F(r13, r5)
            if (r8 == 0) goto L_0x0598
            r6 = r6 & r10
            long r8 = (long) r6
            float r6 = com.google.android.gms.internal.ads.oq.s(r13, r8)
            r8 = r14
            com.google.android.gms.internal.ads.tp r8 = (com.google.android.gms.internal.ads.tp) r8
            r8.a(r7, r6)
            goto L_0x0598
        L_0x0586:
            boolean r8 = r12.F(r13, r5)
            if (r8 == 0) goto L_0x0598
            r6 = r6 & r10
            long r8 = (long) r6
            double r8 = com.google.android.gms.internal.ads.oq.t(r13, r8)
            r6 = r14
            com.google.android.gms.internal.ads.tp r6 = (com.google.android.gms.internal.ads.tp) r6
            r6.d(r7, r8)
        L_0x0598:
            int r5 = r5 + 3
            goto L_0x002c
        L_0x059c:
            if (r2 == 0) goto L_0x05b2
            com.google.android.gms.internal.ads.vp<?> r3 = r12.f6312o
            r3.f(r14, r2)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x05b0
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x059c
        L_0x05b0:
            r2 = r1
            goto L_0x059c
        L_0x05b2:
            com.google.android.gms.internal.ads.lq<?, ?> r0 = r12.f6311n
            s(r0, r13, r14)
            return
        L_0x05b8:
            r12.B(r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.eq.d(java.lang.Object, e8.ha0):void");
    }

    public final boolean e(T t10) {
        int i10;
        int i11;
        T t11 = t10;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            boolean z10 = true;
            if (i14 >= this.f6307j) {
                return !this.f6303f || this.f6312o.g(t11).a();
            }
            int i15 = this.f6306i[i14];
            int i16 = this.f6298a[i15];
            int N = N(i15);
            int i17 = this.f6298a[i15 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1 << (i17 >>> 20);
            if (i18 != i12) {
                if (i18 != 1048575) {
                    i13 = f6297r.getInt(t11, (long) i18);
                }
                i10 = i13;
                i11 = i18;
            } else {
                i11 = i12;
                i10 = i13;
            }
            if (((268435456 & N) != 0) && !x(t10, i15, i11, i10, i19)) {
                return false;
            }
            int i20 = (267386880 & N) >>> 20;
            if (i20 != 9 && i20 != 17) {
                if (i20 != 27) {
                    if (i20 == 60 || i20 == 68) {
                        if (w(t11, i16, i15) && !K(i15).e(oq.u(t11, (long) (N & 1048575)))) {
                            return false;
                        }
                    } else if (i20 != 49) {
                        if (i20 == 50 && !this.f6313p.a(oq.u(t11, (long) (N & 1048575))).isEmpty()) {
                            this.f6313p.b(L(i15));
                            throw null;
                        }
                    }
                }
                List list = (List) oq.u(t11, (long) (N & 1048575));
                if (!list.isEmpty()) {
                    iq K = K(i15);
                    int i21 = 0;
                    while (true) {
                        if (i21 >= list.size()) {
                            break;
                        } else if (!K.e(list.get(i21))) {
                            z10 = false;
                            break;
                        } else {
                            i21++;
                        }
                    }
                }
                if (!z10) {
                    return false;
                }
            } else if (x(t10, i15, i11, i10, i19) && !K(i15).e(oq.u(t11, (long) (N & 1048575)))) {
                return false;
            }
            i14++;
            i12 = i11;
            i13 = i10;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v5, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0307, code lost:
        if (r0 == r15) goto L_0x034e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x034c, code lost:
        if (r0 == r15) goto L_0x034e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0129, code lost:
        r2 = r6;
        r33 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01b9, code lost:
        r12 = r2;
        r33 = r7;
        r2 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01be, code lost:
        r7 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01e4, code lost:
        r12 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0229, code lost:
        r5 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x026a, code lost:
        r11 = r11 | r20;
        r6 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x026e, code lost:
        r2 = r15;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(T r31, byte[] r32, int r33, int r34, e8.ft r35) throws java.io.IOException {
        /*
            r30 = this;
            r15 = r30
            boolean r0 = r15.f6305h
            if (r0 == 0) goto L_0x03a1
            sun.misc.Unsafe r14 = f6297r
            r12 = -1
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r16 = 0
            r6 = r31
            r8 = r32
            r0 = r33
            r7 = r34
            r10 = r35
            r5 = r15
            r1 = -1
            r2 = 0
            r9 = 1048575(0xfffff, float:1.469367E-39)
            r11 = 0
        L_0x001f:
            if (r0 >= r7) goto L_0x0383
            int r3 = r0 + 1
            byte r0 = r8[r0]
            if (r0 >= 0) goto L_0x0030
            int r0 = com.google.android.gms.internal.ads.lp.d(r0, r8, r3, r10)
            int r3 = r10.f14681d
            r18 = r3
            goto L_0x0033
        L_0x0030:
            r18 = r0
            r0 = r3
        L_0x0033:
            int r3 = r18 >>> 3
            r4 = r18 & 7
            if (r3 <= r1) goto L_0x004a
            int r2 = r2 / 3
            int r1 = r5.f6300c
            if (r3 < r1) goto L_0x0048
            int r1 = r5.f6301d
            if (r3 > r1) goto L_0x0048
            int r1 = r5.y(r3, r2)
            goto L_0x004e
        L_0x0048:
            r2 = -1
            goto L_0x004f
        L_0x004a:
            int r1 = r5.P(r3)
        L_0x004e:
            r2 = r1
        L_0x004f:
            if (r2 != r12) goto L_0x005a
            r24 = r3
            r12 = r14
            r2 = 0
            r25 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x026f
        L_0x005a:
            int[] r1 = r5.f6298a
            int r17 = r2 + 1
            r12 = r1[r17]
            r17 = 267386880(0xff00000, float:2.3665827E-29)
            r17 = r12 & r17
            int r15 = r17 >>> 20
            r33 = r3
            r3 = r12 & r13
            r24 = r14
            long r13 = (long) r3
            r3 = 17
            r17 = r5
            if (r15 > r3) goto L_0x0277
            int r3 = r2 + 2
            r1 = r1[r3]
            int r3 = r1 >>> 20
            r5 = 1
            int r20 = r5 << r3
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r3
            if (r1 == r9) goto L_0x009f
            if (r9 == r3) goto L_0x0090
            r21 = r4
            long r3 = (long) r9
            r9 = r24
            r9.putInt(r6, r3, r11)
            r3 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x0094
        L_0x0090:
            r21 = r4
            r9 = r24
        L_0x0094:
            if (r1 == r3) goto L_0x009c
            long r3 = (long) r1
            int r3 = r9.getInt(r6, r3)
            r11 = r3
        L_0x009c:
            r3 = r9
            r9 = r1
            goto L_0x00a3
        L_0x009f:
            r21 = r4
            r3 = r24
        L_0x00a3:
            r1 = 5
            switch(r15) {
                case 0: goto L_0x024c;
                case 1: goto L_0x022c;
                case 2: goto L_0x0203;
                case 3: goto L_0x0203;
                case 4: goto L_0x01e7;
                case 5: goto L_0x01c1;
                case 6: goto L_0x01a4;
                case 7: goto L_0x017f;
                case 8: goto L_0x015b;
                case 9: goto L_0x012e;
                case 10: goto L_0x0111;
                case 11: goto L_0x01e7;
                case 12: goto L_0x00fb;
                case 13: goto L_0x01a4;
                case 14: goto L_0x01c1;
                case 15: goto L_0x00e1;
                case 16: goto L_0x00b0;
                default: goto L_0x00a7;
            }
        L_0x00a7:
            r24 = r33
            r15 = r2
            r12 = r3
            r25 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x026e
        L_0x00b0:
            if (r21 != 0) goto L_0x00d8
            int r0 = com.google.android.gms.internal.ads.lp.j(r8, r0, r10)
            long r4 = r10.f14678a
            long r18 = com.google.android.gms.internal.ads.op.v(r4)
            r1 = r3
            r15 = r2
            r2 = r31
            r24 = r33
            r12 = r3
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r13
            r14 = r6
            r13 = r17
            r5 = r18
            r1.putLong(r2, r3, r5)
            r11 = r11 | r20
            r33 = r7
            r6 = r12
            r2 = r13
            r7 = r14
            goto L_0x0229
        L_0x00d8:
            r24 = r33
            r15 = r2
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r3
            goto L_0x026e
        L_0x00e1:
            r24 = r33
            r15 = r2
            r12 = r3
            r3 = r6
            r6 = r17
            r25 = 1048575(0xfffff, float:1.469367E-39)
            if (r21 != 0) goto L_0x026e
            int r0 = com.google.android.gms.internal.ads.lp.h(r8, r0, r10)
            int r1 = r10.f14681d
            int r1 = com.google.android.gms.internal.ads.op.A(r1)
            r12.putInt(r3, r13, r1)
            goto L_0x0129
        L_0x00fb:
            r24 = r33
            r15 = r2
            r12 = r3
            r3 = r6
            r6 = r17
            r25 = 1048575(0xfffff, float:1.469367E-39)
            if (r21 != 0) goto L_0x026e
            int r0 = com.google.android.gms.internal.ads.lp.h(r8, r0, r10)
            int r1 = r10.f14681d
            r12.putInt(r3, r13, r1)
            goto L_0x0129
        L_0x0111:
            r24 = r33
            r15 = r2
            r12 = r3
            r3 = r6
            r6 = r17
            r4 = r21
            r1 = 2
            r25 = 1048575(0xfffff, float:1.469367E-39)
            if (r4 != r1) goto L_0x026e
            int r0 = com.google.android.gms.internal.ads.lp.m(r8, r0, r10)
            java.lang.Object r1 = r10.f14679b
            r12.putObject(r3, r13, r1)
        L_0x0129:
            r2 = r6
            r33 = r7
            goto L_0x01be
        L_0x012e:
            r24 = r33
            r15 = r2
            r12 = r3
            r3 = r6
            r6 = r17
            r4 = r21
            r1 = 2
            r25 = 1048575(0xfffff, float:1.469367E-39)
            if (r4 != r1) goto L_0x026e
            com.google.android.gms.internal.ads.iq r1 = r6.K(r15)
            int r0 = com.google.android.gms.internal.ads.lp.g(r1, r8, r0, r7, r10)
            java.lang.Object r1 = r12.getObject(r3, r13)
            if (r1 != 0) goto L_0x0151
            java.lang.Object r1 = r10.f14679b
            r12.putObject(r3, r13, r1)
            goto L_0x0129
        L_0x0151:
            java.lang.Object r2 = r10.f14679b
            java.lang.Object r1 = e8.v70.b(r1, r2)
            r12.putObject(r3, r13, r1)
            goto L_0x0129
        L_0x015b:
            r24 = r33
            r15 = r2
            r2 = r3
            r3 = r6
            r6 = r17
            r4 = r21
            r1 = 2
            r25 = 1048575(0xfffff, float:1.469367E-39)
            if (r4 != r1) goto L_0x01e4
            r1 = 536870912(0x20000000, float:1.0842022E-19)
            r1 = r1 & r12
            if (r1 != 0) goto L_0x0174
            int r0 = com.google.android.gms.internal.ads.lp.k(r8, r0, r10)
            goto L_0x0178
        L_0x0174:
            int r0 = com.google.android.gms.internal.ads.lp.l(r8, r0, r10)
        L_0x0178:
            java.lang.Object r1 = r10.f14679b
            r2.putObject(r3, r13, r1)
            r12 = r2
            goto L_0x0129
        L_0x017f:
            r24 = r33
            r15 = r2
            r2 = r3
            r3 = r6
            r6 = r17
            r4 = r21
            r25 = 1048575(0xfffff, float:1.469367E-39)
            if (r4 != 0) goto L_0x01e4
            int r0 = com.google.android.gms.internal.ads.lp.j(r8, r0, r10)
            r17 = r6
            long r5 = r10.f14678a
            r18 = 0
            int r1 = (r5 > r18 ? 1 : (r5 == r18 ? 0 : -1))
            if (r1 == 0) goto L_0x019d
            r5 = 1
            goto L_0x019e
        L_0x019d:
            r5 = 0
        L_0x019e:
            com.google.android.gms.internal.ads.oq$d r1 = com.google.android.gms.internal.ads.oq.f7704d
            r1.d(r3, r13, r5)
            goto L_0x01b9
        L_0x01a4:
            r24 = r33
            r15 = r2
            r2 = r3
            r3 = r6
            r4 = r21
            r25 = 1048575(0xfffff, float:1.469367E-39)
            if (r4 != r1) goto L_0x01e4
            int r1 = com.google.android.gms.internal.ads.lp.n(r8, r0)
            r2.putInt(r3, r13, r1)
            int r0 = r0 + 4
        L_0x01b9:
            r12 = r2
            r33 = r7
            r2 = r17
        L_0x01be:
            r7 = r3
            goto L_0x026a
        L_0x01c1:
            r24 = r33
            r15 = r2
            r2 = r3
            r3 = r6
            r4 = r21
            r1 = 1
            r25 = 1048575(0xfffff, float:1.469367E-39)
            if (r4 != r1) goto L_0x01e4
            long r5 = com.google.android.gms.internal.ads.lp.o(r8, r0)
            r1 = r2
            r12 = r2
            r2 = r31
            r33 = r7
            r7 = r3
            r3 = r13
            r13 = r17
            r1.putLong(r2, r3, r5)
            int r0 = r0 + 8
            r2 = r13
            goto L_0x026a
        L_0x01e4:
            r12 = r2
            goto L_0x026e
        L_0x01e7:
            r24 = r33
            r15 = r2
            r12 = r3
            r33 = r7
            r5 = r17
            r4 = r21
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r6
            if (r4 != 0) goto L_0x026e
            int r0 = com.google.android.gms.internal.ads.lp.h(r8, r0, r10)
            int r1 = r10.f14681d
            r12.putInt(r7, r13, r1)
            r2 = r5
            goto L_0x026a
        L_0x0203:
            r24 = r33
            r15 = r2
            r12 = r3
            r33 = r7
            r5 = r17
            r4 = r21
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r6
            if (r4 != 0) goto L_0x026e
            int r0 = com.google.android.gms.internal.ads.lp.j(r8, r0, r10)
            long r3 = r10.f14678a
            r1 = r12
            r2 = r31
            r17 = r3
            r3 = r13
            r13 = r5
            r5 = r17
            r1.putLong(r2, r3, r5)
            r11 = r11 | r20
            r6 = r12
            r2 = r13
        L_0x0229:
            r5 = r15
            goto L_0x02bd
        L_0x022c:
            r24 = r33
            r15 = r2
            r12 = r3
            r33 = r7
            r2 = r17
            r4 = r21
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r6
            if (r4 != r1) goto L_0x026e
            int r1 = com.google.android.gms.internal.ads.lp.n(r8, r0)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            com.google.android.gms.internal.ads.oq$d r3 = com.google.android.gms.internal.ads.oq.f7704d
            r3.b(r7, r13, r1)
            int r0 = r0 + 4
            goto L_0x026a
        L_0x024c:
            r24 = r33
            r15 = r2
            r12 = r3
            r33 = r7
            r2 = r17
            r4 = r21
            r1 = 1
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r6
            if (r4 != r1) goto L_0x026e
            long r3 = com.google.android.gms.internal.ads.lp.o(r8, r0)
            double r3 = java.lang.Double.longBitsToDouble(r3)
            com.google.android.gms.internal.ads.oq.c(r7, r13, r3)
            int r0 = r0 + 8
        L_0x026a:
            r11 = r11 | r20
            r6 = r12
            goto L_0x0229
        L_0x026e:
            r2 = r15
        L_0x026f:
            r19 = r0
            r28 = r12
            r23 = -1
            goto L_0x0356
        L_0x0277:
            r5 = r2
            r2 = r17
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r29 = r24
            r24 = r33
            r33 = r7
            r7 = r6
            r6 = r29
            r1 = 27
            if (r15 != r1) goto L_0x02d7
            r1 = 2
            if (r4 != r1) goto L_0x02cb
            java.lang.Object r1 = r6.getObject(r7, r13)
            e8.c80 r1 = (e8.c80) r1
            boolean r3 = r1.k()
            if (r3 != 0) goto L_0x02ab
            int r3 = r1.size()
            if (r3 != 0) goto L_0x02a2
            r3 = 10
            goto L_0x02a4
        L_0x02a2:
            int r3 = r3 << 1
        L_0x02a4:
            e8.c80 r1 = r1.r(r3)
            r6.putObject(r7, r13, r1)
        L_0x02ab:
            r22 = r1
            com.google.android.gms.internal.ads.iq r17 = r2.K(r5)
            r19 = r32
            r20 = r0
            r21 = r34
            r23 = r35
            int r0 = com.google.android.gms.internal.ads.lp.e(r17, r18, r19, r20, r21, r22, r23)
        L_0x02bd:
            r28 = r6
            r6 = r7
            r23 = -1
            r7 = r33
            r29 = r5
            r5 = r2
            r2 = r29
            goto L_0x0377
        L_0x02cb:
            r17 = r5
            r28 = r6
            r26 = r9
            r27 = r11
            r23 = -1
            r11 = r0
            goto L_0x031d
        L_0x02d7:
            r1 = 49
            if (r15 > r1) goto L_0x030a
            long r7 = (long) r12
            r12 = r0
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r12
            r10 = r4
            r4 = r34
            r17 = r5
            r5 = r18
            r19 = r6
            r6 = r24
            r20 = r7
            r7 = r10
            r8 = r17
            r26 = r9
            r9 = r20
            r27 = r11
            r11 = r15
            r15 = r12
            r23 = -1
            r12 = r13
            r28 = r19
            r14 = r35
            int r0 = r0.b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 != r15) goto L_0x0367
            goto L_0x034e
        L_0x030a:
            r10 = r4
            r17 = r5
            r28 = r6
            r26 = r9
            r27 = r11
            r23 = -1
            r11 = r0
            r0 = 50
            if (r15 != r0) goto L_0x0332
            r0 = 2
            if (r10 == r0) goto L_0x031f
        L_0x031d:
            r0 = r11
            goto L_0x034e
        L_0x031f:
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r11
            r4 = r34
            r5 = r17
            r6 = r13
            r8 = r35
            r0.m(r1, r2, r3, r4, r5, r6, r8)
            r0 = 0
            throw r0
        L_0x0332:
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r11
            r4 = r34
            r5 = r18
            r6 = r24
            r7 = r10
            r8 = r12
            r9 = r15
            r15 = r11
            r10 = r13
            r12 = r17
            r13 = r35
            int r0 = r0.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 != r15) goto L_0x0367
        L_0x034e:
            r19 = r0
            r2 = r17
            r9 = r26
            r11 = r27
        L_0x0356:
            com.google.android.gms.internal.ads.nq r21 = z(r31)
            r17 = r18
            r18 = r32
            r20 = r34
            r22 = r35
            int r0 = com.google.android.gms.internal.ads.lp.a(r17, r18, r19, r20, r21, r22)
            goto L_0x036d
        L_0x0367:
            r2 = r17
            r9 = r26
            r11 = r27
        L_0x036d:
            r5 = r30
            r6 = r31
            r8 = r32
            r7 = r34
            r10 = r35
        L_0x0377:
            r15 = r30
            r1 = r24
            r14 = r28
            r12 = -1
            r13 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x001f
        L_0x0383:
            r13 = r9
            r27 = r11
            r28 = r14
            r1 = 1048575(0xfffff, float:1.469367E-39)
            if (r13 == r1) goto L_0x0397
            long r1 = (long) r13
            r3 = r31
            r11 = r27
            r4 = r28
            r4.putInt(r3, r1, r11)
        L_0x0397:
            r4 = r34
            if (r0 != r4) goto L_0x039c
            return
        L_0x039c:
            e8.f80 r0 = e8.f80.g()
            throw r0
        L_0x03a1:
            r3 = r31
            r4 = r34
            r5 = 0
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r33
            r6 = r35
            r0.n(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.eq.f(java.lang.Object, byte[], int, int, e8.ft):void");
    }

    public final void g(T t10) {
        int i10;
        int i11 = this.f6307j;
        while (true) {
            i10 = this.f6308k;
            if (i11 >= i10) {
                break;
            }
            long N = (long) (N(this.f6306i[i11]) & 1048575);
            Object u10 = oq.u(t10, N);
            if (u10 != null) {
                oq.e(t10, N, this.f6313p.e(u10));
            }
            i11++;
        }
        int length = this.f6306i.length;
        while (i10 < length) {
            this.f6310m.c(t10, (long) this.f6306i[i10]);
            i10++;
        }
        this.f6311n.g(t10);
        if (this.f6303f) {
            this.f6312o.i(t10);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:152|153|(1:155)|156|(5:177|158|(2:161|159)|258|(2:163|266)(1:267))(1:254)) */
    /* JADX WARNING: Code restructure failed: missing block: B:153:?, code lost:
        r7.e(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x05a6, code lost:
        if (r10 == null) goto L_0x05a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x05a8, code lost:
        r10 = r7.k(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x05b1, code lost:
        if (r7.f(r10, r14) == false) goto L_0x05b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x05b3, code lost:
        r14 = r12.f6307j;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x05b7, code lost:
        if (r14 < r12.f6308k) goto L_0x05b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x05b9, code lost:
        p(r13, r12.f6306i[r14], r10, r7);
        r14 = r14 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x05c3, code lost:
        if (r10 != null) goto L_0x05c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x05c5, code lost:
        r7.r(r13, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:?, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:152:0x05a3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(T r13, com.google.android.gms.internal.ads.rp r14, com.google.android.gms.internal.ads.up r15) throws java.io.IOException {
        /*
            r12 = this;
            r15.getClass()
            com.google.android.gms.internal.ads.lq<?, ?> r7 = r12.f6311n
            com.google.android.gms.internal.ads.vp<?> r8 = r12.f6312o
            r9 = 0
            r0 = r9
            r10 = r0
        L_0x000a:
            int r1 = r14.A()     // Catch:{ all -> 0x05c9 }
            int r2 = r12.P(r1)     // Catch:{ all -> 0x05c9 }
            if (r2 >= 0) goto L_0x0077
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r2) goto L_0x002f
            int r14 = r12.f6307j
        L_0x001b:
            int r15 = r12.f6308k
            if (r14 >= r15) goto L_0x0029
            int[] r15 = r12.f6306i
            r15 = r15[r14]
            r12.p(r13, r15, r10, r7)
            int r14 = r14 + 1
            goto L_0x001b
        L_0x0029:
            if (r10 == 0) goto L_0x002e
            r7.r(r13, r10)
        L_0x002e:
            return
        L_0x002f:
            boolean r2 = r12.f6303f     // Catch:{ all -> 0x05c9 }
            if (r2 != 0) goto L_0x0035
            r2 = r9
            goto L_0x003c
        L_0x0035:
            com.google.android.gms.internal.ads.cq r2 = r12.f6302e     // Catch:{ all -> 0x05c9 }
            java.lang.Object r1 = r8.c(r15, r2, r1)     // Catch:{ all -> 0x05c9 }
            r2 = r1
        L_0x003c:
            if (r2 == 0) goto L_0x0051
            if (r0 != 0) goto L_0x0044
            com.google.android.gms.internal.ads.xp r0 = r8.h(r13)     // Catch:{ all -> 0x05c9 }
        L_0x0044:
            r11 = r0
            r0 = r8
            r1 = r14
            r3 = r15
            r4 = r11
            r5 = r10
            r6 = r7
            java.lang.Object r10 = r0.b(r1, r2, r3, r4, r5, r6)     // Catch:{ all -> 0x05c9 }
            r0 = r11
            goto L_0x000a
        L_0x0051:
            r7.e(r14)     // Catch:{ all -> 0x05c9 }
            if (r10 != 0) goto L_0x005b
            java.lang.Object r1 = r7.k(r13)     // Catch:{ all -> 0x05c9 }
            r10 = r1
        L_0x005b:
            boolean r1 = r7.f(r10, r14)     // Catch:{ all -> 0x05c9 }
            if (r1 != 0) goto L_0x000a
            int r14 = r12.f6307j
        L_0x0063:
            int r15 = r12.f6308k
            if (r14 >= r15) goto L_0x0071
            int[] r15 = r12.f6306i
            r15 = r15[r14]
            r12.p(r13, r15, r10, r7)
            int r14 = r14 + 1
            goto L_0x0063
        L_0x0071:
            if (r10 == 0) goto L_0x0076
            r7.r(r13, r10)
        L_0x0076:
            return
        L_0x0077:
            int r3 = r12.N(r2)     // Catch:{ all -> 0x05c9 }
            r4 = 267386880(0xff00000, float:2.3665827E-29)
            r4 = r4 & r3
            int r4 = r4 >>> 20
            r5 = 1048575(0xfffff, float:1.469367E-39)
            switch(r4) {
                case 0: goto L_0x0577;
                case 1: goto L_0x0566;
                case 2: goto L_0x0557;
                case 3: goto L_0x0548;
                case 4: goto L_0x0537;
                case 5: goto L_0x0528;
                case 6: goto L_0x0519;
                case 7: goto L_0x050a;
                case 8: goto L_0x0502;
                case 9: goto L_0x04d1;
                case 10: goto L_0x04c2;
                case 11: goto L_0x04b3;
                case 12: goto L_0x0491;
                case 13: goto L_0x0482;
                case 14: goto L_0x0473;
                case 15: goto L_0x0464;
                case 16: goto L_0x0455;
                case 17: goto L_0x0424;
                case 18: goto L_0x0416;
                case 19: goto L_0x0408;
                case 20: goto L_0x03fa;
                case 21: goto L_0x03ec;
                case 22: goto L_0x03de;
                case 23: goto L_0x03d0;
                case 24: goto L_0x03c2;
                case 25: goto L_0x03b4;
                case 26: goto L_0x038e;
                case 27: goto L_0x037c;
                case 28: goto L_0x036e;
                case 29: goto L_0x0360;
                case 30: goto L_0x034b;
                case 31: goto L_0x033d;
                case 32: goto L_0x032f;
                case 33: goto L_0x0321;
                case 34: goto L_0x0313;
                case 35: goto L_0x0305;
                case 36: goto L_0x02f7;
                case 37: goto L_0x02e9;
                case 38: goto L_0x02db;
                case 39: goto L_0x02cd;
                case 40: goto L_0x02bf;
                case 41: goto L_0x02b1;
                case 42: goto L_0x02a3;
                case 43: goto L_0x0295;
                case 44: goto L_0x0280;
                case 45: goto L_0x0272;
                case 46: goto L_0x0264;
                case 47: goto L_0x0256;
                case 48: goto L_0x0248;
                case 49: goto L_0x0236;
                case 50: goto L_0x01f6;
                case 51: goto L_0x01e4;
                case 52: goto L_0x01d2;
                case 53: goto L_0x01c0;
                case 54: goto L_0x01ae;
                case 55: goto L_0x019c;
                case 56: goto L_0x018a;
                case 57: goto L_0x0178;
                case 58: goto L_0x0166;
                case 59: goto L_0x015e;
                case 60: goto L_0x012d;
                case 61: goto L_0x011f;
                case 62: goto L_0x010d;
                case 63: goto L_0x00e8;
                case 64: goto L_0x00d6;
                case 65: goto L_0x00c4;
                case 66: goto L_0x00b2;
                case 67: goto L_0x00a0;
                case 68: goto L_0x008e;
                default: goto L_0x0086;
            }
        L_0x0086:
            if (r10 != 0) goto L_0x0587
            java.lang.Object r1 = r7.n()     // Catch:{ e80 -> 0x05a3 }
            goto L_0x0586
        L_0x008e:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ e80 -> 0x05a3 }
            com.google.android.gms.internal.ads.iq r5 = r12.K(r2)     // Catch:{ e80 -> 0x05a3 }
            java.lang.Object r5 = r14.k(r5, r15)     // Catch:{ e80 -> 0x05a3 }
            com.google.android.gms.internal.ads.oq.e(r13, r3, r5)     // Catch:{ e80 -> 0x05a3 }
            r12.A(r13, r1, r2)     // Catch:{ e80 -> 0x05a3 }
            goto L_0x000a
        L_0x00a0:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ e80 -> 0x05a3 }
            long r5 = r14.z()     // Catch:{ e80 -> 0x05a3 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ e80 -> 0x05a3 }
            com.google.android.gms.internal.ads.oq.e(r13, r3, r5)     // Catch:{ e80 -> 0x05a3 }
            r12.A(r13, r1, r2)     // Catch:{ e80 -> 0x05a3 }
            goto L_0x000a
        L_0x00b2:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ e80 -> 0x05a3 }
            int r5 = r14.y()     // Catch:{ e80 -> 0x05a3 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ e80 -> 0x05a3 }
            com.google.android.gms.internal.ads.oq.e(r13, r3, r5)     // Catch:{ e80 -> 0x05a3 }
            r12.A(r13, r1, r2)     // Catch:{ e80 -> 0x05a3 }
            goto L_0x000a
        L_0x00c4:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ e80 -> 0x05a3 }
            long r5 = r14.x()     // Catch:{ e80 -> 0x05a3 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ e80 -> 0x05a3 }
            com.google.android.gms.internal.ads.oq.e(r13, r3, r5)     // Catch:{ e80 -> 0x05a3 }
            r12.A(r13, r1, r2)     // Catch:{ e80 -> 0x05a3 }
            goto L_0x000a
        L_0x00d6:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ e80 -> 0x05a3 }
            int r5 = r14.w()     // Catch:{ e80 -> 0x05a3 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ e80 -> 0x05a3 }
            com.google.android.gms.internal.ads.oq.e(r13, r3, r5)     // Catch:{ e80 -> 0x05a3 }
            r12.A(r13, r1, r2)     // Catch:{ e80 -> 0x05a3 }
            goto L_0x000a
        L_0x00e8:
            int r4 = r14.v()     // Catch:{ e80 -> 0x05a3 }
            e8.z70 r6 = r12.M(r2)     // Catch:{ e80 -> 0x05a3 }
            if (r6 == 0) goto L_0x00ff
            boolean r6 = r6.a(r4)     // Catch:{ e80 -> 0x05a3 }
            if (r6 == 0) goto L_0x00f9
            goto L_0x00ff
        L_0x00f9:
            java.lang.Object r10 = com.google.android.gms.internal.ads.kq.a(r1, r4, r10, r7)     // Catch:{ e80 -> 0x05a3 }
            goto L_0x000a
        L_0x00ff:
            r3 = r3 & r5
            long r5 = (long) r3     // Catch:{ e80 -> 0x05a3 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)     // Catch:{ e80 -> 0x05a3 }
            com.google.android.gms.internal.ads.oq.e(r13, r5, r3)     // Catch:{ e80 -> 0x05a3 }
            r12.A(r13, r1, r2)     // Catch:{ e80 -> 0x05a3 }
            goto L_0x000a
        L_0x010d:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ e80 -> 0x05a3 }
            int r5 = r14.u()     // Catch:{ e80 -> 0x05a3 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ e80 -> 0x05a3 }
            com.google.android.gms.internal.ads.oq.e(r13, r3, r5)     // Catch:{ e80 -> 0x05a3 }
            r12.A(r13, r1, r2)     // Catch:{ e80 -> 0x05a3 }
            goto L_0x000a
        L_0x011f:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ e80 -> 0x05a3 }
            com.google.android.gms.internal.ads.mp r5 = r14.t()     // Catch:{ e80 -> 0x05a3 }
            com.google.android.gms.internal.ads.oq.e(r13, r3, r5)     // Catch:{ e80 -> 0x05a3 }
            r12.A(r13, r1, r2)     // Catch:{ e80 -> 0x05a3 }
            goto L_0x000a
        L_0x012d:
            boolean r4 = r12.w(r13, r1, r2)     // Catch:{ e80 -> 0x05a3 }
            if (r4 == 0) goto L_0x0149
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ e80 -> 0x05a3 }
            java.lang.Object r5 = com.google.android.gms.internal.ads.oq.u(r13, r3)     // Catch:{ e80 -> 0x05a3 }
            com.google.android.gms.internal.ads.iq r6 = r12.K(r2)     // Catch:{ e80 -> 0x05a3 }
            java.lang.Object r6 = r14.d(r6, r15)     // Catch:{ e80 -> 0x05a3 }
            java.lang.Object r5 = e8.v70.b(r5, r6)     // Catch:{ e80 -> 0x05a3 }
            com.google.android.gms.internal.ads.oq.e(r13, r3, r5)     // Catch:{ e80 -> 0x05a3 }
            goto L_0x0159
        L_0x0149:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ e80 -> 0x05a3 }
            com.google.android.gms.internal.ads.iq r5 = r12.K(r2)     // Catch:{ e80 -> 0x05a3 }
            java.lang.Object r5 = r14.d(r5, r15)     // Catch:{ e80 -> 0x05a3 }
            com.google.android.gms.internal.ads.oq.e(r13, r3, r5)     // Catch:{ e80 -> 0x05a3 }
            r12.H(r13, r2)     // Catch:{ e80 -> 0x05a3 }
        L_0x0159:
            r12.A(r13, r1, r2)     // Catch:{ e80 -> 0x05a3 }
            goto L_0x000a
        L_0x015e:
            r12.u(r13, r3, r14)     // Catch:{ e80 -> 0x05a3 }
            r12.A(r13, r1, r2)     // Catch:{ e80 -> 0x05a3 }
            goto L_0x000a
        L_0x0166:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ e80 -> 0x05a3 }
            boolean r5 = r14.r()     // Catch:{ e80 -> 0x05a3 }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ e80 -> 0x05a3 }
            com.google.android.gms.internal.ads.oq.e(r13, r3, r5)     // Catch:{ e80 -> 0x05a3 }
            r12.A(r13, r1, r2)     // Catch:{ e80 -> 0x05a3 }
            goto L_0x000a
        L_0x0178:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ e80 -> 0x05a3 }
            int r5 = r14.q()     // Catch:{ e80 -> 0x05a3 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ e80 -> 0x05a3 }
            com.google.android.gms.internal.ads.oq.e(r13, r3, r5)     // Catch:{ e80 -> 0x05a3 }
            r12.A(r13, r1, r2)     // Catch:{ e80 -> 0x05a3 }
            goto L_0x000a
        L_0x018a:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ e80 -> 0x05a3 }
            long r5 = r14.p()     // Catch:{ e80 -> 0x05a3 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ e80 -> 0x05a3 }
            com.google.android.gms.internal.ads.oq.e(r13, r3, r5)     // Catch:{ e80 -> 0x05a3 }
            r12.A(r13, r1, r2)     // Catch:{ e80 -> 0x05a3 }
            goto L_0x000a
        L_0x019c:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ e80 -> 0x05a3 }
            int r5 = r14.o()     // Catch:{ e80 -> 0x05a3 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ e80 -> 0x05a3 }
            com.google.android.gms.internal.ads.oq.e(r13, r3, r5)     // Catch:{ e80 -> 0x05a3 }
            r12.A(r13, r1, r2)     // Catch:{ e80 -> 0x05a3 }
            goto L_0x000a
        L_0x01ae:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ e80 -> 0x05a3 }
            long r5 = r14.m()     // Catch:{ e80 -> 0x05a3 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ e80 -> 0x05a3 }
            com.google.android.gms.internal.ads.oq.e(r13, r3, r5)     // Catch:{ e80 -> 0x05a3 }
            r12.A(r13, r1, r2)     // Catch:{ e80 -> 0x05a3 }
            goto L_0x000a
        L_0x01c0:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ e80 -> 0x05a3 }
            long r5 = r14.n()     // Catch:{ e80 -> 0x05a3 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ e80 -> 0x05a3 }
            com.google.android.gms.internal.ads.oq.e(r13, r3, r5)     // Catch:{ e80 -> 0x05a3 }
            r12.A(r13, r1, r2)     // Catch:{ e80 -> 0x05a3 }
            goto L_0x000a
        L_0x01d2:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ e80 -> 0x05a3 }
            float r5 = r14.b()     // Catch:{ e80 -> 0x05a3 }
            java.lang.Float r5 = java.lang.Float.valueOf(r5)     // Catch:{ e80 -> 0x05a3 }
            com.google.android.gms.internal.ads.oq.e(r13, r3, r5)     // Catch:{ e80 -> 0x05a3 }
            r12.A(r13, r1, r2)     // Catch:{ e80 -> 0x05a3 }
            goto L_0x000a
        L_0x01e4:
            r3 = r3 & r5
            long r3 = (long) r3     // Catch:{ e80 -> 0x05a3 }
            double r5 = r14.a()     // Catch:{ e80 -> 0x05a3 }
            java.lang.Double r5 = java.lang.Double.valueOf(r5)     // Catch:{ e80 -> 0x05a3 }
            com.google.android.gms.internal.ads.oq.e(r13, r3, r5)     // Catch:{ e80 -> 0x05a3 }
            r12.A(r13, r1, r2)     // Catch:{ e80 -> 0x05a3 }
            goto L_0x000a
        L_0x01f6:
            java.lang.Object r1 = r12.L(r2)     // Catch:{ e80 -> 0x05a3 }
            int r2 = r12.N(r2)     // Catch:{ e80 -> 0x05a3 }
            r2 = r2 & r5
            long r2 = (long) r2     // Catch:{ e80 -> 0x05a3 }
            java.lang.Object r4 = com.google.android.gms.internal.ads.oq.u(r13, r2)     // Catch:{ e80 -> 0x05a3 }
            if (r4 == 0) goto L_0x021e
            e8.v80 r5 = r12.f6313p     // Catch:{ e80 -> 0x05a3 }
            boolean r5 = r5.d(r4)     // Catch:{ e80 -> 0x05a3 }
            if (r5 == 0) goto L_0x0227
            e8.v80 r5 = r12.f6313p     // Catch:{ e80 -> 0x05a3 }
            java.lang.Object r5 = r5.g(r1)     // Catch:{ e80 -> 0x05a3 }
            e8.v80 r6 = r12.f6313p     // Catch:{ e80 -> 0x05a3 }
            r6.h(r5, r4)     // Catch:{ e80 -> 0x05a3 }
            com.google.android.gms.internal.ads.oq.e(r13, r2, r5)     // Catch:{ e80 -> 0x05a3 }
            r4 = r5
            goto L_0x0227
        L_0x021e:
            e8.v80 r4 = r12.f6313p     // Catch:{ e80 -> 0x05a3 }
            java.lang.Object r4 = r4.g(r1)     // Catch:{ e80 -> 0x05a3 }
            com.google.android.gms.internal.ads.oq.e(r13, r2, r4)     // Catch:{ e80 -> 0x05a3 }
        L_0x0227:
            e8.v80 r2 = r12.f6313p     // Catch:{ e80 -> 0x05a3 }
            java.util.Map r2 = r2.f(r4)     // Catch:{ e80 -> 0x05a3 }
            e8.v80 r3 = r12.f6313p     // Catch:{ e80 -> 0x05a3 }
            r3.b(r1)     // Catch:{ e80 -> 0x05a3 }
            r14.h(r2, r9, r15)     // Catch:{ e80 -> 0x05a3 }
            throw r9     // Catch:{ e80 -> 0x05a3 }
        L_0x0236:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ e80 -> 0x05a3 }
            com.google.android.gms.internal.ads.iq r1 = r12.K(r2)     // Catch:{ e80 -> 0x05a3 }
            e8.m80 r2 = r12.f6310m     // Catch:{ e80 -> 0x05a3 }
            java.util.List r2 = r2.a(r13, r3)     // Catch:{ e80 -> 0x05a3 }
            r14.l(r2, r1, r15)     // Catch:{ e80 -> 0x05a3 }
            goto L_0x000a
        L_0x0248:
            e8.m80 r1 = r12.f6310m     // Catch:{ e80 -> 0x05a3 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ e80 -> 0x05a3 }
            java.util.List r1 = r1.a(r13, r2)     // Catch:{ e80 -> 0x05a3 }
            r14.j(r1)     // Catch:{ e80 -> 0x05a3 }
            goto L_0x000a
        L_0x0256:
            e8.m80 r1 = r12.f6310m     // Catch:{ e80 -> 0x05a3 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ e80 -> 0x05a3 }
            java.util.List r1 = r1.a(r13, r2)     // Catch:{ e80 -> 0x05a3 }
            r14.i(r1)     // Catch:{ e80 -> 0x05a3 }
            goto L_0x000a
        L_0x0264:
            e8.m80 r1 = r12.f6310m     // Catch:{ e80 -> 0x05a3 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ e80 -> 0x05a3 }
            java.util.List r1 = r1.a(r13, r2)     // Catch:{ e80 -> 0x05a3 }
            r14.W(r1)     // Catch:{ e80 -> 0x05a3 }
            goto L_0x000a
        L_0x0272:
            e8.m80 r1 = r12.f6310m     // Catch:{ e80 -> 0x05a3 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ e80 -> 0x05a3 }
            java.util.List r1 = r1.a(r13, r2)     // Catch:{ e80 -> 0x05a3 }
            r14.V(r1)     // Catch:{ e80 -> 0x05a3 }
            goto L_0x000a
        L_0x0280:
            e8.m80 r4 = r12.f6310m     // Catch:{ e80 -> 0x05a3 }
            r3 = r3 & r5
            long r5 = (long) r3     // Catch:{ e80 -> 0x05a3 }
            java.util.List r3 = r4.a(r13, r5)     // Catch:{ e80 -> 0x05a3 }
            r14.U(r3)     // Catch:{ e80 -> 0x05a3 }
            e8.z70 r2 = r12.M(r2)     // Catch:{ e80 -> 0x05a3 }
            java.lang.Object r10 = com.google.android.gms.internal.ads.kq.b(r1, r3, r2, r10, r7)     // Catch:{ e80 -> 0x05a3 }
            goto L_0x000a
        L_0x0295:
            e8.m80 r1 = r12.f6310m     // Catch:{ e80 -> 0x05a3 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ e80 -> 0x05a3 }
            java.util.List r1 = r1.a(r13, r2)     // Catch:{ e80 -> 0x05a3 }
            r14.T(r1)     // Catch:{ e80 -> 0x05a3 }
            goto L_0x000a
        L_0x02a3:
            e8.m80 r1 = r12.f6310m     // Catch:{ e80 -> 0x05a3 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ e80 -> 0x05a3 }
            java.util.List r1 = r1.a(r13, r2)     // Catch:{ e80 -> 0x05a3 }
            r14.Q(r1)     // Catch:{ e80 -> 0x05a3 }
            goto L_0x000a
        L_0x02b1:
            e8.m80 r1 = r12.f6310m     // Catch:{ e80 -> 0x05a3 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ e80 -> 0x05a3 }
            java.util.List r1 = r1.a(r13, r2)     // Catch:{ e80 -> 0x05a3 }
            r14.P(r1)     // Catch:{ e80 -> 0x05a3 }
            goto L_0x000a
        L_0x02bf:
            e8.m80 r1 = r12.f6310m     // Catch:{ e80 -> 0x05a3 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ e80 -> 0x05a3 }
            java.util.List r1 = r1.a(r13, r2)     // Catch:{ e80 -> 0x05a3 }
            r14.O(r1)     // Catch:{ e80 -> 0x05a3 }
            goto L_0x000a
        L_0x02cd:
            e8.m80 r1 = r12.f6310m     // Catch:{ e80 -> 0x05a3 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ e80 -> 0x05a3 }
            java.util.List r1 = r1.a(r13, r2)     // Catch:{ e80 -> 0x05a3 }
            r14.N(r1)     // Catch:{ e80 -> 0x05a3 }
            goto L_0x000a
        L_0x02db:
            e8.m80 r1 = r12.f6310m     // Catch:{ e80 -> 0x05a3 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ e80 -> 0x05a3 }
            java.util.List r1 = r1.a(r13, r2)     // Catch:{ e80 -> 0x05a3 }
            r14.L(r1)     // Catch:{ e80 -> 0x05a3 }
            goto L_0x000a
        L_0x02e9:
            e8.m80 r1 = r12.f6310m     // Catch:{ e80 -> 0x05a3 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ e80 -> 0x05a3 }
            java.util.List r1 = r1.a(r13, r2)     // Catch:{ e80 -> 0x05a3 }
            r14.M(r1)     // Catch:{ e80 -> 0x05a3 }
            goto L_0x000a
        L_0x02f7:
            e8.m80 r1 = r12.f6310m     // Catch:{ e80 -> 0x05a3 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ e80 -> 0x05a3 }
            java.util.List r1 = r1.a(r13, r2)     // Catch:{ e80 -> 0x05a3 }
            r14.K(r1)     // Catch:{ e80 -> 0x05a3 }
            goto L_0x000a
        L_0x0305:
            e8.m80 r1 = r12.f6310m     // Catch:{ e80 -> 0x05a3 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ e80 -> 0x05a3 }
            java.util.List r1 = r1.a(r13, r2)     // Catch:{ e80 -> 0x05a3 }
            r14.J(r1)     // Catch:{ e80 -> 0x05a3 }
            goto L_0x000a
        L_0x0313:
            e8.m80 r1 = r12.f6310m     // Catch:{ e80 -> 0x05a3 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ e80 -> 0x05a3 }
            java.util.List r1 = r1.a(r13, r2)     // Catch:{ e80 -> 0x05a3 }
            r14.j(r1)     // Catch:{ e80 -> 0x05a3 }
            goto L_0x000a
        L_0x0321:
            e8.m80 r1 = r12.f6310m     // Catch:{ e80 -> 0x05a3 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ e80 -> 0x05a3 }
            java.util.List r1 = r1.a(r13, r2)     // Catch:{ e80 -> 0x05a3 }
            r14.i(r1)     // Catch:{ e80 -> 0x05a3 }
            goto L_0x000a
        L_0x032f:
            e8.m80 r1 = r12.f6310m     // Catch:{ e80 -> 0x05a3 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ e80 -> 0x05a3 }
            java.util.List r1 = r1.a(r13, r2)     // Catch:{ e80 -> 0x05a3 }
            r14.W(r1)     // Catch:{ e80 -> 0x05a3 }
            goto L_0x000a
        L_0x033d:
            e8.m80 r1 = r12.f6310m     // Catch:{ e80 -> 0x05a3 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ e80 -> 0x05a3 }
            java.util.List r1 = r1.a(r13, r2)     // Catch:{ e80 -> 0x05a3 }
            r14.V(r1)     // Catch:{ e80 -> 0x05a3 }
            goto L_0x000a
        L_0x034b:
            e8.m80 r4 = r12.f6310m     // Catch:{ e80 -> 0x05a3 }
            r3 = r3 & r5
            long r5 = (long) r3     // Catch:{ e80 -> 0x05a3 }
            java.util.List r3 = r4.a(r13, r5)     // Catch:{ e80 -> 0x05a3 }
            r14.U(r3)     // Catch:{ e80 -> 0x05a3 }
            e8.z70 r2 = r12.M(r2)     // Catch:{ e80 -> 0x05a3 }
            java.lang.Object r10 = com.google.android.gms.internal.ads.kq.b(r1, r3, r2, r10, r7)     // Catch:{ e80 -> 0x05a3 }
            goto L_0x000a
        L_0x0360:
            e8.m80 r1 = r12.f6310m     // Catch:{ e80 -> 0x05a3 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ e80 -> 0x05a3 }
            java.util.List r1 = r1.a(r13, r2)     // Catch:{ e80 -> 0x05a3 }
            r14.T(r1)     // Catch:{ e80 -> 0x05a3 }
            goto L_0x000a
        L_0x036e:
            e8.m80 r1 = r12.f6310m     // Catch:{ e80 -> 0x05a3 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ e80 -> 0x05a3 }
            java.util.List r1 = r1.a(r13, r2)     // Catch:{ e80 -> 0x05a3 }
            r14.S(r1)     // Catch:{ e80 -> 0x05a3 }
            goto L_0x000a
        L_0x037c:
            com.google.android.gms.internal.ads.iq r1 = r12.K(r2)     // Catch:{ e80 -> 0x05a3 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ e80 -> 0x05a3 }
            e8.m80 r4 = r12.f6310m     // Catch:{ e80 -> 0x05a3 }
            java.util.List r2 = r4.a(r13, r2)     // Catch:{ e80 -> 0x05a3 }
            r14.f(r2, r1, r15)     // Catch:{ e80 -> 0x05a3 }
            goto L_0x000a
        L_0x038e:
            r1 = 536870912(0x20000000, float:1.0842022E-19)
            r1 = r1 & r3
            if (r1 == 0) goto L_0x0395
            r1 = 1
            goto L_0x0396
        L_0x0395:
            r1 = 0
        L_0x0396:
            if (r1 == 0) goto L_0x03a6
            e8.m80 r1 = r12.f6310m     // Catch:{ e80 -> 0x05a3 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ e80 -> 0x05a3 }
            java.util.List r1 = r1.a(r13, r2)     // Catch:{ e80 -> 0x05a3 }
            r14.R(r1)     // Catch:{ e80 -> 0x05a3 }
            goto L_0x000a
        L_0x03a6:
            e8.m80 r1 = r12.f6310m     // Catch:{ e80 -> 0x05a3 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ e80 -> 0x05a3 }
            java.util.List r1 = r1.a(r13, r2)     // Catch:{ e80 -> 0x05a3 }
            r14.c(r1)     // Catch:{ e80 -> 0x05a3 }
            goto L_0x000a
        L_0x03b4:
            e8.m80 r1 = r12.f6310m     // Catch:{ e80 -> 0x05a3 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ e80 -> 0x05a3 }
            java.util.List r1 = r1.a(r13, r2)     // Catch:{ e80 -> 0x05a3 }
            r14.Q(r1)     // Catch:{ e80 -> 0x05a3 }
            goto L_0x000a
        L_0x03c2:
            e8.m80 r1 = r12.f6310m     // Catch:{ e80 -> 0x05a3 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ e80 -> 0x05a3 }
            java.util.List r1 = r1.a(r13, r2)     // Catch:{ e80 -> 0x05a3 }
            r14.P(r1)     // Catch:{ e80 -> 0x05a3 }
            goto L_0x000a
        L_0x03d0:
            e8.m80 r1 = r12.f6310m     // Catch:{ e80 -> 0x05a3 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ e80 -> 0x05a3 }
            java.util.List r1 = r1.a(r13, r2)     // Catch:{ e80 -> 0x05a3 }
            r14.O(r1)     // Catch:{ e80 -> 0x05a3 }
            goto L_0x000a
        L_0x03de:
            e8.m80 r1 = r12.f6310m     // Catch:{ e80 -> 0x05a3 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ e80 -> 0x05a3 }
            java.util.List r1 = r1.a(r13, r2)     // Catch:{ e80 -> 0x05a3 }
            r14.N(r1)     // Catch:{ e80 -> 0x05a3 }
            goto L_0x000a
        L_0x03ec:
            e8.m80 r1 = r12.f6310m     // Catch:{ e80 -> 0x05a3 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ e80 -> 0x05a3 }
            java.util.List r1 = r1.a(r13, r2)     // Catch:{ e80 -> 0x05a3 }
            r14.L(r1)     // Catch:{ e80 -> 0x05a3 }
            goto L_0x000a
        L_0x03fa:
            e8.m80 r1 = r12.f6310m     // Catch:{ e80 -> 0x05a3 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ e80 -> 0x05a3 }
            java.util.List r1 = r1.a(r13, r2)     // Catch:{ e80 -> 0x05a3 }
            r14.M(r1)     // Catch:{ e80 -> 0x05a3 }
            goto L_0x000a
        L_0x0408:
            e8.m80 r1 = r12.f6310m     // Catch:{ e80 -> 0x05a3 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ e80 -> 0x05a3 }
            java.util.List r1 = r1.a(r13, r2)     // Catch:{ e80 -> 0x05a3 }
            r14.K(r1)     // Catch:{ e80 -> 0x05a3 }
            goto L_0x000a
        L_0x0416:
            e8.m80 r1 = r12.f6310m     // Catch:{ e80 -> 0x05a3 }
            r2 = r3 & r5
            long r2 = (long) r2     // Catch:{ e80 -> 0x05a3 }
            java.util.List r1 = r1.a(r13, r2)     // Catch:{ e80 -> 0x05a3 }
            r14.J(r1)     // Catch:{ e80 -> 0x05a3 }
            goto L_0x000a
        L_0x0424:
            boolean r1 = r12.F(r13, r2)     // Catch:{ e80 -> 0x05a3 }
            if (r1 == 0) goto L_0x0442
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ e80 -> 0x05a3 }
            java.lang.Object r1 = com.google.android.gms.internal.ads.oq.u(r13, r3)     // Catch:{ e80 -> 0x05a3 }
            com.google.android.gms.internal.ads.iq r2 = r12.K(r2)     // Catch:{ e80 -> 0x05a3 }
            java.lang.Object r2 = r14.k(r2, r15)     // Catch:{ e80 -> 0x05a3 }
            java.lang.Object r1 = e8.v70.b(r1, r2)     // Catch:{ e80 -> 0x05a3 }
            com.google.android.gms.internal.ads.oq.e(r13, r3, r1)     // Catch:{ e80 -> 0x05a3 }
            goto L_0x000a
        L_0x0442:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ e80 -> 0x05a3 }
            com.google.android.gms.internal.ads.iq r1 = r12.K(r2)     // Catch:{ e80 -> 0x05a3 }
            java.lang.Object r1 = r14.k(r1, r15)     // Catch:{ e80 -> 0x05a3 }
            com.google.android.gms.internal.ads.oq.e(r13, r3, r1)     // Catch:{ e80 -> 0x05a3 }
            r12.H(r13, r2)     // Catch:{ e80 -> 0x05a3 }
            goto L_0x000a
        L_0x0455:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ e80 -> 0x05a3 }
            long r5 = r14.z()     // Catch:{ e80 -> 0x05a3 }
            com.google.android.gms.internal.ads.oq.d(r13, r3, r5)     // Catch:{ e80 -> 0x05a3 }
            r12.H(r13, r2)     // Catch:{ e80 -> 0x05a3 }
            goto L_0x000a
        L_0x0464:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ e80 -> 0x05a3 }
            int r1 = r14.y()     // Catch:{ e80 -> 0x05a3 }
            com.google.android.gms.internal.ads.oq.i(r13, r3, r1)     // Catch:{ e80 -> 0x05a3 }
            r12.H(r13, r2)     // Catch:{ e80 -> 0x05a3 }
            goto L_0x000a
        L_0x0473:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ e80 -> 0x05a3 }
            long r5 = r14.x()     // Catch:{ e80 -> 0x05a3 }
            com.google.android.gms.internal.ads.oq.d(r13, r3, r5)     // Catch:{ e80 -> 0x05a3 }
            r12.H(r13, r2)     // Catch:{ e80 -> 0x05a3 }
            goto L_0x000a
        L_0x0482:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ e80 -> 0x05a3 }
            int r1 = r14.w()     // Catch:{ e80 -> 0x05a3 }
            com.google.android.gms.internal.ads.oq.i(r13, r3, r1)     // Catch:{ e80 -> 0x05a3 }
            r12.H(r13, r2)     // Catch:{ e80 -> 0x05a3 }
            goto L_0x000a
        L_0x0491:
            int r4 = r14.v()     // Catch:{ e80 -> 0x05a3 }
            e8.z70 r6 = r12.M(r2)     // Catch:{ e80 -> 0x05a3 }
            if (r6 == 0) goto L_0x04a8
            boolean r6 = r6.a(r4)     // Catch:{ e80 -> 0x05a3 }
            if (r6 == 0) goto L_0x04a2
            goto L_0x04a8
        L_0x04a2:
            java.lang.Object r10 = com.google.android.gms.internal.ads.kq.a(r1, r4, r10, r7)     // Catch:{ e80 -> 0x05a3 }
            goto L_0x000a
        L_0x04a8:
            r1 = r3 & r5
            long r5 = (long) r1     // Catch:{ e80 -> 0x05a3 }
            com.google.android.gms.internal.ads.oq.i(r13, r5, r4)     // Catch:{ e80 -> 0x05a3 }
            r12.H(r13, r2)     // Catch:{ e80 -> 0x05a3 }
            goto L_0x000a
        L_0x04b3:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ e80 -> 0x05a3 }
            int r1 = r14.u()     // Catch:{ e80 -> 0x05a3 }
            com.google.android.gms.internal.ads.oq.i(r13, r3, r1)     // Catch:{ e80 -> 0x05a3 }
            r12.H(r13, r2)     // Catch:{ e80 -> 0x05a3 }
            goto L_0x000a
        L_0x04c2:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ e80 -> 0x05a3 }
            com.google.android.gms.internal.ads.mp r1 = r14.t()     // Catch:{ e80 -> 0x05a3 }
            com.google.android.gms.internal.ads.oq.e(r13, r3, r1)     // Catch:{ e80 -> 0x05a3 }
            r12.H(r13, r2)     // Catch:{ e80 -> 0x05a3 }
            goto L_0x000a
        L_0x04d1:
            boolean r1 = r12.F(r13, r2)     // Catch:{ e80 -> 0x05a3 }
            if (r1 == 0) goto L_0x04ef
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ e80 -> 0x05a3 }
            java.lang.Object r1 = com.google.android.gms.internal.ads.oq.u(r13, r3)     // Catch:{ e80 -> 0x05a3 }
            com.google.android.gms.internal.ads.iq r2 = r12.K(r2)     // Catch:{ e80 -> 0x05a3 }
            java.lang.Object r2 = r14.d(r2, r15)     // Catch:{ e80 -> 0x05a3 }
            java.lang.Object r1 = e8.v70.b(r1, r2)     // Catch:{ e80 -> 0x05a3 }
            com.google.android.gms.internal.ads.oq.e(r13, r3, r1)     // Catch:{ e80 -> 0x05a3 }
            goto L_0x000a
        L_0x04ef:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ e80 -> 0x05a3 }
            com.google.android.gms.internal.ads.iq r1 = r12.K(r2)     // Catch:{ e80 -> 0x05a3 }
            java.lang.Object r1 = r14.d(r1, r15)     // Catch:{ e80 -> 0x05a3 }
            com.google.android.gms.internal.ads.oq.e(r13, r3, r1)     // Catch:{ e80 -> 0x05a3 }
            r12.H(r13, r2)     // Catch:{ e80 -> 0x05a3 }
            goto L_0x000a
        L_0x0502:
            r12.u(r13, r3, r14)     // Catch:{ e80 -> 0x05a3 }
            r12.H(r13, r2)     // Catch:{ e80 -> 0x05a3 }
            goto L_0x000a
        L_0x050a:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ e80 -> 0x05a3 }
            boolean r1 = r14.r()     // Catch:{ e80 -> 0x05a3 }
            com.google.android.gms.internal.ads.oq.f(r13, r3, r1)     // Catch:{ e80 -> 0x05a3 }
            r12.H(r13, r2)     // Catch:{ e80 -> 0x05a3 }
            goto L_0x000a
        L_0x0519:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ e80 -> 0x05a3 }
            int r1 = r14.q()     // Catch:{ e80 -> 0x05a3 }
            com.google.android.gms.internal.ads.oq.i(r13, r3, r1)     // Catch:{ e80 -> 0x05a3 }
            r12.H(r13, r2)     // Catch:{ e80 -> 0x05a3 }
            goto L_0x000a
        L_0x0528:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ e80 -> 0x05a3 }
            long r5 = r14.p()     // Catch:{ e80 -> 0x05a3 }
            com.google.android.gms.internal.ads.oq.d(r13, r3, r5)     // Catch:{ e80 -> 0x05a3 }
            r12.H(r13, r2)     // Catch:{ e80 -> 0x05a3 }
            goto L_0x000a
        L_0x0537:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ e80 -> 0x05a3 }
            int r1 = r14.o()     // Catch:{ e80 -> 0x05a3 }
            com.google.android.gms.internal.ads.oq$d r5 = com.google.android.gms.internal.ads.oq.f7704d     // Catch:{ e80 -> 0x05a3 }
            r5.e(r13, r3, r1)     // Catch:{ e80 -> 0x05a3 }
            r12.H(r13, r2)     // Catch:{ e80 -> 0x05a3 }
            goto L_0x000a
        L_0x0548:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ e80 -> 0x05a3 }
            long r5 = r14.m()     // Catch:{ e80 -> 0x05a3 }
            com.google.android.gms.internal.ads.oq.d(r13, r3, r5)     // Catch:{ e80 -> 0x05a3 }
            r12.H(r13, r2)     // Catch:{ e80 -> 0x05a3 }
            goto L_0x000a
        L_0x0557:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ e80 -> 0x05a3 }
            long r5 = r14.n()     // Catch:{ e80 -> 0x05a3 }
            com.google.android.gms.internal.ads.oq.d(r13, r3, r5)     // Catch:{ e80 -> 0x05a3 }
            r12.H(r13, r2)     // Catch:{ e80 -> 0x05a3 }
            goto L_0x000a
        L_0x0566:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ e80 -> 0x05a3 }
            float r1 = r14.b()     // Catch:{ e80 -> 0x05a3 }
            com.google.android.gms.internal.ads.oq$d r5 = com.google.android.gms.internal.ads.oq.f7704d     // Catch:{ e80 -> 0x05a3 }
            r5.b(r13, r3, r1)     // Catch:{ e80 -> 0x05a3 }
            r12.H(r13, r2)     // Catch:{ e80 -> 0x05a3 }
            goto L_0x000a
        L_0x0577:
            r1 = r3 & r5
            long r3 = (long) r1     // Catch:{ e80 -> 0x05a3 }
            double r5 = r14.a()     // Catch:{ e80 -> 0x05a3 }
            com.google.android.gms.internal.ads.oq.c(r13, r3, r5)     // Catch:{ e80 -> 0x05a3 }
            r12.H(r13, r2)     // Catch:{ e80 -> 0x05a3 }
            goto L_0x000a
        L_0x0586:
            r10 = r1
        L_0x0587:
            boolean r1 = r7.f(r10, r14)     // Catch:{ e80 -> 0x05a3 }
            if (r1 != 0) goto L_0x000a
            int r14 = r12.f6307j
        L_0x058f:
            int r15 = r12.f6308k
            if (r14 >= r15) goto L_0x059d
            int[] r15 = r12.f6306i
            r15 = r15[r14]
            r12.p(r13, r15, r10, r7)
            int r14 = r14 + 1
            goto L_0x058f
        L_0x059d:
            if (r10 == 0) goto L_0x05a2
            r7.r(r13, r10)
        L_0x05a2:
            return
        L_0x05a3:
            r7.e(r14)     // Catch:{ all -> 0x05c9 }
            if (r10 != 0) goto L_0x05ad
            java.lang.Object r1 = r7.k(r13)     // Catch:{ all -> 0x05c9 }
            r10 = r1
        L_0x05ad:
            boolean r1 = r7.f(r10, r14)     // Catch:{ all -> 0x05c9 }
            if (r1 != 0) goto L_0x000a
            int r14 = r12.f6307j
        L_0x05b5:
            int r15 = r12.f6308k
            if (r14 >= r15) goto L_0x05c3
            int[] r15 = r12.f6306i
            r15 = r15[r14]
            r12.p(r13, r15, r10, r7)
            int r14 = r14 + 1
            goto L_0x05b5
        L_0x05c3:
            if (r10 == 0) goto L_0x05c8
            r7.r(r13, r10)
        L_0x05c8:
            return
        L_0x05c9:
            r14 = move-exception
            int r15 = r12.f6307j
        L_0x05cc:
            int r0 = r12.f6308k
            if (r15 >= r0) goto L_0x05da
            int[] r0 = r12.f6306i
            r0 = r0[r15]
            r12.p(r13, r0, r10, r7)
            int r15 = r15 + 1
            goto L_0x05cc
        L_0x05da:
            if (r10 == 0) goto L_0x05df
            r7.r(r13, r10)
        L_0x05df:
            goto L_0x05e1
        L_0x05e0:
            throw r14
        L_0x05e1:
            goto L_0x05e0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.eq.h(java.lang.Object, com.google.android.gms.internal.ads.rp, com.google.android.gms.internal.ads.up):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x02a1, code lost:
        r4 = ((r7 + r6) + r5) + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x072e, code lost:
        r5 = ((r10 + r9) + r8) + r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int i(T r15) {
        /*
            r14 = this;
            boolean r0 = r14.f6305h
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r2 = 0
            r3 = 267386880(0xff00000, float:2.3665827E-29)
            if (r0 == 0) goto L_0x0487
            sun.misc.Unsafe r0 = f6297r
            r2 = 0
            r4 = 0
        L_0x000e:
            int[] r5 = r14.f6298a
            int r5 = r5.length
            if (r2 >= r5) goto L_0x047b
            int r5 = r14.N(r2)
            r6 = r5 & r3
            int r6 = r6 >>> 20
            int[] r7 = r14.f6298a
            r8 = r7[r2]
            r5 = r5 & r1
            long r9 = (long) r5
            com.google.android.gms.internal.ads.yp r5 = com.google.android.gms.internal.ads.yp.DOUBLE_LIST_PACKED
            int r5 = r5.f8618a
            if (r6 < r5) goto L_0x0031
            com.google.android.gms.internal.ads.yp r5 = com.google.android.gms.internal.ads.yp.SINT64_LIST_PACKED
            int r5 = r5.f8618a
            if (r6 > r5) goto L_0x0031
            int r5 = r2 + 2
            r5 = r7[r5]
        L_0x0031:
            switch(r6) {
                case 0: goto L_0x046c;
                case 1: goto L_0x0461;
                case 2: goto L_0x0452;
                case 3: goto L_0x0443;
                case 4: goto L_0x0434;
                case 5: goto L_0x0429;
                case 6: goto L_0x041e;
                case 7: goto L_0x0413;
                case 8: goto L_0x03f6;
                case 9: goto L_0x03e2;
                case 10: goto L_0x03d0;
                case 11: goto L_0x03c0;
                case 12: goto L_0x03b0;
                case 13: goto L_0x03a4;
                case 14: goto L_0x0398;
                case 15: goto L_0x0388;
                case 16: goto L_0x0378;
                case 17: goto L_0x0362;
                case 18: goto L_0x0358;
                case 19: goto L_0x034e;
                case 20: goto L_0x0344;
                case 21: goto L_0x033a;
                case 22: goto L_0x0330;
                case 23: goto L_0x0326;
                case 24: goto L_0x031c;
                case 25: goto L_0x0305;
                case 26: goto L_0x02fb;
                case 27: goto L_0x02ed;
                case 28: goto L_0x02e3;
                case 29: goto L_0x02d9;
                case 30: goto L_0x02cf;
                case 31: goto L_0x02c5;
                case 32: goto L_0x02bb;
                case 33: goto L_0x02b1;
                case 34: goto L_0x02a7;
                case 35: goto L_0x028d;
                case 36: goto L_0x0278;
                case 37: goto L_0x0263;
                case 38: goto L_0x024e;
                case 39: goto L_0x0239;
                case 40: goto L_0x0224;
                case 41: goto L_0x020e;
                case 42: goto L_0x01f6;
                case 43: goto L_0x01e0;
                case 44: goto L_0x01ca;
                case 45: goto L_0x01b4;
                case 46: goto L_0x019e;
                case 47: goto L_0x0188;
                case 48: goto L_0x0172;
                case 49: goto L_0x0164;
                case 50: goto L_0x0154;
                case 51: goto L_0x0148;
                case 52: goto L_0x013c;
                case 53: goto L_0x012c;
                case 54: goto L_0x011c;
                case 55: goto L_0x010c;
                case 56: goto L_0x0100;
                case 57: goto L_0x00f4;
                case 58: goto L_0x00e8;
                case 59: goto L_0x00ca;
                case 60: goto L_0x00b6;
                case 61: goto L_0x00a4;
                case 62: goto L_0x0094;
                case 63: goto L_0x0084;
                case 64: goto L_0x0078;
                case 65: goto L_0x006c;
                case 66: goto L_0x005c;
                case 67: goto L_0x004c;
                case 68: goto L_0x0036;
                default: goto L_0x0034;
            }
        L_0x0034:
            goto L_0x0477
        L_0x0036:
            boolean r5 = r14.w(r15, r8, r2)
            if (r5 == 0) goto L_0x0477
            java.lang.Object r5 = com.google.android.gms.internal.ads.oq.u(r15, r9)
            com.google.android.gms.internal.ads.cq r5 = (com.google.android.gms.internal.ads.cq) r5
            com.google.android.gms.internal.ads.iq r6 = r14.K(r2)
            int r5 = com.google.android.gms.internal.ads.sp.w(r8, r5, r6)
            goto L_0x0476
        L_0x004c:
            boolean r5 = r14.w(r15, r8, r2)
            if (r5 == 0) goto L_0x0477
            long r5 = Q(r15, r9)
            int r5 = com.google.android.gms.internal.ads.sp.U(r8, r5)
            goto L_0x0476
        L_0x005c:
            boolean r5 = r14.w(r15, r8, r2)
            if (r5 == 0) goto L_0x0477
            int r5 = J(r15, r9)
            int r5 = com.google.android.gms.internal.ads.sp.m(r8, r5)
            goto L_0x0476
        L_0x006c:
            boolean r5 = r14.w(r15, r8, r2)
            if (r5 == 0) goto L_0x0477
            int r5 = com.google.android.gms.internal.ads.sp.W(r8)
            goto L_0x0476
        L_0x0078:
            boolean r5 = r14.w(r15, r8, r2)
            if (r5 == 0) goto L_0x0477
            int r5 = com.google.android.gms.internal.ads.sp.p(r8)
            goto L_0x0476
        L_0x0084:
            boolean r5 = r14.w(r15, r8, r2)
            if (r5 == 0) goto L_0x0477
            int r5 = J(r15, r9)
            int r5 = com.google.android.gms.internal.ads.sp.q(r8, r5)
            goto L_0x0476
        L_0x0094:
            boolean r5 = r14.w(r15, r8, r2)
            if (r5 == 0) goto L_0x0477
            int r5 = J(r15, r9)
            int r5 = com.google.android.gms.internal.ads.sp.l(r8, r5)
            goto L_0x0476
        L_0x00a4:
            boolean r5 = r14.w(r15, r8, r2)
            if (r5 == 0) goto L_0x0477
            java.lang.Object r5 = com.google.android.gms.internal.ads.oq.u(r15, r9)
            com.google.android.gms.internal.ads.mp r5 = (com.google.android.gms.internal.ads.mp) r5
            int r5 = com.google.android.gms.internal.ads.sp.v(r8, r5)
            goto L_0x0476
        L_0x00b6:
            boolean r5 = r14.w(r15, r8, r2)
            if (r5 == 0) goto L_0x0477
            java.lang.Object r5 = com.google.android.gms.internal.ads.oq.u(r15, r9)
            com.google.android.gms.internal.ads.iq r6 = r14.K(r2)
            int r5 = com.google.android.gms.internal.ads.kq.t(r8, r5, r6)
            goto L_0x0476
        L_0x00ca:
            boolean r5 = r14.w(r15, r8, r2)
            if (r5 == 0) goto L_0x0477
            java.lang.Object r5 = com.google.android.gms.internal.ads.oq.u(r15, r9)
            boolean r6 = r5 instanceof com.google.android.gms.internal.ads.mp
            if (r6 == 0) goto L_0x00e0
            com.google.android.gms.internal.ads.mp r5 = (com.google.android.gms.internal.ads.mp) r5
            int r5 = com.google.android.gms.internal.ads.sp.v(r8, r5)
            goto L_0x0476
        L_0x00e0:
            java.lang.String r5 = (java.lang.String) r5
            int r5 = com.google.android.gms.internal.ads.sp.Q(r8, r5)
            goto L_0x0476
        L_0x00e8:
            boolean r5 = r14.w(r15, r8, r2)
            if (r5 == 0) goto L_0x0477
            int r5 = com.google.android.gms.internal.ads.sp.M(r8)
            goto L_0x0476
        L_0x00f4:
            boolean r5 = r14.w(r15, r8, r2)
            if (r5 == 0) goto L_0x0477
            int r5 = com.google.android.gms.internal.ads.sp.n(r8)
            goto L_0x0476
        L_0x0100:
            boolean r5 = r14.w(r15, r8, r2)
            if (r5 == 0) goto L_0x0477
            int r5 = com.google.android.gms.internal.ads.sp.V(r8)
            goto L_0x0476
        L_0x010c:
            boolean r5 = r14.w(r15, r8, r2)
            if (r5 == 0) goto L_0x0477
            int r5 = J(r15, r9)
            int r5 = com.google.android.gms.internal.ads.sp.k(r8, r5)
            goto L_0x0476
        L_0x011c:
            boolean r5 = r14.w(r15, r8, r2)
            if (r5 == 0) goto L_0x0477
            long r5 = Q(r15, r9)
            int r5 = com.google.android.gms.internal.ads.sp.T(r8, r5)
            goto L_0x0476
        L_0x012c:
            boolean r5 = r14.w(r15, r8, r2)
            if (r5 == 0) goto L_0x0477
            long r5 = Q(r15, r9)
            int r5 = com.google.android.gms.internal.ads.sp.S(r8, r5)
            goto L_0x0476
        L_0x013c:
            boolean r5 = r14.w(r15, r8, r2)
            if (r5 == 0) goto L_0x0477
            int r5 = com.google.android.gms.internal.ads.sp.r(r8)
            goto L_0x0476
        L_0x0148:
            boolean r5 = r14.w(r15, r8, r2)
            if (r5 == 0) goto L_0x0477
            int r5 = com.google.android.gms.internal.ads.sp.u(r8)
            goto L_0x0476
        L_0x0154:
            e8.v80 r5 = r14.f6313p
            java.lang.Object r6 = com.google.android.gms.internal.ads.oq.u(r15, r9)
            java.lang.Object r7 = r14.L(r2)
            int r5 = r5.c(r8, r6, r7)
            goto L_0x0476
        L_0x0164:
            java.util.List r5 = E(r15, r9)
            com.google.android.gms.internal.ads.iq r6 = r14.K(r2)
            int r5 = com.google.android.gms.internal.ads.kq.y(r8, r5, r6)
            goto L_0x0476
        L_0x0172:
            java.lang.Object r5 = r0.getObject(r15, r9)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.kq.i(r5)
            if (r5 <= 0) goto L_0x0477
            int r6 = com.google.android.gms.internal.ads.sp.G(r8)
            int r7 = com.google.android.gms.internal.ads.sp.I(r5)
            goto L_0x02a1
        L_0x0188:
            java.lang.Object r5 = r0.getObject(r15, r9)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.kq.m(r5)
            if (r5 <= 0) goto L_0x0477
            int r6 = com.google.android.gms.internal.ads.sp.G(r8)
            int r7 = com.google.android.gms.internal.ads.sp.I(r5)
            goto L_0x02a1
        L_0x019e:
            java.lang.Object r5 = r0.getObject(r15, r9)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.kq.o(r5)
            if (r5 <= 0) goto L_0x0477
            int r6 = com.google.android.gms.internal.ads.sp.G(r8)
            int r7 = com.google.android.gms.internal.ads.sp.I(r5)
            goto L_0x02a1
        L_0x01b4:
            java.lang.Object r5 = r0.getObject(r15, r9)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.kq.n(r5)
            if (r5 <= 0) goto L_0x0477
            int r6 = com.google.android.gms.internal.ads.sp.G(r8)
            int r7 = com.google.android.gms.internal.ads.sp.I(r5)
            goto L_0x02a1
        L_0x01ca:
            java.lang.Object r5 = r0.getObject(r15, r9)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.kq.j(r5)
            if (r5 <= 0) goto L_0x0477
            int r6 = com.google.android.gms.internal.ads.sp.G(r8)
            int r7 = com.google.android.gms.internal.ads.sp.I(r5)
            goto L_0x02a1
        L_0x01e0:
            java.lang.Object r5 = r0.getObject(r15, r9)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.kq.l(r5)
            if (r5 <= 0) goto L_0x0477
            int r6 = com.google.android.gms.internal.ads.sp.G(r8)
            int r7 = com.google.android.gms.internal.ads.sp.I(r5)
            goto L_0x02a1
        L_0x01f6:
            java.lang.Object r5 = r0.getObject(r15, r9)
            java.util.List r5 = (java.util.List) r5
            java.lang.Class<?> r6 = com.google.android.gms.internal.ads.kq.f7265a
            int r5 = r5.size()
            if (r5 <= 0) goto L_0x0477
            int r6 = com.google.android.gms.internal.ads.sp.G(r8)
            int r7 = com.google.android.gms.internal.ads.sp.I(r5)
            goto L_0x02a1
        L_0x020e:
            java.lang.Object r5 = r0.getObject(r15, r9)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.kq.n(r5)
            if (r5 <= 0) goto L_0x0477
            int r6 = com.google.android.gms.internal.ads.sp.G(r8)
            int r7 = com.google.android.gms.internal.ads.sp.I(r5)
            goto L_0x02a1
        L_0x0224:
            java.lang.Object r5 = r0.getObject(r15, r9)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.kq.o(r5)
            if (r5 <= 0) goto L_0x0477
            int r6 = com.google.android.gms.internal.ads.sp.G(r8)
            int r7 = com.google.android.gms.internal.ads.sp.I(r5)
            goto L_0x02a1
        L_0x0239:
            java.lang.Object r5 = r0.getObject(r15, r9)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.kq.k(r5)
            if (r5 <= 0) goto L_0x0477
            int r6 = com.google.android.gms.internal.ads.sp.G(r8)
            int r7 = com.google.android.gms.internal.ads.sp.I(r5)
            goto L_0x02a1
        L_0x024e:
            java.lang.Object r5 = r0.getObject(r15, r9)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.kq.h(r5)
            if (r5 <= 0) goto L_0x0477
            int r6 = com.google.android.gms.internal.ads.sp.G(r8)
            int r7 = com.google.android.gms.internal.ads.sp.I(r5)
            goto L_0x02a1
        L_0x0263:
            java.lang.Object r5 = r0.getObject(r15, r9)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.kq.g(r5)
            if (r5 <= 0) goto L_0x0477
            int r6 = com.google.android.gms.internal.ads.sp.G(r8)
            int r7 = com.google.android.gms.internal.ads.sp.I(r5)
            goto L_0x02a1
        L_0x0278:
            java.lang.Object r5 = r0.getObject(r15, r9)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.kq.n(r5)
            if (r5 <= 0) goto L_0x0477
            int r6 = com.google.android.gms.internal.ads.sp.G(r8)
            int r7 = com.google.android.gms.internal.ads.sp.I(r5)
            goto L_0x02a1
        L_0x028d:
            java.lang.Object r5 = r0.getObject(r15, r9)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.ads.kq.o(r5)
            if (r5 <= 0) goto L_0x0477
            int r6 = com.google.android.gms.internal.ads.sp.G(r8)
            int r7 = com.google.android.gms.internal.ads.sp.I(r5)
        L_0x02a1:
            int r7 = r7 + r6
            int r7 = r7 + r5
            int r7 = r7 + r4
            r4 = r7
            goto L_0x0477
        L_0x02a7:
            java.util.List r5 = E(r15, r9)
            int r5 = com.google.android.gms.internal.ads.kq.N(r8, r5)
            goto L_0x0476
        L_0x02b1:
            java.util.List r5 = E(r15, r9)
            int r5 = com.google.android.gms.internal.ads.kq.R(r8, r5)
            goto L_0x0476
        L_0x02bb:
            java.util.List r5 = E(r15, r9)
            int r5 = com.google.android.gms.internal.ads.kq.T(r8, r5)
            goto L_0x0476
        L_0x02c5:
            java.util.List r5 = E(r15, r9)
            int r5 = com.google.android.gms.internal.ads.kq.S(r8, r5)
            goto L_0x0476
        L_0x02cf:
            java.util.List r5 = E(r15, r9)
            int r5 = com.google.android.gms.internal.ads.kq.O(r8, r5)
            goto L_0x0476
        L_0x02d9:
            java.util.List r5 = E(r15, r9)
            int r5 = com.google.android.gms.internal.ads.kq.Q(r8, r5)
            goto L_0x0476
        L_0x02e3:
            java.util.List r5 = E(r15, r9)
            int r5 = com.google.android.gms.internal.ads.kq.x(r8, r5)
            goto L_0x0476
        L_0x02ed:
            java.util.List r5 = E(r15, r9)
            com.google.android.gms.internal.ads.iq r6 = r14.K(r2)
            int r5 = com.google.android.gms.internal.ads.kq.v(r8, r5, r6)
            goto L_0x0476
        L_0x02fb:
            java.util.List r5 = E(r15, r9)
            int r5 = com.google.android.gms.internal.ads.kq.u(r8, r5)
            goto L_0x0476
        L_0x0305:
            java.util.List r5 = E(r15, r9)
            java.lang.Class<?> r6 = com.google.android.gms.internal.ads.kq.f7265a
            int r5 = r5.size()
            if (r5 != 0) goto L_0x0314
            r5 = 0
            goto L_0x0476
        L_0x0314:
            int r6 = com.google.android.gms.internal.ads.sp.M(r8)
            int r5 = r5 * r6
            goto L_0x0476
        L_0x031c:
            java.util.List r5 = E(r15, r9)
            int r5 = com.google.android.gms.internal.ads.kq.S(r8, r5)
            goto L_0x0476
        L_0x0326:
            java.util.List r5 = E(r15, r9)
            int r5 = com.google.android.gms.internal.ads.kq.T(r8, r5)
            goto L_0x0476
        L_0x0330:
            java.util.List r5 = E(r15, r9)
            int r5 = com.google.android.gms.internal.ads.kq.P(r8, r5)
            goto L_0x0476
        L_0x033a:
            java.util.List r5 = E(r15, r9)
            int r5 = com.google.android.gms.internal.ads.kq.M(r8, r5)
            goto L_0x0476
        L_0x0344:
            java.util.List r5 = E(r15, r9)
            int r5 = com.google.android.gms.internal.ads.kq.L(r8, r5)
            goto L_0x0476
        L_0x034e:
            java.util.List r5 = E(r15, r9)
            int r5 = com.google.android.gms.internal.ads.kq.S(r8, r5)
            goto L_0x0476
        L_0x0358:
            java.util.List r5 = E(r15, r9)
            int r5 = com.google.android.gms.internal.ads.kq.T(r8, r5)
            goto L_0x0476
        L_0x0362:
            boolean r5 = r14.F(r15, r2)
            if (r5 == 0) goto L_0x0477
            java.lang.Object r5 = com.google.android.gms.internal.ads.oq.u(r15, r9)
            com.google.android.gms.internal.ads.cq r5 = (com.google.android.gms.internal.ads.cq) r5
            com.google.android.gms.internal.ads.iq r6 = r14.K(r2)
            int r5 = com.google.android.gms.internal.ads.sp.w(r8, r5, r6)
            goto L_0x0476
        L_0x0378:
            boolean r5 = r14.F(r15, r2)
            if (r5 == 0) goto L_0x0477
            long r5 = com.google.android.gms.internal.ads.oq.p(r15, r9)
            int r5 = com.google.android.gms.internal.ads.sp.U(r8, r5)
            goto L_0x0476
        L_0x0388:
            boolean r5 = r14.F(r15, r2)
            if (r5 == 0) goto L_0x0477
            int r5 = com.google.android.gms.internal.ads.oq.n(r15, r9)
            int r5 = com.google.android.gms.internal.ads.sp.m(r8, r5)
            goto L_0x0476
        L_0x0398:
            boolean r5 = r14.F(r15, r2)
            if (r5 == 0) goto L_0x0477
            int r5 = com.google.android.gms.internal.ads.sp.W(r8)
            goto L_0x0476
        L_0x03a4:
            boolean r5 = r14.F(r15, r2)
            if (r5 == 0) goto L_0x0477
            int r5 = com.google.android.gms.internal.ads.sp.p(r8)
            goto L_0x0476
        L_0x03b0:
            boolean r5 = r14.F(r15, r2)
            if (r5 == 0) goto L_0x0477
            int r5 = com.google.android.gms.internal.ads.oq.n(r15, r9)
            int r5 = com.google.android.gms.internal.ads.sp.q(r8, r5)
            goto L_0x0476
        L_0x03c0:
            boolean r5 = r14.F(r15, r2)
            if (r5 == 0) goto L_0x0477
            int r5 = com.google.android.gms.internal.ads.oq.n(r15, r9)
            int r5 = com.google.android.gms.internal.ads.sp.l(r8, r5)
            goto L_0x0476
        L_0x03d0:
            boolean r5 = r14.F(r15, r2)
            if (r5 == 0) goto L_0x0477
            java.lang.Object r5 = com.google.android.gms.internal.ads.oq.u(r15, r9)
            com.google.android.gms.internal.ads.mp r5 = (com.google.android.gms.internal.ads.mp) r5
            int r5 = com.google.android.gms.internal.ads.sp.v(r8, r5)
            goto L_0x0476
        L_0x03e2:
            boolean r5 = r14.F(r15, r2)
            if (r5 == 0) goto L_0x0477
            java.lang.Object r5 = com.google.android.gms.internal.ads.oq.u(r15, r9)
            com.google.android.gms.internal.ads.iq r6 = r14.K(r2)
            int r5 = com.google.android.gms.internal.ads.kq.t(r8, r5, r6)
            goto L_0x0476
        L_0x03f6:
            boolean r5 = r14.F(r15, r2)
            if (r5 == 0) goto L_0x0477
            java.lang.Object r5 = com.google.android.gms.internal.ads.oq.u(r15, r9)
            boolean r6 = r5 instanceof com.google.android.gms.internal.ads.mp
            if (r6 == 0) goto L_0x040c
            com.google.android.gms.internal.ads.mp r5 = (com.google.android.gms.internal.ads.mp) r5
            int r5 = com.google.android.gms.internal.ads.sp.v(r8, r5)
            goto L_0x0476
        L_0x040c:
            java.lang.String r5 = (java.lang.String) r5
            int r5 = com.google.android.gms.internal.ads.sp.Q(r8, r5)
            goto L_0x0476
        L_0x0413:
            boolean r5 = r14.F(r15, r2)
            if (r5 == 0) goto L_0x0477
            int r5 = com.google.android.gms.internal.ads.sp.M(r8)
            goto L_0x0476
        L_0x041e:
            boolean r5 = r14.F(r15, r2)
            if (r5 == 0) goto L_0x0477
            int r5 = com.google.android.gms.internal.ads.sp.n(r8)
            goto L_0x0476
        L_0x0429:
            boolean r5 = r14.F(r15, r2)
            if (r5 == 0) goto L_0x0477
            int r5 = com.google.android.gms.internal.ads.sp.V(r8)
            goto L_0x0476
        L_0x0434:
            boolean r5 = r14.F(r15, r2)
            if (r5 == 0) goto L_0x0477
            int r5 = com.google.android.gms.internal.ads.oq.n(r15, r9)
            int r5 = com.google.android.gms.internal.ads.sp.k(r8, r5)
            goto L_0x0476
        L_0x0443:
            boolean r5 = r14.F(r15, r2)
            if (r5 == 0) goto L_0x0477
            long r5 = com.google.android.gms.internal.ads.oq.p(r15, r9)
            int r5 = com.google.android.gms.internal.ads.sp.T(r8, r5)
            goto L_0x0476
        L_0x0452:
            boolean r5 = r14.F(r15, r2)
            if (r5 == 0) goto L_0x0477
            long r5 = com.google.android.gms.internal.ads.oq.p(r15, r9)
            int r5 = com.google.android.gms.internal.ads.sp.S(r8, r5)
            goto L_0x0476
        L_0x0461:
            boolean r5 = r14.F(r15, r2)
            if (r5 == 0) goto L_0x0477
            int r5 = com.google.android.gms.internal.ads.sp.r(r8)
            goto L_0x0476
        L_0x046c:
            boolean r5 = r14.F(r15, r2)
            if (r5 == 0) goto L_0x0477
            int r5 = com.google.android.gms.internal.ads.sp.u(r8)
        L_0x0476:
            int r4 = r4 + r5
        L_0x0477:
            int r2 = r2 + 3
            goto L_0x000e
        L_0x047b:
            com.google.android.gms.internal.ads.lq<?, ?> r0 = r14.f6311n
            java.lang.Object r15 = r0.j(r15)
            int r15 = r0.i(r15)
            int r15 = r15 + r4
            return r15
        L_0x0487:
            sun.misc.Unsafe r0 = f6297r
            r4 = 0
            r5 = 0
            r6 = 1048575(0xfffff, float:1.469367E-39)
            r7 = 0
        L_0x048f:
            int[] r8 = r14.f6298a
            int r8 = r8.length
            if (r4 >= r8) goto L_0x0905
            int r8 = r14.N(r4)
            int[] r9 = r14.f6298a
            r10 = r9[r4]
            r11 = r8 & r3
            int r11 = r11 >>> 20
            r12 = 17
            if (r11 > r12) goto L_0x04b9
            int r12 = r4 + 2
            r9 = r9[r12]
            r12 = r9 & r1
            int r9 = r9 >>> 20
            r13 = 1
            int r9 = r13 << r9
            if (r12 == r6) goto L_0x04ba
            long r6 = (long) r12
            int r6 = r0.getInt(r15, r6)
            r7 = r6
            r6 = r12
            goto L_0x04ba
        L_0x04b9:
            r9 = 0
        L_0x04ba:
            r8 = r8 & r1
            long r12 = (long) r8
            switch(r11) {
                case 0: goto L_0x08f8;
                case 1: goto L_0x08ef;
                case 2: goto L_0x08e2;
                case 3: goto L_0x08d5;
                case 4: goto L_0x08c8;
                case 5: goto L_0x08bf;
                case 6: goto L_0x08b6;
                case 7: goto L_0x08ad;
                case 8: goto L_0x0893;
                case 9: goto L_0x0881;
                case 10: goto L_0x0871;
                case 11: goto L_0x0863;
                case 12: goto L_0x0855;
                case 13: goto L_0x084b;
                case 14: goto L_0x0841;
                case 15: goto L_0x0833;
                case 16: goto L_0x0825;
                case 17: goto L_0x0811;
                case 18: goto L_0x0805;
                case 19: goto L_0x07f9;
                case 20: goto L_0x07ed;
                case 21: goto L_0x07e1;
                case 22: goto L_0x07d5;
                case 23: goto L_0x07c9;
                case 24: goto L_0x07bd;
                case 25: goto L_0x07a4;
                case 26: goto L_0x0798;
                case 27: goto L_0x0788;
                case 28: goto L_0x077c;
                case 29: goto L_0x0770;
                case 30: goto L_0x0764;
                case 31: goto L_0x0758;
                case 32: goto L_0x074c;
                case 33: goto L_0x0740;
                case 34: goto L_0x0734;
                case 35: goto L_0x071a;
                case 36: goto L_0x0705;
                case 37: goto L_0x06f0;
                case 38: goto L_0x06db;
                case 39: goto L_0x06c6;
                case 40: goto L_0x06b1;
                case 41: goto L_0x069b;
                case 42: goto L_0x0683;
                case 43: goto L_0x066d;
                case 44: goto L_0x0657;
                case 45: goto L_0x0641;
                case 46: goto L_0x062b;
                case 47: goto L_0x0615;
                case 48: goto L_0x05ff;
                case 49: goto L_0x05ef;
                case 50: goto L_0x05df;
                case 51: goto L_0x05d3;
                case 52: goto L_0x05c7;
                case 53: goto L_0x05b7;
                case 54: goto L_0x05a7;
                case 55: goto L_0x0597;
                case 56: goto L_0x058b;
                case 57: goto L_0x057f;
                case 58: goto L_0x0573;
                case 59: goto L_0x0555;
                case 60: goto L_0x0541;
                case 61: goto L_0x052f;
                case 62: goto L_0x051f;
                case 63: goto L_0x050f;
                case 64: goto L_0x0503;
                case 65: goto L_0x04f7;
                case 66: goto L_0x04e7;
                case 67: goto L_0x04d7;
                case 68: goto L_0x04c1;
                default: goto L_0x04bf;
            }
        L_0x04bf:
            goto L_0x0901
        L_0x04c1:
            boolean r8 = r14.w(r15, r10, r4)
            if (r8 == 0) goto L_0x0901
            java.lang.Object r8 = r0.getObject(r15, r12)
            com.google.android.gms.internal.ads.cq r8 = (com.google.android.gms.internal.ads.cq) r8
            com.google.android.gms.internal.ads.iq r9 = r14.K(r4)
            int r8 = com.google.android.gms.internal.ads.sp.w(r10, r8, r9)
            goto L_0x0900
        L_0x04d7:
            boolean r8 = r14.w(r15, r10, r4)
            if (r8 == 0) goto L_0x0901
            long r8 = Q(r15, r12)
            int r8 = com.google.android.gms.internal.ads.sp.U(r10, r8)
            goto L_0x0900
        L_0x04e7:
            boolean r8 = r14.w(r15, r10, r4)
            if (r8 == 0) goto L_0x0901
            int r8 = J(r15, r12)
            int r8 = com.google.android.gms.internal.ads.sp.m(r10, r8)
            goto L_0x0900
        L_0x04f7:
            boolean r8 = r14.w(r15, r10, r4)
            if (r8 == 0) goto L_0x0901
            int r8 = com.google.android.gms.internal.ads.sp.W(r10)
            goto L_0x0900
        L_0x0503:
            boolean r8 = r14.w(r15, r10, r4)
            if (r8 == 0) goto L_0x0901
            int r8 = com.google.android.gms.internal.ads.sp.p(r10)
            goto L_0x0900
        L_0x050f:
            boolean r8 = r14.w(r15, r10, r4)
            if (r8 == 0) goto L_0x0901
            int r8 = J(r15, r12)
            int r8 = com.google.android.gms.internal.ads.sp.q(r10, r8)
            goto L_0x0900
        L_0x051f:
            boolean r8 = r14.w(r15, r10, r4)
            if (r8 == 0) goto L_0x0901
            int r8 = J(r15, r12)
            int r8 = com.google.android.gms.internal.ads.sp.l(r10, r8)
            goto L_0x0900
        L_0x052f:
            boolean r8 = r14.w(r15, r10, r4)
            if (r8 == 0) goto L_0x0901
            java.lang.Object r8 = r0.getObject(r15, r12)
            com.google.android.gms.internal.ads.mp r8 = (com.google.android.gms.internal.ads.mp) r8
            int r8 = com.google.android.gms.internal.ads.sp.v(r10, r8)
            goto L_0x0900
        L_0x0541:
            boolean r8 = r14.w(r15, r10, r4)
            if (r8 == 0) goto L_0x0901
            java.lang.Object r8 = r0.getObject(r15, r12)
            com.google.android.gms.internal.ads.iq r9 = r14.K(r4)
            int r8 = com.google.android.gms.internal.ads.kq.t(r10, r8, r9)
            goto L_0x0900
        L_0x0555:
            boolean r8 = r14.w(r15, r10, r4)
            if (r8 == 0) goto L_0x0901
            java.lang.Object r8 = r0.getObject(r15, r12)
            boolean r9 = r8 instanceof com.google.android.gms.internal.ads.mp
            if (r9 == 0) goto L_0x056b
            com.google.android.gms.internal.ads.mp r8 = (com.google.android.gms.internal.ads.mp) r8
            int r8 = com.google.android.gms.internal.ads.sp.v(r10, r8)
            goto L_0x0900
        L_0x056b:
            java.lang.String r8 = (java.lang.String) r8
            int r8 = com.google.android.gms.internal.ads.sp.Q(r10, r8)
            goto L_0x0900
        L_0x0573:
            boolean r8 = r14.w(r15, r10, r4)
            if (r8 == 0) goto L_0x0901
            int r8 = com.google.android.gms.internal.ads.sp.M(r10)
            goto L_0x0900
        L_0x057f:
            boolean r8 = r14.w(r15, r10, r4)
            if (r8 == 0) goto L_0x0901
            int r8 = com.google.android.gms.internal.ads.sp.n(r10)
            goto L_0x0900
        L_0x058b:
            boolean r8 = r14.w(r15, r10, r4)
            if (r8 == 0) goto L_0x0901
            int r8 = com.google.android.gms.internal.ads.sp.V(r10)
            goto L_0x0900
        L_0x0597:
            boolean r8 = r14.w(r15, r10, r4)
            if (r8 == 0) goto L_0x0901
            int r8 = J(r15, r12)
            int r8 = com.google.android.gms.internal.ads.sp.k(r10, r8)
            goto L_0x0900
        L_0x05a7:
            boolean r8 = r14.w(r15, r10, r4)
            if (r8 == 0) goto L_0x0901
            long r8 = Q(r15, r12)
            int r8 = com.google.android.gms.internal.ads.sp.T(r10, r8)
            goto L_0x0900
        L_0x05b7:
            boolean r8 = r14.w(r15, r10, r4)
            if (r8 == 0) goto L_0x0901
            long r8 = Q(r15, r12)
            int r8 = com.google.android.gms.internal.ads.sp.S(r10, r8)
            goto L_0x0900
        L_0x05c7:
            boolean r8 = r14.w(r15, r10, r4)
            if (r8 == 0) goto L_0x0901
            int r8 = com.google.android.gms.internal.ads.sp.r(r10)
            goto L_0x0900
        L_0x05d3:
            boolean r8 = r14.w(r15, r10, r4)
            if (r8 == 0) goto L_0x0901
            int r8 = com.google.android.gms.internal.ads.sp.u(r10)
            goto L_0x0900
        L_0x05df:
            e8.v80 r8 = r14.f6313p
            java.lang.Object r9 = r0.getObject(r15, r12)
            java.lang.Object r11 = r14.L(r4)
            int r8 = r8.c(r10, r9, r11)
            goto L_0x0900
        L_0x05ef:
            java.lang.Object r8 = r0.getObject(r15, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.iq r9 = r14.K(r4)
            int r8 = com.google.android.gms.internal.ads.kq.y(r10, r8, r9)
            goto L_0x0900
        L_0x05ff:
            java.lang.Object r8 = r0.getObject(r15, r12)
            java.util.List r8 = (java.util.List) r8
            int r8 = com.google.android.gms.internal.ads.kq.i(r8)
            if (r8 <= 0) goto L_0x0901
            int r9 = com.google.android.gms.internal.ads.sp.G(r10)
            int r10 = com.google.android.gms.internal.ads.sp.I(r8)
            goto L_0x072e
        L_0x0615:
            java.lang.Object r8 = r0.getObject(r15, r12)
            java.util.List r8 = (java.util.List) r8
            int r8 = com.google.android.gms.internal.ads.kq.m(r8)
            if (r8 <= 0) goto L_0x0901
            int r9 = com.google.android.gms.internal.ads.sp.G(r10)
            int r10 = com.google.android.gms.internal.ads.sp.I(r8)
            goto L_0x072e
        L_0x062b:
            java.lang.Object r8 = r0.getObject(r15, r12)
            java.util.List r8 = (java.util.List) r8
            int r8 = com.google.android.gms.internal.ads.kq.o(r8)
            if (r8 <= 0) goto L_0x0901
            int r9 = com.google.android.gms.internal.ads.sp.G(r10)
            int r10 = com.google.android.gms.internal.ads.sp.I(r8)
            goto L_0x072e
        L_0x0641:
            java.lang.Object r8 = r0.getObject(r15, r12)
            java.util.List r8 = (java.util.List) r8
            int r8 = com.google.android.gms.internal.ads.kq.n(r8)
            if (r8 <= 0) goto L_0x0901
            int r9 = com.google.android.gms.internal.ads.sp.G(r10)
            int r10 = com.google.android.gms.internal.ads.sp.I(r8)
            goto L_0x072e
        L_0x0657:
            java.lang.Object r8 = r0.getObject(r15, r12)
            java.util.List r8 = (java.util.List) r8
            int r8 = com.google.android.gms.internal.ads.kq.j(r8)
            if (r8 <= 0) goto L_0x0901
            int r9 = com.google.android.gms.internal.ads.sp.G(r10)
            int r10 = com.google.android.gms.internal.ads.sp.I(r8)
            goto L_0x072e
        L_0x066d:
            java.lang.Object r8 = r0.getObject(r15, r12)
            java.util.List r8 = (java.util.List) r8
            int r8 = com.google.android.gms.internal.ads.kq.l(r8)
            if (r8 <= 0) goto L_0x0901
            int r9 = com.google.android.gms.internal.ads.sp.G(r10)
            int r10 = com.google.android.gms.internal.ads.sp.I(r8)
            goto L_0x072e
        L_0x0683:
            java.lang.Object r8 = r0.getObject(r15, r12)
            java.util.List r8 = (java.util.List) r8
            java.lang.Class<?> r9 = com.google.android.gms.internal.ads.kq.f7265a
            int r8 = r8.size()
            if (r8 <= 0) goto L_0x0901
            int r9 = com.google.android.gms.internal.ads.sp.G(r10)
            int r10 = com.google.android.gms.internal.ads.sp.I(r8)
            goto L_0x072e
        L_0x069b:
            java.lang.Object r8 = r0.getObject(r15, r12)
            java.util.List r8 = (java.util.List) r8
            int r8 = com.google.android.gms.internal.ads.kq.n(r8)
            if (r8 <= 0) goto L_0x0901
            int r9 = com.google.android.gms.internal.ads.sp.G(r10)
            int r10 = com.google.android.gms.internal.ads.sp.I(r8)
            goto L_0x072e
        L_0x06b1:
            java.lang.Object r8 = r0.getObject(r15, r12)
            java.util.List r8 = (java.util.List) r8
            int r8 = com.google.android.gms.internal.ads.kq.o(r8)
            if (r8 <= 0) goto L_0x0901
            int r9 = com.google.android.gms.internal.ads.sp.G(r10)
            int r10 = com.google.android.gms.internal.ads.sp.I(r8)
            goto L_0x072e
        L_0x06c6:
            java.lang.Object r8 = r0.getObject(r15, r12)
            java.util.List r8 = (java.util.List) r8
            int r8 = com.google.android.gms.internal.ads.kq.k(r8)
            if (r8 <= 0) goto L_0x0901
            int r9 = com.google.android.gms.internal.ads.sp.G(r10)
            int r10 = com.google.android.gms.internal.ads.sp.I(r8)
            goto L_0x072e
        L_0x06db:
            java.lang.Object r8 = r0.getObject(r15, r12)
            java.util.List r8 = (java.util.List) r8
            int r8 = com.google.android.gms.internal.ads.kq.h(r8)
            if (r8 <= 0) goto L_0x0901
            int r9 = com.google.android.gms.internal.ads.sp.G(r10)
            int r10 = com.google.android.gms.internal.ads.sp.I(r8)
            goto L_0x072e
        L_0x06f0:
            java.lang.Object r8 = r0.getObject(r15, r12)
            java.util.List r8 = (java.util.List) r8
            int r8 = com.google.android.gms.internal.ads.kq.g(r8)
            if (r8 <= 0) goto L_0x0901
            int r9 = com.google.android.gms.internal.ads.sp.G(r10)
            int r10 = com.google.android.gms.internal.ads.sp.I(r8)
            goto L_0x072e
        L_0x0705:
            java.lang.Object r8 = r0.getObject(r15, r12)
            java.util.List r8 = (java.util.List) r8
            int r8 = com.google.android.gms.internal.ads.kq.n(r8)
            if (r8 <= 0) goto L_0x0901
            int r9 = com.google.android.gms.internal.ads.sp.G(r10)
            int r10 = com.google.android.gms.internal.ads.sp.I(r8)
            goto L_0x072e
        L_0x071a:
            java.lang.Object r8 = r0.getObject(r15, r12)
            java.util.List r8 = (java.util.List) r8
            int r8 = com.google.android.gms.internal.ads.kq.o(r8)
            if (r8 <= 0) goto L_0x0901
            int r9 = com.google.android.gms.internal.ads.sp.G(r10)
            int r10 = com.google.android.gms.internal.ads.sp.I(r8)
        L_0x072e:
            int r10 = r10 + r9
            int r10 = r10 + r8
            int r10 = r10 + r5
            r5 = r10
            goto L_0x0901
        L_0x0734:
            java.lang.Object r8 = r0.getObject(r15, r12)
            java.util.List r8 = (java.util.List) r8
            int r8 = com.google.android.gms.internal.ads.kq.N(r10, r8)
            goto L_0x0900
        L_0x0740:
            java.lang.Object r8 = r0.getObject(r15, r12)
            java.util.List r8 = (java.util.List) r8
            int r8 = com.google.android.gms.internal.ads.kq.R(r10, r8)
            goto L_0x0900
        L_0x074c:
            java.lang.Object r8 = r0.getObject(r15, r12)
            java.util.List r8 = (java.util.List) r8
            int r8 = com.google.android.gms.internal.ads.kq.T(r10, r8)
            goto L_0x0900
        L_0x0758:
            java.lang.Object r8 = r0.getObject(r15, r12)
            java.util.List r8 = (java.util.List) r8
            int r8 = com.google.android.gms.internal.ads.kq.S(r10, r8)
            goto L_0x0900
        L_0x0764:
            java.lang.Object r8 = r0.getObject(r15, r12)
            java.util.List r8 = (java.util.List) r8
            int r8 = com.google.android.gms.internal.ads.kq.O(r10, r8)
            goto L_0x0900
        L_0x0770:
            java.lang.Object r8 = r0.getObject(r15, r12)
            java.util.List r8 = (java.util.List) r8
            int r8 = com.google.android.gms.internal.ads.kq.Q(r10, r8)
            goto L_0x0900
        L_0x077c:
            java.lang.Object r8 = r0.getObject(r15, r12)
            java.util.List r8 = (java.util.List) r8
            int r8 = com.google.android.gms.internal.ads.kq.x(r10, r8)
            goto L_0x0900
        L_0x0788:
            java.lang.Object r8 = r0.getObject(r15, r12)
            java.util.List r8 = (java.util.List) r8
            com.google.android.gms.internal.ads.iq r9 = r14.K(r4)
            int r8 = com.google.android.gms.internal.ads.kq.v(r10, r8, r9)
            goto L_0x0900
        L_0x0798:
            java.lang.Object r8 = r0.getObject(r15, r12)
            java.util.List r8 = (java.util.List) r8
            int r8 = com.google.android.gms.internal.ads.kq.u(r10, r8)
            goto L_0x0900
        L_0x07a4:
            java.lang.Object r8 = r0.getObject(r15, r12)
            java.util.List r8 = (java.util.List) r8
            java.lang.Class<?> r9 = com.google.android.gms.internal.ads.kq.f7265a
            int r8 = r8.size()
            if (r8 != 0) goto L_0x07b5
            r8 = 0
            goto L_0x0900
        L_0x07b5:
            int r9 = com.google.android.gms.internal.ads.sp.M(r10)
            int r8 = r8 * r9
            goto L_0x0900
        L_0x07bd:
            java.lang.Object r8 = r0.getObject(r15, r12)
            java.util.List r8 = (java.util.List) r8
            int r8 = com.google.android.gms.internal.ads.kq.S(r10, r8)
            goto L_0x0900
        L_0x07c9:
            java.lang.Object r8 = r0.getObject(r15, r12)
            java.util.List r8 = (java.util.List) r8
            int r8 = com.google.android.gms.internal.ads.kq.T(r10, r8)
            goto L_0x0900
        L_0x07d5:
            java.lang.Object r8 = r0.getObject(r15, r12)
            java.util.List r8 = (java.util.List) r8
            int r8 = com.google.android.gms.internal.ads.kq.P(r10, r8)
            goto L_0x0900
        L_0x07e1:
            java.lang.Object r8 = r0.getObject(r15, r12)
            java.util.List r8 = (java.util.List) r8
            int r8 = com.google.android.gms.internal.ads.kq.M(r10, r8)
            goto L_0x0900
        L_0x07ed:
            java.lang.Object r8 = r0.getObject(r15, r12)
            java.util.List r8 = (java.util.List) r8
            int r8 = com.google.android.gms.internal.ads.kq.L(r10, r8)
            goto L_0x0900
        L_0x07f9:
            java.lang.Object r8 = r0.getObject(r15, r12)
            java.util.List r8 = (java.util.List) r8
            int r8 = com.google.android.gms.internal.ads.kq.S(r10, r8)
            goto L_0x0900
        L_0x0805:
            java.lang.Object r8 = r0.getObject(r15, r12)
            java.util.List r8 = (java.util.List) r8
            int r8 = com.google.android.gms.internal.ads.kq.T(r10, r8)
            goto L_0x0900
        L_0x0811:
            r8 = r7 & r9
            if (r8 == 0) goto L_0x0901
            java.lang.Object r8 = r0.getObject(r15, r12)
            com.google.android.gms.internal.ads.cq r8 = (com.google.android.gms.internal.ads.cq) r8
            com.google.android.gms.internal.ads.iq r9 = r14.K(r4)
            int r8 = com.google.android.gms.internal.ads.sp.w(r10, r8, r9)
            goto L_0x0900
        L_0x0825:
            r8 = r7 & r9
            if (r8 == 0) goto L_0x0901
            long r8 = r0.getLong(r15, r12)
            int r8 = com.google.android.gms.internal.ads.sp.U(r10, r8)
            goto L_0x0900
        L_0x0833:
            r8 = r7 & r9
            if (r8 == 0) goto L_0x0901
            int r8 = r0.getInt(r15, r12)
            int r8 = com.google.android.gms.internal.ads.sp.m(r10, r8)
            goto L_0x0900
        L_0x0841:
            r8 = r7 & r9
            if (r8 == 0) goto L_0x0901
            int r8 = com.google.android.gms.internal.ads.sp.W(r10)
            goto L_0x0900
        L_0x084b:
            r8 = r7 & r9
            if (r8 == 0) goto L_0x0901
            int r8 = com.google.android.gms.internal.ads.sp.p(r10)
            goto L_0x0900
        L_0x0855:
            r8 = r7 & r9
            if (r8 == 0) goto L_0x0901
            int r8 = r0.getInt(r15, r12)
            int r8 = com.google.android.gms.internal.ads.sp.q(r10, r8)
            goto L_0x0900
        L_0x0863:
            r8 = r7 & r9
            if (r8 == 0) goto L_0x0901
            int r8 = r0.getInt(r15, r12)
            int r8 = com.google.android.gms.internal.ads.sp.l(r10, r8)
            goto L_0x0900
        L_0x0871:
            r8 = r7 & r9
            if (r8 == 0) goto L_0x0901
            java.lang.Object r8 = r0.getObject(r15, r12)
            com.google.android.gms.internal.ads.mp r8 = (com.google.android.gms.internal.ads.mp) r8
            int r8 = com.google.android.gms.internal.ads.sp.v(r10, r8)
            goto L_0x0900
        L_0x0881:
            r8 = r7 & r9
            if (r8 == 0) goto L_0x0901
            java.lang.Object r8 = r0.getObject(r15, r12)
            com.google.android.gms.internal.ads.iq r9 = r14.K(r4)
            int r8 = com.google.android.gms.internal.ads.kq.t(r10, r8, r9)
            goto L_0x0900
        L_0x0893:
            r8 = r7 & r9
            if (r8 == 0) goto L_0x0901
            java.lang.Object r8 = r0.getObject(r15, r12)
            boolean r9 = r8 instanceof com.google.android.gms.internal.ads.mp
            if (r9 == 0) goto L_0x08a6
            com.google.android.gms.internal.ads.mp r8 = (com.google.android.gms.internal.ads.mp) r8
            int r8 = com.google.android.gms.internal.ads.sp.v(r10, r8)
            goto L_0x0900
        L_0x08a6:
            java.lang.String r8 = (java.lang.String) r8
            int r8 = com.google.android.gms.internal.ads.sp.Q(r10, r8)
            goto L_0x0900
        L_0x08ad:
            r8 = r7 & r9
            if (r8 == 0) goto L_0x0901
            int r8 = com.google.android.gms.internal.ads.sp.M(r10)
            goto L_0x0900
        L_0x08b6:
            r8 = r7 & r9
            if (r8 == 0) goto L_0x0901
            int r8 = com.google.android.gms.internal.ads.sp.n(r10)
            goto L_0x0900
        L_0x08bf:
            r8 = r7 & r9
            if (r8 == 0) goto L_0x0901
            int r8 = com.google.android.gms.internal.ads.sp.V(r10)
            goto L_0x0900
        L_0x08c8:
            r8 = r7 & r9
            if (r8 == 0) goto L_0x0901
            int r8 = r0.getInt(r15, r12)
            int r8 = com.google.android.gms.internal.ads.sp.k(r10, r8)
            goto L_0x0900
        L_0x08d5:
            r8 = r7 & r9
            if (r8 == 0) goto L_0x0901
            long r8 = r0.getLong(r15, r12)
            int r8 = com.google.android.gms.internal.ads.sp.T(r10, r8)
            goto L_0x0900
        L_0x08e2:
            r8 = r7 & r9
            if (r8 == 0) goto L_0x0901
            long r8 = r0.getLong(r15, r12)
            int r8 = com.google.android.gms.internal.ads.sp.S(r10, r8)
            goto L_0x0900
        L_0x08ef:
            r8 = r7 & r9
            if (r8 == 0) goto L_0x0901
            int r8 = com.google.android.gms.internal.ads.sp.r(r10)
            goto L_0x0900
        L_0x08f8:
            r8 = r7 & r9
            if (r8 == 0) goto L_0x0901
            int r8 = com.google.android.gms.internal.ads.sp.u(r10)
        L_0x0900:
            int r5 = r5 + r8
        L_0x0901:
            int r4 = r4 + 3
            goto L_0x048f
        L_0x0905:
            com.google.android.gms.internal.ads.lq<?, ?> r0 = r14.f6311n
            java.lang.Object r1 = r0.j(r15)
            int r0 = r0.i(r1)
            int r0 = r0 + r5
            boolean r1 = r14.f6303f
            if (r1 == 0) goto L_0x0962
            com.google.android.gms.internal.ads.vp<?> r1 = r14.f6312o
            com.google.android.gms.internal.ads.xp r15 = r1.g(r15)
            r1 = 0
        L_0x091b:
            e8.p90<T, java.lang.Object> r3 = r15.f8565a
            int r3 = r3.d()
            if (r2 >= r3) goto L_0x093b
            e8.p90<T, java.lang.Object> r3 = r15.f8565a
            java.util.Map$Entry r3 = r3.h(r2)
            java.lang.Object r4 = r3.getKey()
            e8.q70 r4 = (e8.q70) r4
            java.lang.Object r3 = r3.getValue()
            int r3 = com.google.android.gms.internal.ads.xp.i(r4, r3)
            int r1 = r1 + r3
            int r2 = r2 + 1
            goto L_0x091b
        L_0x093b:
            e8.p90<T, java.lang.Object> r15 = r15.f8565a
            java.lang.Iterable r15 = r15.e()
            java.util.Iterator r15 = r15.iterator()
        L_0x0945:
            boolean r2 = r15.hasNext()
            if (r2 == 0) goto L_0x0961
            java.lang.Object r2 = r15.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            e8.q70 r3 = (e8.q70) r3
            java.lang.Object r2 = r2.getValue()
            int r2 = com.google.android.gms.internal.ads.xp.i(r3, r2)
            int r1 = r1 + r2
            goto L_0x0945
        L_0x0961:
            int r0 = r0 + r1
        L_0x0962:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.eq.i(java.lang.Object):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006a, code lost:
        if (com.google.android.gms.internal.ads.kq.E(com.google.android.gms.internal.ads.oq.u(r10, r6), com.google.android.gms.internal.ads.oq.u(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007e, code lost:
        if (com.google.android.gms.internal.ads.oq.p(r10, r6) == com.google.android.gms.internal.ads.oq.p(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0090, code lost:
        if (com.google.android.gms.internal.ads.oq.n(r10, r6) == com.google.android.gms.internal.ads.oq.n(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a4, code lost:
        if (com.google.android.gms.internal.ads.oq.p(r10, r6) == com.google.android.gms.internal.ads.oq.p(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b6, code lost:
        if (com.google.android.gms.internal.ads.oq.n(r10, r6) == com.google.android.gms.internal.ads.oq.n(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c8, code lost:
        if (com.google.android.gms.internal.ads.oq.n(r10, r6) == com.google.android.gms.internal.ads.oq.n(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00da, code lost:
        if (com.google.android.gms.internal.ads.oq.n(r10, r6) == com.google.android.gms.internal.ads.oq.n(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f0, code lost:
        if (com.google.android.gms.internal.ads.kq.E(com.google.android.gms.internal.ads.oq.u(r10, r6), com.google.android.gms.internal.ads.oq.u(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0106, code lost:
        if (com.google.android.gms.internal.ads.kq.E(com.google.android.gms.internal.ads.oq.u(r10, r6), com.google.android.gms.internal.ads.oq.u(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x011c, code lost:
        if (com.google.android.gms.internal.ads.kq.E(com.google.android.gms.internal.ads.oq.u(r10, r6), com.google.android.gms.internal.ads.oq.u(r11, r6)) != false) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x012e, code lost:
        if (com.google.android.gms.internal.ads.oq.r(r10, r6) == com.google.android.gms.internal.ads.oq.r(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0140, code lost:
        if (com.google.android.gms.internal.ads.oq.n(r10, r6) == com.google.android.gms.internal.ads.oq.n(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0154, code lost:
        if (com.google.android.gms.internal.ads.oq.p(r10, r6) == com.google.android.gms.internal.ads.oq.p(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0165, code lost:
        if (com.google.android.gms.internal.ads.oq.n(r10, r6) == com.google.android.gms.internal.ads.oq.n(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0178, code lost:
        if (com.google.android.gms.internal.ads.oq.p(r10, r6) == com.google.android.gms.internal.ads.oq.p(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x018b, code lost:
        if (com.google.android.gms.internal.ads.oq.p(r10, r6) == com.google.android.gms.internal.ads.oq.p(r11, r6)) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01a4, code lost:
        if (java.lang.Float.floatToIntBits(com.google.android.gms.internal.ads.oq.s(r10, r6)) == java.lang.Float.floatToIntBits(com.google.android.gms.internal.ads.oq.s(r11, r6))) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01bf, code lost:
        if (java.lang.Double.doubleToLongBits(com.google.android.gms.internal.ads.oq.t(r10, r6)) == java.lang.Double.doubleToLongBits(com.google.android.gms.internal.ads.oq.t(r11, r6))) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01c1, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0038, code lost:
        if (com.google.android.gms.internal.ads.kq.E(com.google.android.gms.internal.ads.oq.u(r10, r6), com.google.android.gms.internal.ads.oq.u(r11, r6)) != false) goto L_0x01c2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean j(T r10, T r11) {
        /*
            r9 = this;
            int[] r0 = r9.f6298a
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            r3 = 1
            if (r2 >= r0) goto L_0x01c9
            int r4 = r9.N(r2)
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r4 & r5
            long r6 = (long) r6
            r8 = 267386880(0xff00000, float:2.3665827E-29)
            r4 = r4 & r8
            int r4 = r4 >>> 20
            switch(r4) {
                case 0: goto L_0x01a7;
                case 1: goto L_0x018e;
                case 2: goto L_0x017b;
                case 3: goto L_0x0168;
                case 4: goto L_0x0157;
                case 5: goto L_0x0144;
                case 6: goto L_0x0132;
                case 7: goto L_0x0120;
                case 8: goto L_0x010a;
                case 9: goto L_0x00f4;
                case 10: goto L_0x00de;
                case 11: goto L_0x00cc;
                case 12: goto L_0x00ba;
                case 13: goto L_0x00a8;
                case 14: goto L_0x0094;
                case 15: goto L_0x0082;
                case 16: goto L_0x006e;
                case 17: goto L_0x0058;
                case 18: goto L_0x004a;
                case 19: goto L_0x004a;
                case 20: goto L_0x004a;
                case 21: goto L_0x004a;
                case 22: goto L_0x004a;
                case 23: goto L_0x004a;
                case 24: goto L_0x004a;
                case 25: goto L_0x004a;
                case 26: goto L_0x004a;
                case 27: goto L_0x004a;
                case 28: goto L_0x004a;
                case 29: goto L_0x004a;
                case 30: goto L_0x004a;
                case 31: goto L_0x004a;
                case 32: goto L_0x004a;
                case 33: goto L_0x004a;
                case 34: goto L_0x004a;
                case 35: goto L_0x004a;
                case 36: goto L_0x004a;
                case 37: goto L_0x004a;
                case 38: goto L_0x004a;
                case 39: goto L_0x004a;
                case 40: goto L_0x004a;
                case 41: goto L_0x004a;
                case 42: goto L_0x004a;
                case 43: goto L_0x004a;
                case 44: goto L_0x004a;
                case 45: goto L_0x004a;
                case 46: goto L_0x004a;
                case 47: goto L_0x004a;
                case 48: goto L_0x004a;
                case 49: goto L_0x004a;
                case 50: goto L_0x003c;
                case 51: goto L_0x001c;
                case 52: goto L_0x001c;
                case 53: goto L_0x001c;
                case 54: goto L_0x001c;
                case 55: goto L_0x001c;
                case 56: goto L_0x001c;
                case 57: goto L_0x001c;
                case 58: goto L_0x001c;
                case 59: goto L_0x001c;
                case 60: goto L_0x001c;
                case 61: goto L_0x001c;
                case 62: goto L_0x001c;
                case 63: goto L_0x001c;
                case 64: goto L_0x001c;
                case 65: goto L_0x001c;
                case 66: goto L_0x001c;
                case 67: goto L_0x001c;
                case 68: goto L_0x001c;
                default: goto L_0x001a;
            }
        L_0x001a:
            goto L_0x01c2
        L_0x001c:
            int r4 = r9.O(r2)
            r4 = r4 & r5
            long r4 = (long) r4
            int r8 = com.google.android.gms.internal.ads.oq.n(r10, r4)
            int r4 = com.google.android.gms.internal.ads.oq.n(r11, r4)
            if (r8 != r4) goto L_0x01c1
            java.lang.Object r4 = com.google.android.gms.internal.ads.oq.u(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.ads.oq.u(r11, r6)
            boolean r4 = com.google.android.gms.internal.ads.kq.E(r4, r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x003c:
            java.lang.Object r3 = com.google.android.gms.internal.ads.oq.u(r10, r6)
            java.lang.Object r4 = com.google.android.gms.internal.ads.oq.u(r11, r6)
            boolean r3 = com.google.android.gms.internal.ads.kq.E(r3, r4)
            goto L_0x01c2
        L_0x004a:
            java.lang.Object r3 = com.google.android.gms.internal.ads.oq.u(r10, r6)
            java.lang.Object r4 = com.google.android.gms.internal.ads.oq.u(r11, r6)
            boolean r3 = com.google.android.gms.internal.ads.kq.E(r3, r4)
            goto L_0x01c2
        L_0x0058:
            boolean r4 = r9.D(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            java.lang.Object r4 = com.google.android.gms.internal.ads.oq.u(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.ads.oq.u(r11, r6)
            boolean r4 = com.google.android.gms.internal.ads.kq.E(r4, r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x006e:
            boolean r4 = r9.D(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = com.google.android.gms.internal.ads.oq.p(r10, r6)
            long r6 = com.google.android.gms.internal.ads.oq.p(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x0082:
            boolean r4 = r9.D(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.ads.oq.n(r10, r6)
            int r5 = com.google.android.gms.internal.ads.oq.n(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x0094:
            boolean r4 = r9.D(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = com.google.android.gms.internal.ads.oq.p(r10, r6)
            long r6 = com.google.android.gms.internal.ads.oq.p(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x00a8:
            boolean r4 = r9.D(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.ads.oq.n(r10, r6)
            int r5 = com.google.android.gms.internal.ads.oq.n(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x00ba:
            boolean r4 = r9.D(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.ads.oq.n(r10, r6)
            int r5 = com.google.android.gms.internal.ads.oq.n(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x00cc:
            boolean r4 = r9.D(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.ads.oq.n(r10, r6)
            int r5 = com.google.android.gms.internal.ads.oq.n(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x00de:
            boolean r4 = r9.D(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            java.lang.Object r4 = com.google.android.gms.internal.ads.oq.u(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.ads.oq.u(r11, r6)
            boolean r4 = com.google.android.gms.internal.ads.kq.E(r4, r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x00f4:
            boolean r4 = r9.D(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            java.lang.Object r4 = com.google.android.gms.internal.ads.oq.u(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.ads.oq.u(r11, r6)
            boolean r4 = com.google.android.gms.internal.ads.kq.E(r4, r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x010a:
            boolean r4 = r9.D(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            java.lang.Object r4 = com.google.android.gms.internal.ads.oq.u(r10, r6)
            java.lang.Object r5 = com.google.android.gms.internal.ads.oq.u(r11, r6)
            boolean r4 = com.google.android.gms.internal.ads.kq.E(r4, r5)
            if (r4 != 0) goto L_0x01c2
            goto L_0x01c1
        L_0x0120:
            boolean r4 = r9.D(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            boolean r4 = com.google.android.gms.internal.ads.oq.r(r10, r6)
            boolean r5 = com.google.android.gms.internal.ads.oq.r(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x0132:
            boolean r4 = r9.D(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.ads.oq.n(r10, r6)
            int r5 = com.google.android.gms.internal.ads.oq.n(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x0144:
            boolean r4 = r9.D(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = com.google.android.gms.internal.ads.oq.p(r10, r6)
            long r6 = com.google.android.gms.internal.ads.oq.p(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x0157:
            boolean r4 = r9.D(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            int r4 = com.google.android.gms.internal.ads.oq.n(r10, r6)
            int r5 = com.google.android.gms.internal.ads.oq.n(r11, r6)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x0168:
            boolean r4 = r9.D(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = com.google.android.gms.internal.ads.oq.p(r10, r6)
            long r6 = com.google.android.gms.internal.ads.oq.p(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x017b:
            boolean r4 = r9.D(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            long r4 = com.google.android.gms.internal.ads.oq.p(r10, r6)
            long r6 = com.google.android.gms.internal.ads.oq.p(r11, r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
            goto L_0x01c1
        L_0x018e:
            boolean r4 = r9.D(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            float r4 = com.google.android.gms.internal.ads.oq.s(r10, r6)
            int r4 = java.lang.Float.floatToIntBits(r4)
            float r5 = com.google.android.gms.internal.ads.oq.s(r11, r6)
            int r5 = java.lang.Float.floatToIntBits(r5)
            if (r4 == r5) goto L_0x01c2
            goto L_0x01c1
        L_0x01a7:
            boolean r4 = r9.D(r10, r11, r2)
            if (r4 == 0) goto L_0x01c1
            double r4 = com.google.android.gms.internal.ads.oq.t(r10, r6)
            long r4 = java.lang.Double.doubleToLongBits(r4)
            double r6 = com.google.android.gms.internal.ads.oq.t(r11, r6)
            long r6 = java.lang.Double.doubleToLongBits(r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01c2
        L_0x01c1:
            r3 = 0
        L_0x01c2:
            if (r3 != 0) goto L_0x01c5
            return r1
        L_0x01c5:
            int r2 = r2 + 3
            goto L_0x0005
        L_0x01c9:
            com.google.android.gms.internal.ads.lq<?, ?> r0 = r9.f6311n
            java.lang.Object r0 = r0.j(r10)
            com.google.android.gms.internal.ads.lq<?, ?> r2 = r9.f6311n
            java.lang.Object r2 = r2.j(r11)
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x01dc
            return r1
        L_0x01dc:
            boolean r0 = r9.f6303f
            if (r0 == 0) goto L_0x01f1
            com.google.android.gms.internal.ads.vp<?> r0 = r9.f6312o
            com.google.android.gms.internal.ads.xp r10 = r0.g(r10)
            com.google.android.gms.internal.ads.vp<?> r0 = r9.f6312o
            com.google.android.gms.internal.ads.xp r11 = r0.g(r11)
            boolean r10 = r10.equals(r11)
            return r10
        L_0x01f1:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.eq.j(java.lang.Object, java.lang.Object):boolean");
    }

    public final T k() {
        return this.f6309l.a(this.f6302e);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01c3, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0227, code lost:
        r2 = r3 + r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0229, code lost:
        r1 = r1 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int l(T r9) {
        /*
            r8 = this;
            int[] r0 = r8.f6298a
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            if (r1 >= r0) goto L_0x022d
            int r3 = r8.N(r1)
            int[] r4 = r8.f6298a
            r4 = r4[r1]
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r3
            long r5 = (long) r5
            r7 = 267386880(0xff00000, float:2.3665827E-29)
            r3 = r3 & r7
            int r3 = r3 >>> 20
            r7 = 37
            switch(r3) {
                case 0: goto L_0x0219;
                case 1: goto L_0x020e;
                case 2: goto L_0x0203;
                case 3: goto L_0x01f8;
                case 4: goto L_0x01f1;
                case 5: goto L_0x01e6;
                case 6: goto L_0x01df;
                case 7: goto L_0x01d4;
                case 8: goto L_0x01c7;
                case 9: goto L_0x01b9;
                case 10: goto L_0x01ad;
                case 11: goto L_0x01a5;
                case 12: goto L_0x019d;
                case 13: goto L_0x0195;
                case 14: goto L_0x0189;
                case 15: goto L_0x0181;
                case 16: goto L_0x0175;
                case 17: goto L_0x016a;
                case 18: goto L_0x015e;
                case 19: goto L_0x015e;
                case 20: goto L_0x015e;
                case 21: goto L_0x015e;
                case 22: goto L_0x015e;
                case 23: goto L_0x015e;
                case 24: goto L_0x015e;
                case 25: goto L_0x015e;
                case 26: goto L_0x015e;
                case 27: goto L_0x015e;
                case 28: goto L_0x015e;
                case 29: goto L_0x015e;
                case 30: goto L_0x015e;
                case 31: goto L_0x015e;
                case 32: goto L_0x015e;
                case 33: goto L_0x015e;
                case 34: goto L_0x015e;
                case 35: goto L_0x015e;
                case 36: goto L_0x015e;
                case 37: goto L_0x015e;
                case 38: goto L_0x015e;
                case 39: goto L_0x015e;
                case 40: goto L_0x015e;
                case 41: goto L_0x015e;
                case 42: goto L_0x015e;
                case 43: goto L_0x015e;
                case 44: goto L_0x015e;
                case 45: goto L_0x015e;
                case 46: goto L_0x015e;
                case 47: goto L_0x015e;
                case 48: goto L_0x015e;
                case 49: goto L_0x015e;
                case 50: goto L_0x0152;
                case 51: goto L_0x013c;
                case 52: goto L_0x012a;
                case 53: goto L_0x0118;
                case 54: goto L_0x0106;
                case 55: goto L_0x00f8;
                case 56: goto L_0x00e6;
                case 57: goto L_0x00d8;
                case 58: goto L_0x00c6;
                case 59: goto L_0x00b2;
                case 60: goto L_0x00a0;
                case 61: goto L_0x008e;
                case 62: goto L_0x0080;
                case 63: goto L_0x0072;
                case 64: goto L_0x0064;
                case 65: goto L_0x0052;
                case 66: goto L_0x0044;
                case 67: goto L_0x0032;
                case 68: goto L_0x0020;
                default: goto L_0x001e;
            }
        L_0x001e:
            goto L_0x0229
        L_0x0020:
            boolean r3 = r8.w(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            java.lang.Object r3 = com.google.android.gms.internal.ads.oq.u(r9, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x0032:
            boolean r3 = r8.w(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            long r3 = Q(r9, r5)
            int r3 = e8.v70.c(r3)
            goto L_0x0227
        L_0x0044:
            boolean r3 = r8.w(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            int r3 = J(r9, r5)
            goto L_0x0227
        L_0x0052:
            boolean r3 = r8.w(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            long r3 = Q(r9, r5)
            int r3 = e8.v70.c(r3)
            goto L_0x0227
        L_0x0064:
            boolean r3 = r8.w(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            int r3 = J(r9, r5)
            goto L_0x0227
        L_0x0072:
            boolean r3 = r8.w(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            int r3 = J(r9, r5)
            goto L_0x0227
        L_0x0080:
            boolean r3 = r8.w(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            int r3 = J(r9, r5)
            goto L_0x0227
        L_0x008e:
            boolean r3 = r8.w(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.ads.oq.u(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x00a0:
            boolean r3 = r8.w(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            java.lang.Object r3 = com.google.android.gms.internal.ads.oq.u(r9, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x00b2:
            boolean r3 = r8.w(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.ads.oq.u(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x00c6:
            boolean r3 = r8.w(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            boolean r3 = R(r9, r5)
            int r3 = e8.v70.a(r3)
            goto L_0x0227
        L_0x00d8:
            boolean r3 = r8.w(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            int r3 = J(r9, r5)
            goto L_0x0227
        L_0x00e6:
            boolean r3 = r8.w(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            long r3 = Q(r9, r5)
            int r3 = e8.v70.c(r3)
            goto L_0x0227
        L_0x00f8:
            boolean r3 = r8.w(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            int r3 = J(r9, r5)
            goto L_0x0227
        L_0x0106:
            boolean r3 = r8.w(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            long r3 = Q(r9, r5)
            int r3 = e8.v70.c(r3)
            goto L_0x0227
        L_0x0118:
            boolean r3 = r8.w(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            long r3 = Q(r9, r5)
            int r3 = e8.v70.c(r3)
            goto L_0x0227
        L_0x012a:
            boolean r3 = r8.w(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            float r3 = I(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0227
        L_0x013c:
            boolean r3 = r8.w(r9, r4, r1)
            if (r3 == 0) goto L_0x0229
            int r2 = r2 * 53
            double r3 = G(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = e8.v70.c(r3)
            goto L_0x0227
        L_0x0152:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.ads.oq.u(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x015e:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.ads.oq.u(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x016a:
            java.lang.Object r3 = com.google.android.gms.internal.ads.oq.u(r9, r5)
            if (r3 == 0) goto L_0x01c3
            int r7 = r3.hashCode()
            goto L_0x01c3
        L_0x0175:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.ads.oq.p(r9, r5)
            int r3 = e8.v70.c(r3)
            goto L_0x0227
        L_0x0181:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.ads.oq.n(r9, r5)
            goto L_0x0227
        L_0x0189:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.ads.oq.p(r9, r5)
            int r3 = e8.v70.c(r3)
            goto L_0x0227
        L_0x0195:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.ads.oq.n(r9, r5)
            goto L_0x0227
        L_0x019d:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.ads.oq.n(r9, r5)
            goto L_0x0227
        L_0x01a5:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.ads.oq.n(r9, r5)
            goto L_0x0227
        L_0x01ad:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.ads.oq.u(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x01b9:
            java.lang.Object r3 = com.google.android.gms.internal.ads.oq.u(r9, r5)
            if (r3 == 0) goto L_0x01c3
            int r7 = r3.hashCode()
        L_0x01c3:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x0229
        L_0x01c7:
            int r2 = r2 * 53
            java.lang.Object r3 = com.google.android.gms.internal.ads.oq.u(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0227
        L_0x01d4:
            int r2 = r2 * 53
            boolean r3 = com.google.android.gms.internal.ads.oq.r(r9, r5)
            int r3 = e8.v70.a(r3)
            goto L_0x0227
        L_0x01df:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.ads.oq.n(r9, r5)
            goto L_0x0227
        L_0x01e6:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.ads.oq.p(r9, r5)
            int r3 = e8.v70.c(r3)
            goto L_0x0227
        L_0x01f1:
            int r2 = r2 * 53
            int r3 = com.google.android.gms.internal.ads.oq.n(r9, r5)
            goto L_0x0227
        L_0x01f8:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.ads.oq.p(r9, r5)
            int r3 = e8.v70.c(r3)
            goto L_0x0227
        L_0x0203:
            int r2 = r2 * 53
            long r3 = com.google.android.gms.internal.ads.oq.p(r9, r5)
            int r3 = e8.v70.c(r3)
            goto L_0x0227
        L_0x020e:
            int r2 = r2 * 53
            float r3 = com.google.android.gms.internal.ads.oq.s(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0227
        L_0x0219:
            int r2 = r2 * 53
            double r3 = com.google.android.gms.internal.ads.oq.t(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = e8.v70.c(r3)
        L_0x0227:
            int r3 = r3 + r2
            r2 = r3
        L_0x0229:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x022d:
            int r2 = r2 * 53
            com.google.android.gms.internal.ads.lq<?, ?> r0 = r8.f6311n
            java.lang.Object r0 = r0.j(r9)
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            boolean r1 = r8.f6303f
            if (r1 == 0) goto L_0x024b
            int r0 = r0 * 53
            com.google.android.gms.internal.ads.vp<?> r1 = r8.f6312o
            com.google.android.gms.internal.ads.xp r9 = r1.g(r9)
            int r9 = r9.hashCode()
            int r0 = r0 + r9
        L_0x024b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.eq.l(java.lang.Object):int");
    }

    public final <K, V> int m(T t10, byte[] bArr, int i10, int i11, int i12, long j10, ft ftVar) throws IOException {
        Unsafe unsafe = f6297r;
        Object obj = this.f6299b[(i12 / 3) << 1];
        Object object = unsafe.getObject(t10, j10);
        if (this.f6313p.d(object)) {
            Object g10 = this.f6313p.g(obj);
            this.f6313p.h(g10, object);
            unsafe.putObject(t10, j10, g10);
            object = g10;
        }
        this.f6313p.b(obj);
        this.f6313p.f(object);
        int h10 = lp.h(bArr, i10, ftVar);
        int i13 = ftVar.f14681d;
        if (i13 < 0 || i13 > i11 - h10) {
            throw f80.a();
        }
        throw null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v33, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v34, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v35, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v36, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v37, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v38, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v39, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v40, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v42, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v43, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v61, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v34, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v44, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v45, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v77, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x031d, code lost:
        r6 = r37;
        r2 = r5;
        r30 = r11;
        r9 = r12;
        r22 = r15;
        r7 = r17;
        r28 = r20;
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a2, code lost:
        r7 = r38;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x01a9, code lost:
        r13 = r36;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x01ad, code lost:
        r13 = r36;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0253, code lost:
        r1 = r8 | r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0255, code lost:
        r8 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0256, code lost:
        r5 = r9;
        r30 = r11;
        r9 = r12;
        r22 = r15;
        r10 = r20;
        r11 = r32;
        r12 = r7;
        r7 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x028c, code lost:
        r5 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x02ce, code lost:
        r8 = r8 | r23;
        r0 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0319, code lost:
        r1 = r8 | r23;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r0v5, types: [int, byte] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0455  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x0495  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int n(T r33, byte[] r34, int r35, int r36, int r37, e8.ft r38) throws java.io.IOException {
        /*
            r32 = this;
            r15 = r32
            r14 = r34
            r12 = r36
            r13 = r38
            sun.misc.Unsafe r11 = f6297r
            r16 = 0
            r6 = r33
            r0 = r35
            r1 = r37
            r5 = r15
            r2 = -1
            r3 = 0
            r4 = 0
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r8 = 0
        L_0x001a:
            if (r0 >= r12) goto L_0x04d6
            int r4 = r0 + 1
            byte r0 = r14[r0]
            if (r0 >= 0) goto L_0x002d
            int r0 = com.google.android.gms.internal.ads.lp.d(r0, r14, r4, r13)
            int r4 = r13.f14681d
            r31 = r4
            r4 = r0
            r0 = r31
        L_0x002d:
            int r9 = r0 >>> 3
            r10 = r0 & 7
            r19 = r0
            r0 = 3
            if (r9 <= r2) goto L_0x0047
            int r3 = r3 / r0
            int r2 = r5.f6300c
            if (r9 < r2) goto L_0x0044
            int r2 = r5.f6301d
            if (r9 > r2) goto L_0x0044
            int r2 = r5.y(r9, r3)
            goto L_0x004b
        L_0x0044:
            r2 = -1
            r3 = -1
            goto L_0x004d
        L_0x0047:
            int r2 = r5.P(r9)
        L_0x004b:
            r3 = r2
            r2 = -1
        L_0x004d:
            if (r3 != r2) goto L_0x005e
            r6 = r1
            r2 = r4
            r28 = r9
            r30 = r11
            r9 = r19
            r15 = 0
            r18 = -1
            r22 = 0
            goto L_0x0440
        L_0x005e:
            int[] r1 = r5.f6298a
            int r18 = r3 + 1
            r0 = r1[r18]
            r18 = 267386880(0xff00000, float:2.3665827E-29)
            r18 = r0 & r18
            int r15 = r18 >>> 20
            r17 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r0 & r17
            long r12 = (long) r2
            r2 = 17
            r21 = r12
            if (r15 > r2) goto L_0x032e
            int r2 = r3 + 2
            r1 = r1[r2]
            int r2 = r1 >>> 20
            r13 = 1
            int r23 = r13 << r2
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r2
            if (r1 == r7) goto L_0x0091
            if (r7 == r2) goto L_0x008b
            long r12 = (long) r7
            r11.putInt(r6, r12, r8)
        L_0x008b:
            long r7 = (long) r1
            int r8 = r11.getInt(r6, r7)
            r7 = r1
        L_0x0091:
            r1 = 5
            switch(r15) {
                case 0: goto L_0x02f7;
                case 1: goto L_0x02d3;
                case 2: goto L_0x02ae;
                case 3: goto L_0x02ae;
                case 4: goto L_0x028f;
                case 5: goto L_0x0267;
                case 6: goto L_0x0237;
                case 7: goto L_0x020f;
                case 8: goto L_0x01e7;
                case 9: goto L_0x01b1;
                case 10: goto L_0x018e;
                case 11: goto L_0x028f;
                case 12: goto L_0x0156;
                case 13: goto L_0x0237;
                case 14: goto L_0x0267;
                case 15: goto L_0x0135;
                case 16: goto L_0x0100;
                case 17: goto L_0x00a6;
                default: goto L_0x0095;
            }
        L_0x0095:
            r13 = r36
            r15 = r3
            r5 = r4
            r17 = r7
            r20 = r9
            r12 = r19
            r18 = 1048575(0xfffff, float:1.469367E-39)
        L_0x00a2:
            r7 = r38
            goto L_0x031d
        L_0x00a6:
            r12 = 3
            if (r10 != r12) goto L_0x00f1
            int r0 = r9 << 3
            r10 = r0 | 4
            com.google.android.gms.internal.ads.iq r0 = r5.K(r3)
            r12 = r19
            r1 = r34
            r13 = -1
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r4
            r15 = r3
            r3 = r36
            r4 = r10
            r10 = r5
            r5 = r38
            int r0 = com.google.android.gms.internal.ads.lp.f(r0, r1, r2, r3, r4, r5)
            r1 = r8 & r23
            if (r1 != 0) goto L_0x00d3
            r5 = r38
            r2 = r21
            java.lang.Object r1 = r5.f14679b
            r11.putObject(r6, r2, r1)
            goto L_0x00e4
        L_0x00d3:
            r5 = r38
            r2 = r21
            java.lang.Object r1 = r11.getObject(r6, r2)
            java.lang.Object r4 = r5.f14679b
            java.lang.Object r1 = e8.v70.b(r1, r4)
            r11.putObject(r6, r2, r1)
        L_0x00e4:
            r8 = r8 | r23
            r1 = r37
            r13 = r5
            r2 = r9
            r5 = r10
            r4 = r12
            r3 = r15
            r15 = r32
            goto L_0x04b6
        L_0x00f1:
            r15 = r3
            r12 = r19
            r13 = -1
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r13 = r36
            r5 = r4
            r17 = r7
            r20 = r9
            goto L_0x00a2
        L_0x0100:
            r15 = r3
            r1 = r5
            r12 = r19
            r2 = r21
            r13 = -1
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r38
            if (r10 != 0) goto L_0x012c
            int r10 = com.google.android.gms.internal.ads.lp.j(r14, r4, r5)
            long r13 = r5.f14678a
            long r13 = com.google.android.gms.internal.ads.op.v(r13)
            r0 = r11
            r4 = r1
            r1 = r33
            r17 = r7
            r20 = r9
            r9 = r4
            r7 = r5
            r4 = r13
            r0.putLong(r1, r2, r4)
            r14 = r34
            r13 = r36
            goto L_0x02ce
        L_0x012c:
            r17 = r7
            r20 = r9
            r7 = r5
            r14 = r34
            goto L_0x01ad
        L_0x0135:
            r15 = r3
            r17 = r7
            r20 = r9
            r12 = r19
            r2 = r21
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r38
            r9 = r5
            r14 = r34
            if (r10 != 0) goto L_0x01ad
            int r0 = com.google.android.gms.internal.ads.lp.h(r14, r4, r7)
            int r1 = r7.f14681d
            int r1 = com.google.android.gms.internal.ads.op.A(r1)
            r11.putInt(r6, r2, r1)
            goto L_0x01a9
        L_0x0156:
            r15 = r3
            r17 = r7
            r20 = r9
            r12 = r19
            r2 = r21
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r38
            r9 = r5
            if (r10 != 0) goto L_0x01ad
            int r0 = com.google.android.gms.internal.ads.lp.h(r14, r4, r7)
            int r1 = r7.f14681d
            e8.z70 r4 = r9.M(r15)
            if (r4 == 0) goto L_0x018a
            boolean r4 = r4.a(r1)
            if (r4 == 0) goto L_0x017a
            goto L_0x018a
        L_0x017a:
            com.google.android.gms.internal.ads.nq r2 = z(r33)
            long r3 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r2.e(r12, r1)
            r13 = r36
            goto L_0x0256
        L_0x018a:
            r11.putInt(r6, r2, r1)
            goto L_0x01a9
        L_0x018e:
            r15 = r3
            r17 = r7
            r20 = r9
            r12 = r19
            r2 = r21
            r0 = 2
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r38
            r9 = r5
            if (r10 != r0) goto L_0x01ad
            int r0 = com.google.android.gms.internal.ads.lp.m(r14, r4, r7)
            java.lang.Object r1 = r7.f14679b
            r11.putObject(r6, r2, r1)
        L_0x01a9:
            r13 = r36
            goto L_0x0319
        L_0x01ad:
            r13 = r36
            goto L_0x028c
        L_0x01b1:
            r15 = r3
            r17 = r7
            r20 = r9
            r12 = r19
            r2 = r21
            r0 = 2
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r38
            r9 = r5
            if (r10 != r0) goto L_0x01ad
            com.google.android.gms.internal.ads.iq r0 = r9.K(r15)
            r13 = r36
            int r0 = com.google.android.gms.internal.ads.lp.g(r0, r14, r4, r13, r7)
            r1 = r8 & r23
            if (r1 != 0) goto L_0x01d8
            java.lang.Object r1 = r7.f14679b
            r11.putObject(r6, r2, r1)
            goto L_0x0253
        L_0x01d8:
            java.lang.Object r1 = r11.getObject(r6, r2)
            java.lang.Object r4 = r7.f14679b
            java.lang.Object r1 = e8.v70.b(r1, r4)
            r11.putObject(r6, r2, r1)
            goto L_0x0253
        L_0x01e7:
            r13 = r36
            r15 = r3
            r17 = r7
            r20 = r9
            r12 = r19
            r2 = r21
            r1 = 2
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r38
            r9 = r5
            if (r10 != r1) goto L_0x028c
            r1 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r1
            if (r0 != 0) goto L_0x0205
            int r0 = com.google.android.gms.internal.ads.lp.k(r14, r4, r7)
            goto L_0x0209
        L_0x0205:
            int r0 = com.google.android.gms.internal.ads.lp.l(r14, r4, r7)
        L_0x0209:
            java.lang.Object r1 = r7.f14679b
            r11.putObject(r6, r2, r1)
            goto L_0x0253
        L_0x020f:
            r13 = r36
            r15 = r3
            r17 = r7
            r20 = r9
            r12 = r19
            r2 = r21
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r38
            r9 = r5
            if (r10 != 0) goto L_0x028c
            int r0 = com.google.android.gms.internal.ads.lp.j(r14, r4, r7)
            long r4 = r7.f14678a
            r21 = 0
            int r1 = (r4 > r21 ? 1 : (r4 == r21 ? 0 : -1))
            if (r1 == 0) goto L_0x0230
            r1 = 1
            goto L_0x0231
        L_0x0230:
            r1 = 0
        L_0x0231:
            com.google.android.gms.internal.ads.oq$d r4 = com.google.android.gms.internal.ads.oq.f7704d
            r4.d(r6, r2, r1)
            goto L_0x0253
        L_0x0237:
            r13 = r36
            r15 = r3
            r17 = r7
            r20 = r9
            r12 = r19
            r2 = r21
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r38
            r9 = r5
            if (r10 != r1) goto L_0x028c
            int r0 = com.google.android.gms.internal.ads.lp.n(r14, r4)
            r11.putInt(r6, r2, r0)
            int r0 = r4 + 4
        L_0x0253:
            r1 = r8 | r23
        L_0x0255:
            r8 = r1
        L_0x0256:
            r5 = r9
            r30 = r11
            r9 = r12
            r22 = r15
            r10 = r20
            r18 = -1
            r11 = r32
            r12 = r7
            r7 = r17
            goto L_0x04c9
        L_0x0267:
            r13 = r36
            r15 = r3
            r17 = r7
            r20 = r9
            r12 = r19
            r2 = r21
            r0 = 1
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r38
            r9 = r5
            if (r10 != r0) goto L_0x028c
            long r21 = com.google.android.gms.internal.ads.lp.o(r14, r4)
            r0 = r11
            r1 = r33
            r10 = r4
            r4 = r21
            r0.putLong(r1, r2, r4)
            int r0 = r10 + 8
            goto L_0x0319
        L_0x028c:
            r5 = r4
            goto L_0x031d
        L_0x028f:
            r13 = r36
            r15 = r3
            r17 = r7
            r20 = r9
            r12 = r19
            r2 = r21
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r38
            r9 = r5
            r5 = r4
            if (r10 != 0) goto L_0x031d
            int r0 = com.google.android.gms.internal.ads.lp.h(r14, r5, r7)
            int r1 = r7.f14681d
            r11.putInt(r6, r2, r1)
            goto L_0x0319
        L_0x02ae:
            r13 = r36
            r15 = r3
            r17 = r7
            r20 = r9
            r12 = r19
            r2 = r21
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r38
            r9 = r5
            r5 = r4
            if (r10 != 0) goto L_0x031d
            int r10 = com.google.android.gms.internal.ads.lp.j(r14, r5, r7)
            long r4 = r7.f14678a
            r0 = r11
            r1 = r33
            r0.putLong(r1, r2, r4)
        L_0x02ce:
            r0 = r8 | r23
            r8 = r0
            r0 = r10
            goto L_0x0256
        L_0x02d3:
            r13 = r36
            r15 = r3
            r17 = r7
            r20 = r9
            r12 = r19
            r2 = r21
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r38
            r9 = r5
            r5 = r4
            if (r10 != r1) goto L_0x031d
            int r0 = com.google.android.gms.internal.ads.lp.n(r14, r5)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            com.google.android.gms.internal.ads.oq$d r1 = com.google.android.gms.internal.ads.oq.f7704d
            r1.b(r6, r2, r0)
            int r0 = r5 + 4
            goto L_0x0319
        L_0x02f7:
            r13 = r36
            r15 = r3
            r17 = r7
            r20 = r9
            r12 = r19
            r2 = r21
            r0 = 1
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r38
            r9 = r5
            r5 = r4
            if (r10 != r0) goto L_0x031d
            long r0 = com.google.android.gms.internal.ads.lp.o(r14, r5)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            com.google.android.gms.internal.ads.oq.c(r6, r2, r0)
            int r0 = r5 + 8
        L_0x0319:
            r1 = r8 | r23
            goto L_0x0255
        L_0x031d:
            r6 = r37
            r2 = r5
            r30 = r11
            r9 = r12
            r22 = r15
            r7 = r17
            r28 = r20
            r15 = 0
            r18 = -1
            goto L_0x0440
        L_0x032e:
            r13 = r36
            r20 = r9
            r12 = r19
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r9 = r5
            r5 = r4
            r4 = r3
            r2 = r21
            r21 = r7
            r7 = r38
            r1 = 27
            if (r15 != r1) goto L_0x039a
            r1 = 2
            if (r10 != r1) goto L_0x038b
            java.lang.Object r0 = r11.getObject(r6, r2)
            e8.c80 r0 = (e8.c80) r0
            boolean r1 = r0.k()
            if (r1 != 0) goto L_0x0365
            int r1 = r0.size()
            if (r1 != 0) goto L_0x035c
            r1 = 10
            goto L_0x035e
        L_0x035c:
            int r1 = r1 << 1
        L_0x035e:
            e8.c80 r0 = r0.r(r1)
            r11.putObject(r6, r2, r0)
        L_0x0365:
            r10 = r0
            com.google.android.gms.internal.ads.iq r0 = r9.K(r4)
            r1 = r12
            r2 = r34
            r3 = r5
            r22 = r4
            r4 = r36
            r5 = r10
            r10 = r6
            r6 = r38
            int r0 = com.google.android.gms.internal.ads.lp.e(r0, r1, r2, r3, r4, r5, r6)
            r15 = r32
            r1 = r37
            r5 = r9
            r6 = r10
            r4 = r12
            r12 = r13
            r2 = r20
            r3 = r22
            r13 = r7
            r7 = r21
            goto L_0x001a
        L_0x038b:
            r22 = r4
            r14 = r5
            r27 = r8
            r30 = r11
            r19 = r12
            r28 = r20
            r18 = -1
            goto L_0x0401
        L_0x039a:
            r22 = r4
            r1 = 49
            if (r15 > r1) goto L_0x03ed
            long r0 = (long) r0
            r23 = r0
            r0 = r32
            r1 = r33
            r25 = r2
            r2 = r34
            r3 = r5
            r4 = r36
            r9 = r5
            r5 = r12
            r6 = r20
            r7 = r10
            r27 = r8
            r8 = r22
            r29 = r9
            r28 = r20
            r18 = -1
            r9 = r23
            r30 = r11
            r11 = r15
            r19 = r12
            r15 = r13
            r12 = r25
            r14 = r38
            int r0 = r0.b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            r14 = r29
            if (r0 != r14) goto L_0x03d3
            r4 = r0
            goto L_0x0402
        L_0x03d3:
            r5 = r32
            r6 = r33
            r14 = r34
            r1 = r37
            r13 = r38
            r12 = r15
            r4 = r19
            r7 = r21
            r3 = r22
            r8 = r27
            r2 = r28
            r11 = r30
            r15 = r5
            goto L_0x001a
        L_0x03ed:
            r25 = r2
            r14 = r5
            r27 = r8
            r30 = r11
            r19 = r12
            r28 = r20
            r18 = -1
            r1 = 50
            if (r15 != r1) goto L_0x0418
            r1 = 2
            if (r10 == r1) goto L_0x0404
        L_0x0401:
            r4 = r14
        L_0x0402:
            r15 = 0
            goto L_0x0437
        L_0x0404:
            r0 = r32
            r1 = r33
            r2 = r34
            r3 = r14
            r4 = r36
            r5 = r22
            r6 = r25
            r8 = r38
            r0.m(r1, r2, r3, r4, r5, r6, r8)
            r12 = 0
            throw r12
        L_0x0418:
            r8 = r0
            r12 = 0
            r0 = r32
            r1 = r33
            r2 = r34
            r3 = r14
            r4 = r36
            r5 = r19
            r6 = r28
            r7 = r10
            r9 = r15
            r10 = r25
            r15 = r12
            r12 = r22
            r13 = r38
            int r0 = r0.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 != r14) goto L_0x04ba
            r4 = r0
        L_0x0437:
            r6 = r37
            r2 = r4
            r9 = r19
            r7 = r21
            r8 = r27
        L_0x0440:
            if (r9 != r6) goto L_0x044f
            if (r6 != 0) goto L_0x0445
            goto L_0x044f
        L_0x0445:
            r5 = r32
            r11 = r5
            r10 = r33
            r0 = r2
            r1 = r6
            r4 = r9
            goto L_0x04e0
        L_0x044f:
            r11 = r32
            boolean r0 = r11.f6303f
            if (r0 == 0) goto L_0x0495
            r12 = r38
            java.lang.Object r0 = r12.f14680c
            com.google.android.gms.internal.ads.up r0 = (com.google.android.gms.internal.ads.up) r0
            com.google.android.gms.internal.ads.up r1 = com.google.android.gms.internal.ads.up.a()
            if (r0 == r1) goto L_0x0497
            com.google.android.gms.internal.ads.cq r0 = r11.f6302e
            java.lang.Object r1 = r12.f14680c
            com.google.android.gms.internal.ads.up r1 = (com.google.android.gms.internal.ads.up) r1
            java.util.Map<com.google.android.gms.internal.ads.up$a, com.google.android.gms.internal.ads.aq$f<?, ?>> r1 = r1.f8254a
            com.google.android.gms.internal.ads.up$a r3 = new com.google.android.gms.internal.ads.up$a
            r10 = r28
            r3.<init>(r0, r10)
            java.lang.Object r0 = r1.get(r3)
            com.google.android.gms.internal.ads.aq$f r0 = (com.google.android.gms.internal.ads.aq.f) r0
            if (r0 != 0) goto L_0x0488
            com.google.android.gms.internal.ads.nq r4 = z(r33)
            r0 = r9
            r1 = r34
            r3 = r36
            r5 = r38
            int r0 = com.google.android.gms.internal.ads.lp.a(r0, r1, r2, r3, r4, r5)
            goto L_0x04a8
        L_0x0488:
            r0 = r33
            com.google.android.gms.internal.ads.aq$d r0 = (com.google.android.gms.internal.ads.aq.d) r0
            r0.y()
            java.lang.NoSuchMethodError r0 = new java.lang.NoSuchMethodError
            r0.<init>()
            throw r0
        L_0x0495:
            r12 = r38
        L_0x0497:
            r10 = r28
            com.google.android.gms.internal.ads.nq r4 = z(r33)
            r0 = r9
            r1 = r34
            r3 = r36
            r5 = r38
            int r0 = com.google.android.gms.internal.ads.lp.a(r0, r1, r2, r3, r4, r5)
        L_0x04a8:
            r14 = r34
            r1 = r6
            r4 = r9
            r2 = r10
            r5 = r11
            r15 = r5
            r13 = r12
            r3 = r22
            r11 = r30
            r6 = r33
        L_0x04b6:
            r12 = r36
            goto L_0x001a
        L_0x04ba:
            r11 = r32
            r12 = r38
            r9 = r19
            r10 = r28
            r6 = r33
            r5 = r11
            r7 = r21
            r8 = r27
        L_0x04c9:
            r14 = r34
            r1 = r37
            r4 = r9
            r2 = r10
            r15 = r11
            r13 = r12
            r3 = r22
            r11 = r30
            goto L_0x04b6
        L_0x04d6:
            r9 = r5
            r10 = r6
            r21 = r7
            r27 = r8
            r30 = r11
            r11 = r15
            r15 = 0
        L_0x04e0:
            r2 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 == r2) goto L_0x04eb
            long r2 = (long) r7
            r6 = r30
            r6.putInt(r10, r2, r8)
        L_0x04eb:
            int r2 = r5.f6307j
        L_0x04ed:
            int r3 = r5.f6308k
            if (r2 >= r3) goto L_0x04fd
            int[] r3 = r5.f6306i
            r3 = r3[r2]
            com.google.android.gms.internal.ads.lq<?, ?> r6 = r5.f6311n
            r5.p(r10, r3, r15, r6)
            int r2 = r2 + 1
            goto L_0x04ed
        L_0x04fd:
            if (r1 != 0) goto L_0x0509
            r2 = r36
            if (r0 != r2) goto L_0x0504
            goto L_0x050f
        L_0x0504:
            e8.f80 r0 = e8.f80.g()
            throw r0
        L_0x0509:
            r2 = r36
            if (r0 > r2) goto L_0x0510
            if (r4 != r1) goto L_0x0510
        L_0x050f:
            return r0
        L_0x0510:
            e8.f80 r0 = e8.f80.g()
            goto L_0x0516
        L_0x0515:
            throw r0
        L_0x0516:
            goto L_0x0515
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.eq.n(java.lang.Object, byte[], int, int, int, e8.ft):int");
    }

    public final <UT, UB> UB p(Object obj, int i10, UB ub2, lq<UT, UB> lqVar) {
        int[] iArr = this.f6298a;
        int i11 = iArr[i10];
        Object u10 = oq.u(obj, (long) (iArr[i10 + 1] & 1048575));
        if (u10 == null) {
            return ub2;
        }
        int i12 = (i10 / 3) << 1;
        z70 z70 = (z70) this.f6299b[i12 + 1];
        if (z70 == null) {
            return ub2;
        }
        Map<?, ?> f10 = this.f6313p.f(u10);
        this.f6313p.b(this.f6299b[i12]);
        for (Map.Entry next : f10.entrySet()) {
            if (!z70.a(((Integer) next.getValue()).intValue())) {
                if (ub2 == null) {
                    lqVar.n();
                }
                next.getKey();
                next.getValue();
                throw null;
            }
        }
        return ub2;
    }

    public final <K, V> void t(ha0 ha0, int i10, Object obj, int i11) throws IOException {
        if (obj != null) {
            this.f6313p.b(this.f6299b[(i11 / 3) << 1]);
            Map<?, ?> a10 = this.f6313p.a(obj);
            tp tpVar = (tp) ha0;
            tpVar.getClass();
            Iterator<Map.Entry<?, ?>> it = a10.entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry next = it.next();
                tpVar.f8209a.c(i10, 2);
                next.getKey();
                next.getValue();
                throw null;
            }
        }
    }

    public final void u(Object obj, int i10, rp rpVar) throws IOException {
        if ((536870912 & i10) != 0) {
            oq.e(obj, (long) (i10 & 1048575), rpVar.s());
        } else if (this.f6304g) {
            rpVar.F(2);
            oq.e(obj, (long) (i10 & 1048575), ((op) rpVar.f8046a).c());
        } else {
            oq.e(obj, (long) (i10 & 1048575), rpVar.t());
        }
    }

    public final void v(T t10, T t11, int i10) {
        long j10 = (long) (this.f6298a[i10 + 1] & 1048575);
        if (F(t11, i10)) {
            Object u10 = oq.u(t10, j10);
            Object u11 = oq.u(t11, j10);
            if (u10 != null && u11 != null) {
                oq.e(t10, j10, v70.b(u10, u11));
                H(t10, i10);
            } else if (u11 != null) {
                oq.e(t10, j10, u11);
                H(t10, i10);
            }
        }
    }

    public final boolean w(T t10, int i10, int i11) {
        return oq.n(t10, (long) (this.f6298a[i11 + 2] & 1048575)) == i10;
    }

    public final boolean x(T t10, int i10, int i11, int i12, int i13) {
        if (i11 == 1048575) {
            return F(t10, i10);
        }
        return (i12 & i13) != 0;
    }

    public final int y(int i10, int i11) {
        int length = (this.f6298a.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int i14 = this.f6298a[i13];
            if (i10 == i14) {
                return i13;
            }
            if (i10 < i14) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }
}
