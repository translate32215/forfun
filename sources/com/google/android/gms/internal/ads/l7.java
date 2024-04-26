package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import e8.kh0;
import e8.p50;
import e8.t;
import e8.ti0;
import e8.vf0;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class l7 implements ju {

    /* renamed from: a  reason: collision with root package name */
    public final vf0<ju> f7326a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f7327b;

    /* renamed from: c  reason: collision with root package name */
    public final ju f7328c;

    /* renamed from: d  reason: collision with root package name */
    public final ri f7329d;

    /* renamed from: e  reason: collision with root package name */
    public final String f7330e;

    /* renamed from: f  reason: collision with root package name */
    public final int f7331f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f7332g = ((Boolean) ti0.f16763j.f16769f.a(t.f16562d1)).booleanValue();

    /* renamed from: h  reason: collision with root package name */
    public InputStream f7333h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f7334i;

    /* renamed from: j  reason: collision with root package name */
    public Uri f7335j;

    /* renamed from: k  reason: collision with root package name */
    public volatile kh0 f7336k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f7337l = false;

    /* renamed from: m  reason: collision with root package name */
    public boolean f7338m = false;

    /* renamed from: n  reason: collision with root package name */
    public boolean f7339n = false;

    /* renamed from: o  reason: collision with root package name */
    public boolean f7340o = false;

    /* renamed from: p  reason: collision with root package name */
    public long f7341p = 0;

    /* renamed from: q  reason: collision with root package name */
    public p50<Long> f7342q = null;

    /* renamed from: r  reason: collision with root package name */
    public final AtomicLong f7343r = new AtomicLong(-1);

    public l7(Context context, ju juVar, String str, int i10, vf0<ju> vf0, ri riVar) {
        this.f7327b = context;
        this.f7328c = juVar;
        this.f7326a = vf0;
        this.f7329d = riVar;
        this.f7330e = str;
        this.f7331f = i10;
    }

    public final Uri M() {
        return this.f7335j;
    }

    public final int a(byte[] bArr, int i10, int i11) throws IOException {
        int i12;
        vf0<ju> vf0;
        if (this.f7334i) {
            InputStream inputStream = this.f7333h;
            if (inputStream != null) {
                i12 = inputStream.read(bArr, i10, i11);
            } else {
                i12 = this.f7328c.a(bArr, i10, i11);
            }
            if ((!this.f7332g || this.f7333h != null) && (vf0 = this.f7326a) != null) {
                vf0.i(this, i12);
            }
            return i12;
        }
        throw new IOException("Attempt to read closed CacheDataSource.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:74:0x0236  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:48:0x0171=Splitter:B:48:0x0171, B:43:0x013b=Splitter:B:43:0x013b} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long b(e8.qf0 r17) throws java.io.IOException {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            boolean r2 = r1.f7334i
            if (r2 != 0) goto L_0x0258
            r2 = 1
            r1.f7334i = r2
            android.net.Uri r3 = r0.f16161a
            r1.f7335j = r3
            boolean r3 = r1.f7332g
            if (r3 != 0) goto L_0x001a
            e8.vf0<com.google.android.gms.internal.ads.ju> r3 = r1.f7326a
            if (r3 == 0) goto L_0x001a
            r3.g(r1, r0)
        L_0x001a:
            android.net.Uri r3 = r0.f16161a
            e8.kh0 r3 = e8.kh0.i(r3)
            r1.f7336k = r3
            e8.l<java.lang.Boolean> r3 = e8.t.f16557c2
            e8.ti0 r4 = e8.ti0.f16763j
            com.google.android.gms.internal.ads.e r4 = r4.f16769f
            java.lang.Object r3 = r4.a(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L_0x01ce
            e8.kh0 r3 = r1.f7336k
            if (r3 == 0) goto L_0x022f
            e8.kh0 r3 = r1.f7336k
            long r7 = r0.f16164d
            r3.f15296h = r7
            e8.kh0 r3 = r1.f7336k
            java.lang.String r7 = r1.f7330e
            java.lang.String r7 = com.google.android.gms.internal.ads.qg.b(r7)
            r3.f15297i = r7
            e8.kh0 r3 = r1.f7336k
            int r7 = r1.f7331f
            r3.f15298r = r7
            e8.kh0 r3 = r1.f7336k
            boolean r3 = r3.f15295g
            if (r3 == 0) goto L_0x0061
            e8.l<java.lang.Long> r3 = e8.t.f16569e2
            e8.ti0 r7 = e8.ti0.f16763j
            com.google.android.gms.internal.ads.e r7 = r7.f16769f
            java.lang.Object r3 = r7.a(r3)
            java.lang.Long r3 = (java.lang.Long) r3
            goto L_0x006d
        L_0x0061:
            e8.l<java.lang.Long> r3 = e8.t.f16563d2
            e8.ti0 r7 = e8.ti0.f16763j
            com.google.android.gms.internal.ads.e r7 = r7.f16769f
            java.lang.Object r3 = r7.a(r3)
            java.lang.Long r3 = (java.lang.Long) r3
        L_0x006d:
            long r7 = r3.longValue()
            d7.l r3 = d7.l.B
            z7.b r3 = r3.f13193j
            long r9 = r3.a()
            d7.l r3 = d7.l.B
            com.google.android.gms.internal.ads.ap r3 = r3.f13206w
            android.content.Context r3 = r1.f7327b
            e8.kh0 r11 = r1.f7336k
            com.google.android.gms.internal.ads.kv r12 = new com.google.android.gms.internal.ads.kv
            r12.<init>(r3)
            e8.qh0 r13 = new e8.qh0
            r13.<init>(r12)
            e8.ph0 r14 = new e8.ph0
            r14.<init>(r12, r11, r13)
            e8.rh0 r11 = new e8.rh0
            r11.<init>(r12, r13)
            java.lang.Object r15 = r12.f7305d
            monitor-enter(r15)
            e8.lh0 r6 = new e8.lh0     // Catch:{ all -> 0x01cb }
            d7.l r4 = d7.l.B     // Catch:{ all -> 0x01cb }
            d6.l r4 = r4.f13200q     // Catch:{ all -> 0x01cb }
            android.os.Looper r4 = r4.b()     // Catch:{ all -> 0x01cb }
            r6.<init>(r3, r4, r14, r11)     // Catch:{ all -> 0x01cb }
            r12.f7302a = r6     // Catch:{ all -> 0x01cb }
            r6.n()     // Catch:{ all -> 0x01cb }
            monitor-exit(r15)     // Catch:{ all -> 0x01cb }
            r3 = 44
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ ExecutionException | TimeoutException -> 0x0170, InterruptedException -> 0x013a, all -> 0x0137 }
            java.lang.Object r4 = r13.get(r7, r4)     // Catch:{ ExecutionException | TimeoutException -> 0x0170, InterruptedException -> 0x013a, all -> 0x0137 }
            e8.sh0 r4 = (e8.sh0) r4     // Catch:{ ExecutionException | TimeoutException -> 0x0170, InterruptedException -> 0x013a, all -> 0x0137 }
            boolean r5 = r4.f16490b     // Catch:{ ExecutionException | TimeoutException -> 0x0135, InterruptedException -> 0x0133, all -> 0x0131 }
            r1.f7337l = r5     // Catch:{ ExecutionException | TimeoutException -> 0x0135, InterruptedException -> 0x0133, all -> 0x0131 }
            boolean r5 = r4.f16491c     // Catch:{ ExecutionException | TimeoutException -> 0x0135, InterruptedException -> 0x0133, all -> 0x0131 }
            r1.f7339n = r5     // Catch:{ ExecutionException | TimeoutException -> 0x0135, InterruptedException -> 0x0133, all -> 0x0131 }
            boolean r5 = r4.f16493e     // Catch:{ ExecutionException | TimeoutException -> 0x0135, InterruptedException -> 0x0133, all -> 0x0131 }
            r1.f7340o = r5     // Catch:{ ExecutionException | TimeoutException -> 0x0135, InterruptedException -> 0x0133, all -> 0x0131 }
            long r5 = r4.f16492d     // Catch:{ ExecutionException | TimeoutException -> 0x0135, InterruptedException -> 0x0133, all -> 0x0131 }
            r1.f7341p = r5     // Catch:{ ExecutionException | TimeoutException -> 0x0135, InterruptedException -> 0x0133, all -> 0x0131 }
            boolean r5 = r16.c()     // Catch:{ ExecutionException | TimeoutException -> 0x0135, InterruptedException -> 0x0133, all -> 0x0131 }
            if (r5 != 0) goto L_0x0106
            java.io.InputStream r4 = r4.f16489a     // Catch:{ ExecutionException | TimeoutException -> 0x0135, InterruptedException -> 0x0133, all -> 0x0131 }
            r1.f7333h = r4     // Catch:{ ExecutionException | TimeoutException -> 0x0135, InterruptedException -> 0x0133, all -> 0x0131 }
            boolean r4 = r1.f7332g     // Catch:{ ExecutionException | TimeoutException -> 0x0135, InterruptedException -> 0x0133, all -> 0x0131 }
            if (r4 == 0) goto L_0x00da
            e8.vf0<com.google.android.gms.internal.ads.ju> r4 = r1.f7326a     // Catch:{ ExecutionException | TimeoutException -> 0x0135, InterruptedException -> 0x0133, all -> 0x0131 }
            if (r4 == 0) goto L_0x00da
            r4.g(r1, r0)     // Catch:{ ExecutionException | TimeoutException -> 0x0135, InterruptedException -> 0x0133, all -> 0x0131 }
        L_0x00da:
            d7.l r0 = d7.l.B
            z7.b r0 = r0.f13193j
            long r4 = r0.a()
            long r4 = r4 - r9
            com.google.android.gms.internal.ads.ri r0 = r1.f7329d
            r0.Q(r2, r4)
            r1.f7338m = r2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r3)
            java.lang.String r2 = "Cache connection took "
            r0.append(r2)
            r0.append(r4)
            java.lang.String r2 = "ms"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            l0.e.H(r0)
            r2 = -1
            return r2
        L_0x0106:
            d7.l r4 = d7.l.B
            z7.b r4 = r4.f13193j
            long r4 = r4.a()
            long r4 = r4 - r9
            com.google.android.gms.internal.ads.ri r6 = r1.f7329d
            r6.Q(r2, r4)
            r1.f7338m = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r3)
            java.lang.String r3 = "Cache connection took "
            r2.append(r3)
            r2.append(r4)
            java.lang.String r3 = "ms"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            l0.e.H(r2)
            goto L_0x022f
        L_0x0131:
            r0 = move-exception
            goto L_0x01a1
        L_0x0133:
            r4 = 1
            goto L_0x013b
        L_0x0135:
            r4 = 1
            goto L_0x0171
        L_0x0137:
            r0 = move-exception
            r2 = 0
            goto L_0x01a1
        L_0x013a:
            r4 = 0
        L_0x013b:
            r13.cancel(r2)     // Catch:{ all -> 0x019f }
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x019f }
            r2.interrupt()     // Catch:{ all -> 0x019f }
            d7.l r2 = d7.l.B
            z7.b r2 = r2.f13193j
            long r5 = r2.a()
            long r5 = r5 - r9
            com.google.android.gms.internal.ads.ri r2 = r1.f7329d
            r2.Q(r4, r5)
            r1.f7338m = r4
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r3)
            java.lang.String r3 = "Cache connection took "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r3 = "ms"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            l0.e.H(r2)
            goto L_0x022f
        L_0x0170:
            r4 = 0
        L_0x0171:
            r13.cancel(r2)     // Catch:{ all -> 0x019f }
            d7.l r2 = d7.l.B
            z7.b r2 = r2.f13193j
            long r5 = r2.a()
            long r5 = r5 - r9
            com.google.android.gms.internal.ads.ri r2 = r1.f7329d
            r2.Q(r4, r5)
            r1.f7338m = r4
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r3)
            java.lang.String r3 = "Cache connection took "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r3 = "ms"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            l0.e.H(r2)
            goto L_0x022f
        L_0x019f:
            r0 = move-exception
            r2 = r4
        L_0x01a1:
            d7.l r4 = d7.l.B
            z7.b r4 = r4.f13193j
            long r4 = r4.a()
            long r4 = r4 - r9
            com.google.android.gms.internal.ads.ri r6 = r1.f7329d
            r6.Q(r2, r4)
            r1.f7338m = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r3)
            java.lang.String r3 = "Cache connection took "
            r2.append(r3)
            r2.append(r4)
            java.lang.String r3 = "ms"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            l0.e.H(r2)
            throw r0
        L_0x01cb:
            r0 = move-exception
            monitor-exit(r15)     // Catch:{ all -> 0x01cb }
            throw r0
        L_0x01ce:
            r3 = 0
            e8.kh0 r4 = r1.f7336k
            if (r4 == 0) goto L_0x01f3
            e8.kh0 r3 = r1.f7336k
            long r4 = r0.f16164d
            r3.f15296h = r4
            e8.kh0 r3 = r1.f7336k
            java.lang.String r4 = r1.f7330e
            java.lang.String r4 = com.google.android.gms.internal.ads.qg.b(r4)
            r3.f15297i = r4
            e8.kh0 r3 = r1.f7336k
            int r4 = r1.f7331f
            r3.f15298r = r4
            d7.l r3 = d7.l.B
            com.google.android.gms.internal.ads.gv r3 = r3.f13192i
            e8.kh0 r4 = r1.f7336k
            com.google.android.gms.internal.ads.hv r3 = r3.c(r4)
        L_0x01f3:
            if (r3 == 0) goto L_0x022f
            boolean r4 = r3.i()
            if (r4 == 0) goto L_0x022f
            boolean r4 = r3.q()
            r1.f7337l = r4
            boolean r4 = r3.y()
            r1.f7339n = r4
            boolean r4 = r3.s()
            r1.f7340o = r4
            long r4 = r3.x()
            r1.f7341p = r4
            r1.f7338m = r2
            boolean r2 = r16.c()
            if (r2 != 0) goto L_0x022f
            java.io.InputStream r2 = r3.j()
            r1.f7333h = r2
            boolean r2 = r1.f7332g
            if (r2 == 0) goto L_0x022c
            e8.vf0<com.google.android.gms.internal.ads.ju> r2 = r1.f7326a
            if (r2 == 0) goto L_0x022c
            r2.g(r1, r0)
        L_0x022c:
            r2 = -1
            return r2
        L_0x022f:
            r2 = 0
            r1.f7338m = r2
            e8.kh0 r2 = r1.f7336k
            if (r2 == 0) goto L_0x0251
            e8.qf0 r2 = new e8.qf0
            e8.kh0 r3 = r1.f7336k
            java.lang.String r3 = r3.f15289a
            android.net.Uri r4 = android.net.Uri.parse(r3)
            byte[] r5 = r0.f16162b
            long r6 = r0.f16163c
            long r8 = r0.f16164d
            long r10 = r0.f16165e
            java.lang.String r12 = r0.f16166f
            int r13 = r0.f16167g
            r3 = r2
            r3.<init>(r4, r5, r6, r8, r10, r12, r13)
            r0 = r2
        L_0x0251:
            com.google.android.gms.internal.ads.ju r2 = r1.f7328c
            long r2 = r2.b(r0)
            return r2
        L_0x0258:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r2 = "Attempt to open an already open CacheDataSource."
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.l7.b(e8.qf0):long");
    }

    public final boolean c() {
        if (!this.f7332g) {
            return false;
        }
        if (((Boolean) ti0.f16763j.f16769f.a(t.f16575f2)).booleanValue() && !this.f7339n) {
            return true;
        }
        if (!((Boolean) ti0.f16763j.f16769f.a(t.f16581g2)).booleanValue() || this.f7340o) {
            return false;
        }
        return true;
    }

    public final void close() throws IOException {
        vf0<ju> vf0;
        if (this.f7334i) {
            boolean z10 = false;
            this.f7334i = false;
            this.f7335j = null;
            if (!this.f7332g || this.f7333h != null) {
                z10 = true;
            }
            InputStream inputStream = this.f7333h;
            if (inputStream != null) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                }
                this.f7333h = null;
            } else {
                this.f7328c.close();
            }
            if (z10 && (vf0 = this.f7326a) != null) {
                vf0.e(this);
                return;
            }
            return;
        }
        throw new IOException("Attempt to close an already closed CacheDataSource.");
    }
}
