package com.google.android.material.datepicker;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;

/* compiled from: SmoothCalendarLayoutManager */
public class z extends LinearLayoutManager {

    /* compiled from: SmoothCalendarLayoutManager */
    public class a extends m {
        public a(z zVar, Context context) {
            super(context);
        }

        public float h(DisplayMetrics displayMetrics) {
            return 100.0f / ((float) displayMetrics.densityDpi);
        }
    }

    public z(Context context, int i10, boolean z10) {
        super(i10, z10);
    }

    public void V0(RecyclerView recyclerView, RecyclerView.x xVar, int i10) {
        a aVar = new a(this, recyclerView.getContext());
        aVar.f2916a = i10;
        W0(aVar);
    }
}
