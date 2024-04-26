package e7;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.j;
import w7.a;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class c extends a {
    public static final Parcelable.Creator<c> CREATOR = new d();

    /* renamed from: a  reason: collision with root package name */
    public final String f13628a;

    /* renamed from: b  reason: collision with root package name */
    public final String f13629b;

    /* renamed from: c  reason: collision with root package name */
    public final String f13630c;

    /* renamed from: d  reason: collision with root package name */
    public final String f13631d;

    /* renamed from: e  reason: collision with root package name */
    public final String f13632e;

    /* renamed from: f  reason: collision with root package name */
    public final String f13633f;

    /* renamed from: g  reason: collision with root package name */
    public final String f13634g;

    /* renamed from: h  reason: collision with root package name */
    public final Intent f13635h;

    public c(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this(str, str2, str3, str4, str5, str6, str7, (Intent) null);
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int l10 = j.l(parcel, 20293);
        j.g(parcel, 2, this.f13628a, false);
        j.g(parcel, 3, this.f13629b, false);
        j.g(parcel, 4, this.f13630c, false);
        j.g(parcel, 5, this.f13631d, false);
        j.g(parcel, 6, this.f13632e, false);
        j.g(parcel, 7, this.f13633f, false);
        j.g(parcel, 8, this.f13634g, false);
        j.f(parcel, 9, this.f13635h, i10, false);
        j.m(parcel, l10);
    }

    public c(Intent intent) {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, intent);
    }

    public c(String str, String str2, String str3, String str4, String str5, String str6, String str7, Intent intent) {
        this.f13628a = str;
        this.f13629b = str2;
        this.f13630c = str3;
        this.f13631d = str4;
        this.f13632e = str5;
        this.f13633f = str6;
        this.f13634g = str7;
        this.f13635h = intent;
    }
}
