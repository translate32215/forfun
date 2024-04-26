package androidx.leanback.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.view.View;
import com.startapp.startappsdk.R;

/* compiled from: TranslationAnimationCreator */
public class d {

    /* compiled from: TranslationAnimationCreator */
    public static class a extends AnimatorListenerAdapter implements Transition.TransitionListener {

        /* renamed from: a  reason: collision with root package name */
        public final View f2109a;

        /* renamed from: b  reason: collision with root package name */
        public final View f2110b;

        /* renamed from: c  reason: collision with root package name */
        public final int f2111c;

        /* renamed from: d  reason: collision with root package name */
        public final int f2112d;

        /* renamed from: e  reason: collision with root package name */
        public int[] f2113e;

        /* renamed from: f  reason: collision with root package name */
        public float f2114f;

        /* renamed from: g  reason: collision with root package name */
        public float f2115g;

        /* renamed from: h  reason: collision with root package name */
        public final float f2116h;

        /* renamed from: i  reason: collision with root package name */
        public final float f2117i;

        public a(View view, View view2, int i10, int i11, float f10, float f11) {
            this.f2110b = view;
            this.f2109a = view2;
            this.f2111c = i10 - Math.round(view.getTranslationX());
            this.f2112d = i11 - Math.round(view.getTranslationY());
            this.f2116h = f10;
            this.f2117i = f11;
            int[] iArr = (int[]) view2.getTag(R.id.transitionPosition);
            this.f2113e = iArr;
            if (iArr != null) {
                view2.setTag(R.id.transitionPosition, (Object) null);
            }
        }

        public void onAnimationCancel(Animator animator) {
            if (this.f2113e == null) {
                this.f2113e = new int[2];
            }
            this.f2113e[0] = Math.round(this.f2110b.getTranslationX() + ((float) this.f2111c));
            this.f2113e[1] = Math.round(this.f2110b.getTranslationY() + ((float) this.f2112d));
            this.f2109a.setTag(R.id.transitionPosition, this.f2113e);
        }

        public void onAnimationEnd(Animator animator) {
        }

        public void onAnimationPause(Animator animator) {
            this.f2114f = this.f2110b.getTranslationX();
            this.f2115g = this.f2110b.getTranslationY();
            this.f2110b.setTranslationX(this.f2116h);
            this.f2110b.setTranslationY(this.f2117i);
        }

        public void onAnimationResume(Animator animator) {
            this.f2110b.setTranslationX(this.f2114f);
            this.f2110b.setTranslationY(this.f2115g);
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            this.f2110b.setTranslationX(this.f2116h);
            this.f2110b.setTranslationY(this.f2117i);
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }

        public void onTransitionStart(Transition transition) {
        }
    }

    public static Animator a(View view, TransitionValues transitionValues, int i10, int i11, float f10, float f11, float f12, float f13, TimeInterpolator timeInterpolator, Transition transition) {
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) transitionValues.view.getTag(R.id.transitionPosition);
        if (iArr != null) {
            f10 = ((float) (iArr[0] - i10)) + translationX;
            f11 = ((float) (iArr[1] - i11)) + translationY;
        }
        int round = Math.round(f10 - translationX) + i10;
        int round2 = Math.round(f11 - translationY) + i11;
        view.setTranslationX(f10);
        view.setTranslationY(f11);
        if (f10 == f12 && f11 == f13) {
            return null;
        }
        Path path = new Path();
        path.moveTo(f10, f11);
        path.lineTo(f12, f13);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.TRANSLATION_X, View.TRANSLATION_Y, path);
        a aVar = new a(view, transitionValues.view, round, round2, translationX, translationY);
        transition.addListener(aVar);
        ofFloat.addListener(aVar);
        ofFloat.addPauseListener(aVar);
        ofFloat.setInterpolator(timeInterpolator);
        return ofFloat;
    }
}
