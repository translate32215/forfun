package e8;

import com.google.android.gms.internal.ads.d7;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final /* synthetic */ class e5 implements n9, tc {

    /* renamed from: a  reason: collision with root package name */
    public final d7 f14362a;

    public e5(d7 d7Var, int i10) {
        if (i10 != 1) {
            this.f14362a = d7Var;
        } else {
            this.f14362a = d7Var;
        }
    }

    public void d(boolean z10) {
        d7 d7Var = this.f14362a;
        if (z10) {
            d7Var.b(null);
        } else {
            d7Var.c(new Exception("Ad Web View failed to load."));
        }
    }

    public void run() {
        this.f14362a.c(new v4("Cannot get Javascript Engine"));
    }
}
