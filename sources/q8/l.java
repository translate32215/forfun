package q8;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.j;
import com.google.android.gms.common.internal.n;
import w7.a;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class l extends a {
    public static final Parcelable.Creator<l> CREATOR = new m();

    /* renamed from: a  reason: collision with root package name */
    public final int f24226a;

    /* renamed from: b  reason: collision with root package name */
    public final s7.a f24227b;

    /* renamed from: c  reason: collision with root package name */
    public final n f24228c;

    public l(int i10, s7.a aVar, n nVar) {
        this.f24226a = i10;
        this.f24227b = aVar;
        this.f24228c = nVar;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int l10 = j.l(parcel, 20293);
        int i11 = this.f24226a;
        parcel.writeInt(262145);
        parcel.writeInt(i11);
        j.f(parcel, 2, this.f24227b, i10, false);
        j.f(parcel, 3, this.f24228c, i10, false);
        j.m(parcel, l10);
    }
}
