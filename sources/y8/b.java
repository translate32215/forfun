package y8;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.e;
import com.startapp.startappsdk.R;
import java.util.WeakHashMap;
import n9.a;
import n9.d;
import o0.c0;

/* compiled from: BottomNavigationMenuView */
public class b extends d {
    public final int M;
    public final int N;
    public final int O;
    public final int P;
    public boolean Q;
    public int[] R = new int[5];

    public b(Context context) {
        super(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
        Resources resources = getResources();
        this.M = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_max_width);
        this.N = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_item_min_width);
        this.O = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_max_width);
        this.P = resources.getDimensionPixelSize(R.dimen.design_bottom_navigation_active_item_min_width);
    }

    public a e(Context context) {
        return new a(context);
    }

    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                WeakHashMap<View, String> weakHashMap = c0.f22553a;
                if (c0.e.d(this) == 1) {
                    int i18 = i14 - i16;
                    childAt.layout(i18 - childAt.getMeasuredWidth(), 0, i18, i15);
                } else {
                    childAt.layout(i16, 0, childAt.getMeasuredWidth() + i16, i15);
                }
                i16 += childAt.getMeasuredWidth();
            }
        }
    }

    public void onMeasure(int i10, int i11) {
        e menu = getMenu();
        int size = View.MeasureSpec.getSize(i10);
        int size2 = menu.l().size();
        int childCount = getChildCount();
        int size3 = View.MeasureSpec.getSize(i11);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
        if (!f(getLabelVisibilityMode(), size2) || !this.Q) {
            int min = Math.min(size / (size2 == 0 ? 1 : size2), this.O);
            int i12 = size - (size2 * min);
            for (int i13 = 0; i13 < childCount; i13++) {
                if (getChildAt(i13).getVisibility() != 8) {
                    int[] iArr = this.R;
                    iArr[i13] = min;
                    if (i12 > 0) {
                        iArr[i13] = iArr[i13] + 1;
                        i12--;
                    }
                } else {
                    this.R[i13] = 0;
                }
            }
        } else {
            View childAt = getChildAt(getSelectedItemPosition());
            int i14 = this.P;
            if (childAt.getVisibility() != 8) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(this.O, Integer.MIN_VALUE), makeMeasureSpec);
                i14 = Math.max(i14, childAt.getMeasuredWidth());
            }
            int i15 = size2 - (childAt.getVisibility() != 8 ? 1 : 0);
            int min2 = Math.min(size - (this.N * i15), Math.min(i14, this.O));
            int i16 = size - min2;
            int min3 = Math.min(i16 / (i15 == 0 ? 1 : i15), this.M);
            int i17 = i16 - (i15 * min3);
            int i18 = 0;
            while (i18 < childCount) {
                if (getChildAt(i18).getVisibility() != 8) {
                    this.R[i18] = i18 == getSelectedItemPosition() ? min2 : min3;
                    if (i17 > 0) {
                        int[] iArr2 = this.R;
                        iArr2[i18] = iArr2[i18] + 1;
                        i17--;
                    }
                } else {
                    this.R[i18] = 0;
                }
                i18++;
            }
        }
        int i19 = 0;
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt2 = getChildAt(i20);
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(this.R[i20], 1073741824), makeMeasureSpec);
                childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                i19 += childAt2.getMeasuredWidth();
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(i19, View.MeasureSpec.makeMeasureSpec(i19, 1073741824), 0), View.resolveSizeAndState(size3, i11, 0));
    }

    public void setItemHorizontalTranslationEnabled(boolean z10) {
        this.Q = z10;
    }
}
