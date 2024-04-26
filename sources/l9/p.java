package l9;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import b2.j;
import b2.r;
import java.util.Map;

/* compiled from: TextScale */
public class p extends j {

    /* compiled from: TextScale */
    public class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TextView f21172a;

        public a(p pVar, TextView textView) {
            this.f21172a = textView;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.f21172a.setScaleX(floatValue);
            this.f21172a.setScaleY(floatValue);
        }
    }

    public final void K(r rVar) {
        View view = rVar.f3442b;
        if (view instanceof TextView) {
            rVar.f3441a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    public void d(r rVar) {
        K(rVar);
    }

    public void g(r rVar) {
        K(rVar);
    }

    public Animator l(ViewGroup viewGroup, r rVar, r rVar2) {
        if (rVar == null || rVar2 == null || !(rVar.f3442b instanceof TextView)) {
            return null;
        }
        View view = rVar2.f3442b;
        if (!(view instanceof TextView)) {
            return null;
        }
        TextView textView = (TextView) view;
        Map<String, Object> map = rVar.f3441a;
        Map<String, Object> map2 = rVar2.f3441a;
        float f10 = 1.0f;
        float floatValue = map.get("android:textscale:scale") != null ? ((Float) map.get("android:textscale:scale")).floatValue() : 1.0f;
        if (map2.get("android:textscale:scale") != null) {
            f10 = ((Float) map2.get("android:textscale:scale")).floatValue();
        }
        if (floatValue == f10) {
            return null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{floatValue, f10});
        ofFloat.addUpdateListener(new a(this, textView));
        return ofFloat;
    }
}
