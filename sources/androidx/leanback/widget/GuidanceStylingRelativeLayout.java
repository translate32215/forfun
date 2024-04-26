package androidx.leanback.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.startapp.startappsdk.R;
import e1.a;

class GuidanceStylingRelativeLayout extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    public float f2125a;

    public GuidanceStylingRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f2125a = a(context);
    }

    public static float a(Context context) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(a.f13527a);
        float f10 = obtainStyledAttributes.getFloat(45, 40.0f);
        obtainStyledAttributes.recycle();
        return f10;
    }

    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        View findViewById = getRootView().findViewById(R.id.guidance_title);
        View findViewById2 = getRootView().findViewById(R.id.guidance_breadcrumb);
        View findViewById3 = getRootView().findViewById(R.id.guidance_description);
        ImageView imageView = (ImageView) getRootView().findViewById(R.id.guidance_icon);
        int measuredHeight = (int) ((((float) getMeasuredHeight()) * this.f2125a) / 100.0f);
        if (findViewById != null && findViewById.getParent() == this) {
            int baseline = (((measuredHeight - findViewById.getBaseline()) - findViewById2.getMeasuredHeight()) - findViewById.getPaddingTop()) - findViewById2.getTop();
            if (findViewById2.getParent() == this) {
                findViewById2.offsetTopAndBottom(baseline);
            }
            findViewById.offsetTopAndBottom(baseline);
            if (findViewById3 != null && findViewById3.getParent() == this) {
                findViewById3.offsetTopAndBottom(baseline);
            }
        }
        if (imageView != null && imageView.getParent() == this && imageView.getDrawable() != null) {
            imageView.offsetTopAndBottom(measuredHeight - (imageView.getMeasuredHeight() / 2));
        }
    }
}
