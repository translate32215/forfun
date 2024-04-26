package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import v.a;
import v.f;
import y.e;

public class Barrier extends a {

    /* renamed from: i  reason: collision with root package name */
    public int f1135i;

    /* renamed from: r  reason: collision with root package name */
    public int f1136r;

    /* renamed from: s  reason: collision with root package name */
    public a f1137s;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public boolean getAllowsGoneWidget() {
        return this.f1137s.f26206u0;
    }

    public int getMargin() {
        return this.f1137s.f26207v0;
    }

    public int getType() {
        return this.f1135i;
    }

    public void i(AttributeSet attributeSet) {
        super.i(attributeSet);
        this.f1137s = new a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, e.f27962b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == 26) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == 25) {
                    this.f1137s.f26206u0 = obtainStyledAttributes.getBoolean(index, true);
                } else if (index == 27) {
                    this.f1137s.f26207v0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f1212d = this.f1137s;
        k();
    }

    public void j(f fVar, boolean z10) {
        int i10 = this.f1135i;
        this.f1136r = i10;
        if (z10) {
            if (i10 == 5) {
                this.f1136r = 1;
            } else if (i10 == 6) {
                this.f1136r = 0;
            }
        } else if (i10 == 5) {
            this.f1136r = 0;
        } else if (i10 == 6) {
            this.f1136r = 1;
        }
        if (fVar instanceof a) {
            ((a) fVar).f26205t0 = this.f1136r;
        }
    }

    public void setAllowsGoneWidget(boolean z10) {
        this.f1137s.f26206u0 = z10;
    }

    public void setDpMargin(int i10) {
        this.f1137s.f26207v0 = (int) ((((float) i10) * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i10) {
        this.f1137s.f26207v0 = i10;
    }

    public void setType(int i10) {
        this.f1135i = i10;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
