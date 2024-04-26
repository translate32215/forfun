package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* compiled from: ClockFaceView */
public class a implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f9592a;

    public a(ClockFaceView clockFaceView) {
        this.f9592a = clockFaceView;
    }

    public boolean onPreDraw() {
        if (!this.f9592a.isShown()) {
            return true;
        }
        this.f9592a.getViewTreeObserver().removeOnPreDrawListener(this);
        ClockFaceView clockFaceView = this.f9592a;
        int height = ((this.f9592a.getHeight() / 2) - clockFaceView.D.f9581f) - clockFaceView.K;
        if (height != clockFaceView.B) {
            clockFaceView.B = height;
            clockFaceView.s();
            ClockHandView clockHandView = clockFaceView.D;
            clockHandView.f9589v = clockFaceView.B;
            clockHandView.invalidate();
        }
        return true;
    }
}
