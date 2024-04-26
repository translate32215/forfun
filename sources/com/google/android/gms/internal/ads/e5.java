package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.j;
import e8.y6;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import w7.a;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class e5 extends a {
    public static final Parcelable.Creator<e5> CREATOR = new y6();

    /* renamed from: a  reason: collision with root package name */
    public final boolean f6261a;

    /* renamed from: b  reason: collision with root package name */
    public final List<String> f6262b;

    public e5() {
        List<String> emptyList = Collections.emptyList();
        this.f6261a = false;
        this.f6262b = emptyList;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int l10 = j.l(parcel, 20293);
        boolean z10 = this.f6261a;
        parcel.writeInt(262146);
        parcel.writeInt(z10 ? 1 : 0);
        j.i(parcel, 3, this.f6262b, false);
        j.m(parcel, l10);
    }

    public e5(boolean z10, List<String> list) {
        this.f6261a = z10;
        this.f6262b = list;
    }
}
