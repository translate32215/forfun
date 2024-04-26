package com.google.android.gms.internal.ads;

import androidx.fragment.app.c;
import j4.e;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class zg<K, V> extends wg<K, V> {

    /* renamed from: g  reason: collision with root package name */
    public static final wg<Object, Object> f8711g = new zg((Object) null, new Object[0], 0);

    /* renamed from: d  reason: collision with root package name */
    public final transient Object f8712d;

    /* renamed from: e  reason: collision with root package name */
    public final transient Object[] f8713e;

    /* renamed from: f  reason: collision with root package name */
    public final transient int f8714f;

    public zg(Object obj, Object[] objArr, int i10) {
        this.f8712d = obj;
        this.f8713e = objArr;
        this.f8714f = i10;
    }

    public static IllegalArgumentException c(Object obj, Object obj2, Object[] objArr, int i10) {
        String valueOf = String.valueOf(obj);
        String valueOf2 = String.valueOf(obj2);
        String valueOf3 = String.valueOf(objArr[i10]);
        String valueOf4 = String.valueOf(objArr[i10 ^ 1]);
        return new IllegalArgumentException(c.a(e.a(valueOf4.length() + valueOf3.length() + valueOf2.length() + valueOf.length() + 39, "Multiple entries with same key: ", valueOf, "=", valueOf2), " and ", valueOf3, "=", valueOf4));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [short[], byte[]], vars: [r2v3 ?, r2v5 ?, r2v4 ?, r2v6 ?]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:102)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:78)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:69)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:51)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:32)
        */
    public static <K, V> com.google.android.gms.internal.ads.zg<K, V> d(int r10, java.lang.Object[] r11) {
        /*
            if (r10 != 0) goto L_0x0007
            com.google.android.gms.internal.ads.wg<java.lang.Object, java.lang.Object> r10 = f8711g
            com.google.android.gms.internal.ads.zg r10 = (com.google.android.gms.internal.ads.zg) r10
            return r10
        L_0x0007:
            r0 = 0
            r1 = 0
            r2 = 1
            if (r10 != r2) goto L_0x0019
            r10 = r11[r1]
            r1 = r11[r2]
            e.h.e(r10, r1)
            com.google.android.gms.internal.ads.zg r10 = new com.google.android.gms.internal.ads.zg
            r10.<init>(r0, r11, r2)
            return r10
        L_0x0019:
            int r3 = r11.length
            int r3 = r3 >> r2
            com.google.android.gms.internal.ads.pg.g(r10, r3)
            int r3 = com.google.android.gms.internal.ads.vg.A(r10)
            if (r10 != r2) goto L_0x002d
            r1 = r11[r1]
            r2 = r11[r2]
            e.h.e(r1, r2)
            goto L_0x00e1
        L_0x002d:
            int r0 = r3 + -1
            r2 = 128(0x80, float:1.794E-43)
            r4 = -1
            if (r3 > r2) goto L_0x006f
            byte[] r2 = new byte[r3]
            java.util.Arrays.fill(r2, r4)
        L_0x0039:
            if (r1 >= r10) goto L_0x006c
            int r3 = r1 * 2
            r4 = r11[r3]
            r5 = r3 ^ 1
            r5 = r11[r5]
            e.h.e(r4, r5)
            int r6 = r4.hashCode()
            int r6 = com.google.android.gms.internal.ads.g7.r(r6)
        L_0x004e:
            r6 = r6 & r0
            byte r7 = r2[r6]
            r8 = 255(0xff, float:3.57E-43)
            r7 = r7 & r8
            if (r7 != r8) goto L_0x005c
            byte r3 = (byte) r3
            r2[r6] = r3
            int r1 = r1 + 1
            goto L_0x0039
        L_0x005c:
            r8 = r11[r7]
            boolean r8 = r8.equals(r4)
            if (r8 != 0) goto L_0x0067
            int r6 = r6 + 1
            goto L_0x004e
        L_0x0067:
            java.lang.IllegalArgumentException r10 = c(r4, r5, r11, r7)
            throw r10
        L_0x006c:
            r0 = r2
            goto L_0x00e1
        L_0x006f:
            r2 = 32768(0x8000, float:4.5918E-41)
            if (r3 > r2) goto L_0x00ad
            short[] r2 = new short[r3]
            java.util.Arrays.fill(r2, r4)
        L_0x0079:
            if (r1 >= r10) goto L_0x006c
            int r3 = r1 * 2
            r4 = r11[r3]
            r5 = r3 ^ 1
            r5 = r11[r5]
            e.h.e(r4, r5)
            int r6 = r4.hashCode()
            int r6 = com.google.android.gms.internal.ads.g7.r(r6)
        L_0x008e:
            r6 = r6 & r0
            short r7 = r2[r6]
            r8 = 65535(0xffff, float:9.1834E-41)
            r7 = r7 & r8
            if (r7 != r8) goto L_0x009d
            short r3 = (short) r3
            r2[r6] = r3
            int r1 = r1 + 1
            goto L_0x0079
        L_0x009d:
            r8 = r11[r7]
            boolean r8 = r8.equals(r4)
            if (r8 != 0) goto L_0x00a8
            int r6 = r6 + 1
            goto L_0x008e
        L_0x00a8:
            java.lang.IllegalArgumentException r10 = c(r4, r5, r11, r7)
            throw r10
        L_0x00ad:
            int[] r2 = new int[r3]
            java.util.Arrays.fill(r2, r4)
        L_0x00b2:
            if (r1 >= r10) goto L_0x006c
            int r3 = r1 * 2
            r5 = r11[r3]
            r6 = r3 ^ 1
            r6 = r11[r6]
            e.h.e(r5, r6)
            int r7 = r5.hashCode()
            int r7 = com.google.android.gms.internal.ads.g7.r(r7)
        L_0x00c7:
            r7 = r7 & r0
            r8 = r2[r7]
            if (r8 != r4) goto L_0x00d1
            r2[r7] = r3
            int r1 = r1 + 1
            goto L_0x00b2
        L_0x00d1:
            r9 = r11[r8]
            boolean r9 = r9.equals(r5)
            if (r9 != 0) goto L_0x00dc
            int r7 = r7 + 1
            goto L_0x00c7
        L_0x00dc:
            java.lang.IllegalArgumentException r10 = c(r5, r6, r11, r8)
            throw r10
        L_0x00e1:
            com.google.android.gms.internal.ads.zg r1 = new com.google.android.gms.internal.ads.zg
            r1.<init>(r0, r11, r10)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zg.d(int, java.lang.Object[]):com.google.android.gms.internal.ads.zg");
    }

    @NullableDecl
    public final V get(@NullableDecl Object obj) {
        Object obj2 = this.f8712d;
        V[] vArr = this.f8713e;
        int i10 = this.f8714f;
        if (obj == null) {
            return null;
        }
        if (i10 == 1) {
            if (vArr[0].equals(obj)) {
                return vArr[1];
            }
            return null;
        } else if (obj2 == null) {
            return null;
        } else {
            if (obj2 instanceof byte[]) {
                byte[] bArr = (byte[]) obj2;
                int length = bArr.length - 1;
                int r10 = g7.r(obj.hashCode());
                while (true) {
                    int i11 = r10 & length;
                    byte b10 = bArr[i11] & 255;
                    if (b10 == 255) {
                        return null;
                    }
                    if (vArr[b10].equals(obj)) {
                        return vArr[b10 ^ 1];
                    }
                    r10 = i11 + 1;
                }
            } else if (obj2 instanceof short[]) {
                short[] sArr = (short[]) obj2;
                int length2 = sArr.length - 1;
                int r11 = g7.r(obj.hashCode());
                while (true) {
                    int i12 = r11 & length2;
                    short s10 = sArr[i12] & 65535;
                    if (s10 == 65535) {
                        return null;
                    }
                    if (vArr[s10].equals(obj)) {
                        return vArr[s10 ^ 1];
                    }
                    r11 = i12 + 1;
                }
            } else {
                int[] iArr = (int[]) obj2;
                int length3 = iArr.length - 1;
                int r12 = g7.r(obj.hashCode());
                while (true) {
                    int i13 = r12 & length3;
                    int i14 = iArr[i13];
                    if (i14 == -1) {
                        return null;
                    }
                    if (vArr[i14].equals(obj)) {
                        return vArr[i14 ^ 1];
                    }
                    r12 = i13 + 1;
                }
            }
        }
    }

    public final int size() {
        return this.f8714f;
    }
}
