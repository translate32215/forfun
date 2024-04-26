package androidx.fragment.app;

import android.support.v4.media.a;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.f;
import androidx.fragment.app.q0;
import k0.d;

/* compiled from: DefaultSpecialEffectsController */
public class j implements d.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f1728a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f1729b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ f.b f1730c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ q0.d f1731d;

    public j(f fVar, View view, ViewGroup viewGroup, f.b bVar, q0.d dVar) {
        this.f1728a = view;
        this.f1729b = viewGroup;
        this.f1730c = bVar;
        this.f1731d = dVar;
    }

    public void a() {
        this.f1728a.clearAnimation();
        this.f1729b.endViewTransition(this.f1728a);
        this.f1730c.a();
        if (a0.N(2)) {
            StringBuilder a10 = a.a("Animation from operation ");
            a10.append(this.f1731d);
            a10.append(" has been cancelled.");
            Log.v("FragmentManager", a10.toString());
        }
    }
}
