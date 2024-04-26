package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.j;
import e8.c7;
import e8.f9;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import w7.a;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class l5 extends a {
    public static final Parcelable.Creator<l5> CREATOR = new c7();

    /* renamed from: a  reason: collision with root package name */
    public final Bundle f7314a;

    /* renamed from: b  reason: collision with root package name */
    public final f9 f7315b;

    /* renamed from: c  reason: collision with root package name */
    public final ApplicationInfo f7316c;

    /* renamed from: d  reason: collision with root package name */
    public final String f7317d;

    /* renamed from: e  reason: collision with root package name */
    public final List<String> f7318e;

    /* renamed from: f  reason: collision with root package name */
    public final PackageInfo f7319f;

    /* renamed from: g  reason: collision with root package name */
    public final String f7320g;

    /* renamed from: h  reason: collision with root package name */
    public final String f7321h;

    /* renamed from: i  reason: collision with root package name */
    public ze f7322i;

    /* renamed from: r  reason: collision with root package name */
    public String f7323r;

    public l5(Bundle bundle, f9 f9Var, ApplicationInfo applicationInfo, String str, List<String> list, PackageInfo packageInfo, String str2, String str3, ze zeVar, String str4) {
        this.f7314a = bundle;
        this.f7315b = f9Var;
        this.f7317d = str;
        this.f7316c = applicationInfo;
        this.f7318e = list;
        this.f7319f = packageInfo;
        this.f7320g = str2;
        this.f7321h = str3;
        this.f7322i = zeVar;
        this.f7323r = str4;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int l10 = j.l(parcel, 20293);
        j.c(parcel, 1, this.f7314a, false);
        j.f(parcel, 2, this.f7315b, i10, false);
        j.f(parcel, 3, this.f7316c, i10, false);
        j.g(parcel, 4, this.f7317d, false);
        j.i(parcel, 5, this.f7318e, false);
        j.f(parcel, 6, this.f7319f, i10, false);
        j.g(parcel, 7, this.f7320g, false);
        j.g(parcel, 9, this.f7321h, false);
        j.f(parcel, 10, this.f7322i, i10, false);
        j.g(parcel, 11, this.f7323r, false);
        j.m(parcel, l10);
    }
}
