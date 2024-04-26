package nc;

import dev.pankaj.yacinetv.app.MainApp;
import dev.pankaj.yacinetv.ui.splash.SplashActivity;
import kd.o;
import kotlin.reflect.KProperty;
import td.a;
import ud.l;

/* compiled from: SplashActivity.kt */
public final class b extends l implements a<o> {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ SplashActivity f22482b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ MainApp f22483c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(SplashActivity splashActivity, MainApp mainApp) {
        super(0);
        this.f22482b = splashActivity;
        this.f22483c = mainApp;
    }

    public Object d() {
        SplashActivity splashActivity = this.f22482b;
        KProperty<Object>[] kPropertyArr = SplashActivity.M;
        splashActivity.N().g(this.f22483c.d());
        return o.f20627a;
    }
}
