package com.google.android.gms.internal.ads;

import a7.j;
import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.appcompat.widget.o;
import c8.a;
import c8.b;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.mediation.f;
import com.google.android.gms.ads.reward.mediation.InitializableMediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import e8.b4;
import e8.fi0;
import e8.li0;
import e8.m5;
import e8.n1;
import e8.n5;
import e8.o5;
import e8.p5;
import e8.p9;
import e8.q5;
import e8.t5;
import e8.ti0;
import e8.y8;
import e8.z1;
import g7.d;
import g7.h;
import g7.i;
import g7.l;
import g7.m;
import g7.n;
import g7.p;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import l0.e;
import n2.g;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class m3 extends w2 {

    /* renamed from: a  reason: collision with root package name */
    public final Object f7438a;

    /* renamed from: b  reason: collision with root package name */
    public g f7439b;

    /* renamed from: c  reason: collision with root package name */
    public y5 f7440c;

    /* renamed from: d  reason: collision with root package name */
    public a f7441d;

    public m3(d dVar) {
        this.f7438a = dVar;
    }

    public static boolean t6(fi0 fi0) {
        if (fi0.f14636f) {
            return true;
        }
        y8 y8Var = ti0.f16763j.f16764a;
        return y8.k();
    }

    public final void A2(a aVar, li0 li0, fi0 fi0, String str, y2 y2Var) throws RemoteException {
        S5(aVar, li0, fi0, str, (String) null, y2Var);
    }

    public final void C1(a aVar, fi0 fi0, String str, String str2, y2 y2Var, n1 n1Var, List<String> list) throws RemoteException {
        Date date;
        fi0 fi02 = fi0;
        String str3 = str;
        Object obj = this.f7438a;
        if (obj instanceof MediationNativeAdapter) {
            try {
                MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter) obj;
                HashSet hashSet = fi02.f14635e != null ? new HashSet(fi02.f14635e) : null;
                if (fi02.f14632b == -1) {
                    date = null;
                } else {
                    date = new Date(fi02.f14632b);
                }
                Date date2 = date;
                int i10 = fi02.f14634d;
                Location location = fi02.f14641s;
                boolean t62 = t6(fi0);
                int i11 = fi02.f14637g;
                boolean z10 = fi02.f14648z;
                int i12 = fi02.B;
                String str4 = fi02.C;
                try {
                    str4 = new JSONObject(str3).getString("max_ad_content_rating");
                } catch (JSONException unused) {
                }
                String str5 = str4;
                q5 q5Var = new q5(date2, i10, hashSet, location, t62, i11, n1Var, list, z10, i12, str5);
                Bundle bundle = fi02.f14643u;
                Bundle bundle2 = bundle != null ? bundle.getBundle(mediationNativeAdapter.getClass().getName()) : null;
                this.f7439b = new g(y2Var);
                mediationNativeAdapter.requestNativeAd((Context) b.z0(aVar), this.f7439b, s6(str3, fi02, str2), q5Var, bundle2);
            } catch (Throwable th) {
                throw m5.a("", th);
            }
        } else {
            String canonicalName = MediationNativeAdapter.class.getCanonicalName();
            String canonicalName2 = this.f7438a.getClass().getCanonicalName();
            StringBuilder sb2 = new StringBuilder(o.a(canonicalName2, o.a(canonicalName, 22)));
            sb2.append(canonicalName);
            sb2.append(" #009 Class mismatch: ");
            sb2.append(canonicalName2);
            e.K(sb2.toString());
            throw new RemoteException();
        }
    }

    public final void D() throws RemoteException {
        Object obj = this.f7438a;
        if (obj instanceof d) {
            try {
                ((d) obj).onResume();
            } catch (Throwable th) {
                throw m5.a("", th);
            }
        }
    }

    public final l0 I4() {
        j jVar = (j) this.f7439b.f21853d;
        if (jVar instanceof z1) {
            return ((z1) jVar).f17680a;
        }
        return null;
    }

    public final void J4(a aVar) throws RemoteException {
        Context context = (Context) b.z0(aVar);
        Object obj = this.f7438a;
        if (obj instanceof l) {
            ((l) obj).a(context);
        }
    }

    public final void N(boolean z10) throws RemoteException {
        Object obj = this.f7438a;
        if (!(obj instanceof m)) {
            String canonicalName = m.class.getCanonicalName();
            String canonicalName2 = this.f7438a.getClass().getCanonicalName();
            StringBuilder sb2 = new StringBuilder(o.a(canonicalName2, o.a(canonicalName, 22)));
            sb2.append(canonicalName);
            sb2.append(" #009 Class mismatch: ");
            sb2.append(canonicalName2);
            e.E(sb2.toString());
            return;
        }
        try {
            ((m) obj).onImmersiveModeUpdated(z10);
        } catch (Throwable th) {
            e.C("", th);
        }
    }

    public final d3 N3() {
        h hVar = (h) this.f7439b.f21851b;
        if (hVar instanceof i) {
            return new p5((i) hVar);
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0066 A[Catch:{ all -> 0x00ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0073 A[Catch:{ all -> 0x00ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0079 A[Catch:{ all -> 0x00ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0089 A[Catch:{ all -> 0x00ae }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void S5(c8.a r18, e8.li0 r19, e8.fi0 r20, java.lang.String r21, java.lang.String r22, com.google.android.gms.internal.ads.y2 r23) throws android.os.RemoteException {
        /*
            r17 = this;
            r1 = r17
            r0 = r19
            r2 = r20
            r3 = r21
            java.lang.Object r4 = r1.f7438a
            boolean r4 = r4 instanceof com.google.android.gms.ads.mediation.MediationBannerAdapter
            if (r4 == 0) goto L_0x00b6
            java.lang.String r4 = "Requesting banner ad from adapter."
            l0.e.E(r4)
            java.lang.Object r4 = r1.f7438a     // Catch:{ all -> 0x00ae }
            r5 = r4
            com.google.android.gms.ads.mediation.MediationBannerAdapter r5 = (com.google.android.gms.ads.mediation.MediationBannerAdapter) r5     // Catch:{ all -> 0x00ae }
            java.util.List<java.lang.String> r4 = r2.f14635e     // Catch:{ all -> 0x00ae }
            if (r4 == 0) goto L_0x0024
            java.util.HashSet r4 = new java.util.HashSet     // Catch:{ all -> 0x00ae }
            java.util.List<java.lang.String> r6 = r2.f14635e     // Catch:{ all -> 0x00ae }
            r4.<init>(r6)     // Catch:{ all -> 0x00ae }
            goto L_0x0025
        L_0x0024:
            r4 = 0
        L_0x0025:
            r9 = r4
            e8.n5 r4 = new e8.n5     // Catch:{ all -> 0x00ae }
            long r6 = r2.f14632b     // Catch:{ all -> 0x00ae }
            r10 = -1
            int r8 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r8 != 0) goto L_0x0033
            r6 = 0
        L_0x0031:
            r7 = r6
            goto L_0x003b
        L_0x0033:
            java.util.Date r6 = new java.util.Date     // Catch:{ all -> 0x00ae }
            long r7 = r2.f14632b     // Catch:{ all -> 0x00ae }
            r6.<init>(r7)     // Catch:{ all -> 0x00ae }
            goto L_0x0031
        L_0x003b:
            int r8 = r2.f14634d     // Catch:{ all -> 0x00ae }
            android.location.Location r10 = r2.f14641s     // Catch:{ all -> 0x00ae }
            boolean r11 = t6(r20)     // Catch:{ all -> 0x00ae }
            int r12 = r2.f14637g     // Catch:{ all -> 0x00ae }
            boolean r13 = r2.f14648z     // Catch:{ all -> 0x00ae }
            int r14 = r2.B     // Catch:{ all -> 0x00ae }
            java.lang.String r6 = r2.C     // Catch:{ all -> 0x00ae }
            org.json.JSONObject r15 = new org.json.JSONObject     // Catch:{ JSONException -> 0x005a }
            r15.<init>(r3)     // Catch:{ JSONException -> 0x005a }
            r16 = r6
            java.lang.String r6 = "max_ad_content_rating"
            java.lang.String r6 = r15.getString(r6)     // Catch:{ JSONException -> 0x005c }
            r15 = r6
            goto L_0x005e
        L_0x005a:
            r16 = r6
        L_0x005c:
            r15 = r16
        L_0x005e:
            r6 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x00ae }
            android.os.Bundle r6 = r2.f14643u     // Catch:{ all -> 0x00ae }
            if (r6 == 0) goto L_0x0073
            java.lang.Class r7 = r5.getClass()     // Catch:{ all -> 0x00ae }
            java.lang.String r7 = r7.getName()     // Catch:{ all -> 0x00ae }
            android.os.Bundle r6 = r6.getBundle(r7)     // Catch:{ all -> 0x00ae }
            goto L_0x0074
        L_0x0073:
            r6 = 0
        L_0x0074:
            r11 = r6
            boolean r6 = r0.f15407v     // Catch:{ all -> 0x00ae }
            if (r6 == 0) goto L_0x0089
            int r6 = r0.f15398e     // Catch:{ all -> 0x00ae }
            int r0 = r0.f15395b     // Catch:{ all -> 0x00ae }
            y6.d r7 = new y6.d     // Catch:{ all -> 0x00ae }
            r7.<init>(r6, r0)     // Catch:{ all -> 0x00ae }
            r6 = 1
            r7.f28123d = r6     // Catch:{ all -> 0x00ae }
            r7.f28124e = r0     // Catch:{ all -> 0x00ae }
            r9 = r7
            goto L_0x0095
        L_0x0089:
            int r6 = r0.f15398e     // Catch:{ all -> 0x00ae }
            int r7 = r0.f15395b     // Catch:{ all -> 0x00ae }
            java.lang.String r0 = r0.f15394a     // Catch:{ all -> 0x00ae }
            y6.d r8 = new y6.d     // Catch:{ all -> 0x00ae }
            r8.<init>(r6, r7, r0)     // Catch:{ all -> 0x00ae }
            r9 = r8
        L_0x0095:
            java.lang.Object r0 = c8.b.z0(r18)     // Catch:{ all -> 0x00ae }
            r6 = r0
            android.content.Context r6 = (android.content.Context) r6     // Catch:{ all -> 0x00ae }
            n2.g r7 = new n2.g     // Catch:{ all -> 0x00ae }
            r0 = r23
            r7.<init>((com.google.android.gms.internal.ads.y2) r0)     // Catch:{ all -> 0x00ae }
            r0 = r22
            android.os.Bundle r8 = r1.s6(r3, r2, r0)     // Catch:{ all -> 0x00ae }
            r10 = r4
            r5.requestBannerAd(r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x00ae }
            return
        L_0x00ae:
            r0 = move-exception
            java.lang.String r2 = ""
            android.os.RemoteException r0 = e8.m5.a(r2, r0)
            throw r0
        L_0x00b6:
            java.lang.Class<com.google.android.gms.ads.mediation.MediationBannerAdapter> r0 = com.google.android.gms.ads.mediation.MediationBannerAdapter.class
            java.lang.String r0 = r0.getCanonicalName()
            java.lang.Object r2 = r1.f7438a
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getCanonicalName()
            r3 = 22
            int r3 = androidx.appcompat.widget.o.a(r0, r3)
            int r3 = androidx.appcompat.widget.o.a(r2, r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            r4.append(r0)
            java.lang.String r0 = " #009 Class mismatch: "
            r4.append(r0)
            r4.append(r2)
            java.lang.String r0 = r4.toString()
            l0.e.K(r0)
            android.os.RemoteException r0 = new android.os.RemoteException
            r0.<init>()
            goto L_0x00ee
        L_0x00ed:
            throw r0
        L_0x00ee:
            goto L_0x00ed
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.m3.S5(c8.a, e8.li0, e8.fi0, java.lang.String, java.lang.String, com.google.android.gms.internal.ads.y2):void");
    }

    public final void U0(a aVar, fi0 fi0, String str, y5 y5Var, String str2) throws RemoteException {
        n5 n5Var;
        Bundle bundle;
        String str3;
        fi0 fi02 = fi0;
        y5 y5Var2 = y5Var;
        String str4 = str2;
        Object obj = this.f7438a;
        if (obj instanceof MediationRewardedVideoAdAdapter) {
            e.E("Initialize rewarded video adapter.");
            try {
                MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter = (MediationRewardedVideoAdAdapter) this.f7438a;
                Date date = null;
                Bundle s62 = s6(str4, fi02, (String) null);
                if (fi02 != null) {
                    HashSet hashSet = fi02.f14635e != null ? new HashSet(fi02.f14635e) : null;
                    if (fi02.f14632b != -1) {
                        date = new Date(fi02.f14632b);
                    }
                    Date date2 = date;
                    int i10 = fi02.f14634d;
                    Location location = fi02.f14641s;
                    boolean t62 = t6(fi0);
                    int i11 = fi02.f14637g;
                    boolean z10 = fi02.f14648z;
                    int i12 = fi02.B;
                    try {
                        str3 = new JSONObject(str4).getString("max_ad_content_rating");
                    } catch (JSONException unused) {
                        str3 = fi02.C;
                    }
                    n5Var = new n5(date2, i10, hashSet, location, t62, i11, z10, i12, str3);
                    Bundle bundle2 = fi02.f14643u;
                    if (bundle2 != null) {
                        bundle = bundle2.getBundle(mediationRewardedVideoAdAdapter.getClass().getName());
                        mediationRewardedVideoAdAdapter.initialize((Context) b.z0(aVar), n5Var, str, new g2(y5Var2), s62, bundle);
                    }
                } else {
                    n5Var = null;
                }
                bundle = null;
                mediationRewardedVideoAdAdapter.initialize((Context) b.z0(aVar), n5Var, str, new g2(y5Var2), s62, bundle);
            } catch (Throwable th) {
                throw m5.a("", th);
            }
        } else if (obj instanceof g7.a) {
            this.f7441d = aVar;
            this.f7440c = y5Var2;
            y5Var2.U3(new b(obj));
        } else {
            String canonicalName = MediationRewardedVideoAdAdapter.class.getCanonicalName();
            String canonicalName2 = g7.a.class.getCanonicalName();
            String canonicalName3 = this.f7438a.getClass().getCanonicalName();
            StringBuilder a10 = j4.e.a(o.a(canonicalName3, o.a(canonicalName2, o.a(canonicalName, 26))), canonicalName, " or ", canonicalName2, " #009 Class mismatch: ");
            a10.append(canonicalName3);
            e.K(a10.toString());
            throw new RemoteException();
        }
    }

    public final void W5(a aVar, v1 v1Var, List<b4> list) throws RemoteException {
        com.google.android.gms.ads.b bVar;
        if (this.f7438a instanceof g7.a) {
            g2 g2Var = new g2(v1Var);
            ArrayList arrayList = new ArrayList();
            for (b4 next : list) {
                String str = next.f13876a;
                str.getClass();
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
                            c10 = 1;
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
                            c10 = 3;
                            break;
                        }
                        break;
                }
                switch (c10) {
                    case 0:
                        bVar = com.google.android.gms.ads.b.BANNER;
                        break;
                    case 1:
                        bVar = com.google.android.gms.ads.b.NATIVE;
                        break;
                    case 2:
                        bVar = com.google.android.gms.ads.b.REWARDED;
                        break;
                    case 3:
                        bVar = com.google.android.gms.ads.b.INTERSTITIAL;
                        break;
                    default:
                        throw new RemoteException();
                }
                arrayList.add(new androidx.appcompat.widget.m(bVar, next.f13877b));
            }
            ((g7.a) this.f7438a).initialize((Context) b.z0(aVar), g2Var, arrayList);
            return;
        }
        throw new RemoteException();
    }

    public final void a6(fi0 fi0, String str, String str2) throws RemoteException {
        Date date;
        fi0 fi02 = fi0;
        String str3 = str;
        Object obj = this.f7438a;
        if (obj instanceof MediationRewardedVideoAdAdapter) {
            e.E("Requesting rewarded video ad from adapter.");
            try {
                MediationRewardedVideoAdAdapter mediationRewardedVideoAdAdapter = (MediationRewardedVideoAdAdapter) this.f7438a;
                HashSet hashSet = fi02.f14635e != null ? new HashSet(fi02.f14635e) : null;
                if (fi02.f14632b == -1) {
                    date = null;
                } else {
                    date = new Date(fi02.f14632b);
                }
                Date date2 = date;
                int i10 = fi02.f14634d;
                Location location = fi02.f14641s;
                boolean t62 = t6(fi0);
                int i11 = fi02.f14637g;
                boolean z10 = fi02.f14648z;
                int i12 = fi02.B;
                String str4 = fi02.C;
                try {
                    str4 = new JSONObject(str3).getString("max_ad_content_rating");
                } catch (JSONException unused) {
                }
                String str5 = str4;
                n5 n5Var = new n5(date2, i10, hashSet, location, t62, i11, z10, i12, str5);
                Bundle bundle = fi02.f14643u;
                mediationRewardedVideoAdAdapter.loadAd(n5Var, s6(str3, fi02, str2), bundle != null ? bundle.getBundle(mediationRewardedVideoAdAdapter.getClass().getName()) : null);
            } catch (Throwable th) {
                throw m5.a("", th);
            }
        } else if (obj instanceof g7.a) {
            m6(this.f7441d, fi02, str3, new n3((g7.a) obj, this.f7440c));
        } else {
            String canonicalName = MediationRewardedVideoAdAdapter.class.getCanonicalName();
            String canonicalName2 = g7.a.class.getCanonicalName();
            String canonicalName3 = this.f7438a.getClass().getCanonicalName();
            StringBuilder a10 = j4.e.a(o.a(canonicalName3, o.a(canonicalName2, o.a(canonicalName, 26))), canonicalName, " or ", canonicalName2, " #009 Class mismatch: ");
            a10.append(canonicalName3);
            e.K(a10.toString());
            throw new RemoteException();
        }
    }

    public final void b5(a aVar, fi0 fi0, String str, y2 y2Var) throws RemoteException {
        fi0 fi02 = fi0;
        String str2 = str;
        if (this.f7438a instanceof g7.a) {
            e.E("Requesting rewarded interstitial ad from adapter.");
            try {
                g7.a aVar2 = (g7.a) this.f7438a;
                p9 p9Var = new p9(this, y2Var);
                Context context = (Context) b.z0(aVar);
                Bundle s62 = s6(str2, fi02, (String) null);
                Bundle u62 = u6(fi02);
                boolean t62 = t6(fi0);
                Location location = fi02.f14641s;
                int i10 = fi02.f14637g;
                int i11 = fi02.B;
                String str3 = fi02.C;
                try {
                    str3 = new JSONObject(str2).getString("max_ad_content_rating");
                } catch (JSONException unused) {
                }
                f fVar = r5;
                f fVar2 = new f(context, "", s62, u62, t62, location, i10, i11, str3, "");
                aVar2.loadRewardedInterstitialAd(fVar, p9Var);
            } catch (Exception e10) {
                e.C("", e10);
                throw new RemoteException();
            }
        } else {
            String canonicalName = g7.a.class.getCanonicalName();
            String canonicalName2 = this.f7438a.getClass().getCanonicalName();
            StringBuilder sb2 = new StringBuilder(o.a(canonicalName2, o.a(canonicalName, 22)));
            sb2.append(canonicalName);
            sb2.append(" #009 Class mismatch: ");
            sb2.append(canonicalName2);
            e.K(sb2.toString());
            throw new RemoteException();
        }
    }

    public final void c5(a aVar, fi0 fi0, String str, String str2, y2 y2Var) throws RemoteException {
        Date date;
        fi0 fi02 = fi0;
        String str3 = str;
        if (this.f7438a instanceof MediationInterstitialAdapter) {
            e.E("Requesting interstitial ad from adapter.");
            try {
                MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) this.f7438a;
                HashSet hashSet = fi02.f14635e != null ? new HashSet(fi02.f14635e) : null;
                if (fi02.f14632b == -1) {
                    date = null;
                } else {
                    date = new Date(fi02.f14632b);
                }
                Date date2 = date;
                int i10 = fi02.f14634d;
                Location location = fi02.f14641s;
                boolean t62 = t6(fi0);
                int i11 = fi02.f14637g;
                boolean z10 = fi02.f14648z;
                int i12 = fi02.B;
                String str4 = fi02.C;
                try {
                    str4 = new JSONObject(str3).getString("max_ad_content_rating");
                } catch (JSONException unused) {
                }
                String str5 = str4;
                n5 n5Var = new n5(date2, i10, hashSet, location, t62, i11, z10, i12, str5);
                Bundle bundle = fi02.f14643u;
                mediationInterstitialAdapter.requestInterstitialAd((Context) b.z0(aVar), new g(y2Var), s6(str3, fi02, str2), n5Var, bundle != null ? bundle.getBundle(mediationInterstitialAdapter.getClass().getName()) : null);
            } catch (Throwable th) {
                throw m5.a("", th);
            }
        } else {
            String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
            String canonicalName2 = this.f7438a.getClass().getCanonicalName();
            StringBuilder sb2 = new StringBuilder(o.a(canonicalName2, o.a(canonicalName, 22)));
            sb2.append(canonicalName);
            sb2.append(" #009 Class mismatch: ");
            sb2.append(canonicalName2);
            e.K(sb2.toString());
            throw new RemoteException();
        }
    }

    public final void d2(fi0 fi0, String str) throws RemoteException {
        a6(fi0, str, (String) null);
    }

    public final void destroy() throws RemoteException {
        Object obj = this.f7438a;
        if (obj instanceof d) {
            try {
                ((d) obj).onDestroy();
            } catch (Throwable th) {
                throw m5.a("", th);
            }
        }
    }

    public final Bundle e2() {
        return new Bundle();
    }

    public final void f2(a aVar, fi0 fi0, String str, y2 y2Var) throws RemoteException {
        c5(aVar, fi0, str, (String) null, y2Var);
    }

    public final void g() throws RemoteException {
        Object obj = this.f7438a;
        if (obj instanceof d) {
            try {
                ((d) obj).onPause();
            } catch (Throwable th) {
                throw m5.a("", th);
            }
        }
    }

    public final Bundle getInterstitialAdapterInfo() {
        Object obj = this.f7438a;
        if (obj instanceof zzbfd) {
            return ((zzbfd) obj).getInterstitialAdapterInfo();
        }
        String canonicalName = zzbfd.class.getCanonicalName();
        String canonicalName2 = this.f7438a.getClass().getCanonicalName();
        StringBuilder sb2 = new StringBuilder(o.a(canonicalName2, o.a(canonicalName, 22)));
        sb2.append(canonicalName);
        sb2.append(" #009 Class mismatch: ");
        sb2.append(canonicalName2);
        e.K(sb2.toString());
        return new Bundle();
    }

    public final hz getVideoController() {
        Object obj = this.f7438a;
        if (!(obj instanceof p)) {
            return null;
        }
        try {
            return ((p) obj).getVideoController();
        } catch (Throwable th) {
            e.C("", th);
            return null;
        }
    }

    public final void i4(a aVar, y5 y5Var, List<String> list) throws RemoteException {
        if (this.f7438a instanceof InitializableMediationRewardedVideoAdAdapter) {
            e.E("Initialize rewarded video adapter.");
            try {
                InitializableMediationRewardedVideoAdAdapter initializableMediationRewardedVideoAdAdapter = (InitializableMediationRewardedVideoAdAdapter) this.f7438a;
                ArrayList arrayList = new ArrayList();
                for (String s62 : list) {
                    arrayList.add(s6(s62, (fi0) null, (String) null));
                }
                initializableMediationRewardedVideoAdAdapter.initialize((Context) b.z0(aVar), new g2(y5Var), arrayList);
            } catch (Throwable th) {
                e.D("Could not initialize rewarded video adapter.", th);
                throw new RemoteException();
            }
        } else {
            String canonicalName = InitializableMediationRewardedVideoAdAdapter.class.getCanonicalName();
            String canonicalName2 = this.f7438a.getClass().getCanonicalName();
            StringBuilder sb2 = new StringBuilder(o.a(canonicalName2, o.a(canonicalName, 22)));
            sb2.append(canonicalName);
            sb2.append(" #009 Class mismatch: ");
            sb2.append(canonicalName2);
            e.K(sb2.toString());
            throw new RemoteException();
        }
    }

    public final a i5() throws RemoteException {
        Object obj = this.f7438a;
        if (obj instanceof MediationBannerAdapter) {
            try {
                return new b(((MediationBannerAdapter) obj).getBannerView());
            } catch (Throwable th) {
                throw m5.a("", th);
            }
        } else {
            String canonicalName = MediationBannerAdapter.class.getCanonicalName();
            String canonicalName2 = this.f7438a.getClass().getCanonicalName();
            StringBuilder sb2 = new StringBuilder(o.a(canonicalName2, o.a(canonicalName, 22)));
            sb2.append(canonicalName);
            sb2.append(" #009 Class mismatch: ");
            sb2.append(canonicalName2);
            e.K(sb2.toString());
            throw new RemoteException();
        }
    }

    public final boolean isInitialized() throws RemoteException {
        Object obj = this.f7438a;
        if (obj instanceof MediationRewardedVideoAdAdapter) {
            e.E("Check if adapter is initialized.");
            try {
                return ((MediationRewardedVideoAdAdapter) this.f7438a).isInitialized();
            } catch (Throwable th) {
                throw m5.a("", th);
            }
        } else if (obj instanceof g7.a) {
            return this.f7440c != null;
        } else {
            String canonicalName = MediationRewardedVideoAdAdapter.class.getCanonicalName();
            String canonicalName2 = g7.a.class.getCanonicalName();
            String canonicalName3 = this.f7438a.getClass().getCanonicalName();
            StringBuilder a10 = j4.e.a(o.a(canonicalName3, o.a(canonicalName2, o.a(canonicalName, 26))), canonicalName, " or ", canonicalName2, " #009 Class mismatch: ");
            a10.append(canonicalName3);
            e.K(a10.toString());
            throw new RemoteException();
        }
    }

    public final e3 l2() {
        h hVar = (h) this.f7439b.f21851b;
        if (hVar instanceof g7.j) {
            return new o5((g7.j) hVar);
        }
        return null;
    }

    public final boolean l6() {
        return this.f7438a instanceof InitializableMediationRewardedVideoAdAdapter;
    }

    public final h4 m0() {
        Object obj = this.f7438a;
        if (!(obj instanceof g7.a)) {
            return null;
        }
        ((g7.a) obj).getSDKVersionInfo();
        throw null;
    }

    public final j3 m1() {
        n nVar = (n) this.f7439b.f21852c;
        if (nVar != null) {
            return new t5(nVar);
        }
        return null;
    }

    public final void m6(a aVar, fi0 fi0, String str, y2 y2Var) throws RemoteException {
        fi0 fi02 = fi0;
        String str2 = str;
        if (this.f7438a instanceof g7.a) {
            e.E("Requesting rewarded ad from adapter.");
            try {
                g7.a aVar2 = (g7.a) this.f7438a;
                p9 p9Var = new p9(this, y2Var);
                Context context = (Context) b.z0(aVar);
                Bundle s62 = s6(str2, fi02, (String) null);
                Bundle u62 = u6(fi02);
                boolean t62 = t6(fi0);
                Location location = fi02.f14641s;
                int i10 = fi02.f14637g;
                int i11 = fi02.B;
                String str3 = fi02.C;
                try {
                    str3 = new JSONObject(str2).getString("max_ad_content_rating");
                } catch (JSONException unused) {
                }
                f fVar = r5;
                f fVar2 = new f(context, "", s62, u62, t62, location, i10, i11, str3, "");
                aVar2.loadRewardedAd(fVar, p9Var);
            } catch (Exception e10) {
                e.C("", e10);
                throw new RemoteException();
            }
        } else {
            String canonicalName = g7.a.class.getCanonicalName();
            String canonicalName2 = this.f7438a.getClass().getCanonicalName();
            StringBuilder sb2 = new StringBuilder(o.a(canonicalName2, o.a(canonicalName, 22)));
            sb2.append(canonicalName);
            sb2.append(" #009 Class mismatch: ");
            sb2.append(canonicalName2);
            e.K(sb2.toString());
            throw new RemoteException();
        }
    }

    public final h4 r0() {
        Object obj = this.f7438a;
        if (!(obj instanceof g7.a)) {
            return null;
        }
        ((g7.a) obj).getVersionInfo();
        throw null;
    }

    public final Bundle s6(String str, fi0 fi0, String str2) throws RemoteException {
        String valueOf = String.valueOf(str);
        e.E(valueOf.length() != 0 ? "Server parameters: ".concat(valueOf) : new String("Server parameters: "));
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle2 = new Bundle();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    bundle2.putString(next, jSONObject.getString(next));
                }
                bundle = bundle2;
            }
            if (this.f7438a instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                if (fi0 != null) {
                    bundle.putInt("tagForChildDirectedTreatment", fi0.f14637g);
                }
            }
            bundle.remove("max_ad_content_rating");
            return bundle;
        } catch (Throwable th) {
            throw m5.a("", th);
        }
    }

    public final void showInterstitial() throws RemoteException {
        if (this.f7438a instanceof MediationInterstitialAdapter) {
            e.E("Showing interstitial from adapter.");
            try {
                ((MediationInterstitialAdapter) this.f7438a).showInterstitial();
            } catch (Throwable th) {
                throw m5.a("", th);
            }
        } else {
            String canonicalName = MediationInterstitialAdapter.class.getCanonicalName();
            String canonicalName2 = this.f7438a.getClass().getCanonicalName();
            StringBuilder sb2 = new StringBuilder(o.a(canonicalName2, o.a(canonicalName, 22)));
            sb2.append(canonicalName);
            sb2.append(" #009 Class mismatch: ");
            sb2.append(canonicalName2);
            e.K(sb2.toString());
            throw new RemoteException();
        }
    }

    public final void showVideo() throws RemoteException {
        Object obj = this.f7438a;
        if (obj instanceof MediationRewardedVideoAdAdapter) {
            e.E("Show rewarded video ad from adapter.");
            try {
                ((MediationRewardedVideoAdAdapter) this.f7438a).showVideo();
            } catch (Throwable th) {
                throw m5.a("", th);
            }
        } else if (obj instanceof g7.a) {
            e.I("Can not show null mediated rewarded ad.");
            throw new RemoteException();
        } else {
            String canonicalName = MediationRewardedVideoAdAdapter.class.getCanonicalName();
            String canonicalName2 = g7.a.class.getCanonicalName();
            String canonicalName3 = this.f7438a.getClass().getCanonicalName();
            StringBuilder a10 = j4.e.a(o.a(canonicalName3, o.a(canonicalName2, o.a(canonicalName, 26))), canonicalName, " or ", canonicalName2, " #009 Class mismatch: ");
            a10.append(canonicalName3);
            e.K(a10.toString());
            throw new RemoteException();
        }
    }

    public final Bundle u6(fi0 fi0) {
        Bundle bundle;
        Bundle bundle2 = fi0.f14643u;
        if (bundle2 == null || (bundle = bundle2.getBundle(this.f7438a.getClass().getName())) == null) {
            return new Bundle();
        }
        return bundle;
    }

    public final void v3(a aVar) throws RemoteException {
        if (this.f7438a instanceof g7.a) {
            e.E("Show rewarded ad from adapter.");
            e.I("Can not show null mediation rewarded ad.");
            throw new RemoteException();
        }
        String canonicalName = g7.a.class.getCanonicalName();
        String canonicalName2 = this.f7438a.getClass().getCanonicalName();
        StringBuilder sb2 = new StringBuilder(o.a(canonicalName2, o.a(canonicalName, 22)));
        sb2.append(canonicalName);
        sb2.append(" #009 Class mismatch: ");
        sb2.append(canonicalName2);
        e.K(sb2.toString());
        throw new RemoteException();
    }

    public final Bundle zzuw() {
        Object obj = this.f7438a;
        if (obj instanceof zzbfe) {
            return ((zzbfe) obj).zzuw();
        }
        String canonicalName = zzbfe.class.getCanonicalName();
        String canonicalName2 = this.f7438a.getClass().getCanonicalName();
        StringBuilder sb2 = new StringBuilder(o.a(canonicalName2, o.a(canonicalName, 22)));
        sb2.append(canonicalName);
        sb2.append(" #009 Class mismatch: ");
        sb2.append(canonicalName2);
        e.K(sb2.toString());
        return new Bundle();
    }

    public m3(g7.a aVar) {
        this.f7438a = aVar;
    }
}
