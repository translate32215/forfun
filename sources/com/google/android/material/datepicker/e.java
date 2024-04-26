package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.a;
import java.util.Arrays;

/* compiled from: DateValidatorPointForward */
public class e implements a.c {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final long f9160a;

    /* compiled from: DateValidatorPointForward */
    public class a implements Parcelable.Creator<e> {
        public Object createFromParcel(Parcel parcel) {
            return new e(parcel.readLong(), (a) null);
        }

        public Object[] newArray(int i10) {
            return new e[i10];
        }
    }

    public e(long j10) {
        this.f9160a = j10;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof e) && this.f9160a == ((e) obj).f9160a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f9160a)});
    }

    public boolean o(long j10) {
        return j10 >= this.f9160a;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f9160a);
    }

    public e(long j10, a aVar) {
        this.f9160a = j10;
    }
}
