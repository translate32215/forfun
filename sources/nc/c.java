package nc;

import android.os.Handler;
import android.view.animation.AnimationUtils;
import androidx.activity.f;
import com.startapp.startappsdk.R;
import dev.pankaj.yacinetv.ui.splash.SplashActivity;
import kd.o;
import kotlin.reflect.KProperty;
import ud.l;
import zb.b;

/* compiled from: SplashActivity.kt */
public final class c extends l implements td.l<Boolean, o> {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ SplashActivity f22484b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(SplashActivity splashActivity) {
        super(1);
        this.f22484b = splashActivity;
    }

    public Object c(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            SplashActivity splashActivity = this.f22484b;
            KProperty<Object>[] kPropertyArr = SplashActivity.M;
            ((b) splashActivity.L()).f28784b.startAnimation(AnimationUtils.loadAnimation(splashActivity, R.anim.out));
            new Handler().postDelayed(new f(splashActivity), 1500);
        } else {
            this.f22484b.finish();
        }
        return o.f20627a;
    }
}
