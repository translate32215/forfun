package androidx.leanback.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import e1.a;

public class VerticalGridView extends e {
    public VerticalGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.T0.O1(1);
        q0(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f13539m);
        setColumnWidth(obtainStyledAttributes);
        setNumColumns(obtainStyledAttributes.getInt(1, 1));
        obtainStyledAttributes.recycle();
    }

    public void setColumnWidth(TypedArray typedArray) {
        if (typedArray.peekValue(0) != null) {
            setColumnWidth(typedArray.getLayoutDimension(0, 0));
        }
    }

    public void setNumColumns(int i10) {
        p pVar = this.T0;
        pVar.getClass();
        if (i10 >= 0) {
            pVar.V = i10;
            requestLayout();
            return;
        }
        throw new IllegalArgumentException();
    }

    public void setColumnWidth(int i10) {
        this.T0.P1(i10);
        requestLayout();
    }
}
