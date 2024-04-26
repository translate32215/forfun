package k9;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.floatingactionbutton.d;
import java.util.ArrayList;
import r9.b;

/* compiled from: FloatingActionButtonImplLollipop */
public class c extends d {
    public c(FloatingActionButton floatingActionButton, b bVar) {
        super(floatingActionButton, bVar);
    }

    public float e() {
        return this.f9271r.getElevation();
    }

    public void f(Rect rect) {
        if (FloatingActionButton.this.f9236s) {
            super.f(rect);
        } else if (!s()) {
            int sizeDimension = (0 - this.f9271r.getSizeDimension()) / 2;
            rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
        } else {
            rect.set(0, 0, 0, 0);
        }
    }

    public void i() {
    }

    public void j() {
        u();
        throw null;
    }

    public void k(int[] iArr) {
        if (Build.VERSION.SDK_INT != 21) {
            return;
        }
        if (this.f9271r.isEnabled()) {
            this.f9271r.setElevation(this.f9257d);
            if (this.f9271r.isPressed()) {
                this.f9271r.setTranslationZ(this.f9259f);
            } else if (this.f9271r.isFocused() || this.f9271r.isHovered()) {
                this.f9271r.setTranslationZ(this.f9258e);
            } else {
                this.f9271r.setTranslationZ(0.0f);
            }
        } else {
            this.f9271r.setElevation(0.0f);
            this.f9271r.setTranslationZ(0.0f);
        }
    }

    public void l(float f10, float f11, float f12) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 == 21) {
            this.f9271r.refreshDrawableState();
        } else {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(d.f9253z, v(f10, f12));
            stateListAnimator.addState(d.A, v(f10, f11));
            stateListAnimator.addState(d.B, v(f10, f11));
            stateListAnimator.addState(d.C, v(f10, f11));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.f9271r, "elevation", new float[]{f10}).setDuration(0));
            if (i10 >= 22 && i10 <= 24) {
                FloatingActionButton floatingActionButton = this.f9271r;
                arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, View.TRANSLATION_Z, new float[]{floatingActionButton.getTranslationZ()}).setDuration(100));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.f9271r, View.TRANSLATION_Z, new float[]{0.0f}).setDuration(100));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(d.f9252y);
            stateListAnimator.addState(d.D, animatorSet);
            stateListAnimator.addState(d.E, v(0.0f, 0.0f));
            this.f9271r.setStateListAnimator(stateListAnimator);
        }
        if (q()) {
            u();
            throw null;
        }
    }

    public void p(ColorStateList colorStateList) {
    }

    public boolean q() {
        return FloatingActionButton.this.f9236s || !s();
    }

    public void t() {
    }

    public final Animator v(float f10, float f11) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f9271r, "elevation", new float[]{f10}).setDuration(0)).with(ObjectAnimator.ofFloat(this.f9271r, View.TRANSLATION_Z, new float[]{f11}).setDuration(100));
        animatorSet.setInterpolator(d.f9252y);
        return animatorSet;
    }
}
