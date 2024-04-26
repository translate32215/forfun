package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import com.startapp.startappsdk.R;
import e.l;
import java.util.WeakHashMap;
import o0.c0;

public class ActionBarContextView extends a {
    public boolean A;
    public int B;

    /* renamed from: i  reason: collision with root package name */
    public CharSequence f634i;

    /* renamed from: r  reason: collision with root package name */
    public CharSequence f635r;

    /* renamed from: s  reason: collision with root package name */
    public View f636s;

    /* renamed from: t  reason: collision with root package name */
    public View f637t;

    /* renamed from: u  reason: collision with root package name */
    public View f638u;

    /* renamed from: v  reason: collision with root package name */
    public LinearLayout f639v;

    /* renamed from: w  reason: collision with root package name */
    public TextView f640w;

    /* renamed from: x  reason: collision with root package name */
    public TextView f641x;

    /* renamed from: y  reason: collision with root package name */
    public int f642y;

    /* renamed from: z  reason: collision with root package name */
    public int f643z;

    public class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ j.a f644a;

        public a(ActionBarContextView actionBarContextView, j.a aVar) {
            this.f644a = aVar;
        }

        public void onClick(View view) {
            this.f644a.c();
        }
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.actionModeStyle);
        Drawable drawable;
        int resourceId;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f13504d, R.attr.actionModeStyle, 0);
        if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawable = obtainStyledAttributes.getDrawable(0);
        } else {
            drawable = g.a.b(context, resourceId);
        }
        WeakHashMap<View, String> weakHashMap = c0.f22553a;
        c0.d.q(this, drawable);
        this.f642y = obtainStyledAttributes.getResourceId(5, 0);
        this.f643z = obtainStyledAttributes.getResourceId(4, 0);
        this.f794e = obtainStyledAttributes.getLayoutDimension(3, 0);
        this.B = obtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
    }

    public void f(j.a aVar) {
        View view = this.f636s;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.B, this, false);
            this.f636s = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.f636s);
        }
        View findViewById = this.f636s.findViewById(R.id.action_mode_close_button);
        this.f637t = findViewById;
        findViewById.setOnClickListener(new a(this, aVar));
        e eVar = (e) aVar.e();
        c cVar = this.f793d;
        if (cVar != null) {
            cVar.b();
        }
        c cVar2 = new c(getContext());
        this.f793d = cVar2;
        cVar2.f847u = true;
        cVar2.f848v = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        eVar.b(this.f793d, this.f791b);
        c cVar3 = this.f793d;
        j jVar = cVar3.f493h;
        if (jVar == null) {
            j jVar2 = (j) cVar3.f489d.inflate(cVar3.f491f, this, false);
            cVar3.f493h = jVar2;
            jVar2.b(cVar3.f488c);
            cVar3.g(true);
        }
        j jVar3 = cVar3.f493h;
        if (jVar != jVar3) {
            ((ActionMenuView) jVar3).setPresenter(cVar3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) jVar3;
        this.f792c = actionMenuView;
        WeakHashMap<View, String> weakHashMap = c0.f22553a;
        c0.d.q(actionMenuView, (Drawable) null);
        addView(this.f792c, layoutParams);
    }

    public final void g() {
        if (this.f639v == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f639v = linearLayout;
            this.f640w = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f641x = (TextView) this.f639v.findViewById(R.id.action_bar_subtitle);
            if (this.f642y != 0) {
                this.f640w.setTextAppearance(getContext(), this.f642y);
            }
            if (this.f643z != 0) {
                this.f641x.setTextAppearance(getContext(), this.f643z);
            }
        }
        this.f640w.setText(this.f634i);
        this.f641x.setText(this.f635r);
        boolean z10 = !TextUtils.isEmpty(this.f634i);
        boolean z11 = !TextUtils.isEmpty(this.f635r);
        int i10 = 0;
        this.f641x.setVisibility(z11 ? 0 : 8);
        LinearLayout linearLayout2 = this.f639v;
        if (!z10 && !z11) {
            i10 = 8;
        }
        linearLayout2.setVisibility(i10);
        if (this.f639v.getParent() == null) {
            addView(this.f639v);
        }
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f635r;
    }

    public CharSequence getTitle() {
        return this.f634i;
    }

    public void h() {
        removeAllViews();
        this.f638u = null;
        this.f792c = null;
        this.f793d = null;
        View view = this.f637t;
        if (view != null) {
            view.setOnClickListener((View.OnClickListener) null);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c cVar = this.f793d;
        if (cVar != null) {
            cVar.m();
            this.f793d.n();
        }
    }

    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean b10 = n1.b(this);
        int paddingRight = b10 ? (i12 - i10) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
        View view = this.f636s;
        if (!(view == null || view.getVisibility() == 8)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f636s.getLayoutParams();
            int i14 = b10 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i15 = b10 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i16 = b10 ? paddingRight - i14 : paddingRight + i14;
            int d10 = i16 + d(this.f636s, i16, paddingTop, paddingTop2, b10);
            paddingRight = b10 ? d10 - i15 : d10 + i15;
        }
        int i17 = paddingRight;
        LinearLayout linearLayout = this.f639v;
        if (!(linearLayout == null || this.f638u != null || linearLayout.getVisibility() == 8)) {
            i17 += d(this.f639v, i17, paddingTop, paddingTop2, b10);
        }
        int i18 = i17;
        View view2 = this.f638u;
        if (view2 != null) {
            d(view2, i18, paddingTop, paddingTop2, b10);
        }
        int paddingLeft = b10 ? getPaddingLeft() : (i12 - i10) - getPaddingRight();
        ActionMenuView actionMenuView = this.f792c;
        if (actionMenuView != null) {
            d(actionMenuView, paddingLeft, paddingTop, paddingTop2, !b10);
        }
    }

    public void onMeasure(int i10, int i11) {
        int i12 = 1073741824;
        if (View.MeasureSpec.getMode(i10) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        } else if (View.MeasureSpec.getMode(i11) != 0) {
            int size = View.MeasureSpec.getSize(i10);
            int i13 = this.f794e;
            if (i13 <= 0) {
                i13 = View.MeasureSpec.getSize(i11);
            }
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
            int i14 = i13 - paddingBottom;
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i14, Integer.MIN_VALUE);
            View view = this.f636s;
            if (view != null) {
                int c10 = c(view, paddingLeft, makeMeasureSpec, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f636s.getLayoutParams();
                paddingLeft = c10 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
            }
            ActionMenuView actionMenuView = this.f792c;
            if (actionMenuView != null && actionMenuView.getParent() == this) {
                paddingLeft = c(this.f792c, paddingLeft, makeMeasureSpec, 0);
            }
            LinearLayout linearLayout = this.f639v;
            if (linearLayout != null && this.f638u == null) {
                if (this.A) {
                    this.f639v.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                    int measuredWidth = this.f639v.getMeasuredWidth();
                    boolean z10 = measuredWidth <= paddingLeft;
                    if (z10) {
                        paddingLeft -= measuredWidth;
                    }
                    this.f639v.setVisibility(z10 ? 0 : 8);
                } else {
                    paddingLeft = c(linearLayout, paddingLeft, makeMeasureSpec, 0);
                }
            }
            View view2 = this.f638u;
            if (view2 != null) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                int i15 = layoutParams.width;
                int i16 = i15 != -2 ? 1073741824 : Integer.MIN_VALUE;
                if (i15 >= 0) {
                    paddingLeft = Math.min(i15, paddingLeft);
                }
                int i17 = layoutParams.height;
                if (i17 == -2) {
                    i12 = Integer.MIN_VALUE;
                }
                if (i17 >= 0) {
                    i14 = Math.min(i17, i14);
                }
                this.f638u.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i16), View.MeasureSpec.makeMeasureSpec(i14, i12));
            }
            if (this.f794e <= 0) {
                int childCount = getChildCount();
                int i18 = 0;
                for (int i19 = 0; i19 < childCount; i19++) {
                    int measuredHeight = getChildAt(i19).getMeasuredHeight() + paddingBottom;
                    if (measuredHeight > i18) {
                        i18 = measuredHeight;
                    }
                }
                setMeasuredDimension(size, i18);
                return;
            }
            setMeasuredDimension(size, i13);
        } else {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
    }

    public void setContentHeight(int i10) {
        this.f794e = i10;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f638u;
        if (view2 != null) {
            removeView(view2);
        }
        this.f638u = view;
        if (!(view == null || (linearLayout = this.f639v) == null)) {
            removeView(linearLayout);
            this.f639v = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f635r = charSequence;
        g();
    }

    public void setTitle(CharSequence charSequence) {
        this.f634i = charSequence;
        g();
        c0.E(this, charSequence);
    }

    public void setTitleOptional(boolean z10) {
        if (z10 != this.A) {
            requestLayout();
        }
        this.A = z10;
    }

    public /* bridge */ /* synthetic */ void setVisibility(int i10) {
        super.setVisibility(i10);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
