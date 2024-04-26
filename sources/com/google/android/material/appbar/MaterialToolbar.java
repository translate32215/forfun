package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.startapp.startappsdk.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import l9.r;
import l9.s;
import o0.c0;
import q.d;
import s9.f;
import w9.a;

public class MaterialToolbar extends Toolbar {

    /* renamed from: l0  reason: collision with root package name */
    public static final ImageView.ScaleType[] f8914l0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* renamed from: g0  reason: collision with root package name */
    public Integer f8915g0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f8916h0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f8917i0;

    /* renamed from: j0  reason: collision with root package name */
    public ImageView.ScaleType f8918j0;

    /* renamed from: k0  reason: collision with root package name */
    public Boolean f8919k0;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.toolbarStyle, 2132083896), attributeSet, R.attr.toolbarStyle);
        Context context2 = getContext();
        int i10 = 0;
        TypedArray d10 = r.d(context2, attributeSet, t8.a.f25859z, R.attr.toolbarStyle, 2132083896, new int[0]);
        if (d10.hasValue(2)) {
            setNavigationIconTint(d10.getColor(2, -1));
        }
        this.f8916h0 = d10.getBoolean(4, false);
        this.f8917i0 = d10.getBoolean(3, false);
        int i11 = d10.getInt(1, -1);
        if (i11 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f8914l0;
            if (i11 < scaleTypeArr.length) {
                this.f8918j0 = scaleTypeArr[i11];
            }
        }
        if (d10.hasValue(0)) {
            this.f8919k0 = Boolean.valueOf(d10.getBoolean(0, false));
        }
        d10.recycle();
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            f fVar = new f();
            fVar.r(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : i10));
            fVar.f25079a.f25099b = new i9.a(context2);
            fVar.z();
            fVar.q(c0.l(this));
            c0.d.q(this, fVar);
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f8918j0;
    }

    public Integer getNavigationIconTint() {
        return this.f8915g0;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof f) {
            d.d(this, (f) background);
        }
    }

    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = 0;
        ImageView imageView = null;
        if (this.f8916h0 || this.f8917i0) {
            List<TextView> a10 = s.a(this, getTitle());
            TextView textView = ((ArrayList) a10).isEmpty() ? null : (TextView) Collections.min(a10, s.f21175a);
            List<TextView> a11 = s.a(this, getSubtitle());
            TextView textView2 = ((ArrayList) a11).isEmpty() ? null : (TextView) Collections.max(a11, s.f21175a);
            if (!(textView == null && textView2 == null)) {
                int measuredWidth = getMeasuredWidth();
                int i15 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i16 = 0; i16 < getChildCount(); i16++) {
                    View childAt = getChildAt(i16);
                    if (!(childAt.getVisibility() == 8 || childAt == textView || childAt == textView2)) {
                        if (childAt.getRight() < i15 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i15 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.f8916h0 && textView != null) {
                    z(textView, pair);
                }
                if (this.f8917i0 && textView2 != null) {
                    z(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        while (true) {
            if (i14 >= getChildCount()) {
                break;
            }
            View childAt2 = getChildAt(i14);
            if (childAt2 instanceof ImageView) {
                ImageView imageView2 = (ImageView) childAt2;
                if (logo != null && imageView2.getDrawable().getConstantState().equals(logo.getConstantState())) {
                    imageView = imageView2;
                    break;
                }
            }
            i14++;
        }
        if (imageView != null) {
            Boolean bool = this.f8919k0;
            if (bool != null) {
                imageView.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f8918j0;
            if (scaleType != null) {
                imageView.setScaleType(scaleType);
            }
        }
    }

    public void setElevation(float f10) {
        super.setElevation(f10);
        d.c(this, f10);
    }

    public void setLogoAdjustViewBounds(boolean z10) {
        Boolean bool = this.f8919k0;
        if (bool == null || bool.booleanValue() != z10) {
            this.f8919k0 = Boolean.valueOf(z10);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f8918j0 != scaleType) {
            this.f8918j0 = scaleType;
            requestLayout();
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (!(drawable == null || this.f8915g0 == null)) {
            drawable = androidx.core.graphics.drawable.a.n(drawable.mutate());
            androidx.core.graphics.drawable.a.k(drawable, this.f8915g0.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i10) {
        this.f8915g0 = Integer.valueOf(i10);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z10) {
        if (this.f8917i0 != z10) {
            this.f8917i0 = z10;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z10) {
        if (this.f8916h0 != z10) {
            this.f8916h0 = z10;
            requestLayout();
        }
    }

    public final void z(View view, Pair<Integer, Integer> pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = view.getMeasuredWidth();
        int i10 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i11 = measuredWidth2 + i10;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i10, 0), Math.max(i11 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i10 += max;
            i11 -= max;
            view.measure(View.MeasureSpec.makeMeasureSpec(i11 - i10, 1073741824), view.getMeasuredHeightAndState());
        }
        view.layout(i10, view.getTop(), i11, view.getBottom());
    }
}
