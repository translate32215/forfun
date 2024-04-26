package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;

/* compiled from: TimePickerView */
public class f implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ GestureDetector f9597a;

    public f(TimePickerView timePickerView, GestureDetector gestureDetector) {
        this.f9597a = gestureDetector;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (((Checkable) view).isChecked()) {
            return this.f9597a.onTouchEvent(motionEvent);
        }
        return false;
    }
}
