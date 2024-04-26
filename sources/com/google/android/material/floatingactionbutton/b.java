package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.d;

/* compiled from: FloatingActionButtonImpl */
public class b extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public boolean f9245a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f9246b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ d.g f9247c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ d f9248d;

    public b(d dVar, boolean z10, d.g gVar) {
        this.f9248d = dVar;
        this.f9246b = z10;
        this.f9247c = gVar;
    }

    public void onAnimationCancel(Animator animator) {
        this.f9245a = true;
    }

    public void onAnimationEnd(Animator animator) {
        d dVar = this.f9248d;
        dVar.f9267n = 0;
        dVar.f9261h = null;
        if (!this.f9245a) {
            FloatingActionButton floatingActionButton = dVar.f9271r;
            boolean z10 = this.f9246b;
            floatingActionButton.b(z10 ? 8 : 4, z10);
            d.g gVar = this.f9247c;
            if (gVar != null) {
                a aVar = (a) gVar;
                aVar.f9243a.a(aVar.f9244b);
            }
        }
    }

    public void onAnimationStart(Animator animator) {
        this.f9248d.f9271r.b(0, this.f9246b);
        d dVar = this.f9248d;
        dVar.f9267n = 1;
        dVar.f9261h = animator;
        this.f9245a = false;
    }
}
