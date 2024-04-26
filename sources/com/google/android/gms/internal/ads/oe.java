package com.google.android.gms.internal.ads;

import e8.t;
import e8.ti0;
import javax.annotation.concurrent.GuardedBy;
import z7.b;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class oe {

    /* renamed from: a  reason: collision with root package name */
    public final b f7682a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f7683b = new Object();
    @GuardedBy("lock")

    /* renamed from: c  reason: collision with root package name */
    public volatile int f7684c = 1;

    /* renamed from: d  reason: collision with root package name */
    public volatile long f7685d = 0;

    public oe(b bVar) {
        this.f7682a = bVar;
    }

    public final void a() {
        long b10 = this.f7682a.b();
        synchronized (this.f7683b) {
            if (this.f7684c == 3) {
                if (this.f7685d + ((Long) ti0.f16763j.f16769f.a(t.f16618m3)).longValue() <= b10) {
                    this.f7684c = 1;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(int r5, int r6) {
        /*
            r4 = this;
            r4.a()
            z7.b r0 = r4.f7682a
            long r0 = r0.b()
            java.lang.Object r2 = r4.f7683b
            monitor-enter(r2)
            int r3 = r4.f7684c     // Catch:{ all -> 0x001d }
            if (r3 == r5) goto L_0x0012
            monitor-exit(r2)     // Catch:{ all -> 0x001d }
            return
        L_0x0012:
            r4.f7684c = r6     // Catch:{ all -> 0x001d }
            int r5 = r4.f7684c     // Catch:{ all -> 0x001d }
            r6 = 3
            if (r5 != r6) goto L_0x001b
            r4.f7685d = r0     // Catch:{ all -> 0x001d }
        L_0x001b:
            monitor-exit(r2)     // Catch:{ all -> 0x001d }
            return
        L_0x001d:
            r5 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x001d }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.oe.b(int, int):void");
    }
}
