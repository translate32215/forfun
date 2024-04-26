package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.v4.media.a;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.f;
import androidx.fragment.app.q0;

/* compiled from: DefaultSpecialEffectsController */
public class g extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f1672a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f1673b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f1674c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ q0.d f1675d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ f.b f1676e;

    public g(f fVar, ViewGroup viewGroup, View view, boolean z10, q0.d dVar, f.b bVar) {
        this.f1672a = viewGroup;
        this.f1673b = view;
        this.f1674c = z10;
        this.f1675d = dVar;
        this.f1676e = bVar;
    }

    public void onAnimationEnd(Animator animator) {
        this.f1672a.endViewTransition(this.f1673b);
        if (this.f1674c) {
            this.f1675d.f1847a.a(this.f1673b);
        }
        this.f1676e.a();
        if (a0.N(2)) {
            StringBuilder a10 = a.a("Animator from operation ");
            a10.append(this.f1675d);
            a10.append(" has ended.");
            Log.v("FragmentManager", a10.toString());
        }
    }
}
