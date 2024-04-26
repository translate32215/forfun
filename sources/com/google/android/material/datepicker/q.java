package com.google.android.material.datepicker;

import android.view.View;

/* compiled from: MaterialDatePicker */
public class q implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o f9197a;

    public q(o oVar) {
        this.f9197a = oVar;
    }

    public void onClick(View view) {
        o oVar = this.f9197a;
        oVar.X0.setEnabled(oVar.x0().E());
        this.f9197a.V0.toggle();
        o oVar2 = this.f9197a;
        oVar2.D0(oVar2.V0);
        this.f9197a.B0();
    }
}
