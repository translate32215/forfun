package com.google.android.material.datepicker;

import android.view.View;

/* compiled from: MaterialCalendar */
public class l implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ w f9187a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ g f9188b;

    public l(g gVar, w wVar) {
        this.f9188b = gVar;
        this.f9187a = wVar;
    }

    public void onClick(View view) {
        int i12 = this.f9188b.s0().i1() + 1;
        if (i12 < this.f9188b.f9173v0.getAdapter().b()) {
            this.f9188b.u0(this.f9187a.l(i12));
        }
    }
}
