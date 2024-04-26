package com.startapp;

import android.view.MotionEvent;
import com.startapp.sdk.ads.list3d.List3DView;

/* compiled from: Sta */
public class t5 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ List3DView f12613a;

    public t5(List3DView list3DView) {
        this.f12613a = list3DView;
    }

    public void run() {
        this.f12613a.dispatchTouchEvent(MotionEvent.obtain(System.currentTimeMillis(), System.currentTimeMillis(), 2, 0.0f, -20.0f, 0));
        this.f12613a.dispatchTouchEvent(MotionEvent.obtain(System.currentTimeMillis(), System.currentTimeMillis(), 1, 0.0f, -20.0f, 0));
    }
}
