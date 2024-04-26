package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.appcompat.widget.m0;
import f.n;
import o0.o0;

public class FitWindowsLinearLayout extends LinearLayout implements m0 {

    /* renamed from: a  reason: collision with root package name */
    public m0.a f698a;

    public FitWindowsLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean fitSystemWindows(Rect rect) {
        m0.a aVar = this.f698a;
        if (aVar != null) {
            rect.top = ((n) aVar).f17945a.a0((o0) null, rect);
        }
        return super.fitSystemWindows(rect);
    }

    public void setOnFitSystemWindowsListener(m0.a aVar) {
        this.f698a = aVar;
    }
}
