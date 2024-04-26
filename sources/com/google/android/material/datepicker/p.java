package com.google.android.material.datepicker;

import android.view.View;
import o0.o0;
import o0.s;

/* compiled from: MaterialDatePicker */
public class p implements s {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9194a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f9195b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f9196c;

    public p(o oVar, int i10, View view, int i11) {
        this.f9194a = i10;
        this.f9195b = view;
        this.f9196c = i11;
    }

    public o0 a(View view, o0 o0Var) {
        int i10 = o0Var.b(7).f18356b;
        if (this.f9194a >= 0) {
            this.f9195b.getLayoutParams().height = this.f9194a + i10;
            View view2 = this.f9195b;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        View view3 = this.f9195b;
        view3.setPadding(view3.getPaddingLeft(), this.f9196c + i10, this.f9195b.getPaddingRight(), this.f9195b.getPaddingBottom());
        return o0Var;
    }
}
