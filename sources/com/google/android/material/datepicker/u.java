package com.google.android.material.datepicker;

import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: MonthAdapter */
public class u extends BaseAdapter {

    /* renamed from: f  reason: collision with root package name */
    public static final int f9209f = b0.e().getMaximum(4);

    /* renamed from: a  reason: collision with root package name */
    public final t f9210a;

    /* renamed from: b  reason: collision with root package name */
    public final d<?> f9211b;

    /* renamed from: c  reason: collision with root package name */
    public Collection<Long> f9212c;

    /* renamed from: d  reason: collision with root package name */
    public c f9213d;

    /* renamed from: e  reason: collision with root package name */
    public final a f9214e;

    public u(t tVar, d<?> dVar, a aVar) {
        this.f9210a = tVar;
        this.f9211b = dVar;
        this.f9214e = aVar;
        this.f9212c = dVar.G();
    }

    public int a(int i10) {
        return b() + (i10 - 1);
    }

    public int b() {
        return this.f9210a.m();
    }

    /* renamed from: c */
    public Long getItem(int i10) {
        if (i10 < this.f9210a.m() || i10 > d()) {
            return null;
        }
        t tVar = this.f9210a;
        Calendar b10 = b0.b(tVar.f9202a);
        b10.set(5, (i10 - tVar.m()) + 1);
        return Long.valueOf(b10.getTimeInMillis());
    }

    public int d() {
        return (this.f9210a.m() + this.f9210a.f9206e) - 1;
    }

    public final void e(TextView textView, long j10) {
        b bVar;
        if (textView != null) {
            boolean z10 = false;
            if (this.f9214e.f9128c.o(j10)) {
                textView.setEnabled(true);
                Iterator<Long> it = this.f9211b.G().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (b0.a(j10) == b0.a(it.next().longValue())) {
                        z10 = true;
                        break;
                    }
                }
                if (z10) {
                    bVar = (b) this.f9213d.f9149b;
                } else if (b0.d().getTimeInMillis() == j10) {
                    bVar = (b) this.f9213d.f9150c;
                } else {
                    bVar = (b) this.f9213d.f9148a;
                }
            } else {
                textView.setEnabled(false);
                bVar = (b) this.f9213d.f9154g;
            }
            bVar.b(textView);
        }
    }

    public final void f(MaterialCalendarGridView materialCalendarGridView, long j10) {
        if (t.i(j10).equals(this.f9210a)) {
            Calendar b10 = b0.b(this.f9210a.f9202a);
            b10.setTimeInMillis(j10);
            e((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter().a(b10.get(5)) - materialCalendarGridView.getFirstVisiblePosition()), j10);
        }
    }

    public int getCount() {
        return b() + this.f9210a.f9206e;
    }

    public long getItemId(int i10) {
        return (long) (i10 / this.f9210a.f9205d);
    }

    /* JADX WARNING: type inference failed for: r10v14, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0119  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r9, android.view.View r10, android.view.ViewGroup r11) {
        /*
            r8 = this;
            android.content.Context r0 = r11.getContext()
            com.google.android.material.datepicker.c r1 = r8.f9213d
            if (r1 != 0) goto L_0x000f
            com.google.android.material.datepicker.c r1 = new com.google.android.material.datepicker.c
            r1.<init>(r0)
            r8.f9213d = r1
        L_0x000f:
            r0 = r10
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r10 != 0) goto L_0x0027
            android.content.Context r10 = r11.getContext()
            android.view.LayoutInflater r10 = android.view.LayoutInflater.from(r10)
            r0 = 2131624102(0x7f0e00a6, float:1.8875374E38)
            android.view.View r10 = r10.inflate(r0, r11, r1)
            r0 = r10
            android.widget.TextView r0 = (android.widget.TextView) r0
        L_0x0027:
            int r10 = r8.b()
            int r10 = r9 - r10
            if (r10 < 0) goto L_0x010a
            com.google.android.material.datepicker.t r11 = r8.f9210a
            int r2 = r11.f9206e
            if (r10 < r2) goto L_0x0037
            goto L_0x010a
        L_0x0037:
            r2 = 1
            int r10 = r10 + r2
            r0.setTag(r11)
            android.content.res.Resources r11 = r0.getResources()
            android.content.res.Configuration r11 = r11.getConfiguration()
            java.util.Locale r11 = r11.locale
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
            r3[r1] = r4
            java.lang.String r4 = "%d"
            java.lang.String r11 = java.lang.String.format(r11, r4, r3)
            r0.setText(r11)
            com.google.android.material.datepicker.t r11 = r8.f9210a
            java.util.Calendar r11 = r11.f9202a
            java.util.Calendar r11 = com.google.android.material.datepicker.b0.b(r11)
            r3 = 5
            r11.set(r3, r10)
            long r10 = r11.getTimeInMillis()
            com.google.android.material.datepicker.t r4 = r8.f9210a
            int r4 = r4.f9204c
            java.util.Calendar r5 = com.google.android.material.datepicker.b0.d()
            r5.set(r3, r2)
            java.util.Calendar r5 = com.google.android.material.datepicker.b0.b(r5)
            r6 = 2
            r5.get(r6)
            int r6 = r5.get(r2)
            r7 = 7
            r5.getMaximum(r7)
            r5.getActualMaximum(r3)
            r5.getTimeInMillis()
            java.lang.String r3 = "UTC"
            r5 = 24
            if (r4 != r6) goto L_0x00c9
            java.util.Locale r4 = java.util.Locale.getDefault()
            int r6 = android.os.Build.VERSION.SDK_INT
            if (r6 < r5) goto L_0x00af
            java.util.concurrent.atomic.AtomicReference<com.google.android.material.datepicker.a0> r5 = com.google.android.material.datepicker.b0.f9147a
            java.lang.String r5 = "MMMEd"
            android.icu.text.DateFormat r4 = android.icu.text.DateFormat.getInstanceForSkeleton(r5, r4)
            android.icu.util.TimeZone r3 = android.icu.util.TimeZone.getTimeZone(r3)
            r4.setTimeZone(r3)
            java.util.Date r3 = new java.util.Date
            r3.<init>(r10)
            java.lang.String r10 = r4.format(r3)
            goto L_0x00c5
        L_0x00af:
            java.util.concurrent.atomic.AtomicReference<com.google.android.material.datepicker.a0> r3 = com.google.android.material.datepicker.b0.f9147a
            java.text.DateFormat r3 = java.text.DateFormat.getDateInstance(r1, r4)
            java.util.TimeZone r4 = com.google.android.material.datepicker.b0.c()
            r3.setTimeZone(r4)
            java.util.Date r4 = new java.util.Date
            r4.<init>(r10)
            java.lang.String r10 = r3.format(r4)
        L_0x00c5:
            r0.setContentDescription(r10)
            goto L_0x0103
        L_0x00c9:
            java.util.Locale r4 = java.util.Locale.getDefault()
            int r6 = android.os.Build.VERSION.SDK_INT
            if (r6 < r5) goto L_0x00ea
            java.util.concurrent.atomic.AtomicReference<com.google.android.material.datepicker.a0> r5 = com.google.android.material.datepicker.b0.f9147a
            java.lang.String r5 = "yMMMEd"
            android.icu.text.DateFormat r4 = android.icu.text.DateFormat.getInstanceForSkeleton(r5, r4)
            android.icu.util.TimeZone r3 = android.icu.util.TimeZone.getTimeZone(r3)
            r4.setTimeZone(r3)
            java.util.Date r3 = new java.util.Date
            r3.<init>(r10)
            java.lang.String r10 = r4.format(r3)
            goto L_0x0100
        L_0x00ea:
            java.util.concurrent.atomic.AtomicReference<com.google.android.material.datepicker.a0> r3 = com.google.android.material.datepicker.b0.f9147a
            java.text.DateFormat r3 = java.text.DateFormat.getDateInstance(r1, r4)
            java.util.TimeZone r4 = com.google.android.material.datepicker.b0.c()
            r3.setTimeZone(r4)
            java.util.Date r4 = new java.util.Date
            r4.<init>(r10)
            java.lang.String r10 = r3.format(r4)
        L_0x0100:
            r0.setContentDescription(r10)
        L_0x0103:
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto L_0x0112
        L_0x010a:
            r10 = 8
            r0.setVisibility(r10)
            r0.setEnabled(r1)
        L_0x0112:
            java.lang.Long r9 = r8.getItem(r9)
            if (r9 != 0) goto L_0x0119
            goto L_0x0120
        L_0x0119:
            long r9 = r9.longValue()
            r8.e(r0, r9)
        L_0x0120:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.u.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public boolean hasStableIds() {
        return true;
    }
}
