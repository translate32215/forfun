package o8;

import com.google.android.gms.common.internal.i;

/* compiled from: com.google.android.gms:play-services-measurement@@19.0.2 */
public final class z3 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f23637a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b6 f23638b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ b4 f23639c;

    public z3(b4 b4Var, b6 b6Var, int i10) {
        this.f23637a = i10;
        if (i10 != 1) {
            this.f23639c = b4Var;
            this.f23638b = b6Var;
            return;
        }
        this.f23639c = b4Var;
        this.f23638b = b6Var;
    }

    public final void run() {
        switch (this.f23637a) {
            case 0:
                this.f23639c.f23124a.a();
                u5 u5Var = this.f23639c.f23124a;
                b6 b6Var = this.f23638b;
                u5Var.b().h();
                u5Var.g();
                i.e(b6Var.f23131a);
                u5Var.J(b6Var);
                return;
            default:
                this.f23639c.f23124a.a();
                this.f23639c.f23124a.m(this.f23638b);
                return;
        }
    }
}
