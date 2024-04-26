package com.startapp;

import android.view.View;
import com.startapp.sdk.ads.nativead.NativeAdDetails;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;

/* compiled from: Sta */
public class e7 implements View.OnAttachStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ NativeAdDetails f10323a;

    public e7(NativeAdDetails nativeAdDetails) {
        this.f10323a = nativeAdDetails;
    }

    public void onViewAttachedToWindow(View view) {
        View view2;
        NativeAdDetails nativeAdDetails = this.f10323a;
        nativeAdDetails.getClass();
        if (MetaData.f12393k.S() && (view2 = (View) nativeAdDetails.f11860h.get()) != null) {
            q7 q7Var = new q7(view2.getContext(), nativeAdDetails.f11853a.b(), false);
            nativeAdDetails.f11863k = q7Var;
            if (q7Var.c()) {
                nativeAdDetails.f11863k.a(view2);
                nativeAdDetails.f11863k.e();
                nativeAdDetails.f11863k.d();
                nativeAdDetails.f11863k.b();
            }
        }
        this.f10323a.a();
    }

    public void onViewDetachedFromWindow(View view) {
        NativeAdDetails nativeAdDetails = this.f10323a;
        hd hdVar = nativeAdDetails.f11859g;
        if (hdVar != null) {
            hdVar.a();
            nativeAdDetails.f11859g = null;
        }
        NativeAdDetails nativeAdDetails2 = this.f10323a;
        q7 q7Var = nativeAdDetails2.f11863k;
        if (q7Var != null) {
            q7Var.a();
            nativeAdDetails2.f11863k = null;
        }
        view.removeOnAttachStateChangeListener(this.f10323a.f11861i);
    }
}
