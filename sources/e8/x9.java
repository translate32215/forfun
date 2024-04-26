package e8;

import com.google.android.gms.ads.internal.util.p;
import com.google.android.gms.internal.ads.f7;
import com.google.android.gms.internal.ads.i7;
import e7.e;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class x9 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f17453a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ t9 f17454b;

    public x9(t9 t9Var, int i10) {
        this.f17453a = i10;
        if (i10 != 1) {
            this.f17454b = t9Var;
        } else {
            this.f17454b = t9Var;
        }
    }

    public final void run() {
        switch (this.f17453a) {
            case 0:
                f7 f7Var = this.f17454b.f16729x;
                if (f7Var != null) {
                    i7 i7Var = (i7) f7Var;
                    i7Var.f6924d.b();
                    p.f5702i.post(new e(i7Var));
                    return;
                }
                return;
            default:
                f7 f7Var2 = this.f17454b.f16729x;
                if (f7Var2 != null) {
                    ((i7) f7Var2).a();
                    ((i7) this.f17454b.f16729x).c();
                    return;
                }
                return;
        }
    }
}
