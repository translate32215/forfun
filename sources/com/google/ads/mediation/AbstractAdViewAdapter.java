package com.google.ads.mediation;

import a7.e;
import a7.g;
import a7.h;
import a7.i;
import a7.j;
import a7.l;
import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import b2.t;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.internal.ads.ay;
import com.google.android.gms.internal.ads.dy;
import com.google.android.gms.internal.ads.g2;
import com.google.android.gms.internal.ads.hz;
import com.google.android.gms.internal.ads.kx;
import com.google.android.gms.internal.ads.t2;
import com.google.android.gms.internal.ads.y2;
import com.google.android.gms.internal.ads.y5;
import com.google.android.gms.internal.ads.zzbfd;
import e8.bi0;
import e8.bj0;
import e8.dj0;
import e8.e2;
import e8.gi0;
import e8.h2;
import e8.i2;
import e8.j2;
import e8.ji0;
import e8.k2;
import e8.m30;
import e8.n1;
import e8.q5;
import e8.s1;
import e8.ti0;
import e8.v7;
import e8.w90;
import e8.wh0;
import e8.x1;
import e8.y1;
import e8.y8;
import g7.j;
import g7.k;
import g7.m;
import g7.n;
import g7.p;
import java.util.Date;
import java.util.List;
import java.util.Set;
import y6.c;
import y6.i;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
public abstract class AbstractAdViewAdapter implements MediationBannerAdapter, MediationNativeAdapter, m, p, MediationRewardedVideoAdAdapter, zzbfd {
    public static final String AD_UNIT_ID_PARAMETER = "pubid";
    private y6.f zzmf;
    private i zzmg;
    private y6.b zzmh;
    private Context zzmi;
    /* access modifiers changed from: private */
    public i zzmj;
    /* access modifiers changed from: private */
    public l7.a zzmk;
    private final k7.c zzml = new t(this);

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
    public static class a extends j {

        /* renamed from: k  reason: collision with root package name */
        public final a7.i f4996k;

        public a(a7.i iVar) {
            String str;
            String str2;
            String str3;
            this.f4996k = iVar;
            y1 y1Var = (y1) iVar;
            y1Var.getClass();
            String str4 = null;
            try {
                str = y1Var.f17562a.b();
            } catch (RemoteException e10) {
                l0.e.C("", e10);
                str = null;
            }
            this.f18573e = str.toString();
            this.f18574f = y1Var.f17563b;
            try {
                str2 = y1Var.f17562a.c();
            } catch (RemoteException e11) {
                l0.e.C("", e11);
                str2 = null;
            }
            this.f18575g = str2.toString();
            s1 s1Var = y1Var.f17564c;
            if (s1Var != null) {
                this.f18576h = s1Var;
            }
            try {
                str3 = y1Var.f17562a.getCallToAction();
            } catch (RemoteException e12) {
                l0.e.C("", e12);
                str3 = null;
            }
            this.f18577i = str3.toString();
            try {
                str4 = y1Var.f17562a.t();
            } catch (RemoteException e13) {
                l0.e.C("", e13);
            }
            this.f18578j = str4.toString();
            this.f18561a = true;
            this.f18562b = true;
            try {
                if (y1Var.f17562a.getVideoController() != null) {
                    y1Var.f17565d.b(y1Var.f17562a.getVideoController());
                }
            } catch (RemoteException e14) {
                l0.e.C("Exception occurred while getting video controller", e14);
            }
            this.f18564d = y1Var.f17565d;
        }

        public final void a(View view) {
            if (view instanceof a7.f) {
                ((a7.f) view).setNativeAd(this.f4996k);
            }
            if (g.f144a.get(view) != null) {
                c8.a aVar = (c8.a) this.f4996k.a();
                l0.e.K("NativeAdViewHolder.setNativeAd containerView doesn't exist, returning");
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
    public static class b extends g7.i {

        /* renamed from: m  reason: collision with root package name */
        public final h f4997m;

        public b(h hVar) {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6;
            this.f4997m = hVar;
            x1 x1Var = (x1) hVar;
            x1Var.getClass();
            String str7 = null;
            try {
                str = x1Var.f17427a.b();
            } catch (RemoteException e10) {
                l0.e.C("", e10);
                str = null;
            }
            this.f18565e = str.toString();
            this.f18566f = x1Var.f17428b;
            try {
                str2 = x1Var.f17427a.c();
            } catch (RemoteException e11) {
                l0.e.C("", e11);
                str2 = null;
            }
            this.f18567g = str2.toString();
            this.f18568h = x1Var.f17429c;
            try {
                str3 = x1Var.f17427a.getCallToAction();
            } catch (RemoteException e12) {
                l0.e.C("", e12);
                str3 = null;
            }
            this.f18569i = str3.toString();
            if (hVar.b() != null) {
                this.f18570j = hVar.b().doubleValue();
            }
            try {
                str4 = x1Var.f17427a.u();
            } catch (RemoteException e13) {
                l0.e.C("", e13);
                str4 = null;
            }
            if (str4 != null) {
                try {
                    str6 = x1Var.f17427a.u();
                } catch (RemoteException e14) {
                    l0.e.C("", e14);
                    str6 = null;
                }
                this.f18571k = str6.toString();
            }
            try {
                str5 = x1Var.f17427a.r();
            } catch (RemoteException e15) {
                l0.e.C("", e15);
                str5 = null;
            }
            if (str5 != null) {
                try {
                    str7 = x1Var.f17427a.r();
                } catch (RemoteException e16) {
                    l0.e.C("", e16);
                }
                this.f18572l = str7.toString();
            }
            this.f18561a = true;
            this.f18562b = true;
            try {
                if (x1Var.f17427a.getVideoController() != null) {
                    x1Var.f17430d.b(x1Var.f17427a.getVideoController());
                }
            } catch (RemoteException e17) {
                l0.e.C("Exception occurred while getting video controller", e17);
            }
            this.f18564d = x1Var.f17430d;
        }

        public final void a(View view) {
            if (view instanceof a7.f) {
                ((a7.f) view).setNativeAd(this.f4997m);
            }
            g gVar = g.f144a.get(view);
            if (gVar != null) {
                gVar.a(this.f4997m);
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
    public static final class c extends y6.a implements z6.a, wh0 {

        /* renamed from: a  reason: collision with root package name */
        public final g7.e f4998a;

        public c(AbstractAdViewAdapter abstractAdViewAdapter, g7.e eVar) {
            this.f4998a = eVar;
        }

        public final void a(String str, String str2) {
            n2.g gVar = (n2.g) this.f4998a;
            gVar.getClass();
            com.google.android.gms.common.internal.i.d("#008 Must be called on the main UI thread.");
            l0.e.E("Adapter called onAppEvent.");
            try {
                ((y2) gVar.f21850a).a(str, str2);
            } catch (RemoteException e10) {
                l0.e.F("#007 Could not call remote method.", e10);
            }
        }

        public final void g() {
            n2.g gVar = (n2.g) this.f4998a;
            gVar.getClass();
            com.google.android.gms.common.internal.i.d("#008 Must be called on the main UI thread.");
            l0.e.E("Adapter called onAdClosed.");
            try {
                ((y2) gVar.f21850a).C();
            } catch (RemoteException e10) {
                l0.e.F("#007 Could not call remote method.", e10);
            }
        }

        public final void l(int i10) {
            n2.g gVar = (n2.g) this.f4998a;
            gVar.getClass();
            com.google.android.gms.common.internal.i.d("#008 Must be called on the main UI thread.");
            StringBuilder sb2 = new StringBuilder(55);
            sb2.append("Adapter called onAdFailedToLoad with error. ");
            sb2.append(i10);
            l0.e.E(sb2.toString());
            try {
                ((y2) gVar.f21850a).h0(i10);
            } catch (RemoteException e10) {
                l0.e.F("#007 Could not call remote method.", e10);
            }
        }

        public final void n() {
            n2.g gVar = (n2.g) this.f4998a;
            gVar.getClass();
            com.google.android.gms.common.internal.i.d("#008 Must be called on the main UI thread.");
            l0.e.E("Adapter called onAdClicked.");
            try {
                ((y2) gVar.f21850a).n();
            } catch (RemoteException e10) {
                l0.e.F("#007 Could not call remote method.", e10);
            }
        }

        public final void v() {
            n2.g gVar = (n2.g) this.f4998a;
            gVar.getClass();
            com.google.android.gms.common.internal.i.d("#008 Must be called on the main UI thread.");
            l0.e.E("Adapter called onAdLeftApplication.");
            try {
                ((y2) gVar.f21850a).J();
            } catch (RemoteException e10) {
                l0.e.F("#007 Could not call remote method.", e10);
            }
        }

        public final void w() {
            n2.g gVar = (n2.g) this.f4998a;
            gVar.getClass();
            com.google.android.gms.common.internal.i.d("#008 Must be called on the main UI thread.");
            l0.e.E("Adapter called onAdLoaded.");
            try {
                ((y2) gVar.f21850a).v();
            } catch (RemoteException e10) {
                l0.e.F("#007 Could not call remote method.", e10);
            }
        }

        public final void y() {
            n2.g gVar = (n2.g) this.f4998a;
            gVar.getClass();
            com.google.android.gms.common.internal.i.d("#008 Must be called on the main UI thread.");
            l0.e.E("Adapter called onAdOpened.");
            try {
                ((y2) gVar.f21850a).F();
            } catch (RemoteException e10) {
                l0.e.F("#007 Could not call remote method.", e10);
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
    public static class d extends n {

        /* renamed from: o  reason: collision with root package name */
        public final l f4999o;

        /* JADX WARNING: Removed duplicated region for block: B:43:0x008a A[Catch:{ RemoteException -> 0x008f }] */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x00a2 A[Catch:{ RemoteException -> 0x00ae }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public d(a7.l r8) {
            /*
                r7 = this;
                java.lang.String r0 = ""
                r7.<init>()
                r7.f4999o = r8
                e8.d2 r8 = (e8.d2) r8
                r8.getClass()
                r1 = 0
                com.google.android.gms.internal.ads.k1 r2 = r8.f14203a     // Catch:{ RemoteException -> 0x0014 }
                java.lang.String r2 = r2.b()     // Catch:{ RemoteException -> 0x0014 }
                goto L_0x0019
            L_0x0014:
                r2 = move-exception
                l0.e.C(r0, r2)
                r2 = r1
            L_0x0019:
                r7.f18579a = r2
                java.util.List<a7.d$b> r2 = r8.f14204b
                r7.f18580b = r2
                com.google.android.gms.internal.ads.k1 r2 = r8.f14203a     // Catch:{ RemoteException -> 0x0026 }
                java.lang.String r2 = r2.c()     // Catch:{ RemoteException -> 0x0026 }
                goto L_0x002b
            L_0x0026:
                r2 = move-exception
                l0.e.C(r0, r2)
                r2 = r1
            L_0x002b:
                r7.f18581c = r2
                e8.s1 r2 = r8.f14205c
                r7.f18582d = r2
                com.google.android.gms.internal.ads.k1 r2 = r8.f14203a     // Catch:{ RemoteException -> 0x0038 }
                java.lang.String r2 = r2.getCallToAction()     // Catch:{ RemoteException -> 0x0038 }
                goto L_0x003d
            L_0x0038:
                r2 = move-exception
                l0.e.C(r0, r2)
                r2 = r1
            L_0x003d:
                r7.f18583e = r2
                com.google.android.gms.internal.ads.k1 r2 = r8.f14203a     // Catch:{ RemoteException -> 0x0046 }
                java.lang.String r2 = r2.t()     // Catch:{ RemoteException -> 0x0046 }
                goto L_0x004b
            L_0x0046:
                r2 = move-exception
                l0.e.C(r0, r2)
                r2 = r1
            L_0x004b:
                r7.f18584f = r2
                com.google.android.gms.internal.ads.k1 r2 = r8.f14203a     // Catch:{ RemoteException -> 0x005f }
                double r2 = r2.k()     // Catch:{ RemoteException -> 0x005f }
                r4 = -4616189618054758400(0xbff0000000000000, double:-1.0)
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 != 0) goto L_0x005a
                goto L_0x0063
            L_0x005a:
                java.lang.Double r2 = java.lang.Double.valueOf(r2)     // Catch:{ RemoteException -> 0x005f }
                goto L_0x0064
            L_0x005f:
                r2 = move-exception
                l0.e.C(r0, r2)
            L_0x0063:
                r2 = r1
            L_0x0064:
                r7.f18585g = r2
                com.google.android.gms.internal.ads.k1 r2 = r8.f14203a     // Catch:{ RemoteException -> 0x006d }
                java.lang.String r2 = r2.u()     // Catch:{ RemoteException -> 0x006d }
                goto L_0x0072
            L_0x006d:
                r2 = move-exception
                l0.e.C(r0, r2)
                r2 = r1
            L_0x0072:
                r7.f18586h = r2
                com.google.android.gms.internal.ads.k1 r2 = r8.f14203a     // Catch:{ RemoteException -> 0x007b }
                java.lang.String r2 = r2.r()     // Catch:{ RemoteException -> 0x007b }
                goto L_0x0080
            L_0x007b:
                r2 = move-exception
                l0.e.C(r0, r2)
                r2 = r1
            L_0x0080:
                r7.f18587i = r2
                com.google.android.gms.internal.ads.k1 r2 = r8.f14203a     // Catch:{ RemoteException -> 0x008f }
                c8.a r2 = r2.p()     // Catch:{ RemoteException -> 0x008f }
                if (r2 == 0) goto L_0x0093
                java.lang.Object r1 = c8.b.z0(r2)     // Catch:{ RemoteException -> 0x008f }
                goto L_0x0093
            L_0x008f:
                r2 = move-exception
                l0.e.C(r0, r2)
            L_0x0093:
                r7.f18589k = r1
                r0 = 1
                r7.f18591m = r0
                r7.f18592n = r0
                com.google.android.gms.internal.ads.k1 r0 = r8.f14203a     // Catch:{ RemoteException -> 0x00ae }
                com.google.android.gms.internal.ads.hz r0 = r0.getVideoController()     // Catch:{ RemoteException -> 0x00ae }
                if (r0 == 0) goto L_0x00b4
                com.google.android.gms.ads.f r0 = r8.f14206d     // Catch:{ RemoteException -> 0x00ae }
                com.google.android.gms.internal.ads.k1 r1 = r8.f14203a     // Catch:{ RemoteException -> 0x00ae }
                com.google.android.gms.internal.ads.hz r1 = r1.getVideoController()     // Catch:{ RemoteException -> 0x00ae }
                r0.b(r1)     // Catch:{ RemoteException -> 0x00ae }
                goto L_0x00b4
            L_0x00ae:
                r0 = move-exception
                java.lang.String r1 = "Exception occurred while getting video controller"
                l0.e.C(r1, r0)
            L_0x00b4:
                com.google.android.gms.ads.f r8 = r8.f14206d
                r7.f18588j = r8
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.ads.mediation.AbstractAdViewAdapter.d.<init>(a7.l):void");
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
    public static final class e extends y6.a implements h.a, i.a, j.a, j.b, l.a {

        /* renamed from: a  reason: collision with root package name */
        public final AbstractAdViewAdapter f5000a;

        /* renamed from: b  reason: collision with root package name */
        public final g7.g f5001b;

        public e(AbstractAdViewAdapter abstractAdViewAdapter, g7.g gVar) {
            this.f5000a = abstractAdViewAdapter;
            this.f5001b = gVar;
        }

        public final void g() {
            n2.g gVar = (n2.g) this.f5001b;
            gVar.getClass();
            com.google.android.gms.common.internal.i.d("#008 Must be called on the main UI thread.");
            l0.e.E("Adapter called onAdClosed.");
            try {
                ((y2) gVar.f21850a).C();
            } catch (RemoteException e10) {
                l0.e.F("#007 Could not call remote method.", e10);
            }
        }

        public final void l(int i10) {
            n2.g gVar = (n2.g) this.f5001b;
            gVar.getClass();
            com.google.android.gms.common.internal.i.d("#008 Must be called on the main UI thread.");
            StringBuilder sb2 = new StringBuilder(55);
            sb2.append("Adapter called onAdFailedToLoad with error ");
            sb2.append(i10);
            sb2.append(".");
            l0.e.E(sb2.toString());
            try {
                ((y2) gVar.f21850a).h0(i10);
            } catch (RemoteException e10) {
                l0.e.F("#007 Could not call remote method.", e10);
            }
        }

        public final void n() {
            n2.g gVar = (n2.g) this.f5001b;
            gVar.getClass();
            com.google.android.gms.common.internal.i.d("#008 Must be called on the main UI thread.");
            g7.h hVar = (g7.h) gVar.f21851b;
            n nVar = (n) gVar.f21852c;
            if (((a7.j) gVar.f21853d) == null) {
                if (hVar == null && nVar == null) {
                    l0.e.F("#007 Could not call remote method.", (Throwable) null);
                    return;
                } else if (nVar != null && !nVar.f18592n) {
                    l0.e.E("Could not call onAdClicked since setOverrideClickHandling is not set to true");
                    return;
                } else if (hVar != null && !hVar.f18562b) {
                    l0.e.E("Could not call onAdClicked since setOverrideClickHandling is not set to true");
                    return;
                }
            }
            l0.e.E("Adapter called onAdClicked.");
            try {
                ((y2) gVar.f21850a).n();
            } catch (RemoteException e10) {
                l0.e.F("#007 Could not call remote method.", e10);
            }
        }

        public final void t() {
            n2.g gVar = (n2.g) this.f5001b;
            gVar.getClass();
            com.google.android.gms.common.internal.i.d("#008 Must be called on the main UI thread.");
            g7.h hVar = (g7.h) gVar.f21851b;
            n nVar = (n) gVar.f21852c;
            if (((a7.j) gVar.f21853d) == null) {
                if (hVar == null && nVar == null) {
                    l0.e.F("#007 Could not call remote method.", (Throwable) null);
                    return;
                } else if (nVar != null && !nVar.f18591m) {
                    l0.e.E("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
                    return;
                } else if (hVar != null && !hVar.f18561a) {
                    l0.e.E("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
                    return;
                }
            }
            l0.e.E("Adapter called onAdImpression.");
            try {
                ((y2) gVar.f21850a).O();
            } catch (RemoteException e10) {
                l0.e.F("#007 Could not call remote method.", e10);
            }
        }

        public final void v() {
            n2.g gVar = (n2.g) this.f5001b;
            gVar.getClass();
            com.google.android.gms.common.internal.i.d("#008 Must be called on the main UI thread.");
            l0.e.E("Adapter called onAdLeftApplication.");
            try {
                ((y2) gVar.f21850a).J();
            } catch (RemoteException e10) {
                l0.e.F("#007 Could not call remote method.", e10);
            }
        }

        public final void w() {
        }

        public final void y() {
            n2.g gVar = (n2.g) this.f5001b;
            gVar.getClass();
            com.google.android.gms.common.internal.i.d("#008 Must be called on the main UI thread.");
            l0.e.E("Adapter called onAdOpened.");
            try {
                ((y2) gVar.f21850a).F();
            } catch (RemoteException e10) {
                l0.e.F("#007 Could not call remote method.", e10);
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
    public static final class f extends y6.a implements wh0 {

        /* renamed from: a  reason: collision with root package name */
        public final AbstractAdViewAdapter f5002a;

        /* renamed from: b  reason: collision with root package name */
        public final g7.f f5003b;

        public f(AbstractAdViewAdapter abstractAdViewAdapter, g7.f fVar) {
            this.f5002a = abstractAdViewAdapter;
            this.f5003b = fVar;
        }

        public final void g() {
            ((n2.g) this.f5003b).o(this.f5002a);
        }

        public final void l(int i10) {
            ((n2.g) this.f5003b).p(this.f5002a, i10);
        }

        public final void n() {
            n2.g gVar = (n2.g) this.f5003b;
            gVar.getClass();
            com.google.android.gms.common.internal.i.d("#008 Must be called on the main UI thread.");
            l0.e.E("Adapter called onAdClicked.");
            try {
                ((y2) gVar.f21850a).n();
            } catch (RemoteException e10) {
                l0.e.F("#007 Could not call remote method.", e10);
            }
        }

        public final void v() {
            n2.g gVar = (n2.g) this.f5003b;
            gVar.getClass();
            com.google.android.gms.common.internal.i.d("#008 Must be called on the main UI thread.");
            l0.e.E("Adapter called onAdLeftApplication.");
            try {
                ((y2) gVar.f21850a).J();
            } catch (RemoteException e10) {
                l0.e.F("#007 Could not call remote method.", e10);
            }
        }

        public final void w() {
            ((n2.g) this.f5003b).q(this.f5002a);
        }

        public final void y() {
            ((n2.g) this.f5003b).s(this.f5002a);
        }
    }

    private final y6.c zza(Context context, g7.c cVar, Bundle bundle, Bundle bundle2) {
        Class<AdMobAdapter> cls = AdMobAdapter.class;
        c.a aVar = new c.a();
        Date b10 = cVar.b();
        if (b10 != null) {
            aVar.f28109a.f14154g = b10;
        }
        int g10 = cVar.g();
        if (g10 != 0) {
            aVar.f28109a.f14156i = g10;
        }
        Set<String> d10 = cVar.d();
        if (d10 != null) {
            for (String add : d10) {
                aVar.f28109a.f14148a.add(add);
            }
        }
        Location f10 = cVar.f();
        if (f10 != null) {
            aVar.f28109a.f14157j = f10;
        }
        if (cVar.c()) {
            y8 y8Var = ti0.f16763j.f16764a;
            aVar.f28109a.f14151d.add(y8.d(context));
        }
        if (cVar.e() != -1) {
            int i10 = 1;
            if (cVar.e() != 1) {
                i10 = 0;
            }
            aVar.f28109a.f14158k = i10;
        }
        aVar.f28109a.f14159l = cVar.a();
        Bundle zza = zza(bundle, bundle2);
        aVar.f28109a.f14149b.putBundle(cls.getName(), zza);
        if (cls.equals(cls) && zza.getBoolean("_emulatorLiveAds")) {
            aVar.f28109a.f14151d.remove("B3EEABB8EE11C2BE770B684D95219ECB");
        }
        return new y6.c(aVar);
    }

    public String getAdUnitId(Bundle bundle) {
        return bundle.getString(AD_UNIT_ID_PARAMETER);
    }

    public View getBannerView() {
        return this.zzmf;
    }

    public Bundle getInterstitialAdapterInfo() {
        Bundle bundle = new Bundle();
        bundle.putInt("capabilities", 1);
        return bundle;
    }

    public hz getVideoController() {
        com.google.android.gms.ads.f videoController;
        y6.f fVar = this.zzmf;
        if (fVar == null || (videoController = fVar.getVideoController()) == null) {
            return null;
        }
        return videoController.c();
    }

    public void initialize(Context context, g7.c cVar, String str, l7.a aVar, Bundle bundle, Bundle bundle2) {
        this.zzmi = context.getApplicationContext();
        this.zzmk = aVar;
        g2 g2Var = (g2) aVar;
        g2Var.getClass();
        com.google.android.gms.common.internal.i.d("#008 Must be called on the main UI thread.");
        l0.e.E("Adapter called onInitializationSucceeded.");
        try {
            ((y5) g2Var.f6511b).U3(new c8.b(this));
        } catch (RemoteException e10) {
            l0.e.F("#007 Could not call remote method.", e10);
        }
    }

    public boolean isInitialized() {
        return this.zzmk != null;
    }

    public void loadAd(g7.c cVar, Bundle bundle, Bundle bundle2) {
        Context context = this.zzmi;
        if (context == null || this.zzmk == null) {
            l0.e.I("AdMobAdapter.loadAd called before initialize.");
            return;
        }
        y6.i iVar = new y6.i(context);
        this.zzmj = iVar;
        iVar.f28126a.f14295i = true;
        iVar.c(getAdUnitId(bundle));
        y6.i iVar2 = this.zzmj;
        k7.c cVar2 = this.zzml;
        dj0 dj0 = iVar2.f28126a;
        dj0.getClass();
        try {
            dj0.f14294h = cVar2;
            dy dyVar = dj0.f14291e;
            if (dyVar != null) {
                dyVar.T(cVar2 != null ? new v7(cVar2) : null);
            }
        } catch (RemoteException e10) {
            l0.e.F("#007 Could not call remote method.", e10);
        }
        y6.i iVar3 = this.zzmj;
        j4.g gVar = new j4.g(this);
        dj0 dj02 = iVar3.f28126a;
        dj02.getClass();
        try {
            dj02.f14293g = gVar;
            dy dyVar2 = dj02.f14291e;
            if (dyVar2 != null) {
                dyVar2.e0(new gi0(gVar));
            }
        } catch (RemoteException e11) {
            l0.e.F("#007 Could not call remote method.", e11);
        }
        this.zzmj.a(zza(this.zzmi, cVar, bundle2, bundle));
    }

    public void onDestroy() {
        y6.f fVar = this.zzmf;
        if (fVar != null) {
            bj0 bj0 = fVar.f28125a;
            bj0.getClass();
            try {
                dy dyVar = bj0.f14028h;
                if (dyVar != null) {
                    dyVar.destroy();
                }
            } catch (RemoteException e10) {
                l0.e.F("#007 Could not call remote method.", e10);
            }
            this.zzmf = null;
        }
        if (this.zzmg != null) {
            this.zzmg = null;
        }
        if (this.zzmh != null) {
            this.zzmh = null;
        }
        if (this.zzmj != null) {
            this.zzmj = null;
        }
    }

    public void onImmersiveModeUpdated(boolean z10) {
        y6.i iVar = this.zzmg;
        if (iVar != null) {
            iVar.d(z10);
        }
        y6.i iVar2 = this.zzmj;
        if (iVar2 != null) {
            iVar2.d(z10);
        }
    }

    public void onPause() {
        y6.f fVar = this.zzmf;
        if (fVar != null) {
            bj0 bj0 = fVar.f28125a;
            bj0.getClass();
            try {
                dy dyVar = bj0.f14028h;
                if (dyVar != null) {
                    dyVar.g();
                }
            } catch (RemoteException e10) {
                l0.e.F("#007 Could not call remote method.", e10);
            }
        }
    }

    public void onResume() {
        y6.f fVar = this.zzmf;
        if (fVar != null) {
            bj0 bj0 = fVar.f28125a;
            bj0.getClass();
            try {
                dy dyVar = bj0.f14028h;
                if (dyVar != null) {
                    dyVar.D();
                }
            } catch (RemoteException e10) {
                l0.e.F("#007 Could not call remote method.", e10);
            }
        }
    }

    public void requestBannerAd(Context context, g7.e eVar, Bundle bundle, y6.d dVar, g7.c cVar, Bundle bundle2) {
        y6.f fVar = new y6.f(context);
        this.zzmf = fVar;
        fVar.setAdSize(new y6.d(dVar.f28120a, dVar.f28121b));
        this.zzmf.setAdUnitId(getAdUnitId(bundle));
        this.zzmf.setAdListener(new c(this, eVar));
        this.zzmf.a(zza(context, cVar, bundle2, bundle));
    }

    public void requestInterstitialAd(Context context, g7.f fVar, Bundle bundle, g7.c cVar, Bundle bundle2) {
        y6.i iVar = new y6.i(context);
        this.zzmg = iVar;
        iVar.c(getAdUnitId(bundle));
        this.zzmg.b(new f(this, fVar));
        this.zzmg.a(zza(context, cVar, bundle2, bundle));
    }

    public void requestNativeAd(Context context, g7.g gVar, Bundle bundle, k kVar, Bundle bundle2) {
        a7.e eVar;
        e8.g2 g2Var;
        e8.h hVar;
        e eVar2 = new e(this, gVar);
        String string = bundle.getString(AD_UNIT_ID_PARAMETER);
        com.google.android.gms.common.internal.i.i(context, "context cannot be null");
        m30 m30 = ti0.f16763j.f16765b;
        t2 t2Var = new t2();
        m30.getClass();
        kx kxVar = new kx(m30, context, string, t2Var);
        boolean z10 = false;
        ay ayVar = (ay) kxVar.b(context, false);
        try {
            ayVar.R4(new bi0(eVar2));
        } catch (RemoteException e10) {
            l0.e.D("Failed to set AdListener.", e10);
        }
        q5 q5Var = (q5) kVar;
        n1 n1Var = q5Var.f16091g;
        y6.b bVar = null;
        if (n1Var == null) {
            eVar = null;
        } else {
            e.a aVar = new e.a();
            aVar.f139a = n1Var.f15572b;
            aVar.f140b = n1Var.f15573c;
            aVar.f141c = n1Var.f15574d;
            int i10 = n1Var.f15571a;
            if (i10 >= 2) {
                aVar.f143e = n1Var.f15575e;
            }
            if (i10 >= 3 && (hVar = n1Var.f15576f) != null) {
                aVar.f142d = new y6.m(hVar);
            }
            eVar = new a7.e(aVar, (p.a) null);
        }
        if (eVar != null) {
            try {
                ayVar.N2(new n1(eVar));
            } catch (RemoteException e11) {
                l0.e.D("Failed to specify native ad options", e11);
            }
        }
        List<String> list = q5Var.f16092h;
        if (list != null && list.contains("6")) {
            try {
                ayVar.w5(new k2(eVar2));
            } catch (RemoteException e12) {
                l0.e.D("Failed to add google native ad listener", e12);
            }
        }
        List<String> list2 = q5Var.f16092h;
        if (list2 != null && (list2.contains("2") || q5Var.f16092h.contains("6"))) {
            try {
                ayVar.P4(new h2(eVar2));
            } catch (RemoteException e13) {
                l0.e.D("Failed to add app install ad listener", e13);
            }
        }
        List<String> list3 = q5Var.f16092h;
        if (list3 != null && (list3.contains("1") || q5Var.f16092h.contains("6"))) {
            try {
                ayVar.c3(new j2(eVar2));
            } catch (RemoteException e14) {
                l0.e.D("Failed to add content ad listener", e14);
            }
        }
        List<String> list4 = q5Var.f16092h;
        if (list4 != null && list4.contains("3")) {
            z10 = true;
        }
        if (z10) {
            for (String next : q5Var.f16094j.keySet()) {
                e eVar3 = q5Var.f16094j.get(next).booleanValue() ? eVar2 : null;
                e2 e2Var = new e2(eVar2, eVar3);
                try {
                    i2 i2Var = new i2(e2Var, (w90) null);
                    if (eVar3 == null) {
                        g2Var = null;
                    } else {
                        g2Var = new e8.g2(e2Var, (w90) null);
                    }
                    ayVar.R3(next, i2Var, g2Var);
                } catch (RemoteException e15) {
                    l0.e.D("Failed to add custom template ad listener", e15);
                }
            }
        }
        try {
            bVar = new y6.b(context, ayVar.K5());
        } catch (RemoteException e16) {
            l0.e.C("Failed to build AdLoader.", e16);
        }
        this.zzmh = bVar;
        y6.c zza = zza(context, kVar, bundle2, bundle);
        bVar.getClass();
        try {
            bVar.f28107b.J2(ji0.a(bVar.f28106a, zza.f28108a));
        } catch (RemoteException e17) {
            l0.e.C("Failed to load ad.", e17);
        }
    }

    public void showInterstitial() {
        this.zzmg.e();
    }

    public void showVideo() {
        this.zzmj.e();
    }

    public abstract Bundle zza(Bundle bundle, Bundle bundle2);
}
