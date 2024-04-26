package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.j;
import e8.x5;
import java.util.Arrays;
import javax.annotation.ParametersAreNonnullByDefault;
import w7.a;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class h4 extends a {
    public static final Parcelable.Creator<h4> CREATOR = new x5();

    /* renamed from: a  reason: collision with root package name */
    public final int f6733a;

    /* renamed from: b  reason: collision with root package name */
    public final int f6734b;

    /* renamed from: c  reason: collision with root package name */
    public final int f6735c;

    public h4(int i10, int i11, int i12) {
        this.f6733a = i10;
        this.f6734b = i11;
        this.f6735c = i12;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof h4)) {
            h4 h4Var = (h4) obj;
            if (h4Var.f6735c == this.f6735c && h4Var.f6734b == this.f6734b && h4Var.f6733a == this.f6733a) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new int[]{this.f6733a, this.f6734b, this.f6735c});
    }

    public final String toString() {
        int i10 = this.f6733a;
        int i11 = this.f6734b;
        int i12 = this.f6735c;
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append(i10);
        sb2.append(".");
        sb2.append(i11);
        sb2.append(".");
        sb2.append(i12);
        return sb2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int l10 = j.l(parcel, 20293);
        int i11 = this.f6733a;
        parcel.writeInt(262145);
        parcel.writeInt(i11);
        int i12 = this.f6734b;
        parcel.writeInt(262146);
        parcel.writeInt(i12);
        int i13 = this.f6735c;
        parcel.writeInt(262147);
        parcel.writeInt(i13);
        j.m(parcel, l10);
    }
}
