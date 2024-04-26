package n9;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.os.Build;
import android.view.ViewTreeObserver;
import com.google.android.material.navigation.NavigationView;
import l9.j;

/* compiled from: NavigationView */
public class g implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ NavigationView f22470a;

    public g(NavigationView navigationView) {
        this.f22470a = navigationView;
    }

    public void onGlobalLayout() {
        Activity activity;
        NavigationView navigationView = this.f22470a;
        navigationView.getLocationOnScreen(navigationView.f9370r);
        NavigationView navigationView2 = this.f22470a;
        boolean z10 = true;
        boolean z11 = navigationView2.f9370r[1] == 0;
        j jVar = navigationView2.f9367g;
        if (jVar.D != z11) {
            jVar.D = z11;
            jVar.m();
        }
        NavigationView navigationView3 = this.f22470a;
        navigationView3.setDrawTopInsetForeground(z11 && navigationView3.f9373u);
        Context context = this.f22470a.getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                activity = null;
                break;
            } else if (context instanceof Activity) {
                activity = (Activity) context;
                break;
            } else {
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        if (activity != null && Build.VERSION.SDK_INT >= 21) {
            boolean z12 = activity.findViewById(16908290).getHeight() == this.f22470a.getHeight();
            boolean z13 = Color.alpha(activity.getWindow().getNavigationBarColor()) != 0;
            NavigationView navigationView4 = this.f22470a;
            if (!z12 || !z13 || !navigationView4.f9374v) {
                z10 = false;
            }
            navigationView4.setDrawBottomInsetForeground(z10);
        }
    }
}
