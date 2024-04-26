package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.j;
import e8.f9;
import e8.fi0;
import e8.li0;
import e8.n1;
import e8.x6;
import e8.yi0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import w7.a;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class d5 extends a {
    public static final Parcelable.Creator<d5> CREATOR = new x6();
    public final float A;
    public final String B;
    public final long C;
    public final String D;
    public final List<String> E;
    public final String F;
    public final n1 G;
    public final List<String> H;
    public final long I;
    public final String J;
    public final float K;
    public final int L;
    public final int M;
    public final boolean N;
    public final String O;
    public final boolean P;
    public final String Q;
    public final boolean R;
    public final int S;
    public final Bundle Z;

    /* renamed from: a  reason: collision with root package name */
    public final int f6150a;

    /* renamed from: a0  reason: collision with root package name */
    public final String f6151a0;

    /* renamed from: b  reason: collision with root package name */
    public final Bundle f6152b;

    /* renamed from: b0  reason: collision with root package name */
    public final yi0 f6153b0;

    /* renamed from: c  reason: collision with root package name */
    public final fi0 f6154c;

    /* renamed from: c0  reason: collision with root package name */
    public final boolean f6155c0;

    /* renamed from: d  reason: collision with root package name */
    public final li0 f6156d;

    /* renamed from: d0  reason: collision with root package name */
    public final Bundle f6157d0;

    /* renamed from: e  reason: collision with root package name */
    public final String f6158e;

    /* renamed from: e0  reason: collision with root package name */
    public final String f6159e0;

    /* renamed from: f  reason: collision with root package name */
    public final ApplicationInfo f6160f;

    /* renamed from: f0  reason: collision with root package name */
    public final String f6161f0;

    /* renamed from: g  reason: collision with root package name */
    public final PackageInfo f6162g;

    /* renamed from: g0  reason: collision with root package name */
    public final String f6163g0;

    /* renamed from: h  reason: collision with root package name */
    public final String f6164h;

    /* renamed from: h0  reason: collision with root package name */
    public final boolean f6165h0;

    /* renamed from: i  reason: collision with root package name */
    public final String f6166i;

    /* renamed from: i0  reason: collision with root package name */
    public final List<Integer> f6167i0;

    /* renamed from: j0  reason: collision with root package name */
    public final String f6168j0;

    /* renamed from: k0  reason: collision with root package name */
    public final List<String> f6169k0;

    /* renamed from: l0  reason: collision with root package name */
    public final int f6170l0;

    /* renamed from: m0  reason: collision with root package name */
    public final boolean f6171m0;

    /* renamed from: n0  reason: collision with root package name */
    public final boolean f6172n0;

    /* renamed from: o0  reason: collision with root package name */
    public final boolean f6173o0;

    /* renamed from: p0  reason: collision with root package name */
    public final ArrayList<String> f6174p0;

    /* renamed from: q0  reason: collision with root package name */
    public final String f6175q0;

    /* renamed from: r  reason: collision with root package name */
    public final String f6176r;

    /* renamed from: r0  reason: collision with root package name */
    public final z1 f6177r0;

    /* renamed from: s  reason: collision with root package name */
    public final f9 f6178s;

    /* renamed from: s0  reason: collision with root package name */
    public final String f6179s0;

    /* renamed from: t  reason: collision with root package name */
    public final Bundle f6180t;

    /* renamed from: t0  reason: collision with root package name */
    public final Bundle f6181t0;

    /* renamed from: u  reason: collision with root package name */
    public final int f6182u;

    /* renamed from: v  reason: collision with root package name */
    public final List<String> f6183v;

    /* renamed from: w  reason: collision with root package name */
    public final Bundle f6184w;

    /* renamed from: x  reason: collision with root package name */
    public final boolean f6185x;

    /* renamed from: y  reason: collision with root package name */
    public final int f6186y;

    /* renamed from: z  reason: collision with root package name */
    public final int f6187z;

    public d5(int i10, Bundle bundle, fi0 fi0, li0 li0, String str, ApplicationInfo applicationInfo, PackageInfo packageInfo, String str2, String str3, String str4, f9 f9Var, Bundle bundle2, int i11, List<String> list, Bundle bundle3, boolean z10, int i12, int i13, float f10, String str5, long j10, String str6, List<String> list2, String str7, n1 n1Var, List<String> list3, long j11, String str8, float f11, boolean z11, int i14, int i15, boolean z12, String str9, String str10, boolean z13, int i16, Bundle bundle4, String str11, yi0 yi0, boolean z14, Bundle bundle5, String str12, String str13, String str14, boolean z15, List<Integer> list4, String str15, List<String> list5, int i17, boolean z16, boolean z17, boolean z18, ArrayList<String> arrayList, String str16, z1 z1Var, String str17, Bundle bundle6) {
        List<String> list6;
        List<String> list7;
        this.f6150a = i10;
        this.f6152b = bundle;
        this.f6154c = fi0;
        this.f6156d = li0;
        this.f6158e = str;
        this.f6160f = applicationInfo;
        this.f6162g = packageInfo;
        this.f6164h = str2;
        this.f6166i = str3;
        this.f6176r = str4;
        this.f6178s = f9Var;
        this.f6180t = bundle2;
        this.f6182u = i11;
        this.f6183v = list;
        if (list3 == null) {
            list6 = Collections.emptyList();
        } else {
            list6 = Collections.unmodifiableList(list3);
        }
        this.H = list6;
        this.f6184w = bundle3;
        this.f6185x = z10;
        this.f6186y = i12;
        this.f6187z = i13;
        this.A = f10;
        this.B = str5;
        this.C = j10;
        this.D = str6;
        if (list2 == null) {
            list7 = Collections.emptyList();
        } else {
            list7 = Collections.unmodifiableList(list2);
        }
        this.E = list7;
        this.F = str7;
        this.G = n1Var;
        this.I = j11;
        this.J = str8;
        this.K = f11;
        this.P = z11;
        this.L = i14;
        this.M = i15;
        this.N = z12;
        this.O = str9;
        this.Q = str10;
        this.R = z13;
        this.S = i16;
        this.Z = bundle4;
        this.f6151a0 = str11;
        this.f6153b0 = yi0;
        this.f6155c0 = z14;
        this.f6157d0 = bundle5;
        this.f6159e0 = str12;
        this.f6161f0 = str13;
        this.f6163g0 = str14;
        this.f6165h0 = z15;
        this.f6167i0 = list4;
        this.f6168j0 = str15;
        this.f6169k0 = list5;
        this.f6170l0 = i17;
        this.f6171m0 = z16;
        this.f6172n0 = z17;
        this.f6173o0 = z18;
        this.f6174p0 = arrayList;
        this.f6175q0 = str16;
        this.f6177r0 = z1Var;
        this.f6179s0 = str17;
        this.f6181t0 = bundle6;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int l10 = j.l(parcel, 20293);
        int i11 = this.f6150a;
        parcel.writeInt(262145);
        parcel.writeInt(i11);
        j.c(parcel, 2, this.f6152b, false);
        j.f(parcel, 3, this.f6154c, i10, false);
        j.f(parcel, 4, this.f6156d, i10, false);
        j.g(parcel, 5, this.f6158e, false);
        j.f(parcel, 6, this.f6160f, i10, false);
        j.f(parcel, 7, this.f6162g, i10, false);
        j.g(parcel, 8, this.f6164h, false);
        j.g(parcel, 9, this.f6166i, false);
        j.g(parcel, 10, this.f6176r, false);
        j.f(parcel, 11, this.f6178s, i10, false);
        j.c(parcel, 12, this.f6180t, false);
        int i12 = this.f6182u;
        parcel.writeInt(262157);
        parcel.writeInt(i12);
        j.i(parcel, 14, this.f6183v, false);
        j.c(parcel, 15, this.f6184w, false);
        boolean z10 = this.f6185x;
        parcel.writeInt(262160);
        parcel.writeInt(z10 ? 1 : 0);
        int i13 = this.f6186y;
        parcel.writeInt(262162);
        parcel.writeInt(i13);
        int i14 = this.f6187z;
        parcel.writeInt(262163);
        parcel.writeInt(i14);
        float f10 = this.A;
        parcel.writeInt(262164);
        parcel.writeFloat(f10);
        j.g(parcel, 21, this.B, false);
        long j10 = this.C;
        parcel.writeInt(524313);
        parcel.writeLong(j10);
        j.g(parcel, 26, this.D, false);
        j.i(parcel, 27, this.E, false);
        j.g(parcel, 28, this.F, false);
        j.f(parcel, 29, this.G, i10, false);
        j.i(parcel, 30, this.H, false);
        long j11 = this.I;
        parcel.writeInt(524319);
        parcel.writeLong(j11);
        j.g(parcel, 33, this.J, false);
        float f11 = this.K;
        parcel.writeInt(262178);
        parcel.writeFloat(f11);
        int i15 = this.L;
        parcel.writeInt(262179);
        parcel.writeInt(i15);
        int i16 = this.M;
        parcel.writeInt(262180);
        parcel.writeInt(i16);
        boolean z11 = this.N;
        parcel.writeInt(262181);
        parcel.writeInt(z11 ? 1 : 0);
        j.g(parcel, 39, this.O, false);
        boolean z12 = this.P;
        parcel.writeInt(262184);
        parcel.writeInt(z12 ? 1 : 0);
        j.g(parcel, 41, this.Q, false);
        boolean z13 = this.R;
        parcel.writeInt(262186);
        parcel.writeInt(z13 ? 1 : 0);
        int i17 = this.S;
        parcel.writeInt(262187);
        parcel.writeInt(i17);
        j.c(parcel, 44, this.Z, false);
        j.g(parcel, 45, this.f6151a0, false);
        j.f(parcel, 46, this.f6153b0, i10, false);
        boolean z14 = this.f6155c0;
        parcel.writeInt(262191);
        parcel.writeInt(z14 ? 1 : 0);
        j.c(parcel, 48, this.f6157d0, false);
        j.g(parcel, 49, this.f6159e0, false);
        j.g(parcel, 50, this.f6161f0, false);
        j.g(parcel, 51, this.f6163g0, false);
        boolean z15 = this.f6165h0;
        parcel.writeInt(262196);
        parcel.writeInt(z15 ? 1 : 0);
        List<Integer> list = this.f6167i0;
        if (list != null) {
            int l11 = j.l(parcel, 53);
            int size = list.size();
            parcel.writeInt(size);
            for (int i18 = 0; i18 < size; i18++) {
                parcel.writeInt(list.get(i18).intValue());
            }
            j.m(parcel, l11);
        }
        j.g(parcel, 54, this.f6168j0, false);
        j.i(parcel, 55, this.f6169k0, false);
        int i19 = this.f6170l0;
        parcel.writeInt(262200);
        parcel.writeInt(i19);
        boolean z16 = this.f6171m0;
        parcel.writeInt(262201);
        parcel.writeInt(z16 ? 1 : 0);
        boolean z17 = this.f6172n0;
        parcel.writeInt(262202);
        parcel.writeInt(z17 ? 1 : 0);
        boolean z18 = this.f6173o0;
        parcel.writeInt(262203);
        parcel.writeInt(z18 ? 1 : 0);
        j.i(parcel, 60, this.f6174p0, false);
        j.g(parcel, 61, this.f6175q0, false);
        j.f(parcel, 63, this.f6177r0, i10, false);
        j.g(parcel, 64, this.f6179s0, false);
        j.c(parcel, 65, this.f6181t0, false);
        j.m(parcel, l10);
    }
}
