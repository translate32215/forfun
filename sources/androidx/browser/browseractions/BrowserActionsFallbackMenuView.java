package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.startapp.startappsdk.R;

public class BrowserActionsFallbackMenuView extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public final int f1133a = getResources().getDimensionPixelOffset(R.dimen.browser_actions_context_menu_min_padding);

    /* renamed from: b  reason: collision with root package name */
    public final int f1134b = getResources().getDimensionPixelOffset(R.dimen.browser_actions_context_menu_max_width);

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.f1133a * 2), this.f1134b), 1073741824), i11);
    }
}
