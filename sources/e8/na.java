package e8;

import com.google.android.gms.ads.internal.util.p;
import com.google.android.gms.internal.ads.f7;
import com.google.android.gms.internal.ads.i7;
import e7.e;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final /* synthetic */ class na implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15599a;

    /* renamed from: b  reason: collision with root package name */
    public final oa f15600b;

    public na(oa oaVar, int i10) {
        this.f15599a = i10;
        if (i10 == 1) {
            this.f15600b = oaVar;
        } else if (i10 != 2) {
            this.f15600b = oaVar;
        } else {
            this.f15600b = oaVar;
        }
    }

    public final void run() {
        switch (this.f15599a) {
            case 0:
                f7 f7Var = this.f15600b.f15752f;
                if (f7Var != null) {
                    ((i7) f7Var).i();
                    return;
                }
                return;
            case 1:
                f7 f7Var2 = this.f15600b.f15752f;
                if (f7Var2 != null) {
                    ((i7) f7Var2).a();
                    return;
                }
                return;
            default:
                f7 f7Var3 = this.f15600b.f15752f;
                if (f7Var3 != null) {
                    i7 i7Var = (i7) f7Var3;
                    i7Var.f6924d.b();
                    p.f5702i.post(new e(i7Var));
                    return;
                }
                return;
        }
    }
}
