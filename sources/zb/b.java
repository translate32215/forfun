package zb;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.startapp.startappsdk.R;
import e2.a;

/* compiled from: ActivitySplashBinding */
public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    public final ConstraintLayout f28783a;

    /* renamed from: b  reason: collision with root package name */
    public final AppCompatImageView f28784b;

    public b(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView) {
        this.f28783a = constraintLayout;
        this.f28784b = appCompatImageView;
    }

    public static b b(LayoutInflater layoutInflater) {
        View inflate = layoutInflater.inflate(R.layout.activity_splash, (ViewGroup) null, false);
        AppCompatImageView appCompatImageView = (AppCompatImageView) b8.a.d(inflate, R.id.logo);
        if (appCompatImageView != null) {
            return new b((ConstraintLayout) inflate, appCompatImageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.logo)));
    }

    public View a() {
        return this.f28783a;
    }
}
