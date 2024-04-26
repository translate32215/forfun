package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import c8.a;
import c8.b;
import com.google.android.gms.ads.internal.util.f;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.ads.o1;
import com.google.android.gms.internal.ads.p1;
import com.google.android.gms.internal.ads.t7;
import d7.g;
import e7.c;
import e7.j;
import e7.k;
import e7.p;
import e8.dt;
import e8.f9;
import e8.oq;
import e8.t20;
import e8.wh0;
import w7.a;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
public final class AdOverlayInfoParcel extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<AdOverlayInfoParcel> CREATOR = new j();
    public final oq A;
    public final t20 B;
    public final f C;
    public final String D;

    /* renamed from: a  reason: collision with root package name */
    public final c f5607a;

    /* renamed from: b  reason: collision with root package name */
    public final wh0 f5608b;

    /* renamed from: c  reason: collision with root package name */
    public final k f5609c;

    /* renamed from: d  reason: collision with root package name */
    public final t7 f5610d;

    /* renamed from: e  reason: collision with root package name */
    public final p1 f5611e;

    /* renamed from: f  reason: collision with root package name */
    public final String f5612f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f5613g;

    /* renamed from: h  reason: collision with root package name */
    public final String f5614h;

    /* renamed from: i  reason: collision with root package name */
    public final p f5615i;

    /* renamed from: r  reason: collision with root package name */
    public final int f5616r;

    /* renamed from: s  reason: collision with root package name */
    public final int f5617s;

    /* renamed from: t  reason: collision with root package name */
    public final String f5618t;

    /* renamed from: u  reason: collision with root package name */
    public final f9 f5619u;

    /* renamed from: v  reason: collision with root package name */
    public final String f5620v;

    /* renamed from: w  reason: collision with root package name */
    public final g f5621w;

    /* renamed from: x  reason: collision with root package name */
    public final o1 f5622x;

    /* renamed from: y  reason: collision with root package name */
    public final String f5623y;

    /* renamed from: z  reason: collision with root package name */
    public final dt f5624z;

    public AdOverlayInfoParcel(t7 t7Var, f9 f9Var, f fVar, dt dtVar, oq oqVar, t20 t20, String str, String str2, int i10) {
        this.f5607a = null;
        this.f5608b = null;
        this.f5609c = null;
        this.f5610d = t7Var;
        this.f5622x = null;
        this.f5611e = null;
        this.f5612f = null;
        this.f5613g = false;
        this.f5614h = null;
        this.f5615i = null;
        this.f5616r = i10;
        this.f5617s = 5;
        this.f5618t = null;
        this.f5619u = f9Var;
        this.f5620v = null;
        this.f5621w = null;
        this.f5623y = str;
        this.D = str2;
        this.f5624z = dtVar;
        this.A = oqVar;
        this.B = t20;
        this.C = fVar;
    }

    public static AdOverlayInfoParcel i(Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
            return (AdOverlayInfoParcel) bundleExtra.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        } catch (Exception unused) {
            return null;
        }
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int l10 = androidx.activity.j.l(parcel, 20293);
        androidx.activity.j.f(parcel, 2, this.f5607a, i10, false);
        androidx.activity.j.e(parcel, 3, new b(this.f5608b), false);
        androidx.activity.j.e(parcel, 4, new b(this.f5609c), false);
        androidx.activity.j.e(parcel, 5, new b(this.f5610d), false);
        androidx.activity.j.e(parcel, 6, new b(this.f5611e), false);
        androidx.activity.j.g(parcel, 7, this.f5612f, false);
        boolean z10 = this.f5613g;
        parcel.writeInt(262152);
        parcel.writeInt(z10 ? 1 : 0);
        androidx.activity.j.g(parcel, 9, this.f5614h, false);
        androidx.activity.j.e(parcel, 10, new b(this.f5615i), false);
        int i11 = this.f5616r;
        parcel.writeInt(262155);
        parcel.writeInt(i11);
        int i12 = this.f5617s;
        parcel.writeInt(262156);
        parcel.writeInt(i12);
        androidx.activity.j.g(parcel, 13, this.f5618t, false);
        androidx.activity.j.f(parcel, 14, this.f5619u, i10, false);
        androidx.activity.j.g(parcel, 16, this.f5620v, false);
        androidx.activity.j.f(parcel, 17, this.f5621w, i10, false);
        androidx.activity.j.e(parcel, 18, new b(this.f5622x), false);
        androidx.activity.j.g(parcel, 19, this.f5623y, false);
        androidx.activity.j.e(parcel, 20, new b(this.f5624z), false);
        androidx.activity.j.e(parcel, 21, new b(this.A), false);
        androidx.activity.j.e(parcel, 22, new b(this.B), false);
        androidx.activity.j.e(parcel, 23, new b(this.C), false);
        androidx.activity.j.g(parcel, 24, this.D, false);
        androidx.activity.j.m(parcel, l10);
    }

    public AdOverlayInfoParcel(k kVar, t7 t7Var, int i10, f9 f9Var, String str, g gVar, String str2, String str3) {
        this.f5607a = null;
        this.f5608b = null;
        this.f5609c = kVar;
        this.f5610d = t7Var;
        this.f5622x = null;
        this.f5611e = null;
        this.f5612f = str2;
        this.f5613g = false;
        this.f5614h = str3;
        this.f5615i = null;
        this.f5616r = i10;
        this.f5617s = 1;
        this.f5618t = null;
        this.f5619u = f9Var;
        this.f5620v = str;
        this.f5621w = gVar;
        this.f5623y = null;
        this.D = null;
        this.f5624z = null;
        this.A = null;
        this.B = null;
        this.C = null;
    }

    public AdOverlayInfoParcel(wh0 wh0, k kVar, p pVar, t7 t7Var, boolean z10, int i10, f9 f9Var) {
        this.f5607a = null;
        this.f5608b = wh0;
        this.f5609c = kVar;
        this.f5610d = t7Var;
        this.f5622x = null;
        this.f5611e = null;
        this.f5612f = null;
        this.f5613g = z10;
        this.f5614h = null;
        this.f5615i = pVar;
        this.f5616r = i10;
        this.f5617s = 2;
        this.f5618t = null;
        this.f5619u = f9Var;
        this.f5620v = null;
        this.f5621w = null;
        this.f5623y = null;
        this.D = null;
        this.f5624z = null;
        this.A = null;
        this.B = null;
        this.C = null;
    }

    public AdOverlayInfoParcel(wh0 wh0, k kVar, o1 o1Var, p1 p1Var, p pVar, t7 t7Var, boolean z10, int i10, String str, f9 f9Var) {
        this.f5607a = null;
        this.f5608b = wh0;
        this.f5609c = kVar;
        this.f5610d = t7Var;
        this.f5622x = o1Var;
        this.f5611e = p1Var;
        this.f5612f = null;
        this.f5613g = z10;
        this.f5614h = null;
        this.f5615i = pVar;
        this.f5616r = i10;
        this.f5617s = 3;
        this.f5618t = str;
        this.f5619u = f9Var;
        this.f5620v = null;
        this.f5621w = null;
        this.f5623y = null;
        this.D = null;
        this.f5624z = null;
        this.A = null;
        this.B = null;
        this.C = null;
    }

    public AdOverlayInfoParcel(wh0 wh0, k kVar, o1 o1Var, p1 p1Var, p pVar, t7 t7Var, boolean z10, int i10, String str, String str2, f9 f9Var) {
        this.f5607a = null;
        this.f5608b = wh0;
        this.f5609c = kVar;
        this.f5610d = t7Var;
        this.f5622x = o1Var;
        this.f5611e = p1Var;
        this.f5612f = str2;
        this.f5613g = z10;
        this.f5614h = str;
        this.f5615i = pVar;
        this.f5616r = i10;
        this.f5617s = 3;
        this.f5618t = null;
        this.f5619u = f9Var;
        this.f5620v = null;
        this.f5621w = null;
        this.f5623y = null;
        this.D = null;
        this.f5624z = null;
        this.A = null;
        this.B = null;
        this.C = null;
    }

    public AdOverlayInfoParcel(c cVar, wh0 wh0, k kVar, p pVar, f9 f9Var) {
        this.f5607a = cVar;
        this.f5608b = wh0;
        this.f5609c = kVar;
        this.f5610d = null;
        this.f5622x = null;
        this.f5611e = null;
        this.f5612f = null;
        this.f5613g = false;
        this.f5614h = null;
        this.f5615i = pVar;
        this.f5616r = -1;
        this.f5617s = 4;
        this.f5618t = null;
        this.f5619u = f9Var;
        this.f5620v = null;
        this.f5621w = null;
        this.f5623y = null;
        this.D = null;
        this.f5624z = null;
        this.A = null;
        this.B = null;
        this.C = null;
    }

    public AdOverlayInfoParcel(c cVar, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4, String str, boolean z10, String str2, IBinder iBinder5, int i10, int i11, String str3, f9 f9Var, String str4, g gVar, IBinder iBinder6, String str5, IBinder iBinder7, IBinder iBinder8, IBinder iBinder9, IBinder iBinder10, String str6) {
        this.f5607a = cVar;
        this.f5608b = (wh0) b.z0(a.C0062a.Y(iBinder));
        this.f5609c = (k) b.z0(a.C0062a.Y(iBinder2));
        this.f5610d = (t7) b.z0(a.C0062a.Y(iBinder3));
        this.f5622x = (o1) b.z0(a.C0062a.Y(iBinder6));
        this.f5611e = (p1) b.z0(a.C0062a.Y(iBinder4));
        this.f5612f = str;
        this.f5613g = z10;
        this.f5614h = str2;
        this.f5615i = (p) b.z0(a.C0062a.Y(iBinder5));
        this.f5616r = i10;
        this.f5617s = i11;
        this.f5618t = str3;
        this.f5619u = f9Var;
        this.f5620v = str4;
        this.f5621w = gVar;
        this.f5623y = str5;
        this.D = str6;
        this.f5624z = (dt) b.z0(a.C0062a.Y(iBinder7));
        this.A = (oq) b.z0(a.C0062a.Y(iBinder8));
        this.B = (t20) b.z0(a.C0062a.Y(iBinder9));
        this.C = (f) b.z0(a.C0062a.Y(iBinder10));
    }
}
