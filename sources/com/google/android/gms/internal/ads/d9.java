package com.google.android.gms.internal.ads;

import e8.ck;
import f7.j;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;
import z7.b;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class d9 extends h9<ck> {

    /* renamed from: b  reason: collision with root package name */
    public final ScheduledExecutorService f6190b;

    /* renamed from: c  reason: collision with root package name */
    public final b f6191c;
    @GuardedBy("this")

    /* renamed from: d  reason: collision with root package name */
    public long f6192d = -1;
    @GuardedBy("this")

    /* renamed from: e  reason: collision with root package name */
    public long f6193e = -1;
    @GuardedBy("this")

    /* renamed from: f  reason: collision with root package name */
    public boolean f6194f = false;
    @GuardedBy("this")

    /* renamed from: g  reason: collision with root package name */
    public ScheduledFuture<?> f6195g;

    public d9(ScheduledExecutorService scheduledExecutorService, b bVar) {
        super(Collections.emptySet());
        this.f6190b = scheduledExecutorService;
        this.f6191c = bVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void K0(int r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            if (r7 > 0) goto L_0x0005
            monitor-exit(r6)
            return
        L_0x0005:
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x003e }
            long r1 = (long) r7     // Catch:{ all -> 0x003e }
            long r0 = r0.toMillis(r1)     // Catch:{ all -> 0x003e }
            boolean r7 = r6.f6194f     // Catch:{ all -> 0x003e }
            if (r7 == 0) goto L_0x0022
            long r2 = r6.f6193e     // Catch:{ all -> 0x003e }
            r4 = 0
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 <= 0) goto L_0x001d
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 >= 0) goto L_0x001d
            goto L_0x001e
        L_0x001d:
            r0 = r2
        L_0x001e:
            r6.f6193e = r0     // Catch:{ all -> 0x003e }
            monitor-exit(r6)
            return
        L_0x0022:
            z7.b r7 = r6.f6191c     // Catch:{ all -> 0x003e }
            long r2 = r7.a()     // Catch:{ all -> 0x003e }
            long r4 = r6.f6192d     // Catch:{ all -> 0x003e }
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 > 0) goto L_0x0039
            z7.b r7 = r6.f6191c     // Catch:{ all -> 0x003e }
            long r2 = r7.a()     // Catch:{ all -> 0x003e }
            long r4 = r4 - r2
            int r7 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r7 <= 0) goto L_0x003c
        L_0x0039:
            r6.L0(r0)     // Catch:{ all -> 0x003e }
        L_0x003c:
            monitor-exit(r6)
            return
        L_0x003e:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.d9.K0(int):void");
    }

    public final synchronized void L0(long j10) {
        ScheduledFuture<?> scheduledFuture = this.f6195g;
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            this.f6195g.cancel(true);
        }
        this.f6192d = this.f6191c.a() + j10;
        this.f6195g = this.f6190b.schedule(new j(this, (uo) null), j10, TimeUnit.MILLISECONDS);
    }
}
