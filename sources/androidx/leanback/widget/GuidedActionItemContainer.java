package androidx.leanback.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import e.k;

class GuidedActionItemContainer extends g0 {

    /* renamed from: d  reason: collision with root package name */
    public boolean f2130d = true;

    public GuidedActionItemContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public View focusSearch(View view, int i10) {
        if (this.f2130d || !k.a(this, view)) {
            return super.focusSearch(view, i10);
        }
        View focusSearch = super.focusSearch(view, i10);
        if (k.a(this, focusSearch)) {
            return focusSearch;
        }
        return null;
    }
}
