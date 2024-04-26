package com.google.android.material.appbar;

import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import p0.g;

/* compiled from: AppBarLayout */
public class d implements g {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f8930a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f8931b;

    public d(AppBarLayout.BaseBehavior baseBehavior, AppBarLayout appBarLayout, boolean z10) {
        this.f8930a = appBarLayout;
        this.f8931b = z10;
    }

    public boolean a(View view, g.a aVar) {
        this.f8930a.setExpanded(this.f8931b);
        return true;
    }
}
