package x;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.a;
import x.d;
import y.e;

/* compiled from: MotionHelper */
public class c extends a implements d.c {

    /* renamed from: i  reason: collision with root package name */
    public boolean f27229i;

    /* renamed from: r  reason: collision with root package name */
    public boolean f27230r;

    /* renamed from: s  reason: collision with root package name */
    public float f27231s;

    /* renamed from: t  reason: collision with root package name */
    public View[] f27232t;

    public void a(d dVar, int i10, int i11) {
    }

    public void b(d dVar, int i10, int i11, float f10) {
    }

    public float getProgress() {
        return this.f27231s;
    }

    public void i(AttributeSet attributeSet) {
        super.i(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, e.f27968h);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 1) {
                    this.f27229i = obtainStyledAttributes.getBoolean(index, this.f27229i);
                } else if (index == 0) {
                    this.f27230r = obtainStyledAttributes.getBoolean(index, this.f27230r);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void setProgress(float f10) {
        this.f27231s = f10;
        int i10 = 0;
        if (this.f1210b > 0) {
            ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
            View[] viewArr = this.f1215g;
            if (viewArr == null || viewArr.length != this.f1210b) {
                this.f1215g = new View[this.f1210b];
            }
            for (int i11 = 0; i11 < this.f1210b; i11++) {
                this.f1215g[i11] = constraintLayout.d(this.f1209a[i11]);
            }
            this.f27232t = this.f1215g;
            while (i10 < this.f1210b) {
                View view = this.f27232t[i10];
                i10++;
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        int childCount = viewGroup.getChildCount();
        while (i10 < childCount) {
            boolean z10 = viewGroup.getChildAt(i10) instanceof c;
            i10++;
        }
    }
}
