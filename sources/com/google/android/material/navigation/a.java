package com.google.android.material.navigation;

import android.view.MenuItem;
import androidx.appcompat.view.menu.e;
import com.google.android.material.navigation.NavigationView;
import r1.c;

/* compiled from: NavigationView */
public class a implements e.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ NavigationView f9380a;

    public a(NavigationView navigationView) {
        this.f9380a = navigationView;
    }

    public boolean a(e eVar, MenuItem menuItem) {
        NavigationView.a aVar = this.f9380a.f9368h;
        return aVar != null && ((c) aVar).j(menuItem);
    }

    public void b(e eVar) {
    }
}
