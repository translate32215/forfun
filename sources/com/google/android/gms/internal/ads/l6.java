package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.j;
import e8.z7;
import javax.annotation.ParametersAreNonnullByDefault;
import w7.a;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class l6 extends a {
    public static final Parcelable.Creator<l6> CREATOR = new z7();

    /* renamed from: a  reason: collision with root package name */
    public final String f7324a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7325b;

    public l6(String str, String str2) {
        this.f7324a = str;
        this.f7325b = str2;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int l10 = j.l(parcel, 20293);
        j.g(parcel, 1, this.f7324a, false);
        j.g(parcel, 2, this.f7325b, false);
        j.m(parcel, l10);
    }
}
