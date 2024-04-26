package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.format.DateUtils;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* compiled from: Month */
public final class t implements Comparable<t>, Parcelable {
    public static final Parcelable.Creator<t> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final Calendar f9202a;

    /* renamed from: b  reason: collision with root package name */
    public final int f9203b;

    /* renamed from: c  reason: collision with root package name */
    public final int f9204c;

    /* renamed from: d  reason: collision with root package name */
    public final int f9205d;

    /* renamed from: e  reason: collision with root package name */
    public final int f9206e;

    /* renamed from: f  reason: collision with root package name */
    public final long f9207f;

    /* renamed from: g  reason: collision with root package name */
    public String f9208g;

    /* compiled from: Month */
    public class a implements Parcelable.Creator<t> {
        public Object createFromParcel(Parcel parcel) {
            return t.b(parcel.readInt(), parcel.readInt());
        }

        public Object[] newArray(int i10) {
            return new t[i10];
        }
    }

    public t(Calendar calendar) {
        calendar.set(5, 1);
        Calendar b10 = b0.b(calendar);
        this.f9202a = b10;
        this.f9203b = b10.get(2);
        this.f9204c = b10.get(1);
        this.f9205d = b10.getMaximum(7);
        this.f9206e = b10.getActualMaximum(5);
        this.f9207f = b10.getTimeInMillis();
    }

    public static t b(int i10, int i11) {
        Calendar e10 = b0.e();
        e10.set(1, i10);
        e10.set(2, i11);
        return new t(e10);
    }

    public static t i(long j10) {
        Calendar e10 = b0.e();
        e10.setTimeInMillis(j10);
        return new t(e10);
    }

    /* renamed from: a */
    public int compareTo(t tVar) {
        return this.f9202a.compareTo(tVar.f9202a);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        if (this.f9203b == tVar.f9203b && this.f9204c == tVar.f9204c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f9203b), Integer.valueOf(this.f9204c)});
    }

    public int m() {
        int firstDayOfWeek = this.f9202a.get(7) - this.f9202a.getFirstDayOfWeek();
        return firstDayOfWeek < 0 ? firstDayOfWeek + this.f9205d : firstDayOfWeek;
    }

    public String q() {
        if (this.f9208g == null) {
            this.f9208g = DateUtils.formatDateTime((Context) null, this.f9202a.getTimeInMillis(), 8228);
        }
        return this.f9208g;
    }

    public t r(int i10) {
        Calendar b10 = b0.b(this.f9202a);
        b10.add(2, i10);
        return new t(b10);
    }

    public int s(t tVar) {
        if (this.f9202a instanceof GregorianCalendar) {
            return (tVar.f9203b - this.f9203b) + ((tVar.f9204c - this.f9204c) * 12);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f9204c);
        parcel.writeInt(this.f9203b);
    }
}
