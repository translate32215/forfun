package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

public class Guideline extends View {

    /* renamed from: a  reason: collision with root package name */
    public boolean f1208a = true;

    public Guideline(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z10) {
        this.f1208a = z10;
    }

    public void setGuidelineBegin(int i10) {
        ConstraintLayout.a aVar = (ConstraintLayout.a) getLayoutParams();
        if (!this.f1208a || aVar.f1156a != i10) {
            aVar.f1156a = i10;
            setLayoutParams(aVar);
        }
    }

    public void setGuidelineEnd(int i10) {
        ConstraintLayout.a aVar = (ConstraintLayout.a) getLayoutParams();
        if (!this.f1208a || aVar.f1158b != i10) {
            aVar.f1158b = i10;
            setLayoutParams(aVar);
        }
    }

    public void setGuidelinePercent(float f10) {
        ConstraintLayout.a aVar = (ConstraintLayout.a) getLayoutParams();
        if (!this.f1208a || aVar.f1160c != f10) {
            aVar.f1160c = f10;
            setLayoutParams(aVar);
        }
    }

    public void setVisibility(int i10) {
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
