package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.j;
import e8.fi0;
import e8.li0;
import e8.p8;
import javax.annotation.ParametersAreNonnullByDefault;
import w7.a;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class v6 extends a {
    public static final Parcelable.Creator<v6> CREATOR = new p8();
    @Deprecated

    /* renamed from: a  reason: collision with root package name */
    public final String f8304a;

    /* renamed from: b  reason: collision with root package name */
    public final String f8305b;
    @Deprecated

    /* renamed from: c  reason: collision with root package name */
    public final li0 f8306c;

    /* renamed from: d  reason: collision with root package name */
    public final fi0 f8307d;

    public v6(String str, String str2, li0 li0, fi0 fi0) {
        this.f8304a = str;
        this.f8305b = str2;
        this.f8306c = li0;
        this.f8307d = fi0;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int l10 = j.l(parcel, 20293);
        j.g(parcel, 1, this.f8304a, false);
        j.g(parcel, 2, this.f8305b, false);
        j.f(parcel, 3, this.f8306c, i10, false);
        j.f(parcel, 4, this.f8307d, i10, false);
        j.m(parcel, l10);
    }
}
