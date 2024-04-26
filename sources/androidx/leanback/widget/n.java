package androidx.leanback.widget;

import android.animation.TimeAnimator;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.leanback.widget.b0;
import androidx.leanback.widget.x0;
import androidx.recyclerview.widget.RecyclerView;
import com.startapp.startappsdk.R;

/* compiled from: FocusHighlightHelper */
public class n {

    /* compiled from: FocusHighlightHelper */
    public static class a implements m {

        /* renamed from: a  reason: collision with root package name */
        public int f2421a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f2422b;

        public a(int i10, boolean z10) {
            if (i10 == 0 || n.a(i10) > 0) {
                this.f2421a = i10;
                this.f2422b = z10;
                return;
            }
            throw new IllegalArgumentException("Unhandled zoom index");
        }

        public void a(View view, boolean z10) {
            view.setSelected(z10);
            c(view).a(z10, false);
        }

        public void b(View view) {
            c(view).a(false, true);
        }

        public final b c(View view) {
            float f10;
            b bVar = (b) view.getTag(R.id.lb_focus_animator);
            if (bVar == null) {
                Resources resources = view.getResources();
                int i10 = this.f2421a;
                if (i10 == 0) {
                    f10 = 1.0f;
                } else {
                    f10 = resources.getFraction(n.a(i10), 1, 1);
                }
                bVar = new b(view, f10, this.f2422b, 150);
                view.setTag(R.id.lb_focus_animator, bVar);
            }
            return bVar;
        }
    }

    /* compiled from: FocusHighlightHelper */
    public static class b implements TimeAnimator.TimeListener {

        /* renamed from: a  reason: collision with root package name */
        public final View f2423a;

        /* renamed from: b  reason: collision with root package name */
        public final int f2424b;

        /* renamed from: c  reason: collision with root package name */
        public final d1 f2425c;

        /* renamed from: d  reason: collision with root package name */
        public final float f2426d;

        /* renamed from: e  reason: collision with root package name */
        public float f2427e = 0.0f;

        /* renamed from: f  reason: collision with root package name */
        public float f2428f;

        /* renamed from: g  reason: collision with root package name */
        public float f2429g;

        /* renamed from: h  reason: collision with root package name */
        public final TimeAnimator f2430h;

        /* renamed from: i  reason: collision with root package name */
        public final Interpolator f2431i;

        /* renamed from: j  reason: collision with root package name */
        public final f1.a f2432j;

        public b(View view, float f10, boolean z10, int i10) {
            TimeAnimator timeAnimator = new TimeAnimator();
            this.f2430h = timeAnimator;
            this.f2431i = new AccelerateDecelerateInterpolator();
            this.f2423a = view;
            this.f2424b = i10;
            this.f2426d = f10 - 1.0f;
            if (view instanceof d1) {
                this.f2425c = (d1) view;
            } else {
                this.f2425c = null;
            }
            timeAnimator.setTimeListener(this);
            if (z10) {
                this.f2432j = f1.a.a(view.getContext());
            } else {
                this.f2432j = null;
            }
        }

        public void a(boolean z10, boolean z11) {
            this.f2430h.end();
            float f10 = z10 ? 1.0f : 0.0f;
            if (z11) {
                b(f10);
                return;
            }
            float f11 = this.f2427e;
            if (f11 != f10) {
                this.f2428f = f11;
                this.f2429g = f10 - f11;
                this.f2430h.start();
            }
        }

        public void b(float f10) {
            this.f2427e = f10;
            float f11 = (this.f2426d * f10) + 1.0f;
            this.f2423a.setScaleX(f11);
            this.f2423a.setScaleY(f11);
            d1 d1Var = this.f2425c;
            if (d1Var != null) {
                d1Var.setShadowFocusLevel(f10);
            } else {
                e1.c(this.f2423a.getTag(R.id.lb_shadow_impl), 3, f10);
            }
            f1.a aVar = this.f2432j;
            if (aVar != null) {
                aVar.b(f10);
                int color = this.f2432j.f18076c.getColor();
                d1 d1Var2 = this.f2425c;
                if (d1Var2 != null) {
                    d1Var2.setOverlayColor(color);
                } else {
                    e1.b(this.f2423a, color);
                }
            }
        }

        public void onTimeUpdate(TimeAnimator timeAnimator, long j10, long j11) {
            float f10;
            int i10 = this.f2424b;
            if (j10 >= ((long) i10)) {
                f10 = 1.0f;
                this.f2430h.end();
            } else {
                double d10 = (double) j10;
                double d11 = (double) i10;
                Double.isNaN(d10);
                Double.isNaN(d11);
                f10 = (float) (d10 / d11);
            }
            Interpolator interpolator = this.f2431i;
            if (interpolator != null) {
                f10 = interpolator.getInterpolation(f10);
            }
            b((f10 * this.f2429g) + this.f2428f);
        }
    }

    /* compiled from: FocusHighlightHelper */
    public static class c implements m {

        /* renamed from: a  reason: collision with root package name */
        public boolean f2433a;

        /* renamed from: b  reason: collision with root package name */
        public float f2434b;

        /* renamed from: c  reason: collision with root package name */
        public int f2435c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f2436d;

        /* compiled from: FocusHighlightHelper */
        public static class a extends b {

            /* renamed from: k  reason: collision with root package name */
            public b0.d f2437k;

            public a(View view, float f10, int i10) {
                super(view, f10, false, i10);
                ViewParent parent = view.getParent();
                while (parent != null && !(parent instanceof RecyclerView)) {
                    parent = parent.getParent();
                }
                if (parent != null) {
                    this.f2437k = (b0.d) ((RecyclerView) parent).K(view);
                }
            }

            public void b(float f10) {
                b0.d dVar = this.f2437k;
                r0 r0Var = dVar.f2325u;
                if (r0Var instanceof x0) {
                    ((x0) r0Var).h((x0.a) dVar.f2326v, f10);
                }
                super.b(f10);
            }
        }

        public c(boolean z10) {
            this.f2436d = z10;
        }

        public void a(View view, boolean z10) {
            if (!this.f2433a) {
                Resources resources = view.getResources();
                TypedValue typedValue = new TypedValue();
                if (this.f2436d) {
                    resources.getValue(R.dimen.lb_browse_header_select_scale, typedValue, true);
                    this.f2434b = typedValue.getFloat();
                } else {
                    this.f2434b = 1.0f;
                }
                resources.getValue(R.dimen.lb_browse_header_select_duration, typedValue, true);
                this.f2435c = typedValue.data;
                this.f2433a = true;
            }
            view.setSelected(z10);
            b bVar = (b) view.getTag(R.id.lb_focus_animator);
            if (bVar == null) {
                bVar = new a(view, this.f2434b, this.f2435c);
                view.setTag(R.id.lb_focus_animator, bVar);
            }
            bVar.a(z10, false);
        }

        public void b(View view) {
        }
    }

    public static int a(int i10) {
        if (i10 == 1) {
            return R.fraction.lb_focus_zoom_factor_small;
        }
        if (i10 == 2) {
            return R.fraction.lb_focus_zoom_factor_medium;
        }
        if (i10 == 3) {
            return R.fraction.lb_focus_zoom_factor_large;
        }
        if (i10 != 4) {
            return 0;
        }
        return R.fraction.lb_focus_zoom_factor_xsmall;
    }
}
