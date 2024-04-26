package com.google.android.material.datepicker;

import android.os.Build;
import android.widget.BaseAdapter;
import java.util.Calendar;

/* compiled from: DaysOfWeekAdapter */
public class f extends BaseAdapter {

    /* renamed from: d  reason: collision with root package name */
    public static final int f9161d = (Build.VERSION.SDK_INT >= 26 ? 4 : 1);

    /* renamed from: a  reason: collision with root package name */
    public final Calendar f9162a;

    /* renamed from: b  reason: collision with root package name */
    public final int f9163b;

    /* renamed from: c  reason: collision with root package name */
    public final int f9164c;

    public f() {
        Calendar e10 = b0.e();
        this.f9162a = e10;
        this.f9163b = e10.getMaximum(7);
        this.f9164c = e10.getFirstDayOfWeek();
    }

    public int getCount() {
        return this.f9163b;
    }

    public Object getItem(int i10) {
        int i11 = this.f9163b;
        if (i10 >= i11) {
            return null;
        }
        int i12 = i10 + this.f9164c;
        if (i12 > i11) {
            i12 -= i11;
        }
        return Integer.valueOf(i12);
    }

    public long getItemId(int i10) {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r7v8, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    @android.annotation.SuppressLint({"WrongConstant"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L_0x0018
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            r0 = 2131624103(0x7f0e00a7, float:1.8875376E38)
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L_0x0018:
            java.util.Calendar r7 = r5.f9162a
            int r2 = r5.f9164c
            int r6 = r6 + r2
            int r2 = r5.f9163b
            if (r6 <= r2) goto L_0x0022
            int r6 = r6 - r2
        L_0x0022:
            r2 = 7
            r7.set(r2, r6)
            android.content.res.Resources r6 = r0.getResources()
            android.content.res.Configuration r6 = r6.getConfiguration()
            java.util.Locale r6 = r6.locale
            java.util.Calendar r7 = r5.f9162a
            int r3 = f9161d
            java.lang.String r6 = r7.getDisplayName(r2, r3, r6)
            r0.setText(r6)
            android.content.Context r6 = r8.getContext()
            r7 = 2132017391(0x7f1400ef, float:1.967306E38)
            java.lang.String r6 = r6.getString(r7)
            r7 = 1
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.util.Calendar r8 = r5.f9162a
            r3 = 2
            java.util.Locale r4 = java.util.Locale.getDefault()
            java.lang.String r8 = r8.getDisplayName(r2, r3, r4)
            r7[r1] = r8
            java.lang.String r6 = java.lang.String.format(r6, r7)
            r0.setContentDescription(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.f.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
