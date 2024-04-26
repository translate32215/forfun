package com.google.android.gms.internal.ads;

import e8.bc0;
import e8.ec0;
import e8.oe0;
import e8.rb0;
import e8.zf0;
import java.io.IOException;
import o.a;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public abstract class ss implements ws {

    /* renamed from: a  reason: collision with root package name */
    public final int f8143a;

    /* renamed from: b  reason: collision with root package name */
    public ec0 f8144b;

    /* renamed from: c  reason: collision with root package name */
    public int f8145c;

    /* renamed from: d  reason: collision with root package name */
    public int f8146d;

    /* renamed from: e  reason: collision with root package name */
    public oe0 f8147e;

    /* renamed from: f  reason: collision with root package name */
    public long f8148f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f8149g = true;

    /* renamed from: h  reason: collision with root package name */
    public boolean f8150h;

    public ss(int i10) {
        this.f8143a = i10;
    }

    public final void c(int i10) {
        this.f8145c = i10;
    }

    public final void e() {
        boolean z10 = true;
        if (this.f8146d != 1) {
            z10 = false;
        }
        a.c(z10);
        this.f8146d = 0;
        this.f8147e = null;
        this.f8150h = false;
        z();
    }

    public final int g() {
        return this.f8143a;
    }

    public final int getState() {
        return this.f8146d;
    }

    public final boolean h() {
        return this.f8149g;
    }

    public final void i(long j10) throws rb0 {
        this.f8150h = false;
        this.f8149g = false;
        w(j10, false);
    }

    public final void j() {
        this.f8150h = true;
    }

    public final ss k() {
        return this;
    }

    public zf0 n() {
        return null;
    }

    public final boolean o() {
        return this.f8150h;
    }

    public final void p(ec0 ec0, bc0[] bc0Arr, oe0 oe0, long j10, boolean z10, long j11) throws rb0 {
        a.c(this.f8146d == 0);
        this.f8144b = ec0;
        this.f8146d = 1;
        y(z10);
        a.c(!this.f8150h);
        this.f8147e = oe0;
        this.f8149g = false;
        this.f8148f = j11;
        x(bc0Arr, j11);
        w(j10, z10);
    }

    public final oe0 q() {
        return this.f8147e;
    }

    public final void r() throws IOException {
        this.f8147e.f15792b.f8650i.k();
    }

    public final void s(bc0[] bc0Arr, oe0 oe0, long j10) throws rb0 {
        a.c(!this.f8150h);
        this.f8147e = oe0;
        this.f8149g = false;
        this.f8148f = j10;
        x(bc0Arr, j10);
    }

    public final void start() throws rb0 {
        boolean z10 = true;
        if (this.f8146d != 1) {
            z10 = false;
        }
        a.c(z10);
        this.f8146d = 2;
        t();
    }

    public final void stop() throws rb0 {
        a.c(this.f8146d == 2);
        this.f8146d = 1;
        u();
    }

    public abstract void t() throws rb0;

    public abstract void u() throws rb0;

    /* JADX WARNING: Removed duplicated region for block: B:113:0x023d  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0255  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int v(e8.gz r17, e8.ad0 r18, boolean r19) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            r2 = r18
            e8.oe0 r3 = r1.f8147e
            com.google.android.gms.internal.ads.yt r4 = r3.f15792b
            int r3 = r3.f15791a
            boolean r5 = r4.C
            if (r5 != 0) goto L_0x0239
            boolean r5 = r4.s()
            if (r5 == 0) goto L_0x0018
            goto L_0x0239
        L_0x0018:
            android.util.SparseArray<com.google.android.gms.internal.ads.gu> r5 = r4.f8656w
            java.lang.Object r3 = r5.valueAt(r3)
            com.google.android.gms.internal.ads.gu r3 = (com.google.android.gms.internal.ads.gu) r3
            boolean r5 = r4.N
            long r10 = r4.K
            e8.ue0 r4 = r3.f6694c
            e8.bc0 r12 = r3.f6700i
            e8.te0 r13 = r3.f6695d
            monitor-enter(r4)
            boolean r14 = r4.b()     // Catch:{ all -> 0x0236 }
            r15 = 0
            if (r14 != 0) goto L_0x0049
            if (r5 == 0) goto L_0x003a
            r5 = 4
            r2.f13678a = r5     // Catch:{ all -> 0x0236 }
            monitor-exit(r4)
            goto L_0x00b0
        L_0x003a:
            e8.bc0 r5 = r4.f16944q     // Catch:{ all -> 0x0236 }
            if (r5 == 0) goto L_0x0047
            if (r19 != 0) goto L_0x0042
            if (r5 == r12) goto L_0x0047
        L_0x0042:
            r0.f14835b = r5     // Catch:{ all -> 0x0236 }
            monitor-exit(r4)
            goto L_0x00bc
        L_0x0047:
            monitor-exit(r4)
            goto L_0x005e
        L_0x0049:
            if (r19 != 0) goto L_0x00b3
            e8.bc0[] r5 = r4.f16935h     // Catch:{ all -> 0x0236 }
            int r14 = r4.f16938k     // Catch:{ all -> 0x0236 }
            r5 = r5[r14]     // Catch:{ all -> 0x0236 }
            if (r5 == r12) goto L_0x0054
            goto L_0x00b3
        L_0x0054:
            java.nio.ByteBuffer r5 = r2.f13680c     // Catch:{ all -> 0x0236 }
            if (r5 != 0) goto L_0x005a
            r5 = 1
            goto L_0x005b
        L_0x005a:
            r5 = 0
        L_0x005b:
            if (r5 == 0) goto L_0x0061
            monitor-exit(r4)
        L_0x005e:
            r4 = -5
            r7 = -3
            goto L_0x00be
        L_0x0061:
            long[] r5 = r4.f16933f     // Catch:{ all -> 0x0236 }
            r6 = r5[r14]     // Catch:{ all -> 0x0236 }
            r2.f13681d = r6     // Catch:{ all -> 0x0236 }
            int[] r5 = r4.f16932e     // Catch:{ all -> 0x0236 }
            r5 = r5[r14]     // Catch:{ all -> 0x0236 }
            r2.f13678a = r5     // Catch:{ all -> 0x0236 }
            int[] r5 = r4.f16931d     // Catch:{ all -> 0x0236 }
            r5 = r5[r14]     // Catch:{ all -> 0x0236 }
            r13.f16745a = r5     // Catch:{ all -> 0x0236 }
            long[] r5 = r4.f16930c     // Catch:{ all -> 0x0236 }
            r8 = r5[r14]     // Catch:{ all -> 0x0236 }
            r13.f16746b = r8     // Catch:{ all -> 0x0236 }
            e8.ld0[] r5 = r4.f16934g     // Catch:{ all -> 0x0236 }
            r5 = r5[r14]     // Catch:{ all -> 0x0236 }
            r13.f16748d = r5     // Catch:{ all -> 0x0236 }
            long r8 = r4.f16940m     // Catch:{ all -> 0x0236 }
            long r5 = java.lang.Math.max(r8, r6)     // Catch:{ all -> 0x0236 }
            r4.f16940m = r5     // Catch:{ all -> 0x0236 }
            int r5 = r4.f16936i     // Catch:{ all -> 0x0236 }
            r6 = 1
            int r5 = r5 - r6
            r4.f16936i = r5     // Catch:{ all -> 0x0236 }
            int r7 = r4.f16938k     // Catch:{ all -> 0x0236 }
            int r7 = r7 + r6
            r4.f16938k = r7     // Catch:{ all -> 0x0236 }
            int r8 = r4.f16937j     // Catch:{ all -> 0x0236 }
            int r8 = r8 + r6
            r4.f16937j = r8     // Catch:{ all -> 0x0236 }
            int r6 = r4.f16928a     // Catch:{ all -> 0x0236 }
            if (r7 != r6) goto L_0x009d
            r4.f16938k = r15     // Catch:{ all -> 0x0236 }
        L_0x009d:
            if (r5 <= 0) goto L_0x00a6
            long[] r5 = r4.f16930c     // Catch:{ all -> 0x0236 }
            int r6 = r4.f16938k     // Catch:{ all -> 0x0236 }
            r6 = r5[r6]     // Catch:{ all -> 0x0236 }
            goto L_0x00ad
        L_0x00a6:
            long r5 = r13.f16746b     // Catch:{ all -> 0x0236 }
            int r7 = r13.f16745a     // Catch:{ all -> 0x0236 }
            long r7 = (long) r7     // Catch:{ all -> 0x0236 }
            long r5 = r5 + r7
            r6 = r5
        L_0x00ad:
            r13.f16747c = r6     // Catch:{ all -> 0x0236 }
            monitor-exit(r4)
        L_0x00b0:
            r4 = -5
            r7 = -4
            goto L_0x00be
        L_0x00b3:
            e8.bc0[] r5 = r4.f16935h     // Catch:{ all -> 0x0236 }
            int r6 = r4.f16938k     // Catch:{ all -> 0x0236 }
            r5 = r5[r6]     // Catch:{ all -> 0x0236 }
            r0.f14835b = r5     // Catch:{ all -> 0x0236 }
            monitor-exit(r4)
        L_0x00bc:
            r4 = -5
            r7 = -5
        L_0x00be:
            if (r7 == r4) goto L_0x022d
            r4 = -4
            if (r7 == r4) goto L_0x00ce
            r4 = -3
            if (r7 != r4) goto L_0x00c8
            goto L_0x0239
        L_0x00c8:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x00ce:
            boolean r4 = r18.d()
            if (r4 != 0) goto L_0x022a
            long r4 = r2.f13681d
            int r6 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r6 >= 0) goto L_0x00e1
            int r4 = r2.f13678a
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r4 | r5
            r2.f13678a = r4
        L_0x00e1:
            r4 = 1073741824(0x40000000, float:2.0)
            boolean r4 = r2.b(r4)
            if (r4 == 0) goto L_0x01c6
            e8.te0 r4 = r3.f6695d
            long r5 = r4.f16746b
            e8.w60 r7 = r3.f6696e
            r8 = 1
            r7.f(r8)
            e8.w60 r7 = r3.f6696e
            byte[] r7 = r7.f17220a
            r3.d(r5, r7, r8)
            r7 = 1
            long r5 = r5 + r7
            e8.w60 r7 = r3.f6696e
            byte[] r7 = r7.f17220a
            byte r7 = r7[r15]
            r8 = r7 & 128(0x80, float:1.794E-43)
            if (r8 == 0) goto L_0x0109
            r8 = 1
            goto L_0x010a
        L_0x0109:
            r8 = 0
        L_0x010a:
            r7 = r7 & 127(0x7f, float:1.78E-43)
            e8.xc0 r9 = r2.f13679b
            byte[] r10 = r9.f17466a
            r11 = 16
            if (r10 != 0) goto L_0x0118
            byte[] r10 = new byte[r11]
            r9.f17466a = r10
        L_0x0118:
            byte[] r9 = r9.f17466a
            r3.d(r5, r9, r7)
            long r9 = (long) r7
            long r5 = r5 + r9
            if (r8 == 0) goto L_0x0138
            e8.w60 r7 = r3.f6696e
            r9 = 2
            r7.f(r9)
            e8.w60 r7 = r3.f6696e
            byte[] r7 = r7.f17220a
            r3.d(r5, r7, r9)
            r9 = 2
            long r5 = r5 + r9
            e8.w60 r7 = r3.f6696e
            int r7 = r7.e()
            goto L_0x0139
        L_0x0138:
            r7 = 1
        L_0x0139:
            e8.xc0 r9 = r2.f13679b
            int[] r10 = r9.f17467b
            if (r10 == 0) goto L_0x0142
            int r13 = r10.length
            if (r13 >= r7) goto L_0x0144
        L_0x0142:
            int[] r10 = new int[r7]
        L_0x0144:
            int[] r9 = r9.f17468c
            if (r9 == 0) goto L_0x014b
            int r13 = r9.length
            if (r13 >= r7) goto L_0x014d
        L_0x014b:
            int[] r9 = new int[r7]
        L_0x014d:
            if (r8 == 0) goto L_0x017a
            int r8 = r7 * 6
            e8.w60 r13 = r3.f6696e
            r13.f(r8)
            e8.w60 r13 = r3.f6696e
            byte[] r13 = r13.f17220a
            r3.d(r5, r13, r8)
            long r13 = (long) r8
            long r5 = r5 + r13
            e8.w60 r8 = r3.f6696e
            r8.h(r15)
            r8 = 0
        L_0x0165:
            if (r8 >= r7) goto L_0x0186
            e8.w60 r13 = r3.f6696e
            int r13 = r13.e()
            r10[r8] = r13
            e8.w60 r13 = r3.f6696e
            int r13 = r13.o()
            r9[r8] = r13
            int r8 = r8 + 1
            goto L_0x0165
        L_0x017a:
            r10[r15] = r15
            int r8 = r4.f16745a
            long r13 = r4.f16746b
            long r13 = r5 - r13
            int r14 = (int) r13
            int r8 = r8 - r14
            r9[r15] = r8
        L_0x0186:
            e8.ld0 r8 = r4.f16748d
            e8.xc0 r13 = r2.f13679b
            byte[] r8 = r8.f15380a
            byte[] r14 = r13.f17466a
            r13.f17467b = r10
            r13.f17468c = r9
            r13.f17466a = r14
            int r12 = e8.eg0.f14479a
            if (r12 < r11) goto L_0x01b9
            android.media.MediaCodec$CryptoInfo r11 = r13.f17469d
            r11.numSubSamples = r7
            r11.numBytesOfClearData = r10
            r11.numBytesOfEncryptedData = r9
            r11.key = r8
            r11.iv = r14
            r7 = 1
            r11.mode = r7
            r7 = 24
            if (r12 < r7) goto L_0x01b9
            e8.zc0 r7 = r13.f17470e
            android.media.MediaCodec$CryptoInfo$Pattern r8 = r7.f17715b
            r8.set(r15, r15)
            android.media.MediaCodec$CryptoInfo r8 = r7.f17714a
            android.media.MediaCodec$CryptoInfo$Pattern r7 = r7.f17715b
            r8.setPattern(r7)
        L_0x01b9:
            long r7 = r4.f16746b
            long r5 = r5 - r7
            int r6 = (int) r5
            long r9 = (long) r6
            long r7 = r7 + r9
            r4.f16746b = r7
            int r5 = r4.f16745a
            int r5 = r5 - r6
            r4.f16745a = r5
        L_0x01c6:
            e8.te0 r4 = r3.f6695d
            int r4 = r4.f16745a
            java.nio.ByteBuffer r5 = r2.f13680c
            r6 = 0
            if (r5 == 0) goto L_0x0226
            int r5 = r5.capacity()
            java.nio.ByteBuffer r7 = r2.f13680c
            int r7 = r7.position()
            int r7 = r7 + r4
            if (r5 < r7) goto L_0x0222
            e8.te0 r4 = r3.f6695d
            long r5 = r4.f16746b
            java.nio.ByteBuffer r7 = r2.f13680c
            int r4 = r4.f16745a
            r3.i(r5)
        L_0x01e7:
            if (r4 <= 0) goto L_0x021a
            e8.ve0 r8 = r3.f6698g
            long r8 = r8.f17125a
            long r8 = r5 - r8
            int r9 = (int) r8
            int r8 = r3.f6693b
            int r8 = r8 - r9
            int r8 = java.lang.Math.min(r4, r8)
            e8.ve0 r10 = r3.f6698g
            e8.of0 r10 = r10.f17128d
            byte[] r11 = r10.f15794a
            int r9 = r9 + r15
            r7.put(r11, r9, r8)
            long r11 = (long) r8
            long r5 = r5 + r11
            int r4 = r4 - r8
            e8.ve0 r8 = r3.f6698g
            long r8 = r8.f17126b
            int r11 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r11 != 0) goto L_0x01e7
            u6.f r8 = r3.f6692a
            r8.e(r10)
            e8.ve0 r8 = r3.f6698g
            e8.ve0 r8 = r8.a()
            r3.f6698g = r8
            goto L_0x01e7
        L_0x021a:
            e8.te0 r4 = r3.f6695d
            long r4 = r4.f16747c
            r3.i(r4)
            goto L_0x022a
        L_0x0222:
            r2.c(r7)
            throw r6
        L_0x0226:
            r2.c(r4)
            throw r6
        L_0x022a:
            r3 = -4
            r4 = -4
            goto L_0x023b
        L_0x022d:
            java.lang.Object r4 = r0.f14835b
            e8.bc0 r4 = (e8.bc0) r4
            r3.f6700i = r4
            r3 = -4
            r4 = -5
            goto L_0x023b
        L_0x0236:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x0239:
            r3 = -4
            r4 = -3
        L_0x023b:
            if (r4 != r3) goto L_0x0255
            boolean r0 = r18.d()
            if (r0 == 0) goto L_0x024d
            r0 = 1
            r1.f8149g = r0
            boolean r0 = r1.f8150h
            if (r0 == 0) goto L_0x024b
            return r3
        L_0x024b:
            r0 = -3
            return r0
        L_0x024d:
            long r5 = r2.f13681d
            long r7 = r1.f8148f
            long r5 = r5 + r7
            r2.f13681d = r5
            goto L_0x0270
        L_0x0255:
            r2 = -5
            if (r4 != r2) goto L_0x0270
            java.lang.Object r2 = r0.f14835b
            e8.bc0 r2 = (e8.bc0) r2
            long r5 = r2.E
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x0270
            long r7 = r1.f8148f
            long r5 = r5 + r7
            e8.bc0 r2 = r2.i(r5)
            r0.f14835b = r2
        L_0x0270:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ss.v(e8.gz, e8.ad0, boolean):int");
    }

    public abstract void w(long j10, boolean z10) throws rb0;

    public void x(bc0[] bc0Arr, long j10) throws rb0 {
    }

    public abstract void y(boolean z10) throws rb0;

    public abstract void z();
}
