package com.google.android.gms.ads.internal.util;

import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public long f5669a;
    @GuardedBy("lock")

    /* renamed from: b  reason: collision with root package name */
    public long f5670b = Long.MIN_VALUE;

    /* renamed from: c  reason: collision with root package name */
    public final Object f5671c = new Object();

    public l(long j10) {
        this.f5669a = j10;
    }

    public final boolean a() {
        synchronized (this.f5671c) {
            long a10 = d7.l.B.f13193j.a();
            if (this.f5670b + this.f5669a > a10) {
                return false;
            }
            this.f5670b = a10;
            return true;
        }
    }
}
