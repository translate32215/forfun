package k8;

import java.util.concurrent.Callable;
import o8.q3;

/* compiled from: com.google.android.gms:play-services-measurement@@19.0.2 */
public final /* synthetic */ class a implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f20051a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f20052b;

    public /* synthetic */ a(p0 p0Var, int i10) {
        this.f20051a = i10;
        if (i10 != 1) {
            this.f20052b = p0Var;
        } else {
            this.f20052b = p0Var;
        }
    }

    public final Object call() {
        switch (this.f20051a) {
            case 0:
                return new l6(((p0) this.f20052b).f20402d);
            case 1:
                return new l6(((p0) this.f20052b).f20401c);
            default:
                return new l6(((q3) this.f20052b).f23405j);
        }
    }

    public /* synthetic */ a(q3 q3Var) {
        this.f20051a = 2;
        this.f20052b = q3Var;
    }
}
