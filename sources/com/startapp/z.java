package com.startapp;

import android.view.View;
import com.startapp.a0;
import com.startapp.sdk.ads.video.VideoMode;

/* compiled from: Sta */
public class z implements View.OnLayoutChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a0.b f12904a;

    public z(a0.b bVar) {
        this.f12904a = bVar;
    }

    public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        fd fdVar = (fd) this.f12904a;
        VideoMode videoMode = fdVar.f10409a;
        videoMode.V = true;
        if (videoMode.U && videoMode.E()) {
            fdVar.f10409a.B();
        }
    }
}
