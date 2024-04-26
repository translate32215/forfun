package com.google.android.material.timepicker;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import com.startapp.startappsdk.R;
import o0.a;
import p0.c;

/* compiled from: ClockFaceView */
public class b extends a {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f9593d;

    public b(ClockFaceView clockFaceView) {
        this.f9593d = clockFaceView;
    }

    public void d(View view, c cVar) {
        this.f22536a.onInitializeAccessibilityNodeInfo(view, cVar.f23748a);
        int intValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
        if (intValue > 0) {
            cVar.q(this.f9593d.G.get(intValue - 1));
        }
        cVar.n(c.C0207c.a(0, 1, intValue, 1, false, view.isSelected()));
        cVar.f23748a.setClickable(true);
        cVar.a(c.a.f23753g);
    }

    public boolean g(View view, int i10, Bundle bundle) {
        if (i10 != 16) {
            return super.g(view, i10, bundle);
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        float x10 = view.getX() + (((float) view.getWidth()) / 2.0f);
        float height = (((float) view.getHeight()) / 2.0f) + view.getY();
        this.f9593d.D.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, x10, height, 0));
        this.f9593d.D.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 1, x10, height, 0));
        return true;
    }
}
