package androidx.leanback.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;

class ControlBar extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public int f2123a = -1;

    /* renamed from: b  reason: collision with root package name */
    public boolean f2124b = true;

    public ControlBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        if (i10 == 33 || i10 == 130) {
            int i12 = this.f2123a;
            if (i12 >= 0 && i12 < getChildCount()) {
                arrayList.add(getChildAt(this.f2123a));
            } else if (getChildCount() > 0) {
                arrayList.add(getChildAt(this.f2124b ? getChildCount() / 2 : 0));
            }
        } else {
            super.addFocusables(arrayList, i10, i11);
        }
    }

    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    public boolean onRequestFocusInDescendants(int i10, Rect rect) {
        int i11;
        if (getChildCount() > 0) {
            int i12 = this.f2123a;
            if (i12 < 0 || i12 >= getChildCount()) {
                i11 = this.f2124b ? getChildCount() / 2 : 0;
            } else {
                i11 = this.f2123a;
            }
            if (getChildAt(i11).requestFocus(i10, rect)) {
                return true;
            }
        }
        return super.onRequestFocusInDescendants(i10, rect);
    }

    public void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        this.f2123a = indexOfChild(view);
    }
}
