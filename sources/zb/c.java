package zb;

import android.view.View;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import e2.a;

/* compiled from: AppBarMainBinding */
public final class c implements a {

    /* renamed from: a  reason: collision with root package name */
    public final CoordinatorLayout f28785a;

    /* renamed from: b  reason: collision with root package name */
    public final BottomNavigationView f28786b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f28787c;

    /* renamed from: d  reason: collision with root package name */
    public final MaterialToolbar f28788d;

    public c(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, BottomNavigationView bottomNavigationView, TextView textView, MaterialToolbar materialToolbar) {
        this.f28785a = coordinatorLayout;
        this.f28786b = bottomNavigationView;
        this.f28787c = textView;
        this.f28788d = materialToolbar;
    }

    public View a() {
        return this.f28785a;
    }
}
