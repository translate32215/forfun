package com.google.android.material.datepicker;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;

/* compiled from: MaterialCalendar */
public class j extends RecyclerView.q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ w f9183a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MaterialButton f9184b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ g f9185c;

    public j(g gVar, w wVar, MaterialButton materialButton) {
        this.f9185c = gVar;
        this.f9183a = wVar;
        this.f9184b = materialButton;
    }

    public void a(RecyclerView recyclerView, int i10) {
        if (i10 == 0) {
            recyclerView.announceForAccessibility(this.f9184b.getText());
        }
    }

    public void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        if (i10 < 0) {
            i12 = this.f9185c.s0().i1();
        } else {
            i12 = this.f9185c.s0().j1();
        }
        this.f9185c.f9169r0 = this.f9183a.l(i12);
        this.f9184b.setText(this.f9183a.f9217d.f9126a.r(i12).q());
    }
}
