package e8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.j;
import w7.a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class oi0 extends a {
    public static final Parcelable.Creator<oi0> CREATOR = new ni0();

    /* renamed from: a  reason: collision with root package name */
    public String f15798a;

    /* renamed from: b  reason: collision with root package name */
    public long f15799b;

    /* renamed from: c  reason: collision with root package name */
    public zh0 f15800c;

    /* renamed from: d  reason: collision with root package name */
    public Bundle f15801d;

    public oi0(String str, long j10, zh0 zh0, Bundle bundle) {
        this.f15798a = str;
        this.f15799b = j10;
        this.f15800c = zh0;
        this.f15801d = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int l10 = j.l(parcel, 20293);
        j.g(parcel, 1, this.f15798a, false);
        long j10 = this.f15799b;
        parcel.writeInt(524290);
        parcel.writeLong(j10);
        j.f(parcel, 3, this.f15800c, i10, false);
        j.c(parcel, 4, this.f15801d, false);
        j.m(parcel, l10);
    }
}
