package e8;

import com.google.android.gms.internal.ads.n7;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class rg0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f16325a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f16326b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ gf0 f16327c;

    public rg0(gf0 gf0, int i10, int i11, int i12, float f10) {
        this.f16327c = gf0;
        this.f16325a = i10;
        this.f16326b = i11;
    }

    public final void run() {
        int i10 = this.f16325a;
        int i11 = this.f16326b;
        ua uaVar = ((n7) ((og0) this.f16327c.f14777c)).f7542s;
        if (uaVar != null) {
            uaVar.c(i10, i11);
        }
    }
}
