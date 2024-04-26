package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.g1;
import com.startapp.startappsdk.R;
import l9.r;
import l9.u;
import n9.f;
import y8.c;

public class BottomNavigationView extends f {

    @Deprecated
    public interface a extends f.b {
    }

    @Deprecated
    public interface b extends f.c {
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.bottomNavigationStyle, 2132083554);
        Context context2 = getContext();
        boolean z10 = false;
        g1 e10 = r.e(context2, attributeSet, t8.a.f25837d, R.attr.bottomNavigationStyle, 2132083554, new int[0]);
        setItemHorizontalTranslationEnabled(e10.a(1, true));
        if (e10.p(0)) {
            setMinimumHeight(e10.f(0, 0));
        }
        e10.f924b.recycle();
        if (Build.VERSION.SDK_INT < 21 && !(getBackground() instanceof s9.f)) {
            z10 = true;
        }
        if (z10) {
            View view = new View(context2);
            view.setBackgroundColor(d0.a.b(context2, R.color.design_bottom_navigation_shadow_color));
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, getResources().getDimensionPixelSize(R.dimen.design_bottom_navigation_shadow_height)));
            addView(view);
        }
        u.a(this, new c(this));
    }

    public int getMaxItemCount() {
        return 5;
    }

    public void onMeasure(int i10, int i11) {
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        if (View.MeasureSpec.getMode(i11) != 1073741824 && suggestedMinimumHeight > 0) {
            int paddingTop = getPaddingTop();
            i11 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i11), getPaddingBottom() + paddingTop + suggestedMinimumHeight), 1073741824);
        }
        super.onMeasure(i10, i11);
    }

    public void setItemHorizontalTranslationEnabled(boolean z10) {
        y8.b bVar = (y8.b) getMenuView();
        if (bVar.Q != z10) {
            bVar.setItemHorizontalTranslationEnabled(z10);
            getPresenter().g(false);
        }
    }

    @Deprecated
    public void setOnNavigationItemReselectedListener(a aVar) {
        setOnItemReselectedListener(aVar);
    }

    @Deprecated
    public void setOnNavigationItemSelectedListener(b bVar) {
        setOnItemSelectedListener(bVar);
    }
}
