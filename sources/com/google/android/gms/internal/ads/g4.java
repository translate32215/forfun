package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.appcompat.widget.m;
import c8.a;
import c8.b;
import com.google.android.gms.ads.mediation.c;
import com.google.android.gms.ads.mediation.f;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import e8.fi0;
import e8.gf0;
import e8.li0;
import e8.m5;
import e8.p9;
import e8.ti0;
import e8.v5;
import e8.y8;
import g7.p;
import java.util.ArrayList;
import java.util.Iterator;
import l0.e;
import org.json.JSONException;
import org.json.JSONObject;
import y6.d;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class g4 extends d4 {

    /* renamed from: b  reason: collision with root package name */
    public final RtbAdapter f6512b;

    /* renamed from: c  reason: collision with root package name */
    public String f6513c = "";

    public g4(RtbAdapter rtbAdapter) {
        this.f6512b = rtbAdapter;
    }

    public static boolean s6(fi0 fi0) {
        if (fi0.f14636f) {
            return true;
        }
        y8 y8Var = ti0.f16763j.f16764a;
        return y8.k();
    }

    public static Bundle u6(String str) throws RemoteException {
        String valueOf = String.valueOf(str);
        e.K(valueOf.length() != 0 ? "Server parameters: ".concat(valueOf) : new String("Server parameters: "));
        try {
            Bundle bundle = new Bundle();
            if (str == null) {
                return bundle;
            }
            JSONObject jSONObject = new JSONObject(str);
            Bundle bundle2 = new Bundle();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                bundle2.putString(next, jSONObject.getString(next));
            }
            return bundle2;
        } catch (JSONException e10) {
            e.C("", e10);
            throw new RemoteException();
        }
    }

    public final void Q1(String str, String str2, fi0 fi0, a aVar, z3 z3Var, y2 y2Var) throws RemoteException {
        fi0 fi02 = fi0;
        try {
            j8 j8Var = new j8(this, z3Var, y2Var);
            RtbAdapter rtbAdapter = this.f6512b;
            Context context = (Context) b.z0(aVar);
            Bundle u62 = u6(str2);
            Bundle t62 = t6(fi02);
            boolean s62 = s6(fi0);
            Location location = fi02.f14641s;
            int i10 = fi02.f14637g;
            int i11 = fi02.B;
            String str3 = fi02.C;
            try {
                str3 = new JSONObject(str2).getString("max_ad_content_rating");
            } catch (JSONException unused) {
            }
            rtbAdapter.loadRewardedInterstitialAd(new f(context, str, u62, t62, s62, location, i10, i11, str3, this.f6513c), j8Var);
        } catch (Throwable th) {
            throw m5.a("Adapter failed to render rewarded interstitial ad.", th);
        }
    }

    public final boolean V2(a aVar) throws RemoteException {
        return false;
    }

    public final void X2(String str, String str2, fi0 fi0, a aVar, p3 p3Var, y2 y2Var, li0 li0) throws RemoteException {
        fi0 fi02 = fi0;
        li0 li02 = li0;
        try {
            gf0 gf0 = new gf0(p3Var, y2Var);
            RtbAdapter rtbAdapter = this.f6512b;
            Context context = (Context) b.z0(aVar);
            Bundle u62 = u6(str2);
            Bundle t62 = t6(fi02);
            boolean s62 = s6(fi0);
            Location location = fi02.f14641s;
            int i10 = fi02.f14637g;
            int i11 = fi02.B;
            String str3 = fi02.C;
            try {
                str3 = new JSONObject(str2).getString("max_ad_content_rating");
            } catch (JSONException unused) {
            }
            String str4 = str3;
            d dVar = new d(li02.f15398e, li02.f15395b, li02.f15394a);
            String str5 = this.f6513c;
            c cVar = r5;
            c cVar2 = new c(context, str, u62, t62, s62, location, i10, i11, str4, dVar, str5);
            rtbAdapter.loadBannerAd(cVar, gf0);
        } catch (Throwable th) {
            throw m5.a("Adapter failed to render banner ad.", th);
        }
    }

    public final void a1(String str, String str2, fi0 fi0, a aVar, t3 t3Var, y2 y2Var) throws RemoteException {
        fi0 fi02 = fi0;
        try {
            j8 j8Var = new j8(this, t3Var, y2Var);
            RtbAdapter rtbAdapter = this.f6512b;
            Context context = (Context) b.z0(aVar);
            Bundle u62 = u6(str2);
            Bundle t62 = t6(fi02);
            boolean s62 = s6(fi0);
            Location location = fi02.f14641s;
            int i10 = fi02.f14637g;
            int i11 = fi02.B;
            String str3 = fi02.C;
            try {
                str3 = new JSONObject(str2).getString("max_ad_content_rating");
            } catch (JSONException unused) {
            }
            rtbAdapter.loadInterstitialAd(new com.google.android.gms.ads.mediation.d(context, str, u62, t62, s62, location, i10, i11, str3, this.f6513c), j8Var);
        } catch (Throwable th) {
            throw m5.a("Adapter failed to render interstitial ad.", th);
        }
    }

    public final hz getVideoController() {
        RtbAdapter rtbAdapter = this.f6512b;
        if (!(rtbAdapter instanceof p)) {
            return null;
        }
        try {
            return ((p) rtbAdapter).getVideoController();
        } catch (Throwable th) {
            e.C("", th);
            return null;
        }
    }

    public final void i2(a aVar, String str, Bundle bundle, Bundle bundle2, li0 li0, v5 v5Var) throws RemoteException {
        com.google.android.gms.ads.b bVar;
        try {
            g2 g2Var = new g2(v5Var);
            RtbAdapter rtbAdapter = this.f6512b;
            char c10 = 65535;
            switch (str.hashCode()) {
                case -1396342996:
                    if (str.equals("banner")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1052618729:
                    if (str.equals("native")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case -239580146:
                    if (str.equals("rewarded")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 604727084:
                    if (str.equals("interstitial")) {
                        c10 = 1;
                        break;
                    }
                    break;
            }
            if (c10 == 0) {
                bVar = com.google.android.gms.ads.b.BANNER;
            } else if (c10 == 1) {
                bVar = com.google.android.gms.ads.b.INTERSTITIAL;
            } else if (c10 == 2) {
                bVar = com.google.android.gms.ads.b.REWARDED;
            } else if (c10 == 3) {
                bVar = com.google.android.gms.ads.b.NATIVE;
            } else {
                throw new IllegalArgumentException("Internal Error");
            }
            m mVar = new m(bVar, bundle2);
            ArrayList arrayList = new ArrayList();
            arrayList.add(mVar);
            rtbAdapter.collectSignals(new i7.a((Context) b.z0(aVar), arrayList, bundle, new d(li0.f15398e, li0.f15395b, li0.f15394a)), g2Var);
        } catch (Throwable th) {
            throw m5.a("Error generating signals for RTB", th);
        }
    }

    public final void j1(String str) {
        this.f6513c = str;
    }

    public final h4 m0() throws RemoteException {
        this.f6512b.getSDKVersionInfo();
        throw null;
    }

    public final boolean q5(a aVar) throws RemoteException {
        return false;
    }

    public final h4 r0() throws RemoteException {
        this.f6512b.getVersionInfo();
        throw null;
    }

    public final Bundle t6(fi0 fi0) {
        Bundle bundle;
        Bundle bundle2 = fi0.f14643u;
        if (bundle2 == null || (bundle = bundle2.getBundle(this.f6512b.getClass().getName())) == null) {
            return new Bundle();
        }
        return bundle;
    }

    public final void v2(String str, String str2, fi0 fi0, a aVar, z3 z3Var, y2 y2Var) throws RemoteException {
        fi0 fi02 = fi0;
        try {
            j8 j8Var = new j8(this, z3Var, y2Var);
            RtbAdapter rtbAdapter = this.f6512b;
            Context context = (Context) b.z0(aVar);
            Bundle u62 = u6(str2);
            Bundle t62 = t6(fi02);
            boolean s62 = s6(fi0);
            Location location = fi02.f14641s;
            int i10 = fi02.f14637g;
            int i11 = fi02.B;
            String str3 = fi02.C;
            try {
                str3 = new JSONObject(str2).getString("max_ad_content_rating");
            } catch (JSONException unused) {
            }
            rtbAdapter.loadRewardedAd(new f(context, str, u62, t62, s62, location, i10, i11, str3, this.f6513c), j8Var);
        } catch (Throwable th) {
            throw m5.a("Adapter failed to render rewarded ad.", th);
        }
    }

    public final void y4(String str, String str2, fi0 fi0, a aVar, u3 u3Var, y2 y2Var) throws RemoteException {
        fi0 fi02 = fi0;
        try {
            p9 p9Var = new p9(u3Var, y2Var);
            RtbAdapter rtbAdapter = this.f6512b;
            Context context = (Context) b.z0(aVar);
            Bundle u62 = u6(str2);
            Bundle t62 = t6(fi02);
            boolean s62 = s6(fi0);
            Location location = fi02.f14641s;
            int i10 = fi02.f14637g;
            int i11 = fi02.B;
            String str3 = fi02.C;
            try {
                str3 = new JSONObject(str2).getString("max_ad_content_rating");
            } catch (JSONException unused) {
            }
            rtbAdapter.loadNativeAd(new com.google.android.gms.ads.mediation.e(context, str, u62, t62, s62, location, i10, i11, str3, this.f6513c), p9Var);
        } catch (Throwable th) {
            throw m5.a("Adapter failed to render rewarded ad.", th);
        }
    }
}
