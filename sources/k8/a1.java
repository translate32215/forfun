package k8;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.j;
import w7.a;

/* compiled from: com.google.android.gms:play-services-measurement-base@@19.0.2 */
public final class a1 extends a {
    public static final Parcelable.Creator<a1> CREATOR = new b1();

    /* renamed from: a  reason: collision with root package name */
    public final long f20053a;

    /* renamed from: b  reason: collision with root package name */
    public final long f20054b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f20055c;

    /* renamed from: d  reason: collision with root package name */
    public final String f20056d;

    /* renamed from: e  reason: collision with root package name */
    public final String f20057e;

    /* renamed from: f  reason: collision with root package name */
    public final String f20058f;

    /* renamed from: g  reason: collision with root package name */
    public final Bundle f20059g;

    /* renamed from: h  reason: collision with root package name */
    public final String f20060h;

    public a1(long j10, long j11, boolean z10, String str, String str2, String str3, Bundle bundle, String str4) {
        this.f20053a = j10;
        this.f20054b = j11;
        this.f20055c = z10;
        this.f20056d = str;
        this.f20057e = str2;
        this.f20058f = str3;
        this.f20059g = bundle;
        this.f20060h = str4;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int l10 = j.l(parcel, 20293);
        long j10 = this.f20053a;
        parcel.writeInt(524289);
        parcel.writeLong(j10);
        long j11 = this.f20054b;
        parcel.writeInt(524290);
        parcel.writeLong(j11);
        boolean z10 = this.f20055c;
        parcel.writeInt(262147);
        parcel.writeInt(z10 ? 1 : 0);
        j.g(parcel, 4, this.f20056d, false);
        j.g(parcel, 5, this.f20057e, false);
        j.g(parcel, 6, this.f20058f, false);
        j.c(parcel, 7, this.f20059g, false);
        j.g(parcel, 8, this.f20060h, false);
        j.m(parcel, l10);
    }
}
