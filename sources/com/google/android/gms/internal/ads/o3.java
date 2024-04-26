package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.ads.mediation.MediationBannerAdapter;
import com.google.ads.mediation.MediationInterstitialAdapter;
import com.google.ads.mediation.a;
import e8.b4;
import e8.fi0;
import e8.li0;
import e8.m5;
import e8.n1;
import e8.ti0;
import e8.y8;
import i4.c;
import j4.b;
import j4.f;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import l0.e;
import org.json.JSONObject;
import y6.d;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public final class o3<NETWORK_EXTRAS extends f, SERVER_PARAMETERS extends a> extends w2 {

    /* renamed from: a  reason: collision with root package name */
    public final b<NETWORK_EXTRAS, SERVER_PARAMETERS> f7663a;

    /* renamed from: b  reason: collision with root package name */
    public final NETWORK_EXTRAS f7664b;

    public o3(b<NETWORK_EXTRAS, SERVER_PARAMETERS> bVar, NETWORK_EXTRAS network_extras) {
        this.f7663a = bVar;
        this.f7664b = network_extras;
    }

    public static boolean s6(fi0 fi0) {
        if (fi0.f14636f) {
            return true;
        }
        y8 y8Var = ti0.f16763j.f16764a;
        return y8.k();
    }

    public final void A2(c8.a aVar, li0 li0, fi0 fi0, String str, y2 y2Var) throws RemoteException {
        S5(aVar, li0, fi0, str, (String) null, y2Var);
    }

    public final void C1(c8.a aVar, fi0 fi0, String str, String str2, y2 y2Var, n1 n1Var, List<String> list) {
    }

    public final void D() throws RemoteException {
        throw new RemoteException();
    }

    public final l0 I4() {
        return null;
    }

    public final void J4(c8.a aVar) throws RemoteException {
    }

    public final void N(boolean z10) {
    }

    public final d3 N3() {
        return null;
    }

    public final void S5(c8.a aVar, li0 li0, fi0 fi0, String str, String str2, y2 y2Var) throws RemoteException {
        c cVar;
        b<NETWORK_EXTRAS, SERVER_PARAMETERS> bVar = this.f7663a;
        if (!(bVar instanceof MediationBannerAdapter)) {
            String valueOf = String.valueOf(bVar.getClass().getCanonicalName());
            e.K(valueOf.length() != 0 ? "Not a MediationBannerAdapter: ".concat(valueOf) : new String("Not a MediationBannerAdapter: "));
            throw new RemoteException();
        }
        e.E("Requesting banner ad from adapter.");
        try {
            MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) this.f7663a;
            ri riVar = new ri(y2Var);
            Activity activity = (Activity) c8.b.z0(aVar);
            a t62 = t6(str);
            int i10 = 0;
            c[] cVarArr = {c.f19148b, c.f19149c, c.f19150d, c.f19151e, c.f19152f, c.f19153g};
            while (true) {
                if (i10 < 6) {
                    if (cVarArr[i10].f19154a.f28120a == li0.f15398e && cVarArr[i10].f19154a.f28121b == li0.f15395b) {
                        cVar = cVarArr[i10];
                        break;
                    }
                    i10++;
                } else {
                    cVar = new c(new d(li0.f15398e, li0.f15395b, li0.f15394a));
                    break;
                }
            }
            mediationBannerAdapter.requestBannerAd(riVar, activity, t62, cVar, e.e.f(fi0, s6(fi0)), this.f7664b);
        } catch (Throwable th) {
            throw m5.a("", th);
        }
    }

    public final void U0(c8.a aVar, fi0 fi0, String str, y5 y5Var, String str2) throws RemoteException {
    }

    public final void W5(c8.a aVar, v1 v1Var, List<b4> list) throws RemoteException {
    }

    public final void a6(fi0 fi0, String str, String str2) {
    }

    public final void b5(c8.a aVar, fi0 fi0, String str, y2 y2Var) throws RemoteException {
    }

    public final void c5(c8.a aVar, fi0 fi0, String str, String str2, y2 y2Var) throws RemoteException {
        b<NETWORK_EXTRAS, SERVER_PARAMETERS> bVar = this.f7663a;
        if (!(bVar instanceof MediationInterstitialAdapter)) {
            String valueOf = String.valueOf(bVar.getClass().getCanonicalName());
            e.K(valueOf.length() != 0 ? "Not a MediationInterstitialAdapter: ".concat(valueOf) : new String("Not a MediationInterstitialAdapter: "));
            throw new RemoteException();
        }
        e.E("Requesting interstitial ad from adapter.");
        try {
            ((MediationInterstitialAdapter) this.f7663a).requestInterstitialAd(new ri(y2Var), (Activity) c8.b.z0(aVar), t6(str), e.e.f(fi0, s6(fi0)), this.f7664b);
        } catch (Throwable th) {
            throw m5.a("", th);
        }
    }

    public final void d2(fi0 fi0, String str) {
    }

    public final void destroy() throws RemoteException {
        try {
            this.f7663a.destroy();
        } catch (Throwable th) {
            throw m5.a("", th);
        }
    }

    public final Bundle e2() {
        return new Bundle();
    }

    public final void f2(c8.a aVar, fi0 fi0, String str, y2 y2Var) throws RemoteException {
        c5(aVar, fi0, str, (String) null, y2Var);
    }

    public final void g() throws RemoteException {
        throw new RemoteException();
    }

    public final Bundle getInterstitialAdapterInfo() {
        return new Bundle();
    }

    public final hz getVideoController() {
        return null;
    }

    public final void i4(c8.a aVar, y5 y5Var, List<String> list) {
    }

    public final c8.a i5() throws RemoteException {
        b<NETWORK_EXTRAS, SERVER_PARAMETERS> bVar = this.f7663a;
        if (!(bVar instanceof MediationBannerAdapter)) {
            String valueOf = String.valueOf(bVar.getClass().getCanonicalName());
            e.K(valueOf.length() != 0 ? "Not a MediationBannerAdapter: ".concat(valueOf) : new String("Not a MediationBannerAdapter: "));
            throw new RemoteException();
        }
        try {
            return new c8.b(((MediationBannerAdapter) bVar).getBannerView());
        } catch (Throwable th) {
            throw m5.a("", th);
        }
    }

    public final boolean isInitialized() {
        return true;
    }

    public final e3 l2() {
        return null;
    }

    public final boolean l6() {
        return false;
    }

    public final h4 m0() {
        return null;
    }

    public final j3 m1() {
        return null;
    }

    public final void m6(c8.a aVar, fi0 fi0, String str, y2 y2Var) throws RemoteException {
    }

    public final h4 r0() {
        return null;
    }

    public final void showInterstitial() throws RemoteException {
        b<NETWORK_EXTRAS, SERVER_PARAMETERS> bVar = this.f7663a;
        if (!(bVar instanceof MediationInterstitialAdapter)) {
            String valueOf = String.valueOf(bVar.getClass().getCanonicalName());
            e.K(valueOf.length() != 0 ? "Not a MediationInterstitialAdapter: ".concat(valueOf) : new String("Not a MediationInterstitialAdapter: "));
            throw new RemoteException();
        }
        e.E("Showing interstitial from adapter.");
        try {
            ((MediationInterstitialAdapter) this.f7663a).showInterstitial();
        } catch (Throwable th) {
            throw m5.a("", th);
        }
    }

    public final void showVideo() {
    }

    public final SERVER_PARAMETERS t6(String str) throws RemoteException {
        HashMap hashMap;
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                hashMap = new HashMap(jSONObject.length());
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, jSONObject.getString(next));
                }
            } catch (Throwable th) {
                throw m5.a("", th);
            }
        } else {
            hashMap = new HashMap(0);
        }
        Class<SERVER_PARAMETERS> serverParametersType = this.f7663a.getServerParametersType();
        if (serverParametersType == null) {
            return null;
        }
        SERVER_PARAMETERS server_parameters = (a) serverParametersType.newInstance();
        server_parameters.a(hashMap);
        return server_parameters;
    }

    public final void v3(c8.a aVar) throws RemoteException {
    }

    public final Bundle zzuw() {
        return new Bundle();
    }
}
