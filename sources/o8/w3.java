package o8;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-measurement@@19.0.2 */
public final class w3 implements Callable<List<y5>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f23556a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f23557b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f23558c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ String f23559d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ b4 f23560e;

    public w3(b4 b4Var, String str, String str2, String str3, int i10) {
        this.f23556a = i10;
        if (i10 != 1) {
            this.f23560e = b4Var;
            this.f23557b = str;
            this.f23558c = str2;
            this.f23559d = str3;
            return;
        }
        this.f23560e = b4Var;
        this.f23557b = str;
        this.f23558c = str2;
        this.f23559d = str3;
    }

    public final Object call() {
        switch (this.f23556a) {
            case 0:
                this.f23560e.f23124a.a();
                j jVar = this.f23560e.f23124a.f23472c;
                u5.I(jVar);
                return jVar.P(this.f23557b, this.f23558c, this.f23559d);
            default:
                this.f23560e.f23124a.a();
                j jVar2 = this.f23560e.f23124a.f23472c;
                u5.I(jVar2);
                return jVar2.M(this.f23557b, this.f23558c, this.f23559d);
        }
    }
}
