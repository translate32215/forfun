package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.g;
import com.startapp.startappsdk.R;
import java.util.WeakHashMap;
import o0.b0;
import o0.c0;

/* compiled from: MonthsPagerAdapter */
public class w extends RecyclerView.e<a> {

    /* renamed from: d  reason: collision with root package name */
    public final a f9217d;

    /* renamed from: e  reason: collision with root package name */
    public final d<?> f9218e;

    /* renamed from: f  reason: collision with root package name */
    public final g.e f9219f;

    /* renamed from: g  reason: collision with root package name */
    public final int f9220g;

    /* compiled from: MonthsPagerAdapter */
    public static class a extends RecyclerView.a0 {

        /* renamed from: u  reason: collision with root package name */
        public final TextView f9221u;

        /* renamed from: v  reason: collision with root package name */
        public final MaterialCalendarGridView f9222v;

        public a(LinearLayout linearLayout, boolean z10) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
            this.f9221u = textView;
            WeakHashMap<View, String> weakHashMap = c0.f22553a;
            new b0(R.id.tag_accessibility_heading, Boolean.class, 28).e(textView, Boolean.TRUE);
            this.f9222v = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
            if (!z10) {
                textView.setVisibility(8);
            }
        }
    }

    public w(Context context, d<?> dVar, a aVar, g.e eVar) {
        t tVar = aVar.f9126a;
        t tVar2 = aVar.f9127b;
        t tVar3 = aVar.f9129d;
        if (tVar.compareTo(tVar3) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        } else if (tVar3.compareTo(tVar2) <= 0) {
            int i10 = u.f9209f;
            int i11 = g.f9165y0;
            this.f9220g = (i10 * context.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height)) + (o.z0(context) ? context.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0);
            this.f9217d = aVar;
            this.f9218e = dVar;
            this.f9219f = eVar;
            if (!this.f2863a.a()) {
                this.f2864b = true;
                return;
            }
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        } else {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
    }

    public int b() {
        return this.f9217d.f9131f;
    }

    public long c(int i10) {
        return this.f9217d.f9126a.r(i10).f9202a.getTimeInMillis();
    }

    public void e(RecyclerView.a0 a0Var, int i10) {
        a aVar = (a) a0Var;
        t r10 = this.f9217d.f9126a.r(i10);
        aVar.f9221u.setText(r10.q());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) aVar.f9222v.findViewById(R.id.month_grid);
        if (materialCalendarGridView.getAdapter() == null || !r10.equals(materialCalendarGridView.getAdapter().f9210a)) {
            u uVar = new u(r10, this.f9218e, this.f9217d);
            materialCalendarGridView.setNumColumns(r10.f9205d);
            materialCalendarGridView.setAdapter((ListAdapter) uVar);
        } else {
            materialCalendarGridView.invalidate();
            u a10 = materialCalendarGridView.getAdapter();
            for (Long longValue : a10.f9212c) {
                a10.f(materialCalendarGridView, longValue.longValue());
            }
            d<?> dVar = a10.f9211b;
            if (dVar != null) {
                for (Long longValue2 : dVar.G()) {
                    a10.f(materialCalendarGridView, longValue2.longValue());
                }
                a10.f9212c = a10.f9211b.G();
            }
        }
        materialCalendarGridView.setOnItemClickListener(new v(this, materialCalendarGridView));
    }

    public RecyclerView.a0 g(ViewGroup viewGroup, int i10) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!o.z0(viewGroup.getContext())) {
            return new a(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.n(-1, this.f9220g));
        return new a(linearLayout, true);
    }

    public t l(int i10) {
        return this.f9217d.f9126a.r(i10);
    }

    public int m(t tVar) {
        return this.f9217d.f9126a.s(tVar);
    }
}
