package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ma;
import e8.f80;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class rr implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final fr f8050a;

    /* renamed from: b  reason: collision with root package name */
    public final ma.a f8051b;

    public rr(fr frVar, ma.a aVar) {
        this.f8050a = frVar;
        this.f8051b = aVar;
    }

    public final Object call() throws Exception {
        Future future = this.f8050a.f6489k;
        if (future != null) {
            future.get();
        }
        ma maVar = this.f8050a.f6488j;
        if (maVar == null) {
            return null;
        }
        try {
            synchronized (this.f8051b) {
                ma.a aVar = this.f8051b;
                byte[] f10 = maVar.f();
                aVar.k(f10, 0, f10.length, up.b());
            }
            return null;
        } catch (f80 unused) {
            return null;
        }
    }
}
