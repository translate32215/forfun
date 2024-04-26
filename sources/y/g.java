package y;

import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.a;

/* compiled from: VirtualLayout */
public abstract class g extends a {

    /* renamed from: i  reason: collision with root package name */
    public boolean f27973i;

    /* renamed from: r  reason: collision with root package name */
    public boolean f27974r;

    public void g(ConstraintLayout constraintLayout) {
        f(constraintLayout);
    }

    public void i(AttributeSet attributeSet) {
        super.i(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, e.f27962b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 6) {
                    this.f27973i = true;
                } else if (index == 22) {
                    this.f27974r = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f27973i || this.f27974r) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = Build.VERSION.SDK_INT >= 21 ? getElevation() : 0.0f;
                for (int i10 = 0; i10 < this.f1210b; i10++) {
                    View d10 = constraintLayout.d(this.f1209a[i10]);
                    if (d10 != null) {
                        if (this.f27973i) {
                            d10.setVisibility(visibility);
                        }
                        if (this.f27974r && elevation > 0.0f && Build.VERSION.SDK_INT >= 21) {
                            d10.setTranslationZ(d10.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    public void setElevation(float f10) {
        super.setElevation(f10);
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            f((ConstraintLayout) parent);
        }
    }

    public void setVisibility(int i10) {
        super.setVisibility(i10);
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            f((ConstraintLayout) parent);
        }
    }
}
