package com.google.android.material.behavior;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.WeakHashMap;
import o0.c0;
import p0.g;

/* compiled from: SwipeDismissBehavior */
public class a implements g {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SwipeDismissBehavior f8951a;

    public a(SwipeDismissBehavior swipeDismissBehavior) {
        this.f8951a = swipeDismissBehavior;
    }

    public boolean a(View view, g.a aVar) {
        boolean z10 = false;
        if (!this.f8951a.s(view)) {
            return false;
        }
        WeakHashMap<View, String> weakHashMap = c0.f22553a;
        boolean z11 = c0.e.d(view) == 1;
        int i10 = this.f8951a.f8940d;
        if ((i10 == 0 && z11) || (i10 == 1 && !z11)) {
            z10 = true;
        }
        int width = view.getWidth();
        if (z10) {
            width = -width;
        }
        c0.t(view, width);
        view.setAlpha(0.0f);
        SwipeDismissBehavior.b bVar = this.f8951a.f8938b;
        if (bVar != null) {
            ((com.google.android.material.snackbar.a) bVar).a(view);
        }
        return true;
    }
}
