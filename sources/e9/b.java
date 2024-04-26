package e9;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewAnimationUtils;
import e9.e;

/* compiled from: CircularRevealCompat */
public final class b {
    public static Animator a(e eVar, float f10, float f11, float f12) {
        ObjectAnimator ofObject = ObjectAnimator.ofObject(eVar, e.c.f17808a, e.b.f17806b, new e.C0133e[]{new e.C0133e(f10, f11, f12)});
        if (Build.VERSION.SDK_INT < 21) {
            return ofObject;
        }
        e.C0133e revealInfo = eVar.getRevealInfo();
        if (revealInfo != null) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal((View) eVar, (int) f10, (int) f11, revealInfo.f17812c, f12);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(new Animator[]{ofObject, createCircularReveal});
            return animatorSet;
        }
        throw new IllegalStateException("Caller must set a non-null RevealInfo before calling this.");
    }
}
