package com.google.android.gms.internal.ads;

import e8.o40;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
public final class xg<E> extends tg<E> {
    @NullableDecl

    /* renamed from: d  reason: collision with root package name */
    public Object[] f8555d;

    /* renamed from: e  reason: collision with root package name */
    public int f8556e;

    public xg() {
        super(4);
    }

    public final o40 a(Object obj) {
        obj.getClass();
        if (this.f8555d != null) {
            int A = vg.A(this.f8202b);
            Object[] objArr = this.f8555d;
            if (A <= objArr.length) {
                int length = objArr.length - 1;
                int hashCode = obj.hashCode();
                int r10 = g7.r(hashCode);
                while (true) {
                    int i10 = r10 & length;
                    Object[] objArr2 = this.f8555d;
                    Object obj2 = objArr2[i10];
                    if (obj2 != null) {
                        if (obj2.equals(obj)) {
                            break;
                        }
                        r10 = i10 + 1;
                    } else {
                        objArr2[i10] = obj;
                        this.f8556e += hashCode;
                        b(obj);
                        break;
                    }
                }
                return this;
            }
        }
        this.f8555d = null;
        b(obj);
        return this;
    }

    public final o40 d(Iterable iterable) {
        if (this.f8555d != null) {
            for (Object a10 : iterable) {
                a(a10);
            }
        } else {
            super.d(iterable);
        }
        return this;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: com.google.android.gms.internal.ads.bh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: com.google.android.gms.internal.ads.vg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: com.google.android.gms.internal.ads.bh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: com.google.android.gms.internal.ads.bh} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.vg<E> e() {
        /*
            r10 = this;
            int r0 = r10.f8202b
            if (r0 == 0) goto L_0x0059
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L_0x004d
            java.lang.Object[] r3 = r10.f8555d
            if (r3 == 0) goto L_0x0039
            int r0 = com.google.android.gms.internal.ads.vg.A(r0)
            java.lang.Object[] r3 = r10.f8555d
            int r3 = r3.length
            if (r0 != r3) goto L_0x0039
            int r0 = r10.f8202b
            java.lang.Object[] r3 = r10.f8201a
            int r4 = r3.length
            int r5 = r4 >> 1
            int r4 = r4 >> 2
            int r5 = r5 + r4
            if (r0 >= r5) goto L_0x0022
            r1 = 1
        L_0x0022:
            if (r1 == 0) goto L_0x0028
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r0)
        L_0x0028:
            r5 = r3
            com.google.android.gms.internal.ads.bh r0 = new com.google.android.gms.internal.ads.bh
            int r6 = r10.f8556e
            java.lang.Object[] r7 = r10.f8555d
            int r1 = r7.length
            int r8 = r1 + -1
            int r9 = r10.f8202b
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9)
            goto L_0x0047
        L_0x0039:
            int r0 = r10.f8202b
            java.lang.Object[] r1 = r10.f8201a
            com.google.android.gms.internal.ads.vg r0 = com.google.android.gms.internal.ads.vg.s(r0, r1)
            int r1 = r0.size()
            r10.f8202b = r1
        L_0x0047:
            r10.f8203c = r2
            r1 = 0
            r10.f8555d = r1
            return r0
        L_0x004d:
            java.lang.Object[] r0 = r10.f8201a
            r0 = r0[r1]
            int r1 = com.google.android.gms.internal.ads.vg.f8364c
            e8.c50 r1 = new e8.c50
            r1.<init>(r0)
            return r1
        L_0x0059:
            com.google.android.gms.internal.ads.bh<java.lang.Object> r0 = com.google.android.gms.internal.ads.bh.f6022i
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.xg.e():com.google.android.gms.internal.ads.vg");
    }

    public xg(int i10) {
        super(i10);
        this.f8555d = new Object[vg.A(i10)];
    }
}
