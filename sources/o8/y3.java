package o8;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@19.0.2 */
public final class y3 implements Callable<List<y5>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f23612a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f23613b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f23614c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ String f23615d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ b4 f23616e;

    public y3(b4 b4Var, String str, String str2, String str3, int i10) {
        this.f23612a = i10;
        if (i10 != 1) {
            this.f23616e = b4Var;
            this.f23613b = str;
            this.f23614c = str2;
            this.f23615d = str3;
            return;
        }
        this.f23616e = b4Var;
        this.f23613b = str;
        this.f23614c = str2;
        this.f23615d = str3;
    }

    public final Object call() {
        switch (this.f23612a) {
            case 0:
                this.f23616e.f23124a.a();
                j jVar = this.f23616e.f23124a.f23472c;
                u5.I(jVar);
                return jVar.P(this.f23613b, this.f23614c, this.f23615d);
            default:
                this.f23616e.f23124a.a();
                j jVar2 = this.f23616e.f23124a.f23472c;
                u5.I(jVar2);
                return jVar2.M(this.f23613b, this.f23614c, this.f23615d);
        }
    }
}
