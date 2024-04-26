package androidx.leanback.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

public class BrowseRowsFrameLayout extends FrameLayout {
    public BrowseRowsFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + i11, marginLayoutParams.width), FrameLayout.getChildMeasureSpec(i12, getPaddingBottom() + getPaddingTop() + i13, marginLayoutParams.height));
    }
}
