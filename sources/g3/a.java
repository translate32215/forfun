package g3;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.os.Build;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: BaseLottieAnimator */
public abstract class a extends ValueAnimator {

    /* renamed from: a  reason: collision with root package name */
    public final Set<ValueAnimator.AnimatorUpdateListener> f18420a = new CopyOnWriteArraySet();

    /* renamed from: b  reason: collision with root package name */
    public final Set<Animator.AnimatorListener> f18421b = new CopyOnWriteArraySet();

    public void a(boolean z10) {
        for (Animator.AnimatorListener next : this.f18421b) {
            if (Build.VERSION.SDK_INT >= 26) {
                next.onAnimationEnd(this, z10);
            } else {
                next.onAnimationEnd(this);
            }
        }
    }

    public void addListener(Animator.AnimatorListener animatorListener) {
        this.f18421b.add(animatorListener);
    }

    public void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f18420a.add(animatorUpdateListener);
    }

    public void b() {
        for (ValueAnimator.AnimatorUpdateListener onAnimationUpdate : this.f18420a) {
            onAnimationUpdate.onAnimationUpdate(this);
        }
    }

    public long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    public void removeAllListeners() {
        this.f18421b.clear();
    }

    public void removeAllUpdateListeners() {
        this.f18420a.clear();
    }

    public void removeListener(Animator.AnimatorListener animatorListener) {
        this.f18421b.remove(animatorListener);
    }

    public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f18420a.remove(animatorUpdateListener);
    }

    public void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    public void setStartDelay(long j10) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }

    public ValueAnimator setDuration(long j10) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }
}
