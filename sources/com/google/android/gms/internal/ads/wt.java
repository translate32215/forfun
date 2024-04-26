package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import e8.he0;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class wt implements Parcelable {
    public static final Parcelable.Creator<wt> CREATOR = new he0();

    /* renamed from: a  reason: collision with root package name */
    public final a[] f8478a;

    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    public interface a extends Parcelable {
    }

    public wt(List<? extends a> list) {
        a[] aVarArr = new a[list.size()];
        this.f8478a = aVarArr;
        list.toArray(aVarArr);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wt.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f8478a, ((wt) obj).f8478a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f8478a);
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f8478a.length);
        for (a writeParcelable : this.f8478a) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    public wt(Parcel parcel) {
        this.f8478a = new a[parcel.readInt()];
        int i10 = 0;
        while (true) {
            a[] aVarArr = this.f8478a;
            if (i10 < aVarArr.length) {
                aVarArr[i10] = (a) parcel.readParcelable(a.class.getClassLoader());
                i10++;
            } else {
                return;
            }
        }
    }
}
