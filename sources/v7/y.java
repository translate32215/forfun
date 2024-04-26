package v7;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.j;
import s7.c;
import w7.a;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class y extends a {
    public static final Parcelable.Creator<y> CREATOR = new z();

    /* renamed from: a  reason: collision with root package name */
    public Bundle f26605a;

    /* renamed from: b  reason: collision with root package name */
    public c[] f26606b;

    /* renamed from: c  reason: collision with root package name */
    public int f26607c;

    /* renamed from: d  reason: collision with root package name */
    public a f26608d;

    public y() {
    }

    public y(Bundle bundle, c[] cVarArr, int i10, a aVar) {
        this.f26605a = bundle;
        this.f26606b = cVarArr;
        this.f26607c = i10;
        this.f26608d = aVar;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int l10 = j.l(parcel, 20293);
        j.c(parcel, 1, this.f26605a, false);
        j.j(parcel, 2, this.f26606b, i10, false);
        int i11 = this.f26607c;
        parcel.writeInt(262147);
        parcel.writeInt(i11);
        j.f(parcel, 4, this.f26608d, i10, false);
        j.m(parcel, l10);
    }
}
