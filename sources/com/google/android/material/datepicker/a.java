package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: CalendarConstraints */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0095a();

    /* renamed from: a  reason: collision with root package name */
    public final t f9126a;

    /* renamed from: b  reason: collision with root package name */
    public final t f9127b;

    /* renamed from: c  reason: collision with root package name */
    public final c f9128c;

    /* renamed from: d  reason: collision with root package name */
    public t f9129d;

    /* renamed from: e  reason: collision with root package name */
    public final int f9130e;

    /* renamed from: f  reason: collision with root package name */
    public final int f9131f;

    /* renamed from: com.google.android.material.datepicker.a$a  reason: collision with other inner class name */
    /* compiled from: CalendarConstraints */
    public class C0095a implements Parcelable.Creator<a> {
        public Object createFromParcel(Parcel parcel) {
            return new a((t) parcel.readParcelable(t.class.getClassLoader()), (t) parcel.readParcelable(t.class.getClassLoader()), (c) parcel.readParcelable(c.class.getClassLoader()), (t) parcel.readParcelable(t.class.getClassLoader()), (C0095a) null);
        }

        public Object[] newArray(int i10) {
            return new a[i10];
        }
    }

    /* compiled from: CalendarConstraints */
    public static final class b {

        /* renamed from: e  reason: collision with root package name */
        public static final long f9132e = b0.a(t.b(1900, 0).f9207f);

        /* renamed from: f  reason: collision with root package name */
        public static final long f9133f = b0.a(t.b(2100, 11).f9207f);

        /* renamed from: a  reason: collision with root package name */
        public long f9134a = f9132e;

        /* renamed from: b  reason: collision with root package name */
        public long f9135b = f9133f;

        /* renamed from: c  reason: collision with root package name */
        public Long f9136c;

        /* renamed from: d  reason: collision with root package name */
        public c f9137d = new e(Long.MIN_VALUE);

        public b(a aVar) {
            this.f9134a = aVar.f9126a.f9207f;
            this.f9135b = aVar.f9127b.f9207f;
            this.f9136c = Long.valueOf(aVar.f9129d.f9207f);
            this.f9137d = aVar.f9128c;
        }
    }

    /* compiled from: CalendarConstraints */
    public interface c extends Parcelable {
        boolean o(long j10);
    }

    public a(t tVar, t tVar2, c cVar, t tVar3, C0095a aVar) {
        this.f9126a = tVar;
        this.f9127b = tVar2;
        this.f9129d = tVar3;
        this.f9128c = cVar;
        if (tVar3 != null && tVar.f9202a.compareTo(tVar3.f9202a) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        } else if (tVar3 == null || tVar3.f9202a.compareTo(tVar2.f9202a) <= 0) {
            this.f9131f = tVar.s(tVar2) + 1;
            this.f9130e = (tVar2.f9204c - tVar.f9204c) + 1;
        } else {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (!this.f9126a.equals(aVar.f9126a) || !this.f9127b.equals(aVar.f9127b) || !n0.b.a(this.f9129d, aVar.f9129d) || !this.f9128c.equals(aVar.f9128c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9126a, this.f9127b, this.f9129d, this.f9128c});
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f9126a, 0);
        parcel.writeParcelable(this.f9127b, 0);
        parcel.writeParcelable(this.f9129d, 0);
        parcel.writeParcelable(this.f9128c, 0);
    }
}
