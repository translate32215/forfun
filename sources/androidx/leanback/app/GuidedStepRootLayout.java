package androidx.leanback.app;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import e.k;

class GuidedStepRootLayout extends LinearLayout {
    public GuidedStepRootLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public View focusSearch(View view, int i10) {
        View focusSearch = super.focusSearch(view, i10);
        if ((i10 != 17 && i10 != 66) || k.a(this, focusSearch)) {
            return focusSearch;
        }
        getLayoutDirection();
        return view;
    }
}
