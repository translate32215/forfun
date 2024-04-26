package com.google.android.gms.internal.ads;

import android.net.Uri;
import d5.w;
import e8.yf0;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class zt {

    /* renamed from: a  reason: collision with root package name */
    public final Uri f8759a;

    /* renamed from: b  reason: collision with root package name */
    public final ju f8760b;

    /* renamed from: c  reason: collision with root package name */
    public final au f8761c;

    /* renamed from: d  reason: collision with root package name */
    public final yf0 f8762d;

    /* renamed from: e  reason: collision with root package name */
    public final w f8763e = new w(2);

    /* renamed from: f  reason: collision with root package name */
    public volatile boolean f8764f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f8765g = true;

    /* renamed from: h  reason: collision with root package name */
    public long f8766h;

    /* renamed from: i  reason: collision with root package name */
    public long f8767i = -1;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ yt f8768j;

    public zt(yt ytVar, Uri uri, ju juVar, au auVar, yf0 yf0) {
        this.f8768j = ytVar;
        uri.getClass();
        this.f8759a = uri;
        juVar.getClass();
        this.f8760b = juVar;
        auVar.getClass();
        this.f8761c = auVar;
        this.f8762d = yf0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00a3, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00a4, code lost:
        r2 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b8 A[SYNTHETIC, Splitter:B:56:0x00b8] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() throws java.io.IOException, java.lang.InterruptedException {
        /*
            r15 = this;
            r0 = 0
            r1 = 0
        L_0x0002:
            if (r1 != 0) goto L_0x00bc
            boolean r2 = r15.f8764f
            if (r2 != 0) goto L_0x00bc
            r2 = 0
            r3 = 1
            d5.w r4 = r15.f8763e     // Catch:{ all -> 0x00a6 }
            long r12 = r4.f13063a     // Catch:{ all -> 0x00a6 }
            com.google.android.gms.internal.ads.ju r4 = r15.f8760b     // Catch:{ all -> 0x00a6 }
            e8.qf0 r14 = new e8.qf0     // Catch:{ all -> 0x00a6 }
            android.net.Uri r6 = r15.f8759a     // Catch:{ all -> 0x00a6 }
            r9 = -1
            com.google.android.gms.internal.ads.yt r5 = r15.f8768j     // Catch:{ all -> 0x00a6 }
            r5.getClass()     // Catch:{ all -> 0x00a6 }
            r11 = 0
            r5 = r14
            r7 = r12
            r5.<init>(r6, r7, r9, r11)     // Catch:{ all -> 0x00a6 }
            long r4 = r4.b(r14)     // Catch:{ all -> 0x00a6 }
            r15.f8767i = r4     // Catch:{ all -> 0x00a6 }
            r6 = -1
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x0030
            long r4 = r4 + r12
            r15.f8767i = r4     // Catch:{ all -> 0x00a6 }
        L_0x0030:
            com.google.android.gms.internal.ads.gt r4 = new com.google.android.gms.internal.ads.gt     // Catch:{ all -> 0x00a6 }
            com.google.android.gms.internal.ads.ju r11 = r15.f8760b     // Catch:{ all -> 0x00a6 }
            long r9 = r15.f8767i     // Catch:{ all -> 0x00a6 }
            r5 = r4
            r6 = r11
            r7 = r12
            r5.<init>(r6, r7, r9)     // Catch:{ all -> 0x00a6 }
            com.google.android.gms.internal.ads.au r2 = r15.f8761c     // Catch:{ all -> 0x00a3 }
            android.net.Uri r5 = r11.M()     // Catch:{ all -> 0x00a3 }
            com.google.android.gms.internal.ads.ht r2 = r2.a(r4, r5)     // Catch:{ all -> 0x00a3 }
            boolean r5 = r15.f8765g     // Catch:{ all -> 0x00a3 }
            if (r5 == 0) goto L_0x0051
            long r5 = r15.f8766h     // Catch:{ all -> 0x00a3 }
            r2.h(r12, r5)     // Catch:{ all -> 0x00a3 }
            r15.f8765g = r0     // Catch:{ all -> 0x00a3 }
        L_0x0051:
            if (r1 != 0) goto L_0x008b
            boolean r5 = r15.f8764f     // Catch:{ all -> 0x00a3 }
            if (r5 != 0) goto L_0x008b
            e8.yf0 r5 = r15.f8762d     // Catch:{ all -> 0x00a3 }
            monitor-enter(r5)     // Catch:{ all -> 0x00a3 }
        L_0x005a:
            boolean r6 = r5.f17627b     // Catch:{ all -> 0x0088 }
            if (r6 != 0) goto L_0x0062
            r5.wait()     // Catch:{ all -> 0x0088 }
            goto L_0x005a
        L_0x0062:
            monitor-exit(r5)     // Catch:{ all -> 0x00a3 }
            d5.w r5 = r15.f8763e     // Catch:{ all -> 0x00a3 }
            int r1 = r2.e(r4, r5)     // Catch:{ all -> 0x00a3 }
            long r5 = r4.f6688c     // Catch:{ all -> 0x00a3 }
            com.google.android.gms.internal.ads.yt r7 = r15.f8768j     // Catch:{ all -> 0x00a3 }
            long r7 = r7.f8649h     // Catch:{ all -> 0x00a3 }
            long r7 = r7 + r12
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 <= 0) goto L_0x0051
            e8.yf0 r7 = r15.f8762d     // Catch:{ all -> 0x00a3 }
            monitor-enter(r7)     // Catch:{ all -> 0x00a3 }
            r7.f17627b = r0     // Catch:{ all -> 0x0085 }
            monitor-exit(r7)     // Catch:{ all -> 0x00a3 }
            com.google.android.gms.internal.ads.yt r7 = r15.f8768j     // Catch:{ all -> 0x00a3 }
            android.os.Handler r8 = r7.f8655v     // Catch:{ all -> 0x00a3 }
            java.lang.Runnable r7 = r7.f8654u     // Catch:{ all -> 0x00a3 }
            r8.post(r7)     // Catch:{ all -> 0x00a3 }
            r12 = r5
            goto L_0x0051
        L_0x0085:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x00a3 }
            throw r0     // Catch:{ all -> 0x00a3 }
        L_0x0088:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00a3 }
            throw r0     // Catch:{ all -> 0x00a3 }
        L_0x008b:
            if (r1 != r3) goto L_0x008f
            r1 = 0
            goto L_0x0095
        L_0x008f:
            d5.w r2 = r15.f8763e
            long r3 = r4.f6688c
            r2.f13063a = r3
        L_0x0095:
            com.google.android.gms.internal.ads.ju r2 = r15.f8760b
            int r3 = e8.eg0.f14479a
            if (r2 == 0) goto L_0x0002
            r2.close()     // Catch:{ IOException -> 0x00a0 }
            goto L_0x0002
        L_0x00a0:
            goto L_0x0002
        L_0x00a3:
            r0 = move-exception
            r2 = r4
            goto L_0x00a7
        L_0x00a6:
            r0 = move-exception
        L_0x00a7:
            if (r1 != r3) goto L_0x00aa
            goto L_0x00b2
        L_0x00aa:
            if (r2 == 0) goto L_0x00b2
            d5.w r1 = r15.f8763e
            long r2 = r2.f6688c
            r1.f13063a = r2
        L_0x00b2:
            com.google.android.gms.internal.ads.ju r1 = r15.f8760b
            int r2 = e8.eg0.f14479a
            if (r1 == 0) goto L_0x00bb
            r1.close()     // Catch:{ IOException -> 0x00bb }
        L_0x00bb:
            throw r0
        L_0x00bc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zt.a():void");
    }
}
