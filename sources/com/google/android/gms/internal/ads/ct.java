package com.google.android.gms.internal.ads;

import e8.lc0;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class ct implements ys {

    /* renamed from: b  reason: collision with root package name */
    public int f6143b = -1;

    /* renamed from: c  reason: collision with root package name */
    public int f6144c = -1;

    /* renamed from: d  reason: collision with root package name */
    public int f6145d = 0;

    /* renamed from: e  reason: collision with root package name */
    public ByteBuffer f6146e;

    /* renamed from: f  reason: collision with root package name */
    public ByteBuffer f6147f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f6148g;

    public ct() {
        ByteBuffer byteBuffer = ys.f8641a;
        this.f6146e = byteBuffer;
        this.f6147f = byteBuffer;
    }

    public final boolean a() {
        int i10 = this.f6145d;
        return (i10 == 0 || i10 == 2) ? false : true;
    }

    public final void b() {
        flush();
        this.f6146e = ys.f8641a;
        this.f6143b = -1;
        this.f6144c = -1;
        this.f6145d = 0;
    }

    public final int c() {
        return this.f6144c;
    }

    public final boolean d(int i10, int i11, int i12) throws lc0 {
        if (i12 != 3 && i12 != 2 && i12 != Integer.MIN_VALUE && i12 != 1073741824) {
            throw new lc0(i10, i11, i12);
        } else if (this.f6143b == i10 && this.f6144c == i11 && this.f6145d == i12) {
            return false;
        } else {
            this.f6143b = i10;
            this.f6144c = i11;
            this.f6145d = i12;
            if (i12 != 2) {
                return true;
            }
            this.f6146e = ys.f8641a;
            return true;
        }
    }

    public final int e() {
        return 2;
    }

    public final boolean f() {
        return this.f6148g && this.f6147f == ys.f8641a;
    }

    public final void flush() {
        this.f6147f = ys.f8641a;
        this.f6148g = false;
    }

    public final void g() {
        this.f6148g = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0081 A[LOOP:2: B:23:0x0081->B:24:0x0083, LOOP_START, PHI: r0 
      PHI: (r0v2 int) = (r0v0 int), (r0v3 int) binds: [B:14:0x0041, B:24:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(java.nio.ByteBuffer r8) {
        /*
            r7 = this;
            int r0 = r8.position()
            int r1 = r8.limit()
            int r2 = r1 - r0
            int r3 = r7.f6145d
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = 3
            if (r3 == r5) goto L_0x0020
            if (r3 == r6) goto L_0x0021
            if (r3 != r4) goto L_0x001a
            int r2 = r2 / 2
            goto L_0x0023
        L_0x001a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L_0x0020:
            int r2 = r2 / r6
        L_0x0021:
            int r2 = r2 << 1
        L_0x0023:
            java.nio.ByteBuffer r3 = r7.f6146e
            int r3 = r3.capacity()
            if (r3 >= r2) goto L_0x003a
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocateDirect(r2)
            java.nio.ByteOrder r3 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r2 = r2.order(r3)
            r7.f6146e = r2
            goto L_0x003f
        L_0x003a:
            java.nio.ByteBuffer r2 = r7.f6146e
            r2.clear()
        L_0x003f:
            int r2 = r7.f6145d
            if (r2 == r5) goto L_0x0081
            if (r2 == r6) goto L_0x0068
            if (r2 != r4) goto L_0x0062
        L_0x0047:
            if (r0 >= r1) goto L_0x009c
            java.nio.ByteBuffer r2 = r7.f6146e
            int r3 = r0 + 2
            byte r3 = r8.get(r3)
            r2.put(r3)
            java.nio.ByteBuffer r2 = r7.f6146e
            int r3 = r0 + 3
            byte r3 = r8.get(r3)
            r2.put(r3)
            int r0 = r0 + 4
            goto L_0x0047
        L_0x0062:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
        L_0x0068:
            if (r0 >= r1) goto L_0x009c
            java.nio.ByteBuffer r2 = r7.f6146e
            r3 = 0
            r2.put(r3)
            java.nio.ByteBuffer r2 = r7.f6146e
            byte r3 = r8.get(r0)
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 + -128
            byte r3 = (byte) r3
            r2.put(r3)
            int r0 = r0 + 1
            goto L_0x0068
        L_0x0081:
            if (r0 >= r1) goto L_0x009c
            java.nio.ByteBuffer r2 = r7.f6146e
            int r3 = r0 + 1
            byte r3 = r8.get(r3)
            r2.put(r3)
            java.nio.ByteBuffer r2 = r7.f6146e
            int r3 = r0 + 2
            byte r3 = r8.get(r3)
            r2.put(r3)
            int r0 = r0 + 3
            goto L_0x0081
        L_0x009c:
            int r0 = r8.limit()
            r8.position(r0)
            java.nio.ByteBuffer r8 = r7.f6146e
            r8.flip()
            java.nio.ByteBuffer r8 = r7.f6146e
            r7.f6147f = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ct.h(java.nio.ByteBuffer):void");
    }

    public final ByteBuffer i() {
        ByteBuffer byteBuffer = this.f6147f;
        this.f6147f = ys.f8641a;
        return byteBuffer;
    }
}
