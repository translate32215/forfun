package e8;

import com.google.android.gms.internal.ads.f7;
import com.google.android.gms.internal.ads.i7;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final /* synthetic */ class pa implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15889a;

    /* renamed from: b  reason: collision with root package name */
    public final oa f15890b;

    public pa(oa oaVar, int i10) {
        this.f15889a = i10;
        if (i10 == 1) {
            this.f15890b = oaVar;
        } else if (i10 != 2) {
            this.f15890b = oaVar;
        } else {
            this.f15890b = oaVar;
        }
    }

    public final void run() {
        switch (this.f15889a) {
            case 0:
                f7 f7Var = this.f15890b.f15752f;
                if (f7Var != null) {
                    i7 i7Var = (i7) f7Var;
                    i7Var.h("ended", new String[0]);
                    i7Var.f();
                    return;
                }
                return;
            case 1:
                f7 f7Var2 = this.f15890b.f15752f;
                if (f7Var2 != null) {
                    ((i7) f7Var2).b();
                    return;
                }
                return;
            default:
                f7 f7Var3 = this.f15890b.f15752f;
                if (f7Var3 != null) {
                    ((i7) f7Var3).c();
                    return;
                }
                return;
        }
    }
}
