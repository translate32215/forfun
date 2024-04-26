package com.startapp;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.startapp.o7;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.AdsConstants;
import com.startapp.sdk.adsbase.HtmlAd;
import com.startapp.sdk.adsbase.SimpleTokenUtils;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.apppresence.AppPresenceDetails;
import com.startapp.sdk.adsbase.b;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.model.GetAdRequest;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.common.SDKException;
import com.startapp.sdk.components.ComponentLocator;
import com.startapp.wb;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: Sta */
public abstract class t0 extends b {

    /* renamed from: g  reason: collision with root package name */
    public Set<String> f12594g = new HashSet();

    /* renamed from: h  reason: collision with root package name */
    public Set<String> f12595h = new HashSet();

    /* renamed from: i  reason: collision with root package name */
    public GetAdRequest f12596i;

    /* renamed from: j  reason: collision with root package name */
    public int f12597j = 0;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f12598k;

    /* renamed from: l  reason: collision with root package name */
    public m f12599l;

    public t0(Context context, Ad ad2, AdPreferences adPreferences, AdEventListener adEventListener, AdPreferences.Placement placement, boolean z10) {
        super(context, ad2, adPreferences, adEventListener, placement);
        this.f12598k = z10;
    }

    public boolean a(Object obj) {
        if (obj == null) {
            if (this.f12236f == null) {
                this.f12236f = "No response";
            }
            return false;
        } else if (!(obj instanceof o7.a)) {
            if (this.f12236f == null) {
                this.f12236f = "Unknown error";
            }
            return false;
        } else {
            o7.a aVar = (o7.a) obj;
            String str = aVar.f11522a;
            try {
                ArrayList arrayList = new ArrayList();
                if (TextUtils.isEmpty(str)) {
                    if (this.f12236f == null) {
                        GetAdRequest getAdRequest = this.f12596i;
                        if (getAdRequest == null || !getAdRequest.b()) {
                            this.f12236f = "Empty Ad";
                        } else {
                            this.f12236f = "Video isn't available";
                        }
                    }
                    return false;
                }
                boolean H = AdsCommonMetaData.f12098h.H();
                String a10 = wb.a(str, "@adId@", "@adId@");
                if (a10 != null && a10.length() > 0) {
                    this.f12599l = new m(a10, aVar, this.f12598k, H);
                }
                List<AppPresenceDetails> a11 = f0.a(str, this.f12597j);
                boolean z10 = H && f0.a(this.f12231a, a11, this.f12597j, this.f12594g, (List<AppPresenceDetails>) arrayList).booleanValue();
                m mVar = this.f12599l;
                if (mVar != null) {
                    mVar.f10848f = z10;
                }
                if (z10) {
                    new e0(this.f12231a, arrayList).a();
                } else {
                    HtmlAd htmlAd = (HtmlAd) this.f12232b;
                    htmlAd.a(a11);
                    htmlAd.c(str);
                }
                m mVar2 = this.f12599l;
                if (mVar2 != null) {
                    mVar2.f10849g = wb.a();
                }
                if (!z10) {
                    return true;
                }
                f();
                this.f12597j++;
                return b();
            } catch (Throwable th) {
                i4.a(th);
                return false;
            }
        }
    }

    public void b(boolean z10) {
        this.f12232b.setState(z10 ? Ad.AdState.READY : Ad.AdState.UN_INITIALIZED);
    }

    public boolean b(GetAdRequest getAdRequest) {
        return getAdRequest != null;
    }

    public void c(boolean z10) {
        Intent intent = new Intent("com.startapp.android.OnReceiveResponseBroadcastListener");
        intent.putExtra("adHashcode", this.f12232b.hashCode());
        intent.putExtra("adResult", z10);
        a6.a(this.f12231a).a(intent);
        if (!z10) {
            j.a(this.f12231a, a(), this.f12232b, false);
            f();
        } else if (this.f12598k) {
            m mVar = this.f12599l;
            if (mVar != null) {
                mVar.f10850h = wb.a();
            }
            ComponentLocator.a(this.f12231a).f12460b.b().a(((HtmlAd) this.f12232b).j(), new a());
        } else {
            j.b(this.f12231a, a(), this.f12232b, false);
            f();
        }
    }

    public Object e() {
        Map<String, String> map;
        GetAdRequest d10 = d();
        this.f12596i = d10;
        if (!b(d10)) {
            return null;
        }
        if (this.f12594g.size() == 0) {
            this.f12594g.add(this.f12231a.getPackageName());
        }
        GetAdRequest getAdRequest = this.f12596i;
        getAdRequest.C0 = this.f12594g;
        getAdRequest.E0 = this.f12595h;
        if (this.f12597j > 0) {
            getAdRequest.G0 = false;
            if (MetaData.f12393k.I().a(this.f12231a)) {
                SimpleTokenUtils.e(this.f12231a);
            }
        }
        y3 k10 = ComponentLocator.a(this.f12231a).k();
        String a10 = AdsConstants.a(AdsConstants.AdApiType.HTML, this.f12235e);
        k10.getClass();
        GetAdRequest getAdRequest2 = this.f12596i;
        if (getAdRequest2 != null) {
            try {
                map = k10.a();
                c7 c7Var = new c7();
                getAdRequest2.a(c7Var);
                a10 = y3.a(a10, c7Var.toString());
            } catch (SDKException e10) {
                i4.a((Throwable) e10);
                return null;
            } catch (Throwable th) {
                i4.a(th);
                return null;
            }
        } else {
            map = null;
        }
        String str = k10.f12871b.f12678a;
        boolean z10 = k10.b().f12912a;
        long currentTimeMillis = System.currentTimeMillis();
        long a11 = wb.a();
        g7 g7Var = k10.f12873d;
        n7 n7Var = g7Var != null ? new n7(g7Var) : null;
        try {
            o7.a a12 = o7.a(a10, map, str, z10);
            if (n7Var != null) {
                n7Var.a("GET", a10, (SDKException) null);
            }
            a12.f11525d = currentTimeMillis;
            a12.f11526e = a11;
            a12.f11527f = wb.a();
            return a12;
        } catch (SDKException e11) {
            if (n7Var != null) {
                n7Var.a("GET", a10, e11);
            }
            this.f12236f = e11.getMessage();
            return null;
        } catch (Throwable th2) {
            i4.a(th2);
            return null;
        }
    }

    public final void f() {
        m mVar = this.f12599l;
        if (mVar != null) {
            try {
                ComponentLocator.a(this.f12231a).G.b().a(mVar);
            } catch (Throwable th) {
                i4.a(th);
            }
            this.f12599l = null;
        }
    }

    /* compiled from: Sta */
    public class a implements wb.a {
        public a() {
        }

        public void a(boolean z10, long j10, long j11, boolean z11) {
            t0 t0Var = t0.this;
            j.b(t0Var.f12231a, t0Var.a(), t0.this.f12232b, false);
            t0 t0Var2 = t0.this;
            m mVar = t0Var2.f12599l;
            if (mVar != null) {
                mVar.f10847e = z10;
                mVar.f10851i = j10;
                mVar.f10852j = j11;
                mVar.f10854l = z11;
                t0Var2.f();
            }
        }

        public void a(int i10, String str) {
            t0.this.f12232b.setErrorMessage(str);
            t0 t0Var = t0.this;
            j.a(t0Var.f12231a, t0Var.a(), t0.this.f12232b, false);
            t0 t0Var2 = t0.this;
            m mVar = t0Var2.f12599l;
            if (mVar != null) {
                mVar.f10853k = i10;
                t0Var2.f();
            }
        }
    }
}
