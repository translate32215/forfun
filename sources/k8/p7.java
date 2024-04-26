package k8;

import androidx.activity.e;
import androidx.leanback.widget.s;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.startapp.b4;
import e8.ft;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.2 */
public final class p7<T> implements x7<T> {

    /* renamed from: n  reason: collision with root package name */
    public static final int[] f20409n = new int[0];

    /* renamed from: o  reason: collision with root package name */
    public static final Unsafe f20410o = s8.k();

    /* renamed from: a  reason: collision with root package name */
    public final int[] f20411a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f20412b;

    /* renamed from: c  reason: collision with root package name */
    public final int f20413c;

    /* renamed from: d  reason: collision with root package name */
    public final int f20414d;

    /* renamed from: e  reason: collision with root package name */
    public final m7 f20415e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f20416f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f20417g;

    /* renamed from: h  reason: collision with root package name */
    public final int[] f20418h;

    /* renamed from: i  reason: collision with root package name */
    public final int f20419i;

    /* renamed from: j  reason: collision with root package name */
    public final int f20420j;

    /* renamed from: k  reason: collision with root package name */
    public final a7 f20421k;

    /* renamed from: l  reason: collision with root package name */
    public final l8<?, ?> f20422l;

    /* renamed from: m  reason: collision with root package name */
    public final y5<?> f20423m;

    public p7(int[] iArr, Object[] objArr, int i10, int i11, m7 m7Var, boolean z10, int[] iArr2, int i12, int i13, r7 r7Var, a7 a7Var, l8 l8Var, y5 y5Var, i7 i7Var) {
        this.f20411a = iArr;
        this.f20412b = objArr;
        this.f20413c = i10;
        this.f20414d = i11;
        this.f20417g = z10;
        this.f20416f = y5Var != null && y5Var.c(m7Var);
        this.f20418h = iArr2;
        this.f20419i = i12;
        this.f20420j = i13;
        this.f20421k = a7Var;
        this.f20422l = l8Var;
        this.f20423m = y5Var;
        this.f20415e = m7Var;
    }

    public static m8 B(Object obj) {
        k6 k6Var = (k6) obj;
        m8 m8Var = k6Var.zzc;
        if (m8Var != m8.f20328f) {
            return m8Var;
        }
        m8 b10 = m8.b();
        k6Var.zzc = b10;
        return b10;
    }

    public static <T> p7 C(k7 k7Var, r7 r7Var, a7 a7Var, l8 l8Var, y5 y5Var, i7 i7Var) {
        if (k7Var instanceof w7) {
            return D((w7) k7Var, r7Var, a7Var, l8Var, y5Var, i7Var);
        }
        j8 j8Var = (j8) k7Var;
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:124:0x0275  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0278  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0290  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0293  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0342  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0392  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> k8.p7<T> D(k8.w7 r35, k8.r7 r36, k8.a7 r37, k8.l8<?, ?> r38, k8.y5<?> r39, k8.i7 r40) {
        /*
            r0 = r35
            int r1 = r0.f20528d
            r2 = 1
            r1 = r1 & r2
            r3 = 2
            if (r1 != r2) goto L_0x000b
            r1 = 1
            goto L_0x000c
        L_0x000b:
            r1 = 2
        L_0x000c:
            r4 = 0
            if (r1 != r3) goto L_0x0011
            r11 = 1
            goto L_0x0012
        L_0x0011:
            r11 = 0
        L_0x0012:
            java.lang.String r1 = r0.f20526b
            int r3 = r1.length()
            char r5 = r1.charAt(r4)
            r6 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r6) goto L_0x002c
            r5 = 1
        L_0x0022:
            int r7 = r5 + 1
            char r5 = r1.charAt(r5)
            if (r5 < r6) goto L_0x002d
            r5 = r7
            goto L_0x0022
        L_0x002c:
            r7 = 1
        L_0x002d:
            int r5 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r6) goto L_0x004c
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x0039:
            int r10 = r5 + 1
            char r5 = r1.charAt(r5)
            if (r5 < r6) goto L_0x0049
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r5 = r5 << r9
            r7 = r7 | r5
            int r9 = r9 + 13
            r5 = r10
            goto L_0x0039
        L_0x0049:
            int r5 = r5 << r9
            r7 = r7 | r5
            r5 = r10
        L_0x004c:
            if (r7 != 0) goto L_0x0059
            int[] r7 = f20409n
            r13 = r7
            r7 = 0
            r9 = 0
            r10 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            goto L_0x016a
        L_0x0059:
            int r7 = r5 + 1
            char r5 = r1.charAt(r5)
            if (r5 < r6) goto L_0x0078
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x0065:
            int r10 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r6) goto L_0x0075
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            int r7 = r7 << r9
            r5 = r5 | r7
            int r9 = r9 + 13
            r7 = r10
            goto L_0x0065
        L_0x0075:
            int r7 = r7 << r9
            r5 = r5 | r7
            r7 = r10
        L_0x0078:
            int r9 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r6) goto L_0x0097
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r10 = 13
        L_0x0084:
            int r12 = r9 + 1
            char r9 = r1.charAt(r9)
            if (r9 < r6) goto L_0x0094
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r10
            r7 = r7 | r9
            int r10 = r10 + 13
            r9 = r12
            goto L_0x0084
        L_0x0094:
            int r9 = r9 << r10
            r7 = r7 | r9
            r9 = r12
        L_0x0097:
            int r10 = r9 + 1
            char r9 = r1.charAt(r9)
            if (r9 < r6) goto L_0x00b6
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x00a3:
            int r13 = r10 + 1
            char r10 = r1.charAt(r10)
            if (r10 < r6) goto L_0x00b3
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            int r10 = r10 << r12
            r9 = r9 | r10
            int r12 = r12 + 13
            r10 = r13
            goto L_0x00a3
        L_0x00b3:
            int r10 = r10 << r12
            r9 = r9 | r10
            r10 = r13
        L_0x00b6:
            int r12 = r10 + 1
            char r10 = r1.charAt(r10)
            if (r10 < r6) goto L_0x00d5
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x00c2:
            int r14 = r12 + 1
            char r12 = r1.charAt(r12)
            if (r12 < r6) goto L_0x00d2
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r10 = r10 | r12
            int r13 = r13 + 13
            r12 = r14
            goto L_0x00c2
        L_0x00d2:
            int r12 = r12 << r13
            r10 = r10 | r12
            r12 = r14
        L_0x00d5:
            int r13 = r12 + 1
            char r12 = r1.charAt(r12)
            if (r12 < r6) goto L_0x00f4
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x00e1:
            int r15 = r13 + 1
            char r13 = r1.charAt(r13)
            if (r13 < r6) goto L_0x00f1
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto L_0x00e1
        L_0x00f1:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        L_0x00f4:
            int r14 = r13 + 1
            char r13 = r1.charAt(r13)
            if (r13 < r6) goto L_0x0115
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x0100:
            int r16 = r14 + 1
            char r14 = r1.charAt(r14)
            if (r14 < r6) goto L_0x0111
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L_0x0100
        L_0x0111:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
        L_0x0115:
            int r15 = r14 + 1
            char r14 = r1.charAt(r14)
            if (r14 < r6) goto L_0x0138
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x0121:
            int r17 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r6) goto L_0x0133
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r14 = r14 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L_0x0121
        L_0x0133:
            int r15 = r15 << r16
            r14 = r14 | r15
            r15 = r17
        L_0x0138:
            int r16 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r6) goto L_0x015d
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            r4 = r16
            r16 = 13
        L_0x0146:
            int r18 = r4 + 1
            char r4 = r1.charAt(r4)
            if (r4 < r6) goto L_0x0158
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 << r16
            r15 = r15 | r4
            int r16 = r16 + 13
            r4 = r18
            goto L_0x0146
        L_0x0158:
            int r4 = r4 << r16
            r15 = r15 | r4
            r16 = r18
        L_0x015d:
            int r4 = r15 + r13
            int r4 = r4 + r14
            int[] r4 = new int[r4]
            int r14 = r5 + r5
            int r14 = r14 + r7
            r7 = r13
            r13 = r4
            r4 = r5
            r5 = r16
        L_0x016a:
            sun.misc.Unsafe r8 = f20410o
            java.lang.Object[] r2 = r0.f20527c
            k8.m7 r6 = r0.f20525a
            java.lang.Class r6 = r6.getClass()
            r20 = r5
            int r5 = r12 * 3
            int[] r5 = new int[r5]
            int r12 = r12 + r12
            java.lang.Object[] r12 = new java.lang.Object[r12]
            int r21 = r15 + r7
            r23 = r15
            r7 = r20
            r24 = r21
            r20 = 0
            r22 = 0
        L_0x0189:
            if (r7 >= r3) goto L_0x03e4
            int r25 = r7 + 1
            char r7 = r1.charAt(r7)
            r26 = r3
            r3 = 55296(0xd800, float:7.7486E-41)
            if (r7 < r3) goto L_0x01bd
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r3 = r25
            r25 = 13
        L_0x019e:
            int r27 = r3 + 1
            char r3 = r1.charAt(r3)
            r28 = r15
            r15 = 55296(0xd800, float:7.7486E-41)
            if (r3 < r15) goto L_0x01b7
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            int r3 = r3 << r25
            r7 = r7 | r3
            int r25 = r25 + 13
            r3 = r27
            r15 = r28
            goto L_0x019e
        L_0x01b7:
            int r3 = r3 << r25
            r7 = r7 | r3
            r3 = r27
            goto L_0x01c1
        L_0x01bd:
            r28 = r15
            r3 = r25
        L_0x01c1:
            int r15 = r3 + 1
            char r3 = r1.charAt(r3)
            r25 = r15
            r15 = 55296(0xd800, float:7.7486E-41)
            if (r3 < r15) goto L_0x01f3
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r15 = r25
            r25 = 13
        L_0x01d4:
            int r27 = r15 + 1
            char r15 = r1.charAt(r15)
            r29 = r10
            r10 = 55296(0xd800, float:7.7486E-41)
            if (r15 < r10) goto L_0x01ed
            r10 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r10 = r10 << r25
            r3 = r3 | r10
            int r25 = r25 + 13
            r15 = r27
            r10 = r29
            goto L_0x01d4
        L_0x01ed:
            int r10 = r15 << r25
            r3 = r3 | r10
            r15 = r27
            goto L_0x01f7
        L_0x01f3:
            r29 = r10
            r15 = r25
        L_0x01f7:
            r10 = r3 & 255(0xff, float:3.57E-43)
            r25 = r9
            r9 = r3 & 1024(0x400, float:1.435E-42)
            if (r9 == 0) goto L_0x0205
            int r9 = r22 + 1
            r13[r22] = r20
            r22 = r9
        L_0x0205:
            r9 = 51
            if (r10 < r9) goto L_0x02b0
            int r9 = r15 + 1
            char r15 = r1.charAt(r15)
            r27 = r9
            r9 = 55296(0xd800, float:7.7486E-41)
            if (r15 < r9) goto L_0x023d
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            r32 = 13
            r34 = r27
            r27 = r15
            r15 = r34
        L_0x0220:
            int r33 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r9) goto L_0x0236
            r9 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r32
            r27 = r27 | r9
            int r32 = r32 + 13
            r15 = r33
            r9 = 55296(0xd800, float:7.7486E-41)
            goto L_0x0220
        L_0x0236:
            int r9 = r15 << r32
            r15 = r27 | r9
            r9 = r33
            goto L_0x023f
        L_0x023d:
            r9 = r27
        L_0x023f:
            r27 = r9
            int r9 = r10 + -51
            r0 = 9
            if (r9 == r0) goto L_0x0260
            r0 = 17
            if (r9 != r0) goto L_0x024c
            goto L_0x0260
        L_0x024c:
            r0 = 12
            if (r9 != r0) goto L_0x026e
            if (r11 != 0) goto L_0x026e
            int r0 = r20 / 3
            int r9 = r14 + 1
            int r0 = r0 + r0
            r18 = 1
            int r0 = r0 + 1
            r14 = r2[r14]
            r12[r0] = r14
            goto L_0x026d
        L_0x0260:
            int r0 = r20 / 3
            int r9 = r14 + 1
            int r0 = r0 + r0
            r18 = 1
            int r0 = r0 + 1
            r14 = r2[r14]
            r12[r0] = r14
        L_0x026d:
            r14 = r9
        L_0x026e:
            int r15 = r15 + r15
            r0 = r2[r15]
            boolean r9 = r0 instanceof java.lang.reflect.Field
            if (r9 == 0) goto L_0x0278
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0
            goto L_0x0280
        L_0x0278:
            java.lang.String r0 = (java.lang.String) r0
            java.lang.reflect.Field r0 = o(r6, r0)
            r2[r15] = r0
        L_0x0280:
            r9 = r4
            r32 = r5
            long r4 = r8.objectFieldOffset(r0)
            int r0 = (int) r4
            int r15 = r15 + 1
            r4 = r2[r15]
            boolean r5 = r4 instanceof java.lang.reflect.Field
            if (r5 == 0) goto L_0x0293
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4
            goto L_0x029b
        L_0x0293:
            java.lang.String r4 = (java.lang.String) r4
            java.lang.reflect.Field r4 = o(r6, r4)
            r2[r15] = r4
        L_0x029b:
            long r4 = r8.objectFieldOffset(r4)
            int r5 = (int) r4
            r4 = r0
            r19 = r1
            r31 = r14
            r15 = r27
            r0 = 55296(0xd800, float:7.7486E-41)
            r18 = 1
            r14 = r6
            r6 = 0
            goto L_0x03ab
        L_0x02b0:
            r9 = r4
            r32 = r5
            int r0 = r14 + 1
            r4 = r2[r14]
            java.lang.String r4 = (java.lang.String) r4
            java.lang.reflect.Field r4 = o(r6, r4)
            r5 = 49
            r14 = 9
            if (r10 == r14) goto L_0x0325
            r14 = 17
            if (r10 != r14) goto L_0x02c8
            goto L_0x0325
        L_0x02c8:
            r14 = 27
            if (r10 == r14) goto L_0x0314
            if (r10 != r5) goto L_0x02cf
            goto L_0x0314
        L_0x02cf:
            r14 = 12
            if (r10 == r14) goto L_0x0304
            r14 = 30
            if (r10 == r14) goto L_0x0304
            r14 = 44
            if (r10 != r14) goto L_0x02dc
            goto L_0x0304
        L_0x02dc:
            r14 = 50
            if (r10 != r14) goto L_0x0301
            int r14 = r23 + 1
            r13[r23] = r20
            int r23 = r20 / 3
            int r23 = r23 + r23
            int r27 = r0 + 1
            r0 = r2[r0]
            r12[r23] = r0
            r0 = r3 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x02fd
            int r0 = r27 + 1
            int r23 = r23 + 1
            r27 = r2[r27]
            r12[r23] = r27
            r23 = r14
            goto L_0x0301
        L_0x02fd:
            r23 = r14
            r0 = r27
        L_0x0301:
            r18 = 1
            goto L_0x0332
        L_0x0304:
            if (r11 != 0) goto L_0x0301
            int r14 = r20 / 3
            int r27 = r0 + 1
            int r14 = r14 + r14
            r18 = 1
            int r14 = r14 + 1
            r0 = r2[r0]
            r12[r14] = r0
            goto L_0x0321
        L_0x0314:
            r18 = 1
            int r14 = r20 / 3
            int r27 = r0 + 1
            int r14 = r14 + r14
            int r14 = r14 + 1
            r0 = r2[r0]
            r12[r14] = r0
        L_0x0321:
            r14 = r6
            r0 = r27
            goto L_0x0333
        L_0x0325:
            r18 = 1
            int r14 = r20 / 3
            int r14 = r14 + r14
            int r14 = r14 + 1
            java.lang.Class r27 = r4.getType()
            r12[r14] = r27
        L_0x0332:
            r14 = r6
        L_0x0333:
            long r5 = r8.objectFieldOffset(r4)
            int r4 = (int) r5
            r5 = r3 & 4096(0x1000, float:5.74E-42)
            r6 = 4096(0x1000, float:5.74E-42)
            if (r5 != r6) goto L_0x0392
            r5 = 17
            if (r10 > r5) goto L_0x0392
            int r5 = r15 + 1
            char r6 = r1.charAt(r15)
            r15 = 55296(0xd800, float:7.7486E-41)
            if (r6 < r15) goto L_0x0367
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r19 = 13
        L_0x0351:
            int r30 = r5 + 1
            char r5 = r1.charAt(r5)
            if (r5 < r15) goto L_0x0363
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r5 = r5 << r19
            r6 = r6 | r5
            int r19 = r19 + 13
            r5 = r30
            goto L_0x0351
        L_0x0363:
            int r5 = r5 << r19
            r6 = r6 | r5
            goto L_0x0369
        L_0x0367:
            r30 = r5
        L_0x0369:
            int r5 = r9 + r9
            int r19 = r6 / 32
            int r19 = r19 + r5
            r5 = r2[r19]
            boolean r15 = r5 instanceof java.lang.reflect.Field
            if (r15 == 0) goto L_0x0378
            java.lang.reflect.Field r5 = (java.lang.reflect.Field) r5
            goto L_0x0380
        L_0x0378:
            java.lang.String r5 = (java.lang.String) r5
            java.lang.reflect.Field r5 = o(r14, r5)
            r2[r19] = r5
        L_0x0380:
            r31 = r0
            r19 = r1
            long r0 = r8.objectFieldOffset(r5)
            int r1 = (int) r0
            int r6 = r6 % 32
            r5 = r1
            r15 = r30
            r0 = 55296(0xd800, float:7.7486E-41)
            goto L_0x039d
        L_0x0392:
            r31 = r0
            r19 = r1
            r0 = 55296(0xd800, float:7.7486E-41)
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r6 = 0
        L_0x039d:
            r1 = 18
            if (r10 < r1) goto L_0x03ab
            r1 = 49
            if (r10 > r1) goto L_0x03ab
            int r1 = r24 + 1
            r13[r24] = r4
            r24 = r1
        L_0x03ab:
            int r1 = r20 + 1
            r32[r20] = r7
            int r7 = r1 + 1
            r0 = r3 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x03b8
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x03b9
        L_0x03b8:
            r0 = 0
        L_0x03b9:
            r3 = r3 & 256(0x100, float:3.59E-43)
            if (r3 == 0) goto L_0x03c0
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x03c1
        L_0x03c0:
            r3 = 0
        L_0x03c1:
            r0 = r0 | r3
            int r3 = r10 << 20
            r0 = r0 | r3
            r0 = r0 | r4
            r32[r1] = r0
            int r20 = r7 + 1
            int r0 = r6 << 20
            r0 = r0 | r5
            r32[r7] = r0
            r0 = r35
            r4 = r9
            r6 = r14
            r7 = r15
            r1 = r19
            r9 = r25
            r3 = r26
            r15 = r28
            r10 = r29
            r14 = r31
            r5 = r32
            goto L_0x0189
        L_0x03e4:
            r32 = r5
            r25 = r9
            r29 = r10
            r28 = r15
            k8.p7 r0 = new k8.p7
            r1 = r35
            k8.m7 r10 = r1.f20525a
            r1 = r32
            r5 = r0
            r6 = r1
            r7 = r12
            r8 = r25
            r9 = r29
            r12 = r13
            r13 = r28
            r14 = r21
            r15 = r36
            r16 = r37
            r17 = r38
            r18 = r39
            r19 = r40
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.p7.D(k8.w7, k8.r7, k8.a7, k8.l8, k8.y5, k8.i7):k8.p7");
    }

    public static <T> double E(T t10, long j10) {
        return ((Double) s8.j(t10, j10)).doubleValue();
    }

    public static <T> float F(T t10, long j10) {
        return ((Float) s8.j(t10, j10)).floatValue();
    }

    public static <T> int I(T t10, long j10) {
        return ((Integer) s8.j(t10, j10)).intValue();
    }

    public static <T> long k(T t10, long j10) {
        return ((Long) s8.j(t10, j10)).longValue();
    }

    public static Field o(Class<?> cls, String str) {
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
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 40 + name.length() + String.valueOf(arrays).length());
            s.a(sb2, "Field ", str, " for ", name);
            throw new RuntimeException(e.a(sb2, " not found. Known fields are ", arrays));
        }
    }

    public static <T> boolean x(T t10, long j10) {
        return ((Boolean) s8.j(t10, j10)).booleanValue();
    }

    public static final void z(int i10, Object obj, u5 u5Var) throws IOException {
        if (obj instanceof String) {
            u5Var.f20485a.o(i10, (String) obj);
            return;
        }
        u5Var.f20485a.f(i10, (p5) obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r35v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v33, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v34, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v37, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v38, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v42, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v18, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v33, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v51, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v52, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v96, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x02e4, code lost:
        r12 = r36;
        r16 = r5;
        r3 = r7;
        r2 = r22;
        r5 = r35;
        r7 = r1;
        r1 = r37;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x02f2, code lost:
        r6 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0309, code lost:
        r5 = r35;
        r12 = r0;
        r0 = r8;
        r8 = r6;
        r6 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0311, code lost:
        r18 = r35;
        r2 = r3;
        r9 = r6;
        r27 = r7;
        r30 = r11;
        r7 = r12;
        r6 = r37;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x03bc, code lost:
        if (r0 != r15) goto L_0x040b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0409, code lost:
        if (r0 != r15) goto L_0x040b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x040b, code lost:
        r15 = r32;
        r14 = r33;
        r4 = r34;
        r6 = r36;
        r12 = r6;
        r1 = r37;
        r13 = r38;
        r5 = r18;
        r2 = r22;
        r16 = r25;
        r7 = r26;
        r3 = r27;
        r11 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01b5, code lost:
        r8 = r0;
        r0 = r12 | r25;
        r1 = r6;
        r6 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0225, code lost:
        r5 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0250, code lost:
        r6 = r2;
        r3 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x026f, code lost:
        r1 = r12 | r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0296, code lost:
        r0 = r12 | r25;
        r1 = r6;
        r4 = r9;
        r6 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x029d, code lost:
        r10 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x029e, code lost:
        r6 = r10;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r0v7, types: [int, byte] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A(T r33, byte[] r34, int r35, int r36, int r37, e8.ft r38) throws java.io.IOException {
        /*
            r32 = this;
            r15 = r32
            r14 = r33
            r12 = r36
            r13 = r38
            sun.misc.Unsafe r11 = f20410o
            r4 = r34
            r0 = r35
            r1 = r37
            r6 = r12
            r2 = -1
            r3 = 0
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r7 = 0
            r16 = 0
        L_0x0019:
            r17 = 0
            if (r0 >= r6) goto L_0x04a8
            int r9 = r0 + 1
            byte r0 = r4[r0]
            if (r0 >= 0) goto L_0x002e
            int r0 = k8.j5.k(r0, r4, r9, r13)
            int r9 = r13.f14681d
            r31 = r9
            r9 = r0
            r0 = r31
        L_0x002e:
            int r10 = r0 >>> 3
            r8 = r0 & 7
            r35 = r0
            r0 = 3
            if (r10 <= r2) goto L_0x0049
            int r3 = r3 / r0
            int r2 = r15.f20413c
            if (r10 < r2) goto L_0x0045
            int r2 = r15.f20414d
            if (r10 > r2) goto L_0x0045
            int r2 = r15.O(r10, r3)
            goto L_0x0046
        L_0x0045:
            r2 = -1
        L_0x0046:
            r3 = r2
            r2 = 0
            goto L_0x0059
        L_0x0049:
            int r2 = r15.f20413c
            if (r10 < r2) goto L_0x0057
            int r2 = r15.f20414d
            if (r10 > r2) goto L_0x0057
            r2 = 0
            int r3 = r15.O(r10, r2)
            goto L_0x0059
        L_0x0057:
            r2 = 0
            r3 = -1
        L_0x0059:
            r12 = -1
            if (r3 != r12) goto L_0x006e
            r6 = r1
            r18 = r5
            r2 = r9
            r22 = r10
            r30 = r11
            r19 = -1
            r20 = 0
            r27 = 0
            r9 = r35
            goto L_0x042d
        L_0x006e:
            int[] r1 = r15.f20411a
            int r16 = r3 + 1
            r12 = r1[r16]
            int r2 = r12 >>> 20
            r2 = r2 & 255(0xff, float:3.57E-43)
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r12 & r16
            r16 = r9
            r22 = r10
            long r9 = (long) r0
            r0 = 17
            r23 = r12
            if (r2 > r0) goto L_0x0320
            int r0 = r3 + 2
            r0 = r1[r0]
            int r1 = r0 >>> 20
            r12 = 1
            int r25 = r12 << r1
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r1
            if (r0 == r5) goto L_0x00a5
            if (r5 == r1) goto L_0x009d
            long r12 = (long) r5
            r11.putInt(r14, r12, r7)
        L_0x009d:
            long r12 = (long) r0
            int r7 = r11.getInt(r14, r12)
            r12 = r7
            r7 = r0
            goto L_0x00a7
        L_0x00a5:
            r12 = r7
            r7 = r5
        L_0x00a7:
            r0 = 5
            switch(r2) {
                case 0: goto L_0x02c3;
                case 1: goto L_0x02a1;
                case 2: goto L_0x0273;
                case 3: goto L_0x0273;
                case 4: goto L_0x0256;
                case 5: goto L_0x0227;
                case 6: goto L_0x020c;
                case 7: goto L_0x01e3;
                case 8: goto L_0x01bd;
                case 9: goto L_0x0185;
                case 10: goto L_0x016a;
                case 11: goto L_0x0256;
                case 12: goto L_0x0132;
                case 13: goto L_0x020c;
                case 14: goto L_0x0227;
                case 15: goto L_0x0113;
                case 16: goto L_0x00db;
                default: goto L_0x00ab;
            }
        L_0x00ab:
            r5 = r35
            r13 = r38
            r35 = r7
            r0 = 3
            r20 = 0
            r7 = r3
            r3 = r16
            r16 = 1048575(0xfffff, float:1.469367E-39)
            if (r8 != r0) goto L_0x02f2
            k8.x7 r0 = r15.m(r7)
            int r1 = r22 << 3
            r4 = r1 | 4
            r1 = r34
            r2 = r3
            r3 = r36
            r6 = r5
            r5 = r38
            int r0 = k8.j5.c(r0, r1, r2, r3, r4, r5)
            r1 = r12 & r25
            if (r1 != 0) goto L_0x02f4
            java.lang.Object r1 = r13.f14679b
            r11.putObject(r14, r9, r1)
            goto L_0x0301
        L_0x00db:
            if (r8 != 0) goto L_0x0102
            r13 = r38
            r5 = r16
            int r8 = k8.j5.m(r4, r5, r13)
            long r1 = r13.f14678a
            long r17 = k8.q5.b(r1)
            r5 = r35
            r0 = r11
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r33
            r35 = r7
            r20 = 0
            r7 = r3
            r2 = r9
            r9 = r4
            r10 = r5
            r4 = r17
            r0.putLong(r1, r2, r4)
            goto L_0x0296
        L_0x0102:
            r10 = r35
            r13 = r38
            r35 = r7
            r5 = r16
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r20 = 0
            r7 = r3
            r3 = r5
            goto L_0x029e
        L_0x0113:
            r2 = r35
            r13 = r38
            r35 = r7
            r5 = r16
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r20 = 0
            r7 = r3
            if (r8 != 0) goto L_0x0250
            int r0 = k8.j5.j(r4, r5, r13)
            int r1 = r13.f14681d
            int r1 = k8.q5.a(r1)
            r11.putInt(r14, r9, r1)
            goto L_0x01b5
        L_0x0132:
            r2 = r35
            r13 = r38
            r35 = r7
            r5 = r16
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r20 = 0
            r7 = r3
            if (r8 != 0) goto L_0x0250
            int r0 = k8.j5.j(r4, r5, r13)
            int r1 = r13.f14681d
            k8.n6 r3 = r15.l(r7)
            if (r3 == 0) goto L_0x0166
            boolean r3 = r3.a(r1)
            if (r3 == 0) goto L_0x0155
            goto L_0x0166
        L_0x0155:
            k8.m8 r3 = B(r33)
            long r8 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r8)
            r3.c(r2, r1)
            r5 = r35
            r8 = r2
            goto L_0x0369
        L_0x0166:
            r11.putInt(r14, r9, r1)
            goto L_0x01b5
        L_0x016a:
            r2 = r35
            r13 = r38
            r35 = r7
            r5 = r16
            r0 = 2
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r20 = 0
            r7 = r3
            if (r8 != r0) goto L_0x0250
            int r0 = k8.j5.a(r4, r5, r13)
            java.lang.Object r1 = r13.f14679b
            r11.putObject(r14, r9, r1)
            goto L_0x01b5
        L_0x0185:
            r2 = r35
            r13 = r38
            r35 = r7
            r5 = r16
            r0 = 2
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r20 = 0
            r7 = r3
            if (r8 != r0) goto L_0x0250
            k8.x7 r0 = r15.m(r7)
            int r0 = k8.j5.d(r0, r4, r5, r6, r13)
            r1 = r12 & r25
            if (r1 != 0) goto L_0x01a8
            java.lang.Object r1 = r13.f14679b
            r11.putObject(r14, r9, r1)
            goto L_0x01b5
        L_0x01a8:
            java.lang.Object r1 = r11.getObject(r14, r9)
            java.lang.Object r3 = r13.f14679b
            java.lang.Object r1 = k8.r6.c(r1, r3)
            r11.putObject(r14, r9, r1)
        L_0x01b5:
            r1 = r12 | r25
            r8 = r0
            r0 = r1
            r1 = r6
            r6 = r2
            goto L_0x0309
        L_0x01bd:
            r2 = r35
            r13 = r38
            r35 = r7
            r5 = r16
            r0 = 2
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r20 = 0
            r7 = r3
            if (r8 != r0) goto L_0x0250
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r23 & r0
            if (r0 != 0) goto L_0x01d9
            int r0 = k8.j5.g(r4, r5, r13)
            goto L_0x01dd
        L_0x01d9:
            int r0 = k8.j5.h(r4, r5, r13)
        L_0x01dd:
            java.lang.Object r1 = r13.f14679b
            r11.putObject(r14, r9, r1)
            goto L_0x0225
        L_0x01e3:
            r2 = r35
            r13 = r38
            r35 = r7
            r5 = r16
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r20 = 0
            r7 = r3
            if (r8 != 0) goto L_0x0250
            int r0 = k8.j5.m(r4, r5, r13)
            r3 = r0
            long r0 = r13.f14678a
            r23 = 0
            int r5 = (r0 > r23 ? 1 : (r0 == r23 ? 0 : -1))
            if (r5 == 0) goto L_0x0202
            r0 = 1
            goto L_0x0203
        L_0x0202:
            r0 = 0
        L_0x0203:
            n3.d r1 = k8.s8.f20465c
            r1.f(r14, r9, r0)
            r5 = r2
            r0 = r3
            goto L_0x026f
        L_0x020c:
            r2 = r35
            r13 = r38
            r35 = r7
            r5 = r16
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r20 = 0
            r7 = r3
            if (r8 != r0) goto L_0x0250
            int r0 = k8.j5.b(r4, r5)
            r11.putInt(r14, r9, r0)
            int r0 = r5 + 4
        L_0x0225:
            r5 = r2
            goto L_0x026f
        L_0x0227:
            r2 = r35
            r13 = r38
            r35 = r7
            r5 = r16
            r0 = 1
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r20 = 0
            r7 = r3
            if (r8 != r0) goto L_0x0250
            long r17 = k8.j5.n(r4, r5)
            r0 = r11
            r1 = r33
            r8 = r2
            r2 = r9
            r9 = r4
            r10 = r5
            r4 = r17
            r0.putLong(r1, r2, r4)
            int r0 = r10 + 8
            r1 = r12 | r25
            r5 = r8
            r4 = r9
            goto L_0x02e4
        L_0x0250:
            r8 = r2
            r10 = r5
            r6 = r8
            r3 = r10
            goto L_0x0311
        L_0x0256:
            r5 = r35
            r13 = r38
            r35 = r7
            r20 = 0
            r7 = r3
            r3 = r16
            r16 = 1048575(0xfffff, float:1.469367E-39)
            if (r8 != 0) goto L_0x029d
            int r0 = k8.j5.j(r4, r3, r13)
            int r1 = r13.f14681d
            r11.putInt(r14, r9, r1)
        L_0x026f:
            r1 = r12 | r25
            goto L_0x02e4
        L_0x0273:
            r5 = r35
            r13 = r38
            r35 = r7
            r20 = 0
            r7 = r3
            r3 = r16
            r16 = 1048575(0xfffff, float:1.469367E-39)
            if (r8 != 0) goto L_0x029d
            int r8 = k8.j5.m(r4, r3, r13)
            long r2 = r13.f14678a
            r0 = r11
            r1 = r33
            r17 = r2
            r2 = r9
            r9 = r4
            r10 = r5
            r4 = r17
            r0.putLong(r1, r2, r4)
        L_0x0296:
            r0 = r12 | r25
            r1 = r6
            r4 = r9
            r6 = r10
            goto L_0x0309
        L_0x029d:
            r10 = r5
        L_0x029e:
            r6 = r10
            goto L_0x0311
        L_0x02a1:
            r5 = r35
            r13 = r38
            r1 = r4
            r35 = r7
            r20 = 0
            r7 = r3
            r3 = r16
            r16 = 1048575(0xfffff, float:1.469367E-39)
            if (r8 != r0) goto L_0x02f2
            int r0 = k8.j5.b(r1, r3)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            n3.d r2 = k8.s8.f20465c
            r2.i(r14, r9, r0)
            int r0 = r3 + 4
            r4 = r1
            goto L_0x026f
        L_0x02c3:
            r5 = r35
            r13 = r38
            r1 = r4
            r35 = r7
            r0 = 1
            r20 = 0
            r7 = r3
            r3 = r16
            r16 = 1048575(0xfffff, float:1.469367E-39)
            if (r8 != r0) goto L_0x02f2
            long r17 = k8.j5.n(r1, r3)
            r4 = r1
            double r0 = java.lang.Double.longBitsToDouble(r17)
            k8.s8.m(r14, r9, r0)
            int r0 = r3 + 8
            goto L_0x026f
        L_0x02e4:
            r12 = r36
            r16 = r5
            r3 = r7
            r2 = r22
            r5 = r35
            r7 = r1
            r1 = r37
            goto L_0x0019
        L_0x02f2:
            r6 = r5
            goto L_0x0311
        L_0x02f4:
            java.lang.Object r1 = r11.getObject(r14, r9)
            java.lang.Object r2 = r13.f14679b
            java.lang.Object r1 = k8.r6.c(r1, r2)
            r11.putObject(r14, r9, r1)
        L_0x0301:
            r1 = r12 | r25
            r4 = r34
            r8 = r0
            r0 = r1
            r1 = r36
        L_0x0309:
            r5 = r35
            r12 = r0
            r0 = r8
            r8 = r6
            r6 = r1
            goto L_0x0369
        L_0x0311:
            r18 = r35
            r2 = r3
            r9 = r6
            r27 = r7
            r30 = r11
            r7 = r12
            r19 = -1
            r6 = r37
            goto L_0x042d
        L_0x0320:
            r6 = r35
            r12 = r7
            r20 = 0
            r7 = r3
            r3 = r16
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r0 = 27
            if (r2 != r0) goto L_0x0384
            r0 = 2
            if (r8 != r0) goto L_0x0375
            java.lang.Object r0 = r11.getObject(r14, r9)
            k8.q6 r0 = (k8.q6) r0
            boolean r1 = r0.e()
            if (r1 != 0) goto L_0x034f
            int r1 = r0.size()
            if (r1 != 0) goto L_0x0347
            r1 = 10
            goto L_0x0348
        L_0x0347:
            int r1 = r1 + r1
        L_0x0348:
            k8.q6 r0 = r0.g(r1)
            r11.putObject(r14, r9, r0)
        L_0x034f:
            r8 = r0
            k8.x7 r0 = r15.m(r7)
            r1 = r6
            r2 = r34
            r4 = r36
            r18 = r5
            r5 = r8
            r8 = r6
            r6 = r38
            int r0 = k8.j5.e(r0, r1, r2, r3, r4, r5, r6)
            r4 = r34
            r6 = r36
            r5 = r18
        L_0x0369:
            r1 = r37
            r3 = r7
            r16 = r8
            r7 = r12
            r2 = r22
            r12 = r36
            goto L_0x0019
        L_0x0375:
            r18 = r5
            r15 = r3
            r25 = r6
            r27 = r7
            r30 = r11
            r26 = r12
            r19 = -1
            goto L_0x03dc
        L_0x0384:
            r18 = r5
            r0 = 49
            if (r2 > r0) goto L_0x03c2
            r5 = r23
            long r4 = (long) r5
            r0 = r32
            r1 = r33
            r35 = r2
            r2 = r34
            r21 = r3
            r23 = r4
            r4 = r36
            r5 = r6
            r25 = r6
            r6 = r22
            r27 = r7
            r26 = r12
            r7 = r8
            r8 = r27
            r28 = r9
            r12 = r21
            r19 = -1
            r9 = r23
            r30 = r11
            r11 = r35
            r15 = r12
            r12 = r28
            r14 = r38
            int r0 = r0.M(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L_0x03bf
            goto L_0x040b
        L_0x03bf:
            r9 = r0
            goto L_0x0426
        L_0x03c2:
            r35 = r2
            r15 = r3
            r25 = r6
            r27 = r7
            r28 = r9
            r30 = r11
            r26 = r12
            r5 = r23
            r19 = -1
            r0 = 50
            r9 = r35
            if (r9 != r0) goto L_0x03ef
            r0 = 2
            if (r8 == r0) goto L_0x03de
        L_0x03dc:
            r9 = r15
            goto L_0x0426
        L_0x03de:
            r0 = r32
            r1 = r33
            r2 = r34
            r3 = r15
            r4 = r36
            r5 = r27
            r6 = r28
            r0.J(r1, r2, r3, r4, r5, r6)
            throw r17
        L_0x03ef:
            r0 = r32
            r1 = r33
            r2 = r34
            r3 = r15
            r4 = r36
            r10 = r5
            r5 = r25
            r6 = r22
            r7 = r8
            r8 = r10
            r10 = r28
            r12 = r27
            r13 = r38
            int r0 = r0.K(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x03bf
        L_0x040b:
            r15 = r32
            r14 = r33
            r4 = r34
            r6 = r36
            r12 = r6
            r1 = r37
            r13 = r38
            r5 = r18
            r2 = r22
            r16 = r25
            r7 = r26
            r3 = r27
            r11 = r30
            goto L_0x0019
        L_0x0426:
            r6 = r37
            r2 = r9
            r9 = r25
            r7 = r26
        L_0x042d:
            if (r9 != r6) goto L_0x043b
            if (r6 == 0) goto L_0x043b
            r8 = r32
            r12 = r33
            r0 = r2
            r1 = r6
            r5 = r18
            goto L_0x04b2
        L_0x043b:
            r8 = r32
            boolean r0 = r8.f20416f
            if (r0 == 0) goto L_0x047f
            r10 = r38
            java.lang.Object r0 = r10.f14680c
            k8.x5 r0 = (k8.x5) r0
            k8.x5 r1 = k8.x5.a()
            if (r0 == r1) goto L_0x047c
            k8.m7 r0 = r8.f20415e
            java.lang.Object r1 = r10.f14680c
            k8.x5 r1 = (k8.x5) r1
            java.util.Map<k8.w5, k8.j6<?, ?>> r1 = r1.f20544a
            k8.w5 r3 = new k8.w5
            r11 = r22
            r3.<init>(r0, r11)
            java.lang.Object r0 = r1.get(r3)
            k8.j6 r0 = (k8.j6) r0
            if (r0 != 0) goto L_0x0476
            k8.m8 r4 = B(r33)
            r0 = r9
            r1 = r34
            r3 = r36
            r5 = r38
            int r0 = k8.j5.i(r0, r1, r2, r3, r4, r5)
            r12 = r33
            goto L_0x0494
        L_0x0476:
            r12 = r33
            r0 = r12
            k8.i6 r0 = (k8.i6) r0
            throw r17
        L_0x047c:
            r12 = r33
            goto L_0x0483
        L_0x047f:
            r12 = r33
            r10 = r38
        L_0x0483:
            r11 = r22
            k8.m8 r4 = B(r33)
            r0 = r9
            r1 = r34
            r3 = r36
            r5 = r38
            int r0 = k8.j5.i(r0, r1, r2, r3, r4, r5)
        L_0x0494:
            r4 = r34
            r1 = r6
            r15 = r8
            r16 = r9
            r13 = r10
            r2 = r11
            r14 = r12
            r5 = r18
            r3 = r27
            r11 = r30
            r6 = r36
            r12 = r6
            goto L_0x0019
        L_0x04a8:
            r18 = r5
            r26 = r7
            r30 = r11
            r12 = r14
            r8 = r15
            r9 = r16
        L_0x04b2:
            r2 = 1048575(0xfffff, float:1.469367E-39)
            if (r5 == r2) goto L_0x04bd
            long r3 = (long) r5
            r5 = r30
            r5.putInt(r12, r3, r7)
        L_0x04bd:
            int r3 = r8.f20419i
        L_0x04bf:
            int r4 = r8.f20420j
            if (r3 >= r4) goto L_0x04ea
            int[] r4 = r8.f20418h
            r4 = r4[r3]
            int[] r5 = r8.f20411a
            r5 = r5[r4]
            int r5 = r8.j(r4)
            r5 = r5 & r2
            long r5 = (long) r5
            java.lang.Object r5 = k8.s8.j(r12, r5)
            if (r5 != 0) goto L_0x04d8
            goto L_0x04de
        L_0x04d8:
            k8.n6 r6 = r8.l(r4)
            if (r6 != 0) goto L_0x04e1
        L_0x04de:
            int r3 = r3 + 1
            goto L_0x04bf
        L_0x04e1:
            k8.h7 r5 = (k8.h7) r5
            java.lang.Object r0 = r8.n(r4)
            k8.f7 r0 = (k8.f7) r0
            throw r17
        L_0x04ea:
            if (r1 != 0) goto L_0x04f6
            r2 = r36
            if (r0 != r2) goto L_0x04f1
            goto L_0x04fc
        L_0x04f1:
            k8.t6 r0 = k8.t6.c()
            throw r0
        L_0x04f6:
            r2 = r36
            if (r0 > r2) goto L_0x04fd
            if (r9 != r1) goto L_0x04fd
        L_0x04fc:
            return r0
        L_0x04fd:
            k8.t6 r0 = k8.t6.c()
            goto L_0x0503
        L_0x0502:
            throw r0
        L_0x0503:
            goto L_0x0502
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.p7.A(java.lang.Object, byte[], int, int, int, e8.ft):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0305, code lost:
        r7 = (r7 + r6) + r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0307, code lost:
        r3 = r3 + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x040a, code lost:
        r1 = r1 + r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x04ad, code lost:
        r3 = ((r7 + r1) + r6) + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x04ca, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x04f5, code lost:
        r1 = r1 + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x051c, code lost:
        r1 = r1 + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0528, code lost:
        r1 = r1 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0535, code lost:
        r1 = r1 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0538, code lost:
        r2 = r2 + 3;
        r1 = 1048575;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x011f, code lost:
        r7 = (r7 + r1) + r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int G(T r15) {
        /*
            r14 = this;
            sun.misc.Unsafe r0 = f20410o
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r2 = 0
            r3 = 0
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r5 = 0
        L_0x000b:
            int[] r6 = r14.f20411a
            int r6 = r6.length
            if (r2 >= r6) goto L_0x053f
            int r6 = r14.j(r2)
            int[] r7 = r14.f20411a
            r8 = r7[r2]
            int r9 = r6 >>> 20
            r9 = r9 & 255(0xff, float:3.57E-43)
            r10 = 17
            r11 = 1
            if (r9 > r10) goto L_0x0035
            int r10 = r2 + 2
            r7 = r7[r10]
            r10 = r7 & r1
            int r7 = r7 >>> 20
            int r7 = r11 << r7
            if (r10 == r4) goto L_0x0036
            long r4 = (long) r10
            int r4 = r0.getInt(r15, r4)
            r5 = r4
            r4 = r10
            goto L_0x0036
        L_0x0035:
            r7 = 0
        L_0x0036:
            r1 = r1 & r6
            long r12 = (long) r1
            r1 = 63
            switch(r9) {
                case 0: goto L_0x052b;
                case 1: goto L_0x051e;
                case 2: goto L_0x050a;
                case 3: goto L_0x04f7;
                case 4: goto L_0x04e3;
                case 5: goto L_0x04d8;
                case 6: goto L_0x04cd;
                case 7: goto L_0x04c0;
                case 8: goto L_0x0491;
                case 9: goto L_0x047f;
                case 10: goto L_0x0466;
                case 11: goto L_0x0452;
                case 12: goto L_0x043e;
                case 13: goto L_0x0432;
                case 14: goto L_0x0426;
                case 15: goto L_0x040d;
                case 16: goto L_0x03f4;
                case 17: goto L_0x03e0;
                case 18: goto L_0x03d4;
                case 19: goto L_0x03c8;
                case 20: goto L_0x03bc;
                case 21: goto L_0x03af;
                case 22: goto L_0x03a2;
                case 23: goto L_0x0396;
                case 24: goto L_0x038a;
                case 25: goto L_0x037e;
                case 26: goto L_0x0372;
                case 27: goto L_0x0362;
                case 28: goto L_0x0356;
                case 29: goto L_0x0349;
                case 30: goto L_0x033c;
                case 31: goto L_0x0330;
                case 32: goto L_0x0324;
                case 33: goto L_0x0317;
                case 34: goto L_0x030a;
                case 35: goto L_0x02f1;
                case 36: goto L_0x02dc;
                case 37: goto L_0x02c7;
                case 38: goto L_0x02b2;
                case 39: goto L_0x029d;
                case 40: goto L_0x0288;
                case 41: goto L_0x0272;
                case 42: goto L_0x025a;
                case 43: goto L_0x0244;
                case 44: goto L_0x022e;
                case 45: goto L_0x0218;
                case 46: goto L_0x0202;
                case 47: goto L_0x01ec;
                case 48: goto L_0x01d6;
                case 49: goto L_0x01c6;
                case 50: goto L_0x01b9;
                case 51: goto L_0x01ab;
                case 52: goto L_0x019d;
                case 53: goto L_0x0187;
                case 54: goto L_0x0171;
                case 55: goto L_0x015b;
                case 56: goto L_0x014d;
                case 57: goto L_0x013f;
                case 58: goto L_0x0131;
                case 59: goto L_0x0101;
                case 60: goto L_0x00ed;
                case 61: goto L_0x00d2;
                case 62: goto L_0x00bc;
                case 63: goto L_0x00a6;
                case 64: goto L_0x0098;
                case 65: goto L_0x008a;
                case 66: goto L_0x006f;
                case 67: goto L_0x0055;
                case 68: goto L_0x003f;
                default: goto L_0x003d;
            }
        L_0x003d:
            goto L_0x0538
        L_0x003f:
            boolean r1 = r14.w(r15, r8, r2)
            if (r1 == 0) goto L_0x0538
            java.lang.Object r1 = r0.getObject(r15, r12)
            k8.m7 r1 = (k8.m7) r1
            k8.x7 r6 = r14.m(r2)
            int r1 = k8.t5.w(r8, r1, r6)
            goto L_0x0537
        L_0x0055:
            boolean r6 = r14.w(r15, r8, r2)
            if (r6 == 0) goto L_0x0538
            long r6 = k(r15, r12)
            int r8 = r8 << 3
            int r8 = k8.t5.b(r8)
            long r9 = r6 + r6
            long r6 = r6 >> r1
            long r6 = r6 ^ r9
            int r1 = k8.t5.c(r6)
            goto L_0x040a
        L_0x006f:
            boolean r1 = r14.w(r15, r8, r2)
            if (r1 == 0) goto L_0x0538
            int r1 = I(r15, r12)
            int r6 = r8 << 3
            int r6 = k8.t5.b(r6)
            int r7 = r1 + r1
            int r1 = r1 >> 31
            r1 = r1 ^ r7
            int r1 = k8.t5.b(r1)
            goto L_0x04f5
        L_0x008a:
            boolean r1 = r14.w(r15, r8, r2)
            if (r1 == 0) goto L_0x0538
            int r1 = r8 << 3
            int r1 = k8.t5.b(r1)
            goto L_0x0535
        L_0x0098:
            boolean r1 = r14.w(r15, r8, r2)
            if (r1 == 0) goto L_0x0538
            int r1 = r8 << 3
            int r1 = k8.t5.b(r1)
            goto L_0x0528
        L_0x00a6:
            boolean r1 = r14.w(r15, r8, r2)
            if (r1 == 0) goto L_0x0538
            int r1 = I(r15, r12)
            int r6 = r8 << 3
            int r6 = k8.t5.b(r6)
            int r1 = k8.t5.x(r1)
            goto L_0x04f5
        L_0x00bc:
            boolean r1 = r14.w(r15, r8, r2)
            if (r1 == 0) goto L_0x0538
            int r1 = I(r15, r12)
            int r6 = r8 << 3
            int r6 = k8.t5.b(r6)
            int r1 = k8.t5.b(r1)
            goto L_0x04f5
        L_0x00d2:
            boolean r1 = r14.w(r15, r8, r2)
            if (r1 == 0) goto L_0x0538
            java.lang.Object r1 = r0.getObject(r15, r12)
            k8.p5 r1 = (k8.p5) r1
            int r6 = r8 << 3
            int r6 = k8.t5.b(r6)
            int r1 = r1.h()
            int r7 = k8.t5.b(r1)
            goto L_0x011f
        L_0x00ed:
            boolean r1 = r14.w(r15, r8, r2)
            if (r1 == 0) goto L_0x0538
            java.lang.Object r1 = r0.getObject(r15, r12)
            k8.x7 r6 = r14.m(r2)
            int r1 = k8.z7.H(r8, r1, r6)
            goto L_0x0537
        L_0x0101:
            boolean r1 = r14.w(r15, r8, r2)
            if (r1 == 0) goto L_0x0538
            java.lang.Object r1 = r0.getObject(r15, r12)
            boolean r6 = r1 instanceof k8.p5
            if (r6 == 0) goto L_0x0123
            k8.p5 r1 = (k8.p5) r1
            int r6 = r8 << 3
            int r6 = k8.t5.b(r6)
            int r1 = r1.h()
            int r7 = k8.t5.b(r1)
        L_0x011f:
            int r7 = r7 + r1
            int r7 = r7 + r6
            goto L_0x0307
        L_0x0123:
            java.lang.String r1 = (java.lang.String) r1
            int r6 = r8 << 3
            int r6 = k8.t5.b(r6)
            int r1 = k8.t5.z(r1)
            goto L_0x04f5
        L_0x0131:
            boolean r1 = r14.w(r15, r8, r2)
            if (r1 == 0) goto L_0x0538
            int r1 = r8 << 3
            int r1 = k8.t5.b(r1)
            goto L_0x04ca
        L_0x013f:
            boolean r1 = r14.w(r15, r8, r2)
            if (r1 == 0) goto L_0x0538
            int r1 = r8 << 3
            int r1 = k8.t5.b(r1)
            goto L_0x0528
        L_0x014d:
            boolean r1 = r14.w(r15, r8, r2)
            if (r1 == 0) goto L_0x0538
            int r1 = r8 << 3
            int r1 = k8.t5.b(r1)
            goto L_0x0535
        L_0x015b:
            boolean r1 = r14.w(r15, r8, r2)
            if (r1 == 0) goto L_0x0538
            int r1 = I(r15, r12)
            int r6 = r8 << 3
            int r6 = k8.t5.b(r6)
            int r1 = k8.t5.x(r1)
            goto L_0x04f5
        L_0x0171:
            boolean r1 = r14.w(r15, r8, r2)
            if (r1 == 0) goto L_0x0538
            long r6 = k(r15, r12)
            int r1 = r8 << 3
            int r1 = k8.t5.b(r1)
            int r6 = k8.t5.c(r6)
            goto L_0x051c
        L_0x0187:
            boolean r1 = r14.w(r15, r8, r2)
            if (r1 == 0) goto L_0x0538
            long r6 = k(r15, r12)
            int r1 = r8 << 3
            int r1 = k8.t5.b(r1)
            int r6 = k8.t5.c(r6)
            goto L_0x051c
        L_0x019d:
            boolean r1 = r14.w(r15, r8, r2)
            if (r1 == 0) goto L_0x0538
            int r1 = r8 << 3
            int r1 = k8.t5.b(r1)
            goto L_0x0528
        L_0x01ab:
            boolean r1 = r14.w(r15, r8, r2)
            if (r1 == 0) goto L_0x0538
            int r1 = r8 << 3
            int r1 = k8.t5.b(r1)
            goto L_0x0535
        L_0x01b9:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.lang.Object r6 = r14.n(r2)
            k8.i7.a(r8, r1, r6)
            goto L_0x0538
        L_0x01c6:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            k8.x7 r6 = r14.m(r2)
            int r1 = k8.z7.C(r8, r1, r6)
            goto L_0x0537
        L_0x01d6:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = k8.z7.M(r1)
            if (r1 <= 0) goto L_0x0538
            int r6 = k8.t5.A(r8)
            int r7 = k8.t5.b(r1)
            goto L_0x0305
        L_0x01ec:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = k8.z7.K(r1)
            if (r1 <= 0) goto L_0x0538
            int r6 = k8.t5.A(r8)
            int r7 = k8.t5.b(r1)
            goto L_0x0305
        L_0x0202:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = k8.z7.B(r1)
            if (r1 <= 0) goto L_0x0538
            int r6 = k8.t5.A(r8)
            int r7 = k8.t5.b(r1)
            goto L_0x0305
        L_0x0218:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = k8.z7.z(r1)
            if (r1 <= 0) goto L_0x0538
            int r6 = k8.t5.A(r8)
            int r7 = k8.t5.b(r1)
            goto L_0x0305
        L_0x022e:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = k8.z7.x(r1)
            if (r1 <= 0) goto L_0x0538
            int r6 = k8.t5.A(r8)
            int r7 = k8.t5.b(r1)
            goto L_0x0305
        L_0x0244:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = k8.z7.P(r1)
            if (r1 <= 0) goto L_0x0538
            int r6 = k8.t5.A(r8)
            int r7 = k8.t5.b(r1)
            goto L_0x0305
        L_0x025a:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            java.lang.Class<?> r6 = k8.z7.f20565a
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x0538
            int r6 = k8.t5.A(r8)
            int r7 = k8.t5.b(r1)
            goto L_0x0305
        L_0x0272:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = k8.z7.z(r1)
            if (r1 <= 0) goto L_0x0538
            int r6 = k8.t5.A(r8)
            int r7 = k8.t5.b(r1)
            goto L_0x0305
        L_0x0288:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = k8.z7.B(r1)
            if (r1 <= 0) goto L_0x0538
            int r6 = k8.t5.A(r8)
            int r7 = k8.t5.b(r1)
            goto L_0x0305
        L_0x029d:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = k8.z7.E(r1)
            if (r1 <= 0) goto L_0x0538
            int r6 = k8.t5.A(r8)
            int r7 = k8.t5.b(r1)
            goto L_0x0305
        L_0x02b2:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = k8.z7.R(r1)
            if (r1 <= 0) goto L_0x0538
            int r6 = k8.t5.A(r8)
            int r7 = k8.t5.b(r1)
            goto L_0x0305
        L_0x02c7:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = k8.z7.G(r1)
            if (r1 <= 0) goto L_0x0538
            int r6 = k8.t5.A(r8)
            int r7 = k8.t5.b(r1)
            goto L_0x0305
        L_0x02dc:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = k8.z7.z(r1)
            if (r1 <= 0) goto L_0x0538
            int r6 = k8.t5.A(r8)
            int r7 = k8.t5.b(r1)
            goto L_0x0305
        L_0x02f1:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = k8.z7.B(r1)
            if (r1 <= 0) goto L_0x0538
            int r6 = k8.t5.A(r8)
            int r7 = k8.t5.b(r1)
        L_0x0305:
            int r7 = r7 + r6
            int r7 = r7 + r1
        L_0x0307:
            int r3 = r3 + r7
            goto L_0x0538
        L_0x030a:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            r6 = 0
            int r1 = k8.z7.L(r8, r1, r6)
            goto L_0x0537
        L_0x0317:
            r1 = 0
            java.lang.Object r6 = r0.getObject(r15, r12)
            java.util.List r6 = (java.util.List) r6
            int r1 = k8.z7.J(r8, r6, r1)
            goto L_0x0537
        L_0x0324:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = k8.z7.A(r8, r1)
            goto L_0x0537
        L_0x0330:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = k8.z7.y(r8, r1)
            goto L_0x0537
        L_0x033c:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            r6 = 0
            int r1 = k8.z7.w(r8, r1, r6)
            goto L_0x0537
        L_0x0349:
            r1 = 0
            java.lang.Object r6 = r0.getObject(r15, r12)
            java.util.List r6 = (java.util.List) r6
            int r1 = k8.z7.O(r8, r6, r1)
            goto L_0x0537
        L_0x0356:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = k8.z7.v(r8, r1)
            goto L_0x0537
        L_0x0362:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            k8.x7 r6 = r14.m(r2)
            int r1 = k8.z7.I(r8, r1, r6)
            goto L_0x0537
        L_0x0372:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = k8.z7.N(r8, r1)
            goto L_0x0537
        L_0x037e:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = k8.z7.s(r8, r1)
            goto L_0x0537
        L_0x038a:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = k8.z7.y(r8, r1)
            goto L_0x0537
        L_0x0396:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = k8.z7.A(r8, r1)
            goto L_0x0537
        L_0x03a2:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            r6 = 0
            int r1 = k8.z7.D(r8, r1, r6)
            goto L_0x0537
        L_0x03af:
            r1 = 0
            java.lang.Object r6 = r0.getObject(r15, r12)
            java.util.List r6 = (java.util.List) r6
            int r1 = k8.z7.Q(r8, r6, r1)
            goto L_0x0537
        L_0x03bc:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = k8.z7.F(r8, r1)
            goto L_0x0537
        L_0x03c8:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = k8.z7.y(r8, r1)
            goto L_0x0537
        L_0x03d4:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = k8.z7.A(r8, r1)
            goto L_0x0537
        L_0x03e0:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0538
            java.lang.Object r1 = r0.getObject(r15, r12)
            k8.m7 r1 = (k8.m7) r1
            k8.x7 r6 = r14.m(r2)
            int r1 = k8.t5.w(r8, r1, r6)
            goto L_0x0537
        L_0x03f4:
            r6 = r7 & r5
            if (r6 == 0) goto L_0x0538
            long r6 = r0.getLong(r15, r12)
            int r8 = r8 << 3
            int r8 = k8.t5.b(r8)
            long r9 = r6 + r6
            long r6 = r6 >> r1
            long r6 = r6 ^ r9
            int r1 = k8.t5.c(r6)
        L_0x040a:
            int r1 = r1 + r8
            goto L_0x0537
        L_0x040d:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0538
            int r1 = r0.getInt(r15, r12)
            int r6 = r8 << 3
            int r6 = k8.t5.b(r6)
            int r7 = r1 + r1
            int r1 = r1 >> 31
            r1 = r1 ^ r7
            int r1 = k8.t5.b(r1)
            goto L_0x04f5
        L_0x0426:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0538
            int r1 = r8 << 3
            int r1 = k8.t5.b(r1)
            goto L_0x0535
        L_0x0432:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0538
            int r1 = r8 << 3
            int r1 = k8.t5.b(r1)
            goto L_0x0528
        L_0x043e:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0538
            int r1 = r0.getInt(r15, r12)
            int r6 = r8 << 3
            int r6 = k8.t5.b(r6)
            int r1 = k8.t5.x(r1)
            goto L_0x04f5
        L_0x0452:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0538
            int r1 = r0.getInt(r15, r12)
            int r6 = r8 << 3
            int r6 = k8.t5.b(r6)
            int r1 = k8.t5.b(r1)
            goto L_0x04f5
        L_0x0466:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0538
            java.lang.Object r1 = r0.getObject(r15, r12)
            k8.p5 r1 = (k8.p5) r1
            int r6 = r8 << 3
            int r6 = k8.t5.b(r6)
            int r1 = r1.h()
            int r7 = k8.t5.b(r1)
            goto L_0x04ad
        L_0x047f:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0538
            java.lang.Object r1 = r0.getObject(r15, r12)
            k8.x7 r6 = r14.m(r2)
            int r1 = k8.z7.H(r8, r1, r6)
            goto L_0x0537
        L_0x0491:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0538
            java.lang.Object r1 = r0.getObject(r15, r12)
            boolean r6 = r1 instanceof k8.p5
            if (r6 == 0) goto L_0x04b3
            k8.p5 r1 = (k8.p5) r1
            int r6 = r8 << 3
            int r6 = k8.t5.b(r6)
            int r1 = r1.h()
            int r7 = k8.t5.b(r1)
        L_0x04ad:
            int r7 = r7 + r1
            int r7 = r7 + r6
            int r7 = r7 + r3
            r3 = r7
            goto L_0x0538
        L_0x04b3:
            java.lang.String r1 = (java.lang.String) r1
            int r6 = r8 << 3
            int r6 = k8.t5.b(r6)
            int r1 = k8.t5.z(r1)
            goto L_0x04f5
        L_0x04c0:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0538
            int r1 = r8 << 3
            int r1 = k8.t5.b(r1)
        L_0x04ca:
            int r1 = r1 + r11
            goto L_0x0537
        L_0x04cd:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0538
            int r1 = r8 << 3
            int r1 = k8.t5.b(r1)
            goto L_0x0528
        L_0x04d8:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0538
            int r1 = r8 << 3
            int r1 = k8.t5.b(r1)
            goto L_0x0535
        L_0x04e3:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0538
            int r1 = r0.getInt(r15, r12)
            int r6 = r8 << 3
            int r6 = k8.t5.b(r6)
            int r1 = k8.t5.x(r1)
        L_0x04f5:
            int r1 = r1 + r6
            goto L_0x0537
        L_0x04f7:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0538
            long r6 = r0.getLong(r15, r12)
            int r1 = r8 << 3
            int r1 = k8.t5.b(r1)
            int r6 = k8.t5.c(r6)
            goto L_0x051c
        L_0x050a:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0538
            long r6 = r0.getLong(r15, r12)
            int r1 = r8 << 3
            int r1 = k8.t5.b(r1)
            int r6 = k8.t5.c(r6)
        L_0x051c:
            int r1 = r1 + r6
            goto L_0x0537
        L_0x051e:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0538
            int r1 = r8 << 3
            int r1 = k8.t5.b(r1)
        L_0x0528:
            int r1 = r1 + 4
            goto L_0x0537
        L_0x052b:
            r1 = r5 & r7
            if (r1 == 0) goto L_0x0538
            int r1 = r8 << 3
            int r1 = k8.t5.b(r1)
        L_0x0535:
            int r1 = r1 + 8
        L_0x0537:
            int r3 = r3 + r1
        L_0x0538:
            int r2 = r2 + 3
            r1 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x000b
        L_0x053f:
            k8.l8<?, ?> r0 = r14.f20422l
            java.lang.Object r1 = r0.c(r15)
            int r0 = r0.a(r1)
            int r0 = r0 + r3
            boolean r1 = r14.f20416f
            if (r1 != 0) goto L_0x054f
            return r0
        L_0x054f:
            k8.y5<?> r0 = r14.f20423m
            r0.a(r15)
            r15 = 0
            goto L_0x0557
        L_0x0556:
            throw r15
        L_0x0557:
            goto L_0x0556
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.p7.G(java.lang.Object):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02f8, code lost:
        r6 = (r6 + r5) + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x03fb, code lost:
        r4 = r4 + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x04ae, code lost:
        r6 = (r6 + r4) + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x04b0, code lost:
        r3 = r3 + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x04cc, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x04fe, code lost:
        r4 = r4 + r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0529, code lost:
        r4 = r4 + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0537, code lost:
        r4 = r4 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0546, code lost:
        r4 = r4 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0549, code lost:
        r2 = r2 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int H(T r11) {
        /*
            r10 = this;
            sun.misc.Unsafe r0 = f20410o
            r1 = 0
            r2 = 0
            r3 = 0
        L_0x0005:
            int[] r4 = r10.f20411a
            int r4 = r4.length
            if (r2 >= r4) goto L_0x054d
            int r4 = r10.j(r2)
            int r5 = r4 >>> 20
            r5 = r5 & 255(0xff, float:3.57E-43)
            int[] r6 = r10.f20411a
            r7 = r6[r2]
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r8
            long r8 = (long) r4
            k8.d6 r4 = k8.d6.DOUBLE_LIST_PACKED
            int r4 = r4.f20126a
            if (r5 < r4) goto L_0x002b
            k8.d6 r4 = k8.d6.SINT64_LIST_PACKED
            int r4 = r4.f20126a
            if (r5 > r4) goto L_0x002b
            int r4 = r2 + 2
            r4 = r6[r4]
        L_0x002b:
            r4 = 63
            switch(r5) {
                case 0: goto L_0x053a;
                case 1: goto L_0x052b;
                case 2: goto L_0x0515;
                case 3: goto L_0x0500;
                case 4: goto L_0x04ea;
                case 5: goto L_0x04dd;
                case 6: goto L_0x04d0;
                case 7: goto L_0x04c0;
                case 8: goto L_0x0490;
                case 9: goto L_0x047c;
                case 10: goto L_0x0461;
                case 11: goto L_0x044b;
                case 12: goto L_0x0435;
                case 13: goto L_0x0427;
                case 14: goto L_0x0419;
                case 15: goto L_0x03fe;
                case 16: goto L_0x03e2;
                case 17: goto L_0x03cc;
                case 18: goto L_0x03c0;
                case 19: goto L_0x03b4;
                case 20: goto L_0x03a8;
                case 21: goto L_0x039c;
                case 22: goto L_0x0390;
                case 23: goto L_0x0384;
                case 24: goto L_0x0378;
                case 25: goto L_0x036c;
                case 26: goto L_0x0360;
                case 27: goto L_0x0350;
                case 28: goto L_0x0344;
                case 29: goto L_0x0338;
                case 30: goto L_0x032c;
                case 31: goto L_0x0320;
                case 32: goto L_0x0314;
                case 33: goto L_0x0308;
                case 34: goto L_0x02fc;
                case 35: goto L_0x02e4;
                case 36: goto L_0x02cf;
                case 37: goto L_0x02ba;
                case 38: goto L_0x02a5;
                case 39: goto L_0x0290;
                case 40: goto L_0x027b;
                case 41: goto L_0x0265;
                case 42: goto L_0x024d;
                case 43: goto L_0x0237;
                case 44: goto L_0x0221;
                case 45: goto L_0x020b;
                case 46: goto L_0x01f5;
                case 47: goto L_0x01df;
                case 48: goto L_0x01c9;
                case 49: goto L_0x01b9;
                case 50: goto L_0x01ac;
                case 51: goto L_0x019e;
                case 52: goto L_0x0190;
                case 53: goto L_0x017a;
                case 54: goto L_0x0164;
                case 55: goto L_0x014e;
                case 56: goto L_0x0140;
                case 57: goto L_0x0132;
                case 58: goto L_0x0124;
                case 59: goto L_0x00f6;
                case 60: goto L_0x00e2;
                case 61: goto L_0x00c6;
                case 62: goto L_0x00b0;
                case 63: goto L_0x009a;
                case 64: goto L_0x008c;
                case 65: goto L_0x007e;
                case 66: goto L_0x0063;
                case 67: goto L_0x0048;
                case 68: goto L_0x0032;
                default: goto L_0x0030;
            }
        L_0x0030:
            goto L_0x0549
        L_0x0032:
            boolean r4 = r10.w(r11, r7, r2)
            if (r4 == 0) goto L_0x0549
            java.lang.Object r4 = k8.s8.j(r11, r8)
            k8.m7 r4 = (k8.m7) r4
            k8.x7 r5 = r10.m(r2)
            int r4 = k8.t5.w(r7, r4, r5)
            goto L_0x0548
        L_0x0048:
            boolean r5 = r10.w(r11, r7, r2)
            if (r5 == 0) goto L_0x0549
            long r5 = k(r11, r8)
            int r7 = r7 << 3
            int r7 = k8.t5.b(r7)
            long r8 = r5 + r5
            long r4 = r5 >> r4
            long r4 = r4 ^ r8
            int r4 = k8.t5.c(r4)
            goto L_0x03fb
        L_0x0063:
            boolean r4 = r10.w(r11, r7, r2)
            if (r4 == 0) goto L_0x0549
            int r4 = I(r11, r8)
            int r5 = r7 << 3
            int r5 = k8.t5.b(r5)
            int r6 = r4 + r4
            int r4 = r4 >> 31
            r4 = r4 ^ r6
            int r4 = k8.t5.b(r4)
            goto L_0x04fe
        L_0x007e:
            boolean r4 = r10.w(r11, r7, r2)
            if (r4 == 0) goto L_0x0549
            int r4 = r7 << 3
            int r4 = k8.t5.b(r4)
            goto L_0x0546
        L_0x008c:
            boolean r4 = r10.w(r11, r7, r2)
            if (r4 == 0) goto L_0x0549
            int r4 = r7 << 3
            int r4 = k8.t5.b(r4)
            goto L_0x0537
        L_0x009a:
            boolean r4 = r10.w(r11, r7, r2)
            if (r4 == 0) goto L_0x0549
            int r4 = I(r11, r8)
            int r5 = r7 << 3
            int r5 = k8.t5.b(r5)
            int r4 = k8.t5.x(r4)
            goto L_0x04fe
        L_0x00b0:
            boolean r4 = r10.w(r11, r7, r2)
            if (r4 == 0) goto L_0x0549
            int r4 = I(r11, r8)
            int r5 = r7 << 3
            int r5 = k8.t5.b(r5)
            int r4 = k8.t5.b(r4)
            goto L_0x04fe
        L_0x00c6:
            boolean r4 = r10.w(r11, r7, r2)
            if (r4 == 0) goto L_0x0549
            java.lang.Object r4 = k8.s8.j(r11, r8)
            k8.p5 r4 = (k8.p5) r4
            int r5 = r7 << 3
            int r5 = k8.t5.b(r5)
            int r4 = r4.h()
            int r6 = k8.t5.b(r4)
            goto L_0x04ae
        L_0x00e2:
            boolean r4 = r10.w(r11, r7, r2)
            if (r4 == 0) goto L_0x0549
            java.lang.Object r4 = k8.s8.j(r11, r8)
            k8.x7 r5 = r10.m(r2)
            int r4 = k8.z7.H(r7, r4, r5)
            goto L_0x0548
        L_0x00f6:
            boolean r4 = r10.w(r11, r7, r2)
            if (r4 == 0) goto L_0x0549
            java.lang.Object r4 = k8.s8.j(r11, r8)
            boolean r5 = r4 instanceof k8.p5
            if (r5 == 0) goto L_0x0116
            k8.p5 r4 = (k8.p5) r4
            int r5 = r7 << 3
            int r5 = k8.t5.b(r5)
            int r4 = r4.h()
            int r6 = k8.t5.b(r4)
            goto L_0x04ae
        L_0x0116:
            java.lang.String r4 = (java.lang.String) r4
            int r5 = r7 << 3
            int r5 = k8.t5.b(r5)
            int r4 = k8.t5.z(r4)
            goto L_0x04fe
        L_0x0124:
            boolean r4 = r10.w(r11, r7, r2)
            if (r4 == 0) goto L_0x0549
            int r4 = r7 << 3
            int r4 = k8.t5.b(r4)
            goto L_0x04cc
        L_0x0132:
            boolean r4 = r10.w(r11, r7, r2)
            if (r4 == 0) goto L_0x0549
            int r4 = r7 << 3
            int r4 = k8.t5.b(r4)
            goto L_0x0537
        L_0x0140:
            boolean r4 = r10.w(r11, r7, r2)
            if (r4 == 0) goto L_0x0549
            int r4 = r7 << 3
            int r4 = k8.t5.b(r4)
            goto L_0x0546
        L_0x014e:
            boolean r4 = r10.w(r11, r7, r2)
            if (r4 == 0) goto L_0x0549
            int r4 = I(r11, r8)
            int r5 = r7 << 3
            int r5 = k8.t5.b(r5)
            int r4 = k8.t5.x(r4)
            goto L_0x04fe
        L_0x0164:
            boolean r4 = r10.w(r11, r7, r2)
            if (r4 == 0) goto L_0x0549
            long r4 = k(r11, r8)
            int r6 = r7 << 3
            int r6 = k8.t5.b(r6)
            int r4 = k8.t5.c(r4)
            goto L_0x0529
        L_0x017a:
            boolean r4 = r10.w(r11, r7, r2)
            if (r4 == 0) goto L_0x0549
            long r4 = k(r11, r8)
            int r6 = r7 << 3
            int r6 = k8.t5.b(r6)
            int r4 = k8.t5.c(r4)
            goto L_0x0529
        L_0x0190:
            boolean r4 = r10.w(r11, r7, r2)
            if (r4 == 0) goto L_0x0549
            int r4 = r7 << 3
            int r4 = k8.t5.b(r4)
            goto L_0x0537
        L_0x019e:
            boolean r4 = r10.w(r11, r7, r2)
            if (r4 == 0) goto L_0x0549
            int r4 = r7 << 3
            int r4 = k8.t5.b(r4)
            goto L_0x0546
        L_0x01ac:
            java.lang.Object r4 = k8.s8.j(r11, r8)
            java.lang.Object r5 = r10.n(r2)
            k8.i7.a(r7, r4, r5)
            goto L_0x0549
        L_0x01b9:
            java.lang.Object r4 = k8.s8.j(r11, r8)
            java.util.List r4 = (java.util.List) r4
            k8.x7 r5 = r10.m(r2)
            int r4 = k8.z7.C(r7, r4, r5)
            goto L_0x0548
        L_0x01c9:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = k8.z7.M(r4)
            if (r4 <= 0) goto L_0x0549
            int r5 = k8.t5.A(r7)
            int r6 = k8.t5.b(r4)
            goto L_0x02f8
        L_0x01df:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = k8.z7.K(r4)
            if (r4 <= 0) goto L_0x0549
            int r5 = k8.t5.A(r7)
            int r6 = k8.t5.b(r4)
            goto L_0x02f8
        L_0x01f5:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = k8.z7.B(r4)
            if (r4 <= 0) goto L_0x0549
            int r5 = k8.t5.A(r7)
            int r6 = k8.t5.b(r4)
            goto L_0x02f8
        L_0x020b:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = k8.z7.z(r4)
            if (r4 <= 0) goto L_0x0549
            int r5 = k8.t5.A(r7)
            int r6 = k8.t5.b(r4)
            goto L_0x02f8
        L_0x0221:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = k8.z7.x(r4)
            if (r4 <= 0) goto L_0x0549
            int r5 = k8.t5.A(r7)
            int r6 = k8.t5.b(r4)
            goto L_0x02f8
        L_0x0237:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = k8.z7.P(r4)
            if (r4 <= 0) goto L_0x0549
            int r5 = k8.t5.A(r7)
            int r6 = k8.t5.b(r4)
            goto L_0x02f8
        L_0x024d:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            java.lang.Class<?> r5 = k8.z7.f20565a
            int r4 = r4.size()
            if (r4 <= 0) goto L_0x0549
            int r5 = k8.t5.A(r7)
            int r6 = k8.t5.b(r4)
            goto L_0x02f8
        L_0x0265:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = k8.z7.z(r4)
            if (r4 <= 0) goto L_0x0549
            int r5 = k8.t5.A(r7)
            int r6 = k8.t5.b(r4)
            goto L_0x02f8
        L_0x027b:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = k8.z7.B(r4)
            if (r4 <= 0) goto L_0x0549
            int r5 = k8.t5.A(r7)
            int r6 = k8.t5.b(r4)
            goto L_0x02f8
        L_0x0290:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = k8.z7.E(r4)
            if (r4 <= 0) goto L_0x0549
            int r5 = k8.t5.A(r7)
            int r6 = k8.t5.b(r4)
            goto L_0x02f8
        L_0x02a5:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = k8.z7.R(r4)
            if (r4 <= 0) goto L_0x0549
            int r5 = k8.t5.A(r7)
            int r6 = k8.t5.b(r4)
            goto L_0x02f8
        L_0x02ba:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = k8.z7.G(r4)
            if (r4 <= 0) goto L_0x0549
            int r5 = k8.t5.A(r7)
            int r6 = k8.t5.b(r4)
            goto L_0x02f8
        L_0x02cf:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = k8.z7.z(r4)
            if (r4 <= 0) goto L_0x0549
            int r5 = k8.t5.A(r7)
            int r6 = k8.t5.b(r4)
            goto L_0x02f8
        L_0x02e4:
            java.lang.Object r4 = r0.getObject(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = k8.z7.B(r4)
            if (r4 <= 0) goto L_0x0549
            int r5 = k8.t5.A(r7)
            int r6 = k8.t5.b(r4)
        L_0x02f8:
            int r6 = r6 + r5
            int r6 = r6 + r4
            goto L_0x04b0
        L_0x02fc:
            java.lang.Object r4 = k8.s8.j(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = k8.z7.L(r7, r4, r1)
            goto L_0x0548
        L_0x0308:
            java.lang.Object r4 = k8.s8.j(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = k8.z7.J(r7, r4, r1)
            goto L_0x0548
        L_0x0314:
            java.lang.Object r4 = k8.s8.j(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = k8.z7.A(r7, r4)
            goto L_0x0548
        L_0x0320:
            java.lang.Object r4 = k8.s8.j(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = k8.z7.y(r7, r4)
            goto L_0x0548
        L_0x032c:
            java.lang.Object r4 = k8.s8.j(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = k8.z7.w(r7, r4, r1)
            goto L_0x0548
        L_0x0338:
            java.lang.Object r4 = k8.s8.j(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = k8.z7.O(r7, r4, r1)
            goto L_0x0548
        L_0x0344:
            java.lang.Object r4 = k8.s8.j(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = k8.z7.v(r7, r4)
            goto L_0x0548
        L_0x0350:
            java.lang.Object r4 = k8.s8.j(r11, r8)
            java.util.List r4 = (java.util.List) r4
            k8.x7 r5 = r10.m(r2)
            int r4 = k8.z7.I(r7, r4, r5)
            goto L_0x0548
        L_0x0360:
            java.lang.Object r4 = k8.s8.j(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = k8.z7.N(r7, r4)
            goto L_0x0548
        L_0x036c:
            java.lang.Object r4 = k8.s8.j(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = k8.z7.s(r7, r4)
            goto L_0x0548
        L_0x0378:
            java.lang.Object r4 = k8.s8.j(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = k8.z7.y(r7, r4)
            goto L_0x0548
        L_0x0384:
            java.lang.Object r4 = k8.s8.j(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = k8.z7.A(r7, r4)
            goto L_0x0548
        L_0x0390:
            java.lang.Object r4 = k8.s8.j(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = k8.z7.D(r7, r4, r1)
            goto L_0x0548
        L_0x039c:
            java.lang.Object r4 = k8.s8.j(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = k8.z7.Q(r7, r4, r1)
            goto L_0x0548
        L_0x03a8:
            java.lang.Object r4 = k8.s8.j(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = k8.z7.F(r7, r4)
            goto L_0x0548
        L_0x03b4:
            java.lang.Object r4 = k8.s8.j(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = k8.z7.y(r7, r4)
            goto L_0x0548
        L_0x03c0:
            java.lang.Object r4 = k8.s8.j(r11, r8)
            java.util.List r4 = (java.util.List) r4
            int r4 = k8.z7.A(r7, r4)
            goto L_0x0548
        L_0x03cc:
            boolean r4 = r10.u(r11, r2)
            if (r4 == 0) goto L_0x0549
            java.lang.Object r4 = k8.s8.j(r11, r8)
            k8.m7 r4 = (k8.m7) r4
            k8.x7 r5 = r10.m(r2)
            int r4 = k8.t5.w(r7, r4, r5)
            goto L_0x0548
        L_0x03e2:
            boolean r5 = r10.u(r11, r2)
            if (r5 == 0) goto L_0x0549
            long r5 = k8.s8.h(r11, r8)
            int r7 = r7 << 3
            int r7 = k8.t5.b(r7)
            long r8 = r5 + r5
            long r4 = r5 >> r4
            long r4 = r4 ^ r8
            int r4 = k8.t5.c(r4)
        L_0x03fb:
            int r4 = r4 + r7
            goto L_0x0548
        L_0x03fe:
            boolean r4 = r10.u(r11, r2)
            if (r4 == 0) goto L_0x0549
            int r4 = k8.s8.g(r11, r8)
            int r5 = r7 << 3
            int r5 = k8.t5.b(r5)
            int r6 = r4 + r4
            int r4 = r4 >> 31
            r4 = r4 ^ r6
            int r4 = k8.t5.b(r4)
            goto L_0x04fe
        L_0x0419:
            boolean r4 = r10.u(r11, r2)
            if (r4 == 0) goto L_0x0549
            int r4 = r7 << 3
            int r4 = k8.t5.b(r4)
            goto L_0x0546
        L_0x0427:
            boolean r4 = r10.u(r11, r2)
            if (r4 == 0) goto L_0x0549
            int r4 = r7 << 3
            int r4 = k8.t5.b(r4)
            goto L_0x0537
        L_0x0435:
            boolean r4 = r10.u(r11, r2)
            if (r4 == 0) goto L_0x0549
            int r4 = k8.s8.g(r11, r8)
            int r5 = r7 << 3
            int r5 = k8.t5.b(r5)
            int r4 = k8.t5.x(r4)
            goto L_0x04fe
        L_0x044b:
            boolean r4 = r10.u(r11, r2)
            if (r4 == 0) goto L_0x0549
            int r4 = k8.s8.g(r11, r8)
            int r5 = r7 << 3
            int r5 = k8.t5.b(r5)
            int r4 = k8.t5.b(r4)
            goto L_0x04fe
        L_0x0461:
            boolean r4 = r10.u(r11, r2)
            if (r4 == 0) goto L_0x0549
            java.lang.Object r4 = k8.s8.j(r11, r8)
            k8.p5 r4 = (k8.p5) r4
            int r5 = r7 << 3
            int r5 = k8.t5.b(r5)
            int r4 = r4.h()
            int r6 = k8.t5.b(r4)
            goto L_0x04ae
        L_0x047c:
            boolean r4 = r10.u(r11, r2)
            if (r4 == 0) goto L_0x0549
            java.lang.Object r4 = k8.s8.j(r11, r8)
            k8.x7 r5 = r10.m(r2)
            int r4 = k8.z7.H(r7, r4, r5)
            goto L_0x0548
        L_0x0490:
            boolean r4 = r10.u(r11, r2)
            if (r4 == 0) goto L_0x0549
            java.lang.Object r4 = k8.s8.j(r11, r8)
            boolean r5 = r4 instanceof k8.p5
            if (r5 == 0) goto L_0x04b3
            k8.p5 r4 = (k8.p5) r4
            int r5 = r7 << 3
            int r5 = k8.t5.b(r5)
            int r4 = r4.h()
            int r6 = k8.t5.b(r4)
        L_0x04ae:
            int r6 = r6 + r4
            int r6 = r6 + r5
        L_0x04b0:
            int r3 = r3 + r6
            goto L_0x0549
        L_0x04b3:
            java.lang.String r4 = (java.lang.String) r4
            int r5 = r7 << 3
            int r5 = k8.t5.b(r5)
            int r4 = k8.t5.z(r4)
            goto L_0x04fe
        L_0x04c0:
            boolean r4 = r10.u(r11, r2)
            if (r4 == 0) goto L_0x0549
            int r4 = r7 << 3
            int r4 = k8.t5.b(r4)
        L_0x04cc:
            int r4 = r4 + 1
            goto L_0x0548
        L_0x04d0:
            boolean r4 = r10.u(r11, r2)
            if (r4 == 0) goto L_0x0549
            int r4 = r7 << 3
            int r4 = k8.t5.b(r4)
            goto L_0x0537
        L_0x04dd:
            boolean r4 = r10.u(r11, r2)
            if (r4 == 0) goto L_0x0549
            int r4 = r7 << 3
            int r4 = k8.t5.b(r4)
            goto L_0x0546
        L_0x04ea:
            boolean r4 = r10.u(r11, r2)
            if (r4 == 0) goto L_0x0549
            int r4 = k8.s8.g(r11, r8)
            int r5 = r7 << 3
            int r5 = k8.t5.b(r5)
            int r4 = k8.t5.x(r4)
        L_0x04fe:
            int r4 = r4 + r5
            goto L_0x0548
        L_0x0500:
            boolean r4 = r10.u(r11, r2)
            if (r4 == 0) goto L_0x0549
            long r4 = k8.s8.h(r11, r8)
            int r6 = r7 << 3
            int r6 = k8.t5.b(r6)
            int r4 = k8.t5.c(r4)
            goto L_0x0529
        L_0x0515:
            boolean r4 = r10.u(r11, r2)
            if (r4 == 0) goto L_0x0549
            long r4 = k8.s8.h(r11, r8)
            int r6 = r7 << 3
            int r6 = k8.t5.b(r6)
            int r4 = k8.t5.c(r4)
        L_0x0529:
            int r4 = r4 + r6
            goto L_0x0548
        L_0x052b:
            boolean r4 = r10.u(r11, r2)
            if (r4 == 0) goto L_0x0549
            int r4 = r7 << 3
            int r4 = k8.t5.b(r4)
        L_0x0537:
            int r4 = r4 + 4
            goto L_0x0548
        L_0x053a:
            boolean r4 = r10.u(r11, r2)
            if (r4 == 0) goto L_0x0549
            int r4 = r7 << 3
            int r4 = k8.t5.b(r4)
        L_0x0546:
            int r4 = r4 + 8
        L_0x0548:
            int r3 = r3 + r4
        L_0x0549:
            int r2 = r2 + 3
            goto L_0x0005
        L_0x054d:
            k8.l8<?, ?> r0 = r10.f20422l
            java.lang.Object r11 = r0.c(r11)
            int r11 = r0.a(r11)
            int r11 = r11 + r3
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.p7.H(java.lang.Object):int");
    }

    public final <K, V> int J(Object obj, byte[] bArr, int i10, int i11, int i12, long j10) throws IOException {
        Unsafe unsafe = f20410o;
        Object n10 = n(i12);
        Object object = unsafe.getObject(obj, j10);
        if (!((h7) object).f20245a) {
            h7 h7Var = h7.f20244b;
            h7 h7Var2 = h7Var.isEmpty() ? new h7() : new h7(h7Var);
            i7.b(h7Var2, object);
            unsafe.putObject(obj, j10, h7Var2);
        }
        f7 f7Var = (f7) n10;
        throw null;
    }

    public final int K(T t10, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, int i17, ft ftVar) throws IOException {
        T t11 = t10;
        byte[] bArr2 = bArr;
        int i18 = i10;
        int i19 = i12;
        int i20 = i13;
        int i21 = i14;
        long j11 = j10;
        int i22 = i17;
        ft ftVar2 = ftVar;
        Unsafe unsafe = f20410o;
        long j12 = (long) (this.f20411a[i22 + 2] & 1048575);
        switch (i16) {
            case 51:
                if (i21 == 1) {
                    unsafe.putObject(t11, j11, Double.valueOf(Double.longBitsToDouble(j5.n(bArr, i10))));
                    unsafe.putInt(t11, j12, i20);
                    return i18 + 8;
                }
                break;
            case ModuleDescriptor.MODULE_VERSION:
                if (i21 == 5) {
                    unsafe.putObject(t11, j11, Float.valueOf(Float.intBitsToFloat(j5.b(bArr, i10))));
                    unsafe.putInt(t11, j12, i20);
                    return i18 + 4;
                }
                break;
            case 53:
            case 54:
                if (i21 == 0) {
                    int m10 = j5.m(bArr2, i18, ftVar2);
                    unsafe.putObject(t11, j11, Long.valueOf(ftVar2.f14678a));
                    unsafe.putInt(t11, j12, i20);
                    return m10;
                }
                break;
            case 55:
            case 62:
                if (i21 == 0) {
                    int j13 = j5.j(bArr2, i18, ftVar2);
                    unsafe.putObject(t11, j11, Integer.valueOf(ftVar2.f14681d));
                    unsafe.putInt(t11, j12, i20);
                    return j13;
                }
                break;
            case 56:
            case 65:
                if (i21 == 1) {
                    unsafe.putObject(t11, j11, Long.valueOf(j5.n(bArr, i10)));
                    unsafe.putInt(t11, j12, i20);
                    return i18 + 8;
                }
                break;
            case 57:
            case 64:
                if (i21 == 5) {
                    unsafe.putObject(t11, j11, Integer.valueOf(j5.b(bArr, i10)));
                    unsafe.putInt(t11, j12, i20);
                    return i18 + 4;
                }
                break;
            case 58:
                if (i21 == 0) {
                    int m11 = j5.m(bArr2, i18, ftVar2);
                    unsafe.putObject(t11, j11, Boolean.valueOf(ftVar2.f14678a != 0));
                    unsafe.putInt(t11, j12, i20);
                    return m11;
                }
                break;
            case 59:
                if (i21 == 2) {
                    int j14 = j5.j(bArr2, i18, ftVar2);
                    int i23 = ftVar2.f14681d;
                    if (i23 == 0) {
                        unsafe.putObject(t11, j11, "");
                    } else if ((i15 & 536870912) == 0 || v8.d(bArr2, j14, j14 + i23)) {
                        unsafe.putObject(t11, j11, new String(bArr2, j14, i23, r6.f20450a));
                        j14 += i23;
                    } else {
                        throw t6.a();
                    }
                    unsafe.putInt(t11, j12, i20);
                    return j14;
                }
                break;
            case 60:
                if (i21 == 2) {
                    int d10 = j5.d(m(i22), bArr2, i18, i11, ftVar2);
                    Object object = unsafe.getInt(t11, j12) == i20 ? unsafe.getObject(t11, j11) : null;
                    if (object == null) {
                        unsafe.putObject(t11, j11, ftVar2.f14679b);
                    } else {
                        unsafe.putObject(t11, j11, r6.c(object, ftVar2.f14679b));
                    }
                    unsafe.putInt(t11, j12, i20);
                    return d10;
                }
                break;
            case 61:
                if (i21 == 2) {
                    int a10 = j5.a(bArr2, i18, ftVar2);
                    unsafe.putObject(t11, j11, ftVar2.f14679b);
                    unsafe.putInt(t11, j12, i20);
                    return a10;
                }
                break;
            case 63:
                if (i21 == 0) {
                    int j15 = j5.j(bArr2, i18, ftVar2);
                    int i24 = ftVar2.f14681d;
                    n6 l10 = l(i22);
                    if (l10 == null || l10.a(i24)) {
                        unsafe.putObject(t11, j11, Integer.valueOf(i24));
                        unsafe.putInt(t11, j12, i20);
                    } else {
                        B(t10).c(i19, Long.valueOf((long) i24));
                    }
                    return j15;
                }
                break;
            case 66:
                if (i21 == 0) {
                    int j16 = j5.j(bArr2, i18, ftVar2);
                    unsafe.putObject(t11, j11, Integer.valueOf(q5.a(ftVar2.f14681d)));
                    unsafe.putInt(t11, j12, i20);
                    return j16;
                }
                break;
            case 67:
                if (i21 == 0) {
                    int m12 = j5.m(bArr2, i18, ftVar2);
                    unsafe.putObject(t11, j11, Long.valueOf(q5.b(ftVar2.f14678a)));
                    unsafe.putInt(t11, j12, i20);
                    return m12;
                }
                break;
            case 68:
                if (i21 == 3) {
                    int c10 = j5.c(m(i22), bArr, i10, i11, (i19 & -8) | 4, ftVar);
                    Object object2 = unsafe.getInt(t11, j12) == i20 ? unsafe.getObject(t11, j11) : null;
                    if (object2 == null) {
                        unsafe.putObject(t11, j11, ftVar2.f14679b);
                    } else {
                        unsafe.putObject(t11, j11, r6.c(object2, ftVar2.f14679b));
                    }
                    unsafe.putInt(t11, j12, i20);
                    return c10;
                }
                break;
        }
        return i18;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v5, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x02e7, code lost:
        if (r0 != r15) goto L_0x0331;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x032f, code lost:
        if (r0 != r15) goto L_0x0331;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0331, code lost:
        r5 = r0;
        r2 = r19;
        r10 = r26;
        r9 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0113, code lost:
        r9 = r9 | r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0116, code lost:
        r19 = r4;
        r13 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0196, code lost:
        r9 = r9 | r23;
        r2 = r4;
        r4 = r11;
        r14 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01ba, code lost:
        r5 = r5;
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x020a, code lost:
        r16 = r0;
        r0 = r9 | r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x020f, code lost:
        r9 = r0;
        r2 = r4;
        r4 = r11;
        r28 = r12;
        r0 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x023f, code lost:
        r2 = r4;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int L(T r30, byte[] r31, int r32, int r33, e8.ft r34) throws java.io.IOException {
        /*
            r29 = this;
            r15 = r33
            sun.misc.Unsafe r14 = f20410o
            r12 = -1
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r11 = 0
            r6 = r29
            r4 = r30
            r7 = r31
            r0 = r32
            r8 = r34
            r1 = -1
            r2 = 0
            r9 = 0
            r10 = 1048575(0xfffff, float:1.469367E-39)
        L_0x0019:
            if (r0 >= r15) goto L_0x0364
            int r3 = r0 + 1
            byte r0 = r7[r0]
            if (r0 >= 0) goto L_0x002b
            int r0 = k8.j5.k(r0, r7, r3, r8)
            int r3 = r8.f14681d
            r5 = r0
            r16 = r3
            goto L_0x002e
        L_0x002b:
            r16 = r0
            r5 = r3
        L_0x002e:
            int r3 = r16 >>> 3
            r0 = r16 & 7
            if (r3 <= r1) goto L_0x0043
            int r2 = r2 / 3
            int r1 = r6.f20413c
            if (r3 < r1) goto L_0x0051
            int r1 = r6.f20414d
            if (r3 > r1) goto L_0x0051
            int r1 = r6.O(r3, r2)
            goto L_0x004f
        L_0x0043:
            int r1 = r6.f20413c
            if (r3 < r1) goto L_0x0051
            int r1 = r6.f20414d
            if (r3 > r1) goto L_0x0051
            int r1 = r6.O(r3, r11)
        L_0x004f:
            r2 = r1
            goto L_0x0052
        L_0x0051:
            r2 = -1
        L_0x0052:
            if (r2 != r12) goto L_0x005d
            r24 = r3
            r12 = r14
            r2 = 0
            r25 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x0240
        L_0x005d:
            int[] r1 = r6.f20411a
            int r17 = r2 + 1
            r11 = r1[r17]
            int r12 = r11 >>> 20
            r12 = r12 & 255(0xff, float:3.57E-43)
            r32 = r3
            r3 = r11 & r13
            r19 = r14
            long r13 = (long) r3
            r3 = 17
            r21 = r11
            if (r12 > r3) goto L_0x024b
            int r3 = r2 + 2
            r1 = r1[r3]
            int r3 = r1 >>> 20
            r11 = 1
            int r23 = r11 << r3
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r3
            if (r1 == r10) goto L_0x009a
            r20 = r12
            if (r10 == r3) goto L_0x008e
            long r11 = (long) r10
            r10 = r19
            r10.putInt(r4, r11, r9)
            goto L_0x0090
        L_0x008e:
            r10 = r19
        L_0x0090:
            if (r1 == r3) goto L_0x0097
            long r11 = (long) r1
            int r9 = r10.getInt(r4, r11)
        L_0x0097:
            r12 = r10
            r10 = r1
            goto L_0x009e
        L_0x009a:
            r20 = r12
            r12 = r19
        L_0x009e:
            r1 = 5
            switch(r20) {
                case 0: goto L_0x021c;
                case 1: goto L_0x01f2;
                case 2: goto L_0x01d3;
                case 3: goto L_0x01d3;
                case 4: goto L_0x01c0;
                case 5: goto L_0x019d;
                case 6: goto L_0x0183;
                case 7: goto L_0x0165;
                case 8: goto L_0x0145;
                case 9: goto L_0x011b;
                case 10: goto L_0x0100;
                case 11: goto L_0x01c0;
                case 12: goto L_0x00ed;
                case 13: goto L_0x0183;
                case 14: goto L_0x019d;
                case 15: goto L_0x00d6;
                case 16: goto L_0x00aa;
                default: goto L_0x00a2;
            }
        L_0x00a2:
            r24 = r32
            r4 = r2
            r25 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x023f
        L_0x00aa:
            if (r0 != 0) goto L_0x00ce
            int r11 = k8.j5.m(r7, r5, r8)
            long r0 = r8.f14678a
            long r19 = k8.q5.b(r0)
            r0 = r12
            r1 = r30
            r24 = r32
            r5 = r2
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r13
            r13 = r4
            r14 = r5
            r4 = r19
            r0.putLong(r1, r2, r4)
            r0 = r9 | r23
            r9 = r0
            r0 = r11
            r11 = r13
            r4 = r14
            goto L_0x0116
        L_0x00ce:
            r24 = r32
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r2
            goto L_0x023f
        L_0x00d6:
            r24 = r32
            r11 = r4
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r2
            if (r0 != 0) goto L_0x023f
            int r0 = k8.j5.j(r7, r5, r8)
            int r1 = r8.f14681d
            int r1 = k8.q5.a(r1)
            r12.putInt(r11, r13, r1)
            goto L_0x0113
        L_0x00ed:
            r24 = r32
            r11 = r4
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r2
            if (r0 != 0) goto L_0x023f
            int r0 = k8.j5.j(r7, r5, r8)
            int r1 = r8.f14681d
            r12.putInt(r11, r13, r1)
            goto L_0x0113
        L_0x0100:
            r24 = r32
            r11 = r4
            r1 = 2
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r2
            if (r0 != r1) goto L_0x023f
            int r0 = k8.j5.a(r7, r5, r8)
            java.lang.Object r1 = r8.f14679b
            r12.putObject(r11, r13, r1)
        L_0x0113:
            r1 = r9 | r23
            r9 = r1
        L_0x0116:
            r19 = r4
            r13 = r6
            goto L_0x0292
        L_0x011b:
            r24 = r32
            r11 = r4
            r1 = 2
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r2
            if (r0 != r1) goto L_0x023f
            k8.x7 r0 = r6.m(r4)
            int r0 = k8.j5.d(r0, r7, r5, r15, r8)
            java.lang.Object r1 = r12.getObject(r11, r13)
            if (r1 != 0) goto L_0x013a
            java.lang.Object r1 = r8.f14679b
            r12.putObject(r11, r13, r1)
            goto L_0x020a
        L_0x013a:
            java.lang.Object r2 = r8.f14679b
            java.lang.Object r1 = k8.r6.c(r1, r2)
            r12.putObject(r11, r13, r1)
            goto L_0x020a
        L_0x0145:
            r24 = r32
            r11 = r4
            r1 = 2
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r2
            if (r0 != r1) goto L_0x023f
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r21 & r0
            if (r0 != 0) goto L_0x015a
            int r0 = k8.j5.g(r7, r5, r8)
            goto L_0x015e
        L_0x015a:
            int r0 = k8.j5.h(r7, r5, r8)
        L_0x015e:
            java.lang.Object r1 = r8.f14679b
            r12.putObject(r11, r13, r1)
            goto L_0x020a
        L_0x0165:
            r24 = r32
            r11 = r4
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r2
            if (r0 != 0) goto L_0x01ba
            int r0 = k8.j5.m(r7, r5, r8)
            long r1 = r8.f14678a
            r19 = 0
            int r3 = (r1 > r19 ? 1 : (r1 == r19 ? 0 : -1))
            if (r3 == 0) goto L_0x017c
            r1 = 1
            goto L_0x017d
        L_0x017c:
            r1 = 0
        L_0x017d:
            n3.d r2 = k8.s8.f20465c
            r2.f(r11, r13, r1)
            goto L_0x0196
        L_0x0183:
            r24 = r32
            r11 = r4
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r2
            if (r0 != r1) goto L_0x01ba
            int r0 = k8.j5.b(r7, r5)
            r12.putInt(r11, r13, r0)
            int r5 = r5 + 4
            r0 = r5
        L_0x0196:
            r9 = r9 | r23
            r2 = r4
            r4 = r11
            r14 = r12
            goto L_0x0297
        L_0x019d:
            r24 = r32
            r11 = r4
            r1 = 1
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r2
            if (r0 != r1) goto L_0x01ba
            long r19 = k8.j5.n(r7, r5)
            r0 = r12
            r1 = r30
            r2 = r13
            r14 = r4
            r13 = r5
            r4 = r19
            r0.putLong(r1, r2, r4)
            int r0 = r13 + 8
            r4 = r14
            goto L_0x020a
        L_0x01ba:
            r14 = r4
            r13 = r5
            r5 = r13
            r4 = r14
            goto L_0x023f
        L_0x01c0:
            r24 = r32
            r11 = r4
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r2
            if (r0 != 0) goto L_0x023f
            int r0 = k8.j5.j(r7, r5, r8)
            int r1 = r8.f14681d
            r12.putInt(r11, r13, r1)
            goto L_0x020a
        L_0x01d3:
            r24 = r32
            r11 = r4
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r2
            if (r0 != 0) goto L_0x023f
            int r16 = k8.j5.m(r7, r5, r8)
            long r2 = r8.f14678a
            r0 = r12
            r1 = r30
            r19 = r2
            r2 = r13
            r13 = r4
            r4 = r19
            r0.putLong(r1, r2, r4)
            r0 = r9 | r23
            r4 = r13
            goto L_0x020f
        L_0x01f2:
            r24 = r32
            r11 = r4
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r2
            if (r0 != r1) goto L_0x023f
            int r0 = k8.j5.b(r7, r5)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            n3.d r1 = k8.s8.f20465c
            r1.i(r11, r13, r0)
            int r0 = r5 + 4
        L_0x020a:
            r1 = r9 | r23
            r16 = r0
            r0 = r1
        L_0x020f:
            r9 = r0
            r2 = r4
            r4 = r11
            r28 = r12
            r0 = r16
            r18 = 0
            r21 = -1
            goto L_0x035c
        L_0x021c:
            r24 = r32
            r11 = r4
            r1 = 1
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r2
            if (r0 != r1) goto L_0x023f
            long r0 = k8.j5.n(r7, r5)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            k8.s8.m(r11, r13, r0)
            int r5 = r5 + 8
            r0 = r9 | r23
            r2 = r4
            r4 = r11
            r28 = r12
            r18 = 0
            r21 = -1
            goto L_0x035a
        L_0x023f:
            r2 = r4
        L_0x0240:
            r19 = r2
            r2 = r5
            r28 = r12
            r18 = 0
            r21 = -1
            goto L_0x033e
        L_0x024b:
            r24 = r32
            r11 = r4
            r20 = r12
            r12 = r19
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r2
            r1 = 27
            r3 = r20
            if (r3 != r1) goto L_0x02af
            r1 = 2
            if (r0 != r1) goto L_0x02a0
            java.lang.Object r0 = r12.getObject(r11, r13)
            k8.q6 r0 = (k8.q6) r0
            boolean r1 = r0.e()
            if (r1 != 0) goto L_0x027c
            int r1 = r0.size()
            if (r1 != 0) goto L_0x0274
            r1 = 10
            goto L_0x0275
        L_0x0274:
            int r1 = r1 + r1
        L_0x0275:
            k8.q6 r0 = r0.g(r1)
            r12.putObject(r11, r13, r0)
        L_0x027c:
            r13 = r0
            k8.x7 r0 = r6.m(r4)
            r1 = r16
            r2 = r31
            r3 = r5
            r19 = r4
            r4 = r33
            r5 = r13
            r13 = r6
            r6 = r34
            int r0 = k8.j5.e(r0, r1, r2, r3, r4, r5, r6)
        L_0x0292:
            r4 = r11
            r14 = r12
            r6 = r13
            r2 = r19
        L_0x0297:
            r1 = r24
        L_0x0299:
            r11 = 0
            r12 = -1
            r13 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x0019
        L_0x02a0:
            r19 = r4
            r15 = r5
            r27 = r9
            r26 = r10
            r28 = r12
            r18 = 0
            r21 = -1
            goto L_0x0305
        L_0x02af:
            r19 = r4
            r1 = 49
            if (r3 > r1) goto L_0x02ec
            r8 = r21
            long r7 = (long) r8
            r11 = r0
            r0 = r29
            r1 = r30
            r2 = r31
            r6 = r3
            r3 = r5
            r4 = r33
            r15 = r5
            r5 = r16
            r20 = r6
            r6 = r24
            r21 = r7
            r7 = r11
            r8 = r19
            r11 = r9
            r26 = r10
            r9 = r21
            r27 = r11
            r18 = 0
            r11 = r20
            r17 = r12
            r21 = -1
            r12 = r13
            r28 = r17
            r14 = r34
            int r0 = r0.M(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L_0x02ea
            goto L_0x0331
        L_0x02ea:
            r5 = r0
            goto L_0x0339
        L_0x02ec:
            r11 = r0
            r20 = r3
            r15 = r5
            r27 = r9
            r26 = r10
            r28 = r12
            r8 = r21
            r18 = 0
            r21 = -1
            r0 = 50
            r9 = r20
            if (r9 != r0) goto L_0x0318
            r0 = 2
            if (r11 == r0) goto L_0x0307
        L_0x0305:
            r5 = r15
            goto L_0x0339
        L_0x0307:
            r0 = r29
            r1 = r30
            r2 = r31
            r3 = r15
            r4 = r33
            r5 = r19
            r6 = r13
            r0.J(r1, r2, r3, r4, r5, r6)
            r0 = 0
            throw r0
        L_0x0318:
            r0 = r29
            r1 = r30
            r2 = r31
            r3 = r15
            r4 = r33
            r5 = r16
            r6 = r24
            r7 = r11
            r10 = r13
            r12 = r19
            r13 = r34
            int r0 = r0.K(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x02ea
        L_0x0331:
            r5 = r0
            r2 = r19
            r10 = r26
            r9 = r27
            goto L_0x0351
        L_0x0339:
            r2 = r5
            r10 = r26
            r9 = r27
        L_0x033e:
            k8.m8 r4 = B(r30)
            r0 = r16
            r1 = r31
            r3 = r33
            r5 = r34
            int r0 = k8.j5.i(r0, r1, r2, r3, r4, r5)
            r5 = r0
            r2 = r19
        L_0x0351:
            r6 = r29
            r4 = r30
            r7 = r31
            r8 = r34
            r0 = r9
        L_0x035a:
            r9 = r0
            r0 = r5
        L_0x035c:
            r15 = r33
            r1 = r24
            r14 = r28
            goto L_0x0299
        L_0x0364:
            r27 = r9
            r28 = r14
            r1 = 1048575(0xfffff, float:1.469367E-39)
            if (r10 == r1) goto L_0x0377
            long r1 = (long) r10
            r3 = r30
            r9 = r27
            r4 = r28
            r4.putInt(r3, r1, r9)
        L_0x0377:
            r1 = r33
            if (r0 != r1) goto L_0x037c
            return r0
        L_0x037c:
            k8.t6 r0 = k8.t6.c()
            goto L_0x0382
        L_0x0381:
            throw r0
        L_0x0382:
            goto L_0x0381
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.p7.L(java.lang.Object, byte[], int, int, e8.ft):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:117:0x0238  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0286  */
    /* JADX WARNING: Removed duplicated region for block: B:280:0x01ea A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x04ba A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:289:0x04ba A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01bb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int M(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, long r25, int r27, long r28, e8.ft r30) throws java.io.IOException {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r3 = r18
            r4 = r19
            r5 = r20
            r2 = r21
            r8 = r22
            r6 = r23
            r9 = r24
            r10 = r28
            r7 = r30
            sun.misc.Unsafe r12 = f20410o
            java.lang.Object r13 = r12.getObject(r1, r10)
            k8.q6 r13 = (k8.q6) r13
            boolean r14 = r13.e()
            if (r14 != 0) goto L_0x0035
            int r14 = r13.size()
            if (r14 != 0) goto L_0x002d
            r14 = 10
            goto L_0x002e
        L_0x002d:
            int r14 = r14 + r14
        L_0x002e:
            k8.q6 r13 = r13.g(r14)
            r12.putObject(r1, r10, r13)
        L_0x0035:
            r10 = 5
            r11 = 0
            r14 = 2
            r15 = 1
            switch(r27) {
                case 18: goto L_0x044b;
                case 19: goto L_0x03fd;
                case 20: goto L_0x03ba;
                case 21: goto L_0x03ba;
                case 22: goto L_0x039f;
                case 23: goto L_0x035d;
                case 24: goto L_0x031b;
                case 25: goto L_0x02c3;
                case 26: goto L_0x0210;
                case 27: goto L_0x01f5;
                case 28: goto L_0x019b;
                case 29: goto L_0x039f;
                case 30: goto L_0x00fd;
                case 31: goto L_0x031b;
                case 32: goto L_0x035d;
                case 33: goto L_0x00ae;
                case 34: goto L_0x005f;
                case 35: goto L_0x044b;
                case 36: goto L_0x03fd;
                case 37: goto L_0x03ba;
                case 38: goto L_0x03ba;
                case 39: goto L_0x039f;
                case 40: goto L_0x035d;
                case 41: goto L_0x031b;
                case 42: goto L_0x02c3;
                case 43: goto L_0x039f;
                case 44: goto L_0x00fd;
                case 45: goto L_0x031b;
                case 46: goto L_0x035d;
                case 47: goto L_0x00ae;
                case 48: goto L_0x005f;
                default: goto L_0x003d;
            }
        L_0x003d:
            r1 = 3
            if (r6 != r1) goto L_0x04ba
            k8.x7 r1 = r0.m(r9)
            r6 = r2 & -8
            r6 = r6 | 4
            r22 = r1
            r23 = r18
            r24 = r19
            r25 = r20
            r26 = r6
            r27 = r30
            int r4 = k8.j5.c(r22, r23, r24, r25, r26, r27)
            java.lang.Object r8 = r7.f14679b
            r13.add(r8)
            goto L_0x0498
        L_0x005f:
            if (r6 != r14) goto L_0x0083
            k8.b7 r13 = (k8.b7) r13
            int r1 = k8.j5.j(r3, r4, r7)
            int r2 = r7.f14681d
            int r2 = r2 + r1
        L_0x006a:
            if (r1 >= r2) goto L_0x007a
            int r1 = k8.j5.m(r3, r1, r7)
            long r4 = r7.f14678a
            long r4 = k8.q5.b(r4)
            r13.i(r4)
            goto L_0x006a
        L_0x007a:
            if (r1 != r2) goto L_0x007e
            goto L_0x04bb
        L_0x007e:
            k8.t6 r1 = k8.t6.d()
            throw r1
        L_0x0083:
            if (r6 != 0) goto L_0x04ba
            k8.b7 r13 = (k8.b7) r13
            int r1 = k8.j5.m(r3, r4, r7)
            long r8 = r7.f14678a
            long r8 = k8.q5.b(r8)
            r13.i(r8)
        L_0x0094:
            if (r1 >= r5) goto L_0x00ad
            int r4 = k8.j5.j(r3, r1, r7)
            int r6 = r7.f14681d
            if (r2 == r6) goto L_0x009f
            goto L_0x00ad
        L_0x009f:
            int r1 = k8.j5.m(r3, r4, r7)
            long r8 = r7.f14678a
            long r8 = k8.q5.b(r8)
            r13.i(r8)
            goto L_0x0094
        L_0x00ad:
            return r1
        L_0x00ae:
            if (r6 != r14) goto L_0x00d2
            k8.m6 r13 = (k8.m6) r13
            int r1 = k8.j5.j(r3, r4, r7)
            int r2 = r7.f14681d
            int r2 = r2 + r1
        L_0x00b9:
            if (r1 >= r2) goto L_0x00c9
            int r1 = k8.j5.j(r3, r1, r7)
            int r4 = r7.f14681d
            int r4 = k8.q5.a(r4)
            r13.i(r4)
            goto L_0x00b9
        L_0x00c9:
            if (r1 != r2) goto L_0x00cd
            goto L_0x04bb
        L_0x00cd:
            k8.t6 r1 = k8.t6.d()
            throw r1
        L_0x00d2:
            if (r6 != 0) goto L_0x04ba
            k8.m6 r13 = (k8.m6) r13
            int r1 = k8.j5.j(r3, r4, r7)
            int r4 = r7.f14681d
            int r4 = k8.q5.a(r4)
            r13.i(r4)
        L_0x00e3:
            if (r1 >= r5) goto L_0x00fc
            int r4 = k8.j5.j(r3, r1, r7)
            int r6 = r7.f14681d
            if (r2 == r6) goto L_0x00ee
            goto L_0x00fc
        L_0x00ee:
            int r1 = k8.j5.j(r3, r4, r7)
            int r4 = r7.f14681d
            int r4 = k8.q5.a(r4)
            r13.i(r4)
            goto L_0x00e3
        L_0x00fc:
            return r1
        L_0x00fd:
            if (r6 != r14) goto L_0x0104
            int r2 = k8.j5.f(r3, r4, r13, r7)
            goto L_0x0115
        L_0x0104:
            if (r6 != 0) goto L_0x04ba
            r2 = r21
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r13
            r7 = r30
            int r2 = k8.j5.l(r2, r3, r4, r5, r6, r7)
        L_0x0115:
            k8.k6 r1 = (k8.k6) r1
            k8.m8 r3 = r1.zzc
            k8.m8 r4 = k8.m8.f20328f
            if (r3 != r4) goto L_0x011e
            r3 = 0
        L_0x011e:
            k8.n6 r4 = r0.l(r9)
            k8.l8<?, ?> r5 = r0.f20422l
            java.lang.Class<?> r6 = k8.z7.f20565a
            if (r4 != 0) goto L_0x0129
            goto L_0x0191
        L_0x0129:
            boolean r6 = r13 instanceof java.util.RandomAccess
            if (r6 == 0) goto L_0x0169
            int r6 = r13.size()
            r7 = 0
            r15 = 0
        L_0x0133:
            if (r15 >= r6) goto L_0x015e
            java.lang.Object r9 = r13.get(r15)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            boolean r10 = r4.a(r9)
            if (r10 == 0) goto L_0x0151
            if (r15 == r7) goto L_0x014e
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r13.set(r7, r9)
        L_0x014e:
            int r7 = r7 + 1
            goto L_0x015b
        L_0x0151:
            if (r3 != 0) goto L_0x0157
            java.lang.Object r3 = r5.e()
        L_0x0157:
            long r9 = (long) r9
            r5.f(r3, r8, r9)
        L_0x015b:
            int r15 = r15 + 1
            goto L_0x0133
        L_0x015e:
            if (r7 != r6) goto L_0x0161
            goto L_0x0191
        L_0x0161:
            java.util.List r4 = r13.subList(r7, r6)
            r4.clear()
            goto L_0x0191
        L_0x0169:
            java.util.Iterator r6 = r13.iterator()
        L_0x016d:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0191
            java.lang.Object r7 = r6.next()
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            boolean r9 = r4.a(r7)
            if (r9 != 0) goto L_0x016d
            if (r3 != 0) goto L_0x0189
            java.lang.Object r3 = r5.e()
        L_0x0189:
            long r9 = (long) r7
            r5.f(r3, r8, r9)
            r6.remove()
            goto L_0x016d
        L_0x0191:
            if (r3 != 0) goto L_0x0196
            r1 = r2
            goto L_0x04bb
        L_0x0196:
            k8.m8 r3 = (k8.m8) r3
            r1.zzc = r3
            return r2
        L_0x019b:
            if (r6 != r14) goto L_0x04ba
            int r1 = k8.j5.j(r3, r4, r7)
            int r4 = r7.f14681d
            if (r4 < 0) goto L_0x01f0
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x01eb
            if (r4 != 0) goto L_0x01b1
            k8.p5 r4 = k8.p5.f20407b
            r13.add(r4)
            goto L_0x01b9
        L_0x01b1:
            k8.p5 r6 = k8.p5.y(r3, r1, r4)
            r13.add(r6)
        L_0x01b8:
            int r1 = r1 + r4
        L_0x01b9:
            if (r1 >= r5) goto L_0x01ea
            int r4 = k8.j5.j(r3, r1, r7)
            int r6 = r7.f14681d
            if (r2 == r6) goto L_0x01c4
            goto L_0x01ea
        L_0x01c4:
            int r1 = k8.j5.j(r3, r4, r7)
            int r4 = r7.f14681d
            if (r4 < 0) goto L_0x01e5
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x01e0
            if (r4 != 0) goto L_0x01d8
            k8.p5 r4 = k8.p5.f20407b
            r13.add(r4)
            goto L_0x01b9
        L_0x01d8:
            k8.p5 r6 = k8.p5.y(r3, r1, r4)
            r13.add(r6)
            goto L_0x01b8
        L_0x01e0:
            k8.t6 r1 = k8.t6.d()
            throw r1
        L_0x01e5:
            k8.t6 r1 = k8.t6.b()
            throw r1
        L_0x01ea:
            return r1
        L_0x01eb:
            k8.t6 r1 = k8.t6.d()
            throw r1
        L_0x01f0:
            k8.t6 r1 = k8.t6.b()
            throw r1
        L_0x01f5:
            if (r6 == r14) goto L_0x01f9
            goto L_0x04ba
        L_0x01f9:
            k8.x7 r1 = r0.m(r9)
            r22 = r1
            r23 = r21
            r24 = r18
            r25 = r19
            r26 = r20
            r27 = r13
            r28 = r30
            int r1 = k8.j5.e(r22, r23, r24, r25, r26, r27, r28)
            return r1
        L_0x0210:
            if (r6 != r14) goto L_0x04ba
            r8 = 536870912(0x20000000, double:2.652494739E-315)
            long r8 = r25 & r8
            java.lang.String r1 = ""
            int r6 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r6 != 0) goto L_0x0263
            int r4 = k8.j5.j(r3, r4, r7)
            int r6 = r7.f14681d
            if (r6 < 0) goto L_0x025e
            if (r6 != 0) goto L_0x022b
            r13.add(r1)
            goto L_0x0236
        L_0x022b:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = k8.r6.f20450a
            r8.<init>(r3, r4, r6, r9)
            r13.add(r8)
        L_0x0235:
            int r4 = r4 + r6
        L_0x0236:
            if (r4 >= r5) goto L_0x04ba
            int r6 = k8.j5.j(r3, r4, r7)
            int r8 = r7.f14681d
            if (r2 != r8) goto L_0x04ba
            int r4 = k8.j5.j(r3, r6, r7)
            int r6 = r7.f14681d
            if (r6 < 0) goto L_0x0259
            if (r6 != 0) goto L_0x024e
            r13.add(r1)
            goto L_0x0236
        L_0x024e:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = k8.r6.f20450a
            r8.<init>(r3, r4, r6, r9)
            r13.add(r8)
            goto L_0x0235
        L_0x0259:
            k8.t6 r1 = k8.t6.b()
            throw r1
        L_0x025e:
            k8.t6 r1 = k8.t6.b()
            throw r1
        L_0x0263:
            int r4 = k8.j5.j(r3, r4, r7)
            int r6 = r7.f14681d
            if (r6 < 0) goto L_0x02be
            if (r6 != 0) goto L_0x0271
            r13.add(r1)
            goto L_0x0284
        L_0x0271:
            int r8 = r4 + r6
            boolean r9 = k8.v8.d(r3, r4, r8)
            if (r9 == 0) goto L_0x02b9
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = k8.r6.f20450a
            r9.<init>(r3, r4, r6, r10)
            r13.add(r9)
        L_0x0283:
            r4 = r8
        L_0x0284:
            if (r4 >= r5) goto L_0x04ba
            int r6 = k8.j5.j(r3, r4, r7)
            int r8 = r7.f14681d
            if (r2 != r8) goto L_0x04ba
            int r4 = k8.j5.j(r3, r6, r7)
            int r6 = r7.f14681d
            if (r6 < 0) goto L_0x02b4
            if (r6 != 0) goto L_0x029c
            r13.add(r1)
            goto L_0x0284
        L_0x029c:
            int r8 = r4 + r6
            boolean r9 = k8.v8.d(r3, r4, r8)
            if (r9 == 0) goto L_0x02af
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = k8.r6.f20450a
            r9.<init>(r3, r4, r6, r10)
            r13.add(r9)
            goto L_0x0283
        L_0x02af:
            k8.t6 r1 = k8.t6.a()
            throw r1
        L_0x02b4:
            k8.t6 r1 = k8.t6.b()
            throw r1
        L_0x02b9:
            k8.t6 r1 = k8.t6.a()
            throw r1
        L_0x02be:
            k8.t6 r1 = k8.t6.b()
            throw r1
        L_0x02c3:
            if (r6 != r14) goto L_0x02ea
            k8.k5 r13 = (k8.k5) r13
            int r1 = k8.j5.j(r3, r4, r7)
            int r2 = r7.f14681d
            int r2 = r2 + r1
        L_0x02ce:
            if (r1 >= r2) goto L_0x02e1
            int r1 = k8.j5.m(r3, r1, r7)
            long r4 = r7.f14678a
            int r6 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r6 == 0) goto L_0x02dc
            r4 = 1
            goto L_0x02dd
        L_0x02dc:
            r4 = 0
        L_0x02dd:
            r13.f(r4)
            goto L_0x02ce
        L_0x02e1:
            if (r1 != r2) goto L_0x02e5
            goto L_0x04bb
        L_0x02e5:
            k8.t6 r1 = k8.t6.d()
            throw r1
        L_0x02ea:
            if (r6 != 0) goto L_0x04ba
            k8.k5 r13 = (k8.k5) r13
            int r1 = k8.j5.m(r3, r4, r7)
            long r8 = r7.f14678a
            int r4 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r4 == 0) goto L_0x02fa
            r4 = 1
            goto L_0x02fb
        L_0x02fa:
            r4 = 0
        L_0x02fb:
            r13.f(r4)
        L_0x02fe:
            if (r1 >= r5) goto L_0x031a
            int r4 = k8.j5.j(r3, r1, r7)
            int r6 = r7.f14681d
            if (r2 == r6) goto L_0x0309
            goto L_0x031a
        L_0x0309:
            int r1 = k8.j5.m(r3, r4, r7)
            long r8 = r7.f14678a
            int r4 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r4 == 0) goto L_0x0315
            r4 = 1
            goto L_0x0316
        L_0x0315:
            r4 = 0
        L_0x0316:
            r13.f(r4)
            goto L_0x02fe
        L_0x031a:
            return r1
        L_0x031b:
            if (r6 != r14) goto L_0x033b
            k8.m6 r13 = (k8.m6) r13
            int r1 = k8.j5.j(r3, r4, r7)
            int r2 = r7.f14681d
            int r2 = r2 + r1
        L_0x0326:
            if (r1 >= r2) goto L_0x0332
            int r4 = k8.j5.b(r3, r1)
            r13.i(r4)
            int r1 = r1 + 4
            goto L_0x0326
        L_0x0332:
            if (r1 != r2) goto L_0x0336
            goto L_0x04bb
        L_0x0336:
            k8.t6 r1 = k8.t6.d()
            throw r1
        L_0x033b:
            if (r6 != r10) goto L_0x04ba
            k8.m6 r13 = (k8.m6) r13
            int r1 = k8.j5.b(r18, r19)
            r13.i(r1)
        L_0x0346:
            int r4 = r4 + 4
            if (r4 >= r5) goto L_0x035c
            int r1 = k8.j5.j(r3, r4, r7)
            int r6 = r7.f14681d
            if (r2 == r6) goto L_0x0353
            goto L_0x035c
        L_0x0353:
            int r4 = k8.j5.b(r3, r1)
            r13.i(r4)
            r4 = r1
            goto L_0x0346
        L_0x035c:
            return r4
        L_0x035d:
            if (r6 != r14) goto L_0x037d
            k8.b7 r13 = (k8.b7) r13
            int r1 = k8.j5.j(r3, r4, r7)
            int r2 = r7.f14681d
            int r2 = r2 + r1
        L_0x0368:
            if (r1 >= r2) goto L_0x0374
            long r4 = k8.j5.n(r3, r1)
            r13.i(r4)
            int r1 = r1 + 8
            goto L_0x0368
        L_0x0374:
            if (r1 != r2) goto L_0x0378
            goto L_0x04bb
        L_0x0378:
            k8.t6 r1 = k8.t6.d()
            throw r1
        L_0x037d:
            if (r6 != r15) goto L_0x04ba
            k8.b7 r13 = (k8.b7) r13
            long r8 = k8.j5.n(r18, r19)
            r13.i(r8)
        L_0x0388:
            int r4 = r4 + 8
            if (r4 >= r5) goto L_0x039e
            int r1 = k8.j5.j(r3, r4, r7)
            int r6 = r7.f14681d
            if (r2 == r6) goto L_0x0395
            goto L_0x039e
        L_0x0395:
            long r8 = k8.j5.n(r3, r1)
            r13.i(r8)
            r4 = r1
            goto L_0x0388
        L_0x039e:
            return r4
        L_0x039f:
            if (r6 != r14) goto L_0x03a7
            int r1 = k8.j5.f(r3, r4, r13, r7)
            goto L_0x04bb
        L_0x03a7:
            if (r6 == 0) goto L_0x03ab
            goto L_0x04ba
        L_0x03ab:
            r22 = r18
            r23 = r19
            r24 = r20
            r25 = r13
            r26 = r30
            int r1 = k8.j5.l(r21, r22, r23, r24, r25, r26)
            return r1
        L_0x03ba:
            if (r6 != r14) goto L_0x03da
            k8.b7 r13 = (k8.b7) r13
            int r1 = k8.j5.j(r3, r4, r7)
            int r2 = r7.f14681d
            int r2 = r2 + r1
        L_0x03c5:
            if (r1 >= r2) goto L_0x03d1
            int r1 = k8.j5.m(r3, r1, r7)
            long r4 = r7.f14678a
            r13.i(r4)
            goto L_0x03c5
        L_0x03d1:
            if (r1 != r2) goto L_0x03d5
            goto L_0x04bb
        L_0x03d5:
            k8.t6 r1 = k8.t6.d()
            throw r1
        L_0x03da:
            if (r6 != 0) goto L_0x04ba
            k8.b7 r13 = (k8.b7) r13
            int r1 = k8.j5.m(r3, r4, r7)
            long r8 = r7.f14678a
            r13.i(r8)
        L_0x03e7:
            if (r1 >= r5) goto L_0x03fc
            int r4 = k8.j5.j(r3, r1, r7)
            int r6 = r7.f14681d
            if (r2 == r6) goto L_0x03f2
            goto L_0x03fc
        L_0x03f2:
            int r1 = k8.j5.m(r3, r4, r7)
            long r8 = r7.f14678a
            r13.i(r8)
            goto L_0x03e7
        L_0x03fc:
            return r1
        L_0x03fd:
            if (r6 != r14) goto L_0x0421
            k8.e6 r13 = (k8.e6) r13
            int r1 = k8.j5.j(r3, r4, r7)
            int r2 = r7.f14681d
            int r2 = r2 + r1
        L_0x0408:
            if (r1 >= r2) goto L_0x0418
            int r4 = k8.j5.b(r3, r1)
            float r4 = java.lang.Float.intBitsToFloat(r4)
            r13.f(r4)
            int r1 = r1 + 4
            goto L_0x0408
        L_0x0418:
            if (r1 != r2) goto L_0x041c
            goto L_0x04bb
        L_0x041c:
            k8.t6 r1 = k8.t6.d()
            throw r1
        L_0x0421:
            if (r6 != r10) goto L_0x04ba
            k8.e6 r13 = (k8.e6) r13
            int r1 = k8.j5.b(r18, r19)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r13.f(r1)
        L_0x0430:
            int r4 = r4 + 4
            if (r4 >= r5) goto L_0x044a
            int r1 = k8.j5.j(r3, r4, r7)
            int r6 = r7.f14681d
            if (r2 == r6) goto L_0x043d
            goto L_0x044a
        L_0x043d:
            int r4 = k8.j5.b(r3, r1)
            float r4 = java.lang.Float.intBitsToFloat(r4)
            r13.f(r4)
            r4 = r1
            goto L_0x0430
        L_0x044a:
            return r4
        L_0x044b:
            if (r6 != r14) goto L_0x046e
            k8.v5 r13 = (k8.v5) r13
            int r1 = k8.j5.j(r3, r4, r7)
            int r2 = r7.f14681d
            int r2 = r2 + r1
        L_0x0456:
            if (r1 >= r2) goto L_0x0466
            long r4 = k8.j5.n(r3, r1)
            double r4 = java.lang.Double.longBitsToDouble(r4)
            r13.f(r4)
            int r1 = r1 + 8
            goto L_0x0456
        L_0x0466:
            if (r1 != r2) goto L_0x0469
            goto L_0x04bb
        L_0x0469:
            k8.t6 r1 = k8.t6.d()
            throw r1
        L_0x046e:
            if (r6 != r15) goto L_0x04ba
            k8.v5 r13 = (k8.v5) r13
            long r8 = k8.j5.n(r18, r19)
            double r8 = java.lang.Double.longBitsToDouble(r8)
            r13.f(r8)
        L_0x047d:
            int r4 = r4 + 8
            if (r4 >= r5) goto L_0x0497
            int r1 = k8.j5.j(r3, r4, r7)
            int r6 = r7.f14681d
            if (r2 == r6) goto L_0x048a
            goto L_0x0497
        L_0x048a:
            long r8 = k8.j5.n(r3, r1)
            double r8 = java.lang.Double.longBitsToDouble(r8)
            r13.f(r8)
            r4 = r1
            goto L_0x047d
        L_0x0497:
            return r4
        L_0x0498:
            if (r4 >= r5) goto L_0x04b9
            int r8 = k8.j5.j(r3, r4, r7)
            int r9 = r7.f14681d
            if (r2 == r9) goto L_0x04a3
            goto L_0x04b9
        L_0x04a3:
            r22 = r1
            r23 = r18
            r24 = r8
            r25 = r20
            r26 = r6
            r27 = r30
            int r4 = k8.j5.c(r22, r23, r24, r25, r26, r27)
            java.lang.Object r8 = r7.f14679b
            r13.add(r8)
            goto L_0x0498
        L_0x04b9:
            return r4
        L_0x04ba:
            r1 = r4
        L_0x04bb:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.p7.M(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, e8.ft):int");
    }

    public final int N(int i10) {
        return this.f20411a[i10 + 2];
    }

    public final int O(int i10, int i11) {
        int length = (this.f20411a.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int i14 = this.f20411a[i13];
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

    public final void a(T t10) {
        int i10;
        int i11 = this.f20419i;
        while (true) {
            i10 = this.f20420j;
            if (i11 >= i10) {
                break;
            }
            long j10 = (long) (j(this.f20418h[i11]) & 1048575);
            Object j11 = s8.j(t10, j10);
            if (j11 != null) {
                ((h7) j11).f20245a = false;
                s8.f20465c.s(t10, j10, j11);
            }
            i11++;
        }
        int length = this.f20418h.length;
        while (i10 < length) {
            this.f20421k.a(t10, (long) this.f20418h[i10]);
            i10++;
        }
        this.f20422l.g(t10);
        if (this.f20416f) {
            this.f20423m.b(t10);
        }
    }

    public final T b() {
        return ((k6) this.f20415e).r(4, (Object) null, (Object) null);
    }

    public final void c(T t10, T t11) {
        t11.getClass();
        for (int i10 = 0; i10 < this.f20411a.length; i10 += 3) {
            int j10 = j(i10);
            long j11 = (long) (1048575 & j10);
            int i11 = this.f20411a[i10];
            switch ((j10 >>> 20) & 255) {
                case 0:
                    if (!u(t11, i10)) {
                        break;
                    } else {
                        s8.m(t10, j11, s8.e(t11, j11));
                        r(t10, i10);
                        break;
                    }
                case 1:
                    if (!u(t11, i10)) {
                        break;
                    } else {
                        s8.f20465c.i(t10, j11, s8.f(t11, j11));
                        r(t10, i10);
                        break;
                    }
                case 2:
                    if (!u(t11, i10)) {
                        break;
                    } else {
                        s8.n(t10, j11, s8.h(t11, j11));
                        r(t10, i10);
                        break;
                    }
                case 3:
                    if (!u(t11, i10)) {
                        break;
                    } else {
                        s8.n(t10, j11, s8.h(t11, j11));
                        r(t10, i10);
                        break;
                    }
                case 4:
                    if (!u(t11, i10)) {
                        break;
                    } else {
                        s8.f20465c.q(t10, j11, s8.g(t11, j11));
                        r(t10, i10);
                        break;
                    }
                case 5:
                    if (!u(t11, i10)) {
                        break;
                    } else {
                        s8.n(t10, j11, s8.h(t11, j11));
                        r(t10, i10);
                        break;
                    }
                case 6:
                    if (!u(t11, i10)) {
                        break;
                    } else {
                        s8.f20465c.q(t10, j11, s8.g(t11, j11));
                        r(t10, i10);
                        break;
                    }
                case 7:
                    if (!u(t11, i10)) {
                        break;
                    } else {
                        s8.f20465c.f(t10, j11, s8.r(t11, j11));
                        r(t10, i10);
                        break;
                    }
                case b4.f10106f:
                    if (!u(t11, i10)) {
                        break;
                    } else {
                        s8.f20465c.s(t10, j11, s8.j(t11, j11));
                        r(t10, i10);
                        break;
                    }
                case 9:
                    p(t10, t11, i10);
                    break;
                case 10:
                    if (!u(t11, i10)) {
                        break;
                    } else {
                        s8.f20465c.s(t10, j11, s8.j(t11, j11));
                        r(t10, i10);
                        break;
                    }
                case 11:
                    if (!u(t11, i10)) {
                        break;
                    } else {
                        s8.f20465c.q(t10, j11, s8.g(t11, j11));
                        r(t10, i10);
                        break;
                    }
                case 12:
                    if (!u(t11, i10)) {
                        break;
                    } else {
                        s8.f20465c.q(t10, j11, s8.g(t11, j11));
                        r(t10, i10);
                        break;
                    }
                case 13:
                    if (!u(t11, i10)) {
                        break;
                    } else {
                        s8.f20465c.q(t10, j11, s8.g(t11, j11));
                        r(t10, i10);
                        break;
                    }
                case 14:
                    if (!u(t11, i10)) {
                        break;
                    } else {
                        s8.n(t10, j11, s8.h(t11, j11));
                        r(t10, i10);
                        break;
                    }
                case 15:
                    if (!u(t11, i10)) {
                        break;
                    } else {
                        s8.f20465c.q(t10, j11, s8.g(t11, j11));
                        r(t10, i10);
                        break;
                    }
                case 16:
                    if (!u(t11, i10)) {
                        break;
                    } else {
                        s8.n(t10, j11, s8.h(t11, j11));
                        r(t10, i10);
                        break;
                    }
                case 17:
                    p(t10, t11, i10);
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
                    this.f20421k.b(t10, t11, j11);
                    break;
                case 50:
                    Class<?> cls = z7.f20565a;
                    s8.f20465c.s(t10, j11, i7.b(s8.j(t10, j11), s8.j(t11, j11)));
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
                        s8.f20465c.s(t10, j11, s8.j(t11, j11));
                        s(t10, i11, i10);
                        break;
                    }
                case 60:
                    q(t10, t11, i10);
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
                        s8.f20465c.s(t10, j11, s8.j(t11, j11));
                        s(t10, i11, i10);
                        break;
                    }
                case 68:
                    q(t10, t11, i10);
                    break;
            }
        }
        l8<?, ?> l8Var = this.f20422l;
        Class<?> cls2 = z7.f20565a;
        l8Var.h(t10, l8Var.d(l8Var.c(t10), l8Var.c(t11)));
        if (this.f20416f) {
            this.f20423m.a(t11);
            throw null;
        }
    }

    public final boolean d(T t10) {
        int i10;
        int i11;
        T t11 = t10;
        int i12 = 1048575;
        int i13 = 0;
        int i14 = 0;
        while (i14 < this.f20419i) {
            int i15 = this.f20418h[i14];
            int i16 = this.f20411a[i15];
            int j10 = j(i15);
            int i17 = this.f20411a[i15 + 2];
            int i18 = i17 & 1048575;
            int i19 = 1 << (i17 >>> 20);
            if (i18 != i12) {
                if (i18 != 1048575) {
                    i13 = f20410o.getInt(t11, (long) i18);
                }
                i10 = i13;
                i11 = i18;
            } else {
                i11 = i12;
                i10 = i13;
            }
            if ((268435456 & j10) != 0 && !v(t10, i15, i11, i10, i19)) {
                return false;
            }
            int i20 = (j10 >>> 20) & 255;
            if (i20 != 9 && i20 != 17) {
                if (i20 != 27) {
                    if (i20 == 60 || i20 == 68) {
                        if (w(t11, i16, i15) && !m(i15).d(s8.j(t11, (long) (j10 & 1048575)))) {
                            return false;
                        }
                    } else if (i20 != 49) {
                        if (i20 == 50 && !((h7) s8.j(t11, (long) (j10 & 1048575))).isEmpty()) {
                            f7 f7Var = (f7) n(i15);
                            throw null;
                        }
                    }
                }
                List list = (List) s8.j(t11, (long) (j10 & 1048575));
                if (!list.isEmpty()) {
                    x7 m10 = m(i15);
                    for (int i21 = 0; i21 < list.size(); i21++) {
                        if (!m10.d(list.get(i21))) {
                            return false;
                        }
                    }
                    continue;
                } else {
                    continue;
                }
            } else if (v(t10, i15, i11, i10, i19) && !m(i15).d(s8.j(t11, (long) (j10 & 1048575)))) {
                return false;
            }
            i14++;
            i12 = i11;
            i13 = i10;
        }
        if (!this.f20416f) {
            return true;
        }
        this.f20423m.a(t11);
        throw null;
    }

    public final int e(T t10) {
        return this.f20417g ? H(t10) : G(t10);
    }

    public final void f(T t10, u5 u5Var) throws IOException {
        if (!this.f20417g) {
            y(t10, u5Var);
        } else if (!this.f20416f) {
            int length = this.f20411a.length;
            for (int i10 = 0; i10 < length; i10 += 3) {
                int j10 = j(i10);
                int[] iArr = this.f20411a;
                int i11 = iArr[i10];
                switch ((j10 >>> 20) & 255) {
                    case 0:
                        if (!u(t10, i10)) {
                            break;
                        } else {
                            u5Var.c(i11, s8.e(t10, (long) (j10 & 1048575)));
                            break;
                        }
                    case 1:
                        if (!u(t10, i10)) {
                            break;
                        } else {
                            u5Var.d(i11, s8.f(t10, (long) (j10 & 1048575)));
                            break;
                        }
                    case 2:
                        if (!u(t10, i10)) {
                            break;
                        } else {
                            u5Var.f20485a.t(i11, s8.h(t10, (long) (j10 & 1048575)));
                            break;
                        }
                    case 3:
                        if (!u(t10, i10)) {
                            break;
                        } else {
                            u5Var.f20485a.t(i11, s8.h(t10, (long) (j10 & 1048575)));
                            break;
                        }
                    case 4:
                        if (!u(t10, i10)) {
                            break;
                        } else {
                            u5Var.f20485a.l(i11, s8.g(t10, (long) (j10 & 1048575)));
                            break;
                        }
                    case 5:
                        if (!u(t10, i10)) {
                            break;
                        } else {
                            u5Var.f20485a.j(i11, s8.h(t10, (long) (j10 & 1048575)));
                            break;
                        }
                    case 6:
                        if (!u(t10, i10)) {
                            break;
                        } else {
                            u5Var.f20485a.g(i11, s8.g(t10, (long) (j10 & 1048575)));
                            break;
                        }
                    case 7:
                        if (!u(t10, i10)) {
                            break;
                        } else {
                            u5Var.f20485a.e(i11, s8.r(t10, (long) (j10 & 1048575)));
                            break;
                        }
                    case b4.f10106f:
                        if (!u(t10, i10)) {
                            break;
                        } else {
                            z(i11, s8.j(t10, (long) (j10 & 1048575)), u5Var);
                            break;
                        }
                    case 9:
                        if (!u(t10, i10)) {
                            break;
                        } else {
                            u5Var.f(i11, s8.j(t10, (long) (j10 & 1048575)), m(i10));
                            break;
                        }
                    case 10:
                        if (!u(t10, i10)) {
                            break;
                        } else {
                            u5Var.f20485a.f(i11, (p5) s8.j(t10, (long) (j10 & 1048575)));
                            break;
                        }
                    case 11:
                        if (!u(t10, i10)) {
                            break;
                        } else {
                            u5Var.f20485a.q(i11, s8.g(t10, (long) (j10 & 1048575)));
                            break;
                        }
                    case 12:
                        if (!u(t10, i10)) {
                            break;
                        } else {
                            u5Var.f20485a.l(i11, s8.g(t10, (long) (j10 & 1048575)));
                            break;
                        }
                    case 13:
                        if (!u(t10, i10)) {
                            break;
                        } else {
                            u5Var.f20485a.g(i11, s8.g(t10, (long) (j10 & 1048575)));
                            break;
                        }
                    case 14:
                        if (!u(t10, i10)) {
                            break;
                        } else {
                            u5Var.f20485a.j(i11, s8.h(t10, (long) (j10 & 1048575)));
                            break;
                        }
                    case 15:
                        if (!u(t10, i10)) {
                            break;
                        } else {
                            u5Var.a(i11, s8.g(t10, (long) (j10 & 1048575)));
                            break;
                        }
                    case 16:
                        if (!u(t10, i10)) {
                            break;
                        } else {
                            u5Var.b(i11, s8.h(t10, (long) (j10 & 1048575)));
                            break;
                        }
                    case 17:
                        if (!u(t10, i10)) {
                            break;
                        } else {
                            u5Var.e(i11, s8.j(t10, (long) (j10 & 1048575)), m(i10));
                            break;
                        }
                    case 18:
                        z7.d(iArr[i10], (List) s8.j(t10, (long) (j10 & 1048575)), u5Var, false);
                        break;
                    case 19:
                        z7.h(iArr[i10], (List) s8.j(t10, (long) (j10 & 1048575)), u5Var, false);
                        break;
                    case 20:
                        z7.k(iArr[i10], (List) s8.j(t10, (long) (j10 & 1048575)), u5Var, false);
                        break;
                    case 21:
                        z7.t(iArr[i10], (List) s8.j(t10, (long) (j10 & 1048575)), u5Var, false);
                        break;
                    case 22:
                        z7.j(iArr[i10], (List) s8.j(t10, (long) (j10 & 1048575)), u5Var, false);
                        break;
                    case 23:
                        z7.g(iArr[i10], (List) s8.j(t10, (long) (j10 & 1048575)), u5Var, false);
                        break;
                    case 24:
                        z7.f(iArr[i10], (List) s8.j(t10, (long) (j10 & 1048575)), u5Var, false);
                        break;
                    case 25:
                        z7.b(iArr[i10], (List) s8.j(t10, (long) (j10 & 1048575)), u5Var, false);
                        break;
                    case 26:
                        z7.q(iArr[i10], (List) s8.j(t10, (long) (j10 & 1048575)), u5Var);
                        break;
                    case 27:
                        z7.l(iArr[i10], (List) s8.j(t10, (long) (j10 & 1048575)), u5Var, m(i10));
                        break;
                    case 28:
                        z7.c(iArr[i10], (List) s8.j(t10, (long) (j10 & 1048575)), u5Var);
                        break;
                    case 29:
                        z7.r(iArr[i10], (List) s8.j(t10, (long) (j10 & 1048575)), u5Var, false);
                        break;
                    case 30:
                        z7.e(iArr[i10], (List) s8.j(t10, (long) (j10 & 1048575)), u5Var, false);
                        break;
                    case 31:
                        z7.m(iArr[i10], (List) s8.j(t10, (long) (j10 & 1048575)), u5Var, false);
                        break;
                    case 32:
                        z7.n(iArr[i10], (List) s8.j(t10, (long) (j10 & 1048575)), u5Var, false);
                        break;
                    case 33:
                        z7.o(iArr[i10], (List) s8.j(t10, (long) (j10 & 1048575)), u5Var, false);
                        break;
                    case 34:
                        z7.p(iArr[i10], (List) s8.j(t10, (long) (j10 & 1048575)), u5Var, false);
                        break;
                    case 35:
                        z7.d(iArr[i10], (List) s8.j(t10, (long) (j10 & 1048575)), u5Var, true);
                        break;
                    case 36:
                        z7.h(iArr[i10], (List) s8.j(t10, (long) (j10 & 1048575)), u5Var, true);
                        break;
                    case 37:
                        z7.k(iArr[i10], (List) s8.j(t10, (long) (j10 & 1048575)), u5Var, true);
                        break;
                    case 38:
                        z7.t(iArr[i10], (List) s8.j(t10, (long) (j10 & 1048575)), u5Var, true);
                        break;
                    case 39:
                        z7.j(iArr[i10], (List) s8.j(t10, (long) (j10 & 1048575)), u5Var, true);
                        break;
                    case 40:
                        z7.g(iArr[i10], (List) s8.j(t10, (long) (j10 & 1048575)), u5Var, true);
                        break;
                    case 41:
                        z7.f(iArr[i10], (List) s8.j(t10, (long) (j10 & 1048575)), u5Var, true);
                        break;
                    case 42:
                        z7.b(iArr[i10], (List) s8.j(t10, (long) (j10 & 1048575)), u5Var, true);
                        break;
                    case 43:
                        z7.r(iArr[i10], (List) s8.j(t10, (long) (j10 & 1048575)), u5Var, true);
                        break;
                    case 44:
                        z7.e(iArr[i10], (List) s8.j(t10, (long) (j10 & 1048575)), u5Var, true);
                        break;
                    case 45:
                        z7.m(iArr[i10], (List) s8.j(t10, (long) (j10 & 1048575)), u5Var, true);
                        break;
                    case 46:
                        z7.n(iArr[i10], (List) s8.j(t10, (long) (j10 & 1048575)), u5Var, true);
                        break;
                    case 47:
                        z7.o(iArr[i10], (List) s8.j(t10, (long) (j10 & 1048575)), u5Var, true);
                        break;
                    case 48:
                        z7.p(iArr[i10], (List) s8.j(t10, (long) (j10 & 1048575)), u5Var, true);
                        break;
                    case 49:
                        z7.i(iArr[i10], (List) s8.j(t10, (long) (j10 & 1048575)), u5Var, m(i10));
                        break;
                    case 50:
                        if (s8.j(t10, (long) (j10 & 1048575)) == null) {
                            break;
                        } else {
                            f7 f7Var = (f7) n(i10);
                            throw null;
                        }
                    case 51:
                        if (!w(t10, i11, i10)) {
                            break;
                        } else {
                            u5Var.c(i11, E(t10, (long) (j10 & 1048575)));
                            break;
                        }
                    case ModuleDescriptor.MODULE_VERSION:
                        if (!w(t10, i11, i10)) {
                            break;
                        } else {
                            u5Var.d(i11, F(t10, (long) (j10 & 1048575)));
                            break;
                        }
                    case 53:
                        if (!w(t10, i11, i10)) {
                            break;
                        } else {
                            u5Var.f20485a.t(i11, k(t10, (long) (j10 & 1048575)));
                            break;
                        }
                    case 54:
                        if (!w(t10, i11, i10)) {
                            break;
                        } else {
                            u5Var.f20485a.t(i11, k(t10, (long) (j10 & 1048575)));
                            break;
                        }
                    case 55:
                        if (!w(t10, i11, i10)) {
                            break;
                        } else {
                            u5Var.f20485a.l(i11, I(t10, (long) (j10 & 1048575)));
                            break;
                        }
                    case 56:
                        if (!w(t10, i11, i10)) {
                            break;
                        } else {
                            u5Var.f20485a.j(i11, k(t10, (long) (j10 & 1048575)));
                            break;
                        }
                    case 57:
                        if (!w(t10, i11, i10)) {
                            break;
                        } else {
                            u5Var.f20485a.g(i11, I(t10, (long) (j10 & 1048575)));
                            break;
                        }
                    case 58:
                        if (!w(t10, i11, i10)) {
                            break;
                        } else {
                            u5Var.f20485a.e(i11, x(t10, (long) (j10 & 1048575)));
                            break;
                        }
                    case 59:
                        if (!w(t10, i11, i10)) {
                            break;
                        } else {
                            z(i11, s8.j(t10, (long) (j10 & 1048575)), u5Var);
                            break;
                        }
                    case 60:
                        if (!w(t10, i11, i10)) {
                            break;
                        } else {
                            u5Var.f(i11, s8.j(t10, (long) (j10 & 1048575)), m(i10));
                            break;
                        }
                    case 61:
                        if (!w(t10, i11, i10)) {
                            break;
                        } else {
                            u5Var.f20485a.f(i11, (p5) s8.j(t10, (long) (j10 & 1048575)));
                            break;
                        }
                    case 62:
                        if (!w(t10, i11, i10)) {
                            break;
                        } else {
                            u5Var.f20485a.q(i11, I(t10, (long) (j10 & 1048575)));
                            break;
                        }
                    case 63:
                        if (!w(t10, i11, i10)) {
                            break;
                        } else {
                            u5Var.f20485a.l(i11, I(t10, (long) (j10 & 1048575)));
                            break;
                        }
                    case 64:
                        if (!w(t10, i11, i10)) {
                            break;
                        } else {
                            u5Var.f20485a.g(i11, I(t10, (long) (j10 & 1048575)));
                            break;
                        }
                    case 65:
                        if (!w(t10, i11, i10)) {
                            break;
                        } else {
                            u5Var.f20485a.j(i11, k(t10, (long) (j10 & 1048575)));
                            break;
                        }
                    case 66:
                        if (!w(t10, i11, i10)) {
                            break;
                        } else {
                            u5Var.a(i11, I(t10, (long) (j10 & 1048575)));
                            break;
                        }
                    case 67:
                        if (!w(t10, i11, i10)) {
                            break;
                        } else {
                            u5Var.b(i11, k(t10, (long) (j10 & 1048575)));
                            break;
                        }
                    case 68:
                        if (!w(t10, i11, i10)) {
                            break;
                        } else {
                            u5Var.e(i11, s8.j(t10, (long) (j10 & 1048575)), m(i10));
                            break;
                        }
                }
            }
            l8<?, ?> l8Var = this.f20422l;
            l8Var.i(l8Var.c(t10), u5Var);
        } else {
            this.f20423m.a(t10);
            throw null;
        }
    }

    public final boolean g(T t10, T t11) {
        boolean z10;
        int length = this.f20411a.length;
        for (int i10 = 0; i10 < length; i10 += 3) {
            int j10 = j(i10);
            long j11 = (long) (j10 & 1048575);
            switch ((j10 >>> 20) & 255) {
                case 0:
                    if (t(t10, t11, i10) && Double.doubleToLongBits(s8.e(t10, j11)) == Double.doubleToLongBits(s8.e(t11, j11))) {
                        continue;
                    }
                case 1:
                    if (t(t10, t11, i10) && Float.floatToIntBits(s8.f(t10, j11)) == Float.floatToIntBits(s8.f(t11, j11))) {
                        continue;
                    }
                case 2:
                    if (t(t10, t11, i10) && s8.h(t10, j11) == s8.h(t11, j11)) {
                        continue;
                    }
                case 3:
                    if (t(t10, t11, i10) && s8.h(t10, j11) == s8.h(t11, j11)) {
                        continue;
                    }
                case 4:
                    if (t(t10, t11, i10) && s8.g(t10, j11) == s8.g(t11, j11)) {
                        continue;
                    }
                case 5:
                    if (t(t10, t11, i10) && s8.h(t10, j11) == s8.h(t11, j11)) {
                        continue;
                    }
                case 6:
                    if (t(t10, t11, i10) && s8.g(t10, j11) == s8.g(t11, j11)) {
                        continue;
                    }
                case 7:
                    if (t(t10, t11, i10) && s8.r(t10, j11) == s8.r(t11, j11)) {
                        continue;
                    }
                case b4.f10106f:
                    if (t(t10, t11, i10) && z7.a(s8.j(t10, j11), s8.j(t11, j11))) {
                        continue;
                    }
                case 9:
                    if (t(t10, t11, i10) && z7.a(s8.j(t10, j11), s8.j(t11, j11))) {
                        continue;
                    }
                case 10:
                    if (t(t10, t11, i10) && z7.a(s8.j(t10, j11), s8.j(t11, j11))) {
                        continue;
                    }
                case 11:
                    if (t(t10, t11, i10) && s8.g(t10, j11) == s8.g(t11, j11)) {
                        continue;
                    }
                case 12:
                    if (t(t10, t11, i10) && s8.g(t10, j11) == s8.g(t11, j11)) {
                        continue;
                    }
                case 13:
                    if (t(t10, t11, i10) && s8.g(t10, j11) == s8.g(t11, j11)) {
                        continue;
                    }
                case 14:
                    if (t(t10, t11, i10) && s8.h(t10, j11) == s8.h(t11, j11)) {
                        continue;
                    }
                case 15:
                    if (t(t10, t11, i10) && s8.g(t10, j11) == s8.g(t11, j11)) {
                        continue;
                    }
                case 16:
                    if (t(t10, t11, i10) && s8.h(t10, j11) == s8.h(t11, j11)) {
                        continue;
                    }
                case 17:
                    if (t(t10, t11, i10) && z7.a(s8.j(t10, j11), s8.j(t11, j11))) {
                        continue;
                    }
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
                    z10 = z7.a(s8.j(t10, j11), s8.j(t11, j11));
                    break;
                case 50:
                    z10 = z7.a(s8.j(t10, j11), s8.j(t11, j11));
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
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long N = (long) (N(i10) & 1048575);
                    if (s8.g(t10, N) == s8.g(t11, N) && z7.a(s8.j(t10, j11), s8.j(t11, j11))) {
                        continue;
                    }
            }
            if (!z10) {
                return false;
            }
        }
        if (!this.f20422l.c(t10).equals(this.f20422l.c(t11))) {
            return false;
        }
        if (!this.f20416f) {
            return true;
        }
        this.f20423m.a(t10);
        this.f20423m.a(t11);
        throw null;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01c2, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0226, code lost:
        r2 = r3 + r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0228, code lost:
        r1 = r1 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int h(T r9) {
        /*
            r8 = this;
            int[] r0 = r8.f20411a
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            if (r1 >= r0) goto L_0x022c
            int r3 = r8.j(r1)
            int[] r4 = r8.f20411a
            r4 = r4[r1]
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r3
            long r5 = (long) r5
            int r3 = r3 >>> 20
            r3 = r3 & 255(0xff, float:3.57E-43)
            r7 = 37
            switch(r3) {
                case 0: goto L_0x0218;
                case 1: goto L_0x020d;
                case 2: goto L_0x0202;
                case 3: goto L_0x01f7;
                case 4: goto L_0x01f0;
                case 5: goto L_0x01e5;
                case 6: goto L_0x01de;
                case 7: goto L_0x01d3;
                case 8: goto L_0x01c6;
                case 9: goto L_0x01b8;
                case 10: goto L_0x01ac;
                case 11: goto L_0x01a4;
                case 12: goto L_0x019c;
                case 13: goto L_0x0194;
                case 14: goto L_0x0188;
                case 15: goto L_0x0180;
                case 16: goto L_0x0174;
                case 17: goto L_0x0169;
                case 18: goto L_0x015d;
                case 19: goto L_0x015d;
                case 20: goto L_0x015d;
                case 21: goto L_0x015d;
                case 22: goto L_0x015d;
                case 23: goto L_0x015d;
                case 24: goto L_0x015d;
                case 25: goto L_0x015d;
                case 26: goto L_0x015d;
                case 27: goto L_0x015d;
                case 28: goto L_0x015d;
                case 29: goto L_0x015d;
                case 30: goto L_0x015d;
                case 31: goto L_0x015d;
                case 32: goto L_0x015d;
                case 33: goto L_0x015d;
                case 34: goto L_0x015d;
                case 35: goto L_0x015d;
                case 36: goto L_0x015d;
                case 37: goto L_0x015d;
                case 38: goto L_0x015d;
                case 39: goto L_0x015d;
                case 40: goto L_0x015d;
                case 41: goto L_0x015d;
                case 42: goto L_0x015d;
                case 43: goto L_0x015d;
                case 44: goto L_0x015d;
                case 45: goto L_0x015d;
                case 46: goto L_0x015d;
                case 47: goto L_0x015d;
                case 48: goto L_0x015d;
                case 49: goto L_0x015d;
                case 50: goto L_0x0151;
                case 51: goto L_0x013b;
                case 52: goto L_0x0129;
                case 53: goto L_0x0117;
                case 54: goto L_0x0105;
                case 55: goto L_0x00f7;
                case 56: goto L_0x00e5;
                case 57: goto L_0x00d7;
                case 58: goto L_0x00c5;
                case 59: goto L_0x00b1;
                case 60: goto L_0x009f;
                case 61: goto L_0x008d;
                case 62: goto L_0x007f;
                case 63: goto L_0x0071;
                case 64: goto L_0x0063;
                case 65: goto L_0x0051;
                case 66: goto L_0x0043;
                case 67: goto L_0x0031;
                case 68: goto L_0x001f;
                default: goto L_0x001d;
            }
        L_0x001d:
            goto L_0x0228
        L_0x001f:
            boolean r3 = r8.w(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            java.lang.Object r3 = k8.s8.j(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x0031:
            boolean r3 = r8.w(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            long r3 = k(r9, r5)
            int r3 = k8.r6.b(r3)
            goto L_0x0226
        L_0x0043:
            boolean r3 = r8.w(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            int r3 = I(r9, r5)
            goto L_0x0226
        L_0x0051:
            boolean r3 = r8.w(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            long r3 = k(r9, r5)
            int r3 = k8.r6.b(r3)
            goto L_0x0226
        L_0x0063:
            boolean r3 = r8.w(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            int r3 = I(r9, r5)
            goto L_0x0226
        L_0x0071:
            boolean r3 = r8.w(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            int r3 = I(r9, r5)
            goto L_0x0226
        L_0x007f:
            boolean r3 = r8.w(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            int r3 = I(r9, r5)
            goto L_0x0226
        L_0x008d:
            boolean r3 = r8.w(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            java.lang.Object r3 = k8.s8.j(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x009f:
            boolean r3 = r8.w(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            java.lang.Object r3 = k8.s8.j(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x00b1:
            boolean r3 = r8.w(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            java.lang.Object r3 = k8.s8.j(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x00c5:
            boolean r3 = r8.w(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            boolean r3 = x(r9, r5)
            int r3 = k8.r6.a(r3)
            goto L_0x0226
        L_0x00d7:
            boolean r3 = r8.w(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            int r3 = I(r9, r5)
            goto L_0x0226
        L_0x00e5:
            boolean r3 = r8.w(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            long r3 = k(r9, r5)
            int r3 = k8.r6.b(r3)
            goto L_0x0226
        L_0x00f7:
            boolean r3 = r8.w(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            int r3 = I(r9, r5)
            goto L_0x0226
        L_0x0105:
            boolean r3 = r8.w(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            long r3 = k(r9, r5)
            int r3 = k8.r6.b(r3)
            goto L_0x0226
        L_0x0117:
            boolean r3 = r8.w(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            long r3 = k(r9, r5)
            int r3 = k8.r6.b(r3)
            goto L_0x0226
        L_0x0129:
            boolean r3 = r8.w(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            float r3 = F(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0226
        L_0x013b:
            boolean r3 = r8.w(r9, r4, r1)
            if (r3 == 0) goto L_0x0228
            int r2 = r2 * 53
            double r3 = E(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = k8.r6.b(r3)
            goto L_0x0226
        L_0x0151:
            int r2 = r2 * 53
            java.lang.Object r3 = k8.s8.j(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x015d:
            int r2 = r2 * 53
            java.lang.Object r3 = k8.s8.j(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x0169:
            java.lang.Object r3 = k8.s8.j(r9, r5)
            if (r3 == 0) goto L_0x01c2
            int r7 = r3.hashCode()
            goto L_0x01c2
        L_0x0174:
            int r2 = r2 * 53
            long r3 = k8.s8.h(r9, r5)
            int r3 = k8.r6.b(r3)
            goto L_0x0226
        L_0x0180:
            int r2 = r2 * 53
            int r3 = k8.s8.g(r9, r5)
            goto L_0x0226
        L_0x0188:
            int r2 = r2 * 53
            long r3 = k8.s8.h(r9, r5)
            int r3 = k8.r6.b(r3)
            goto L_0x0226
        L_0x0194:
            int r2 = r2 * 53
            int r3 = k8.s8.g(r9, r5)
            goto L_0x0226
        L_0x019c:
            int r2 = r2 * 53
            int r3 = k8.s8.g(r9, r5)
            goto L_0x0226
        L_0x01a4:
            int r2 = r2 * 53
            int r3 = k8.s8.g(r9, r5)
            goto L_0x0226
        L_0x01ac:
            int r2 = r2 * 53
            java.lang.Object r3 = k8.s8.j(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x01b8:
            java.lang.Object r3 = k8.s8.j(r9, r5)
            if (r3 == 0) goto L_0x01c2
            int r7 = r3.hashCode()
        L_0x01c2:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x0228
        L_0x01c6:
            int r2 = r2 * 53
            java.lang.Object r3 = k8.s8.j(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0226
        L_0x01d3:
            int r2 = r2 * 53
            boolean r3 = k8.s8.r(r9, r5)
            int r3 = k8.r6.a(r3)
            goto L_0x0226
        L_0x01de:
            int r2 = r2 * 53
            int r3 = k8.s8.g(r9, r5)
            goto L_0x0226
        L_0x01e5:
            int r2 = r2 * 53
            long r3 = k8.s8.h(r9, r5)
            int r3 = k8.r6.b(r3)
            goto L_0x0226
        L_0x01f0:
            int r2 = r2 * 53
            int r3 = k8.s8.g(r9, r5)
            goto L_0x0226
        L_0x01f7:
            int r2 = r2 * 53
            long r3 = k8.s8.h(r9, r5)
            int r3 = k8.r6.b(r3)
            goto L_0x0226
        L_0x0202:
            int r2 = r2 * 53
            long r3 = k8.s8.h(r9, r5)
            int r3 = k8.r6.b(r3)
            goto L_0x0226
        L_0x020d:
            int r2 = r2 * 53
            float r3 = k8.s8.f(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0226
        L_0x0218:
            int r2 = r2 * 53
            double r3 = k8.s8.e(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = k8.r6.b(r3)
        L_0x0226:
            int r3 = r3 + r2
            r2 = r3
        L_0x0228:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x022c:
            int r2 = r2 * 53
            k8.l8<?, ?> r0 = r8.f20422l
            java.lang.Object r0 = r0.c(r9)
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            boolean r1 = r8.f20416f
            if (r1 != 0) goto L_0x023e
            return r0
        L_0x023e:
            k8.y5<?> r0 = r8.f20423m
            r0.a(r9)
            r9 = 0
            goto L_0x0246
        L_0x0245:
            throw r9
        L_0x0246:
            goto L_0x0245
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.p7.h(java.lang.Object):int");
    }

    public final void i(T t10, byte[] bArr, int i10, int i11, ft ftVar) throws IOException {
        if (this.f20417g) {
            L(t10, bArr, i10, i11, ftVar);
        } else {
            A(t10, bArr, i10, i11, 0, ftVar);
        }
    }

    public final int j(int i10) {
        return this.f20411a[i10 + 1];
    }

    public final n6 l(int i10) {
        int i11 = i10 / 3;
        return (n6) this.f20412b[i11 + i11 + 1];
    }

    public final x7 m(int i10) {
        int i11 = i10 / 3;
        int i12 = i11 + i11;
        Object[] objArr = this.f20412b;
        x7 x7Var = (x7) objArr[i12];
        if (x7Var != null) {
            return x7Var;
        }
        x7 a10 = u7.f20499c.a((Class) objArr[i12 + 1]);
        this.f20412b[i12] = a10;
        return a10;
    }

    public final Object n(int i10) {
        int i11 = i10 / 3;
        return this.f20412b[i11 + i11];
    }

    public final void p(T t10, T t11, int i10) {
        long j10 = (long) (this.f20411a[i10 + 1] & 1048575);
        if (u(t11, i10)) {
            Object j11 = s8.j(t10, j10);
            Object j12 = s8.j(t11, j10);
            if (j11 != null && j12 != null) {
                s8.f20465c.s(t10, j10, r6.c(j11, j12));
                r(t10, i10);
            } else if (j12 != null) {
                s8.f20465c.s(t10, j10, j12);
                r(t10, i10);
            }
        }
    }

    public final void q(T t10, T t11, int i10) {
        int[] iArr = this.f20411a;
        int i11 = iArr[i10 + 1];
        int i12 = iArr[i10];
        long j10 = (long) (i11 & 1048575);
        if (w(t11, i12, i10)) {
            Object j11 = w(t10, i12, i10) ? s8.j(t10, j10) : null;
            Object j12 = s8.j(t11, j10);
            if (j11 != null && j12 != null) {
                s8.f20465c.s(t10, j10, r6.c(j11, j12));
                s(t10, i12, i10);
            } else if (j12 != null) {
                s8.f20465c.s(t10, j10, j12);
                s(t10, i12, i10);
            }
        }
    }

    public final void r(T t10, int i10) {
        int i11 = this.f20411a[i10 + 2];
        long j10 = (long) (1048575 & i11);
        if (j10 != 1048575) {
            s8.f20465c.q(t10, j10, (1 << (i11 >>> 20)) | s8.g(t10, j10));
        }
    }

    public final void s(T t10, int i10, int i11) {
        s8.f20465c.q(t10, (long) (this.f20411a[i11 + 2] & 1048575), i10);
    }

    public final boolean t(T t10, T t11, int i10) {
        return u(t10, i10) == u(t11, i10);
    }

    public final boolean u(T t10, int i10) {
        int[] iArr = this.f20411a;
        int i11 = iArr[i10 + 2];
        long j10 = (long) (i11 & 1048575);
        if (j10 != 1048575) {
            return (s8.g(t10, j10) & (1 << (i11 >>> 20))) != 0;
        }
        int i12 = iArr[i10 + 1];
        long j11 = (long) (i12 & 1048575);
        switch ((i12 >>> 20) & 255) {
            case 0:
                return s8.e(t10, j11) != 0.0d;
            case 1:
                return s8.f(t10, j11) != 0.0f;
            case 2:
                return s8.h(t10, j11) != 0;
            case 3:
                return s8.h(t10, j11) != 0;
            case 4:
                return s8.g(t10, j11) != 0;
            case 5:
                return s8.h(t10, j11) != 0;
            case 6:
                return s8.g(t10, j11) != 0;
            case 7:
                return s8.r(t10, j11);
            case b4.f10106f:
                Object j12 = s8.j(t10, j11);
                if (j12 instanceof String) {
                    return !((String) j12).isEmpty();
                }
                if (j12 instanceof p5) {
                    return !p5.f20407b.equals(j12);
                }
                throw new IllegalArgumentException();
            case 9:
                return s8.j(t10, j11) != null;
            case 10:
                return !p5.f20407b.equals(s8.j(t10, j11));
            case 11:
                return s8.g(t10, j11) != 0;
            case 12:
                return s8.g(t10, j11) != 0;
            case 13:
                return s8.g(t10, j11) != 0;
            case 14:
                return s8.h(t10, j11) != 0;
            case 15:
                return s8.g(t10, j11) != 0;
            case 16:
                return s8.h(t10, j11) != 0;
            case 17:
                return s8.j(t10, j11) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final boolean v(T t10, int i10, int i11, int i12, int i13) {
        if (i11 == 1048575) {
            return u(t10, i10);
        }
        return (i12 & i13) != 0;
    }

    public final boolean w(T t10, int i10, int i11) {
        return s8.g(t10, (long) (this.f20411a[i11 + 2] & 1048575)) == i10;
    }

    public final void y(T t10, u5 u5Var) throws IOException {
        int i10;
        T t11 = t10;
        u5 u5Var2 = u5Var;
        if (!this.f20416f) {
            int length = this.f20411a.length;
            Unsafe unsafe = f20410o;
            int i11 = 1048575;
            int i12 = 0;
            int i13 = 1048575;
            int i14 = 0;
            while (i12 < length) {
                int j10 = j(i12);
                int[] iArr = this.f20411a;
                int i15 = iArr[i12];
                int i16 = (j10 >>> 20) & 255;
                if (i16 <= 17) {
                    int i17 = iArr[i12 + 2];
                    int i18 = i17 & i11;
                    if (i18 != i13) {
                        i14 = unsafe.getInt(t11, (long) i18);
                        i13 = i18;
                    }
                    i10 = 1 << (i17 >>> 20);
                } else {
                    i10 = 0;
                }
                long j11 = (long) (j10 & i11);
                switch (i16) {
                    case 0:
                        if ((i14 & i10) == 0) {
                            break;
                        } else {
                            u5Var2.c(i15, s8.e(t11, j11));
                            continue;
                        }
                    case 1:
                        if ((i14 & i10) != 0) {
                            u5Var2.d(i15, s8.f(t11, j11));
                            break;
                        } else {
                            continue;
                        }
                    case 2:
                        if ((i14 & i10) != 0) {
                            u5Var2.f20485a.t(i15, unsafe.getLong(t11, j11));
                            break;
                        } else {
                            continue;
                        }
                    case 3:
                        if ((i14 & i10) != 0) {
                            u5Var2.f20485a.t(i15, unsafe.getLong(t11, j11));
                            break;
                        } else {
                            continue;
                        }
                    case 4:
                        if ((i14 & i10) != 0) {
                            u5Var2.f20485a.l(i15, unsafe.getInt(t11, j11));
                            break;
                        } else {
                            continue;
                        }
                    case 5:
                        if ((i14 & i10) != 0) {
                            u5Var2.f20485a.j(i15, unsafe.getLong(t11, j11));
                            break;
                        } else {
                            continue;
                        }
                    case 6:
                        if ((i14 & i10) != 0) {
                            u5Var2.f20485a.g(i15, unsafe.getInt(t11, j11));
                            break;
                        } else {
                            continue;
                        }
                    case 7:
                        if ((i14 & i10) != 0) {
                            u5Var2.f20485a.e(i15, s8.r(t11, j11));
                            break;
                        } else {
                            continue;
                        }
                    case b4.f10106f:
                        if ((i14 & i10) != 0) {
                            z(i15, unsafe.getObject(t11, j11), u5Var2);
                            break;
                        } else {
                            continue;
                        }
                    case 9:
                        if ((i14 & i10) != 0) {
                            u5Var2.f(i15, unsafe.getObject(t11, j11), m(i12));
                            break;
                        } else {
                            continue;
                        }
                    case 10:
                        if ((i14 & i10) != 0) {
                            u5Var2.f20485a.f(i15, (p5) unsafe.getObject(t11, j11));
                            break;
                        } else {
                            continue;
                        }
                    case 11:
                        if ((i14 & i10) != 0) {
                            u5Var2.f20485a.q(i15, unsafe.getInt(t11, j11));
                            break;
                        } else {
                            continue;
                        }
                    case 12:
                        if ((i14 & i10) != 0) {
                            u5Var2.f20485a.l(i15, unsafe.getInt(t11, j11));
                            break;
                        } else {
                            continue;
                        }
                    case 13:
                        if ((i14 & i10) != 0) {
                            u5Var2.f20485a.g(i15, unsafe.getInt(t11, j11));
                            break;
                        } else {
                            continue;
                        }
                    case 14:
                        if ((i14 & i10) != 0) {
                            u5Var2.f20485a.j(i15, unsafe.getLong(t11, j11));
                            break;
                        } else {
                            continue;
                        }
                    case 15:
                        if ((i14 & i10) != 0) {
                            u5Var2.a(i15, unsafe.getInt(t11, j11));
                            break;
                        } else {
                            continue;
                        }
                    case 16:
                        if ((i14 & i10) != 0) {
                            u5Var2.b(i15, unsafe.getLong(t11, j11));
                            break;
                        } else {
                            continue;
                        }
                    case 17:
                        if ((i14 & i10) != 0) {
                            u5Var2.e(i15, unsafe.getObject(t11, j11), m(i12));
                            break;
                        } else {
                            continue;
                        }
                    case 18:
                        z7.d(this.f20411a[i12], (List) unsafe.getObject(t11, j11), u5Var2, false);
                        continue;
                    case 19:
                        z7.h(this.f20411a[i12], (List) unsafe.getObject(t11, j11), u5Var2, false);
                        continue;
                    case 20:
                        z7.k(this.f20411a[i12], (List) unsafe.getObject(t11, j11), u5Var2, false);
                        continue;
                    case 21:
                        z7.t(this.f20411a[i12], (List) unsafe.getObject(t11, j11), u5Var2, false);
                        continue;
                    case 22:
                        z7.j(this.f20411a[i12], (List) unsafe.getObject(t11, j11), u5Var2, false);
                        continue;
                    case 23:
                        z7.g(this.f20411a[i12], (List) unsafe.getObject(t11, j11), u5Var2, false);
                        continue;
                    case 24:
                        z7.f(this.f20411a[i12], (List) unsafe.getObject(t11, j11), u5Var2, false);
                        continue;
                    case 25:
                        z7.b(this.f20411a[i12], (List) unsafe.getObject(t11, j11), u5Var2, false);
                        continue;
                    case 26:
                        z7.q(this.f20411a[i12], (List) unsafe.getObject(t11, j11), u5Var2);
                        break;
                    case 27:
                        z7.l(this.f20411a[i12], (List) unsafe.getObject(t11, j11), u5Var2, m(i12));
                        break;
                    case 28:
                        z7.c(this.f20411a[i12], (List) unsafe.getObject(t11, j11), u5Var2);
                        break;
                    case 29:
                        z7.r(this.f20411a[i12], (List) unsafe.getObject(t11, j11), u5Var2, false);
                        break;
                    case 30:
                        z7.e(this.f20411a[i12], (List) unsafe.getObject(t11, j11), u5Var2, false);
                        break;
                    case 31:
                        z7.m(this.f20411a[i12], (List) unsafe.getObject(t11, j11), u5Var2, false);
                        break;
                    case 32:
                        z7.n(this.f20411a[i12], (List) unsafe.getObject(t11, j11), u5Var2, false);
                        break;
                    case 33:
                        z7.o(this.f20411a[i12], (List) unsafe.getObject(t11, j11), u5Var2, false);
                        break;
                    case 34:
                        z7.p(this.f20411a[i12], (List) unsafe.getObject(t11, j11), u5Var2, false);
                        break;
                    case 35:
                        z7.d(this.f20411a[i12], (List) unsafe.getObject(t11, j11), u5Var2, true);
                        break;
                    case 36:
                        z7.h(this.f20411a[i12], (List) unsafe.getObject(t11, j11), u5Var2, true);
                        break;
                    case 37:
                        z7.k(this.f20411a[i12], (List) unsafe.getObject(t11, j11), u5Var2, true);
                        break;
                    case 38:
                        z7.t(this.f20411a[i12], (List) unsafe.getObject(t11, j11), u5Var2, true);
                        break;
                    case 39:
                        z7.j(this.f20411a[i12], (List) unsafe.getObject(t11, j11), u5Var2, true);
                        break;
                    case 40:
                        z7.g(this.f20411a[i12], (List) unsafe.getObject(t11, j11), u5Var2, true);
                        break;
                    case 41:
                        z7.f(this.f20411a[i12], (List) unsafe.getObject(t11, j11), u5Var2, true);
                        break;
                    case 42:
                        z7.b(this.f20411a[i12], (List) unsafe.getObject(t11, j11), u5Var2, true);
                        break;
                    case 43:
                        z7.r(this.f20411a[i12], (List) unsafe.getObject(t11, j11), u5Var2, true);
                        break;
                    case 44:
                        z7.e(this.f20411a[i12], (List) unsafe.getObject(t11, j11), u5Var2, true);
                        break;
                    case 45:
                        z7.m(this.f20411a[i12], (List) unsafe.getObject(t11, j11), u5Var2, true);
                        break;
                    case 46:
                        z7.n(this.f20411a[i12], (List) unsafe.getObject(t11, j11), u5Var2, true);
                        break;
                    case 47:
                        z7.o(this.f20411a[i12], (List) unsafe.getObject(t11, j11), u5Var2, true);
                        break;
                    case 48:
                        z7.p(this.f20411a[i12], (List) unsafe.getObject(t11, j11), u5Var2, true);
                        break;
                    case 49:
                        z7.i(this.f20411a[i12], (List) unsafe.getObject(t11, j11), u5Var2, m(i12));
                        break;
                    case 50:
                        if (unsafe.getObject(t11, j11) != null) {
                            f7 f7Var = (f7) n(i12);
                            throw null;
                        }
                        break;
                    case 51:
                        if (w(t11, i15, i12)) {
                            u5Var2.c(i15, E(t11, j11));
                            break;
                        }
                        break;
                    case ModuleDescriptor.MODULE_VERSION:
                        if (w(t11, i15, i12)) {
                            u5Var2.d(i15, F(t11, j11));
                            break;
                        }
                        break;
                    case 53:
                        if (w(t11, i15, i12)) {
                            u5Var2.f20485a.t(i15, k(t11, j11));
                            break;
                        }
                        break;
                    case 54:
                        if (w(t11, i15, i12)) {
                            u5Var2.f20485a.t(i15, k(t11, j11));
                            break;
                        }
                        break;
                    case 55:
                        if (w(t11, i15, i12)) {
                            u5Var2.f20485a.l(i15, I(t11, j11));
                            break;
                        }
                        break;
                    case 56:
                        if (w(t11, i15, i12)) {
                            u5Var2.f20485a.j(i15, k(t11, j11));
                            break;
                        }
                        break;
                    case 57:
                        if (w(t11, i15, i12)) {
                            u5Var2.f20485a.g(i15, I(t11, j11));
                            break;
                        }
                        break;
                    case 58:
                        if (w(t11, i15, i12)) {
                            u5Var2.f20485a.e(i15, x(t11, j11));
                            break;
                        }
                        break;
                    case 59:
                        if (w(t11, i15, i12)) {
                            z(i15, unsafe.getObject(t11, j11), u5Var2);
                            break;
                        }
                        break;
                    case 60:
                        if (w(t11, i15, i12)) {
                            u5Var2.f(i15, unsafe.getObject(t11, j11), m(i12));
                            break;
                        }
                        break;
                    case 61:
                        if (w(t11, i15, i12)) {
                            u5Var2.f20485a.f(i15, (p5) unsafe.getObject(t11, j11));
                            break;
                        }
                        break;
                    case 62:
                        if (w(t11, i15, i12)) {
                            u5Var2.f20485a.q(i15, I(t11, j11));
                            break;
                        }
                        break;
                    case 63:
                        if (w(t11, i15, i12)) {
                            u5Var2.f20485a.l(i15, I(t11, j11));
                            break;
                        }
                        break;
                    case 64:
                        if (w(t11, i15, i12)) {
                            u5Var2.f20485a.g(i15, I(t11, j11));
                            break;
                        }
                        break;
                    case 65:
                        if (w(t11, i15, i12)) {
                            u5Var2.f20485a.j(i15, k(t11, j11));
                            break;
                        }
                        break;
                    case 66:
                        if (w(t11, i15, i12)) {
                            u5Var2.a(i15, I(t11, j11));
                            break;
                        }
                        break;
                    case 67:
                        if (w(t11, i15, i12)) {
                            u5Var2.b(i15, k(t11, j11));
                            break;
                        }
                        break;
                    case 68:
                        if (w(t11, i15, i12)) {
                            u5Var2.e(i15, unsafe.getObject(t11, j11), m(i12));
                            break;
                        }
                        break;
                }
                i12 += 3;
                i11 = 1048575;
            }
            l8<?, ?> l8Var = this.f20422l;
            l8Var.i(l8Var.c(t11), u5Var2);
            return;
        }
        this.f20423m.a(t11);
        throw null;
    }
}
