package b2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import java.util.WeakHashMap;
import o0.c0;

/* compiled from: Fade */
public class d extends h0 {

    /* compiled from: Fade */
    public class a extends m {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f3360a;

        public a(d dVar, View view) {
            this.f3360a = view;
        }

        public void e(j jVar) {
            View view = this.f3360a;
            f0 f0Var = z.f3458a;
            f0Var.e(view, 1.0f);
            f0Var.a(this.f3360a);
            jVar.x(this);
        }
    }

    /* compiled from: Fade */
    public static class b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final View f3361a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f3362b = false;

        public b(View view) {
            this.f3361a = view;
        }

        public void onAnimationEnd(Animator animator) {
            z.f3458a.e(this.f3361a, 1.0f);
            if (this.f3362b) {
                this.f3361a.setLayerType(0, (Paint) null);
            }
        }

        public void onAnimationStart(Animator animator) {
            View view = this.f3361a;
            WeakHashMap<View, String> weakHashMap = c0.f22553a;
            if (c0.d.h(view) && this.f3361a.getLayerType() == 0) {
                this.f3362b = true;
                this.f3361a.setLayerType(2, (Paint) null);
            }
        }
    }

    public d(int i10) {
        if ((i10 & -4) == 0) {
            this.F = i10;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    public Animator O(ViewGroup viewGroup, View view, r rVar, r rVar2) {
        z.f3458a.c(view);
        Float f10 = (Float) rVar.f3441a.get("android:fade:transitionAlpha");
        return P(view, f10 != null ? f10.floatValue() : 1.0f, 0.0f);
    }

    public final Animator P(View view, float f10, float f11) {
        if (f10 == f11) {
            return null;
        }
        z.f3458a.e(view, f10);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, z.f3459b, new float[]{f11});
        ofFloat.addListener(new b(view));
        a(new a(this, view));
        return ofFloat;
    }

    public void g(r rVar) {
        K(rVar);
        rVar.f3441a.put("android:fade:transitionAlpha", Float.valueOf(z.a(rVar.f3442b)));
    }

    public d() {
    }
}
