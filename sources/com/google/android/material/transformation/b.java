package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
import e9.e;

/* compiled from: FabTransformationBehavior */
public class b extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f9622a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Drawable f9623b;

    public b(FabTransformationBehavior fabTransformationBehavior, e eVar, Drawable drawable) {
        this.f9622a = eVar;
        this.f9623b = drawable;
    }

    public void onAnimationEnd(Animator animator) {
        this.f9622a.setCircularRevealOverlayDrawable((Drawable) null);
    }

    public void onAnimationStart(Animator animator) {
        this.f9622a.setCircularRevealOverlayDrawable(this.f9623b);
    }
}
