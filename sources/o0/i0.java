package o0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.lang.ref.WeakReference;

/* compiled from: ViewPropertyAnimatorCompat */
public final class i0 {

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<View> f22585a;

    /* compiled from: ViewPropertyAnimatorCompat */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ j0 f22586a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f22587b;

        public a(i0 i0Var, j0 j0Var, View view) {
            this.f22586a = j0Var;
            this.f22587b = view;
        }

        public void onAnimationCancel(Animator animator) {
            this.f22586a.a(this.f22587b);
        }

        public void onAnimationEnd(Animator animator) {
            this.f22586a.b(this.f22587b);
        }

        public void onAnimationStart(Animator animator) {
            this.f22586a.c(this.f22587b);
        }
    }

    /* compiled from: ViewPropertyAnimatorCompat */
    public static class b {
        public static ViewPropertyAnimator a(ViewPropertyAnimator viewPropertyAnimator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
            return viewPropertyAnimator.setUpdateListener(animatorUpdateListener);
        }
    }

    public i0(View view) {
        this.f22585a = new WeakReference<>(view);
    }

    public i0 a(float f10) {
        View view = (View) this.f22585a.get();
        if (view != null) {
            view.animate().alpha(f10);
        }
        return this;
    }

    public void b() {
        View view = (View) this.f22585a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public i0 c(long j10) {
        View view = (View) this.f22585a.get();
        if (view != null) {
            view.animate().setDuration(j10);
        }
        return this;
    }

    public i0 d(j0 j0Var) {
        View view = (View) this.f22585a.get();
        if (view != null) {
            e(view, j0Var);
        }
        return this;
    }

    public final void e(View view, j0 j0Var) {
        if (j0Var != null) {
            view.animate().setListener(new a(this, j0Var, view));
        } else {
            view.animate().setListener((Animator.AnimatorListener) null);
        }
    }

    public i0 f(l0 l0Var) {
        View view = (View) this.f22585a.get();
        if (view != null && Build.VERSION.SDK_INT >= 19) {
            h0 h0Var = null;
            if (l0Var != null) {
                h0Var = new h0(l0Var, view);
            }
            b.a(view.animate(), h0Var);
        }
        return this;
    }

    public i0 g(float f10) {
        View view = (View) this.f22585a.get();
        if (view != null) {
            view.animate().translationY(f10);
        }
        return this;
    }
}
