package androidx.leanback.widget;

import android.view.animation.Animation;

/* compiled from: BaseCardView */
public class d implements Animation.AnimationListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f2336a;

    public d(b bVar) {
        this.f2336a = bVar;
    }

    public void onAnimationEnd(Animation animation) {
        if (((double) this.f2336a.f2300w) == 0.0d) {
            for (int i10 = 0; i10 < this.f2336a.f2290e.size(); i10++) {
                this.f2336a.f2290e.get(i10).setVisibility(8);
            }
        }
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }
}
