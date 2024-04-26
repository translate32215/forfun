package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.f;
import androidx.fragment.app.q0;

/* compiled from: DefaultSpecialEffectsController */
public class i implements Animation.AnimationListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ q0.d f1698a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f1699b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f1700c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ f.b f1701d;

    /* compiled from: DefaultSpecialEffectsController */
    public class a implements Runnable {
        public a() {
        }

        public void run() {
            i iVar = i.this;
            iVar.f1699b.endViewTransition(iVar.f1700c);
            i.this.f1701d.a();
        }
    }

    public i(f fVar, q0.d dVar, ViewGroup viewGroup, View view, f.b bVar) {
        this.f1698a = dVar;
        this.f1699b = viewGroup;
        this.f1700c = view;
        this.f1701d = bVar;
    }

    public void onAnimationEnd(Animation animation) {
        this.f1699b.post(new a());
        if (a0.N(2)) {
            StringBuilder a10 = android.support.v4.media.a.a("Animation from operation ");
            a10.append(this.f1698a);
            a10.append(" has ended.");
            Log.v("FragmentManager", a10.toString());
        }
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
        if (a0.N(2)) {
            StringBuilder a10 = android.support.v4.media.a.a("Animation from operation ");
            a10.append(this.f1698a);
            a10.append(" has reached onAnimationStart.");
            Log.v("FragmentManager", a10.toString());
        }
    }
}
