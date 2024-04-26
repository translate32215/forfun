package l9;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.util.ArrayList;

/* compiled from: StateListAnimator */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList<b> f21158a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public b f21159b = null;

    /* renamed from: c  reason: collision with root package name */
    public ValueAnimator f21160c = null;

    /* renamed from: d  reason: collision with root package name */
    public final Animator.AnimatorListener f21161d = new a();

    /* compiled from: StateListAnimator */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        public void onAnimationEnd(Animator animator) {
            n nVar = n.this;
            if (nVar.f21160c == animator) {
                nVar.f21160c = null;
            }
        }
    }

    /* compiled from: StateListAnimator */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final int[] f21163a;

        /* renamed from: b  reason: collision with root package name */
        public final ValueAnimator f21164b;

        public b(int[] iArr, ValueAnimator valueAnimator) {
            this.f21163a = iArr;
            this.f21164b = valueAnimator;
        }
    }

    public void a(int[] iArr, ValueAnimator valueAnimator) {
        b bVar = new b(iArr, valueAnimator);
        valueAnimator.addListener(this.f21161d);
        this.f21158a.add(bVar);
    }
}
