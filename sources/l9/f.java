package l9;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.startapp.startappsdk.R;
import java.util.WeakHashMap;
import o0.c0;
import o0.h;
import t8.a;

/* compiled from: FlowLayout */
public class f extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    public int f21117a;

    /* renamed from: b  reason: collision with root package name */
    public int f21118b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f21119c;

    /* renamed from: d  reason: collision with root package name */
    public int f21120d;

    public f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public boolean a() {
        return this.f21119c;
    }

    public int getItemSpacing() {
        return this.f21118b;
    }

    public int getLineSpacing() {
        return this.f21117a;
    }

    public int getRowCount() {
        return this.f21120d;
    }

    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        if (getChildCount() == 0) {
            this.f21120d = 0;
            return;
        }
        this.f21120d = 1;
        WeakHashMap<View, String> weakHashMap = c0.f22553a;
        boolean z11 = c0.e.d(this) == 1;
        int paddingRight = z11 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = z11 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int i16 = (i12 - i10) - paddingLeft;
        int i17 = paddingRight;
        int i18 = paddingTop;
        for (int i19 = 0; i19 < getChildCount(); i19++) {
            View childAt = getChildAt(i19);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(R.id.row_index_key, -1);
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i14 = h.c(marginLayoutParams);
                    i15 = h.b(marginLayoutParams);
                } else {
                    i15 = 0;
                    i14 = 0;
                }
                int measuredWidth = childAt.getMeasuredWidth() + i17 + i14;
                if (!this.f21119c && measuredWidth > i16) {
                    i18 = this.f21117a + paddingTop;
                    this.f21120d++;
                    i17 = paddingRight;
                }
                childAt.setTag(R.id.row_index_key, Integer.valueOf(this.f21120d - 1));
                int i20 = i17 + i14;
                int measuredWidth2 = childAt.getMeasuredWidth() + i20;
                int measuredHeight = childAt.getMeasuredHeight() + i18;
                if (z11) {
                    childAt.layout(i16 - measuredWidth2, i18, (i16 - i17) - i14, measuredHeight);
                } else {
                    childAt.layout(i20, i18, measuredWidth2, measuredHeight);
                }
                i17 += childAt.getMeasuredWidth() + i14 + i15 + this.f21118b;
                paddingTop = measuredHeight;
            }
        }
    }

    public void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int size = View.MeasureSpec.getSize(i10);
        int mode = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i11);
        int i15 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Integer.MAX_VALUE;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i15 - getPaddingRight();
        int i16 = paddingTop;
        int i17 = 0;
        for (int i18 = 0; i18 < getChildCount(); i18++) {
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() == 8) {
                int i19 = i11;
            } else {
                measureChild(childAt, i10, i11);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i13 = marginLayoutParams.leftMargin + 0;
                    i14 = marginLayoutParams.rightMargin + 0;
                } else {
                    i14 = 0;
                    i13 = 0;
                }
                if (childAt.getMeasuredWidth() + paddingLeft + i13 > paddingRight && !a()) {
                    paddingLeft = getPaddingLeft();
                    i16 = paddingTop + this.f21117a;
                }
                int measuredWidth = childAt.getMeasuredWidth() + paddingLeft + i13;
                int measuredHeight = childAt.getMeasuredHeight() + i16;
                if (measuredWidth > i17) {
                    i17 = measuredWidth;
                }
                int measuredWidth2 = childAt.getMeasuredWidth() + i13 + i14 + this.f21118b + paddingLeft;
                if (i18 == getChildCount() - 1) {
                    i17 += i14;
                }
                paddingLeft = measuredWidth2;
                paddingTop = measuredHeight;
            }
        }
        int paddingRight2 = getPaddingRight() + i17;
        int paddingBottom = getPaddingBottom() + paddingTop;
        if (mode != Integer.MIN_VALUE) {
            i12 = 1073741824;
            if (mode != 1073741824) {
                size = paddingRight2;
            }
        } else {
            i12 = 1073741824;
            size = Math.min(paddingRight2, size);
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(paddingBottom, size2);
        } else if (mode2 != i12) {
            size2 = paddingBottom;
        }
        setMeasuredDimension(size, size2);
    }

    public void setItemSpacing(int i10) {
        this.f21118b = i10;
    }

    public void setLineSpacing(int i10) {
        this.f21117a = i10;
    }

    public void setSingleLine(boolean z10) {
        this.f21119c = z10;
    }

    public f(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f21119c = false;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, a.f25846m, 0, 0);
        this.f21117a = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f21118b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }
}
