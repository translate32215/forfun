package androidx.leanback.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.startapp.startappsdk.R;

class GuidedActionsRelativeLayout extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    public float f2131a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f2132b = false;

    public GuidedActionsRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f2131a = GuidanceStylingRelativeLayout.a(context);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f2132b = false;
    }

    public void onMeasure(int i10, int i11) {
        View findViewById;
        int size = View.MeasureSpec.getSize(i11);
        if (size > 0 && (findViewById = findViewById(R.id.guidedactions_sub_list)) != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) findViewById.getLayoutParams();
            if (marginLayoutParams.topMargin < 0 && !this.f2132b) {
                this.f2132b = true;
            }
            if (this.f2132b) {
                marginLayoutParams.topMargin = (int) ((this.f2131a * ((float) size)) / 100.0f);
            }
        }
        super.onMeasure(i10, i11);
    }
}
