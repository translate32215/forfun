package com.startapp.sdk.adsbase.cache;

import android.app.Activity;
import android.content.Context;
import com.startapp.b1;
import com.startapp.i4;
import com.startapp.j0;
import com.startapp.j4;
import com.startapp.q1;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.AdsConstants;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.StartAppSDKInternal;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.cache.h;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.wb;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Random;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

/* compiled from: Sta */
public class d {

    /* renamed from: h  reason: collision with root package name */
    public static d f12250h = new d();

    /* renamed from: a  reason: collision with root package name */
    public final Map<CacheKey, h> f12251a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    public Map<String, String> f12252b = new WeakHashMap();

    /* renamed from: c  reason: collision with root package name */
    public boolean f12253c = false;

    /* renamed from: d  reason: collision with root package name */
    public boolean f12254d = false;

    /* renamed from: e  reason: collision with root package name */
    public Queue<e> f12255e = new ConcurrentLinkedQueue();

    /* renamed from: f  reason: collision with root package name */
    public h.b f12256f;

    /* renamed from: g  reason: collision with root package name */
    public Context f12257g;

    /* compiled from: Sta */
    public class a implements AdEventListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ C0123d f12258a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ CacheKey f12259b;

        public a(d dVar, C0123d dVar2, CacheKey cacheKey) {
            this.f12258a = dVar2;
            this.f12259b = cacheKey;
        }

        public void onFailedToReceiveAd(Ad ad2) {
            C0123d dVar = this.f12258a;
            if (dVar != null) {
                dVar.a(ad2, this.f12259b, false);
            }
        }

        public void onReceiveAd(Ad ad2) {
            C0123d dVar = this.f12258a;
            if (dVar != null) {
                dVar.a(ad2, this.f12259b, true);
            }
        }
    }

    /* compiled from: Sta */
    public class b implements AdEventListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ C0123d f12260a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ CacheKey f12261b;

        public b(d dVar, C0123d dVar2, CacheKey cacheKey) {
            this.f12260a = dVar2;
            this.f12261b = cacheKey;
        }

        public void onFailedToReceiveAd(Ad ad2) {
            C0123d dVar = this.f12260a;
            if (dVar != null) {
                dVar.a(ad2, this.f12261b, false);
            }
        }

        public void onReceiveAd(Ad ad2) {
            C0123d dVar = this.f12260a;
            if (dVar != null) {
                dVar.a(ad2, this.f12261b, true);
            }
        }
    }

    /* compiled from: Sta */
    public static /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f12262a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f12263b;

        /* JADX WARNING: Can't wrap try/catch for region: R(19:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|19|20|21|22|24) */
        /* JADX WARNING: Can't wrap try/catch for region: R(21:0|1|2|3|5|6|7|9|10|11|12|13|14|15|16|17|19|20|21|22|24) */
        /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0033 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0054 */
        static {
            /*
                com.startapp.sdk.adsbase.StartAppAd$AdMode[] r0 = com.startapp.sdk.adsbase.StartAppAd.AdMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f12263b = r0
                r1 = 1
                com.startapp.sdk.adsbase.StartAppAd$AdMode r2 = com.startapp.sdk.adsbase.StartAppAd.AdMode.OFFERWALL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f12263b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.startapp.sdk.adsbase.StartAppAd$AdMode r3 = com.startapp.sdk.adsbase.StartAppAd.AdMode.OVERLAY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f12263b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.startapp.sdk.adsbase.StartAppAd$AdMode r4 = com.startapp.sdk.adsbase.StartAppAd.AdMode.FULLPAGE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r3 = f12263b     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.startapp.sdk.adsbase.StartAppAd$AdMode r4 = com.startapp.sdk.adsbase.StartAppAd.AdMode.VIDEO     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r5 = 4
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r3 = f12263b     // Catch:{ NoSuchFieldError -> 0x003e }
                com.startapp.sdk.adsbase.StartAppAd$AdMode r4 = com.startapp.sdk.adsbase.StartAppAd.AdMode.REWARDED_VIDEO     // Catch:{ NoSuchFieldError -> 0x003e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5 = 5
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r3 = f12263b     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.startapp.sdk.adsbase.StartAppAd$AdMode r4 = com.startapp.sdk.adsbase.StartAppAd.AdMode.AUTOMATIC     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r5 = 6
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                com.startapp.sdk.adsbase.model.AdPreferences$Placement[] r3 = com.startapp.sdk.adsbase.model.AdPreferences.Placement.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f12262a = r3
                r3[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r1 = f12262a     // Catch:{ NoSuchFieldError -> 0x0059 }
                r2 = 7
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0059 }
            L_0x0059:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.adsbase.cache.d.c.<clinit>():void");
        }
    }

    /* renamed from: com.startapp.sdk.adsbase.cache.d$d  reason: collision with other inner class name */
    /* compiled from: Sta */
    public interface C0123d {
        void a(Ad ad2, CacheKey cacheKey, boolean z10);
    }

    /* compiled from: Sta */
    public class e {

        /* renamed from: a  reason: collision with root package name */
        public StartAppAd f12264a;

        /* renamed from: b  reason: collision with root package name */
        public AdPreferences.Placement f12265b;

        /* renamed from: c  reason: collision with root package name */
        public AdPreferences f12266c;

        /* renamed from: d  reason: collision with root package name */
        public AdEventListener f12267d;

        public e(d dVar, StartAppAd startAppAd, AdPreferences.Placement placement, AdPreferences adPreferences, AdEventListener adEventListener) {
            this.f12264a = startAppAd;
            this.f12265b = placement;
            this.f12266c = adPreferences;
            this.f12267d = adEventListener;
        }
    }

    public void a(Context context, StartAppAd startAppAd, StartAppAd.AdMode adMode, AdPreferences adPreferences, C0123d dVar) {
        AdPreferences.Placement placement;
        if (adPreferences == null) {
            adPreferences = new AdPreferences();
        }
        AdPreferences adPreferences2 = adPreferences;
        switch (c.f12263b[adMode.ordinal()]) {
            case 1:
                Map<Activity, Integer> map = wb.f12765a;
                placement = AdPreferences.Placement.INAPP_OFFER_WALL;
                break;
            case 2:
            case 3:
            case 4:
            case 5:
                placement = AdPreferences.Placement.INAPP_OVERLAY;
                break;
            case 6:
                Map<Activity, Integer> map2 = wb.f12765a;
                if (new Random().nextInt(100) >= AdsCommonMetaData.f12098h.i()) {
                    placement = AdPreferences.Placement.INAPP_FULL_SCREEN;
                    break;
                } else {
                    if ((new Random().nextInt(100) >= AdsCommonMetaData.f12098h.j() && !adPreferences2.isForceFullpage()) || adPreferences2.isForceOverlay()) {
                        placement = AdPreferences.Placement.INAPP_OVERLAY;
                        break;
                    } else {
                        placement = AdPreferences.Placement.INAPP_FULL_SCREEN;
                        break;
                    }
                }
                break;
            default:
                placement = AdPreferences.Placement.INAPP_FULL_SCREEN;
                break;
        }
        AdPreferences.Placement placement2 = placement;
        if (adMode.equals(StartAppAd.AdMode.REWARDED_VIDEO)) {
            adPreferences2.setType(Ad.AdType.REWARDED_VIDEO);
        } else if (adMode.equals(StartAppAd.AdMode.VIDEO)) {
            adPreferences2.setType(Ad.AdType.VIDEO);
        }
        a(context, startAppAd, placement2, adPreferences2, dVar, false, 0);
    }

    public String b(CacheKey cacheKey) {
        return String.valueOf(cacheKey.hashCode()).replace('-', '_');
    }

    public com.startapp.sdk.adsbase.d c(CacheKey cacheKey) {
        h hVar;
        if (cacheKey == null || (hVar = this.f12251a.get(cacheKey)) == null || !hVar.c()) {
            return null;
        }
        com.startapp.sdk.adsbase.d dVar = hVar.f12277e;
        hVar.f12285m = 0;
        hVar.f12287o = null;
        if (!AdsConstants.f12104f.booleanValue() && hVar.f12286n) {
            hVar.a((StartAppAd) null, (AdEventListener) null, true, true);
        } else if (!hVar.f12286n) {
            h.b bVar = hVar.f12288p;
            if (bVar != null) {
                ((e) bVar).a(hVar);
            }
            q1 q1Var = hVar.f12282j;
            if (q1Var != null) {
                q1Var.e();
            }
        }
        return dVar;
    }

    public void b(AdPreferences.Placement placement) {
        synchronized (this.f12251a) {
            Iterator<Map.Entry<CacheKey, h>> it = this.f12251a.entrySet().iterator();
            while (it.hasNext()) {
                if (((CacheKey) it.next().getKey()).a() == placement) {
                    it.remove();
                }
            }
        }
    }

    public void a(Context context, StartAppAd startAppAd, AdPreferences.Placement placement, AdPreferences adPreferences, C0123d dVar, boolean z10, int i10) {
        h hVar;
        Context a10 = j0.a(context);
        if (a10 != null) {
            context = a10;
        }
        this.f12257g = context;
        if (adPreferences == null) {
            adPreferences = new AdPreferences();
        }
        AdPreferences adPreferences2 = adPreferences;
        CacheKey cacheKey = new CacheKey(placement, adPreferences2);
        if (!this.f12254d || z10) {
            AdPreferences adPreferences3 = new AdPreferences(adPreferences2);
            synchronized (this.f12251a) {
                hVar = this.f12251a.get(cacheKey);
                if (hVar == null) {
                    if (placement.ordinal() != 3) {
                        hVar = new h(this.f12257g, placement, adPreferences3);
                    } else {
                        hVar = new h(this.f12257g, placement, adPreferences3);
                        hVar.f12286n = false;
                    }
                    if (this.f12256f == null) {
                        this.f12256f = new e(this);
                    }
                    hVar.f12288p = this.f12256f;
                    if (z10) {
                        hVar.f12280h = b(cacheKey);
                        hVar.f12281i = true;
                        hVar.f12285m = i10;
                    }
                    a(cacheKey, hVar);
                } else {
                    hVar.f12276d = adPreferences3;
                }
            }
            hVar.a(startAppAd, new b(this, dVar, cacheKey), false, true);
            return;
        }
        this.f12255e.add(new e(this, startAppAd, placement, adPreferences2, new a(this, dVar, cacheKey)));
    }

    public com.startapp.sdk.adsbase.d a(CacheKey cacheKey) {
        h hVar = cacheKey != null ? this.f12251a.get(cacheKey) : null;
        if (hVar != null) {
            return hVar.f12277e;
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0050 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(boolean r7) {
        /*
            r6 = this;
            java.util.Map<com.startapp.sdk.adsbase.cache.CacheKey, com.startapp.sdk.adsbase.cache.h> r0 = r6.f12251a
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L_0x000a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0053
            java.lang.Object r1 = r0.next()
            com.startapp.sdk.adsbase.cache.h r1 = (com.startapp.sdk.adsbase.cache.h) r1
            com.startapp.sdk.adsbase.d r2 = r1.f12277e
            r3 = 0
            r4 = 0
            if (r2 == 0) goto L_0x003c
            java.util.Map<android.app.Activity, java.lang.Integer> r5 = com.startapp.wb.f12765a
            boolean r2 = r2 instanceof com.startapp.sdk.ads.interstitials.ReturnAd
            if (r2 == 0) goto L_0x003c
            if (r7 != 0) goto L_0x003c
            com.startapp.sdk.adsbase.cache.CacheMetaData r2 = com.startapp.sdk.adsbase.cache.CacheMetaData.f12244a
            com.startapp.sdk.adsbase.cache.ACMConfig r2 = r2.a()
            boolean r2 = r2.g()
            if (r2 != 0) goto L_0x0047
            com.startapp.q1 r2 = r1.f12282j
            android.os.Handler r5 = r2.f11559b
            if (r5 == 0) goto L_0x0039
            r5.removeCallbacksAndMessages(r3)
        L_0x0039:
            r2.f11561d = r4
            goto L_0x0047
        L_0x003c:
            com.startapp.q1 r2 = r1.f12282j
            android.os.Handler r5 = r2.f11559b
            if (r5 == 0) goto L_0x0045
            r5.removeCallbacksAndMessages(r3)
        L_0x0045:
            r2.f11561d = r4
        L_0x0047:
            com.startapp.o1 r1 = r1.f12283k
            android.os.Handler r2 = r1.f11559b
            if (r2 == 0) goto L_0x0050
            r2.removeCallbacksAndMessages(r3)
        L_0x0050:
            r1.f11561d = r4
            goto L_0x000a
        L_0x0053:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.adsbase.cache.d.a(boolean):void");
    }

    public void a(Context context, StartAppAd startAppAd, AdPreferences.Placement placement, AdPreferences adPreferences, C0123d dVar) {
        a(context, (StartAppAd) null, placement, adPreferences, dVar, false, 0);
    }

    public final void a(CacheKey cacheKey, h hVar) {
        synchronized (this.f12251a) {
            int d10 = CacheMetaData.f12244a.a().d();
            if (d10 != 0 && this.f12251a.size() >= d10) {
                long j10 = Long.MAX_VALUE;
                CacheKey cacheKey2 = null;
                for (CacheKey next : this.f12251a.keySet()) {
                    h hVar2 = this.f12251a.get(next);
                    if (hVar2.f12273a == hVar.f12273a) {
                        long j11 = hVar2.f12279g;
                        if (j11 < j10) {
                            cacheKey2 = next;
                            j10 = j11;
                        }
                    }
                }
                if (cacheKey2 != null) {
                    this.f12251a.remove(cacheKey2);
                }
            }
            this.f12251a.put(cacheKey, hVar);
            if (Math.random() * 100.0d < ((double) CacheMetaData.f12244a.c())) {
                i4 i4Var = new i4(j4.f10587d);
                i4Var.f10537d = "Cache Size";
                i4Var.f10538e = String.valueOf(this.f12251a.size());
                i4Var.a();
            }
        }
    }

    public boolean a(AdPreferences.Placement placement) {
        int ordinal = placement.ordinal();
        if (ordinal == 3) {
            Object obj = StartAppSDKInternal.D;
            if (!(!StartAppSDKInternal.d.f12173a.f12155w) || AdsCommonMetaData.f12098h.L()) {
                return false;
            }
            return true;
        } else if (ordinal != 7) {
            return true;
        } else {
            Object obj2 = StartAppSDKInternal.D;
            if (!StartAppSDKInternal.d.f12173a.f12153u || AdsCommonMetaData.f12098h.K()) {
                return false;
            }
            return true;
        }
    }

    public static String a(StartAppAd.AdMode adMode) {
        StringBuilder a10 = b1.a("autoLoadNotShownAdPrefix");
        a10.append(adMode.name());
        return a10.toString();
    }
}
