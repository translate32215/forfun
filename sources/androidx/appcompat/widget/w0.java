package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.AdapterView;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.startapp.startappsdk.R;
import e.l;
import f.a;

/* compiled from: ScrollingTabContainerView */
public class w0 extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* renamed from: a  reason: collision with root package name */
    public int f1122a;

    /* renamed from: b  reason: collision with root package name */
    public int f1123b;

    /* compiled from: ScrollingTabContainerView */
    public class a extends LinearLayout {

        /* renamed from: a  reason: collision with root package name */
        public a.c f1124a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ w0 f1125b;

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        public void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            this.f1125b.getClass();
        }

        public void setSelected(boolean z10) {
            boolean z11 = isSelected() != z10;
            super.setSelected(z10);
            if (z11 && z10) {
                sendAccessibilityEvent(4);
            }
        }
    }

    static {
        new DecelerateInterpolator();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Context context = getContext();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, l.f13501a, R.attr.actionBarStyle, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(13, 0);
        Resources resources = context.getResources();
        if (!context.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs)) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(R.dimen.abc_action_bar_stacked_max_height));
        }
        obtainStyledAttributes.recycle();
        setContentHeight(layoutDimension);
        context.getResources().getDimensionPixelSize(R.dimen.abc_action_bar_stacked_tab_max_width);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
        ((a) view).f1124a.a();
    }

    public void onMeasure(int i10, int i11) {
        setFillViewport(View.MeasureSpec.getMode(i10) == 1073741824);
        throw null;
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z10) {
    }

    public void setContentHeight(int i10) {
        this.f1122a = i10;
        requestLayout();
    }

    public void setTabSelected(int i10) {
        this.f1123b = i10;
        throw null;
    }
}
