package com.google.android.material.datepicker;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Calendar;
import n0.c;

/* compiled from: MaterialCalendar */
public class h extends RecyclerView.l {

    /* renamed from: a  reason: collision with root package name */
    public final Calendar f9179a = b0.e();

    /* renamed from: b  reason: collision with root package name */
    public final Calendar f9180b = b0.e();

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ g f9181c;

    public h(g gVar) {
        this.f9181c = gVar;
    }

    public void d(Canvas canvas, RecyclerView recyclerView, RecyclerView.x xVar) {
        int i10;
        int i11;
        if ((recyclerView.getAdapter() instanceof d0) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            d0 d0Var = (d0) recyclerView.getAdapter();
            GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
            for (c next : this.f9181c.f9167p0.D()) {
                F f10 = next.f21812a;
                if (!(f10 == null || next.f21813b == null)) {
                    this.f9179a.setTimeInMillis(((Long) f10).longValue());
                    this.f9180b.setTimeInMillis(((Long) next.f21813b).longValue());
                    int l10 = d0Var.l(this.f9179a.get(1));
                    int l11 = d0Var.l(this.f9180b.get(1));
                    View v10 = gridLayoutManager.v(l10);
                    View v11 = gridLayoutManager.v(l11);
                    int i12 = gridLayoutManager.F;
                    int i13 = l10 / i12;
                    int i14 = l11 / i12;
                    for (int i15 = i13; i15 <= i14; i15++) {
                        View v12 = gridLayoutManager.v(gridLayoutManager.F * i15);
                        if (v12 != null) {
                            int top = v12.getTop() + ((b) this.f9181c.f9171t0.f9151d).f9141a.top;
                            int bottom = v12.getBottom() - ((b) this.f9181c.f9171t0.f9151d).f9141a.bottom;
                            if (i15 == i13) {
                                i10 = (v10.getWidth() / 2) + v10.getLeft();
                            } else {
                                i10 = 0;
                            }
                            if (i15 == i14) {
                                i11 = (v11.getWidth() / 2) + v11.getLeft();
                            } else {
                                i11 = recyclerView.getWidth();
                            }
                            canvas.drawRect((float) i10, (float) top, (float) i11, (float) bottom, (Paint) this.f9181c.f9171t0.f9155h);
                        }
                    }
                }
            }
        }
    }
}
