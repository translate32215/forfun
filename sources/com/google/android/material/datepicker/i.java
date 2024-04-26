package com.google.android.material.datepicker;

import android.view.View;
import com.startapp.startappsdk.R;
import o0.a;
import p0.c;

/* compiled from: MaterialCalendar */
public class i extends a {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ g f9182d;

    public i(g gVar) {
        this.f9182d = gVar;
    }

    public void d(View view, c cVar) {
        String str;
        this.f22536a.onInitializeAccessibilityNodeInfo(view, cVar.f23748a);
        if (this.f9182d.f9175x0.getVisibility() == 0) {
            str = this.f9182d.D(R.string.mtrl_picker_toggle_to_year_selection);
        } else {
            str = this.f9182d.D(R.string.mtrl_picker_toggle_to_day_selection);
        }
        cVar.o(str);
    }
}
