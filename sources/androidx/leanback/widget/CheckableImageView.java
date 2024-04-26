package androidx.leanback.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Checkable;
import android.widget.ImageView;

class CheckableImageView extends ImageView implements Checkable {

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f2121b = {16842912};

    /* renamed from: a  reason: collision with root package name */
    public boolean f2122a;

    public CheckableImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public boolean isChecked() {
        return this.f2122a;
    }

    public int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        if (isChecked()) {
            ImageView.mergeDrawableStates(onCreateDrawableState, f2121b);
        }
        return onCreateDrawableState;
    }

    public void setChecked(boolean z10) {
        if (this.f2122a != z10) {
            this.f2122a = z10;
            refreshDrawableState();
        }
    }

    public void toggle() {
        setChecked(!this.f2122a);
    }
}
