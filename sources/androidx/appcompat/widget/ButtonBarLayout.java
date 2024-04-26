package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.startapp.startappsdk.R;
import e.l;
import java.util.WeakHashMap;
import o0.c0;

public class ButtonBarLayout extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public boolean f686a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f687b;

    /* renamed from: c  reason: collision with root package name */
    public int f688c = -1;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int[] iArr = l.f13511k;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        c0.B(this, context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        this.f686a = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f686a);
        }
    }

    private void setStacked(boolean z10) {
        if (this.f687b == z10) {
            return;
        }
        if (!z10 || this.f686a) {
            this.f687b = z10;
            setOrientation(z10 ? 1 : 0);
            setGravity(z10 ? 8388613 : 80);
            View findViewById = findViewById(R.id.spacer);
            if (findViewById != null) {
                findViewById.setVisibility(z10 ? 8 : 4);
            }
            for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                bringChildToFront(getChildAt(childCount));
            }
        }
    }

    public final int a(int i10) {
        int childCount = getChildCount();
        while (i10 < childCount) {
            if (getChildAt(i10).getVisibility() == 0) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public void onMeasure(int i10, int i11) {
        boolean z10;
        int i12;
        int size = View.MeasureSpec.getSize(i10);
        int i13 = 0;
        if (this.f686a) {
            if (size > this.f688c && this.f687b) {
                setStacked(false);
            }
            this.f688c = size;
        }
        if (this.f687b || View.MeasureSpec.getMode(i10) != 1073741824) {
            i12 = i10;
            z10 = false;
        } else {
            i12 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z10 = true;
        }
        super.onMeasure(i12, i11);
        if (this.f686a && !this.f687b) {
            if ((getMeasuredWidthAndState() & -16777216) == 16777216) {
                setStacked(true);
                z10 = true;
            }
        }
        if (z10) {
            super.onMeasure(i10, i11);
        }
        int a10 = a(0);
        if (a10 >= 0) {
            View childAt = getChildAt(a10);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin + 0;
            if (this.f687b) {
                int a11 = a(a10 + 1);
                i13 = a11 >= 0 ? getChildAt(a11).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f)) + measuredHeight : measuredHeight;
            } else {
                i13 = getPaddingBottom() + measuredHeight;
            }
        }
        WeakHashMap<View, String> weakHashMap = c0.f22553a;
        if (c0.d.d(this) != i13) {
            setMinimumHeight(i13);
            if (i11 == 0) {
                super.onMeasure(i10, i11);
            }
        }
    }

    public void setAllowStacking(boolean z10) {
        if (this.f686a != z10) {
            this.f686a = z10;
            if (!z10 && this.f687b) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
