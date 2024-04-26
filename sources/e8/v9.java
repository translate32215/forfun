package e8;

import com.google.android.gms.internal.ads.f7;
import com.google.android.gms.internal.ads.i7;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class v9 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f17034a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ t9 f17035b;

    public v9(t9 t9Var, int i10) {
        this.f17034a = i10;
        if (i10 == 1) {
            this.f17035b = t9Var;
        } else if (i10 != 2) {
            this.f17035b = t9Var;
        } else {
            this.f17035b = t9Var;
        }
    }

    public final void run() {
        switch (this.f17034a) {
            case 0:
                f7 f7Var = this.f17035b.f16729x;
                if (f7Var != null) {
                    i7 i7Var = (i7) f7Var;
                    i7Var.h("ended", new String[0]);
                    i7Var.f();
                    return;
                }
                return;
            case 1:
                f7 f7Var2 = this.f17035b.f16729x;
                if (f7Var2 != null) {
                    ((i7) f7Var2).b();
                    return;
                }
                return;
            default:
                f7 f7Var3 = this.f17035b.f16729x;
                if (f7Var3 != null) {
                    ((i7) f7Var3).a();
                    return;
                }
                return;
        }
    }
}
