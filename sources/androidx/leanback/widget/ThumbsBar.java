package androidx.leanback.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.startapp.startappsdk.R;

public class ThumbsBar extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public int f2269a = -1;

    /* renamed from: b  reason: collision with root package name */
    public int f2270b;

    /* renamed from: c  reason: collision with root package name */
    public int f2271c;

    /* renamed from: d  reason: collision with root package name */
    public int f2272d;

    /* renamed from: e  reason: collision with root package name */
    public int f2273e;

    /* renamed from: f  reason: collision with root package name */
    public int f2274f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f2275g;

    public ThumbsBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        new SparseArray();
        this.f2275g = false;
        this.f2270b = context.getResources().getDimensionPixelSize(R.dimen.lb_playback_transport_thumbs_width);
        this.f2271c = context.getResources().getDimensionPixelSize(R.dimen.lb_playback_transport_thumbs_height);
        this.f2273e = context.getResources().getDimensionPixelSize(R.dimen.lb_playback_transport_hero_thumbs_width);
        this.f2272d = context.getResources().getDimensionPixelSize(R.dimen.lb_playback_transport_hero_thumbs_height);
        this.f2274f = context.getResources().getDimensionPixelSize(R.dimen.lb_playback_transport_thumbs_margin);
    }

    public final void a() {
        while (getChildCount() > this.f2269a) {
            removeView(getChildAt(getChildCount() - 1));
        }
        while (getChildCount() < this.f2269a) {
            addView(new ImageView(getContext()), new LinearLayout.LayoutParams(this.f2270b, this.f2271c));
        }
        int heroIndex = getHeroIndex();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            if (heroIndex == i10) {
                layoutParams.width = this.f2272d;
                layoutParams.height = this.f2273e;
            } else {
                layoutParams.width = this.f2270b;
                layoutParams.height = this.f2271c;
            }
            childAt.setLayoutParams(layoutParams);
        }
    }

    public int getHeroIndex() {
        return getChildCount() / 2;
    }

    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int heroIndex = getHeroIndex();
        View childAt = getChildAt(heroIndex);
        int width = (getWidth() / 2) - (childAt.getMeasuredWidth() / 2);
        int measuredWidth = (childAt.getMeasuredWidth() / 2) + (getWidth() / 2);
        childAt.layout(width, getPaddingTop(), measuredWidth, childAt.getMeasuredHeight() + getPaddingTop());
        int measuredHeight = (childAt.getMeasuredHeight() / 2) + getPaddingTop();
        for (int i14 = heroIndex - 1; i14 >= 0; i14--) {
            int i15 = width - this.f2274f;
            View childAt2 = getChildAt(i14);
            childAt2.layout(i15 - childAt2.getMeasuredWidth(), measuredHeight - (childAt2.getMeasuredHeight() / 2), i15, (childAt2.getMeasuredHeight() / 2) + measuredHeight);
            width = i15 - childAt2.getMeasuredWidth();
        }
        while (true) {
            heroIndex++;
            if (heroIndex < this.f2269a) {
                int i16 = measuredWidth + this.f2274f;
                View childAt3 = getChildAt(heroIndex);
                childAt3.layout(i16, measuredHeight - (childAt3.getMeasuredHeight() / 2), childAt3.getMeasuredWidth() + i16, (childAt3.getMeasuredHeight() / 2) + measuredHeight);
                measuredWidth = i16 + childAt3.getMeasuredWidth();
            } else {
                return;
            }
        }
    }

    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredWidth = getMeasuredWidth();
        if (!this.f2275g) {
            int i12 = measuredWidth - this.f2272d;
            int i13 = this.f2270b + this.f2274f;
            int i14 = ((i12 + i13) - 1) / i13;
            if (i14 < 2) {
                i14 = 2;
            } else if ((i14 & 1) != 0) {
                i14++;
            }
            int i15 = i14 + 1;
            if (this.f2269a != i15) {
                this.f2269a = i15;
                a();
            }
        }
    }

    public void setNumberOfThumbs(int i10) {
        this.f2275g = true;
        this.f2269a = i10;
        a();
    }

    public void setThumbSpace(int i10) {
        this.f2274f = i10;
        requestLayout();
    }
}
