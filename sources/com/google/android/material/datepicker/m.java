package com.google.android.material.datepicker;

import android.view.View;

/* compiled from: MaterialCalendar */
public class m implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ w f9189a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ g f9190b;

    public m(g gVar, w wVar) {
        this.f9190b = gVar;
        this.f9189a = wVar;
    }

    public void onClick(View view) {
        int j12 = this.f9190b.s0().j1() - 1;
        if (j12 >= 0) {
            this.f9190b.u0(this.f9189a.l(j12));
        }
    }
}
