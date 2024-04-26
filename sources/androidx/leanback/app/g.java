package androidx.leanback.app;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.p;
import androidx.leanback.transition.b;
import androidx.leanback.widget.TitleView;
import androidx.leanback.widget.o1;
import androidx.leanback.widget.p1;
import com.startapp.startappsdk.R;

/* compiled from: BrandedSupportFragment */
public class g extends p {

    /* renamed from: n0  reason: collision with root package name */
    public boolean f1947n0 = true;

    /* renamed from: o0  reason: collision with root package name */
    public CharSequence f1948o0;

    /* renamed from: p0  reason: collision with root package name */
    public Drawable f1949p0;

    /* renamed from: q0  reason: collision with root package name */
    public View f1950q0;

    /* renamed from: r0  reason: collision with root package name */
    public p1 f1951r0;

    /* renamed from: s0  reason: collision with root package name */
    public View.OnClickListener f1952s0;

    /* renamed from: t0  reason: collision with root package name */
    public o1 f1953t0;

    public void R() {
        this.O = true;
        this.f1953t0 = null;
    }

    public void V() {
        p1 p1Var = this.f1951r0;
        if (p1Var != null) {
            p1Var.a(false);
        }
        this.O = true;
    }

    public void Z() {
        this.O = true;
        p1 p1Var = this.f1951r0;
        if (p1Var != null) {
            p1Var.a(true);
        }
    }

    public void a0(Bundle bundle) {
        bundle.putBoolean("titleShow", this.f1947n0);
    }

    public void b0() {
        this.O = true;
        if (this.f1951r0 != null) {
            v0(this.f1947n0);
            this.f1951r0.a(true);
        }
    }

    public void d0(View view, Bundle bundle) {
        if (bundle != null) {
            this.f1947n0 = bundle.getBoolean("titleShow");
        }
        View view2 = this.f1950q0;
        if (view2 != null && (view instanceof ViewGroup)) {
            o1 o1Var = new o1((ViewGroup) view, view2);
            this.f1953t0 = o1Var;
            if (this.f1947n0) {
                b.d(o1Var.f2458e, o1Var.f2457d);
            } else {
                b.d(o1Var.f2459f, o1Var.f2456c);
            }
        }
    }

    public void r0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        TypedValue typedValue = new TypedValue();
        View inflate = layoutInflater.inflate(viewGroup.getContext().getTheme().resolveAttribute(R.attr.browseTitleViewLayout, typedValue, true) ? typedValue.resourceId : R.layout.lb_browse_title, viewGroup, false);
        if (inflate != null) {
            viewGroup.addView(inflate);
            t0(inflate.findViewById(R.id.browse_title_group));
            return;
        }
        t0((View) null);
    }

    public void s0(CharSequence charSequence) {
        this.f1948o0 = charSequence;
        p1 p1Var = this.f1951r0;
        if (p1Var != null) {
            TitleView.this.setTitle(charSequence);
        }
    }

    public void t0(View view) {
        this.f1950q0 = view;
        if (view == null) {
            this.f1951r0 = null;
            this.f1953t0 = null;
            return;
        }
        p1 titleViewAdapter = ((p1.a) view).getTitleViewAdapter();
        this.f1951r0 = titleViewAdapter;
        TitleView.this.setTitle(this.f1948o0);
        p1 p1Var = this.f1951r0;
        TitleView.this.setBadgeDrawable(this.f1949p0);
        View.OnClickListener onClickListener = this.f1952s0;
        if (onClickListener != null) {
            this.f1952s0 = onClickListener;
            p1 p1Var2 = this.f1951r0;
            if (p1Var2 != null) {
                TitleView.this.setOnSearchClickedListener(onClickListener);
            }
        }
        View view2 = this.Q;
        if (view2 instanceof ViewGroup) {
            this.f1953t0 = new o1((ViewGroup) view2, this.f1950q0);
        }
    }

    public void u0(int i10) {
        p1 p1Var = this.f1951r0;
        if (p1Var != null) {
            TitleView titleView = TitleView.this;
            titleView.f2279d = i10;
            if ((i10 & 2) == 2) {
                titleView.a();
            } else {
                titleView.f2276a.setVisibility(8);
                titleView.f2277b.setVisibility(8);
            }
            int i11 = 4;
            if (titleView.f2280e && (titleView.f2279d & 4) == 4) {
                i11 = 0;
            }
            titleView.f2278c.setVisibility(i11);
        }
        v0(true);
    }

    public void v0(boolean z10) {
        if (z10 != this.f1947n0) {
            this.f1947n0 = z10;
            o1 o1Var = this.f1953t0;
            if (o1Var == null) {
                return;
            }
            if (z10) {
                b.d(o1Var.f2458e, o1Var.f2457d);
            } else {
                b.d(o1Var.f2459f, o1Var.f2456c);
            }
        }
    }
}
