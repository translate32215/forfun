package e8;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.j;
import w7.a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class e extends a {
    public static final Parcelable.Creator<e> CREATOR = new d();

    /* renamed from: a  reason: collision with root package name */
    public final String f14342a;

    public e() {
        throw null;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int l10 = j.l(parcel, 20293);
        j.g(parcel, 15, this.f14342a, false);
        j.m(parcel, l10);
    }

    public e(String str) {
        this.f14342a = str;
    }
}
