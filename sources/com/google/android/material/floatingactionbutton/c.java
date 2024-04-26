package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.d;

/* compiled from: FloatingActionButtonImpl */
public class c extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f9249a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d.g f9250b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ d f9251c;

    public c(d dVar, boolean z10, d.g gVar) {
        this.f9251c = dVar;
        this.f9249a = z10;
        this.f9250b = gVar;
    }

    public void onAnimationEnd(Animator animator) {
        d dVar = this.f9251c;
        dVar.f9267n = 0;
        dVar.f9261h = null;
        d.g gVar = this.f9250b;
        if (gVar != null) {
            a aVar = (a) gVar;
            aVar.f9243a.b(aVar.f9244b);
        }
    }

    public void onAnimationStart(Animator animator) {
        this.f9251c.f9271r.b(0, this.f9249a);
        d dVar = this.f9251c;
        dVar.f9267n = 2;
        dVar.f9261h = animator;
    }
}
