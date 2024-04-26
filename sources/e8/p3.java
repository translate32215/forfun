package e8;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.j;
import w7.a;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class p3 extends a {
    public static final Parcelable.Creator<p3> CREATOR = new s3();

    /* renamed from: a  reason: collision with root package name */
    public final String f15865a;

    /* renamed from: b  reason: collision with root package name */
    public final String[] f15866b;

    /* renamed from: c  reason: collision with root package name */
    public final String[] f15867c;

    public p3(String str, String[] strArr, String[] strArr2) {
        this.f15865a = str;
        this.f15866b = strArr;
        this.f15867c = strArr2;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int l10 = j.l(parcel, 20293);
        j.g(parcel, 1, this.f15865a, false);
        j.h(parcel, 2, this.f15866b, false);
        j.h(parcel, 3, this.f15867c, false);
        j.m(parcel, l10);
    }
}
