package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: TimePickerView */
public class e extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TimePickerView f9596a;

    public e(TimePickerView timePickerView) {
        this.f9596a = timePickerView;
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        TimePickerView timePickerView = this.f9596a;
        int i10 = TimePickerView.E;
        timePickerView.getClass();
        return false;
    }
}
