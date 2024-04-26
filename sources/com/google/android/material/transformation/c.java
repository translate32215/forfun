package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import e9.e;

/* compiled from: FabTransformationBehavior */
public class c extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f9624a;

    public c(FabTransformationBehavior fabTransformationBehavior, e eVar) {
        this.f9624a = eVar;
    }

    public void onAnimationEnd(Animator animator) {
        e.C0133e revealInfo = this.f9624a.getRevealInfo();
        revealInfo.f17812c = Float.MAX_VALUE;
        this.f9624a.setRevealInfo(revealInfo);
    }
}
