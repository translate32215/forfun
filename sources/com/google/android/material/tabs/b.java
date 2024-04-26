package com.google.android.material.tabs;

import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* compiled from: TabLayout */
public class b implements View.OnLayoutChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f9467a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TabLayout.i f9468b;

    public b(TabLayout.i iVar, View view) {
        this.f9468b = iVar;
        this.f9467a = view;
    }

    public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        if (this.f9467a.getVisibility() == 0) {
            this.f9468b.f(this.f9467a);
        }
    }
}
