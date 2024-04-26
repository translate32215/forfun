package lc;

import android.os.Bundle;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.startapp.startappsdk.R;
import dev.pankaj.yacinetv.ui.main.MainActivity;
import o1.k;
import o1.r;

public final /* synthetic */ class a implements k.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MainActivity f21246a;

    public /* synthetic */ a(MainActivity mainActivity) {
        this.f21246a = mainActivity;
    }

    public final void a(k kVar, r rVar, Bundle bundle) {
        MainActivity mainActivity = this.f21246a;
        int i10 = MainActivity.O;
        ud.k.f(mainActivity, "this$0");
        ud.k.f(rVar, "destination");
        if (rVar.f22806h == R.id.liveTvFragment) {
            BottomNavigationView bottomNavigationView = ((zb.a) mainActivity.L()).f28780b.f28786b;
            ud.k.e(bottomNavigationView, "binding.appBarMain.bottomNavigation");
            bottomNavigationView.setVisibility(0);
            ((zb.a) mainActivity.L()).f28781c.setDrawerLockMode(0);
            return;
        }
        ((zb.a) mainActivity.L()).f28781c.setDrawerLockMode(1);
        BottomNavigationView bottomNavigationView2 = ((zb.a) mainActivity.L()).f28780b.f28786b;
        ud.k.e(bottomNavigationView2, "binding.appBarMain.bottomNavigation");
        bottomNavigationView2.setVisibility(8);
    }
}
