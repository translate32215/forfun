package com.google.android.gms.internal.ads;

import e8.bc0;
import e8.eg0;
import e8.fd0;
import e8.ld0;
import e8.of0;
import e8.te0;
import e8.ue0;
import e8.ve0;
import e8.w60;
import e8.we0;
import java.io.EOFException;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import u6.f;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class gu {

    /* renamed from: a  reason: collision with root package name */
    public final f f6692a;

    /* renamed from: b  reason: collision with root package name */
    public final int f6693b;

    /* renamed from: c  reason: collision with root package name */
    public final ue0 f6694c = new ue0();

    /* renamed from: d  reason: collision with root package name */
    public final te0 f6695d = new te0();

    /* renamed from: e  reason: collision with root package name */
    public final w60 f6696e = new w60(32);

    /* renamed from: f  reason: collision with root package name */
    public final AtomicInteger f6697f = new AtomicInteger();

    /* renamed from: g  reason: collision with root package name */
    public ve0 f6698g;

    /* renamed from: h  reason: collision with root package name */
    public ve0 f6699h;

    /* renamed from: i  reason: collision with root package name */
    public bc0 f6700i;

    /* renamed from: j  reason: collision with root package name */
    public long f6701j;

    /* renamed from: k  reason: collision with root package name */
    public int f6702k;

    /* renamed from: l  reason: collision with root package name */
    public we0 f6703l;

    public gu(f fVar) {
        this.f6692a = fVar;
        int i10 = fVar.f26060c;
        this.f6693b = i10;
        this.f6702k = i10;
        ve0 ve0 = new ve0(0, i10);
        this.f6698g = ve0;
        this.f6699h = ve0;
    }

    public final void a() {
        if (this.f6697f.getAndSet(2) == 0) {
            k();
        }
    }

    public final int b(fd0 fd0, int i10) throws IOException, InterruptedException {
        if (!m()) {
            gt gtVar = (gt) fd0;
            int min = Math.min(gtVar.f6691f, i10);
            gtVar.e(min);
            if (min == 0) {
                byte[] bArr = gt.f6685g;
                min = gtVar.a(bArr, 0, Math.min(i10, bArr.length), 0, true);
            }
            gtVar.f(min);
            if (min != -1) {
                return min;
            }
            throw new EOFException();
        }
        try {
            int f10 = f(i10);
            byte[] bArr2 = this.f6699h.f17128d.f15794a;
            int i11 = 0;
            int i12 = this.f6702k + 0;
            gt gtVar2 = (gt) fd0;
            int i13 = gtVar2.f6691f;
            if (i13 != 0) {
                int min2 = Math.min(i13, f10);
                System.arraycopy(gtVar2.f6689d, 0, bArr2, i12, min2);
                gtVar2.e(min2);
                i11 = min2;
            }
            if (i11 == 0) {
                i11 = gtVar2.a(bArr2, i12, f10, 0, true);
            }
            gtVar2.f(i11);
            if (i11 != -1) {
                this.f6702k += i11;
                this.f6701j += (long) i11;
                return i11;
            }
            throw new EOFException();
        } finally {
            n();
        }
    }

    public final void c(long j10, int i10, int i11, int i12, ld0 ld0) {
        if (!m()) {
            ue0 ue0 = this.f6694c;
            synchronized (ue0) {
                long j11 = j10;
                ue0.f16941n = Math.max(ue0.f16941n, j10);
            }
            return;
        }
        long j12 = j10;
        try {
            this.f6694c.a(j10, i10, (this.f6701j - ((long) i11)) - ((long) i12), i11, ld0);
        } finally {
            n();
        }
    }

    public final void d(long j10, byte[] bArr, int i10) {
        i(j10);
        int i11 = 0;
        while (i11 < i10) {
            int i12 = (int) (j10 - this.f6698g.f17125a);
            int min = Math.min(i10 - i11, this.f6693b - i12);
            of0 of0 = this.f6698g.f17128d;
            System.arraycopy(of0.f15794a, i12 + 0, bArr, i11, min);
            j10 += (long) min;
            i11 += min;
            if (j10 == this.f6698g.f17126b) {
                this.f6692a.e(of0);
                this.f6698g = this.f6698g.a();
            }
        }
    }

    public final void e(w60 w60, int i10) {
        if (!m()) {
            w60.h(w60.f17221b + i10);
            return;
        }
        while (i10 > 0) {
            int f10 = f(i10);
            w60.l(this.f6699h.f17128d.f15794a, this.f6702k + 0, f10);
            this.f6702k += f10;
            this.f6701j += (long) f10;
            i10 -= f10;
        }
        n();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: e8.of0[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int f(int r9) {
        /*
            r8 = this;
            int r0 = r8.f6702k
            int r1 = r8.f6693b
            if (r0 != r1) goto L_0x0052
            r0 = 0
            r8.f6702k = r0
            e8.ve0 r0 = r8.f6699h
            boolean r1 = r0.f17127c
            if (r1 == 0) goto L_0x0013
            e8.ve0 r0 = r0.f17129e
            r8.f6699h = r0
        L_0x0013:
            e8.ve0 r0 = r8.f6699h
            u6.f r1 = r8.f6692a
            monitor-enter(r1)
            int r2 = r1.f26064g     // Catch:{ all -> 0x004f }
            r3 = 1
            int r2 = r2 + r3
            r1.f26064g = r2     // Catch:{ all -> 0x004f }
            int r2 = r1.f26065h     // Catch:{ all -> 0x004f }
            if (r2 <= 0) goto L_0x0033
            java.lang.Object r4 = r1.f26066i     // Catch:{ all -> 0x004f }
            r5 = r4
            e8.of0[] r5 = (e8.of0[]) r5     // Catch:{ all -> 0x004f }
            int r2 = r2 + -1
            r1.f26065h = r2     // Catch:{ all -> 0x004f }
            r5 = r5[r2]     // Catch:{ all -> 0x004f }
            e8.of0[] r4 = (e8.of0[]) r4     // Catch:{ all -> 0x004f }
            r6 = 0
            r4[r2] = r6     // Catch:{ all -> 0x004f }
            goto L_0x003c
        L_0x0033:
            e8.of0 r5 = new e8.of0     // Catch:{ all -> 0x004f }
            int r2 = r1.f26060c     // Catch:{ all -> 0x004f }
            byte[] r2 = new byte[r2]     // Catch:{ all -> 0x004f }
            r5.<init>(r2)     // Catch:{ all -> 0x004f }
        L_0x003c:
            monitor-exit(r1)
            e8.ve0 r1 = new e8.ve0
            e8.ve0 r2 = r8.f6699h
            long r6 = r2.f17126b
            int r2 = r8.f6693b
            r1.<init>(r6, r2)
            r0.f17128d = r5
            r0.f17129e = r1
            r0.f17127c = r3
            goto L_0x0052
        L_0x004f:
            r9 = move-exception
            monitor-exit(r1)
            throw r9
        L_0x0052:
            int r0 = r8.f6693b
            int r1 = r8.f6702k
            int r0 = r0 - r1
            int r9 = java.lang.Math.min(r9, r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.gu.f(int):int");
    }

    public final void g(bc0 bc0) {
        boolean z10;
        if (bc0 == null) {
            bc0 = null;
        }
        ue0 ue0 = this.f6694c;
        synchronized (ue0) {
            z10 = true;
            if (bc0 == null) {
                ue0.f16943p = true;
            } else {
                ue0.f16943p = false;
                if (!eg0.d(bc0, ue0.f16944q)) {
                    ue0.f16944q = bc0;
                }
            }
            z10 = false;
        }
        we0 we0 = this.f6703l;
        if (we0 != null && z10) {
            yt ytVar = (yt) we0;
            ytVar.f8655v.post(ytVar.f8653t);
        }
    }

    public final boolean h(long j10, boolean z10) {
        long j11;
        ue0 ue0 = this.f6694c;
        synchronized (ue0) {
            if (ue0.b()) {
                long[] jArr = ue0.f16933f;
                int i10 = ue0.f16938k;
                if (j10 >= jArr[i10]) {
                    if (j10 <= ue0.f16941n || z10) {
                        int i11 = -1;
                        int i12 = 0;
                        while (i10 != ue0.f16939l && ue0.f16933f[i10] <= j10) {
                            if ((ue0.f16932e[i10] & 1) != 0) {
                                i11 = i12;
                            }
                            i10 = (i10 + 1) % ue0.f16928a;
                            i12++;
                        }
                        if (i11 == -1) {
                            j11 = -1;
                        } else {
                            int i13 = (ue0.f16938k + i11) % ue0.f16928a;
                            ue0.f16938k = i13;
                            ue0.f16937j += i11;
                            ue0.f16936i -= i11;
                            j11 = ue0.f16930c[i13];
                        }
                    } else {
                        j11 = -1;
                    }
                }
            }
            j11 = -1;
        }
        if (j11 == -1) {
            return false;
        }
        i(j11);
        return true;
    }

    public final void i(long j10) {
        while (true) {
            ve0 ve0 = this.f6698g;
            if (j10 >= ve0.f17126b) {
                this.f6692a.e(ve0.f17128d);
                this.f6698g = this.f6698g.a();
            } else {
                return;
            }
        }
    }

    public final long j() {
        long max;
        ue0 ue0 = this.f6694c;
        synchronized (ue0) {
            max = Math.max(ue0.f16940m, ue0.f16941n);
        }
        return max;
    }

    public final void k() {
        ue0 ue0 = this.f6694c;
        ue0.f16937j = 0;
        ue0.f16938k = 0;
        ue0.f16939l = 0;
        ue0.f16936i = 0;
        ue0.f16942o = true;
        ve0 ve0 = this.f6698g;
        if (ve0.f17127c) {
            ve0 ve02 = this.f6699h;
            int i10 = (((int) (ve02.f17125a - ve0.f17125a)) / this.f6693b) + (ve02.f17127c ? 1 : 0);
            of0[] of0Arr = new of0[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                of0Arr[i11] = ve0.f17128d;
                ve0 = ve0.a();
            }
            this.f6692a.f(of0Arr);
        }
        ve0 ve03 = new ve0(0, this.f6693b);
        this.f6698g = ve03;
        this.f6699h = ve03;
        this.f6701j = 0;
        this.f6702k = this.f6693b;
        this.f6692a.h();
    }

    public final bc0 l() {
        bc0 bc0;
        ue0 ue0 = this.f6694c;
        synchronized (ue0) {
            bc0 = ue0.f16943p ? null : ue0.f16944q;
        }
        return bc0;
    }

    public final boolean m() {
        return this.f6697f.compareAndSet(0, 1);
    }

    public final void n() {
        if (!this.f6697f.compareAndSet(1, 0)) {
            k();
        }
    }

    public final void o(boolean z10) {
        int andSet = this.f6697f.getAndSet(z10 ? 0 : 2);
        k();
        ue0 ue0 = this.f6694c;
        ue0.f16940m = Long.MIN_VALUE;
        ue0.f16941n = Long.MIN_VALUE;
        if (andSet == 2) {
            this.f6700i = null;
        }
    }
}
