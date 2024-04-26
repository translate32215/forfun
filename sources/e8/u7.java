package e8;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.j;
import w7.a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class u7 extends a {
    public static final Parcelable.Creator<u7> CREATOR = new x7();

    /* renamed from: a  reason: collision with root package name */
    public final fi0 f16852a;

    /* renamed from: b  reason: collision with root package name */
    public final String f16853b;

    public u7(fi0 fi0, String str) {
        this.f16852a = fi0;
        this.f16853b = str;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int l10 = j.l(parcel, 20293);
        j.f(parcel, 2, this.f16852a, i10, false);
        j.g(parcel, 3, this.f16853b, false);
        j.m(parcel, l10);
    }
}
