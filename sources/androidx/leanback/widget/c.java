package androidx.leanback.widget;

import android.view.animation.Animation;

/* compiled from: BaseCardView */
public class c implements Animation.AnimationListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f2330a;

    public c(b bVar) {
        this.f2330a = bVar;
    }

    public void onAnimationEnd(Animation animation) {
        if (this.f2330a.f2299v == 0.0f) {
            for (int i10 = 0; i10 < this.f2330a.f2290e.size(); i10++) {
                this.f2330a.f2290e.get(i10).setVisibility(8);
            }
        }
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }
}
