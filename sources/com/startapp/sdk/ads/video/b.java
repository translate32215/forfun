package com.startapp.sdk.ads.video;

import android.content.Context;
import android.text.TextUtils;
import com.startapp.ac;
import com.startapp.i4;
import com.startapp.j4;
import com.startapp.k5;
import com.startapp.o7;
import com.startapp.sdk.ads.video.VideoUtil;
import com.startapp.sdk.ads.video.d;
import com.startapp.sdk.ads.video.j;
import com.startapp.sdk.ads.video.vast.VASTErrorCodes;
import com.startapp.sdk.ads.video.vast.c;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.HtmlAd;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.VideoConfig;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.cache.CacheKey;
import com.startapp.sdk.adsbase.cache.d;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.model.GetAdRequest;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.components.ComponentLocator;
import com.startapp.t0;
import com.startapp.wb;
import com.startapp.yb;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: Sta */
public class b extends t0 {

    /* renamed from: m  reason: collision with root package name */
    public final long f11979m = System.currentTimeMillis();

    /* renamed from: n  reason: collision with root package name */
    public volatile CacheKey f11980n;

    /* renamed from: o  reason: collision with root package name */
    public int f11981o = 0;

    /* compiled from: Sta */
    public class a implements c.a {
        public a() {
        }
    }

    /* renamed from: com.startapp.sdk.ads.video.b$b  reason: collision with other inner class name */
    /* compiled from: Sta */
    public class C0122b implements j.b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f11983a;

        public C0122b(boolean z10) {
            this.f11983a = z10;
        }

        public void a(String str) {
            if (str != null) {
                if (!str.equals("downloadInterrupted")) {
                    b.this.f12232b.setState(this.f11983a ? Ad.AdState.READY : Ad.AdState.UN_INITIALIZED);
                    b.this.g().a(str);
                }
                b.this.c(this.f11983a);
                return;
            }
            b.this.c(false);
            b bVar = b.this;
            com.startapp.j.a(bVar.f12231a, bVar.a(), b.this.f12232b, false);
            b.a(b.this, VASTErrorCodes.FileNotFound, (List) null);
        }
    }

    /* compiled from: Sta */
    public class c implements d.a {
        public c() {
        }

        public void a(String str) {
            b.this.g().a(str);
        }
    }

    /* compiled from: Sta */
    public class d implements d.C0123d {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f11986a;

        public d(boolean z10) {
            this.f11986a = z10;
        }

        public void a(Ad ad2, CacheKey cacheKey, boolean z10) {
            if (this.f11986a && z10) {
                b.this.f11980n = cacheKey;
            }
        }
    }

    public b(Context context, Ad ad2, AdPreferences adPreferences, AdEventListener adEventListener, AdPreferences.Placement placement) {
        super(context, ad2, adPreferences, adEventListener, placement, true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0046 A[Catch:{ all -> 0x001e, all -> 0x0077 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(com.startapp.sdk.ads.video.b r5, com.startapp.sdk.ads.video.vast.VASTErrorCodes r6, java.util.List<java.lang.String> r7) {
        /*
            r5.getClass()
            if (r7 == 0) goto L_0x0023
            int r0 = r7.size()     // Catch:{ all -> 0x0077 }
            if (r0 <= 0) goto L_0x0023
            com.startapp.sdk.ads.video.vast.VASTErrorCodes r0 = com.startapp.sdk.ads.video.vast.VASTErrorCodes.SAProcessSuccess     // Catch:{ all -> 0x001e }
            if (r6 != r0) goto L_0x0013
            java.util.List r7 = com.startapp.wb.a((java.util.List<java.lang.String>) r7)     // Catch:{ all -> 0x001e }
        L_0x0013:
            int r0 = r7.size()     // Catch:{ all -> 0x001e }
            if (r0 <= 0) goto L_0x0040
            com.startapp.sdk.ads.video.tracking.ActionTrackingLink[] r7 = com.startapp.sdk.ads.video.tracking.VideoTrackingDetails.b(r7)     // Catch:{ all -> 0x001e }
            goto L_0x0041
        L_0x001e:
            r7 = move-exception
            com.startapp.i4.a((java.lang.Throwable) r7)     // Catch:{ all -> 0x0077 }
            goto L_0x0040
        L_0x0023:
            com.startapp.sdk.ads.video.VideoAdDetails r7 = r5.g()     // Catch:{ all -> 0x0077 }
            if (r7 == 0) goto L_0x0040
            com.startapp.sdk.ads.video.VideoAdDetails r7 = r5.g()     // Catch:{ all -> 0x0077 }
            com.startapp.sdk.ads.video.tracking.VideoTrackingDetails r7 = r7.h()     // Catch:{ all -> 0x0077 }
            if (r7 == 0) goto L_0x0040
            com.startapp.sdk.ads.video.VideoAdDetails r7 = r5.g()     // Catch:{ all -> 0x0077 }
            com.startapp.sdk.ads.video.tracking.VideoTrackingDetails r7 = r7.h()     // Catch:{ all -> 0x0077 }
            com.startapp.sdk.ads.video.tracking.ActionTrackingLink[] r7 = r7.e()     // Catch:{ all -> 0x0077 }
            goto L_0x0041
        L_0x0040:
            r7 = 0
        L_0x0041:
            if (r7 == 0) goto L_0x007b
            int r0 = r7.length     // Catch:{ all -> 0x0077 }
            if (r0 <= 0) goto L_0x007b
            com.startapp.sdk.ads.video.VideoAdDetails r0 = r5.g()     // Catch:{ all -> 0x0077 }
            java.lang.String r1 = ""
            if (r0 == 0) goto L_0x0059
            java.lang.String r2 = r0.i()     // Catch:{ all -> 0x0077 }
            if (r2 == 0) goto L_0x0059
            java.lang.String r0 = r0.i()     // Catch:{ all -> 0x0077 }
            goto L_0x005a
        L_0x0059:
            r0 = r1
        L_0x005a:
            com.startapp.sdk.ads.video.tracking.VideoTrackingParams r2 = new com.startapp.sdk.ads.video.tracking.VideoTrackingParams     // Catch:{ all -> 0x0077 }
            java.lang.String r3 = "1"
            r4 = 0
            r2.<init>(r1, r4, r4, r3)     // Catch:{ all -> 0x0077 }
            com.startapp.rc r1 = new com.startapp.rc     // Catch:{ all -> 0x0077 }
            r1.<init>(r7, r2, r0, r4)     // Catch:{ all -> 0x0077 }
            java.lang.String r7 = "error"
            r1.f11671e = r7     // Catch:{ all -> 0x0077 }
            r1.f11672f = r6     // Catch:{ all -> 0x0077 }
            com.startapp.qc r6 = r1.a()     // Catch:{ all -> 0x0077 }
            android.content.Context r5 = r5.f12231a     // Catch:{ all -> 0x0077 }
            com.startapp.sdk.ads.video.VideoUtil.a((android.content.Context) r5, (com.startapp.qc) r6)     // Catch:{ all -> 0x0077 }
            goto L_0x007b
        L_0x0077:
            r5 = move-exception
            com.startapp.i4.a((java.lang.Throwable) r5)
        L_0x007b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.ads.video.b.a(com.startapp.sdk.ads.video.b, com.startapp.sdk.ads.video.vast.VASTErrorCodes, java.util.List):void");
    }

    public boolean b(GetAdRequest getAdRequest) {
        VideoUtil.VideoEligibility a10;
        if (!(getAdRequest != null)) {
            return false;
        }
        if (!getAdRequest.b() || (a10 = VideoUtil.a(this.f12231a)) == VideoUtil.VideoEligibility.ELIGIBLE) {
            return true;
        }
        this.f12236f = a10.a();
        return false;
    }

    public GetAdRequest d() {
        GetAdRequest a10 = a((GetAdRequest) new a());
        if (a10 != null) {
            a10.f(this.f12231a);
        }
        return a10;
    }

    public VideoAdDetails g() {
        return ((VideoEnabledAd) this.f12232b).w();
    }

    public final void d(boolean z10) {
        AdPreferences adPreferences;
        Ad.AdType type = this.f12232b.getType();
        Ad.AdType adType = Ad.AdType.REWARDED_VIDEO;
        if ((type != adType && this.f12232b.getType() != Ad.AdType.VIDEO) || z10) {
            AdPreferences adPreferences2 = this.f12233c;
            if (adPreferences2 == null) {
                adPreferences = new AdPreferences();
            } else {
                adPreferences = new AdPreferences(adPreferences2);
            }
            adPreferences.setType((this.f12232b.getType() == adType || this.f12232b.getType() == Ad.AdType.VIDEO) ? Ad.AdType.VIDEO_NO_VAST : Ad.AdType.NON_VIDEO);
            com.startapp.sdk.adsbase.cache.d.f12250h.a(this.f12231a, (StartAppAd) null, this.f12235e, adPreferences, (d.C0123d) new d(z10));
        }
    }

    public void b(boolean z10) {
        if (!(g() != null)) {
            this.f12232b.setState(z10 ? Ad.AdState.READY : Ad.AdState.UN_INITIALIZED);
        }
    }

    public boolean a(Object obj) {
        VASTErrorCodes vASTErrorCodes;
        o7.a aVar = (o7.a) obj;
        String str = null;
        String str2 = aVar != null ? aVar.f11523b : null;
        boolean z10 = false;
        boolean z11 = true;
        if (str2 == null || !str2.toLowerCase().contains("json")) {
            if (aVar != null) {
                str = aVar.f11522a;
            }
            if (AdsCommonMetaData.f12098h.G().q()) {
                if (wb.a(str, "@videoJson@", "@videoJson@") == null) {
                    z11 = false;
                }
                if (z11) {
                    d(false);
                }
            }
            return super.a(obj);
        }
        VideoConfig G = AdsCommonMetaData.f12098h.G();
        if (G.q()) {
            Set<String> set = this.f12596i.E0;
            if (!(set != null && set.size() > 0)) {
                d(true);
            }
        }
        try {
            ac acVar = (ac) k5.a(aVar.f11522a, ac.class);
            if (acVar == null || acVar.getVastTag() == null) {
                return a("no VAST wrapper in json", (Throwable) null, true);
            }
            String O = MetaData.f12393k.O();
            com.startapp.sdk.ads.video.vast.b bVar = (!acVar.isRecordHops() || TextUtils.isEmpty(O)) ? null : new com.startapp.sdk.ads.video.vast.b(this.f12231a, O, acVar.getPartnerResponse(), acVar.getPartnerName(), acVar.isSkipFailed());
            com.startapp.sdk.ads.video.vast.c cVar = new com.startapp.sdk.ads.video.vast.c(this.f12231a.getResources().getDisplayMetrics(), ComponentLocator.a(this.f12231a).v().f12678a);
            cVar.f12081f = G.e();
            cVar.f12078c = new a();
            String vastTag = acVar.getVastTag();
            cVar.f12082g.clear();
            yb a10 = cVar.a(vastTag, new ArrayList(), bVar);
            if (a10 != null) {
                int i10 = (int) (((float) cVar.f12076a) / cVar.f12077b);
                com.startapp.sdk.ads.video.vast.a aVar2 = null;
                for (com.startapp.sdk.ads.video.vast.a next : cVar.f12082g) {
                    if (aVar2 == null || next.a(cVar.f12076a, i10) > aVar2.a(cVar.f12076a, i10)) {
                        aVar2 = next;
                    }
                }
                a10.f12897o = aVar2;
                ArrayList arrayList = new ArrayList(a10.f12883a);
                VASTErrorCodes vASTErrorCodes2 = VASTErrorCodes.SAProcessSuccess;
                cVar.a((List<String>) arrayList, vASTErrorCodes2);
                if (bVar != null) {
                    bVar.a(vASTErrorCodes2);
                }
            } else if (!(bVar == null || (vASTErrorCodes = cVar.f12079d) == null)) {
                bVar.a(vASTErrorCodes);
            }
            if (a10 != null) {
                Ad ad2 = this.f12232b;
                VideoEnabledAd videoEnabledAd = (VideoEnabledAd) ad2;
                if (ad2.getType() != Ad.AdType.REWARDED_VIDEO) {
                    z10 = true;
                }
                videoEnabledAd.a(a10, G, z10);
                if (acVar.getTtlSec() != null) {
                    ((VideoEnabledAd) this.f12232b).b(acVar.getTtlSec());
                }
                aVar.f11522a = acVar.getAdmTag();
                aVar.f11523b = "text/html";
                return super.a(aVar);
            }
            if (acVar.getCampaignId() != null) {
                this.f12595h.add(acVar.getCampaignId());
            }
            this.f11981o++;
            ((VideoEnabledAd) this.f12232b).v();
            if (System.currentTimeMillis() - this.f11979m >= ((long) G.n())) {
                return a("VAST retry timeout", (Throwable) null, false);
            }
            if (this.f11981o > G.d()) {
                return a("VAST too many excludes", (Throwable) null, false);
            }
            return b();
        } catch (Exception e10) {
            return a("VAST json parsing", (Throwable) e10, true);
        }
    }

    public void a(boolean z10) {
        super.a(z10);
        if (z10) {
            if (g() != null) {
                if (AdsCommonMetaData.f12098h.G().p()) {
                    this.f12232b.setState(z10 ? Ad.AdState.READY : Ad.AdState.UN_INITIALIZED);
                }
                g().a(this.f12233c.isVideoMuted());
                C0122b bVar = new C0122b(z10);
                c cVar = new c();
                h b10 = ComponentLocator.a(this.f12231a).J.b();
                b10.f12005c.execute(new e(b10, g().i(), bVar, cVar));
                return;
            }
        }
        c(z10);
    }

    public final boolean a(String str, Throwable th, boolean z10) {
        if (th != null) {
            i4.a(th);
        } else if (z10) {
            i4 i4Var = new i4(j4.f10588e);
            i4Var.f10537d = str;
            i4Var.a();
        }
        com.startapp.sdk.adsbase.d c10 = com.startapp.sdk.adsbase.cache.d.f12250h.c(this.f11980n);
        if (c10 instanceof HtmlAd) {
            o7.a aVar = new o7.a();
            aVar.f11523b = "text/html";
            aVar.f11522a = ((HtmlAd) c10).j();
            return super.a(aVar);
        }
        this.f12232b.setErrorMessage(this.f12236f);
        return false;
    }
}
