package o8;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.2 */
public final class y4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x4 f23617a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ x4 f23618b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f23619c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ boolean f23620d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ z4 f23621e;

    public y4(z4 z4Var, x4 x4Var, x4 x4Var2, long j10, boolean z10) {
        this.f23621e = z4Var;
        this.f23617a = x4Var;
        this.f23618b = x4Var2;
        this.f23619c = j10;
        this.f23620d = z10;
    }

    public final void run() {
        this.f23621e.m(this.f23617a, this.f23618b, this.f23619c, this.f23620d, (Bundle) null);
    }
}
