package e8;

import com.google.android.gms.internal.ads.f7;
import com.google.android.gms.internal.ads.i7;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class w9 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f17229a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final int f17230b;

    /* renamed from: c  reason: collision with root package name */
    public final int f17231c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f17232d;

    public w9(oa oaVar, int i10, int i11) {
        this.f17232d = oaVar;
        this.f17230b = i10;
        this.f17231c = i11;
    }

    public final void run() {
        switch (this.f17229a) {
            case 0:
                f7 f7Var = ((t9) this.f17232d).f16729x;
                if (f7Var != null) {
                    ((i7) f7Var).j(this.f17230b, this.f17231c);
                    return;
                }
                return;
            default:
                int i10 = this.f17230b;
                int i11 = this.f17231c;
                f7 f7Var2 = ((oa) this.f17232d).f15752f;
                if (f7Var2 != null) {
                    ((i7) f7Var2).j(i10, i11);
                    return;
                }
                return;
        }
    }

    public w9(t9 t9Var, int i10, int i11) {
        this.f17232d = t9Var;
        this.f17230b = i10;
        this.f17231c = i11;
    }
}
