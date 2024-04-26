package o8;

import java.util.List;
import java.util.concurrent.Callable;
import k8.f8;
import t1.c;

/* compiled from: com.google.android.gms:play-services-measurement@@19.0.2 */
public final class a4 implements Callable<List<y5>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f23097a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f23098b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f23099c;

    public /* synthetic */ a4(q3 q3Var, String str) {
        this.f23099c = q3Var;
        this.f23098b = str;
    }

    public final Object call() {
        switch (this.f23097a) {
            case 0:
                ((b4) this.f23099c).f23124a.a();
                j jVar = ((b4) this.f23099c).f23124a.f23472c;
                u5.I(jVar);
                return jVar.O(this.f23098b);
            default:
                return new f8("internal.remoteConfig", new c((q3) this.f23099c, this.f23098b));
        }
    }

    public a4(b4 b4Var, String str) {
        this.f23099c = b4Var;
        this.f23098b = str;
    }
}
