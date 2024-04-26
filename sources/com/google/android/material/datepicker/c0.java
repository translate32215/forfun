package com.google.android.material.datepicker;

import android.view.View;

/* compiled from: YearGridAdapter */
public class c0 implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9156a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d0 f9157b;

    public c0(d0 d0Var, int i10) {
        this.f9157b = d0Var;
        this.f9156a = i10;
    }

    public void onClick(View view) {
        t b10 = t.b(this.f9156a, this.f9157b.f9158d.f9169r0.f9203b);
        a aVar = this.f9157b.f9158d.f9168q0;
        if (b10.compareTo(aVar.f9126a) < 0) {
            b10 = aVar.f9126a;
        } else if (b10.compareTo(aVar.f9127b) > 0) {
            b10 = aVar.f9127b;
        }
        this.f9157b.f9158d.u0(b10);
        this.f9157b.f9158d.v0(1);
    }
}
