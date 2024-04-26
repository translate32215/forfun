package e8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.j;
import w7.a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class b4 extends a {
    public static final Parcelable.Creator<b4> CREATOR = new c4();

    /* renamed from: a  reason: collision with root package name */
    public final String f13876a;

    /* renamed from: b  reason: collision with root package name */
    public final Bundle f13877b;

    public b4(String str, Bundle bundle) {
        this.f13876a = str;
        this.f13877b = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int l10 = j.l(parcel, 20293);
        j.g(parcel, 1, this.f13876a, false);
        j.c(parcel, 2, this.f13877b, false);
        j.m(parcel, l10);
    }
}
