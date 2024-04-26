package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.startapp.startappsdk.R;
import java.util.Calendar;
import java.util.Locale;

/* compiled from: YearGridAdapter */
public class d0 extends RecyclerView.e<a> {

    /* renamed from: d  reason: collision with root package name */
    public final g<?> f9158d;

    /* compiled from: YearGridAdapter */
    public static class a extends RecyclerView.a0 {

        /* renamed from: u  reason: collision with root package name */
        public final TextView f9159u;

        public a(TextView textView) {
            super(textView);
            this.f9159u = textView;
        }
    }

    public d0(g<?> gVar) {
        this.f9158d = gVar;
    }

    public int b() {
        return this.f9158d.f9168q0.f9130e;
    }

    public void e(RecyclerView.a0 a0Var, int i10) {
        a aVar = (a) a0Var;
        int i11 = this.f9158d.f9168q0.f9126a.f9204c + i10;
        String string = aVar.f9159u.getContext().getString(R.string.mtrl_picker_navigate_to_year_description);
        aVar.f9159u.setText(String.format(Locale.getDefault(), "%d", new Object[]{Integer.valueOf(i11)}));
        aVar.f9159u.setContentDescription(String.format(string, new Object[]{Integer.valueOf(i11)}));
        c cVar = this.f9158d.f9171t0;
        Calendar d10 = b0.d();
        b bVar = (b) (d10.get(1) == i11 ? cVar.f9153f : cVar.f9151d);
        for (Long longValue : this.f9158d.f9167p0.G()) {
            d10.setTimeInMillis(longValue.longValue());
            if (d10.get(1) == i11) {
                bVar = (b) cVar.f9152e;
            }
        }
        bVar.b(aVar.f9159u);
        aVar.f9159u.setOnClickListener(new c0(this, i11));
    }

    public RecyclerView.a0 g(ViewGroup viewGroup, int i10) {
        return new a((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }

    public int l(int i10) {
        return i10 - this.f9158d.f9168q0.f9126a.f9204c;
    }
}
