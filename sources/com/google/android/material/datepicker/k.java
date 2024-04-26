package com.google.android.material.datepicker;

import android.view.View;

/* compiled from: MaterialCalendar */
public class k implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g f9186a;

    public k(g gVar) {
        this.f9186a = gVar;
    }

    public void onClick(View view) {
        g gVar = this.f9186a;
        int i10 = gVar.f9170s0;
        if (i10 == 2) {
            gVar.v0(1);
        } else if (i10 == 1) {
            gVar.v0(2);
        }
    }
}
