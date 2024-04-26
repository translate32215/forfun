package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: UtcDates */
public class b0 {

    /* renamed from: a  reason: collision with root package name */
    public static AtomicReference<a0> f9147a = new AtomicReference<>();

    public static long a(long j10) {
        Calendar e10 = e();
        e10.setTimeInMillis(j10);
        return b(e10).getTimeInMillis();
    }

    public static Calendar b(Calendar calendar) {
        Calendar f10 = f(calendar);
        Calendar e10 = e();
        e10.set(f10.get(1), f10.get(2), f10.get(5));
        return e10;
    }

    public static TimeZone c() {
        return TimeZone.getTimeZone("UTC");
    }

    public static Calendar d() {
        a0 a0Var = f9147a.get();
        if (a0Var == null) {
            a0Var = a0.f9138c;
        }
        TimeZone timeZone = a0Var.f9140b;
        Calendar instance = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l10 = a0Var.f9139a;
        if (l10 != null) {
            instance.setTimeInMillis(l10.longValue());
        }
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        instance.setTimeZone(c());
        return instance;
    }

    public static Calendar e() {
        return f((Calendar) null);
    }

    public static Calendar f(Calendar calendar) {
        Calendar instance = Calendar.getInstance(c());
        if (calendar == null) {
            instance.clear();
        } else {
            instance.setTimeInMillis(calendar.getTimeInMillis());
        }
        return instance;
    }
}
