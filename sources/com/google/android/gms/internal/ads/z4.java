package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.activity.j;
import c8.a;
import c8.b;
import e8.t6;
import java.lang.ref.WeakReference;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import w7.a;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class z4 extends a {
    public static final Parcelable.Creator<z4> CREATOR = new t6();

    /* renamed from: a  reason: collision with root package name */
    public final View f8669a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, WeakReference<View>> f8670b;

    public z4(IBinder iBinder, IBinder iBinder2) {
        this.f8669a = (View) b.z0(a.C0062a.Y(iBinder));
        this.f8670b = (Map) b.z0(a.C0062a.Y(iBinder2));
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int l10 = j.l(parcel, 20293);
        j.e(parcel, 1, new b(this.f8669a), false);
        j.e(parcel, 2, new b(this.f8670b), false);
        j.m(parcel, l10);
    }
}
