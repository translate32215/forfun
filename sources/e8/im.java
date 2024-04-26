package e8;

import com.google.android.gms.internal.ads.t7;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final /* synthetic */ class im implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15057a;

    /* renamed from: b  reason: collision with root package name */
    public final t7 f15058b;

    public im(t7 t7Var, int i10) {
        this.f15057a = i10;
        if (i10 == 1) {
            this.f15058b = t7Var;
        } else if (i10 != 2) {
            this.f15058b = t7Var;
        } else {
            this.f15058b = t7Var;
        }
    }

    public final void run() {
        switch (this.f15057a) {
            case 0:
                this.f15058b.destroy();
                return;
            case 1:
                this.f15058b.destroy();
                return;
            default:
                this.f15058b.I();
                return;
        }
    }
}
