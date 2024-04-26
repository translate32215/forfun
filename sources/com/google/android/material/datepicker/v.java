package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.g;
import java.util.Iterator;

/* compiled from: MonthsPagerAdapter */
public class v implements AdapterView.OnItemClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MaterialCalendarGridView f9215a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ w f9216b;

    public v(w wVar, MaterialCalendarGridView materialCalendarGridView) {
        this.f9216b = wVar;
        this.f9215a = materialCalendarGridView;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
        u a10 = this.f9215a.getAdapter();
        if (i10 >= a10.b() && i10 <= a10.d()) {
            g.e eVar = this.f9216b.f9219f;
            long longValue = this.f9215a.getAdapter().getItem(i10).longValue();
            g.d dVar = (g.d) eVar;
            if (g.this.f9168q0.f9128c.o(longValue)) {
                g.this.f9167p0.K(longValue);
                Iterator it = g.this.f9223n0.iterator();
                while (it.hasNext()) {
                    ((x) it.next()).a(g.this.f9167p0.H());
                }
                g.this.f9173v0.getAdapter().f2863a.b();
                RecyclerView recyclerView = g.this.f9172u0;
                if (recyclerView != null) {
                    recyclerView.getAdapter().f2863a.b();
                }
            }
        }
    }
}
