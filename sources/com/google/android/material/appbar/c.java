package com.google.android.material.appbar;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import p0.g;

/* compiled from: AppBarLayout */
public class c implements g {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CoordinatorLayout f8925a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f8926b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f8927c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f8928d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ AppBarLayout.BaseBehavior f8929e;

    public c(AppBarLayout.BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i10) {
        this.f8929e = baseBehavior;
        this.f8925a = coordinatorLayout;
        this.f8926b = appBarLayout;
        this.f8927c = view;
        this.f8928d = i10;
    }

    public boolean a(View view, g.a aVar) {
        this.f8929e.C(this.f8925a, this.f8926b, this.f8927c, this.f8928d, new int[]{0, 0});
        return true;
    }
}
