package e8;

import com.google.android.gms.internal.ads.f2;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final /* synthetic */ class i4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14981a;

    /* renamed from: b  reason: collision with root package name */
    public final f2 f14982b;

    /* renamed from: c  reason: collision with root package name */
    public final String f14983c;

    public i4(f2 f2Var, String str, int i10) {
        this.f14981a = i10;
        if (i10 != 1) {
            this.f14982b = f2Var;
            this.f14983c = str;
            return;
        }
        this.f14982b = f2Var;
        this.f14983c = str;
    }

    public final void run() {
        switch (this.f14981a) {
            case 0:
                f2 f2Var = this.f14982b;
                f2Var.f6346a.loadData(this.f14983c, "text/html", "UTF-8");
                return;
            default:
                f2 f2Var2 = this.f14982b;
                f2Var2.f6346a.loadData(this.f14983c, "text/html", "UTF-8");
                return;
        }
    }
}
