package e8;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.j;
import w7.a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class xh0 extends a {
    public static final Parcelable.Creator<xh0> CREATOR = new ai0();

    /* renamed from: a  reason: collision with root package name */
    public final String f17493a;

    /* renamed from: b  reason: collision with root package name */
    public final String f17494b;

    public xh0(String str, String str2) {
        this.f17493a = str;
        this.f17494b = str2;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int l10 = j.l(parcel, 20293);
        j.g(parcel, 1, this.f17493a, false);
        j.g(parcel, 2, this.f17494b, false);
        j.m(parcel, l10);
    }
}
