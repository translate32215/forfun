package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class r implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f8001a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ long f8002b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ a f8003c;

    public r(a aVar, String str, long j10) {
        this.f8003c = aVar;
        this.f8001a = str;
        this.f8002b = j10;
    }

    public final void run() {
        this.f8003c.f5920a.a(this.f8001a, this.f8002b);
        a aVar = this.f8003c;
        aVar.f5920a.b(aVar.toString());
    }
}
