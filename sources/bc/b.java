package bc;

import android.os.Bundle;
import androidx.leanback.app.k;
import com.startapp.startappsdk.R;
import d0.a;

/* compiled from: ErrorFragment.kt */
public final class b extends k {
    public static final /* synthetic */ int D0 = 0;

    public void O(Bundle bundle) {
        super.O(bundle);
        s0(C().getString(R.string.app_name));
        this.f2021y0 = a.c(h0(), R.drawable.lb_ic_sad_cloud);
        y0();
        this.f2022z0 = C().getString(R.string.error_message);
        z0();
        this.C0 = true;
        w0();
        z0();
        this.A0 = C().getString(R.string.retry);
        x0();
        this.B0 = new a(this);
        x0();
    }
}
