package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.j1;
import androidx.appcompat.widget.o0;
import com.startapp.startappsdk.R;
import java.util.WeakHashMap;
import l9.g;
import o0.c0;
import p0.c;
import s0.i;

public class NavigationMenuItemView extends g implements j.a {
    public static final int[] N = {16842912};
    public int D;
    public boolean E;
    public boolean F;
    public final CheckedTextView G;
    public FrameLayout H;
    public androidx.appcompat.view.menu.g I;
    public ColorStateList J;
    public boolean K;
    public Drawable L;
    public final o0.a M;

    public class a extends o0.a {
        public a() {
        }

        public void d(View view, c cVar) {
            this.f22536a.onInitializeAccessibilityNodeInfo(view, cVar.f23748a);
            cVar.f23748a.setCheckable(NavigationMenuItemView.this.F);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a aVar = new a();
        this.M = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(R.layout.design_navigation_menu_item, this, true);
        setIconSize(context.getResources().getDimensionPixelSize(R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(R.id.design_menu_item_text);
        this.G = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        c0.C(checkedTextView, aVar);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.H == null) {
                this.H = (FrameLayout) ((ViewStub) findViewById(R.id.design_menu_item_action_area_stub)).inflate();
            }
            this.H.removeAllViews();
            this.H.addView(view);
        }
    }

    public void d(androidx.appcompat.view.menu.g gVar, int i10) {
        StateListDrawable stateListDrawable;
        this.I = gVar;
        int i11 = gVar.f564a;
        if (i11 > 0) {
            setId(i11);
        }
        setVisibility(gVar.isVisible() ? 0 : 8);
        boolean z10 = true;
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(N, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap<View, String> weakHashMap = c0.f22553a;
            c0.d.q(this, stateListDrawable);
        }
        setCheckable(gVar.isCheckable());
        setChecked(gVar.isChecked());
        setEnabled(gVar.isEnabled());
        setTitle(gVar.f568e);
        setIcon(gVar.getIcon());
        setActionView(gVar.getActionView());
        setContentDescription(gVar.f580q);
        j1.a(this, gVar.f581r);
        androidx.appcompat.view.menu.g gVar2 = this.I;
        if (!(gVar2.f568e == null && gVar2.getIcon() == null && this.I.getActionView() != null)) {
            z10 = false;
        }
        if (z10) {
            this.G.setVisibility(8);
            FrameLayout frameLayout = this.H;
            if (frameLayout != null) {
                o0.a aVar = (o0.a) frameLayout.getLayoutParams();
                aVar.width = -1;
                this.H.setLayoutParams(aVar);
                return;
            }
            return;
        }
        this.G.setVisibility(0);
        FrameLayout frameLayout2 = this.H;
        if (frameLayout2 != null) {
            o0.a aVar2 = (o0.a) frameLayout2.getLayoutParams();
            aVar2.width = -2;
            this.H.setLayoutParams(aVar2);
        }
    }

    public androidx.appcompat.view.menu.g getItemData() {
        return this.I;
    }

    public int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        androidx.appcompat.view.menu.g gVar = this.I;
        if (gVar != null && gVar.isCheckable() && this.I.isChecked()) {
            ViewGroup.mergeDrawableStates(onCreateDrawableState, N);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z10) {
        refreshDrawableState();
        if (this.F != z10) {
            this.F = z10;
            this.M.h(this.G, 2048);
        }
    }

    public void setChecked(boolean z10) {
        refreshDrawableState();
        this.G.setChecked(z10);
    }

    public void setHorizontalPadding(int i10) {
        setPadding(i10, getPaddingTop(), i10, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.K) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = androidx.core.graphics.drawable.a.n(drawable).mutate();
                androidx.core.graphics.drawable.a.l(drawable, this.J);
            }
            int i10 = this.D;
            drawable.setBounds(0, 0, i10, i10);
        } else if (this.E) {
            if (this.L == null) {
                Drawable a10 = f0.g.a(getResources(), R.drawable.navigation_empty_icon, getContext().getTheme());
                this.L = a10;
                if (a10 != null) {
                    int i11 = this.D;
                    a10.setBounds(0, 0, i11, i11);
                }
            }
            drawable = this.L;
        }
        i.c(this.G, drawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public void setIconPadding(int i10) {
        this.G.setCompoundDrawablePadding(i10);
    }

    public void setIconSize(int i10) {
        this.D = i10;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.J = colorStateList;
        this.K = colorStateList != null;
        androidx.appcompat.view.menu.g gVar = this.I;
        if (gVar != null) {
            setIcon(gVar.getIcon());
        }
    }

    public void setMaxLines(int i10) {
        this.G.setMaxLines(i10);
    }

    public void setNeedsEmptyIcon(boolean z10) {
        this.E = z10;
    }

    public void setTextAppearance(int i10) {
        i.h(this.G, i10);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.G.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.G.setText(charSequence);
    }
}
