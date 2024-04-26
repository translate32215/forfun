package e8;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.j;
import com.google.android.gms.common.internal.h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import w7.a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class fi0 extends a {
    public static final Parcelable.Creator<fi0> CREATOR = new hi0();
    public final xh0 A;
    public final int B;
    public final String C;
    public final List<String> D;
    public final int E;

    /* renamed from: a  reason: collision with root package name */
    public final int f14631a;
    @Deprecated

    /* renamed from: b  reason: collision with root package name */
    public final long f14632b;

    /* renamed from: c  reason: collision with root package name */
    public final Bundle f14633c;
    @Deprecated

    /* renamed from: d  reason: collision with root package name */
    public final int f14634d;

    /* renamed from: e  reason: collision with root package name */
    public final List<String> f14635e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f14636f;

    /* renamed from: g  reason: collision with root package name */
    public final int f14637g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f14638h;

    /* renamed from: i  reason: collision with root package name */
    public final String f14639i;

    /* renamed from: r  reason: collision with root package name */
    public final e f14640r;

    /* renamed from: s  reason: collision with root package name */
    public final Location f14641s;

    /* renamed from: t  reason: collision with root package name */
    public final String f14642t;

    /* renamed from: u  reason: collision with root package name */
    public final Bundle f14643u;

    /* renamed from: v  reason: collision with root package name */
    public final Bundle f14644v;

    /* renamed from: w  reason: collision with root package name */
    public final List<String> f14645w;

    /* renamed from: x  reason: collision with root package name */
    public final String f14646x;

    /* renamed from: y  reason: collision with root package name */
    public final String f14647y;
    @Deprecated

    /* renamed from: z  reason: collision with root package name */
    public final boolean f14648z;

    public fi0(int i10, long j10, Bundle bundle, int i11, List<String> list, boolean z10, int i12, boolean z11, String str, e eVar, Location location, String str2, Bundle bundle2, Bundle bundle3, List<String> list2, String str3, String str4, boolean z12, xh0 xh0, int i13, String str5, List<String> list3, int i14) {
        this.f14631a = i10;
        this.f14632b = j10;
        this.f14633c = bundle == null ? new Bundle() : bundle;
        this.f14634d = i11;
        this.f14635e = list;
        this.f14636f = z10;
        this.f14637g = i12;
        this.f14638h = z11;
        this.f14639i = str;
        this.f14640r = eVar;
        this.f14641s = location;
        this.f14642t = str2;
        this.f14643u = bundle2 == null ? new Bundle() : bundle2;
        this.f14644v = bundle3;
        this.f14645w = list2;
        this.f14646x = str3;
        this.f14647y = str4;
        this.f14648z = z12;
        this.A = xh0;
        this.B = i13;
        this.C = str5;
        this.D = list3 == null ? new ArrayList<>() : list3;
        this.E = i14;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fi0)) {
            return false;
        }
        fi0 fi0 = (fi0) obj;
        if (this.f14631a != fi0.f14631a || this.f14632b != fi0.f14632b || !h.a(this.f14633c, fi0.f14633c) || this.f14634d != fi0.f14634d || !h.a(this.f14635e, fi0.f14635e) || this.f14636f != fi0.f14636f || this.f14637g != fi0.f14637g || this.f14638h != fi0.f14638h || !h.a(this.f14639i, fi0.f14639i) || !h.a(this.f14640r, fi0.f14640r) || !h.a(this.f14641s, fi0.f14641s) || !h.a(this.f14642t, fi0.f14642t) || !h.a(this.f14643u, fi0.f14643u) || !h.a(this.f14644v, fi0.f14644v) || !h.a(this.f14645w, fi0.f14645w) || !h.a(this.f14646x, fi0.f14646x) || !h.a(this.f14647y, fi0.f14647y) || this.f14648z != fi0.f14648z || this.B != fi0.B || !h.a(this.C, fi0.C) || !h.a(this.D, fi0.D) || this.E != fi0.E) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f14631a), Long.valueOf(this.f14632b), this.f14633c, Integer.valueOf(this.f14634d), this.f14635e, Boolean.valueOf(this.f14636f), Integer.valueOf(this.f14637g), Boolean.valueOf(this.f14638h), this.f14639i, this.f14640r, this.f14641s, this.f14642t, this.f14643u, this.f14644v, this.f14645w, this.f14646x, this.f14647y, Boolean.valueOf(this.f14648z), Integer.valueOf(this.B), this.C, this.D, Integer.valueOf(this.E)});
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int l10 = j.l(parcel, 20293);
        int i11 = this.f14631a;
        parcel.writeInt(262145);
        parcel.writeInt(i11);
        long j10 = this.f14632b;
        parcel.writeInt(524290);
        parcel.writeLong(j10);
        j.c(parcel, 3, this.f14633c, false);
        int i12 = this.f14634d;
        parcel.writeInt(262148);
        parcel.writeInt(i12);
        j.i(parcel, 5, this.f14635e, false);
        boolean z10 = this.f14636f;
        parcel.writeInt(262150);
        parcel.writeInt(z10 ? 1 : 0);
        int i13 = this.f14637g;
        parcel.writeInt(262151);
        parcel.writeInt(i13);
        boolean z11 = this.f14638h;
        parcel.writeInt(262152);
        parcel.writeInt(z11 ? 1 : 0);
        j.g(parcel, 9, this.f14639i, false);
        j.f(parcel, 10, this.f14640r, i10, false);
        j.f(parcel, 11, this.f14641s, i10, false);
        j.g(parcel, 12, this.f14642t, false);
        j.c(parcel, 13, this.f14643u, false);
        j.c(parcel, 14, this.f14644v, false);
        j.i(parcel, 15, this.f14645w, false);
        j.g(parcel, 16, this.f14646x, false);
        j.g(parcel, 17, this.f14647y, false);
        boolean z12 = this.f14648z;
        parcel.writeInt(262162);
        parcel.writeInt(z12 ? 1 : 0);
        j.f(parcel, 19, this.A, i10, false);
        int i14 = this.B;
        parcel.writeInt(262164);
        parcel.writeInt(i14);
        j.g(parcel, 21, this.C, false);
        j.i(parcel, 22, this.D, false);
        int i15 = this.E;
        parcel.writeInt(262167);
        parcel.writeInt(i15);
        j.m(parcel, l10);
    }
}
